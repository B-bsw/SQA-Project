package org.apache.commons.lang.time;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

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
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addDays(date4, (int) '#');
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMonths(date6, 1);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addDays(date13, (int) '#');
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMonths(date15, 1);
        java.lang.String[] strArray21 = new java.lang.String[] { "", "" };
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray21);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addSeconds(date22, 5);
        boolean boolean25 = org.apache.commons.lang.time.DateUtils.isSameInstant(date15, date24);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "" };
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray29);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addSeconds(date30, 5);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date30, 1);
        boolean boolean35 = org.apache.commons.lang.time.DateUtils.isSameInstant(date15, date30);
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.add(date30, 3, 1000);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.round(date38, (int) (byte) 10);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addDays(date38, 10);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.addWeeks(date38, (int) (byte) 10);
        boolean boolean45 = org.apache.commons.lang.time.DateUtils.isSameDay(date6, date38);
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.addMonths(date6, 1);
        java.lang.String[] strArray51 = new java.lang.String[] { "", "" };
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray51);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.addSeconds(date52, 5);
        boolean boolean55 = org.apache.commons.lang.time.DateUtils.isSameDay(date6, date54);
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date54, (int) ' ');
        java.util.Date date59 = org.apache.commons.lang.time.DateUtils.addYears(date54, 100);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Sun Mar 12 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu May 11 00:00:00 ICT 1989");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Wed Jan 01 00:00:05 ICT 2070");
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addWeeks(date4, 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addSeconds(date6, 1000);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.round(date6, 5);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addYears(date10, 6);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addSeconds(date10, 1000);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addMonths(date10, (int) (short) 100);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addWeeks(date21, 10);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addSeconds(date23, 1000);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.round(date23, 5);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.add(date27, (int) (byte) 10, 60000);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addSeconds(date27, (int) (short) 10);
        boolean boolean33 = org.apache.commons.lang.time.DateUtils.isSameDay(date10, date32);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Mar 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 12 00:16:40 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Mar 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Fri Mar 12 00:00:00 ICT 1976");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Mar 12 00:16:40 ICT 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Wed Jul 12 00:00:00 ICT 1978");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Mar 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Mar 12 00:16:40 ICT 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Mar 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Fri Jan 14 00:00:00 ICT 1977");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Mar 12 00:00:10 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (short) 10, 5);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date12, (int) (byte) 0);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.add(date19, (int) (short) 10, 5);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date22, (int) (byte) 0);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.add(date22, (int) (short) -1, (int) (byte) 0);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addMinutes(date27, (int) (short) 1);
        boolean boolean30 = org.apache.commons.lang.time.DateUtils.isSameInstant(date12, date29);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "" };
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray34);
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.add(date35, (int) (short) 10, 5);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date38, (int) (byte) 0);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.add(date38, (int) (short) -1, (int) (byte) 0);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.addMinutes(date43, (int) (short) 1);
        boolean boolean46 = org.apache.commons.lang.time.DateUtils.isSameDay(date29, date43);
        boolean boolean47 = org.apache.commons.lang.time.DateUtils.isSameDay(date4, date29);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.addYears(date4, 10);
        java.lang.String[] strArray53 = new java.lang.String[] { "", "" };
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray53);
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.add(date54, (int) (short) 10, 5);
        java.util.Date date59 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date57, (int) (byte) 0);
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.add(date57, (int) (short) -1, (int) (byte) 0);
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.addWeeks(date57, 60000);
        java.lang.String[] strArray68 = new java.lang.String[] { "", "" };
        java.util.Date date69 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray68);
        java.util.Date date72 = org.apache.commons.lang.time.DateUtils.add(date69, (int) (short) 10, 5);
        java.util.Date date74 = org.apache.commons.lang.time.DateUtils.addMonths(date72, (int) (short) 1);
        java.util.Date date76 = org.apache.commons.lang.time.DateUtils.addHours(date72, (int) '#');
        java.util.Date date78 = org.apache.commons.lang.time.DateUtils.addDays(date76, (int) (byte) 0);
        boolean boolean79 = org.apache.commons.lang.time.DateUtils.isSameDay(date57, date78);
        java.util.Date date81 = org.apache.commons.lang.time.DateUtils.addHours(date57, 1);
        boolean boolean82 = org.apache.commons.lang.time.DateUtils.isSameDay(date4, date57);
        java.lang.String[] strArray86 = new java.lang.String[] { "", "" };
        java.util.Date date87 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray86);
        java.util.Date date89 = org.apache.commons.lang.time.DateUtils.addWeeks(date87, 10);
        java.util.Date date91 = org.apache.commons.lang.time.DateUtils.addSeconds(date89, 1000);
        boolean boolean92 = org.apache.commons.lang.time.DateUtils.isSameInstant(date57, date89);
        java.util.Date date94 = org.apache.commons.lang.time.DateUtils.addMinutes(date89, 3);
        java.util.Date date96 = org.apache.commons.lang.time.DateUtils.addHours(date94, 6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 05:01:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Jan 01 05:01:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Tue Jan 01 00:00:00 ICT 1980");
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Thu Dec 04 05:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date69);
        org.junit.Assert.assertEquals(date69.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date72);
        org.junit.Assert.assertEquals(date72.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date74);
        org.junit.Assert.assertEquals(date74.toString(), "Sun Feb 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date76);
        org.junit.Assert.assertEquals(date76.toString(), "Fri Jan 02 16:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date78);
        org.junit.Assert.assertEquals(date78.toString(), "Fri Jan 02 16:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(date81);
        org.junit.Assert.assertEquals(date81.toString(), "Thu Jan 01 06:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertArrayEquals(strArray86, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date87);
        org.junit.Assert.assertEquals(date87.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date89);
        org.junit.Assert.assertEquals(date89.toString(), "Thu Mar 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date91);
        org.junit.Assert.assertEquals(date91.toString(), "Thu Mar 12 00:16:40 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(date94);
        org.junit.Assert.assertEquals(date94.toString(), "Thu Mar 12 00:03:00 ICT 1970");
        org.junit.Assert.assertNotNull(date96);
        org.junit.Assert.assertEquals(date96.toString(), "Thu Mar 12 06:03:00 ICT 1970");
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (short) 10, 5);
        boolean boolean13 = org.apache.commons.lang.time.DateUtils.isSameDay(date4, date12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMinutes(date4, (int) (byte) 100);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date15, 4);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addSeconds(date15, (int) 'a');
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date19, (int) (short) 100);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date19, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date26 = org.apache.commons.lang.time.DateUtils.add(date23, (int) (short) -1, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Mon Jan 05 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 01:41:37 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 01:41:37 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addDays(date4, (int) '#');
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMonths(date6, 1);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date6, 1001);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "" };
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray16);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray16);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray16);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addWeeks(date19, (int) (short) 100);
        boolean boolean22 = org.apache.commons.lang.time.DateUtils.isSameDay(date10, date21);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addSeconds(date10, 86400000);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addMonths(date10, (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Feb 05 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Dec 02 00:00:00 ICT 1971");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Wed Nov 01 00:00:01 ICT 1972");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Feb 05 00:00:01 ICT 1970");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 10, 5);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date7, (int) (byte) 0);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (short) -1, (int) (byte) 0);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addWeeks(date7, 60000);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date14, (int) (short) 1);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.add(date16, 4, (int) (byte) 0);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date16, 3);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addDays(date21, (int) (byte) 1);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addHours(date21, 2);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date25, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date29 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date25, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 100 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Dec 04 05:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Wed Jan 01 00:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Wed Jan 01 00:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Wed Jan 01 00:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 02 00:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Wed Jan 01 02:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Wed Jan 01 02:00:00 ICT 3119");
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addDays(date4, (int) '#');
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMonths(date6, 1);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date13, 5);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date15);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addSeconds(date21, 5);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date21, 1);
        boolean boolean26 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date21);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.add(date21, 3, 1000);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.round(date29, (int) (byte) 10);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addDays(date29, 10);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addWeeks(date29, (int) (byte) 10);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addDays(date35, (int) '4');
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addHours(date37, 60000);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addDays(date37, 4);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.addWeeks(date37, 3);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.round(date43, 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Sun Mar 12 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu May 11 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Sun Jul 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Mon May 06 00:00:00 ICT 1996");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jul 06 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Sun Jul 23 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Sat Jan 01 00:00:00 ICT 543");
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 10, 5);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date7, (int) (byte) 0);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "" };
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray13);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.add(date14, (int) (short) 10, 5);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date17, (int) (byte) 0);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.add(date17, (int) (short) -1, (int) (byte) 0);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addMinutes(date22, (int) (short) 1);
        boolean boolean25 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date24);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "" };
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray29);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.add(date30, (int) (short) 10, 5);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date33, (int) (byte) 0);
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.add(date33, (int) (short) -1, (int) (byte) 0);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addMinutes(date38, (int) (short) 1);
        boolean boolean41 = org.apache.commons.lang.time.DateUtils.isSameDay(date24, date38);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.addWeeks(date38, 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 05:01:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 05:01:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 05:00:00 ICT 1970");
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addDays(date4, (int) '#');
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMonths(date6, 1);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date13, 5);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addMinutes(date6, (int) '4');
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addDays(date18, 6);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.addDays(date20, 86400000);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addYears(date22, (int) '#');
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addMonths(date24, (int) (byte) 1);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addWeeks(date24, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date30 = org.apache.commons.lang.time.DateUtils.truncate(date24, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 4 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Feb 05 00:52:00 ICT 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Wed Feb 11 00:52:00 ICT 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Apr 12 00:52:00 ICT 238525");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Sat Apr 12 00:52:00 ICT 238560");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Mon May 12 00:52:00 ICT 238560");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Sat Apr 05 00:52:00 ICT 238560");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addWeeks(date4, 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addYears(date4, (int) '#');
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.round(date4, 0);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addMonths(date4, 0);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addHours(date4, 1001);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addMonths(date4, 3600000);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addYears(date16, (int) 'a');
        java.util.Date date19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = org.apache.commons.lang.time.DateUtils.isSameDay(date16, date19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Mar 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sat Jan 01 00:00:00 ICT 2005");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Wed Feb 11 17:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 ICT 301970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Sat Jan 01 00:00:00 ICT 302067");
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addDays(date4, (int) '#');
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMonths(date6, 1);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date13, 5);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date15);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.add(date15, 2, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date21 = org.apache.commons.lang.time.DateUtils.round(date15, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 6 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Wed May 01 00:00:05 ICT 1974");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (short) 10, 5);
        boolean boolean13 = org.apache.commons.lang.time.DateUtils.isSameDay(date4, date12);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 0, 10);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addMonths(date16, (int) '4');
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addYears(date18, (int) (short) 0);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.addDays(date18, (int) '4');
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.round(date18, 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Wed May 01 00:00:00 ICT 1974");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Wed May 01 00:00:00 ICT 1974");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Sat Jun 22 00:00:00 ICT 1974");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Sat Jan 01 00:00:00 ICT 543");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addSeconds(date4, 5);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date4, 1);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date4, 86400000);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addSeconds(date15, 5);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date15, 1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date15, 86400000);
        boolean boolean22 = org.apache.commons.lang.time.DateUtils.isSameInstant(date10, date15);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addDays(date15, (-1));
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addDays(date15, (int) (short) 100);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addYears(date26, 0);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addWeeks(date26, 3600000);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date32 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) 3600000, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round 3600000");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Fri Jan 02 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Fri Jan 02 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Wed Dec 31 00:00:00 ICT 1969");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Sat Apr 11 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Sat Apr 11 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Sat Jul 13 00:00:00 ICT 70965");
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addWeeks(date4, 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addSeconds(date6, 1000);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addHours(date8, 3600000);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addMinutes(date8, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date14 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date12, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field -1 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Mar 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 12 00:16:40 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Mon Nov 17 00:16:40 ICT 2380");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Mar 12 00:15:40 ICT 1970");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 10, 5);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date7, (int) (byte) 0);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (short) -1, (int) (byte) 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (byte) 0, (int) (byte) 0);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date7, (int) '4');
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date7, 60000);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date23 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date7, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 100 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Fri Jan 01 05:00:00 ICT 1971");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 05:01:00 ICT 1970");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (short) 10, 5);
        boolean boolean13 = org.apache.commons.lang.time.DateUtils.isSameDay(date4, date12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMinutes(date4, (int) (byte) 100);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date15, 4);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addWeeks(date17, 1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMinutes(date19, (int) (short) -1);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "" };
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray25);
        java.lang.String[] strArray30 = new java.lang.String[] { "", "" };
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray30);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.add(date31, (int) (short) 10, 5);
        boolean boolean35 = org.apache.commons.lang.time.DateUtils.isSameDay(date26, date34);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addMinutes(date26, (int) (byte) 100);
        boolean boolean38 = org.apache.commons.lang.time.DateUtils.isSameDay(date21, date26);
        java.lang.String[] strArray42 = new java.lang.String[] { "", "" };
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray42);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.addDays(date43, (int) '#');
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.addSeconds(date43, 0);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.addYears(date43, 1001);
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.add(date49, 1001, 0);
        boolean boolean53 = org.apache.commons.lang.time.DateUtils.isSameDay(date26, date52);
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.addYears(date52, 100);
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.addWeeks(date55, 3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Mon Jan 05 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon Jan 12 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Mon Jan 12 01:39:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 01:40:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Tue Jan 01 00:00:00 ICT 2971");
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Tue Jan 01 00:00:00 ICT 2971");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Sun Jan 01 00:00:00 ICT 3071");
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Sun Jan 22 00:00:00 ICT 3071");
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addWeeks(date4, 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addSeconds(date6, 1000);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.round(date6, 5);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addYears(date10, 6);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addMonths(date10, 1);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.add(date14, 3, (int) ' ');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Mar 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 12 00:16:40 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Mar 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Fri Mar 12 00:00:00 ICT 1976");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sun Apr 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sun Nov 22 00:00:00 ICT 1970");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addDays(date4, (int) '#');
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMonths(date6, 1);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date13, 5);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date15);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addSeconds(date21, 5);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date21, 1);
        boolean boolean26 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date21);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.add(date21, 3, 1000);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date21, (int) (short) 0);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addMonths(date21, 3600000);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addYears(date21, (int) (byte) 0);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addHours(date35, 0);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addHours(date37, (int) (byte) 100);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:00:00 ICT 301970");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Mon Jan 05 04:00:00 ICT 1970");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addDays(date4, (int) '#');
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMonths(date6, 1);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date13, 5);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addYears(date6, 86400000);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addMonths(date6, 10);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.addMonths(date6, (int) (byte) 1);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addSeconds(date6, 60000);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "" };
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray28);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addSeconds(date29, 5);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date29, 1);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date29, 86400000);
        java.lang.String[] strArray39 = new java.lang.String[] { "", "" };
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray39);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addSeconds(date40, 5);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date40, 1);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date40, 86400000);
        boolean boolean47 = org.apache.commons.lang.time.DateUtils.isSameInstant(date35, date40);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.addSeconds(date35, 2);
        java.util.Date date51 = org.apache.commons.lang.time.DateUtils.addYears(date35, (int) (short) 100);
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.addWeeks(date51, 1000);
        boolean boolean54 = org.apache.commons.lang.time.DateUtils.isSameDay(date24, date53);
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.addMinutes(date53, (int) (short) -1);
        java.util.Date date58 = org.apache.commons.lang.time.DateUtils.addHours(date56, 2);
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date58, (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Feb 05 00:00:00 ICT 86401970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Sat Dec 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Feb 05 16:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Fri Jan 02 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Fri Jan 02 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Fri Jan 02 00:00:02 ICT 1970");
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Thu Jan 02 00:00:00 ICT 2070");
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Mar 03 00:00:00 ICT 2089");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Wed Mar 02 23:59:00 ICT 2089");
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Thu Mar 03 01:59:00 ICT 2089");
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Sat Jan 01 00:00:00 ICT 543");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addDays(date4, (int) '#');
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMonths(date6, 1);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date13, 5);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addDays(date6, 5);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "" };
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray22);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addSeconds(date23, 5);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date23, 1);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date23, 86400000);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addDays(date23, 3600000);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addDays(date23, 0);
        boolean boolean34 = org.apache.commons.lang.time.DateUtils.isSameDay(date6, date33);
        java.lang.String[] strArray38 = new java.lang.String[] { "", "" };
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray38);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addWeeks(date39, 10);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.addSeconds(date41, 1000);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.round(date41, 5);
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.addYears(date41, 3600000);
        java.lang.String[] strArray51 = new java.lang.String[] { "", "" };
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray51);
        java.lang.String[] strArray56 = new java.lang.String[] { "", "" };
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray56);
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.add(date57, (int) (short) 10, 5);
        boolean boolean61 = org.apache.commons.lang.time.DateUtils.isSameDay(date52, date60);
        java.util.Date date63 = org.apache.commons.lang.time.DateUtils.addSeconds(date52, (int) (byte) -1);
        java.util.Date date65 = org.apache.commons.lang.time.DateUtils.addWeeks(date52, 86400000);
        boolean boolean66 = org.apache.commons.lang.time.DateUtils.isSameDay(date41, date52);
        java.util.Date date68 = org.apache.commons.lang.time.DateUtils.addHours(date52, (int) (short) 1);
        boolean boolean69 = org.apache.commons.lang.time.DateUtils.isSameDay(date6, date52);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Tue Feb 10 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Fri Jan 02 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Tue Jun 20 00:00:00 ICT 11826");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Mar 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Mar 12 00:16:40 ICT 1970");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Mar 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Mar 12 00:00:00 ICT 3601970");
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Wed Dec 31 23:59:59 ICT 1969");
        org.junit.Assert.assertNotNull(date65);
        org.junit.Assert.assertEquals(date65.toString(), "Thu Feb 28 00:00:00 ICT 1657856");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(date68);
        org.junit.Assert.assertEquals(date68.toString(), "Thu Jan 01 01:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addSeconds(date4, 5);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date4, 1);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date4, 86400000);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addSeconds(date15, 5);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date15, 1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date15, 86400000);
        boolean boolean22 = org.apache.commons.lang.time.DateUtils.isSameInstant(date10, date15);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addDays(date15, (-1));
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addYears(date15, 1);
        java.lang.String[] strArray30 = new java.lang.String[] { "", "" };
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray30);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.add(date31, (int) (short) 10, 5);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date34, (int) (byte) 0);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.add(date34, (int) (short) -1, (int) (byte) 0);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addWeeks(date34, 60000);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date41, (int) (short) 1);
        java.lang.String[] strArray47 = new java.lang.String[] { "", "" };
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray47);
        java.lang.String[] strArray52 = new java.lang.String[] { "", "" };
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray52);
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.add(date53, (int) (short) 10, 5);
        boolean boolean57 = org.apache.commons.lang.time.DateUtils.isSameDay(date48, date56);
        java.util.Date date59 = org.apache.commons.lang.time.DateUtils.addSeconds(date48, (int) (byte) -1);
        boolean boolean60 = org.apache.commons.lang.time.DateUtils.isSameInstant(date43, date48);
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.addYears(date43, (int) '4');
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.addYears(date43, 10);
        java.util.Date date66 = org.apache.commons.lang.time.DateUtils.addWeeks(date64, 0);
        java.util.Iterator iterator68 = org.apache.commons.lang.time.DateUtils.iterator(date64, 4);
        boolean boolean69 = org.apache.commons.lang.time.DateUtils.isSameDay(date15, date64);
        java.util.Date date71 = org.apache.commons.lang.time.DateUtils.addDays(date15, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Fri Jan 02 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Fri Jan 02 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Wed Dec 31 00:00:00 ICT 1969");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Fri Jan 01 00:00:00 ICT 1971");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Dec 04 05:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Wed Jan 01 00:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Wed Dec 31 23:59:59 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Fri Jan 01 00:00:00 ICT 3171");
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Tue Jan 01 00:00:00 ICT 3129");
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Tue Jan 01 00:00:00 ICT 3129");
        org.junit.Assert.assertNotNull(iterator68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(date71);
        org.junit.Assert.assertEquals(date71.toString(), "Fri Jan 02 00:00:00 ICT 1970");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addWeeks(date4, 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addSeconds(date6, 1000);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.round(date6, 5);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addYears(date10, 6);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addSeconds(date10, 1000);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addMonths(date10, (int) (short) 100);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addSeconds(date10, 86400000);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Mar 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 12 00:16:40 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Mar 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Fri Mar 12 00:00:00 ICT 1976");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Mar 12 00:16:40 ICT 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Wed Jul 12 00:00:00 ICT 1978");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Wed Dec 06 00:00:00 ICT 1972");
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addSeconds(date4, 5);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMinutes(date6, 10);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addMinutes(date8, (int) '4');
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addYears(date10, 86400000);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addMinutes(date12, 0);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addSeconds(date14, (int) ' ');
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date16, 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:10:05 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 01:02:05 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 01:02:05 ICT 86401970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 01:02:05 ICT 86401970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 01:02:37 ICT 86401970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 01:02:37 ICT 86401970");
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addDays(date14, 2);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addDays(date21, (int) '#');
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addMonths(date23, 1);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "" };
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray29);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addSeconds(date30, 5);
        boolean boolean33 = org.apache.commons.lang.time.DateUtils.isSameInstant(date23, date32);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addMinutes(date23, (int) '4');
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.add(date23, 6, (int) (byte) 100);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date23, 1001);
        boolean boolean41 = org.apache.commons.lang.time.DateUtils.isSameDay(date14, date23);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.addYears(date14, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator45 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date43, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 52 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sat Jan 03 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Feb 05 00:52:00 ICT 1970");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Sat May 16 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Feb 05 00:00:01 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addSeconds(date4, 5);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMinutes(date6, 10);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addMinutes(date8, (int) '4');
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addWeeks(date10, (int) (short) 0);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date10, (int) (byte) -1);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.add(date10, 6, (int) (short) 100);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMinutes(date10, 1001);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addSeconds(date10, (int) ' ');
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addDays(date21, 1001);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:10:05 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 01:02:05 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 01:02:05 ICT 1970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 01:02:04 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sat Apr 11 01:02:05 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 17:43:05 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 01:02:37 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Sep 28 01:02:37 ICT 1972");
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.round(obj0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addWeeks(date4, 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addYears(date4, (int) '#');
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.round(date4, 0);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.round(date4, 0);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addMonths(date4, (int) (byte) 0);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addMinutes(date4, (int) '#');
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date4, (int) (byte) 10);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addDays(date4, 60000);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Mar 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sat Jan 01 00:00:00 ICT 2005");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:35:00 ICT 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Sun Apr 11 00:00:00 ICT 2134");
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addDays(date4, (int) '#');
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMonths(date6, 1);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date13, 5);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date15);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addSeconds(date21, 5);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date21, 1);
        boolean boolean26 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date21);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.add(date21, 3, 1000);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.round(date29, (int) (byte) 10);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addDays(date29, 10);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addDays(date33, 1001);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addSeconds(date35, (int) (byte) 1);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addMonths(date35, (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Sun Mar 12 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Sun Dec 08 00:00:00 ICT 1991");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Sun Dec 08 00:00:01 ICT 1991");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Sun Dec 08 00:00:00 ICT 1991");
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (short) 10, 5);
        boolean boolean13 = org.apache.commons.lang.time.DateUtils.isSameDay(date4, date12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMinutes(date4, (int) (byte) 100);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date15, 4);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addWeeks(date17, 1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMinutes(date19, (int) (short) -1);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addWeeks(date21, (int) (byte) 1);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "" };
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray27);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addDays(date28, (int) '#');
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addMonths(date30, 1);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "" };
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray36);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addSeconds(date37, 5);
        boolean boolean40 = org.apache.commons.lang.time.DateUtils.isSameInstant(date30, date39);
        java.lang.String[] strArray44 = new java.lang.String[] { "", "" };
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray44);
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.addSeconds(date45, 5);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date45, 1);
        boolean boolean50 = org.apache.commons.lang.time.DateUtils.isSameInstant(date30, date45);
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.add(date45, 3, 1000);
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.round(date53, (int) (byte) 10);
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.addYears(date55, 1);
        boolean boolean58 = org.apache.commons.lang.time.DateUtils.isSameInstant(date21, date55);
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.addSeconds(date55, 5);
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.addMinutes(date60, 86400000);
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.addDays(date62, 5);
        java.lang.String[] strArray68 = new java.lang.String[] { "", "" };
        java.util.Date date69 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray68);
        java.util.Date date72 = org.apache.commons.lang.time.DateUtils.add(date69, (int) (short) 10, 5);
        java.util.Date date74 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date72, (int) (byte) 0);
        java.util.Date date77 = org.apache.commons.lang.time.DateUtils.add(date72, (int) (short) -1, (int) (byte) 0);
        java.util.Date date80 = org.apache.commons.lang.time.DateUtils.add(date72, (int) (byte) 0, (int) (byte) 0);
        java.util.Date date82 = org.apache.commons.lang.time.DateUtils.addYears(date72, 100);
        java.util.Date date84 = org.apache.commons.lang.time.DateUtils.addHours(date82, (int) (byte) 0);
        java.util.Date date86 = org.apache.commons.lang.time.DateUtils.addYears(date84, 1000);
        boolean boolean87 = org.apache.commons.lang.time.DateUtils.isSameInstant(date62, date86);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Mon Jan 05 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon Jan 12 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Mon Jan 12 01:39:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Mon Jan 19 01:39:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Fri Mar 02 00:00:00 ICT 1990");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Thu Mar 02 00:00:05 ICT 1989");
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Sun Jun 10 00:00:05 ICT 2153");
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Fri Jun 15 00:00:05 ICT 2153");
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date69);
        org.junit.Assert.assertEquals(date69.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date72);
        org.junit.Assert.assertEquals(date72.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date74);
        org.junit.Assert.assertEquals(date74.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date77);
        org.junit.Assert.assertEquals(date77.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date80);
        org.junit.Assert.assertEquals(date80.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date82);
        org.junit.Assert.assertEquals(date82.toString(), "Wed Jan 01 05:00:00 ICT 2070");
        org.junit.Assert.assertNotNull(date84);
        org.junit.Assert.assertEquals(date84.toString(), "Wed Jan 01 05:00:00 ICT 2070");
        org.junit.Assert.assertNotNull(date86);
        org.junit.Assert.assertEquals(date86.toString(), "Sat Jan 01 05:00:00 ICT 3070");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addDays(date4, (int) '#');
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMonths(date6, 1);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date13, 5);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date15);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addSeconds(date21, 5);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date21, 1);
        boolean boolean26 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date21);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.add(date21, 3, 1000);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.round(date29, (int) (byte) 10);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addDays(date29, 10);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addWeeks(date29, (int) (byte) 10);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addWeeks(date35, (int) (byte) 100);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Sun Mar 12 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu May 11 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Apr 11 00:00:00 ICT 1991");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (short) 10, 5);
        boolean boolean13 = org.apache.commons.lang.time.DateUtils.isSameDay(date4, date12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMinutes(date4, (int) (byte) 100);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date15, 4);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addWeeks(date17, 1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMinutes(date19, (int) (short) -1);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.truncate(date21, 1001);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addYears(date23, 1001);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date23, (int) (short) 10);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.truncate(date23, 1);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addYears(date29, 60000);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.round(date29, 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Mon Jan 05 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon Jan 12 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Mon Jan 12 01:39:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Tue Jan 01 00:00:00 ICT 2971");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 ICT 61970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addWeeks(date4, 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addSeconds(date6, 1000);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.round(date6, 5);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addYears(date10, 6);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addSeconds(date10, 1000);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addDays(date19, (int) '#');
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addMonths(date21, 1);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "" };
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray27);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addSeconds(date28, 5);
        boolean boolean31 = org.apache.commons.lang.time.DateUtils.isSameInstant(date21, date30);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addYears(date21, 86400000);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date21, 5);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addDays(date21, 1000);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addHours(date37, (int) (byte) 1);
        boolean boolean40 = org.apache.commons.lang.time.DateUtils.isSameInstant(date10, date37);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addMinutes(date37, (-1));
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Mar 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 12 00:16:40 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Mar 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Fri Mar 12 00:00:00 ICT 1976");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Mar 12 00:16:40 ICT 1970");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Feb 05 00:00:00 ICT 86401970");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Wed Nov 01 00:00:00 ICT 1972");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Wed Nov 01 01:00:00 ICT 1972");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Tue Oct 31 23:59:00 ICT 1972");
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (short) 10, 5);
        boolean boolean13 = org.apache.commons.lang.time.DateUtils.isSameDay(date4, date12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMinutes(date4, (int) (byte) 100);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date15, 4);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addWeeks(date17, 1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMinutes(date19, (int) (short) -1);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addWeeks(date21, (int) (byte) 1);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "" };
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray27);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addDays(date28, (int) '#');
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addMonths(date30, 1);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "" };
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray36);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addSeconds(date37, 5);
        boolean boolean40 = org.apache.commons.lang.time.DateUtils.isSameInstant(date30, date39);
        java.lang.String[] strArray44 = new java.lang.String[] { "", "" };
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray44);
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.addSeconds(date45, 5);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date45, 1);
        boolean boolean50 = org.apache.commons.lang.time.DateUtils.isSameInstant(date30, date45);
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.add(date45, 3, 1000);
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.round(date53, (int) (byte) 10);
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.addYears(date55, 1);
        boolean boolean58 = org.apache.commons.lang.time.DateUtils.isSameInstant(date21, date55);
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date21, (int) (short) 1);
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date21, 100);
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.addHours(date21, (int) (short) 1);
        java.lang.String[] strArray68 = new java.lang.String[] { "", "" };
        java.util.Date date69 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray68);
        boolean boolean70 = org.apache.commons.lang.time.DateUtils.isSameDay(date64, date69);
        java.util.Date date72 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date69, 6);
        java.util.Date date74 = org.apache.commons.lang.time.DateUtils.addDays(date72, (int) 'a');
        java.util.Date date76 = org.apache.commons.lang.time.DateUtils.truncate(date72, 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Mon Jan 05 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon Jan 12 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Mon Jan 12 01:39:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Mon Jan 19 01:39:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Fri Mar 02 00:00:00 ICT 1990");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Mon Jan 12 01:39:00 ICT 1970");
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Mon Jan 12 02:39:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date69);
        org.junit.Assert.assertEquals(date69.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(date72);
        org.junit.Assert.assertEquals(date72.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date74);
        org.junit.Assert.assertEquals(date74.toString(), "Wed Apr 08 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date76);
        org.junit.Assert.assertEquals(date76.toString(), "Sat Jan 01 00:00:00 ICT 543");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) strArray3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not round [Ljava.lang.String;@41b282a2");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addDays(date4, (int) '#');
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMonths(date6, 1);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date13, 5);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date15);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addSeconds(date21, 5);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date21, 1);
        boolean boolean26 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date21);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.add(date21, 3, 1000);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.round(date29, (int) (byte) 10);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addDays(date29, 10);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addDays(date33, 1001);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addSeconds(date35, (int) (byte) 1);
        java.util.Iterator iterator39 = org.apache.commons.lang.time.DateUtils.iterator(date35, 4);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addSeconds(date35, (int) (short) 100);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Sun Mar 12 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Sun Dec 08 00:00:00 ICT 1991");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Sun Dec 08 00:00:01 ICT 1991");
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Sun Dec 08 00:01:40 ICT 1991");
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addDays(date4, (int) '#');
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMonths(date6, 1);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date13, 5);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date15);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addSeconds(date21, 5);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date21, 1);
        boolean boolean26 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date21);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.add(date21, 3, 1000);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.round(date29, (int) (byte) 10);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addDays(date29, 10);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addWeeks(date29, (int) (byte) 10);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addMinutes(date35, 1000);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addMonths(date37, (int) 'a');
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date37, 5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date43 = org.apache.commons.lang.time.DateUtils.round(date37, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 97 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Sun Mar 12 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu May 11 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu May 11 16:40:00 ICT 1989");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Wed Jun 11 16:40:00 ICT 1997");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu May 11 00:00:00 ICT 1989");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addSeconds(date4, 5);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date4, 1);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date4, 86400000);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addDays(date4, 3600000);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addMonths(date4, (int) (short) 1);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.add(date14, (int) (byte) 0, 1001);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addDays(date14, (int) (short) -1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date14, (int) (short) 0);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addMinutes(date14, 3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator25 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) 3, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on 3");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Fri Jan 02 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Tue Jun 20 00:00:00 ICT 11826");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sun Feb 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sun Feb 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sat Jan 31 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Sun Feb 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Sun Feb 01 00:03:00 ICT 1970");
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 10, 5);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date7, (int) (byte) 0);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (short) -1, (int) (byte) 0);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addWeeks(date7, 60000);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.add(date19, (int) (short) 10, 5);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addMonths(date22, (int) (short) 1);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addHours(date22, (int) '#');
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addDays(date26, (int) (byte) 0);
        boolean boolean29 = org.apache.commons.lang.time.DateUtils.isSameDay(date7, date28);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addHours(date7, 1);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addWeeks(date7, 0);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.add(date33, 0, (int) '4');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Dec 04 05:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Sun Feb 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Fri Jan 02 16:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Fri Jan 02 16:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 06:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 05:00:00 ICT 1970");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addSeconds(date4, 5);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date4, 1);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date4, 86400000);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addSeconds(date15, 5);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date15, 1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date15, 86400000);
        boolean boolean22 = org.apache.commons.lang.time.DateUtils.isSameInstant(date10, date15);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "" };
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray26);
        java.lang.String[] strArray31 = new java.lang.String[] { "", "" };
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray31);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.add(date32, (int) (short) 10, 5);
        boolean boolean36 = org.apache.commons.lang.time.DateUtils.isSameDay(date27, date35);
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.addMinutes(date27, (int) (byte) 100);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addDays(date38, 4);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addWeeks(date40, 1);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.addMinutes(date42, (int) (short) -1);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.addMinutes(date44, (int) ' ');
        boolean boolean47 = org.apache.commons.lang.time.DateUtils.isSameInstant(date15, date44);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.addMonths(date44, (int) (byte) 100);
        java.util.Date date51 = org.apache.commons.lang.time.DateUtils.addYears(date44, 1);
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.addSeconds(date51, 100);
        java.lang.Class<?> wildcardClass54 = date51.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Fri Jan 02 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Fri Jan 02 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Mon Jan 05 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Mon Jan 12 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Mon Jan 12 01:39:00 ICT 1970");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Mon Jan 12 02:11:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Fri May 12 01:39:00 ICT 1978");
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Tue Jan 12 01:39:00 ICT 1971");
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Tue Jan 12 01:40:40 ICT 1971");
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray5);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray5);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addWeeks(date8, (int) (short) 100);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.round(date8, 1);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addSeconds(date12, 100);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.truncate(date14, (int) (byte) 0);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addMonths(date16, 4);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addHours(date16, 0);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Dec 02 00:00:00 ICT 1971");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:01:40 ICT 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Sun May 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Sat Jan 01 00:00:00 ICT 543");
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addSeconds(date4, 5);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date4, 1);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date4, 86400000);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addSeconds(date15, 5);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date15, 1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date15, 86400000);
        boolean boolean22 = org.apache.commons.lang.time.DateUtils.isSameInstant(date10, date15);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addSeconds(date10, 2);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.add(date10, 6, 3);
        java.lang.String[] strArray31 = new java.lang.String[] { "", "" };
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray31);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.addDays(date32, (int) '#');
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addMonths(date34, 1);
        java.lang.String[] strArray40 = new java.lang.String[] { "", "" };
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray40);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.addSeconds(date41, 5);
        boolean boolean44 = org.apache.commons.lang.time.DateUtils.isSameInstant(date34, date43);
        java.lang.String[] strArray48 = new java.lang.String[] { "", "" };
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray48);
        java.util.Date date51 = org.apache.commons.lang.time.DateUtils.addSeconds(date49, 5);
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date49, 1);
        boolean boolean54 = org.apache.commons.lang.time.DateUtils.isSameInstant(date34, date49);
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.add(date49, 3, 1000);
        java.util.Date date59 = org.apache.commons.lang.time.DateUtils.round(date57, (int) (byte) 10);
        java.util.Date date61 = org.apache.commons.lang.time.DateUtils.addDays(date57, 10);
        java.util.Date date63 = org.apache.commons.lang.time.DateUtils.addDays(date57, 5);
        java.util.Date date65 = org.apache.commons.lang.time.DateUtils.addMinutes(date63, (int) (byte) 100);
        boolean boolean66 = org.apache.commons.lang.time.DateUtils.isSameInstant(date27, date65);
        java.util.Date date69 = org.apache.commons.lang.time.DateUtils.add(date27, 0, (int) (byte) 0);
        java.util.Date date71 = org.apache.commons.lang.time.DateUtils.addWeeks(date69, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date73 = org.apache.commons.lang.time.DateUtils.truncate(date71, 86400000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 86400000 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Fri Jan 02 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Fri Jan 02 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Fri Jan 02 00:00:02 ICT 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Mon Jan 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Sun Mar 12 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Tue Mar 07 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date65);
        org.junit.Assert.assertEquals(date65.toString(), "Tue Mar 07 01:40:00 ICT 1989");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(date69);
        org.junit.Assert.assertEquals(date69.toString(), "Mon Jan 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date71);
        org.junit.Assert.assertEquals(date71.toString(), "Mon Mar 16 00:00:00 ICT 1970");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray5);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray5);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addWeeks(date8, (int) (short) 100);
        java.util.Date date11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = org.apache.commons.lang.time.DateUtils.isSameInstant(date10, date11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Dec 02 00:00:00 ICT 1971");
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addSeconds(date4, 5);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date4, 1);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date4, 86400000);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addSeconds(date15, 5);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date15, 1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date15, 86400000);
        boolean boolean22 = org.apache.commons.lang.time.DateUtils.isSameInstant(date10, date15);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "" };
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray26);
        java.lang.String[] strArray31 = new java.lang.String[] { "", "" };
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray31);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.add(date32, (int) (short) 10, 5);
        boolean boolean36 = org.apache.commons.lang.time.DateUtils.isSameDay(date27, date35);
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.addMinutes(date27, (int) (byte) 100);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addDays(date38, 4);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addWeeks(date40, 1);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.addMinutes(date42, (int) (short) -1);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.addMinutes(date44, (int) ' ');
        boolean boolean47 = org.apache.commons.lang.time.DateUtils.isSameInstant(date15, date44);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date49 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date44, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 100 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Fri Jan 02 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Fri Jan 02 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Mon Jan 05 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Mon Jan 12 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Mon Jan 12 01:39:00 ICT 1970");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Mon Jan 12 02:11:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray5);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray5);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addSeconds(date8, (int) 'a');
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addMonths(date8, (-1));
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.truncate(date8, (int) (byte) 10);
        java.util.Iterator iterator16 = org.apache.commons.lang.time.DateUtils.iterator(date14, 3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 00:01:37 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Mon Dec 01 00:00:00 ICT 1969");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(iterator16);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.truncate(date0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (short) 10, 5);
        boolean boolean13 = org.apache.commons.lang.time.DateUtils.isSameDay(date4, date12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMinutes(date4, (int) (byte) 100);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date15, 4);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addWeeks(date17, 1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMinutes(date19, (int) (short) -1);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addWeeks(date21, (int) (byte) 1);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "" };
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray27);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addDays(date28, (int) '#');
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addMonths(date30, 1);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "" };
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray36);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addSeconds(date37, 5);
        boolean boolean40 = org.apache.commons.lang.time.DateUtils.isSameInstant(date30, date39);
        java.lang.String[] strArray44 = new java.lang.String[] { "", "" };
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray44);
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.addSeconds(date45, 5);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date45, 1);
        boolean boolean50 = org.apache.commons.lang.time.DateUtils.isSameInstant(date30, date45);
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.add(date45, 3, 1000);
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.round(date53, (int) (byte) 10);
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.addYears(date55, 1);
        boolean boolean58 = org.apache.commons.lang.time.DateUtils.isSameInstant(date21, date55);
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date21, (int) (short) 1);
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date21, 100);
        java.lang.String[] strArray66 = new java.lang.String[] { "", "" };
        java.util.Date date67 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray66);
        java.lang.String[] strArray71 = new java.lang.String[] { "", "" };
        java.util.Date date72 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray71);
        java.util.Date date75 = org.apache.commons.lang.time.DateUtils.add(date72, (int) (short) 10, 5);
        boolean boolean76 = org.apache.commons.lang.time.DateUtils.isSameDay(date67, date75);
        java.util.Date date78 = org.apache.commons.lang.time.DateUtils.addMinutes(date67, (int) (byte) 100);
        java.util.Date date80 = org.apache.commons.lang.time.DateUtils.addDays(date78, 4);
        java.util.Date date82 = org.apache.commons.lang.time.DateUtils.addWeeks(date80, 1);
        java.util.Date date84 = org.apache.commons.lang.time.DateUtils.addMinutes(date82, (int) (short) -1);
        java.util.Date date86 = org.apache.commons.lang.time.DateUtils.addMonths(date82, 2);
        java.util.Date date88 = org.apache.commons.lang.time.DateUtils.addYears(date86, (int) 'a');
        boolean boolean89 = org.apache.commons.lang.time.DateUtils.isSameDay(date62, date86);
        java.util.Date date91 = org.apache.commons.lang.time.DateUtils.round(date86, 2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Mon Jan 05 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon Jan 12 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Mon Jan 12 01:39:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Mon Jan 19 01:39:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Fri Mar 02 00:00:00 ICT 1990");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Mon Jan 12 01:39:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date67);
        org.junit.Assert.assertEquals(date67.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date72);
        org.junit.Assert.assertEquals(date72.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date75);
        org.junit.Assert.assertEquals(date75.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(date78);
        org.junit.Assert.assertEquals(date78.toString(), "Thu Jan 01 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date80);
        org.junit.Assert.assertEquals(date80.toString(), "Mon Jan 05 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date82);
        org.junit.Assert.assertEquals(date82.toString(), "Mon Jan 12 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date84);
        org.junit.Assert.assertEquals(date84.toString(), "Mon Jan 12 01:39:00 ICT 1970");
        org.junit.Assert.assertNotNull(date86);
        org.junit.Assert.assertEquals(date86.toString(), "Thu Mar 12 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date88);
        org.junit.Assert.assertEquals(date88.toString(), "Sat Mar 12 01:40:00 ICT 2067");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(date91);
        org.junit.Assert.assertEquals(date91.toString(), "Sun Mar 01 00:00:00 ICT 1970");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addDays(date4, (int) '#');
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMonths(date6, 1);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date13, 5);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date6, 1);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.truncate(date6, 5);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.addMinutes(date6, (int) (byte) 100);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Feb 05 01:40:00 ICT 1970");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addDays(date4, (int) '#');
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMonths(date6, 1);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date6, 1001);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "" };
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray16);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray16);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray16);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addWeeks(date19, (int) (short) 100);
        boolean boolean22 = org.apache.commons.lang.time.DateUtils.isSameDay(date10, date21);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator24 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 0 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Feb 05 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Dec 02 00:00:00 ICT 1971");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addDays(date4, (int) '#');
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMonths(date6, 1);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date13, 5);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addDays(date6, 5);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "" };
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray22);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addSeconds(date23, 5);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date23, 1);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date23, 86400000);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addDays(date23, 3600000);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addDays(date23, 0);
        boolean boolean34 = org.apache.commons.lang.time.DateUtils.isSameDay(date6, date33);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addHours(date6, (int) (byte) 100);
        java.lang.String[] strArray40 = new java.lang.String[] { "", "" };
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray40);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.addWeeks(date41, 10);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.addSeconds(date43, 1000);
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.addHours(date45, 3600000);
        java.lang.String[] strArray51 = new java.lang.String[] { "", "" };
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray51);
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.add(date52, (int) (short) 10, 5);
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date55, (int) (byte) 0);
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.add(date55, (int) (short) -1, (int) (byte) 0);
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.addMinutes(date60, (int) (short) 1);
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.addYears(date60, 86400000);
        java.util.Date date66 = org.apache.commons.lang.time.DateUtils.truncate(date60, 1001);
        java.util.Date date68 = org.apache.commons.lang.time.DateUtils.round(date60, 1001);
        boolean boolean69 = org.apache.commons.lang.time.DateUtils.isSameDay(date45, date60);
        java.lang.String[] strArray73 = new java.lang.String[] { "", "" };
        java.util.Date date74 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray73);
        java.util.Date date77 = org.apache.commons.lang.time.DateUtils.add(date74, (int) (short) 10, 5);
        java.util.Date date79 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date77, (int) (byte) 0);
        java.util.Date date81 = org.apache.commons.lang.time.DateUtils.addMonths(date77, 4);
        java.util.Date date83 = org.apache.commons.lang.time.DateUtils.addMinutes(date77, 0);
        java.util.Date date86 = org.apache.commons.lang.time.DateUtils.add(date83, 1, (int) '#');
        boolean boolean87 = org.apache.commons.lang.time.DateUtils.isSameInstant(date45, date83);
        boolean boolean88 = org.apache.commons.lang.time.DateUtils.isSameInstant(date36, date45);
        java.util.Date date90 = org.apache.commons.lang.time.DateUtils.truncate(date45, 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Tue Feb 10 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Fri Jan 02 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Tue Jun 20 00:00:00 ICT 11826");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Mon Feb 09 04:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Mar 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Mar 12 00:16:40 ICT 1970");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Mon Nov 17 00:16:40 ICT 2380");
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Thu Jan 01 05:01:00 ICT 1970");
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Thu Jan 01 05:00:00 ICT 86401970");
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date68);
        org.junit.Assert.assertEquals(date68.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date74);
        org.junit.Assert.assertEquals(date74.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date77);
        org.junit.Assert.assertEquals(date77.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date79);
        org.junit.Assert.assertEquals(date79.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date81);
        org.junit.Assert.assertEquals(date81.toString(), "Fri May 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date83);
        org.junit.Assert.assertEquals(date83.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date86);
        org.junit.Assert.assertEquals(date86.toString(), "Sat Jan 01 05:00:00 ICT 2005");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(date90);
        org.junit.Assert.assertEquals(date90.toString(), "Sat Jan 01 00:00:00 ICT 543");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addSeconds(date4, 5);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date4, 1);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date4, 86400000);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addDays(date4, 3600000);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addMonths(date4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date16 = org.apache.commons.lang.time.DateUtils.round(date4, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 35 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Fri Jan 02 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Tue Jun 20 00:00:00 ICT 11826");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sun Feb 01 00:00:00 ICT 1970");
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addWeeks(date4, 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addYears(date4, (int) '#');
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.round(date4, 0);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addMonths(date4, 0);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addHours(date4, 1001);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addMonths(date4, 3600000);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date18 = org.apache.commons.lang.time.DateUtils.truncate(date16, 3600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 3600000 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Mar 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sat Jan 01 00:00:00 ICT 2005");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Wed Feb 11 17:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 ICT 301970");
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (short) 10, 5);
        boolean boolean13 = org.apache.commons.lang.time.DateUtils.isSameDay(date4, date12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMinutes(date4, (int) (byte) 100);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date15, 4);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addWeeks(date17, 1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMinutes(date19, (int) (short) -1);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.truncate(date21, 1001);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addYears(date23, 1001);
        java.util.Date date26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = org.apache.commons.lang.time.DateUtils.isSameInstant(date25, date26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Mon Jan 05 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon Jan 12 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Mon Jan 12 01:39:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Tue Jan 01 00:00:00 ICT 2971");
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (short) 10, 5);
        boolean boolean13 = org.apache.commons.lang.time.DateUtils.isSameDay(date4, date12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMinutes(date4, (int) (byte) 100);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date15, 4);
        java.lang.String[] strArray21 = new java.lang.String[] { "", "" };
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray21);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "" };
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray26);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.add(date27, (int) (short) 10, 5);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date30, (int) (byte) 0);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "" };
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray36);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.add(date37, (int) (short) 10, 5);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date40, (int) (byte) 0);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.add(date40, (int) (short) -1, (int) (byte) 0);
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.addMinutes(date45, (int) (short) 1);
        boolean boolean48 = org.apache.commons.lang.time.DateUtils.isSameInstant(date30, date47);
        java.lang.String[] strArray52 = new java.lang.String[] { "", "" };
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray52);
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.add(date53, (int) (short) 10, 5);
        java.util.Date date58 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date56, (int) (byte) 0);
        java.util.Date date61 = org.apache.commons.lang.time.DateUtils.add(date56, (int) (short) -1, (int) (byte) 0);
        java.util.Date date63 = org.apache.commons.lang.time.DateUtils.addMinutes(date61, (int) (short) 1);
        boolean boolean64 = org.apache.commons.lang.time.DateUtils.isSameDay(date47, date61);
        boolean boolean65 = org.apache.commons.lang.time.DateUtils.isSameDay(date22, date47);
        java.util.Date date67 = org.apache.commons.lang.time.DateUtils.addYears(date22, 10);
        boolean boolean68 = org.apache.commons.lang.time.DateUtils.isSameInstant(date15, date22);
        java.util.Date date70 = org.apache.commons.lang.time.DateUtils.truncate(date22, 1001);
        java.util.Date date72 = org.apache.commons.lang.time.DateUtils.addSeconds(date22, 0);
        java.util.Date date74 = org.apache.commons.lang.time.DateUtils.addYears(date22, 0);
        java.util.Date date76 = org.apache.commons.lang.time.DateUtils.round(date74, (int) (short) 0);
        java.lang.String[] strArray80 = new java.lang.String[] { "", "" };
        java.util.Date date81 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray80);
        java.util.Date date83 = org.apache.commons.lang.time.DateUtils.addSeconds(date81, 5);
        java.util.Date date85 = org.apache.commons.lang.time.DateUtils.addHours(date83, (int) (byte) 0);
        java.util.Date date87 = org.apache.commons.lang.time.DateUtils.truncate(date85, 10);
        java.util.Date date89 = org.apache.commons.lang.time.DateUtils.addDays(date87, (int) (byte) 100);
        boolean boolean90 = org.apache.commons.lang.time.DateUtils.isSameDay(date76, date87);
        java.util.Date date92 = org.apache.commons.lang.time.DateUtils.addMonths(date76, (int) (short) 10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Mon Jan 05 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 05:01:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Thu Jan 01 05:01:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(date67);
        org.junit.Assert.assertEquals(date67.toString(), "Tue Jan 01 00:00:00 ICT 1980");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date72);
        org.junit.Assert.assertEquals(date72.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date74);
        org.junit.Assert.assertEquals(date74.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date76);
        org.junit.Assert.assertEquals(date76.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertArrayEquals(strArray80, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date81);
        org.junit.Assert.assertEquals(date81.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date83);
        org.junit.Assert.assertEquals(date83.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date85);
        org.junit.Assert.assertEquals(date85.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date87);
        org.junit.Assert.assertEquals(date87.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date89);
        org.junit.Assert.assertEquals(date89.toString(), "Sat Apr 11 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(date92);
        org.junit.Assert.assertEquals(date92.toString(), "Tue Nov 01 00:00:00 ICT 543");
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 10, 5);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date7, (int) (byte) 0);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (short) -1, (int) (byte) 0);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addWeeks(date7, 60000);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date14, (int) (short) 1);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.add(date16, 4, (int) (byte) 0);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.round(date19, (int) (short) 10);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addWeeks(date21, (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Dec 04 05:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Wed Jan 01 00:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Wed Jan 01 00:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Wed Jan 01 00:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Wed Jan 01 00:00:00 ICT 3119");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addWeeks(date4, 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addSeconds(date6, 1000);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.round(date6, 5);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.add(date10, (int) (byte) 10, 60000);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date13, (int) 'a');
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date15, 6);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addSeconds(date15, (int) 'a');
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMinutes(date19, (int) (short) 10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Mar 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 12 00:16:40 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Mar 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Fri Jan 14 00:00:00 ICT 1977");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Fri Jan 14 00:00:00 ICT 1977");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 20 00:00:00 ICT 1977");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Fri Jan 14 00:01:37 ICT 1977");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Fri Jan 14 00:11:37 ICT 1977");
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addSeconds(date4, 5);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date4, 1);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date4, 86400000);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addDays(date10, (int) (byte) 100);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addWeeks(date12, 0);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addYears(date12, 4);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addSeconds(date12, 3);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addSeconds(date18, (int) (byte) 0);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.addYears(date20, 3600000);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Fri Jan 02 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Sun Apr 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sun Apr 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Fri Apr 12 00:00:00 ICT 1974");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Sun Apr 12 00:00:03 ICT 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Sun Apr 12 00:00:03 ICT 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Sun Apr 12 00:00:03 ICT 3601970");
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addDays(date4, (int) '#');
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMonths(date6, 1);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date13, 5);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date15);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addSeconds(date21, 5);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date21, 1);
        boolean boolean26 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date21);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.add(date21, 3, 1000);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date29, (int) 'a');
        java.lang.String[] strArray35 = new java.lang.String[] { "", "" };
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray35);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.add(date36, (int) (short) 10, 5);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date39, (int) (byte) 0);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.add(date39, (int) (short) -1, (int) (byte) 0);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.addWeeks(date39, 60000);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date46, (int) (short) 1);
        java.lang.String[] strArray52 = new java.lang.String[] { "", "" };
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray52);
        java.lang.String[] strArray57 = new java.lang.String[] { "", "" };
        java.util.Date date58 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray57);
        java.util.Date date61 = org.apache.commons.lang.time.DateUtils.add(date58, (int) (short) 10, 5);
        boolean boolean62 = org.apache.commons.lang.time.DateUtils.isSameDay(date53, date61);
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.addSeconds(date53, (int) (byte) -1);
        boolean boolean65 = org.apache.commons.lang.time.DateUtils.isSameInstant(date48, date53);
        java.util.Date date67 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date53, 6);
        boolean boolean68 = org.apache.commons.lang.time.DateUtils.isSameInstant(date31, date53);
        java.util.Date date70 = org.apache.commons.lang.time.DateUtils.addHours(date53, (int) '#');
        java.util.Date date73 = org.apache.commons.lang.time.DateUtils.add(date53, 0, 86400000);
        java.util.Date date75 = org.apache.commons.lang.time.DateUtils.addSeconds(date73, 1000);
        java.util.Date date77 = org.apache.commons.lang.time.DateUtils.addMonths(date73, 10);
        java.util.Date date79 = org.apache.commons.lang.time.DateUtils.addSeconds(date73, 5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Dec 04 05:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Wed Jan 01 00:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Wed Dec 31 23:59:59 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(date67);
        org.junit.Assert.assertEquals(date67.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Fri Jan 02 11:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date73);
        org.junit.Assert.assertEquals(date73.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date75);
        org.junit.Assert.assertEquals(date75.toString(), "Thu Jan 01 00:16:40 ICT 1970");
        org.junit.Assert.assertNotNull(date77);
        org.junit.Assert.assertEquals(date77.toString(), "Sun Nov 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date79);
        org.junit.Assert.assertEquals(date79.toString(), "Thu Jan 01 00:00:05 ICT 1970");
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addWeeks(date4, 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMinutes(date4, (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Mar 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Wed Dec 31 23:59:00 ICT 1969");
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (short) 10, 5);
        boolean boolean13 = org.apache.commons.lang.time.DateUtils.isSameDay(date4, date12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMinutes(date4, (int) (byte) 100);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date15, 4);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addWeeks(date17, 1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMinutes(date19, (int) (short) -1);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addWeeks(date21, (int) (byte) 1);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "" };
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray27);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addDays(date28, (int) '#');
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addMonths(date30, 1);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "" };
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray36);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addSeconds(date37, 5);
        boolean boolean40 = org.apache.commons.lang.time.DateUtils.isSameInstant(date30, date39);
        java.lang.String[] strArray44 = new java.lang.String[] { "", "" };
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray44);
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.addSeconds(date45, 5);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date45, 1);
        boolean boolean50 = org.apache.commons.lang.time.DateUtils.isSameInstant(date30, date45);
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.add(date45, 3, 1000);
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.round(date53, (int) (byte) 10);
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.addYears(date55, 1);
        boolean boolean58 = org.apache.commons.lang.time.DateUtils.isSameInstant(date21, date55);
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date21, (int) (short) 1);
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date21, 100);
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.addHours(date21, (int) (short) 1);
        java.util.Date date66 = org.apache.commons.lang.time.DateUtils.addYears(date64, 3600000);
        java.util.Date date68 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date66, (int) (short) 1);
        java.util.Date date70 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date68, (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Mon Jan 05 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon Jan 12 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Mon Jan 12 01:39:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Mon Jan 19 01:39:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Fri Mar 02 00:00:00 ICT 1990");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Mon Jan 12 01:39:00 ICT 1970");
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Mon Jan 12 02:39:00 ICT 1970");
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Mon Jan 12 02:39:00 ICT 3601970");
        org.junit.Assert.assertNotNull(date68);
        org.junit.Assert.assertEquals(date68.toString(), "Thu Jan 01 00:00:00 ICT 3601970");
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Wed Dec 31 23:59:59 ICT 3601969");
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 10, 5);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date7, (int) (byte) 0);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (short) -1, (int) (byte) 0);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addWeeks(date7, 60000);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date14, (int) (short) 1);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "" };
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray25);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.add(date26, (int) (short) 10, 5);
        boolean boolean30 = org.apache.commons.lang.time.DateUtils.isSameDay(date21, date29);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addSeconds(date21, (int) (byte) -1);
        boolean boolean33 = org.apache.commons.lang.time.DateUtils.isSameInstant(date16, date21);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date21, 6);
        java.lang.String[] strArray39 = new java.lang.String[] { "", "" };
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray39);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addSeconds(date40, 5);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date40, 1);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date40, 86400000);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.addDays(date40, 3600000);
        java.util.Date date50 = org.apache.commons.lang.time.DateUtils.addMonths(date40, (int) (short) 1);
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.add(date50, (int) (byte) 0, 1001);
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.addDays(date50, (int) (short) -1);
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date50, (int) (short) 0);
        java.util.Date date59 = org.apache.commons.lang.time.DateUtils.addMinutes(date50, 3);
        boolean boolean60 = org.apache.commons.lang.time.DateUtils.isSameInstant(date21, date59);
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.addSeconds(date21, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator64 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date21, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 0 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Dec 04 05:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Wed Jan 01 00:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Wed Dec 31 23:59:59 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Fri Jan 02 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Tue Jun 20 00:00:00 ICT 11826");
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Sun Feb 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Sun Feb 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Sat Jan 31 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Sun Feb 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Sun Feb 01 00:03:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (short) 10, 5);
        boolean boolean13 = org.apache.commons.lang.time.DateUtils.isSameDay(date4, date12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMinutes(date4, (int) (byte) 100);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date15, 4);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addWeeks(date17, 1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMinutes(date19, 3600000);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addMonths(date21, (int) (short) -1);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addDays(date21, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Mon Jan 05 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon Jan 12 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Tue Nov 16 01:40:00 ICT 1976");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Sat Oct 16 01:40:00 ICT 1976");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Wed Nov 17 01:40:00 ICT 1976");
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addSeconds(date22, 60000);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 16:40:00 ICT 1970");
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "" };
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray13);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray13);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray13);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray13);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray13);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray13);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray13);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray13);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray13);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray13);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray13);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addDays(date24, 1001);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addDays(date26, 4);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Sep 28 00:00:00 ICT 1972");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Mon Oct 02 00:00:00 ICT 1972");
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addDays(date4, (int) '#');
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMonths(date6, 1);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date13, 5);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date6, (int) (short) 0);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date18, 3);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.addYears(date18, (int) (byte) 100);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Wed Feb 05 00:00:00 ICT 2070");
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addDays(date4, (int) '#');
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMonths(date6, 1);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date13, 5);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addDays(date6, 5);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addWeeks(date6, 86400000);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.addHours(date20, 0);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addDays(date20, 1001);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date20, 2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Tue Feb 10 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Apr 03 00:00:00 ICT 1657856");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Apr 03 00:00:00 ICT 1657856");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Dec 30 00:00:00 ICT 1657858");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Apr 03 00:00:00 ICT 1657856");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 10, 5);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date7, (int) (byte) 0);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (short) -1, (int) (byte) 0);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addWeeks(date7, 60000);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date14, (int) (short) 1);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "" };
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray25);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.add(date26, (int) (short) 10, 5);
        boolean boolean30 = org.apache.commons.lang.time.DateUtils.isSameDay(date21, date29);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addSeconds(date21, (int) (byte) -1);
        boolean boolean33 = org.apache.commons.lang.time.DateUtils.isSameInstant(date16, date21);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date21, 6);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addMonths(date35, (int) (short) 0);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addWeeks(date37, 3);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addYears(date37, 1);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.round(date37, 10);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.addHours(date43, (int) 'a');
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.addSeconds(date45, (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Dec 04 05:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Wed Jan 01 00:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Wed Dec 31 23:59:59 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 22 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Fri Jan 01 00:00:00 ICT 1971");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Mon Jan 05 01:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Mon Jan 05 01:00:00 ICT 1970");
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (short) 10, 5);
        boolean boolean13 = org.apache.commons.lang.time.DateUtils.isSameDay(date4, date12);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 0, 10);
        java.util.Iterator iterator18 = org.apache.commons.lang.time.DateUtils.iterator(date4, 6);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "" };
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray22);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "" };
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray27);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.add(date28, (int) (short) 10, 5);
        boolean boolean32 = org.apache.commons.lang.time.DateUtils.isSameDay(date23, date31);
        boolean boolean33 = org.apache.commons.lang.time.DateUtils.isSameDay(date4, date23);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addMonths(date23, 5);
        java.lang.Class<?> wildcardClass36 = date35.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Mon Jun 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 10, 5);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date7, (int) (byte) 0);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (short) -1, (int) (byte) 0);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addWeeks(date7, 60000);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date14, (int) (short) 1);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.add(date16, 4, (int) (byte) 0);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date16, 3);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addDays(date21, (int) (byte) 1);
        java.lang.Class<?> wildcardClass24 = date21.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Dec 04 05:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Wed Jan 01 00:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Wed Jan 01 00:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Wed Jan 01 00:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 02 00:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 10, 5);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addMonths(date7, (int) (short) 1);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "" };
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray13);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addSeconds(date14, 5);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addMinutes(date16, 10);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "" };
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray22);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addWeeks(date23, 10);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addYears(date23, (int) '#');
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.round(date23, 0);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addMonths(date23, 0);
        java.lang.String[] strArray35 = new java.lang.String[] { "", "" };
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray35);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.add(date36, (int) (short) 10, 5);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date39, (int) (byte) 0);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.add(date39, (int) (short) -1, (int) (byte) 0);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.addMinutes(date44, (int) (short) 1);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.round(date46, 1);
        boolean boolean49 = org.apache.commons.lang.time.DateUtils.isSameInstant(date23, date48);
        boolean boolean50 = org.apache.commons.lang.time.DateUtils.isSameDay(date18, date48);
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.round(date18, 1);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date18, 0);
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.addMinutes(date18, 3);
        boolean boolean57 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date56);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Sun Feb 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:10:05 ICT 1970");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Mar 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Sat Jan 01 00:00:00 ICT 2005");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 05:01:00 ICT 1970");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Thu Jan 01 00:13:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addSeconds(date4, 5);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMinutes(date6, 10);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addWeeks(date13, 10);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addYears(date13, (int) '#');
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.round(date13, 0);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMonths(date13, 0);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "" };
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray25);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.add(date26, (int) (short) 10, 5);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date29, (int) (byte) 0);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.add(date29, (int) (short) -1, (int) (byte) 0);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addMinutes(date34, (int) (short) 1);
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.round(date36, 1);
        boolean boolean39 = org.apache.commons.lang.time.DateUtils.isSameInstant(date13, date38);
        boolean boolean40 = org.apache.commons.lang.time.DateUtils.isSameDay(date8, date38);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addDays(date8, (int) (byte) 1);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.addWeeks(date42, 6);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date44, (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:10:05 ICT 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Mar 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sat Jan 01 00:00:00 ICT 2005");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 05:01:00 ICT 1970");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Fri Jan 02 00:10:05 ICT 1970");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Fri Feb 13 00:10:05 ICT 1970");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Fri Feb 13 00:10:05 ICT 1970");
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 10, 5);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date7, (int) (byte) 0);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (short) 10, (int) (short) 100);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "" };
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray16);
        java.lang.String[] strArray21 = new java.lang.String[] { "", "" };
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray21);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.add(date22, (int) (short) 10, 5);
        boolean boolean26 = org.apache.commons.lang.time.DateUtils.isSameDay(date17, date25);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addSeconds(date17, (int) (byte) -1);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addWeeks(date28, 3);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addYears(date28, (int) (short) 100);
        boolean boolean33 = org.apache.commons.lang.time.DateUtils.isSameInstant(date9, date32);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date36 = org.apache.commons.lang.time.DateUtils.add(date32, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Mon Jan 05 09:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Wed Dec 31 23:59:59 ICT 1969");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Wed Jan 21 23:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Tue Dec 31 23:59:59 ICT 2069");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addDays(date4, (int) '#');
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMonths(date6, 1);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date13, 5);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date15);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addSeconds(date21, 5);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date21, 1);
        boolean boolean26 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date21);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.add(date21, 3, 1000);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date29, (int) (short) 1);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addWeeks(date31, 3);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date31, 1);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addYears(date31, 10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Mar 23 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Sun Jan 01 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Tue Mar 02 00:00:00 ICT 1999");
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (short) 10, 5);
        boolean boolean13 = org.apache.commons.lang.time.DateUtils.isSameDay(date4, date12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMinutes(date4, (int) (byte) 100);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date15, 4);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addWeeks(date17, 1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMinutes(date19, (int) (short) -1);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addMonths(date19, 2);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addYears(date23, (int) 'a');
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addDays(date23, (int) (short) 1);
        java.lang.String[] strArray31 = new java.lang.String[] { "", "" };
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray31);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "" };
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray36);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.add(date37, (int) (short) 10, 5);
        boolean boolean41 = org.apache.commons.lang.time.DateUtils.isSameDay(date32, date40);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.addSeconds(date32, (int) (byte) -1);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.addWeeks(date43, 3);
        java.lang.String[] strArray49 = new java.lang.String[] { "", "" };
        java.util.Date date50 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray49);
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.add(date50, (int) (short) 10, 5);
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.addDays(date50, (int) '#');
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.addMonths(date55, 0);
        boolean boolean58 = org.apache.commons.lang.time.DateUtils.isSameDay(date43, date57);
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.addSeconds(date43, 1001);
        boolean boolean61 = org.apache.commons.lang.time.DateUtils.isSameDay(date23, date43);
        java.util.Date date63 = org.apache.commons.lang.time.DateUtils.addMonths(date23, (int) '#');
        java.util.Date date65 = org.apache.commons.lang.time.DateUtils.addDays(date63, (int) '4');
        java.lang.String[] strArray69 = new java.lang.String[] { "", "" };
        java.util.Date date70 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray69);
        java.util.Date date73 = org.apache.commons.lang.time.DateUtils.add(date70, (int) (short) 10, 5);
        java.util.Date date75 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date73, (int) (byte) 0);
        java.util.Date date78 = org.apache.commons.lang.time.DateUtils.add(date73, (int) (short) -1, (int) (byte) 0);
        java.util.Date date80 = org.apache.commons.lang.time.DateUtils.addMinutes(date78, (int) (short) 1);
        java.util.Date date82 = org.apache.commons.lang.time.DateUtils.round(date80, 1);
        java.lang.String[] strArray86 = new java.lang.String[] { "", "" };
        java.util.Date date87 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray86);
        java.util.Date date89 = org.apache.commons.lang.time.DateUtils.addDays(date87, (int) '#');
        java.util.Date date91 = org.apache.commons.lang.time.DateUtils.addMonths(date89, 1);
        java.util.Date date93 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date89, 60000);
        boolean boolean94 = org.apache.commons.lang.time.DateUtils.isSameInstant(date80, date89);
        boolean boolean95 = org.apache.commons.lang.time.DateUtils.isSameInstant(date63, date80);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Mon Jan 05 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon Jan 12 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Mon Jan 12 01:39:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Mar 12 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Sat Mar 12 01:40:00 ICT 2067");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Fri Mar 13 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Wed Dec 31 23:59:59 ICT 1969");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Wed Jan 21 23:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Thu Jan 01 00:16:40 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Mon Feb 12 01:40:00 ICT 1973");
        org.junit.Assert.assertNotNull(date65);
        org.junit.Assert.assertEquals(date65.toString(), "Thu Apr 05 01:40:00 ICT 1973");
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date73);
        org.junit.Assert.assertEquals(date73.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date75);
        org.junit.Assert.assertEquals(date75.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date78);
        org.junit.Assert.assertEquals(date78.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date80);
        org.junit.Assert.assertEquals(date80.toString(), "Thu Jan 01 05:01:00 ICT 1970");
        org.junit.Assert.assertNotNull(date82);
        org.junit.Assert.assertEquals(date82.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertArrayEquals(strArray86, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date87);
        org.junit.Assert.assertEquals(date87.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date89);
        org.junit.Assert.assertEquals(date89.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date91);
        org.junit.Assert.assertEquals(date91.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date93);
        org.junit.Assert.assertEquals(date93.toString(), "Thu Feb 05 00:01:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 10, 5);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addMonths(date7, (int) (short) 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addDays(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.round(date11, 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addDays(date11, 1);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addWeeks(date11, (-1));
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Sun Feb 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Fri Jan 02 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Dec 25 05:00:00 ICT 1969");
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 10, 5);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date7, (int) (byte) 0);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (short) -1, (int) (byte) 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (byte) 0, (int) (byte) 0);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addYears(date7, 100);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addHours(date17, (int) (byte) 0);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addYears(date19, 1000);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addWeeks(date19, (int) (byte) 100);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addYears(date19, (int) '#');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Wed Jan 01 05:00:00 ICT 2070");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Wed Jan 01 05:00:00 ICT 2070");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Sat Jan 01 05:00:00 ICT 3070");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Wed Dec 02 05:00:00 ICT 2071");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 05:00:00 ICT 2105");
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addSeconds(date4, 5);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addHours(date6, (int) (byte) 0);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addHours(date8, 4);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date10, (int) (byte) 10);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "" };
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray16);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addDays(date17, (int) '#');
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMonths(date19, 1);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "" };
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray25);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addSeconds(date26, 5);
        boolean boolean29 = org.apache.commons.lang.time.DateUtils.isSameInstant(date19, date28);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addYears(date19, 86400000);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addMonths(date19, 10);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.add(date19, 1, (int) (short) -1);
        boolean boolean37 = org.apache.commons.lang.time.DateUtils.isSameDay(date10, date36);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 04:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 04:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Feb 05 00:00:00 ICT 86401970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Sat Dec 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Wed Feb 05 00:00:00 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (short) 10, 5);
        boolean boolean13 = org.apache.commons.lang.time.DateUtils.isSameDay(date4, date12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMinutes(date4, (int) (byte) 100);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date15, 4);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addWeeks(date17, 1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMinutes(date19, (int) (short) -1);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addWeeks(date21, (int) (byte) 1);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "" };
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray27);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addDays(date28, (int) '#');
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addMonths(date30, 1);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "" };
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray36);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addSeconds(date37, 5);
        boolean boolean40 = org.apache.commons.lang.time.DateUtils.isSameInstant(date30, date39);
        java.lang.String[] strArray44 = new java.lang.String[] { "", "" };
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray44);
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.addSeconds(date45, 5);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date45, 1);
        boolean boolean50 = org.apache.commons.lang.time.DateUtils.isSameInstant(date30, date45);
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.add(date45, 3, 1000);
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.round(date53, (int) (byte) 10);
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.addYears(date55, 1);
        boolean boolean58 = org.apache.commons.lang.time.DateUtils.isSameInstant(date21, date55);
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date21, (int) (short) 1);
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date21, 100);
        java.lang.String[] strArray66 = new java.lang.String[] { "", "" };
        java.util.Date date67 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray66);
        java.lang.String[] strArray71 = new java.lang.String[] { "", "" };
        java.util.Date date72 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray71);
        java.util.Date date75 = org.apache.commons.lang.time.DateUtils.add(date72, (int) (short) 10, 5);
        boolean boolean76 = org.apache.commons.lang.time.DateUtils.isSameDay(date67, date75);
        java.util.Date date78 = org.apache.commons.lang.time.DateUtils.addMinutes(date67, (int) (byte) 100);
        java.util.Date date80 = org.apache.commons.lang.time.DateUtils.addDays(date78, 4);
        java.util.Date date82 = org.apache.commons.lang.time.DateUtils.addWeeks(date80, 1);
        java.util.Date date84 = org.apache.commons.lang.time.DateUtils.addMinutes(date82, (int) (short) -1);
        java.util.Date date86 = org.apache.commons.lang.time.DateUtils.addMonths(date82, 2);
        java.util.Date date88 = org.apache.commons.lang.time.DateUtils.addYears(date86, (int) 'a');
        boolean boolean89 = org.apache.commons.lang.time.DateUtils.isSameDay(date62, date86);
        java.util.Date date91 = org.apache.commons.lang.time.DateUtils.round(date86, (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Mon Jan 05 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon Jan 12 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Mon Jan 12 01:39:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Mon Jan 19 01:39:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Fri Mar 02 00:00:00 ICT 1990");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Mon Jan 12 01:39:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date67);
        org.junit.Assert.assertEquals(date67.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date72);
        org.junit.Assert.assertEquals(date72.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date75);
        org.junit.Assert.assertEquals(date75.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(date78);
        org.junit.Assert.assertEquals(date78.toString(), "Thu Jan 01 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date80);
        org.junit.Assert.assertEquals(date80.toString(), "Mon Jan 05 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date82);
        org.junit.Assert.assertEquals(date82.toString(), "Mon Jan 12 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date84);
        org.junit.Assert.assertEquals(date84.toString(), "Mon Jan 12 01:39:00 ICT 1970");
        org.junit.Assert.assertNotNull(date86);
        org.junit.Assert.assertEquals(date86.toString(), "Thu Mar 12 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date88);
        org.junit.Assert.assertEquals(date88.toString(), "Sat Mar 12 01:40:00 ICT 2067");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(date91);
        org.junit.Assert.assertEquals(date91.toString(), "Sat Jan 01 00:00:00 ICT 543");
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 10, 5);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addDays(date4, (int) '#');
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addSeconds(date9, (int) (byte) 10);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date11, (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Feb 05 00:00:10 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Feb 05 00:00:09 ICT 1970");
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addDays(date14, 2);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addDays(date21, (int) '#');
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addMonths(date23, 1);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "" };
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray29);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addSeconds(date30, 5);
        boolean boolean33 = org.apache.commons.lang.time.DateUtils.isSameInstant(date23, date32);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addMinutes(date23, (int) '4');
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.add(date23, 6, (int) (byte) 100);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date23, 1001);
        boolean boolean41 = org.apache.commons.lang.time.DateUtils.isSameDay(date14, date23);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.addHours(date14, 0);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.addHours(date14, 1000);
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date14, (int) (short) 10);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sat Jan 03 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Feb 05 00:52:00 ICT 1970");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Sat May 16 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Feb 05 00:00:01 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Wed Feb 11 16:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (short) 10, 5);
        boolean boolean13 = org.apache.commons.lang.time.DateUtils.isSameDay(date4, date12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMinutes(date4, (int) (byte) 100);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date15, 4);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addWeeks(date17, 1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMinutes(date19, (int) (short) -1);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addMonths(date19, 2);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addYears(date23, (int) 'a');
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addDays(date23, (int) (short) 1);
        java.lang.String[] strArray31 = new java.lang.String[] { "", "" };
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray31);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "" };
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray36);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.add(date37, (int) (short) 10, 5);
        boolean boolean41 = org.apache.commons.lang.time.DateUtils.isSameDay(date32, date40);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.addSeconds(date32, (int) (byte) -1);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.addWeeks(date43, 3);
        java.lang.String[] strArray49 = new java.lang.String[] { "", "" };
        java.util.Date date50 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray49);
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.add(date50, (int) (short) 10, 5);
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.addDays(date50, (int) '#');
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.addMonths(date55, 0);
        boolean boolean58 = org.apache.commons.lang.time.DateUtils.isSameDay(date43, date57);
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.addSeconds(date43, 1001);
        boolean boolean61 = org.apache.commons.lang.time.DateUtils.isSameDay(date23, date43);
        java.util.Date date63 = org.apache.commons.lang.time.DateUtils.addMonths(date23, (int) '#');
        java.lang.String[] strArray67 = new java.lang.String[] { "", "" };
        java.util.Date date68 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray67);
        java.util.Date date70 = org.apache.commons.lang.time.DateUtils.addSeconds(date68, 5);
        java.util.Date date72 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date68, 1);
        java.util.Date date74 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date68, 86400000);
        java.util.Date date76 = org.apache.commons.lang.time.DateUtils.addDays(date68, 3600000);
        java.util.Iterator iterator78 = org.apache.commons.lang.time.DateUtils.iterator(date76, 4);
        java.util.Date date80 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date76, 10);
        boolean boolean81 = org.apache.commons.lang.time.DateUtils.isSameInstant(date63, date76);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Mon Jan 05 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon Jan 12 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Mon Jan 12 01:39:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Mar 12 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Sat Mar 12 01:40:00 ICT 2067");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Fri Mar 13 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Wed Dec 31 23:59:59 ICT 1969");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Wed Jan 21 23:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Thu Jan 01 00:16:40 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Mon Feb 12 01:40:00 ICT 1973");
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date68);
        org.junit.Assert.assertEquals(date68.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date72);
        org.junit.Assert.assertEquals(date72.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date74);
        org.junit.Assert.assertEquals(date74.toString(), "Fri Jan 02 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date76);
        org.junit.Assert.assertEquals(date76.toString(), "Tue Jun 20 00:00:00 ICT 11826");
        org.junit.Assert.assertNotNull(iterator78);
        org.junit.Assert.assertNotNull(date80);
        org.junit.Assert.assertEquals(date80.toString(), "Tue Jun 20 00:00:00 ICT 11826");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 10, 5);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date7, (int) (byte) 0);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (short) -1, (int) (byte) 0);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addWeeks(date7, 60000);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date14, (int) (short) 1);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "" };
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray25);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.add(date26, (int) (short) 10, 5);
        boolean boolean30 = org.apache.commons.lang.time.DateUtils.isSameDay(date21, date29);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addSeconds(date21, (int) (byte) -1);
        boolean boolean33 = org.apache.commons.lang.time.DateUtils.isSameInstant(date16, date21);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addYears(date16, (int) '4');
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addYears(date16, 10);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addWeeks(date37, 0);
        java.util.Iterator iterator41 = org.apache.commons.lang.time.DateUtils.iterator(date37, 4);
        java.lang.String[] strArray45 = new java.lang.String[] { "", "" };
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray45);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.addSeconds(date46, 5);
        java.util.Date date50 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date46, 1);
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date46, 86400000);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.addDays(date46, 3600000);
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.addMonths(date46, (int) (short) 1);
        java.util.Date date59 = org.apache.commons.lang.time.DateUtils.add(date56, (int) (byte) 0, 1001);
        java.util.Date date61 = org.apache.commons.lang.time.DateUtils.addMonths(date56, 2);
        boolean boolean62 = org.apache.commons.lang.time.DateUtils.isSameDay(date37, date56);
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.addYears(date37, 6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Dec 04 05:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Wed Jan 01 00:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Wed Dec 31 23:59:59 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Fri Jan 01 00:00:00 ICT 3171");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Tue Jan 01 00:00:00 ICT 3129");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Tue Jan 01 00:00:00 ICT 3129");
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Fri Jan 02 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Tue Jun 20 00:00:00 ICT 11826");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Sun Feb 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Sun Feb 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Wed Apr 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Tue Jan 01 00:00:00 ICT 3135");
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addDays(date4, (int) '#');
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMonths(date6, 1);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date13, 5);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date15);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addSeconds(date21, 5);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date21, 1);
        boolean boolean26 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date21);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.add(date21, 3, 1000);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.round(date29, (int) (byte) 10);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addYears(date31, 1);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date31, (int) (short) 10);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addSeconds(date31, (int) (byte) 10);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addDays(date37, (int) (byte) 10);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addYears(date39, 5);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.addYears(date39, (-1));
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.addMinutes(date39, 3);
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.addYears(date45, (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Fri Mar 02 00:00:00 ICT 1990");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Mar 02 00:00:10 ICT 1989");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Sun Mar 12 00:00:10 ICT 1989");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Sat Mar 12 00:00:10 ICT 1994");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Sat Mar 12 00:00:10 ICT 1988");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Sun Mar 12 00:03:10 ICT 1989");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Sat Mar 12 00:03:10 ICT 1988");
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (short) 10, 5);
        boolean boolean13 = org.apache.commons.lang.time.DateUtils.isSameDay(date4, date12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMinutes(date4, (int) (byte) 100);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date15, 4);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addWeeks(date17, 1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMinutes(date19, (int) (short) -1);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addWeeks(date21, (int) (byte) 1);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "" };
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray27);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addDays(date28, (int) '#');
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addMonths(date30, 1);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "" };
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray36);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addSeconds(date37, 5);
        boolean boolean40 = org.apache.commons.lang.time.DateUtils.isSameInstant(date30, date39);
        java.lang.String[] strArray44 = new java.lang.String[] { "", "" };
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray44);
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.addSeconds(date45, 5);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date45, 1);
        boolean boolean50 = org.apache.commons.lang.time.DateUtils.isSameInstant(date30, date45);
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.add(date45, 3, 1000);
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.round(date53, (int) (byte) 10);
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.addYears(date55, 1);
        boolean boolean58 = org.apache.commons.lang.time.DateUtils.isSameInstant(date21, date55);
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date21, (int) (short) 1);
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date21, 100);
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.addHours(date21, (int) (short) 1);
        java.util.Date date66 = org.apache.commons.lang.time.DateUtils.addYears(date64, 3600000);
        java.util.Date date68 = org.apache.commons.lang.time.DateUtils.addSeconds(date66, (int) (byte) 1);
        java.util.Date date70 = org.apache.commons.lang.time.DateUtils.addYears(date68, (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Mon Jan 05 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon Jan 12 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Mon Jan 12 01:39:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Mon Jan 19 01:39:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Fri Mar 02 00:00:00 ICT 1990");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Mon Jan 12 01:39:00 ICT 1970");
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Mon Jan 12 02:39:00 ICT 1970");
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Mon Jan 12 02:39:00 ICT 3601970");
        org.junit.Assert.assertNotNull(date68);
        org.junit.Assert.assertEquals(date68.toString(), "Mon Jan 12 02:39:01 ICT 3601970");
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Tue Jan 12 02:39:01 ICT 3601971");
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addDays(date4, (int) '#');
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMonths(date6, 1);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date13, 5);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date15);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addSeconds(date21, 5);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date21, 1);
        boolean boolean26 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date21);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.add(date21, 3, 1000);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date29, (int) 'a');
        java.lang.String[] strArray35 = new java.lang.String[] { "", "" };
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray35);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.add(date36, (int) (short) 10, 5);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date39, (int) (byte) 0);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.add(date39, (int) (short) -1, (int) (byte) 0);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.addWeeks(date39, 60000);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date46, (int) (short) 1);
        java.lang.String[] strArray52 = new java.lang.String[] { "", "" };
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray52);
        java.lang.String[] strArray57 = new java.lang.String[] { "", "" };
        java.util.Date date58 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray57);
        java.util.Date date61 = org.apache.commons.lang.time.DateUtils.add(date58, (int) (short) 10, 5);
        boolean boolean62 = org.apache.commons.lang.time.DateUtils.isSameDay(date53, date61);
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.addSeconds(date53, (int) (byte) -1);
        boolean boolean65 = org.apache.commons.lang.time.DateUtils.isSameInstant(date48, date53);
        java.util.Date date67 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date53, 6);
        boolean boolean68 = org.apache.commons.lang.time.DateUtils.isSameInstant(date31, date53);
        java.util.Date date70 = org.apache.commons.lang.time.DateUtils.addMinutes(date53, 0);
        java.util.Date date72 = org.apache.commons.lang.time.DateUtils.addMonths(date53, (int) (byte) 0);
        java.util.Date date74 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date72, (int) (byte) 100);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Dec 04 05:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Wed Jan 01 00:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Wed Dec 31 23:59:59 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(date67);
        org.junit.Assert.assertEquals(date67.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date72);
        org.junit.Assert.assertEquals(date72.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date74);
        org.junit.Assert.assertEquals(date74.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 10, 5);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addDays(date4, (int) '#');
        java.lang.Class<?> wildcardClass10 = date9.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 10, 5);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date7, (int) (byte) 0);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (short) -1, (int) (byte) 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (byte) 0, (int) (byte) 0);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addYears(date7, 100);
        java.lang.String[] strArray21 = new java.lang.String[] { "", "" };
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray21);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "" };
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray26);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.add(date27, (int) (short) 10, 5);
        boolean boolean31 = org.apache.commons.lang.time.DateUtils.isSameDay(date22, date30);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.add(date22, (int) (short) 0, 10);
        java.util.Iterator iterator36 = org.apache.commons.lang.time.DateUtils.iterator(date22, 6);
        java.lang.String[] strArray40 = new java.lang.String[] { "", "" };
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray40);
        java.lang.String[] strArray45 = new java.lang.String[] { "", "" };
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray45);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.add(date46, (int) (short) 10, 5);
        boolean boolean50 = org.apache.commons.lang.time.DateUtils.isSameDay(date41, date49);
        boolean boolean51 = org.apache.commons.lang.time.DateUtils.isSameDay(date22, date41);
        boolean boolean52 = org.apache.commons.lang.time.DateUtils.isSameDay(date17, date22);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.addMinutes(date17, 100);
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.addHours(date54, (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Wed Jan 01 05:00:00 ICT 2070");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Wed Jan 01 06:40:00 ICT 2070");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Wed Jan 01 16:40:00 ICT 2070");
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 10, 5);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date7, (int) (byte) 0);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date7, (int) (short) 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date11, (int) (byte) 1);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "" };
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray17);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.add(date18, (int) (short) 10, 5);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date21, (int) (byte) 0);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.add(date21, (int) (short) -1, (int) (byte) 0);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addMinutes(date26, (int) (short) 1);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.round(date28, 1);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "" };
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray34);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addDays(date35, (int) '#');
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addMonths(date37, 1);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date37, 60000);
        boolean boolean42 = org.apache.commons.lang.time.DateUtils.isSameInstant(date28, date37);
        boolean boolean43 = org.apache.commons.lang.time.DateUtils.isSameInstant(date13, date28);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.truncate(date13, 2);
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.addMonths(date13, 1001);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.truncate(date47, 1001);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date51 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date49, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 32 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Jan 01 00:00:01 ICT 543");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 05:01:00 ICT 1970");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Feb 05 00:01:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Tue Jun 01 00:00:01 ICT 460");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Tue Jun 01 00:00:00 ICT 460");
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addDays(date4, (int) '#');
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMonths(date6, 1);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addDays(date13, (int) '#');
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMonths(date15, 1);
        java.lang.String[] strArray21 = new java.lang.String[] { "", "" };
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray21);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addSeconds(date22, 5);
        boolean boolean25 = org.apache.commons.lang.time.DateUtils.isSameInstant(date15, date24);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "" };
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray29);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addSeconds(date30, 5);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date30, 1);
        boolean boolean35 = org.apache.commons.lang.time.DateUtils.isSameInstant(date15, date30);
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.add(date30, 3, 1000);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.round(date38, (int) (byte) 10);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addDays(date38, 10);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.addWeeks(date38, (int) (byte) 10);
        boolean boolean45 = org.apache.commons.lang.time.DateUtils.isSameDay(date6, date38);
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.addMonths(date6, 1);
        java.lang.String[] strArray51 = new java.lang.String[] { "", "" };
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray51);
        java.lang.String[] strArray56 = new java.lang.String[] { "", "" };
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray56);
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.add(date57, (int) (short) 10, 5);
        boolean boolean61 = org.apache.commons.lang.time.DateUtils.isSameDay(date52, date60);
        java.util.Date date63 = org.apache.commons.lang.time.DateUtils.addMinutes(date52, (int) (byte) 100);
        java.util.Date date65 = org.apache.commons.lang.time.DateUtils.addDays(date63, 4);
        java.util.Date date67 = org.apache.commons.lang.time.DateUtils.addSeconds(date63, (int) 'a');
        java.util.Date date69 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date67, (int) (short) 100);
        boolean boolean70 = org.apache.commons.lang.time.DateUtils.isSameDay(date47, date67);
        java.util.Date date72 = org.apache.commons.lang.time.DateUtils.addMinutes(date47, (int) (byte) 10);
        java.util.Iterator iterator74 = org.apache.commons.lang.time.DateUtils.iterator(date47, 6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Sun Mar 12 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu May 11 00:00:00 ICT 1989");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Thu Jan 01 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date65);
        org.junit.Assert.assertEquals(date65.toString(), "Mon Jan 05 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date67);
        org.junit.Assert.assertEquals(date67.toString(), "Thu Jan 01 01:41:37 ICT 1970");
        org.junit.Assert.assertNotNull(date69);
        org.junit.Assert.assertEquals(date69.toString(), "Thu Jan 01 01:41:37 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(date72);
        org.junit.Assert.assertEquals(date72.toString(), "Thu Mar 05 00:10:00 ICT 1970");
        org.junit.Assert.assertNotNull(iterator74);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addSeconds(date4, 5);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date4, 1);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date4, 86400000);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addSeconds(date15, 5);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date15, 1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date15, 86400000);
        boolean boolean22 = org.apache.commons.lang.time.DateUtils.isSameInstant(date10, date15);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addSeconds(date10, 2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date26 = org.apache.commons.lang.time.DateUtils.round(date10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 52 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Fri Jan 02 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Fri Jan 02 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Fri Jan 02 00:00:02 ICT 1970");
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 10, 5);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date7, (int) (byte) 0);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (short) -1, (int) (byte) 0);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addMinutes(date12, (int) (short) 1);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addYears(date12, 86400000);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date18 = org.apache.commons.lang.time.DateUtils.truncate(date12, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field -1 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 05:01:00 ICT 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 05:00:00 ICT 86401970");
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addSeconds(date4, 5);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date4, 1);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date4, 86400000);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addSeconds(date15, 5);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date15, 1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date15, 86400000);
        boolean boolean22 = org.apache.commons.lang.time.DateUtils.isSameInstant(date10, date15);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date15, 2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator26 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) 2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on 2");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Fri Jan 02 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Fri Jan 02 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 10, 5);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addDays(date4, (int) '#');
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addDays(date9, (int) '4');
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addYears(date9, (int) (byte) 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMonths(date9, (int) (short) -1);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMonths(date15, (int) (short) 100);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMinutes(date17, (-1));
        java.util.Iterator iterator21 = org.apache.commons.lang.time.DateUtils.iterator(date17, 3);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date17, (int) (byte) 0);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addMinutes(date23, 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sun Mar 29 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Mon Jan 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Fri May 05 00:00:00 ICT 1978");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu May 04 23:59:00 ICT 1978");
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Fri May 05 00:00:00 ICT 1978");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Fri May 05 00:00:00 ICT 1978");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 10, 5);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date7, (int) (byte) 0);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (short) -1, (int) (byte) 0);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addWeeks(date7, 60000);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date14, (int) (short) 1);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.add(date16, 4, (int) (byte) 0);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addSeconds(date19, 1000);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addHours(date21, (-1));
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addWeeks(date21, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date27 = org.apache.commons.lang.time.DateUtils.round(date25, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 100 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Dec 04 05:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Wed Jan 01 00:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Wed Jan 01 00:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Wed Jan 01 00:16:40 ICT 3119");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Tue Dec 31 23:16:40 ICT 3118");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Wed Jan 01 00:16:40 ICT 3119");
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addSeconds(date4, 5);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addHours(date6, (int) (byte) 0);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addSeconds(date6, 1001);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.truncate(date10, 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 00:16:46 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Sat Jan 01 00:00:00 ICT 543");
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 10, 5);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date7, (int) (byte) 0);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "" };
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray13);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.add(date14, (int) (short) 10, 5);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date17, (int) (byte) 0);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.add(date17, (int) (short) -1, (int) (byte) 0);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addMinutes(date22, (int) (short) 1);
        boolean boolean25 = org.apache.commons.lang.time.DateUtils.isSameInstant(date7, date24);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date24, 4);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addSeconds(date27, (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 05:01:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 05:01:00 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 05:01:00 ICT 1970");
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 10, 5);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date7, (int) (byte) 0);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (short) -1, (int) (byte) 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (byte) 0, (int) (byte) 0);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMinutes(date7, (int) (byte) 0);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addYears(date7, 0);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addDays(date7, 1000);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addDays(date21, 4);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addHours(date23, 1);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addSeconds(date25, 4);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date25, 1);
        java.lang.String[] strArray33 = new java.lang.String[] { "", "" };
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray33);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.add(date34, (int) (short) 10, 5);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addDays(date34, (int) '#');
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.add(date34, 6, 6);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.truncate(date34, (int) (byte) 1);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.addDays(date44, (int) (byte) 1);
        boolean boolean47 = org.apache.commons.lang.time.DateUtils.isSameInstant(date25, date46);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.addDays(date46, 1001);
        java.lang.String[] strArray53 = new java.lang.String[] { "", "" };
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray53);
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.addSeconds(date54, 5);
        java.util.Date date58 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date54, 1);
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date54, 86400000);
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.addDays(date54, 3600000);
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.addDays(date54, 0);
        java.util.Date date66 = org.apache.commons.lang.time.DateUtils.addSeconds(date54, 100);
        java.util.Date date68 = org.apache.commons.lang.time.DateUtils.addWeeks(date66, 0);
        boolean boolean69 = org.apache.commons.lang.time.DateUtils.isSameInstant(date46, date68);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Wed Sep 27 05:00:00 ICT 1972");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Sun Oct 01 05:00:00 ICT 1972");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Sun Oct 01 06:00:00 ICT 1972");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Sun Oct 01 06:00:04 ICT 1972");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Sun Oct 01 06:00:00 ICT 1972");
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Wed Jan 07 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Fri Jan 02 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Fri Sep 29 00:00:00 ICT 1972");
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Fri Jan 02 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Tue Jun 20 00:00:00 ICT 11826");
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Thu Jan 01 00:01:40 ICT 1970");
        org.junit.Assert.assertNotNull(date68);
        org.junit.Assert.assertEquals(date68.toString(), "Thu Jan 01 00:01:40 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 10, 5);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date7, (int) (byte) 0);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (short) -1, (int) (byte) 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (byte) 0, (int) (byte) 0);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addSeconds(date15, (int) (byte) 100);
        java.lang.String[] strArray21 = new java.lang.String[] { "", "" };
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray21);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "" };
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray26);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.add(date27, (int) (short) 10, 5);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date30, (int) (byte) 0);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "" };
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray36);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.add(date37, (int) (short) 10, 5);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date40, (int) (byte) 0);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.add(date40, (int) (short) -1, (int) (byte) 0);
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.addMinutes(date45, (int) (short) 1);
        boolean boolean48 = org.apache.commons.lang.time.DateUtils.isSameInstant(date30, date47);
        java.lang.String[] strArray52 = new java.lang.String[] { "", "" };
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray52);
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.add(date53, (int) (short) 10, 5);
        java.util.Date date58 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date56, (int) (byte) 0);
        java.util.Date date61 = org.apache.commons.lang.time.DateUtils.add(date56, (int) (short) -1, (int) (byte) 0);
        java.util.Date date63 = org.apache.commons.lang.time.DateUtils.addMinutes(date61, (int) (short) 1);
        boolean boolean64 = org.apache.commons.lang.time.DateUtils.isSameDay(date47, date61);
        boolean boolean65 = org.apache.commons.lang.time.DateUtils.isSameDay(date22, date47);
        java.util.Date date67 = org.apache.commons.lang.time.DateUtils.addYears(date22, 10);
        java.util.Date date69 = org.apache.commons.lang.time.DateUtils.addSeconds(date22, 100);
        java.util.Date date71 = org.apache.commons.lang.time.DateUtils.addWeeks(date22, (-1));
        boolean boolean72 = org.apache.commons.lang.time.DateUtils.isSameDay(date15, date22);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 05:01:40 ICT 1970");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 05:01:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Thu Jan 01 05:01:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(date67);
        org.junit.Assert.assertEquals(date67.toString(), "Tue Jan 01 00:00:00 ICT 1980");
        org.junit.Assert.assertNotNull(date69);
        org.junit.Assert.assertEquals(date69.toString(), "Thu Jan 01 00:01:40 ICT 1970");
        org.junit.Assert.assertNotNull(date71);
        org.junit.Assert.assertEquals(date71.toString(), "Thu Dec 25 00:00:00 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addDays(date4, (int) '#');
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMonths(date6, 1);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date13, 5);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date15);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addSeconds(date21, 5);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date21, 1);
        boolean boolean26 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date21);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.add(date21, 3, 1000);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.round(date29, (int) (byte) 10);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addDays(date29, 10);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addWeeks(date29, (int) (byte) 10);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addDays(date35, (int) '4');
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addHours(date37, 60000);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addDays(date37, 4);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.add(date41, 3600000, (int) (byte) 0);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.addHours(date41, 60000);
        java.lang.String[] strArray50 = new java.lang.String[] { "", "" };
        java.util.Date date51 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray50);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.add(date51, (int) (short) 10, 5);
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date54, (int) (byte) 0);
        java.util.Date date59 = org.apache.commons.lang.time.DateUtils.add(date54, (int) (short) -1, (int) (byte) 0);
        java.util.Date date61 = org.apache.commons.lang.time.DateUtils.addWeeks(date54, 60000);
        java.lang.String[] strArray65 = new java.lang.String[] { "", "" };
        java.util.Date date66 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray65);
        java.util.Date date68 = org.apache.commons.lang.time.DateUtils.addWeeks(date66, 10);
        java.util.Date date70 = org.apache.commons.lang.time.DateUtils.addYears(date66, (int) '#');
        java.util.Date date72 = org.apache.commons.lang.time.DateUtils.round(date66, 0);
        java.util.Date date74 = org.apache.commons.lang.time.DateUtils.addMonths(date66, 0);
        java.lang.String[] strArray78 = new java.lang.String[] { "", "" };
        java.util.Date date79 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray78);
        java.util.Date date82 = org.apache.commons.lang.time.DateUtils.add(date79, (int) (short) 10, 5);
        java.util.Date date84 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date82, (int) (byte) 0);
        java.util.Date date87 = org.apache.commons.lang.time.DateUtils.add(date82, (int) (short) -1, (int) (byte) 0);
        java.util.Date date89 = org.apache.commons.lang.time.DateUtils.addMinutes(date87, (int) (short) 1);
        java.util.Date date91 = org.apache.commons.lang.time.DateUtils.round(date89, 1);
        boolean boolean92 = org.apache.commons.lang.time.DateUtils.isSameInstant(date66, date91);
        boolean boolean93 = org.apache.commons.lang.time.DateUtils.isSameDay(date61, date91);
        boolean boolean94 = org.apache.commons.lang.time.DateUtils.isSameDay(date41, date91);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Sun Mar 12 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu May 11 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Sun Jul 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Mon May 06 00:00:00 ICT 1996");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jul 06 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jul 06 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Fri May 10 00:00:00 ICT 1996");
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Thu Dec 04 05:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date68);
        org.junit.Assert.assertEquals(date68.toString(), "Thu Mar 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Sat Jan 01 00:00:00 ICT 2005");
        org.junit.Assert.assertNotNull(date72);
        org.junit.Assert.assertEquals(date72.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date74);
        org.junit.Assert.assertEquals(date74.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date79);
        org.junit.Assert.assertEquals(date79.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date82);
        org.junit.Assert.assertEquals(date82.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date84);
        org.junit.Assert.assertEquals(date84.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date87);
        org.junit.Assert.assertEquals(date87.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date89);
        org.junit.Assert.assertEquals(date89.toString(), "Thu Jan 01 05:01:00 ICT 1970");
        org.junit.Assert.assertNotNull(date91);
        org.junit.Assert.assertEquals(date91.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (short) 10, 5);
        boolean boolean13 = org.apache.commons.lang.time.DateUtils.isSameDay(date4, date12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMinutes(date4, (int) (byte) 100);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date15, 4);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addWeeks(date17, 1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMinutes(date19, (int) (short) -1);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addWeeks(date21, (int) (byte) 1);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addHours(date21, 3);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "" };
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray29);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.add(date30, (int) (short) 10, 5);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addDays(date30, (int) '#');
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addMonths(date35, 0);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addWeeks(date37, 60000);
        boolean boolean40 = org.apache.commons.lang.time.DateUtils.isSameInstant(date25, date37);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date43 = org.apache.commons.lang.time.DateUtils.add(date25, (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Mon Jan 05 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon Jan 12 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Mon Jan 12 01:39:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Mon Jan 19 01:39:00 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Mon Jan 12 04:39:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 08 00:00:00 ICT 3120");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addDays(date4, (int) '#');
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMonths(date6, 1);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date13, 5);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date6, (int) (short) 0);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "" };
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray22);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addDays(date23, (int) '#');
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addMonths(date25, 1);
        java.lang.String[] strArray31 = new java.lang.String[] { "", "" };
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray31);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.addSeconds(date32, 5);
        boolean boolean35 = org.apache.commons.lang.time.DateUtils.isSameInstant(date25, date34);
        java.lang.String[] strArray39 = new java.lang.String[] { "", "" };
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray39);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addSeconds(date40, 5);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date40, 1);
        boolean boolean45 = org.apache.commons.lang.time.DateUtils.isSameInstant(date25, date40);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.add(date40, 3, 1000);
        java.util.Date date50 = org.apache.commons.lang.time.DateUtils.round(date48, (int) (byte) 10);
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.addDays(date48, 10);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.addDays(date52, 1001);
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.addSeconds(date54, (int) (byte) 1);
        boolean boolean57 = org.apache.commons.lang.time.DateUtils.isSameDay(date18, date56);
        java.util.Date date59 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date18, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Sun Mar 12 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Sun Dec 08 00:00:00 ICT 1991");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Sun Dec 08 00:00:01 ICT 1991");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 10, 5);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date7, (int) (byte) 0);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date7, (int) (short) 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date11, (int) (byte) 1);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "" };
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray17);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.add(date18, (int) (short) 10, 5);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date21, (int) (byte) 0);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.add(date21, (int) (short) -1, (int) (byte) 0);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addMinutes(date26, (int) (short) 1);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.round(date28, 1);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "" };
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray34);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addDays(date35, (int) '#');
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addMonths(date37, 1);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date37, 60000);
        boolean boolean42 = org.apache.commons.lang.time.DateUtils.isSameInstant(date28, date37);
        boolean boolean43 = org.apache.commons.lang.time.DateUtils.isSameInstant(date13, date28);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date13, (int) ' ');
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.truncate(date13, 10);
        java.lang.String[] strArray51 = new java.lang.String[] { "", "" };
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray51);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.addWeeks(date52, 10);
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.addSeconds(date54, 1000);
        java.util.Date date58 = org.apache.commons.lang.time.DateUtils.round(date54, 5);
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.addYears(date58, 6);
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.addSeconds(date58, 6);
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.addDays(date62, 0);
        java.util.Date date66 = org.apache.commons.lang.time.DateUtils.addWeeks(date64, 86400000);
        java.util.Date date68 = org.apache.commons.lang.time.DateUtils.addDays(date66, (int) (byte) 0);
        java.util.Date date70 = org.apache.commons.lang.time.DateUtils.addMinutes(date68, 100);
        boolean boolean71 = org.apache.commons.lang.time.DateUtils.isSameInstant(date13, date68);
        java.util.Date date73 = org.apache.commons.lang.time.DateUtils.addSeconds(date68, 3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Jan 01 00:00:01 ICT 543");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 05:01:00 ICT 1970");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Feb 05 00:01:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Sat Jan 01 00:00:01 ICT 543");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Mar 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Thu Mar 12 00:16:40 ICT 1970");
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Thu Mar 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Fri Mar 12 00:00:00 ICT 1976");
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Thu Mar 12 00:00:06 ICT 1970");
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Thu Mar 12 00:00:06 ICT 1970");
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Thu May 08 00:00:06 ICT 1657856");
        org.junit.Assert.assertNotNull(date68);
        org.junit.Assert.assertEquals(date68.toString(), "Thu May 08 00:00:06 ICT 1657856");
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Thu May 08 01:40:06 ICT 1657856");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(date73);
        org.junit.Assert.assertEquals(date73.toString(), "Thu May 08 00:00:09 ICT 1657856");
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (short) 10, 5);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date12, (int) (byte) 0);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.add(date19, (int) (short) 10, 5);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date22, (int) (byte) 0);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.add(date22, (int) (short) -1, (int) (byte) 0);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addMinutes(date27, (int) (short) 1);
        boolean boolean30 = org.apache.commons.lang.time.DateUtils.isSameInstant(date12, date29);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "" };
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray34);
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.add(date35, (int) (short) 10, 5);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date38, (int) (byte) 0);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.add(date38, (int) (short) -1, (int) (byte) 0);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.addMinutes(date43, (int) (short) 1);
        boolean boolean46 = org.apache.commons.lang.time.DateUtils.isSameDay(date29, date43);
        boolean boolean47 = org.apache.commons.lang.time.DateUtils.isSameDay(date4, date29);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.addYears(date4, 10);
        java.util.Date date51 = org.apache.commons.lang.time.DateUtils.addSeconds(date4, 100);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.add(date51, (int) (byte) 1, 4);
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.addMonths(date54, (int) (byte) 100);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 05:01:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Jan 01 05:01:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Tue Jan 01 00:00:00 ICT 1980");
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Thu Jan 01 00:01:40 ICT 1970");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Tue Jan 01 00:01:40 ICT 1974");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Sat May 01 00:01:40 ICT 1982");
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 10, 5);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date7, (int) (byte) 0);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (short) -1, (int) (byte) 0);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addWeeks(date7, 60000);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.add(date19, (int) (short) 10, 5);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addMonths(date22, (int) (short) 1);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addHours(date22, (int) '#');
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addDays(date26, (int) (byte) 0);
        boolean boolean29 = org.apache.commons.lang.time.DateUtils.isSameDay(date7, date28);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date28, 2);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addWeeks(date31, (int) 'a');
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.add(date31, 0, (int) '#');
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.round(date36, 10);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addDays(date38, (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Dec 04 05:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Sun Feb 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Fri Jan 02 16:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Fri Jan 02 16:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Nov 11 00:00:00 ICT 1971");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addWeeks(date4, 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addYears(date4, (int) '#');
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.round(date4, 0);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.truncate(date10, (int) (byte) 0);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date12, 0);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date14, (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Mar 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sat Jan 01 00:00:00 ICT 2005");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 ICT 543");
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 10, 5);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date7, (int) (byte) 0);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (short) -1, (int) (byte) 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (byte) 0, (int) (byte) 0);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addSeconds(date15, (int) (byte) 100);
        java.lang.String[] strArray21 = new java.lang.String[] { "", "" };
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray21);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addSeconds(date22, 5);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addHours(date24, (int) (byte) 0);
        boolean boolean27 = org.apache.commons.lang.time.DateUtils.isSameInstant(date17, date24);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addYears(date17, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator31 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not iterate based on 100");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 05:01:40 ICT 1970");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Wed Jan 01 05:01:40 ICT 2070");
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addDays(date4, (int) '#');
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMonths(date6, 1);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date13, 5);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addMinutes(date6, (int) '4');
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.add(date6, 6, (int) (byte) 100);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "" };
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray25);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addDays(date26, (int) '#');
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addMonths(date28, 1);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "" };
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray34);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addSeconds(date35, 5);
        boolean boolean38 = org.apache.commons.lang.time.DateUtils.isSameInstant(date28, date37);
        java.lang.String[] strArray42 = new java.lang.String[] { "", "" };
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray42);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.addSeconds(date43, 5);
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date43, 1);
        boolean boolean48 = org.apache.commons.lang.time.DateUtils.isSameInstant(date28, date43);
        java.util.Date date51 = org.apache.commons.lang.time.DateUtils.add(date43, 3, 1000);
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date51, (int) (short) 1);
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.add(date53, 6, 3600000);
        java.util.Date date58 = org.apache.commons.lang.time.DateUtils.addHours(date53, (int) '4');
        boolean boolean59 = org.apache.commons.lang.time.DateUtils.isSameDay(date21, date53);
        java.util.Date date61 = org.apache.commons.lang.time.DateUtils.addDays(date53, 60000);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Feb 05 00:52:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Sat May 16 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Tue Aug 19 00:00:00 ICT 11845");
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Sat Mar 04 04:00:00 ICT 1989");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Sun Jun 10 00:00:00 ICT 2153");
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addHours(date0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (short) 10, 5);
        boolean boolean13 = org.apache.commons.lang.time.DateUtils.isSameDay(date4, date12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date4, (int) (byte) -1);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addWeeks(date15, 3);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addHours(date17, (int) (short) 10);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addSeconds(date19, 60000);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "" };
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray25);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.add(date26, (int) (short) 10, 5);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date29, (int) (byte) 0);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.add(date29, (int) (short) -1, (int) (byte) 0);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.add(date29, (int) (byte) 0, (int) (byte) 0);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addYears(date29, 100);
        java.lang.String[] strArray43 = new java.lang.String[] { "", "" };
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray43);
        java.lang.String[] strArray48 = new java.lang.String[] { "", "" };
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray48);
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.add(date49, (int) (short) 10, 5);
        boolean boolean53 = org.apache.commons.lang.time.DateUtils.isSameDay(date44, date52);
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.add(date44, (int) (short) 0, 10);
        java.util.Iterator iterator58 = org.apache.commons.lang.time.DateUtils.iterator(date44, 6);
        java.lang.String[] strArray62 = new java.lang.String[] { "", "" };
        java.util.Date date63 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray62);
        java.lang.String[] strArray67 = new java.lang.String[] { "", "" };
        java.util.Date date68 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray67);
        java.util.Date date71 = org.apache.commons.lang.time.DateUtils.add(date68, (int) (short) 10, 5);
        boolean boolean72 = org.apache.commons.lang.time.DateUtils.isSameDay(date63, date71);
        boolean boolean73 = org.apache.commons.lang.time.DateUtils.isSameDay(date44, date63);
        boolean boolean74 = org.apache.commons.lang.time.DateUtils.isSameDay(date39, date44);
        java.util.Date date76 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date39, (int) ' ');
        java.util.Date date78 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date39, 100);
        java.util.Date date80 = org.apache.commons.lang.time.DateUtils.addHours(date78, (int) 'a');
        boolean boolean81 = org.apache.commons.lang.time.DateUtils.isSameInstant(date19, date78);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Wed Dec 31 23:59:59 ICT 1969");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Wed Jan 21 23:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 22 09:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Fri Jan 23 02:39:59 ICT 1970");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Wed Jan 01 05:00:00 ICT 2070");
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(iterator58);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date68);
        org.junit.Assert.assertEquals(date68.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date71);
        org.junit.Assert.assertEquals(date71.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(date76);
        org.junit.Assert.assertEquals(date76.toString(), "Wed Jan 01 05:00:00 ICT 2070");
        org.junit.Assert.assertNotNull(date78);
        org.junit.Assert.assertEquals(date78.toString(), "Wed Jan 01 05:00:00 ICT 2070");
        org.junit.Assert.assertNotNull(date80);
        org.junit.Assert.assertEquals(date80.toString(), "Sun Jan 05 06:00:00 ICT 2070");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addSeconds(date4, 5);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray10);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.add(date11, (int) (short) 10, 5);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date14, (int) (byte) 0);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.add(date21, (int) (short) 10, 5);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date24, (int) (byte) 0);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.add(date24, (int) (short) -1, (int) (byte) 0);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addMinutes(date29, (int) (short) 1);
        boolean boolean32 = org.apache.commons.lang.time.DateUtils.isSameInstant(date14, date31);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "" };
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray36);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.add(date37, (int) (short) 10, 5);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date40, (int) (byte) 0);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.add(date40, (int) (short) -1, (int) (byte) 0);
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.addMinutes(date45, (int) (short) 1);
        boolean boolean48 = org.apache.commons.lang.time.DateUtils.isSameDay(date31, date45);
        boolean boolean49 = org.apache.commons.lang.time.DateUtils.isSameInstant(date4, date31);
        java.lang.String[] strArray53 = new java.lang.String[] { "", "" };
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray53);
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.add(date54, (int) (short) 10, 5);
        java.util.Date date59 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date57, (int) (byte) 0);
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.add(date57, (int) (short) -1, (int) (byte) 0);
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.addWeeks(date57, 60000);
        java.util.Date date66 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date64, (int) (short) 1);
        java.lang.String[] strArray70 = new java.lang.String[] { "", "" };
        java.util.Date date71 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray70);
        java.lang.String[] strArray75 = new java.lang.String[] { "", "" };
        java.util.Date date76 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray75);
        java.util.Date date79 = org.apache.commons.lang.time.DateUtils.add(date76, (int) (short) 10, 5);
        boolean boolean80 = org.apache.commons.lang.time.DateUtils.isSameDay(date71, date79);
        java.util.Date date82 = org.apache.commons.lang.time.DateUtils.addSeconds(date71, (int) (byte) -1);
        boolean boolean83 = org.apache.commons.lang.time.DateUtils.isSameInstant(date66, date71);
        boolean boolean84 = org.apache.commons.lang.time.DateUtils.isSameInstant(date31, date66);
        java.util.Date date86 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date66, (int) (short) 10);
        java.util.Date date88 = org.apache.commons.lang.time.DateUtils.addHours(date86, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date90 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date88, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 97 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 05:01:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 05:01:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Thu Dec 04 05:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Wed Jan 01 00:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date71);
        org.junit.Assert.assertEquals(date71.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date76);
        org.junit.Assert.assertEquals(date76.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date79);
        org.junit.Assert.assertEquals(date79.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(date82);
        org.junit.Assert.assertEquals(date82.toString(), "Wed Dec 31 23:59:59 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(date86);
        org.junit.Assert.assertEquals(date86.toString(), "Wed Jan 01 00:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(date88);
        org.junit.Assert.assertEquals(date88.toString(), "Wed Jan 01 10:00:00 ICT 3119");
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addSeconds(date4, 5);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date4, 1);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date4, 86400000);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addDays(date4, 3600000);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addDays(date4, 0);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addYears(date4, (int) (byte) 0);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addDays(date4, (int) (short) -1);
        java.lang.Class<?> wildcardClass19 = date4.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Fri Jan 02 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Tue Jun 20 00:00:00 ICT 11826");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Wed Dec 31 00:00:00 ICT 1969");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addDays(date4, (int) '#');
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMonths(date6, 1);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date13, 5);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date15);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addSeconds(date21, 5);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date21, 1);
        boolean boolean26 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date21);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.add(date21, 3, 1000);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.round(date29, (int) (byte) 10);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addDays(date29, 10);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addDays(date33, 1001);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addSeconds(date35, (int) (byte) 1);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addHours(date37, 0);
        java.lang.String[] strArray43 = new java.lang.String[] { "", "" };
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray43);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.addSeconds(date44, 5);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date44, 1);
        java.util.Date date50 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date44, 86400000);
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.addDays(date50, (int) (byte) 100);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.addWeeks(date52, 0);
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.addYears(date52, 4);
        java.util.Date date58 = org.apache.commons.lang.time.DateUtils.addWeeks(date56, 4);
        boolean boolean59 = org.apache.commons.lang.time.DateUtils.isSameDay(date39, date58);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date61 = org.apache.commons.lang.time.DateUtils.round(date58, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field -1 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Sun Mar 12 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Sun Dec 08 00:00:00 ICT 1991");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Sun Dec 08 00:00:01 ICT 1991");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Sun Dec 08 00:00:01 ICT 1991");
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Fri Jan 02 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Sun Apr 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Sun Apr 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Fri Apr 12 00:00:00 ICT 1974");
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Fri May 10 00:00:00 ICT 1974");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addSeconds(date4, 5);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date4, 1);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date4, 86400000);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addSeconds(date15, 5);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date15, 1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date15, 86400000);
        boolean boolean22 = org.apache.commons.lang.time.DateUtils.isSameInstant(date10, date15);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addSeconds(date10, 2);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.add(date10, 6, 3);
        java.lang.String[] strArray31 = new java.lang.String[] { "", "" };
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray31);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.addDays(date32, (int) '#');
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addMonths(date34, 1);
        java.lang.String[] strArray40 = new java.lang.String[] { "", "" };
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray40);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.addSeconds(date41, 5);
        boolean boolean44 = org.apache.commons.lang.time.DateUtils.isSameInstant(date34, date43);
        java.lang.String[] strArray48 = new java.lang.String[] { "", "" };
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray48);
        java.util.Date date51 = org.apache.commons.lang.time.DateUtils.addSeconds(date49, 5);
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date49, 1);
        boolean boolean54 = org.apache.commons.lang.time.DateUtils.isSameInstant(date34, date49);
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.add(date49, 3, 1000);
        java.util.Date date59 = org.apache.commons.lang.time.DateUtils.round(date57, (int) (byte) 10);
        java.util.Date date61 = org.apache.commons.lang.time.DateUtils.addDays(date57, 10);
        java.util.Date date63 = org.apache.commons.lang.time.DateUtils.addDays(date57, 5);
        java.util.Date date65 = org.apache.commons.lang.time.DateUtils.addMinutes(date63, (int) (byte) 100);
        boolean boolean66 = org.apache.commons.lang.time.DateUtils.isSameInstant(date27, date65);
        java.util.Date date68 = org.apache.commons.lang.time.DateUtils.addDays(date65, 100);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Fri Jan 02 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Fri Jan 02 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Fri Jan 02 00:00:02 ICT 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Mon Jan 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Sun Mar 12 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Tue Mar 07 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date65);
        org.junit.Assert.assertEquals(date65.toString(), "Tue Mar 07 01:40:00 ICT 1989");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(date68);
        org.junit.Assert.assertEquals(date68.toString(), "Thu Jun 15 01:40:00 ICT 1989");
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 10, 5);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date7, (int) (byte) 0);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addMinutes(date9, 6);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addHours(date9, (int) (byte) 10);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addDays(date9, 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 05:06:00 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 15:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 05:00:00 ICT 1970");
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 10, 5);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date7, (int) (byte) 0);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (short) -1, (int) (byte) 0);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addWeeks(date7, 60000);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.add(date19, (int) (short) 10, 5);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addMonths(date22, (int) (short) 1);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addHours(date22, (int) '#');
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addDays(date26, (int) (byte) 0);
        boolean boolean29 = org.apache.commons.lang.time.DateUtils.isSameDay(date7, date28);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date28, 2);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addMinutes(date31, (int) (byte) 10);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.add(date31, (int) (byte) 100, 0);
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date36, 1001);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date38, (int) (short) 100);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addYears(date40, 86400000);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.addYears(date40, 6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Dec 04 05:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Sun Feb 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Fri Jan 02 16:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Fri Jan 02 16:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:10:00 ICT 1970");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Thu Jan 01 00:00:01 ICT 86401970");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 00:00:01 ICT 1976");
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addDays(date4, (int) '#');
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMonths(date6, 1);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date13, 5);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addYears(date6, 86400000);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "" };
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray22);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "" };
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray27);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.add(date28, (int) (short) 10, 5);
        boolean boolean32 = org.apache.commons.lang.time.DateUtils.isSameDay(date23, date31);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.addSeconds(date23, (int) (byte) -1);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addWeeks(date34, 3);
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.addYears(date34, (int) (short) 100);
        boolean boolean39 = org.apache.commons.lang.time.DateUtils.isSameInstant(date18, date34);
        java.lang.Class<?> wildcardClass40 = date18.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Feb 05 00:00:00 ICT 86401970");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Wed Dec 31 23:59:59 ICT 1969");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Wed Jan 21 23:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Tue Dec 31 23:59:59 ICT 2069");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 10, 5);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date7, (int) (byte) 0);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (short) -1, (int) (byte) 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (byte) 0, (int) (byte) 0);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMinutes(date7, (int) (byte) 0);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addYears(date7, 0);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addDays(date7, 1000);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addYears(date7, 1);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addMinutes(date23, 3600000);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator27 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date25, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 52 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Wed Sep 27 05:00:00 ICT 1972");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Fri Jan 01 05:00:00 ICT 1971");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Sat Nov 05 05:00:00 ICT 1977");
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addSeconds(date4, 5);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMinutes(date6, 10);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addWeeks(date13, 10);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addYears(date13, (int) '#');
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.round(date13, 0);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMonths(date13, 0);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "" };
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray25);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.add(date26, (int) (short) 10, 5);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date29, (int) (byte) 0);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.add(date29, (int) (short) -1, (int) (byte) 0);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addMinutes(date34, (int) (short) 1);
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.round(date36, 1);
        boolean boolean39 = org.apache.commons.lang.time.DateUtils.isSameInstant(date13, date38);
        boolean boolean40 = org.apache.commons.lang.time.DateUtils.isSameDay(date8, date38);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.round(date8, 1);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date42, 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:10:05 ICT 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Mar 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sat Jan 01 00:00:00 ICT 2005");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 05:01:00 ICT 1970");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray5);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray5);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addSeconds(date8, (int) 'a');
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addMonths(date8, (-1));
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.truncate(date8, (int) (byte) 10);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.add(date19, (int) (short) 10, 5);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addMonths(date22, (int) (short) 1);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addHours(date22, (int) '#');
        java.lang.String[] strArray30 = new java.lang.String[] { "", "" };
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray30);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.add(date31, (int) (short) 10, 5);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date34, (int) (byte) 0);
        java.lang.String[] strArray40 = new java.lang.String[] { "", "" };
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray40);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.add(date41, (int) (short) 10, 5);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date44, (int) (byte) 0);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.add(date44, (int) (short) -1, (int) (byte) 0);
        java.util.Date date51 = org.apache.commons.lang.time.DateUtils.addMinutes(date49, (int) (short) 1);
        boolean boolean52 = org.apache.commons.lang.time.DateUtils.isSameInstant(date34, date51);
        java.lang.String[] strArray56 = new java.lang.String[] { "", "" };
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray56);
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.add(date57, (int) (short) 10, 5);
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date60, (int) (byte) 0);
        java.util.Date date65 = org.apache.commons.lang.time.DateUtils.add(date60, (int) (short) -1, (int) (byte) 0);
        java.util.Date date67 = org.apache.commons.lang.time.DateUtils.addMinutes(date65, (int) (short) 1);
        boolean boolean68 = org.apache.commons.lang.time.DateUtils.isSameDay(date51, date65);
        boolean boolean69 = org.apache.commons.lang.time.DateUtils.isSameInstant(date26, date51);
        java.util.Date date71 = org.apache.commons.lang.time.DateUtils.addMonths(date51, 0);
        java.util.Date date73 = org.apache.commons.lang.time.DateUtils.addDays(date51, (int) (short) -1);
        java.util.Date date75 = org.apache.commons.lang.time.DateUtils.addSeconds(date51, 1);
        boolean boolean76 = org.apache.commons.lang.time.DateUtils.isSameDay(date8, date51);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 00:01:37 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Mon Dec 01 00:00:00 ICT 1969");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Sun Feb 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Fri Jan 02 16:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Thu Jan 01 05:01:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date65);
        org.junit.Assert.assertEquals(date65.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date67);
        org.junit.Assert.assertEquals(date67.toString(), "Thu Jan 01 05:01:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(date71);
        org.junit.Assert.assertEquals(date71.toString(), "Thu Jan 01 05:01:00 ICT 1970");
        org.junit.Assert.assertNotNull(date73);
        org.junit.Assert.assertEquals(date73.toString(), "Wed Dec 31 05:01:00 ICT 1969");
        org.junit.Assert.assertNotNull(date75);
        org.junit.Assert.assertEquals(date75.toString(), "Thu Jan 01 05:01:01 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addSeconds(date4, 5);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMinutes(date6, 10);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addWeeks(date13, 10);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addYears(date13, (int) '#');
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.round(date13, 0);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMonths(date13, 0);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "" };
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray25);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.add(date26, (int) (short) 10, 5);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date29, (int) (byte) 0);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.add(date29, (int) (short) -1, (int) (byte) 0);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addMinutes(date34, (int) (short) 1);
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.round(date36, 1);
        boolean boolean39 = org.apache.commons.lang.time.DateUtils.isSameInstant(date13, date38);
        boolean boolean40 = org.apache.commons.lang.time.DateUtils.isSameDay(date8, date38);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addDays(date8, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date44 = org.apache.commons.lang.time.DateUtils.round(date42, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field -1 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:10:05 ICT 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Mar 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sat Jan 01 00:00:00 ICT 2005");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 05:01:00 ICT 1970");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Fri Jan 02 00:10:05 ICT 1970");
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addWeeks(date4, 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addYears(date4, (int) '#');
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.round(date4, 0);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addHours(date10, (int) 'a');
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addMonths(date10, (int) (byte) 0);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addSeconds(date10, (int) (byte) -1);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addSeconds(date16, (int) '#');
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addSeconds(date16, (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Mar 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sat Jan 01 00:00:00 ICT 2005");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Wed Jan 05 01:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Fri Dec 31 23:59:59 ICT 544");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Sat Jan 01 00:00:34 ICT 543");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Fri Dec 31 23:59:59 ICT 544");
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (short) 10, 5);
        boolean boolean13 = org.apache.commons.lang.time.DateUtils.isSameDay(date4, date12);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 0, 10);
        java.util.Iterator iterator18 = org.apache.commons.lang.time.DateUtils.iterator(date4, 6);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "" };
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray22);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "" };
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray27);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.add(date28, (int) (short) 10, 5);
        boolean boolean32 = org.apache.commons.lang.time.DateUtils.isSameDay(date23, date31);
        boolean boolean33 = org.apache.commons.lang.time.DateUtils.isSameDay(date4, date23);
        java.lang.String[] strArray37 = new java.lang.String[] { "", "" };
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray37);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addWeeks(date38, 10);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addSeconds(date40, 1000);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.addHours(date42, 3600000);
        boolean boolean45 = org.apache.commons.lang.time.DateUtils.isSameDay(date4, date42);
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.addSeconds(date4, 0);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date47, (int) (short) 0);
        java.lang.String[] strArray53 = new java.lang.String[] { "", "" };
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray53);
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.addWeeks(date54, 10);
        java.util.Date date58 = org.apache.commons.lang.time.DateUtils.addYears(date54, (int) '#');
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.round(date54, 0);
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.addMonths(date54, 0);
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.addWeeks(date62, 0);
        java.util.Date date66 = org.apache.commons.lang.time.DateUtils.truncate(date62, (int) (short) 1);
        java.util.Date date68 = org.apache.commons.lang.time.DateUtils.addMinutes(date66, 2);
        boolean boolean69 = org.apache.commons.lang.time.DateUtils.isSameDay(date49, date68);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date71 = org.apache.commons.lang.time.DateUtils.truncate(date49, 3600000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 3600000 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Mar 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Thu Mar 12 00:16:40 ICT 1970");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Mon Nov 17 00:16:40 ICT 2380");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Thu Mar 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Sat Jan 01 00:00:00 ICT 2005");
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date68);
        org.junit.Assert.assertEquals(date68.toString(), "Thu Jan 01 00:02:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 10, 5);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date7, (int) (byte) 0);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (short) -1, (int) (byte) 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (byte) 0, (int) (byte) 0);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date7, (int) '4');
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addYears(date7, (int) (short) 1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date7, 10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Fri Jan 01 05:00:00 ICT 1971");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 05:00:00 ICT 1970");
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        java.util.Date date0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray4);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.add(date5, (int) (short) 10, 5);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date8, (int) (byte) 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.add(date8, (int) (short) -1, (int) (byte) 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addWeeks(date8, 60000);
        java.lang.String[] strArray19 = new java.lang.String[] { "", "" };
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray19);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.add(date20, (int) (short) 10, 5);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addMonths(date23, (int) (short) 1);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addHours(date23, (int) '#');
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addDays(date27, (int) (byte) 0);
        boolean boolean30 = org.apache.commons.lang.time.DateUtils.isSameDay(date8, date29);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date29, 2);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.addWeeks(date32, (int) 'a');
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.add(date32, 0, (int) '#');
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.truncate(date37, 2);
        java.lang.String[] strArray43 = new java.lang.String[] { "", "" };
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray43);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.addDays(date44, (int) '#');
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.addMonths(date46, 1);
        java.lang.String[] strArray52 = new java.lang.String[] { "", "" };
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray52);
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.addSeconds(date53, 5);
        boolean boolean56 = org.apache.commons.lang.time.DateUtils.isSameInstant(date46, date55);
        java.util.Date date58 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date46, (int) (short) 0);
        java.lang.String[] strArray62 = new java.lang.String[] { "", "" };
        java.util.Date date63 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray62);
        java.util.Date date65 = org.apache.commons.lang.time.DateUtils.addDays(date63, (int) '#');
        java.util.Date date67 = org.apache.commons.lang.time.DateUtils.addMonths(date65, 1);
        java.lang.String[] strArray71 = new java.lang.String[] { "", "" };
        java.util.Date date72 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray71);
        java.util.Date date74 = org.apache.commons.lang.time.DateUtils.addSeconds(date72, 5);
        boolean boolean75 = org.apache.commons.lang.time.DateUtils.isSameInstant(date65, date74);
        java.lang.String[] strArray79 = new java.lang.String[] { "", "" };
        java.util.Date date80 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray79);
        java.util.Date date82 = org.apache.commons.lang.time.DateUtils.addSeconds(date80, 5);
        java.util.Date date84 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date80, 1);
        boolean boolean85 = org.apache.commons.lang.time.DateUtils.isSameInstant(date65, date80);
        java.util.Date date88 = org.apache.commons.lang.time.DateUtils.add(date80, 3, 1000);
        java.util.Date date90 = org.apache.commons.lang.time.DateUtils.round(date88, (int) (byte) 10);
        java.util.Date date92 = org.apache.commons.lang.time.DateUtils.addDays(date88, 10);
        java.util.Date date94 = org.apache.commons.lang.time.DateUtils.addDays(date92, 1001);
        java.util.Date date96 = org.apache.commons.lang.time.DateUtils.addSeconds(date94, (int) (byte) 1);
        boolean boolean97 = org.apache.commons.lang.time.DateUtils.isSameDay(date58, date96);
        boolean boolean98 = org.apache.commons.lang.time.DateUtils.isSameInstant(date39, date96);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean99 = org.apache.commons.lang.time.DateUtils.isSameInstant(date0, date96);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Dec 04 05:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Sun Feb 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Fri Jan 02 16:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Fri Jan 02 16:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Nov 11 00:00:00 ICT 1971");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date65);
        org.junit.Assert.assertEquals(date65.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date67);
        org.junit.Assert.assertEquals(date67.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date72);
        org.junit.Assert.assertEquals(date72.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date74);
        org.junit.Assert.assertEquals(date74.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date80);
        org.junit.Assert.assertEquals(date80.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date82);
        org.junit.Assert.assertEquals(date82.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date84);
        org.junit.Assert.assertEquals(date84.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(date88);
        org.junit.Assert.assertEquals(date88.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date90);
        org.junit.Assert.assertEquals(date90.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date92);
        org.junit.Assert.assertEquals(date92.toString(), "Sun Mar 12 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date94);
        org.junit.Assert.assertEquals(date94.toString(), "Sun Dec 08 00:00:00 ICT 1991");
        org.junit.Assert.assertNotNull(date96);
        org.junit.Assert.assertEquals(date96.toString(), "Sun Dec 08 00:00:01 ICT 1991");
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addDays(date4, (int) '#');
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMonths(date6, 1);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date13, 5);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date15);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addSeconds(date21, 5);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date21, 1);
        boolean boolean26 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date21);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.add(date21, 3, 1000);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.round(date29, (int) (byte) 10);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addDays(date29, 10);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addWeeks(date29, (int) (byte) 10);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addMinutes(date35, 1000);
        java.lang.String[] strArray41 = new java.lang.String[] { "", "" };
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray41);
        java.lang.String[] strArray46 = new java.lang.String[] { "", "" };
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray46);
        java.util.Date date50 = org.apache.commons.lang.time.DateUtils.add(date47, (int) (short) 10, 5);
        boolean boolean51 = org.apache.commons.lang.time.DateUtils.isSameDay(date42, date50);
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.addMinutes(date42, (int) (byte) 100);
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.addDays(date53, 4);
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.addWeeks(date55, 1);
        boolean boolean58 = org.apache.commons.lang.time.DateUtils.isSameDay(date37, date55);
        java.util.Iterator iterator60 = org.apache.commons.lang.time.DateUtils.iterator(date37, 6);
        java.lang.String[] strArray64 = new java.lang.String[] { "", "" };
        java.util.Date date65 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray64);
        java.util.Date date68 = org.apache.commons.lang.time.DateUtils.add(date65, (int) (short) 10, 5);
        java.util.Date date70 = org.apache.commons.lang.time.DateUtils.addMonths(date68, (int) (short) 1);
        java.util.Date date72 = org.apache.commons.lang.time.DateUtils.addHours(date68, (int) '#');
        java.util.Date date74 = org.apache.commons.lang.time.DateUtils.addDays(date72, (int) (byte) 0);
        boolean boolean75 = org.apache.commons.lang.time.DateUtils.isSameDay(date37, date72);
        java.util.Date date77 = org.apache.commons.lang.time.DateUtils.addMinutes(date72, (int) (short) 100);
        java.util.Date date79 = org.apache.commons.lang.time.DateUtils.addYears(date77, (int) (short) 100);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Sun Mar 12 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu May 11 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu May 11 16:40:00 ICT 1989");
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Jan 01 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Mon Jan 05 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Mon Jan 12 01:40:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(iterator60);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date65);
        org.junit.Assert.assertEquals(date65.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date68);
        org.junit.Assert.assertEquals(date68.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Sun Feb 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date72);
        org.junit.Assert.assertEquals(date72.toString(), "Fri Jan 02 16:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date74);
        org.junit.Assert.assertEquals(date74.toString(), "Fri Jan 02 16:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(date77);
        org.junit.Assert.assertEquals(date77.toString(), "Fri Jan 02 17:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date79);
        org.junit.Assert.assertEquals(date79.toString(), "Thu Jan 02 17:40:00 ICT 2070");
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addSeconds(date4, 5);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date4, 1);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date4, 86400000);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addDays(date10, (int) (byte) 100);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addWeeks(date12, 0);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addMonths(date14, 3600000);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Fri Jan 02 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Sun Apr 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sun Apr 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Sun Apr 12 00:00:00 ICT 301970");
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addDays(date4, (int) '#');
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMonths(date6, 1);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date13, 5);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date15);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addSeconds(date21, 5);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date21, 1);
        boolean boolean26 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date21);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.add(date21, 3, 1000);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.round(date29, (int) (byte) 10);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addDays(date29, 10);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addWeeks(date29, (int) (byte) 10);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addDays(date35, (int) '4');
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addDays(date37, 86400000);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addHours(date37, 1000);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date41, (int) ' ');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Sun Mar 12 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu May 11 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Sun Jul 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Mon Aug 31 00:00:00 ICT 238544");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Sat Aug 12 16:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Sat Aug 12 16:00:00 ICT 1989");
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 10, 5);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addMonths(date7, (int) (short) 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addHours(date7, (int) '#');
        java.lang.String[] strArray15 = new java.lang.String[] { "", "" };
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addDays(date16, (int) '#');
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addMonths(date18, 1);
        java.lang.String[] strArray24 = new java.lang.String[] { "", "" };
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray24);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addSeconds(date25, 5);
        boolean boolean28 = org.apache.commons.lang.time.DateUtils.isSameInstant(date18, date27);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addDays(date18, 5);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "" };
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray34);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addSeconds(date35, 5);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date35, 1);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date35, 86400000);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.addDays(date35, 3600000);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.addDays(date35, 0);
        boolean boolean46 = org.apache.commons.lang.time.DateUtils.isSameDay(date18, date45);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date18, 2);
        boolean boolean49 = org.apache.commons.lang.time.DateUtils.isSameDay(date7, date48);
        java.util.Date date51 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date7, 3600000);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Sun Feb 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Fri Jan 02 16:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Tue Feb 10 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Fri Jan 02 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Tue Jun 20 00:00:00 ICT 11826");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Sun Feb 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Thu Jan 01 06:00:00 ICT 1970");
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addSeconds(date4, 5);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date4, 1);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date4, 86400000);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addDays(date10, (int) (byte) 100);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addWeeks(date12, 0);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addYears(date12, 4);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addSeconds(date12, 3);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addMonths(date18, 5);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.addSeconds(date20, 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Fri Jan 02 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Sun Apr 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sun Apr 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Fri Apr 12 00:00:00 ICT 1974");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Sun Apr 12 00:00:03 ICT 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Sat Sep 12 00:00:03 ICT 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Sat Sep 12 00:00:03 ICT 1970");
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addDays(date4, (int) '#');
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMonths(date6, 1);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "" };
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray17);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.add(date18, (int) (short) 10, 5);
        boolean boolean22 = org.apache.commons.lang.time.DateUtils.isSameDay(date13, date21);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addMinutes(date13, (int) (byte) 100);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addDays(date24, 4);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addSeconds(date24, (int) 'a');
        boolean boolean29 = org.apache.commons.lang.time.DateUtils.isSameDay(date8, date28);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator31 = org.apache.commons.lang.time.DateUtils.iterator(date8, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style -1 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Mon Jan 05 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 01:41:37 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (short) 10, 5);
        boolean boolean13 = org.apache.commons.lang.time.DateUtils.isSameDay(date4, date12);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 0, 10);
        java.util.Iterator iterator18 = org.apache.commons.lang.time.DateUtils.iterator(date4, 6);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "" };
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray22);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "" };
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray27);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.add(date28, (int) (short) 10, 5);
        boolean boolean32 = org.apache.commons.lang.time.DateUtils.isSameDay(date23, date31);
        boolean boolean33 = org.apache.commons.lang.time.DateUtils.isSameDay(date4, date23);
        java.lang.String[] strArray37 = new java.lang.String[] { "", "" };
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray37);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addWeeks(date38, 10);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addSeconds(date40, 1000);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.addHours(date42, 3600000);
        boolean boolean45 = org.apache.commons.lang.time.DateUtils.isSameDay(date4, date42);
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.addMinutes(date42, 5);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date42, 2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Mar 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Thu Mar 12 00:16:40 ICT 1970");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Mon Nov 17 00:16:40 ICT 2380");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Mar 12 00:21:40 ICT 1970");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Sun Mar 01 00:00:00 ICT 1970");
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 10, 5);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date7, (int) (byte) 0);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (short) -1, (int) (byte) 0);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addMinutes(date12, (int) (short) 1);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addYears(date12, 86400000);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "" };
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray25);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.add(date26, (int) (short) 10, 5);
        boolean boolean30 = org.apache.commons.lang.time.DateUtils.isSameDay(date21, date29);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.add(date21, (int) (short) 0, 10);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addMonths(date33, (int) '4');
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addYears(date35, (int) (short) 0);
        boolean boolean38 = org.apache.commons.lang.time.DateUtils.isSameDay(date16, date37);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date37, (int) (byte) 0);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addWeeks(date40, (int) (short) 100);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.round(date40, 2);
        java.lang.Class<?> wildcardClass45 = date40.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 05:01:00 ICT 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 05:00:00 ICT 86401970");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Wed May 01 00:00:00 ICT 1974");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Wed May 01 00:00:00 ICT 1974");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Sat Dec 02 00:00:00 ICT 542");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addDays(date4, (int) '#');
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMonths(date6, 1);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date13, 5);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date15);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addSeconds(date21, 5);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date21, 1);
        boolean boolean26 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date21);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.add(date21, 3, 1000);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date21, (int) (short) 0);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addMonths(date21, 3600000);
        java.lang.String[] strArray37 = new java.lang.String[] { "", "" };
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray37);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.add(date38, (int) (short) 10, 5);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date41, (int) (byte) 0);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.add(date41, (int) (short) -1, (int) (byte) 0);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.addWeeks(date41, 60000);
        java.util.Date date50 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date48, (int) (short) 1);
        java.lang.String[] strArray54 = new java.lang.String[] { "", "" };
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray54);
        java.lang.String[] strArray59 = new java.lang.String[] { "", "" };
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray59);
        java.util.Date date63 = org.apache.commons.lang.time.DateUtils.add(date60, (int) (short) 10, 5);
        boolean boolean64 = org.apache.commons.lang.time.DateUtils.isSameDay(date55, date63);
        java.util.Date date66 = org.apache.commons.lang.time.DateUtils.addSeconds(date55, (int) (byte) -1);
        boolean boolean67 = org.apache.commons.lang.time.DateUtils.isSameInstant(date50, date55);
        java.util.Date date69 = org.apache.commons.lang.time.DateUtils.addYears(date50, (int) '4');
        java.util.Date date71 = org.apache.commons.lang.time.DateUtils.addYears(date50, 10);
        boolean boolean72 = org.apache.commons.lang.time.DateUtils.isSameDay(date21, date50);
        java.util.Date date74 = org.apache.commons.lang.time.DateUtils.addDays(date21, (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:00:00 ICT 301970");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Dec 04 05:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Wed Jan 01 00:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Wed Dec 31 23:59:59 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(date69);
        org.junit.Assert.assertEquals(date69.toString(), "Fri Jan 01 00:00:00 ICT 3171");
        org.junit.Assert.assertNotNull(date71);
        org.junit.Assert.assertEquals(date71.toString(), "Tue Jan 01 00:00:00 ICT 3129");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(date74);
        org.junit.Assert.assertEquals(date74.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addWeeks(date4, 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMinutes(date6, 5);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addMonths(date6, (int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = date6.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Mar 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 12 00:05:00 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Wed Jul 12 00:00:00 ICT 1978");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 10, 5);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date7, (int) (byte) 0);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (short) -1, (int) (byte) 0);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addWeeks(date7, 60000);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.add(date19, (int) (short) 10, 5);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addMonths(date22, (int) (short) 1);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addHours(date22, (int) '#');
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addDays(date26, (int) (byte) 0);
        boolean boolean29 = org.apache.commons.lang.time.DateUtils.isSameDay(date7, date28);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date28, 2);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addWeeks(date31, (int) 'a');
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.add(date31, 0, (int) '#');
        java.lang.String[] strArray40 = new java.lang.String[] { "", "" };
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray40);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.addWeeks(date41, 10);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.addSeconds(date43, 1000);
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.round(date43, 5);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.truncate(date43, 0);
        boolean boolean50 = org.apache.commons.lang.time.DateUtils.isSameDay(date36, date43);
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.round(date36, (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Dec 04 05:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Sun Feb 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Fri Jan 02 16:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Fri Jan 02 16:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Nov 11 00:00:00 ICT 1971");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Mar 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Mar 12 00:16:40 ICT 1970");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Mar 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addDays(date4, (int) '#');
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMonths(date6, 1);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date13, 5);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addDays(date6, 5);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "" };
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray22);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addSeconds(date23, 5);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date23, 1);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date23, 86400000);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addDays(date23, 3600000);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addDays(date23, 0);
        boolean boolean34 = org.apache.commons.lang.time.DateUtils.isSameDay(date6, date33);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date6, 2);
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.truncate(date36, 2);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addYears(date36, 3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Tue Feb 10 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Fri Jan 02 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Tue Jun 20 00:00:00 ICT 11826");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Sun Feb 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Sun Feb 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Feb 01 00:00:00 ICT 1973");
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 10, 5);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date7, (int) (byte) 0);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (short) -1, (int) (byte) 0);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addMinutes(date12, (int) (short) 1);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addMinutes(date12, (int) '4');
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addMinutes(date16, (int) (short) 0);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "" };
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray22);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addSeconds(date23, 5);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addMinutes(date25, 10);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addMinutes(date27, (int) '4');
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addHours(date27, (int) (short) 1);
        java.lang.String[] strArray35 = new java.lang.String[] { "", "" };
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray35);
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.addWeeks(date36, 10);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addMinutes(date38, 5);
        boolean boolean41 = org.apache.commons.lang.time.DateUtils.isSameInstant(date27, date40);
        java.lang.String[] strArray45 = new java.lang.String[] { "", "" };
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray45);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.add(date46, (int) (short) 10, 5);
        java.util.Date date51 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date49, (int) (byte) 0);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.add(date49, (int) (short) -1, (int) (byte) 0);
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.addWeeks(date49, 60000);
        java.lang.String[] strArray60 = new java.lang.String[] { "", "" };
        java.util.Date date61 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray60);
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.add(date61, (int) (short) 10, 5);
        java.util.Date date66 = org.apache.commons.lang.time.DateUtils.addMonths(date64, (int) (short) 1);
        java.util.Date date68 = org.apache.commons.lang.time.DateUtils.addHours(date64, (int) '#');
        java.util.Date date70 = org.apache.commons.lang.time.DateUtils.addDays(date68, (int) (byte) 0);
        boolean boolean71 = org.apache.commons.lang.time.DateUtils.isSameDay(date49, date70);
        java.util.Date date73 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date70, 2);
        java.util.Date date75 = org.apache.commons.lang.time.DateUtils.addWeeks(date73, (int) 'a');
        java.util.Date date77 = org.apache.commons.lang.time.DateUtils.addSeconds(date75, (int) (byte) 100);
        boolean boolean78 = org.apache.commons.lang.time.DateUtils.isSameDay(date27, date77);
        java.util.Date date81 = org.apache.commons.lang.time.DateUtils.add(date77, (int) (byte) 1, 1000);
        boolean boolean82 = org.apache.commons.lang.time.DateUtils.isSameDay(date18, date77);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 05:01:00 ICT 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 05:52:00 ICT 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 05:52:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:10:05 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 01:02:05 ICT 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 01:10:05 ICT 1970");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Mar 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Mar 12 00:05:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Thu Dec 04 05:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date61);
        org.junit.Assert.assertEquals(date61.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Sun Feb 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date68);
        org.junit.Assert.assertEquals(date68.toString(), "Fri Jan 02 16:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Fri Jan 02 16:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(date73);
        org.junit.Assert.assertEquals(date73.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date75);
        org.junit.Assert.assertEquals(date75.toString(), "Thu Nov 11 00:00:00 ICT 1971");
        org.junit.Assert.assertNotNull(date77);
        org.junit.Assert.assertEquals(date77.toString(), "Thu Nov 11 00:01:40 ICT 1971");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(date81);
        org.junit.Assert.assertEquals(date81.toString(), "Mon Nov 11 00:01:40 ICT 2971");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.round(date0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 10, 5);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date7, (int) (byte) 0);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (short) -1, (int) (byte) 0);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addWeeks(date7, 60000);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date14, (int) (short) 1);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "" };
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray25);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.add(date26, (int) (short) 10, 5);
        boolean boolean30 = org.apache.commons.lang.time.DateUtils.isSameDay(date21, date29);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addSeconds(date21, (int) (byte) -1);
        boolean boolean33 = org.apache.commons.lang.time.DateUtils.isSameInstant(date16, date21);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addYears(date16, (int) '4');
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addYears(date16, 10);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addWeeks(date37, 0);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addSeconds(date39, 6);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date41, (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Dec 04 05:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Wed Jan 01 00:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Wed Dec 31 23:59:59 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Fri Jan 01 00:00:00 ICT 3171");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Tue Jan 01 00:00:00 ICT 3129");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Tue Jan 01 00:00:00 ICT 3129");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Tue Jan 01 00:00:06 ICT 3129");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Tue Jan 01 00:00:00 ICT 3129");
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 10, 5);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date7, (int) (byte) 0);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date7, (int) (short) 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addSeconds(date11, (int) (byte) 1);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "" };
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray17);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.add(date18, (int) (short) 10, 5);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date21, (int) (byte) 0);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.add(date21, (int) (short) -1, (int) (byte) 0);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addMinutes(date26, (int) (short) 1);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.round(date28, 1);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "" };
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray34);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addDays(date35, (int) '#');
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addMonths(date37, 1);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date37, 60000);
        boolean boolean42 = org.apache.commons.lang.time.DateUtils.isSameInstant(date28, date37);
        boolean boolean43 = org.apache.commons.lang.time.DateUtils.isSameInstant(date13, date28);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.truncate(date13, 2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date47 = org.apache.commons.lang.time.DateUtils.truncate(date45, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 6 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Jan 01 00:00:01 ICT 543");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 05:01:00 ICT 1970");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Feb 05 00:01:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Sat Jan 01 00:00:00 ICT 543");
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 10, 5);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addDays(date4, (int) '#');
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addMonths(date9, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addWeeks(date11, 60000);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMonths(date11, (int) 'a');
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMinutes(date15, 1000);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 08 00:00:00 ICT 3120");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Sun Mar 05 00:00:00 ICT 1978");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sun Mar 05 16:40:00 ICT 1978");
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 10, 5);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date7, (int) (byte) 0);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (short) -1, (int) (byte) 0);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addMinutes(date12, (int) (short) 1);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.round(date14, 1);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.add(date21, (int) (short) 10, 5);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date24, (int) (byte) 0);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.add(date24, (int) (short) -1, (int) (byte) 0);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.add(date24, (int) (byte) 0, (int) (byte) 0);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.addMinutes(date24, (int) (byte) 0);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addYears(date24, 0);
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.addMonths(date24, (int) 'a');
        boolean boolean39 = org.apache.commons.lang.time.DateUtils.isSameDay(date16, date38);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date41 = org.apache.commons.lang.time.DateUtils.truncate(date16, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 4 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 05:01:00 ICT 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Wed Feb 01 05:00:00 ICT 1978");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 10, 5);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addDays(date4, (int) '#');
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addDays(date9, (int) '4');
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addYears(date9, (int) (byte) 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date13, (int) (byte) 10);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.add(date15, 6, 60000);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date20 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date15, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 100 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Sun Mar 29 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Feb 05 00:00:10 ICT 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Sun May 16 00:00:10 ICT 2134");
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (short) 10, 5);
        boolean boolean13 = org.apache.commons.lang.time.DateUtils.isSameDay(date4, date12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMinutes(date4, (int) (byte) 100);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addHours(date4, 2);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMonths(date17, 0);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addYears(date17, (int) (byte) 10);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addMinutes(date17, (int) 'a');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 02:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 02:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Tue Jan 01 02:00:00 ICT 1980");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 03:37:00 ICT 1970");
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 10, 5);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addDays(date4, (int) '#');
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date4, 6, 6);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.truncate(date4, (int) (byte) 1);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addDays(date14, (int) (byte) 1);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addMinutes(date16, (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Wed Jan 07 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Fri Jan 02 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Fri Jan 02 00:10:00 ICT 1970");
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addWeeks(date4, 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addYears(date4, (int) '#');
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.round(date4, 0);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addMonths(date4, 0);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "" };
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray16);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.add(date17, (int) (short) 10, 5);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date20, (int) (byte) 0);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.add(date20, (int) (short) -1, (int) (byte) 0);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addMinutes(date25, (int) (short) 1);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.round(date27, 1);
        boolean boolean30 = org.apache.commons.lang.time.DateUtils.isSameInstant(date4, date29);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addSeconds(date29, 0);
        java.lang.String[] strArray41 = new java.lang.String[] { "", "" };
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray41);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray41);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray41);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray41);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray41);
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray41);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.addDays(date47, 2);
        java.lang.String[] strArray53 = new java.lang.String[] { "", "" };
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray53);
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.addDays(date54, (int) '#');
        java.util.Date date58 = org.apache.commons.lang.time.DateUtils.addMonths(date56, 1);
        java.lang.String[] strArray62 = new java.lang.String[] { "", "" };
        java.util.Date date63 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray62);
        java.util.Date date65 = org.apache.commons.lang.time.DateUtils.addSeconds(date63, 5);
        boolean boolean66 = org.apache.commons.lang.time.DateUtils.isSameInstant(date56, date65);
        java.util.Date date68 = org.apache.commons.lang.time.DateUtils.addMinutes(date56, (int) '4');
        java.util.Date date71 = org.apache.commons.lang.time.DateUtils.add(date56, 6, (int) (byte) 100);
        java.util.Date date73 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date56, 1001);
        boolean boolean74 = org.apache.commons.lang.time.DateUtils.isSameDay(date47, date56);
        java.util.Date date76 = org.apache.commons.lang.time.DateUtils.addYears(date47, 0);
        boolean boolean77 = org.apache.commons.lang.time.DateUtils.isSameInstant(date32, date47);
        java.lang.Class<?> wildcardClass78 = date47.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Mar 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sat Jan 01 00:00:00 ICT 2005");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 05:01:00 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Sat Jan 03 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date65);
        org.junit.Assert.assertEquals(date65.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(date68);
        org.junit.Assert.assertEquals(date68.toString(), "Thu Feb 05 00:52:00 ICT 1970");
        org.junit.Assert.assertNotNull(date71);
        org.junit.Assert.assertEquals(date71.toString(), "Sat May 16 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date73);
        org.junit.Assert.assertEquals(date73.toString(), "Thu Feb 05 00:00:01 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(date76);
        org.junit.Assert.assertEquals(date76.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addSeconds(date4, 5);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMinutes(date6, 10);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addWeeks(date13, 10);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addYears(date13, (int) '#');
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.round(date13, 0);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMonths(date13, 0);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "" };
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray25);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.add(date26, (int) (short) 10, 5);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date29, (int) (byte) 0);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.add(date29, (int) (short) -1, (int) (byte) 0);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addMinutes(date34, (int) (short) 1);
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.round(date36, 1);
        boolean boolean39 = org.apache.commons.lang.time.DateUtils.isSameInstant(date13, date38);
        boolean boolean40 = org.apache.commons.lang.time.DateUtils.isSameDay(date8, date38);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.round(date8, 1);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date8, 0);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.addSeconds(date8, 1);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date8, (int) (byte) -1);
        java.util.Date date50 = org.apache.commons.lang.time.DateUtils.addSeconds(date8, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator52 = org.apache.commons.lang.time.DateUtils.iterator(date8, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style -1 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:10:05 ICT 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Mar 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sat Jan 01 00:00:00 ICT 2005");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 05:01:00 ICT 1970");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 00:10:06 ICT 1970");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Jan 01 00:10:04 ICT 1970");
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Thu Jan 01 00:10:06 ICT 1970");
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 10, 5);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date7, (int) (byte) 0);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (short) -1, (int) (byte) 0);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addMinutes(date12, (int) (short) 1);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.round(date14, 1);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addWeeks(date16, (int) (short) 100);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.truncate(date16, 5);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.addWeeks(date20, (int) (short) -1);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addMinutes(date20, (int) (byte) -1);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addDays(date20, 6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 05:01:00 ICT 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Dec 02 00:00:00 ICT 1971");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Dec 25 00:00:00 ICT 1969");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Wed Dec 31 23:59:00 ICT 1969");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Wed Jan 07 00:00:00 ICT 1970");
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 10, 5);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date7, (int) (byte) 0);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (short) -1, (int) (byte) 0);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addWeeks(date7, 60000);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date14, (int) (short) 1);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.add(date16, 4, (int) (byte) 0);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date16, 3);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "" };
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray25);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.add(date26, (int) (short) 10, 5);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date29, (int) (byte) 0);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.add(date29, (int) (short) -1, (int) (byte) 0);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addMinutes(date34, (int) (short) 1);
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.addYears(date34, 86400000);
        java.lang.String[] strArray42 = new java.lang.String[] { "", "" };
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray42);
        java.lang.String[] strArray47 = new java.lang.String[] { "", "" };
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray47);
        java.util.Date date51 = org.apache.commons.lang.time.DateUtils.add(date48, (int) (short) 10, 5);
        boolean boolean52 = org.apache.commons.lang.time.DateUtils.isSameDay(date43, date51);
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.add(date43, (int) (short) 0, 10);
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.addMonths(date55, (int) '4');
        java.util.Date date59 = org.apache.commons.lang.time.DateUtils.addYears(date57, (int) (short) 0);
        boolean boolean60 = org.apache.commons.lang.time.DateUtils.isSameDay(date38, date59);
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date59, (int) (byte) 0);
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.addWeeks(date62, (int) (short) 100);
        boolean boolean65 = org.apache.commons.lang.time.DateUtils.isSameInstant(date16, date64);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Dec 04 05:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Wed Jan 01 00:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Wed Jan 01 00:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Wed Jan 01 00:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 05:01:00 ICT 1970");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 05:00:00 ICT 86401970");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Wed May 01 00:00:00 ICT 1974");
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Wed May 01 00:00:00 ICT 1974");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Sat Dec 02 00:00:00 ICT 542");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 10, 5);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addDays(date4, (int) '#');
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addMonths(date9, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.addWeeks(date11, 60000);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "" };
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray17);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "" };
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray22);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.add(date23, (int) (short) 10, 5);
        boolean boolean27 = org.apache.commons.lang.time.DateUtils.isSameDay(date18, date26);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addMinutes(date18, (int) (byte) 100);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addDays(date29, 4);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addWeeks(date31, 1);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addMinutes(date33, (int) (short) -1);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addMonths(date33, 2);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addYears(date37, (int) 'a');
        java.lang.String[] strArray43 = new java.lang.String[] { "", "" };
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray43);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.addDays(date44, (int) '#');
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.addMonths(date46, 1);
        java.lang.String[] strArray52 = new java.lang.String[] { "", "" };
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray52);
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.addSeconds(date53, 5);
        boolean boolean56 = org.apache.commons.lang.time.DateUtils.isSameInstant(date46, date55);
        java.util.Date date58 = org.apache.commons.lang.time.DateUtils.addMinutes(date46, (int) '4');
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.addDays(date58, 6);
        boolean boolean61 = org.apache.commons.lang.time.DateUtils.isSameInstant(date39, date60);
        boolean boolean62 = org.apache.commons.lang.time.DateUtils.isSameInstant(date11, date60);
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.truncate(date60, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date66 = org.apache.commons.lang.time.DateUtils.truncate(date60, 60000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 60000 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 08 00:00:00 ICT 3120");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Mon Jan 05 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Mon Jan 12 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Mon Jan 12 01:39:00 ICT 1970");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Mar 12 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Sat Mar 12 01:40:00 ICT 2067");
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Thu Feb 05 00:52:00 ICT 1970");
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Wed Feb 11 00:52:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Wed Feb 11 00:00:00 ICT 1970");
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addWeeks(date4, 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addYears(date4, (int) '#');
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.round(date4, 0);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addMonths(date4, 0);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addWeeks(date12, 0);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addMinutes(date12, (int) (byte) -1);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addDays(date16, (int) (short) 0);
        java.lang.Class<?> wildcardClass19 = date16.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Mar 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sat Jan 01 00:00:00 ICT 2005");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Wed Dec 31 23:59:00 ICT 1969");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Wed Dec 31 23:59:00 ICT 1969");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray7);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray7);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray7);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray7);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (short) 10, 5);
        boolean boolean13 = org.apache.commons.lang.time.DateUtils.isSameDay(date4, date12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMinutes(date4, (int) (byte) 100);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date15, 4);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addWeeks(date17, 1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMinutes(date19, (int) (short) -1);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addMonths(date19, 2);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addYears(date23, (int) 'a');
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addDays(date23, (int) (short) 1);
        java.lang.String[] strArray31 = new java.lang.String[] { "", "" };
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray31);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "" };
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray36);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.add(date37, (int) (short) 10, 5);
        boolean boolean41 = org.apache.commons.lang.time.DateUtils.isSameDay(date32, date40);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.addSeconds(date32, (int) (byte) -1);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.addWeeks(date43, 3);
        java.lang.String[] strArray49 = new java.lang.String[] { "", "" };
        java.util.Date date50 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray49);
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.add(date50, (int) (short) 10, 5);
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.addDays(date50, (int) '#');
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.addMonths(date55, 0);
        boolean boolean58 = org.apache.commons.lang.time.DateUtils.isSameDay(date43, date57);
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.addSeconds(date43, 1001);
        boolean boolean61 = org.apache.commons.lang.time.DateUtils.isSameDay(date23, date43);
        java.util.Date date63 = org.apache.commons.lang.time.DateUtils.round(date23, (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Mon Jan 05 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon Jan 12 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Mon Jan 12 01:39:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Mar 12 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Sat Mar 12 01:40:00 ICT 2067");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Fri Mar 13 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Wed Dec 31 23:59:59 ICT 1969");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Wed Jan 21 23:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Thu Jan 01 00:16:40 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Sat Jan 01 00:00:00 ICT 543");
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addDays(date4, (int) '#');
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMonths(date6, 1);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date13, 5);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date6, 1);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.truncate(date6, 5);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date6, (int) (short) 1);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addMinutes(date6, (int) (byte) 10);
        java.util.Iterator iterator26 = org.apache.commons.lang.time.DateUtils.iterator(date24, 6);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addHours(date24, 3600000);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addMinutes(date28, 2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Feb 05 00:10:00 ICT 1970");
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Mon Oct 13 00:10:00 ICT 2380");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Mon Oct 13 00:12:00 ICT 2380");
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addDays(date4, (int) '#');
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addSeconds(date4, 0);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addYears(date4, 1001);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.add(date10, 1001, 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.truncate(date10, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator17 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date15, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The range style 1001 is not valid.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Tue Jan 01 00:00:00 ICT 2971");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Tue Jan 01 00:00:00 ICT 2971");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Tue Jan 01 00:00:00 ICT 2971");
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (short) 10, 5);
        boolean boolean13 = org.apache.commons.lang.time.DateUtils.isSameDay(date4, date12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date4, (int) (byte) -1);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addWeeks(date15, 3);
        java.lang.String[] strArray21 = new java.lang.String[] { "", "" };
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray21);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.add(date22, (int) (short) 10, 5);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.addDays(date22, (int) '#');
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addMonths(date27, 0);
        boolean boolean30 = org.apache.commons.lang.time.DateUtils.isSameDay(date15, date29);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addSeconds(date15, 1001);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.addDays(date32, (int) (byte) 0);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date32, (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Wed Dec 31 23:59:59 ICT 1969");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Wed Jan 21 23:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 00:16:40 ICT 1970");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:16:40 ICT 1970");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 00:16:40 ICT 1970");
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("hi!", strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern character 'i'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "hi!", "" });
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 10, 5);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date7, (int) (byte) 0);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (short) -1, (int) (byte) 0);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addMinutes(date12, (int) (short) 1);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.round(date14, 1);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addWeeks(date16, (int) (short) 100);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addDays(date16, (int) 'a');
        java.lang.Class<?> wildcardClass21 = date20.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 05:01:00 ICT 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Dec 02 00:00:00 ICT 1971");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Wed Apr 08 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (short) 10, 5);
        boolean boolean13 = org.apache.commons.lang.time.DateUtils.isSameDay(date4, date12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMinutes(date4, (int) (byte) 100);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date15, 4);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addWeeks(date17, 1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMinutes(date19, (int) (short) -1);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addWeeks(date21, (int) (byte) 1);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "" };
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray27);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addDays(date28, (int) '#');
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addMonths(date30, 1);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "" };
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray36);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addSeconds(date37, 5);
        boolean boolean40 = org.apache.commons.lang.time.DateUtils.isSameInstant(date30, date39);
        java.lang.String[] strArray44 = new java.lang.String[] { "", "" };
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray44);
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.addSeconds(date45, 5);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date45, 1);
        boolean boolean50 = org.apache.commons.lang.time.DateUtils.isSameInstant(date30, date45);
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.add(date45, 3, 1000);
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.round(date53, (int) (byte) 10);
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.addYears(date55, 1);
        boolean boolean58 = org.apache.commons.lang.time.DateUtils.isSameInstant(date21, date55);
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.addDays(date21, (int) '4');
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.addWeeks(date60, (int) '4');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Mon Jan 05 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon Jan 12 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Mon Jan 12 01:39:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Mon Jan 19 01:39:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Fri Mar 02 00:00:00 ICT 1990");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Thu Mar 05 01:39:00 ICT 1970");
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Thu Mar 04 01:39:00 ICT 1971");
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addWeeks(date4, 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addSeconds(date6, 1000);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.round(date6, 5);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addYears(date10, 6);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addYears(date10, 4);
        java.lang.Class<?> wildcardClass15 = date14.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Mar 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 12 00:16:40 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Mar 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Fri Mar 12 00:00:00 ICT 1976");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Tue Mar 12 00:00:00 ICT 1974");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addSeconds(date4, 5);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMinutes(date6, 10);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addYears(date8, (int) (byte) 10);
        java.util.Iterator iterator12 = org.apache.commons.lang.time.DateUtils.iterator(date8, 6);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.add(date8, (int) (short) 10, (int) (byte) 100);
        java.lang.String[] strArray19 = new java.lang.String[] { "", "" };
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray19);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.addDays(date20, (int) '#');
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addMonths(date22, 1);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "" };
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray28);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addDays(date29, (int) '#');
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addMonths(date31, 1);
        java.lang.String[] strArray37 = new java.lang.String[] { "", "" };
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray37);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addSeconds(date38, 5);
        boolean boolean41 = org.apache.commons.lang.time.DateUtils.isSameInstant(date31, date40);
        java.lang.String[] strArray45 = new java.lang.String[] { "", "" };
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray45);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.addSeconds(date46, 5);
        java.util.Date date50 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date46, 1);
        boolean boolean51 = org.apache.commons.lang.time.DateUtils.isSameInstant(date31, date46);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.add(date46, 3, 1000);
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.round(date54, (int) (byte) 10);
        java.util.Date date58 = org.apache.commons.lang.time.DateUtils.addDays(date54, 10);
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.addWeeks(date54, (int) (byte) 10);
        boolean boolean61 = org.apache.commons.lang.time.DateUtils.isSameDay(date22, date54);
        java.util.Date date63 = org.apache.commons.lang.time.DateUtils.addMonths(date22, 1);
        java.lang.String[] strArray67 = new java.lang.String[] { "", "" };
        java.util.Date date68 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray67);
        java.util.Date date70 = org.apache.commons.lang.time.DateUtils.addSeconds(date68, 5);
        boolean boolean71 = org.apache.commons.lang.time.DateUtils.isSameDay(date22, date70);
        java.lang.String[] strArray75 = new java.lang.String[] { "", "" };
        java.util.Date date76 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray75);
        java.util.Date date78 = org.apache.commons.lang.time.DateUtils.addDays(date76, (int) '#');
        java.util.Date date80 = org.apache.commons.lang.time.DateUtils.addMonths(date78, 1);
        java.lang.String[] strArray84 = new java.lang.String[] { "", "" };
        java.util.Date date85 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray84);
        java.util.Date date87 = org.apache.commons.lang.time.DateUtils.addSeconds(date85, 5);
        boolean boolean88 = org.apache.commons.lang.time.DateUtils.isSameInstant(date78, date87);
        java.util.Date date90 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date78, 1);
        java.util.Date date92 = org.apache.commons.lang.time.DateUtils.addMonths(date78, (int) '4');
        boolean boolean93 = org.apache.commons.lang.time.DateUtils.isSameDay(date22, date92);
        boolean boolean94 = org.apache.commons.lang.time.DateUtils.isSameInstant(date15, date92);
        java.util.Date date96 = org.apache.commons.lang.time.DateUtils.addMonths(date15, 4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:10:05 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Tue Jan 01 00:10:05 ICT 1980");
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Mon Jan 05 04:10:05 ICT 1970");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Sun Mar 12 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Thu May 11 00:00:00 ICT 1989");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date68);
        org.junit.Assert.assertEquals(date68.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertArrayEquals(strArray75, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date76);
        org.junit.Assert.assertEquals(date76.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date78);
        org.junit.Assert.assertEquals(date78.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date80);
        org.junit.Assert.assertEquals(date80.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date85);
        org.junit.Assert.assertEquals(date85.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date87);
        org.junit.Assert.assertEquals(date87.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(date90);
        org.junit.Assert.assertEquals(date90.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date92);
        org.junit.Assert.assertEquals(date92.toString(), "Wed Jun 05 00:00:00 ICT 1974");
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(date96);
        org.junit.Assert.assertEquals(date96.toString(), "Tue May 05 04:10:05 ICT 1970");
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 10, 5);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addMonths(date7, (int) (short) 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addDays(date7, 0);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.round(date11, 0);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date11, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date17 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date15, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 52 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Sun Feb 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 04:59:59 ICT 1970");
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addDays(date4, (int) '#');
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMonths(date6, 1);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date13, 5);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date15);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addSeconds(date21, 5);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date21, 1);
        boolean boolean26 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date21);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.add(date21, 3, 1000);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.round(date29, (int) (byte) 10);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addDays(date29, 10);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addDays(date33, 1001);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.truncate(date33, (int) (byte) 0);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addYears(date33, (int) (short) 10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Sun Mar 12 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Sun Dec 08 00:00:00 ICT 1991");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Fri Mar 12 00:00:00 ICT 1999");
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addDays(date4, (int) '#');
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMonths(date6, 1);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date13, 5);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date15);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addSeconds(date21, 5);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date21, 1);
        boolean boolean26 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date21);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.add(date21, 3, 1000);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.round(date29, (int) (byte) 10);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addDays(date29, 10);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addDays(date33, 1001);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addSeconds(date35, (int) (byte) 1);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addSeconds(date37, (int) (short) -1);
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addMonths(date37, (int) (short) -1);
        java.lang.String[] strArray45 = new java.lang.String[] { "", "" };
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray45);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.addDays(date46, (int) '#');
        java.util.Date date50 = org.apache.commons.lang.time.DateUtils.addMonths(date48, 1);
        java.lang.String[] strArray54 = new java.lang.String[] { "", "" };
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray54);
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.addSeconds(date55, 5);
        boolean boolean58 = org.apache.commons.lang.time.DateUtils.isSameInstant(date48, date57);
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.addYears(date48, 86400000);
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.addMonths(date48, 10);
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.addMonths(date48, 6);
        java.util.Date date66 = org.apache.commons.lang.time.DateUtils.truncate(date64, (int) (byte) 0);
        java.util.Date date68 = org.apache.commons.lang.time.DateUtils.addMinutes(date66, (int) '#');
        java.util.Date date70 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date68, (int) (short) -1);
        java.util.Date date72 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date70, 0);
        boolean boolean73 = org.apache.commons.lang.time.DateUtils.isSameDay(date37, date70);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Sun Mar 12 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Sun Dec 08 00:00:00 ICT 1991");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Sun Dec 08 00:00:01 ICT 1991");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Sun Dec 08 00:00:00 ICT 1991");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Fri Nov 08 00:00:01 ICT 1991");
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Thu Feb 05 00:00:00 ICT 86401970");
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Sat Dec 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Wed Aug 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date68);
        org.junit.Assert.assertEquals(date68.toString(), "Sat Jan 01 00:35:00 ICT 543");
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Sat Jan 01 00:34:59 ICT 543");
        org.junit.Assert.assertNotNull(date72);
        org.junit.Assert.assertEquals(date72.toString(), "Sat Jan 01 00:34:59 ICT 543");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (short) 10, 5);
        boolean boolean13 = org.apache.commons.lang.time.DateUtils.isSameDay(date4, date12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date4, (int) (byte) -1);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addWeeks(date4, 86400000);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addHours(date17, (int) (byte) 1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMinutes(date19, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Wed Dec 31 23:59:59 ICT 1969");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Feb 28 00:00:00 ICT 1657856");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Feb 28 01:00:00 ICT 1657856");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Feb 28 01:01:00 ICT 1657856");
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addDays(date4, (int) '#');
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMonths(date6, 1);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date13, 5);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date6, 1);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date6, 1);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date6, (int) (byte) 1);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.round(date22, 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addSeconds(date4, 5);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date4, 1);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date4, 86400000);
        java.lang.String[] strArray14 = new java.lang.String[] { "", "" };
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray14);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addSeconds(date15, 5);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date15, 1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date15, 86400000);
        boolean boolean22 = org.apache.commons.lang.time.DateUtils.isSameInstant(date10, date15);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date10, (int) 'a');
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addHours(date24, 6);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addSeconds(date24, (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Fri Jan 02 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Fri Jan 02 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Fri Jan 02 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Fri Jan 02 06:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Fri Jan 02 00:00:01 ICT 1970");
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addSeconds(date4, 5);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMinutes(date6, 10);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addMinutes(date8, (int) '4');
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addWeeks(date10, (int) (short) 0);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date10, (int) (byte) -1);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.add(date10, 6, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date19 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) 6, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: Could not truncate 6");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:10:05 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 01:02:05 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 01:02:05 ICT 1970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 01:02:04 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sat Apr 11 01:02:05 ICT 1970");
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "" };
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray5);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray5);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray5);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addSeconds(date8, (int) 'a');
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.addMonths(date8, (-1));
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.truncate(date8, (int) (byte) 10);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.addSeconds(date14, 6);
        java.util.Iterator iterator18 = org.apache.commons.lang.time.DateUtils.iterator((java.lang.Object) date14, 4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 00:01:37 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Mon Dec 01 00:00:00 ICT 1969");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:06 ICT 1970");
        org.junit.Assert.assertNotNull(iterator18);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 10, 5);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date7, (int) (byte) 0);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (short) -1, (int) (byte) 0);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addWeeks(date7, 60000);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date14, (int) (short) 1);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "" };
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray25);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.add(date26, (int) (short) 10, 5);
        boolean boolean30 = org.apache.commons.lang.time.DateUtils.isSameDay(date21, date29);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addSeconds(date21, (int) (byte) -1);
        boolean boolean33 = org.apache.commons.lang.time.DateUtils.isSameInstant(date16, date21);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date21, 6);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addMonths(date35, (int) (short) 0);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addWeeks(date37, 3);
        java.lang.String[] strArray43 = new java.lang.String[] { "", "" };
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray43);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.addSeconds(date44, 5);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.addHours(date46, (int) (byte) 0);
        java.util.Date date50 = org.apache.commons.lang.time.DateUtils.truncate(date48, 10);
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.addSeconds(date48, 1000);
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.add(date52, (int) (short) 0, (-1));
        boolean boolean56 = org.apache.commons.lang.time.DateUtils.isSameDay(date39, date55);
        java.util.Date date58 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date55, (int) '#');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Dec 04 05:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Wed Jan 01 00:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Wed Dec 31 23:59:59 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 22 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Thu Jan 01 00:16:45 ICT 1970");
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Sun Jan 01 00:16:45 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(date58);
        org.junit.Assert.assertEquals(date58.toString(), "Sun Jan 01 00:16:45 ICT 1970");
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addDays(date4, (int) '#');
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMonths(date6, 1);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date13, 5);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addDays(date6, 5);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addWeeks(date6, 86400000);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.addHours(date20, 0);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addDays(date20, 1001);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addHours(date20, 5);
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.addMinutes(date26, (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Tue Feb 10 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Apr 03 00:00:00 ICT 1657856");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Apr 03 00:00:00 ICT 1657856");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Dec 30 00:00:00 ICT 1657858");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Apr 03 05:00:00 ICT 1657856");
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Apr 03 04:59:00 ICT 1657856");
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        java.util.Date date0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "" };
        java.util.Date date5 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray4);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.addDays(date5, (int) '#');
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addMonths(date7, 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date7, 1001);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "" };
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray17);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray17);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray17);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.addWeeks(date20, (int) (short) 100);
        boolean boolean23 = org.apache.commons.lang.time.DateUtils.isSameDay(date11, date22);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addSeconds(date11, 86400000);
        java.lang.String[] strArray40 = new java.lang.String[] { "", "" };
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray40);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray40);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray40);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray40);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray40);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray40);
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray40);
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray40);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray40);
        java.util.Date date50 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray40);
        java.util.Date date51 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray40);
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray40);
        boolean boolean53 = org.apache.commons.lang.time.DateUtils.isSameDay(date11, date52);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean54 = org.apache.commons.lang.time.DateUtils.isSameInstant(date0, date52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Feb 05 00:00:01 ICT 1970");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Dec 02 00:00:00 ICT 1971");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Wed Nov 01 00:00:01 ICT 1972");
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addWeeks(date4, 10);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMinutes(date6, 5);
        java.util.Date date10 = org.apache.commons.lang.time.DateUtils.addSeconds(date6, (int) (byte) -1);
        java.lang.Class<?> wildcardClass11 = date6.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Mar 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 12 00:05:00 ICT 1970");
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Wed Mar 11 23:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 10, 5);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date7, (int) (byte) 0);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date7, (int) (short) -1, (int) (byte) 0);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addWeeks(date7, 60000);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date14, (int) (short) 1);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "" };
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray25);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.add(date26, (int) (short) 10, 5);
        boolean boolean30 = org.apache.commons.lang.time.DateUtils.isSameDay(date21, date29);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addSeconds(date21, (int) (byte) -1);
        boolean boolean33 = org.apache.commons.lang.time.DateUtils.isSameInstant(date16, date21);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addYears(date16, (int) '4');
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.addYears(date16, 10);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addWeeks(date37, 0);
        java.util.Iterator iterator41 = org.apache.commons.lang.time.DateUtils.iterator(date37, 4);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.addYears(date37, (int) (short) -1);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.addSeconds(date43, 3);
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date43, 0);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.addMinutes(date43, 6);
        java.util.Date date51 = org.apache.commons.lang.time.DateUtils.addMinutes(date43, 1000);
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.addMonths(date43, 1000);
        java.lang.Class<?> wildcardClass54 = date53.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Dec 04 05:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Wed Jan 01 00:00:00 ICT 3119");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Wed Dec 31 23:59:59 ICT 1969");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Fri Jan 01 00:00:00 ICT 3171");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Tue Jan 01 00:00:00 ICT 3129");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Tue Jan 01 00:00:00 ICT 3129");
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Sun Jan 01 00:00:00 ICT 3128");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Sun Jan 01 00:00:03 ICT 3128");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Sun Jan 01 00:06:00 ICT 3128");
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Sun Jan 01 16:40:00 ICT 3128");
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Sun May 01 00:00:00 ICT 3211");
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (short) 10, 5);
        boolean boolean13 = org.apache.commons.lang.time.DateUtils.isSameDay(date4, date12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMinutes(date4, (int) (byte) 100);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date15, 4);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addWeeks(date17, 1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMinutes(date19, (int) (short) -1);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addWeeks(date21, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date25 = org.apache.commons.lang.time.DateUtils.truncate(date23, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field 100 is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Mon Jan 05 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon Jan 12 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Mon Jan 12 01:39:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Mon Jan 19 01:39:00 ICT 1970");
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addSeconds(date4, 5);
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMinutes(date6, 10);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addWeeks(date13, 10);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addYears(date13, (int) '#');
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.round(date13, 0);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMonths(date13, 0);
        java.lang.String[] strArray25 = new java.lang.String[] { "", "" };
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray25);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.add(date26, (int) (short) 10, 5);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date29, (int) (byte) 0);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.add(date29, (int) (short) -1, (int) (byte) 0);
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.addMinutes(date34, (int) (short) 1);
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.round(date36, 1);
        boolean boolean39 = org.apache.commons.lang.time.DateUtils.isSameInstant(date13, date38);
        boolean boolean40 = org.apache.commons.lang.time.DateUtils.isSameDay(date8, date38);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addDays(date8, (int) (byte) 1);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.addWeeks(date42, 6);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.addHours(date44, (int) '4');
        java.util.Date date48 = org.apache.commons.lang.time.DateUtils.addDays(date46, (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:10:05 ICT 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Mar 12 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Sat Jan 01 00:00:00 ICT 2005");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 05:01:00 ICT 1970");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Fri Jan 02 00:10:05 ICT 1970");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Fri Feb 13 00:10:05 ICT 1970");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Sun Feb 15 04:10:05 ICT 1970");
        org.junit.Assert.assertNotNull(date48);
        org.junit.Assert.assertEquals(date48.toString(), "Sun Feb 15 04:10:05 ICT 1970");
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addDays(date4, (int) '#');
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMonths(date6, 1);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addDays(date13, (int) '#');
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addMonths(date15, 1);
        java.lang.String[] strArray21 = new java.lang.String[] { "", "" };
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray21);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addSeconds(date22, 5);
        boolean boolean25 = org.apache.commons.lang.time.DateUtils.isSameInstant(date15, date24);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "" };
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray29);
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addSeconds(date30, 5);
        java.util.Date date34 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date30, 1);
        boolean boolean35 = org.apache.commons.lang.time.DateUtils.isSameInstant(date15, date30);
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.add(date30, 3, 1000);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.round(date38, (int) (byte) 10);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addDays(date38, 10);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.addWeeks(date38, (int) (byte) 10);
        boolean boolean45 = org.apache.commons.lang.time.DateUtils.isSameDay(date6, date38);
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.addMonths(date6, 1);
        java.lang.String[] strArray51 = new java.lang.String[] { "", "" };
        java.util.Date date52 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray51);
        java.lang.String[] strArray56 = new java.lang.String[] { "", "" };
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray56);
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.add(date57, (int) (short) 10, 5);
        boolean boolean61 = org.apache.commons.lang.time.DateUtils.isSameDay(date52, date60);
        java.util.Date date63 = org.apache.commons.lang.time.DateUtils.addMinutes(date52, (int) (byte) 100);
        java.util.Date date65 = org.apache.commons.lang.time.DateUtils.addDays(date63, 4);
        java.util.Date date67 = org.apache.commons.lang.time.DateUtils.addSeconds(date63, (int) 'a');
        java.util.Date date69 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date67, (int) (short) 100);
        boolean boolean70 = org.apache.commons.lang.time.DateUtils.isSameDay(date47, date67);
        java.util.Date date72 = org.apache.commons.lang.time.DateUtils.addMinutes(date47, (int) (byte) 10);
        java.util.Date date74 = org.apache.commons.lang.time.DateUtils.addSeconds(date72, 6);
        java.util.Date date76 = org.apache.commons.lang.time.DateUtils.addDays(date74, (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date34);
        org.junit.Assert.assertEquals(date34.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Sun Mar 12 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu May 11 00:00:00 ICT 1989");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date52);
        org.junit.Assert.assertEquals(date52.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Thu Jan 01 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date65);
        org.junit.Assert.assertEquals(date65.toString(), "Mon Jan 05 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date67);
        org.junit.Assert.assertEquals(date67.toString(), "Thu Jan 01 01:41:37 ICT 1970");
        org.junit.Assert.assertNotNull(date69);
        org.junit.Assert.assertEquals(date69.toString(), "Thu Jan 01 01:41:37 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(date72);
        org.junit.Assert.assertEquals(date72.toString(), "Thu Mar 05 00:10:00 ICT 1970");
        org.junit.Assert.assertNotNull(date74);
        org.junit.Assert.assertEquals(date74.toString(), "Thu Mar 05 00:10:06 ICT 1970");
        org.junit.Assert.assertNotNull(date76);
        org.junit.Assert.assertEquals(date76.toString(), "Thu Mar 05 00:10:06 ICT 1970");
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (short) 10, 5);
        boolean boolean13 = org.apache.commons.lang.time.DateUtils.isSameDay(date4, date12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addMinutes(date4, (int) (byte) 100);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addDays(date15, 4);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addWeeks(date17, 1);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addMinutes(date19, (int) (short) -1);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addWeeks(date21, (int) (byte) 1);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "" };
        java.util.Date date28 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray27);
        java.util.Date date30 = org.apache.commons.lang.time.DateUtils.addDays(date28, (int) '#');
        java.util.Date date32 = org.apache.commons.lang.time.DateUtils.addMonths(date30, 1);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "" };
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray36);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addSeconds(date37, 5);
        boolean boolean40 = org.apache.commons.lang.time.DateUtils.isSameInstant(date30, date39);
        java.lang.String[] strArray44 = new java.lang.String[] { "", "" };
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray44);
        java.util.Date date47 = org.apache.commons.lang.time.DateUtils.addSeconds(date45, 5);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date45, 1);
        boolean boolean50 = org.apache.commons.lang.time.DateUtils.isSameInstant(date30, date45);
        java.util.Date date53 = org.apache.commons.lang.time.DateUtils.add(date45, 3, 1000);
        java.util.Date date55 = org.apache.commons.lang.time.DateUtils.round(date53, (int) (byte) 10);
        java.util.Date date57 = org.apache.commons.lang.time.DateUtils.addYears(date55, 1);
        boolean boolean58 = org.apache.commons.lang.time.DateUtils.isSameInstant(date21, date55);
        java.util.Date date60 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date21, (int) (short) 1);
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date21, 100);
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.addHours(date21, (int) (short) 1);
        java.lang.String[] strArray68 = new java.lang.String[] { "", "" };
        java.util.Date date69 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray68);
        boolean boolean70 = org.apache.commons.lang.time.DateUtils.isSameDay(date64, date69);
        java.util.Date date72 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date64, (int) (byte) 100);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Mon Jan 05 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Mon Jan 12 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Mon Jan 12 01:39:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Mon Jan 19 01:39:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date47);
        org.junit.Assert.assertEquals(date47.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(date53);
        org.junit.Assert.assertEquals(date53.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date57);
        org.junit.Assert.assertEquals(date57.toString(), "Fri Mar 02 00:00:00 ICT 1990");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Mon Jan 12 01:39:00 ICT 1970");
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Mon Jan 12 02:39:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date69);
        org.junit.Assert.assertEquals(date69.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(date72);
        org.junit.Assert.assertEquals(date72.toString(), "Mon Jan 12 02:39:00 ICT 1970");
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addDays(date4, (int) '#');
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMonths(date6, 1);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date13, 5);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date15);
        java.lang.String[] strArray20 = new java.lang.String[] { "", "" };
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray20);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addSeconds(date21, 5);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date21, 1);
        boolean boolean26 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date21);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.add(date21, 3, 1000);
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.round(date29, (int) (byte) 10);
        java.util.Date date33 = org.apache.commons.lang.time.DateUtils.addDays(date29, 10);
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.addWeeks(date29, (int) (short) 1);
        java.util.Date date37 = org.apache.commons.lang.time.DateUtils.truncate(date35, (int) (byte) 1);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.addDays(date35, (int) '4');
        java.util.Date date41 = org.apache.commons.lang.time.DateUtils.addYears(date35, 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Mar 02 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Sun Mar 12 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Mar 09 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Sun Jan 01 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Sun Apr 30 00:00:00 ICT 1989");
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Fri Mar 09 00:00:00 ICT 1990");
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (short) 10, 5);
        boolean boolean13 = org.apache.commons.lang.time.DateUtils.isSameDay(date4, date12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date4, (int) (byte) -1);
        java.util.Date date17 = org.apache.commons.lang.time.DateUtils.addWeeks(date15, 3);
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.addYears(date15, (int) (short) 100);
        java.util.Date date21 = org.apache.commons.lang.time.DateUtils.addSeconds(date19, (int) (short) 10);
        java.util.Date date23 = org.apache.commons.lang.time.DateUtils.addDays(date19, 1);
        java.util.Date date25 = org.apache.commons.lang.time.DateUtils.round((java.lang.Object) date23, 1001);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Wed Dec 31 23:59:59 ICT 1969");
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Wed Jan 21 23:59:59 ICT 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Tue Dec 31 23:59:59 ICT 2069");
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Wed Jan 01 00:00:09 ICT 2070");
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Wed Jan 01 23:59:59 ICT 2070");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Wed Jan 01 00:00:00 ICT 2070");
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date7 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 10, 5);
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.addMonths(date7, (int) (short) 1);
        java.util.Date date11 = org.apache.commons.lang.time.DateUtils.addHours(date7, 86400000);
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.truncate((java.lang.Object) date7, 5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Sun Feb 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Tue Jun 20 05:00:00 ICT 11826");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.util.Date date6 = org.apache.commons.lang.time.DateUtils.addDays(date4, (int) '#');
        java.util.Date date8 = org.apache.commons.lang.time.DateUtils.addMonths(date6, 1);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "" };
        java.util.Date date13 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray12);
        java.util.Date date15 = org.apache.commons.lang.time.DateUtils.addSeconds(date13, 5);
        boolean boolean16 = org.apache.commons.lang.time.DateUtils.isSameInstant(date6, date15);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addYears(date6, 86400000);
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.round(date18, 0);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.addMonths(date18, (int) (byte) 1);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addMonths(date22, (int) '4');
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addWeeks(date22, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Feb 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Mar 05 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:05 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Feb 05 00:00:00 ICT 86401970");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Sat Jan 01 00:00:00 ICT 543");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Mar 05 00:00:00 ICT 86401970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Fri Jul 05 00:00:00 ICT 86401974");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Mar 12 00:00:00 ICT 86401970");
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = org.apache.commons.lang.time.DateUtils.addDays(date0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (short) 10, 5);
        java.util.Date date14 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date12, (int) (byte) 0);
        java.lang.String[] strArray18 = new java.lang.String[] { "", "" };
        java.util.Date date19 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray18);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.add(date19, (int) (short) 10, 5);
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date22, (int) (byte) 0);
        java.util.Date date27 = org.apache.commons.lang.time.DateUtils.add(date22, (int) (short) -1, (int) (byte) 0);
        java.util.Date date29 = org.apache.commons.lang.time.DateUtils.addMinutes(date27, (int) (short) 1);
        boolean boolean30 = org.apache.commons.lang.time.DateUtils.isSameInstant(date12, date29);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "" };
        java.util.Date date35 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray34);
        java.util.Date date38 = org.apache.commons.lang.time.DateUtils.add(date35, (int) (short) 10, 5);
        java.util.Date date40 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date38, (int) (byte) 0);
        java.util.Date date43 = org.apache.commons.lang.time.DateUtils.add(date38, (int) (short) -1, (int) (byte) 0);
        java.util.Date date45 = org.apache.commons.lang.time.DateUtils.addMinutes(date43, (int) (short) 1);
        boolean boolean46 = org.apache.commons.lang.time.DateUtils.isSameDay(date29, date43);
        boolean boolean47 = org.apache.commons.lang.time.DateUtils.isSameDay(date4, date29);
        java.util.Date date49 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date4, 86400000);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Thu Jan 01 05:01:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date43);
        org.junit.Assert.assertEquals(date43.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Jan 01 05:01:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Fri Jan 02 00:00:00 ICT 1970");
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "" };
        java.util.Date date4 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.Date date9 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray8);
        java.util.Date date12 = org.apache.commons.lang.time.DateUtils.add(date9, (int) (short) 10, 5);
        boolean boolean13 = org.apache.commons.lang.time.DateUtils.isSameDay(date4, date12);
        java.util.Date date16 = org.apache.commons.lang.time.DateUtils.add(date4, (int) (short) 0, 10);
        java.util.Date date18 = org.apache.commons.lang.time.DateUtils.addMonths(date16, (int) '4');
        java.util.Date date20 = org.apache.commons.lang.time.DateUtils.addYears(date18, (int) (short) 0);
        java.util.Date date22 = org.apache.commons.lang.time.DateUtils.addDays(date18, (int) '4');
        java.util.Date date24 = org.apache.commons.lang.time.DateUtils.addWeeks(date22, (int) (byte) 100);
        java.util.Date date26 = org.apache.commons.lang.time.DateUtils.addMinutes(date24, (int) (byte) 10);
        java.lang.String[] strArray30 = new java.lang.String[] { "", "" };
        java.util.Date date31 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray30);
        java.lang.String[] strArray35 = new java.lang.String[] { "", "" };
        java.util.Date date36 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray35);
        java.util.Date date39 = org.apache.commons.lang.time.DateUtils.add(date36, (int) (short) 10, 5);
        boolean boolean40 = org.apache.commons.lang.time.DateUtils.isSameDay(date31, date39);
        java.util.Date date42 = org.apache.commons.lang.time.DateUtils.addMinutes(date31, (int) (byte) 100);
        java.util.Date date44 = org.apache.commons.lang.time.DateUtils.addHours(date31, 2);
        java.util.Date date46 = org.apache.commons.lang.time.DateUtils.addMonths(date44, 0);
        java.lang.String[] strArray50 = new java.lang.String[] { "", "" };
        java.util.Date date51 = org.apache.commons.lang.time.DateUtils.parseDate("", strArray50);
        java.util.Date date54 = org.apache.commons.lang.time.DateUtils.add(date51, (int) (short) 10, 5);
        java.util.Date date56 = org.apache.commons.lang.time.DateUtils.addMilliseconds(date54, (int) (byte) 0);
        java.util.Date date59 = org.apache.commons.lang.time.DateUtils.add(date54, (int) (short) -1, (int) (byte) 0);
        java.util.Date date62 = org.apache.commons.lang.time.DateUtils.add(date54, (int) (byte) 0, (int) (byte) 0);
        java.util.Date date64 = org.apache.commons.lang.time.DateUtils.addMinutes(date54, (int) (byte) 0);
        java.util.Date date66 = org.apache.commons.lang.time.DateUtils.addYears(date54, 0);
        java.util.Date date68 = org.apache.commons.lang.time.DateUtils.addDays(date54, 1000);
        java.util.Date date70 = org.apache.commons.lang.time.DateUtils.addDays(date68, 4);
        boolean boolean71 = org.apache.commons.lang.time.DateUtils.isSameDay(date46, date70);
        boolean boolean72 = org.apache.commons.lang.time.DateUtils.isSameDay(date24, date70);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Wed May 01 00:00:00 ICT 1974");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Wed May 01 00:00:00 ICT 1974");
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Sat Jun 22 00:00:00 ICT 1974");
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Sat May 22 00:00:00 ICT 1976");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Sat May 22 00:10:00 ICT 1976");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date39);
        org.junit.Assert.assertEquals(date39.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Thu Jan 01 01:40:00 ICT 1970");
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Thu Jan 01 02:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date46);
        org.junit.Assert.assertEquals(date46.toString(), "Thu Jan 01 02:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(date51);
        org.junit.Assert.assertEquals(date51.toString(), "Thu Jan 01 00:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date54);
        org.junit.Assert.assertEquals(date54.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date59);
        org.junit.Assert.assertEquals(date59.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date62);
        org.junit.Assert.assertEquals(date62.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date64);
        org.junit.Assert.assertEquals(date64.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Thu Jan 01 05:00:00 ICT 1970");
        org.junit.Assert.assertNotNull(date68);
        org.junit.Assert.assertEquals(date68.toString(), "Wed Sep 27 05:00:00 ICT 1972");
        org.junit.Assert.assertNotNull(date70);
        org.junit.Assert.assertEquals(date70.toString(), "Sun Oct 01 05:00:00 ICT 1972");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }
}

