package org.joda.time.format;

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
        int int0 = org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName.SHORT_NAME;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder.appendUnknownString(stringBuffer0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset timeZoneOffset5 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset("hi!", "", false, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral(' ');
        int int2 = characterLiteral1.estimateParsedLength();
        java.lang.StringBuffer stringBuffer3 = null;
        org.joda.time.ReadablePartial readablePartial4 = null;
        java.util.Locale locale5 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral1.printTo(stringBuffer3, readablePartial4, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) '#', (int) (byte) 0);
        int int4 = fraction3.iMinDigits;
        int int5 = fraction3.iMaxDigits;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset timeZoneOffset5 = new org.joda.time.format.DateTimeFormatterBuilder.TimeZoneOffset("hi!", "", true, 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) '#', (int) (byte) 0);
        fraction3.iMaxDigits = (short) 100;
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) '#', (int) (byte) 0);
        fraction3.iMaxDigits = (short) 1;
        java.lang.StringBuffer stringBuffer6 = null;
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction3.printTo(stringBuffer6, readablePartial7, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) '#', (int) (byte) 0);
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction3.printTo(stringBuffer4, (long) (short) -1, chronology6, 35, dateTimeZone8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) (short) 100, (int) (byte) 1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatterBuilder.appendUnknownString(stringBuffer0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        int int0 = org.joda.time.format.DateTimeFormatterBuilder.TimeZoneName.LONG_NAME;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 35, true);
        java.io.Writer writer4 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            twoDigitYear3.printTo(writer4, (long) (byte) -1, chronology6, 100, dateTimeZone8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral(' ');
        int int2 = characterLiteral1.estimateParsedLength();
        int int3 = characterLiteral1.estimateParsedLength();
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.ReadablePartial readablePartial5 = null;
        java.util.Locale locale6 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral1.printTo(stringBuffer4, readablePartial5, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral(' ');
        java.io.Writer writer2 = null;
        org.joda.time.ReadablePartial readablePartial3 = null;
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral1.printTo(writer2, readablePartial3, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId timeZoneId0 = org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
        int int1 = timeZoneId0.estimatePrintedLength();
        org.junit.Assert.assertTrue("'" + timeZoneId0 + "' != '" + org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE + "'", timeZoneId0.equals(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) '#', (int) (byte) 0);
        int int4 = fraction3.iMinDigits;
        java.lang.StringBuffer stringBuffer5 = null;
        org.joda.time.ReadablePartial readablePartial6 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction3.printTo(stringBuffer5, readablePartial6, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) '#', (int) (byte) 0);
        int int4 = fraction3.iMinDigits;
        java.io.Writer writer5 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction3.printTo(writer5, (long) (byte) -1, chronology7, 1, dateTimeZone9, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 35, true);
        java.io.Writer writer4 = null;
        org.joda.time.ReadablePartial readablePartial5 = null;
        java.util.Locale locale6 = null;
        // The following exception was thrown during execution in test generation
        try {
            twoDigitYear3.printTo(writer4, readablePartial5, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral(' ');
        int int2 = characterLiteral1.estimateParsedLength();
        int int3 = characterLiteral1.estimateParsedLength();
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral1.printTo(stringBuffer4, (long) (byte) 10, chronology6, (int) ' ', dateTimeZone8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 35, false);
        int int4 = fixedNumber3.iMinPrintedDigits;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = null;
        int int8 = fixedNumber3.parseInto(dateTimeParserBucket5, "", (int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-36) + "'", int8 == (-36));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 35, false);
        int int4 = fixedNumber3.iMinPrintedDigits;
        boolean boolean5 = fixedNumber3.iSigned;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral(' ');
        java.io.Writer writer2 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral1.printTo(writer2, (long) (short) 100, chronology4, (int) 'a', dateTimeZone6, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 35, true);
        int int4 = twoDigitYear3.estimateParsedLength();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral('4');
        int int2 = characterLiteral1.estimatePrintedLength();
        java.io.Writer writer3 = null;
        org.joda.time.ReadablePartial readablePartial4 = null;
        java.util.Locale locale5 = null;
        // The following exception was thrown during execution in test generation
        try {
            characterLiteral1.printTo(writer3, readablePartial4, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("hi!");
        java.io.Writer writer2 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringLiteral1.printTo(writer2, (long) (-1), chronology4, 10, dateTimeZone6, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId timeZoneId0 = org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
        java.lang.StringBuffer stringBuffer1 = null;
        org.joda.time.ReadablePartial readablePartial2 = null;
        java.util.Locale locale3 = null;
        timeZoneId0.printTo(stringBuffer1, readablePartial2, locale3);
        org.junit.Assert.assertTrue("'" + timeZoneId0 + "' != '" + org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE + "'", timeZoneId0.equals(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) '#', (int) (byte) 0);
        fraction3.iMaxDigits = (short) 1;
        java.lang.StringBuffer stringBuffer6 = null;
        org.joda.time.ReadablePartial readablePartial7 = null;
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction3.printTo(stringBuffer6, readablePartial7, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.joda.time.format.DateTimeFormatterBuilder.StringLiteral stringLiteral1 = new org.joda.time.format.DateTimeFormatterBuilder.StringLiteral("hi!");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket2 = null;
        int int5 = stringLiteral1.parseInto(dateTimeParserBucket2, "", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-101) + "'", int5 == (-101));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear twoDigitYear3 = new org.joda.time.format.DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 35, true);
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            twoDigitYear3.printTo(stringBuffer4, (long) 35, chronology6, (int) (byte) 1, dateTimeZone8, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 35, false);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = null;
        int int7 = fixedNumber3.parseInto(dateTimeParserBucket4, "", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2) + "'", int7 == (-2));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber paddedNumber4 = new org.joda.time.format.DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType0, (int) (short) 10, true, (int) (short) 0);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId timeZoneId2 = org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral4 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral(' ');
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral6 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral(' ');
        int int7 = characterLiteral6.estimateParsedLength();
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Object[] objArray11 = new java.lang.Object[] { 10.0d, "hi!", timeZoneId2, characterLiteral4, int7, 0L, 10.0d, obj10 };
        java.util.ArrayList<java.lang.Object> objList12 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList12, objArray11);
        org.joda.time.format.DateTimeFormatterBuilder.Composite composite14 = new org.joda.time.format.DateTimeFormatterBuilder.Composite((java.util.List<java.lang.Object>) objList12);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = null;
        int int18 = composite14.parseInto(dateTimeParserBucket15, "", (int) (short) 0);
        int int19 = composite14.estimatePrintedLength();
        org.junit.Assert.assertTrue("'" + timeZoneId2 + "' != '" + org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE + "'", timeZoneId2.equals(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.joda.time.format.DateTimeParser[] dateTimeParserArray0 = new org.joda.time.format.DateTimeParser[] {};
        org.joda.time.format.DateTimeFormatterBuilder.MatchingParser matchingParser1 = new org.joda.time.format.DateTimeFormatterBuilder.MatchingParser(dateTimeParserArray0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = matchingParser1.parseInto(dateTimeParserBucket2, "", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeParserArray0);
        org.junit.Assert.assertArrayEquals(dateTimeParserArray0, new org.joda.time.format.DateTimeParser[] {});
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) '#', (int) (byte) 0);
        fraction3.iMaxDigits = (short) 1;
        int int6 = fraction3.iMaxDigits;
        int int7 = fraction3.iMinDigits;
        java.lang.StringBuffer stringBuffer8 = null;
        org.joda.time.ReadablePartial readablePartial9 = null;
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction3.printTo(stringBuffer8, readablePartial9, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId timeZoneId0 = org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
        int int1 = timeZoneId0.estimateParsedLength();
        org.junit.Assert.assertTrue("'" + timeZoneId0 + "' != '" + org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE + "'", timeZoneId0.equals(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) '#', (int) (byte) 0);
        int int4 = fraction3.iMinDigits;
        int int5 = fraction3.estimatePrintedLength();
        int int6 = fraction3.iMaxDigits;
        java.lang.StringBuffer stringBuffer7 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        java.util.Locale locale12 = null;
        // The following exception was thrown during execution in test generation
        try {
            fraction3.printTo(stringBuffer7, (long) 'a', chronology9, 4, dateTimeZone11, locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId timeZoneId2 = org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral4 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral(' ');
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral6 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral(' ');
        int int7 = characterLiteral6.estimateParsedLength();
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Object[] objArray11 = new java.lang.Object[] { 10.0d, "hi!", timeZoneId2, characterLiteral4, int7, 0L, 10.0d, obj10 };
        java.util.ArrayList<java.lang.Object> objList12 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList12, objArray11);
        org.joda.time.format.DateTimeFormatterBuilder.Composite composite14 = new org.joda.time.format.DateTimeFormatterBuilder.Composite((java.util.List<java.lang.Object>) objList12);
        java.lang.StringBuffer stringBuffer15 = null;
        org.joda.time.ReadablePartial readablePartial16 = null;
        java.util.Locale locale17 = null;
        composite14.printTo(stringBuffer15, readablePartial16, locale17);
        int int19 = composite14.estimatePrintedLength();
        org.junit.Assert.assertTrue("'" + timeZoneId2 + "' != '" + org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE + "'", timeZoneId2.equals(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, 0, 4);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.Fraction fraction3 = new org.joda.time.format.DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (int) '#', (int) (byte) 0);
        int int4 = fraction3.iMinDigits;
        int int5 = fraction3.estimateParsedLength();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 35, false);
        int int4 = fixedNumber3.iMinPrintedDigits;
        java.io.Writer writer5 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fixedNumber3.printTo(writer5, (long) 35, chronology7, 0, dateTimeZone9, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId timeZoneId2 = org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral4 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral(' ');
        org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral characterLiteral6 = new org.joda.time.format.DateTimeFormatterBuilder.CharacterLiteral(' ');
        int int7 = characterLiteral6.estimateParsedLength();
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Object[] objArray11 = new java.lang.Object[] { 10.0d, "hi!", timeZoneId2, characterLiteral4, int7, 0L, 10.0d, obj10 };
        java.util.ArrayList<java.lang.Object> objList12 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList12, objArray11);
        org.joda.time.format.DateTimeFormatterBuilder.Composite composite14 = new org.joda.time.format.DateTimeFormatterBuilder.Composite((java.util.List<java.lang.Object>) objList12);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = null;
        int int18 = composite14.parseInto(dateTimeParserBucket15, "", (int) (short) 0);
        java.lang.StringBuffer stringBuffer19 = null;
        org.joda.time.ReadablePartial readablePartial20 = null;
        java.util.Locale locale21 = null;
        composite14.printTo(stringBuffer19, readablePartial20, locale21);
        int int23 = composite14.estimatePrintedLength();
        org.junit.Assert.assertTrue("'" + timeZoneId2 + "' != '" + org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE + "'", timeZoneId2.equals(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        org.joda.time.format.DateTimeFormatterBuilder.FixedNumber fixedNumber3 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, (-101), false);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId timeZoneId0 = org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
        int int1 = timeZoneId0.estimatePrintedLength();
        int int2 = timeZoneId0.estimateParsedLength();
        org.junit.Assert.assertTrue("'" + timeZoneId0 + "' != '" + org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE + "'", timeZoneId0.equals(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }
}

