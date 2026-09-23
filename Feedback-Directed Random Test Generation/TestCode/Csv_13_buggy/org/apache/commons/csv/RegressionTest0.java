package org.apache.commons.csv;

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter2 = new org.apache.commons.csv.CSVPrinter(appendable0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat2);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        boolean boolean7 = cSVFormat4.getAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('#');
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.MySQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MySQL + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.MySQL));
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        java.lang.String str2 = cSVFormat0.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" + "'", str2, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray9 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withHeaderComments(objArray9);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat4.withSkipHeaderRecord();
        boolean boolean12 = cSVFormat11.isQuoteCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        char char1 = cSVFormat0.getDelimiter();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withHeader(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The header contains a duplicate entry: 'hi!' in [hi!, , hi!]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ',' + "'", char1 == ',');
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "hi!" });
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withSkipHeaderRecord();
        java.lang.Class<?> wildcardClass5 = cSVFormat4.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray9 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withHeaderComments(objArray9);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat4.withSkipHeaderRecord();
        boolean boolean12 = cSVFormat4.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat4.withIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray9 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withHeaderComments(objArray9);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat4.withSkipHeaderRecord();
        java.io.Reader reader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser13 = cSVFormat4.parse(reader12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat2.getHeaderComments();
        boolean boolean6 = cSVFormat2.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withAllowMissingColumnNames(false);
        org.apache.commons.csv.QuoteMode quoteMode9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withQuoteMode(quoteMode9);
        java.lang.String[] strArray11 = cSVFormat10.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(strArray11);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.Class<?> wildcardClass1 = cSVFormat0.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        boolean boolean3 = cSVFormat0.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.Delimiter=<,> QuoteChar=<\"> RecordSeparator=<??> EmptyLines:ignored SkipHeaderRecord:false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withHeaderComments(objArray17);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat7.withHeaderComments(objArray17);
        boolean boolean20 = cSVFormat19.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withQuote('4');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withRecordSeparator("");
        java.lang.Character char28 = cSVFormat27.getEscapeCharacter();
        java.lang.Character char29 = cSVFormat27.getEscapeCharacter();
        org.apache.commons.csv.QuoteMode quoteMode30 = null;
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat27.withQuoteMode(quoteMode30);
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withRecordSeparator('a');
        java.lang.String[] strArray37 = cSVFormat36.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withRecordSeparator('a');
        java.lang.String[] strArray43 = cSVFormat42.getHeader();
        java.lang.String[] strArray44 = cSVFormat42.getHeaderComments();
        java.lang.Object[] objArray46 = new java.lang.Object[] { cSVFormat27, strArray37, cSVFormat42, "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat24.withHeaderComments((java.lang.Object[]) strArray37);
        java.lang.Class<?> wildcardClass48 = cSVFormat24.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNull(char28);
        org.junit.Assert.assertNull(char29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNull(strArray37);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNull(strArray43);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<> EmptyLines:ignored SkipHeaderRecord:false, null, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<> EmptyLines:ignored SkipHeaderRecord:false, null, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false, hi!]");
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("4Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false4a");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.4Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false4a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String str5 = cSVFormat4.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreSurroundingSpaces(false);
        boolean boolean3 = cSVFormat0.isEscapeCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator('a');
        java.lang.String[] strArray6 = cSVFormat5.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat13.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray18 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat13.withHeaderComments(objArray18);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat8.withHeaderComments(objArray18);
        boolean boolean21 = cSVFormat20.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat20.withQuote('4');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withRecordSeparator("");
        java.lang.Character char29 = cSVFormat28.getEscapeCharacter();
        java.lang.Character char30 = cSVFormat28.getEscapeCharacter();
        org.apache.commons.csv.QuoteMode quoteMode31 = null;
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat28.withQuoteMode(quoteMode31);
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withRecordSeparator('a');
        java.lang.String[] strArray38 = cSVFormat37.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat39 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat39.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat41.withRecordSeparator('a');
        java.lang.String[] strArray44 = cSVFormat43.getHeader();
        java.lang.String[] strArray45 = cSVFormat43.getHeaderComments();
        java.lang.Object[] objArray47 = new java.lang.Object[] { cSVFormat28, strArray38, cSVFormat43, "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat25.withHeaderComments((java.lang.Object[]) strArray38);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter49 = new org.apache.commons.csv.CSVPrinter(appendable0, cSVFormat48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertArrayEquals(objArray18, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNull(char29);
        org.junit.Assert.assertNull(char30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNull(strArray38);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertNull(strArray45);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<> EmptyLines:ignored SkipHeaderRecord:false, null, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<> EmptyLines:ignored SkipHeaderRecord:false, null, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false, hi!]");
        org.junit.Assert.assertNotNull(cSVFormat48);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator('4');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withHeaderComments(objArray17);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat7.withHeaderComments(objArray17);
        java.lang.String[] strArray20 = cSVFormat19.getHeader();
        java.lang.Character char21 = cSVFormat19.getCommentMarker();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertNull(char21);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote(' ');
        boolean boolean5 = cSVFormat4.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withDelimiter('a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withHeaderComments(objArray17);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat7.withHeaderComments(objArray17);
        boolean boolean20 = cSVFormat19.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withQuote('4');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withRecordSeparator("");
        java.lang.Character char28 = cSVFormat27.getEscapeCharacter();
        java.lang.Character char29 = cSVFormat27.getEscapeCharacter();
        org.apache.commons.csv.QuoteMode quoteMode30 = null;
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat27.withQuoteMode(quoteMode30);
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withRecordSeparator('a');
        java.lang.String[] strArray37 = cSVFormat36.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withRecordSeparator('a');
        java.lang.String[] strArray43 = cSVFormat42.getHeader();
        java.lang.String[] strArray44 = cSVFormat42.getHeaderComments();
        java.lang.Object[] objArray46 = new java.lang.Object[] { cSVFormat27, strArray37, cSVFormat42, "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat24.withHeaderComments((java.lang.Object[]) strArray37);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat47.withEscape('a');
        org.apache.commons.csv.QuoteMode quoteMode50 = cSVFormat47.getQuoteMode();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNull(char28);
        org.junit.Assert.assertNull(char29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNull(strArray37);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNull(strArray43);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<> EmptyLines:ignored SkipHeaderRecord:false, null, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<> EmptyLines:ignored SkipHeaderRecord:false, null, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false, hi!]");
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNull(quoteMode50);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withIgnoreEmptyLines(true);
        boolean boolean9 = cSVFormat8.isNullStringSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote(' ');
        boolean boolean5 = cSVFormat4.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withCommentMarker(',');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The comment start character and the delimiter cannot be the same (',')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withHeaderComments(objArray17);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat7.withHeaderComments(objArray17);
        boolean boolean20 = cSVFormat19.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withQuote('4');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withRecordSeparator("");
        java.lang.Character char28 = cSVFormat27.getEscapeCharacter();
        java.lang.Character char29 = cSVFormat27.getEscapeCharacter();
        org.apache.commons.csv.QuoteMode quoteMode30 = null;
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat27.withQuoteMode(quoteMode30);
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withRecordSeparator('a');
        java.lang.String[] strArray37 = cSVFormat36.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withRecordSeparator('a');
        java.lang.String[] strArray43 = cSVFormat42.getHeader();
        java.lang.String[] strArray44 = cSVFormat42.getHeaderComments();
        java.lang.Object[] objArray46 = new java.lang.Object[] { cSVFormat27, strArray37, cSVFormat42, "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat24.withHeaderComments((java.lang.Object[]) strArray37);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat47.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat47.withDelimiter('#');
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat51.withQuote('a');
        boolean boolean54 = cSVFormat51.getAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNull(char28);
        org.junit.Assert.assertNull(char29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNull(strArray37);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNull(strArray43);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<> EmptyLines:ignored SkipHeaderRecord:false, null, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<> EmptyLines:ignored SkipHeaderRecord:false, null, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false, hi!]");
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote(' ');
        boolean boolean5 = cSVFormat4.getIgnoreSurroundingSpaces();
        boolean boolean6 = cSVFormat4.getSkipHeaderRecord();
        org.apache.commons.csv.QuoteMode quoteMode7 = cSVFormat4.getQuoteMode();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(quoteMode7);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withHeaderComments(objArray17);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat7.withHeaderComments(objArray17);
        java.lang.String str20 = cSVFormat7.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Delimiter=<,> QuoteChar=<4> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false" + "'", str20, "Delimiter=<,> QuoteChar=<4> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withRecordSeparator('a');
        java.lang.String[] strArray14 = cSVFormat13.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat24.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray29 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat24.withHeaderComments(objArray29);
        java.lang.Object[] objArray31 = new java.lang.Object[] { cSVFormat24 };
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat19.withHeaderComments(objArray31);
        java.lang.String str33 = cSVFormat13.format(objArray31);
        boolean boolean34 = cSVFormat13.isCommentMarkerSet();
        boolean boolean35 = cSVFormat8.equals((java.lang.Object) boolean34);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertArrayEquals(objArray29, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false]");
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false\"a" + "'", str33, "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false\"a");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreSurroundingSpaces();
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = cSVFormat4.equals(obj7);
        java.lang.Appendable appendable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter10 = cSVFormat4.print(appendable9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.junit.Assert.assertNotNull(cSVFormat0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator('a');
        java.lang.String[] strArray6 = cSVFormat5.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat13.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray18 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat13.withHeaderComments(objArray18);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat8.withHeaderComments(objArray18);
        boolean boolean21 = cSVFormat20.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat20.withQuote('4');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withSkipHeaderRecord(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter26 = new org.apache.commons.csv.CSVPrinter(appendable0, cSVFormat23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertArrayEquals(objArray18, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withAllowMissingColumnNames();
        boolean boolean6 = cSVFormat5.isCommentMarkerSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreSurroundingSpaces();
        boolean boolean2 = cSVFormat1.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withNullString("\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false\"a");
        java.lang.String[] strArray5 = cSVFormat4.getHeaderComments();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withDelimiter(' ');
        java.lang.String str5 = cSVFormat0.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray9 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withHeaderComments(objArray9);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat4.withSkipHeaderRecord();
        java.lang.String[] strArray12 = cSVFormat4.getHeaderComments();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(strArray12);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        java.lang.String[] strArray6 = cSVFormat4.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withEscape('\"');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreHeaderCase(false);
        java.sql.ResultSet resultSet8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withHeader(resultSet8);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withIgnoreHeaderCase(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter13 = new org.apache.commons.csv.CSVPrinter(appendable0, cSVFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withSkipHeaderRecord();
        boolean boolean5 = cSVFormat3.isNullStringSet();
        boolean boolean6 = cSVFormat3.isCommentMarkerSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withAllowMissingColumnNames();
        java.lang.Character char6 = cSVFormat4.getEscapeCharacter();
        boolean boolean7 = cSVFormat4.isCommentMarkerSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSet7);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray19 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat14.withHeaderComments(objArray19);
        java.lang.String str21 = cSVFormat8.format(objArray19);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat8.withAllowMissingColumnNames(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "a" + "'", str21, "a");
        org.junit.Assert.assertNotNull(cSVFormat23);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        java.lang.String[] strArray6 = cSVFormat4.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withAllowMissingColumnNames(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withCommentMarker('\"');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The comment start character and the quoteChar cannot be the same ('\"')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.Default;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.Default + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.Default));
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        java.lang.String str6 = cSVFormat4.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withAllowMissingColumnNames(false);
        boolean boolean9 = cSVFormat8.isQuoteCharacterSet();
        boolean boolean10 = cSVFormat8.isNullStringSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.Default;
        java.lang.Class<?> wildcardClass1 = predefined0.getClass();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.Default + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.Default));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withIgnoreSurroundingSpaces(true);
        java.io.Reader reader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser10 = cSVFormat4.parse(reader9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withHeaderComments(objArray17);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat7.withHeaderComments(objArray17);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat7.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withRecordSeparator('a');
        java.lang.String[] strArray27 = cSVFormat26.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat26.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat34.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray39 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat34.withHeaderComments(objArray39);
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat29.withHeaderComments(objArray39);
        boolean boolean42 = cSVFormat41.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat43 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat44 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat44.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat46.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat48.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat48.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray53 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat48.withHeaderComments(objArray53);
        java.lang.Object[] objArray55 = new java.lang.Object[] { cSVFormat48 };
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat43.withHeaderComments(objArray55);
        java.lang.String str57 = cSVFormat41.format(objArray55);
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat21.withHeaderComments(objArray55);
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat58.withIgnoreSurroundingSpaces(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNull(strArray27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertArrayEquals(objArray39, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertArrayEquals(objArray53, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false]");
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "4Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false4a" + "'", str57, "4Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false4a");
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertNotNull(cSVFormat60);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withHeaderComments(objArray17);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat7.withHeaderComments(objArray17);
        boolean boolean20 = cSVFormat19.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withQuote('4');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat19.withEscape((java.lang.Character) '\"');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withHeaderComments(objArray10);
        java.lang.Object[] objArray12 = new java.lang.Object[] { cSVFormat5 };
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withHeaderComments(objArray12);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.QuoteMode quoteMode15 = cSVFormat14.getQuoteMode();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false]");
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNull(quoteMode15);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.RFC4180 + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.RFC4180));
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withSkipHeaderRecord();
        java.lang.String[] strArray5 = cSVFormat3.getHeader();
        java.lang.String str6 = cSVFormat3.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withDelimiter(' ');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withHeaderComments(objArray17);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat7.withHeaderComments(objArray17);
        boolean boolean20 = cSVFormat19.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withQuote('4');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withRecordSeparator("");
        java.lang.Character char28 = cSVFormat27.getEscapeCharacter();
        java.lang.Character char29 = cSVFormat27.getEscapeCharacter();
        org.apache.commons.csv.QuoteMode quoteMode30 = null;
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat27.withQuoteMode(quoteMode30);
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withRecordSeparator('a');
        java.lang.String[] strArray37 = cSVFormat36.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withRecordSeparator('a');
        java.lang.String[] strArray43 = cSVFormat42.getHeader();
        java.lang.String[] strArray44 = cSVFormat42.getHeaderComments();
        java.lang.Object[] objArray46 = new java.lang.Object[] { cSVFormat27, strArray37, cSVFormat42, "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat24.withHeaderComments((java.lang.Object[]) strArray37);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat47.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat47.withDelimiter('#');
        org.apache.commons.csv.CSVFormat cSVFormat52 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat52.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat54.withRecordSeparator('a');
        java.lang.String[] strArray57 = cSVFormat56.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat56.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat60 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat60.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat62.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat64.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat64.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray69 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat70 = cSVFormat64.withHeaderComments(objArray69);
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat59.withHeaderComments(objArray69);
        java.lang.String str72 = cSVFormat47.format(objArray69);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNull(char28);
        org.junit.Assert.assertNull(char29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNull(strArray37);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNull(strArray43);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<> EmptyLines:ignored SkipHeaderRecord:false, null, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<> EmptyLines:ignored SkipHeaderRecord:false, null, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false, hi!]");
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertNull(strArray57);
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNotNull(cSVFormat60);
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertNotNull(cSVFormat64);
        org.junit.Assert.assertNotNull(cSVFormat66);
        org.junit.Assert.assertNotNull(cSVFormat68);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertArrayEquals(objArray69, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat70);
        org.junit.Assert.assertNotNull(cSVFormat71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "a" + "'", str72, "a");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreSurroundingSpaces(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSet7);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray19 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat14.withHeaderComments(objArray19);
        java.lang.String str21 = cSVFormat8.format(objArray19);
        boolean boolean22 = cSVFormat8.isNullStringSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "a" + "'", str21, "a");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSet7);
        org.apache.commons.csv.QuoteMode quoteMode9 = cSVFormat8.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withSkipHeaderRecord();
        boolean boolean11 = cSVFormat10.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(quoteMode9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray9 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withHeaderComments(objArray9);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat4.withIgnoreSurroundingSpaces();
        boolean boolean12 = cSVFormat4.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSet7);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withNullString("a");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.QuoteMode quoteMode3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuoteMode(quoteMode3);
        boolean boolean5 = cSVFormat2.isQuoteCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray9 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withHeaderComments(objArray9);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat4.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withIgnoreSurroundingSpaces();
        java.lang.String[] strArray13 = cSVFormat11.getHeaderComments();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        char char1 = cSVFormat0.getDelimiter();
        boolean boolean2 = cSVFormat0.getIgnoreHeaderCase();
        java.lang.Character char3 = cSVFormat0.getCommentMarker();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ',' + "'", char1 == ',');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(char3);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withNullString("Delimiter=<,> Escape=< > QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.Excel;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        java.lang.Class<?> wildcardClass4 = cSVFormat1.getClass();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.Excel + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.Excel));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withEscape((java.lang.Character) ' ');
        java.lang.String str7 = cSVFormat6.toString();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Delimiter=<,> Escape=< > QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false" + "'", str7, "Delimiter=<,> Escape=< > QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withHeaderComments(objArray10);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withEscape((java.lang.Character) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter14 = new org.apache.commons.csv.CSVPrinter(appendable0, cSVFormat13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSet7);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withSkipHeaderRecord();
        boolean boolean10 = cSVFormat9.isNullStringSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray9 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withHeaderComments(objArray9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withEscape((java.lang.Character) '#');
        java.lang.Character char13 = cSVFormat10.getCommentMarker();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(char13);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withHeaderComments(objArray17);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat7.withHeaderComments(objArray17);
        boolean boolean20 = cSVFormat19.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withQuote('4');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withSkipHeaderRecord(false);
        boolean boolean25 = cSVFormat24.isCommentMarkerSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat24.withEscape(',');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The escape character and the delimiter cannot be the same (',')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        java.lang.String[] strArray6 = cSVFormat4.getHeaderComments();
        java.lang.String[] strArray7 = cSVFormat4.getHeader();
        boolean boolean8 = cSVFormat4.getSkipHeaderRecord();
        boolean boolean9 = cSVFormat4.getIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.Excel;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat1.getQuoteMode();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.Excel + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.Excel));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(quoteMode4);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        java.lang.String[] strArray6 = cSVFormat4.getHeaderComments();
        java.lang.String[] strArray7 = cSVFormat4.getHeader();
        boolean boolean8 = cSVFormat4.getSkipHeaderRecord();
        java.lang.Object[] objArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = cSVFormat4.format(objArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withHeaderComments(objArray17);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat7.withHeaderComments(objArray17);
        java.lang.String[] strArray20 = cSVFormat19.getHeader();
        boolean boolean21 = cSVFormat19.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat19.withNullString("Delimiter=<,> Escape=< > QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat23.withAllowMissingColumnNames();
        java.lang.String str25 = cSVFormat24.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Delimiter=<,> QuoteChar=<4> NullString=<Delimiter=<,> Escape=< > QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false HeaderComments:[]" + "'", str25, "Delimiter=<,> QuoteChar=<4> NullString=<Delimiter=<,> Escape=< > QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false HeaderComments:[]");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        java.lang.Character char7 = cSVFormat6.getEscapeCharacter();
        java.sql.ResultSetMetaData resultSetMetaData8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withHeader(resultSetMetaData8);
        java.lang.Character char10 = cSVFormat9.getCommentMarker();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        boolean boolean2 = cSVFormat1.getSkipHeaderRecord();
        java.sql.ResultSet resultSet3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeader(resultSet3);
        boolean boolean5 = cSVFormat4.isEscapeCharacterSet();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.TDF + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.TDF));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withIgnoreEmptyLines(true);
        boolean boolean9 = cSVFormat8.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withAllowMissingColumnNames();
        java.lang.String str11 = cSVFormat10.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false" + "'", str11, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        char char1 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withDelimiter(' ');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ',' + "'", char1 == ',');
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withAllowMissingColumnNames(false);
        org.apache.commons.csv.QuoteMode quoteMode9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withQuoteMode(quoteMode9);
        boolean boolean11 = cSVFormat4.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat4.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withDelimiter('a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withDelimiter('\"');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The quoteChar character and the delimiter cannot be the same ('\"')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withIgnoreEmptyLines(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter10 = new org.apache.commons.csv.CSVPrinter(appendable0, cSVFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withHeaderComments(objArray17);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat7.withHeaderComments(objArray17);
        boolean boolean20 = cSVFormat19.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat26.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray31 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat26.withHeaderComments(objArray31);
        java.lang.Object[] objArray33 = new java.lang.Object[] { cSVFormat26 };
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat21.withHeaderComments(objArray33);
        java.lang.String str35 = cSVFormat19.format(objArray33);
        boolean boolean36 = cSVFormat19.isEscapeCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertArrayEquals(objArray31, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false]");
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "4Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false4a" + "'", str35, "4Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false4a");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray9 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withHeaderComments(objArray9);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat4.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat4.withQuote('a');
        java.sql.ResultSetMetaData resultSetMetaData14 = null;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withHeader(resultSetMetaData14);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreSurroundingSpaces();
        java.lang.String[] strArray7 = cSVFormat4.getHeaderComments();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreEmptyLines();
        boolean boolean6 = cSVFormat4.getAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("Delimiter=<,> QuoteChar=<4> NullString=<Delimiter=<,> Escape=< > QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false HeaderComments:[]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.Delimiter=<,> QuoteChar=<4> NullString=<Delimiter=<,> Escape=< > QuoteChar=<\"> RecordSeparator=<??> SkipHeaderRecord:false> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false HeaderComments:[]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        char char1 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreEmptyLines(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker('\"');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The comment start character and the quoteChar cannot be the same ('\"')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ',' + "'", char1 == ',');
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withEscape((java.lang.Character) ' ');
        boolean boolean7 = cSVFormat0.getAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withRecordSeparator("");
        java.lang.Character char12 = cSVFormat11.getEscapeCharacter();
        java.lang.Character char13 = cSVFormat11.getEscapeCharacter();
        org.apache.commons.csv.QuoteMode quoteMode14 = null;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withQuoteMode(quoteMode14);
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat20.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray25 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat20.withHeaderComments(objArray25);
        java.lang.String str27 = cSVFormat11.format(objArray25);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat8.withHeaderComments(objArray25);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat8.withIgnoreSurroundingSpaces(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(char12);
        org.junit.Assert.assertNull(char13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertArrayEquals(objArray25, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withAllowMissingColumnNames(false);
        org.apache.commons.csv.QuoteMode quoteMode9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withQuoteMode(quoteMode9);
        boolean boolean11 = cSVFormat4.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat4.withAllowMissingColumnNames();
        boolean boolean13 = cSVFormat12.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSet7);
        boolean boolean9 = cSVFormat8.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withQuote((java.lang.Character) '\"');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withHeaderComments(objArray17);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat7.withHeaderComments(objArray17);
        boolean boolean20 = cSVFormat19.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withQuote('4');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withSkipHeaderRecord(false);
        boolean boolean25 = cSVFormat24.isCommentMarkerSet();
        java.sql.ResultSet resultSet26 = null;
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat24.withHeader(resultSet26);
        boolean boolean28 = cSVFormat24.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withHeaderComments(objArray10);
        java.lang.Object[] objArray12 = new java.lang.Object[] { cSVFormat5 };
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withHeaderComments(objArray12);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withRecordSeparator("a");
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withEscape('#');
        java.lang.Character char19 = cSVFormat18.getCommentMarker();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false]");
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNull(char19);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSet7);
        org.apache.commons.csv.QuoteMode quoteMode9 = cSVFormat8.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withIgnoreEmptyLines(false);
        boolean boolean13 = cSVFormat12.getIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(quoteMode9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false\"a");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false\"a");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withRecordSeparator('a');
        java.lang.String[] strArray12 = cSVFormat11.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat19.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray24 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat19.withHeaderComments(objArray24);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat14.withHeaderComments(objArray24);
        boolean boolean27 = cSVFormat26.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat26.withQuote('4');
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withRecordSeparator('a');
        java.lang.String[] strArray35 = cSVFormat34.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat34.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat42.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat42.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray47 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat42.withHeaderComments(objArray47);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat37.withHeaderComments(objArray47);
        boolean boolean50 = cSVFormat49.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat51 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat52 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat52.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat54.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat56.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat56.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray61 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat56.withHeaderComments(objArray61);
        java.lang.Object[] objArray63 = new java.lang.Object[] { cSVFormat56 };
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat51.withHeaderComments(objArray63);
        java.lang.String str65 = cSVFormat49.format(objArray63);
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat26.withHeaderComments(objArray63);
        java.lang.String str67 = cSVFormat4.format(objArray63);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertArrayEquals(objArray24, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNull(strArray35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertArrayEquals(objArray47, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertNotNull(cSVFormat60);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertArrayEquals(objArray61, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false]");
        org.junit.Assert.assertNotNull(cSVFormat64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "4Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false4a" + "'", str65, "4Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false4a");
        org.junit.Assert.assertNotNull(cSVFormat66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false\"a" + "'", str67, "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false\"a");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSet7);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray19 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat14.withHeaderComments(objArray19);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat9.withHeaderComments(objArray19);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withHeaderComments(objArray17);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat7.withHeaderComments(objArray17);
        java.lang.String[] strArray20 = cSVFormat19.getHeader();
        boolean boolean21 = cSVFormat19.getAllowMissingColumnNames();
        java.lang.String str22 = cSVFormat19.toString();
        java.lang.String str23 = cSVFormat19.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat19.withRecordSeparator(',');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Delimiter=<,> QuoteChar=<4> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false HeaderComments:[]" + "'", str22, "Delimiter=<,> QuoteChar=<4> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false HeaderComments:[]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "a" + "'", str23, "a");
        org.junit.Assert.assertNotNull(cSVFormat25);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote(' ');
        boolean boolean5 = cSVFormat4.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withCommentMarker('a');
        char char8 = cSVFormat4.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + ',' + "'", char8 == ',');
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("Delimiter=<,> QuoteChar=<4> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.Delimiter=<,> QuoteChar=<4> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        java.lang.Character char7 = cSVFormat6.getEscapeCharacter();
        java.sql.ResultSetMetaData resultSetMetaData8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withHeader(resultSetMetaData8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withDelimiter(' ');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreSurroundingSpaces();
        boolean boolean2 = cSVFormat1.getIgnoreHeaderCase();
        org.apache.commons.csv.QuoteMode quoteMode3 = cSVFormat1.getQuoteMode();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(quoteMode3);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSet7);
        boolean boolean9 = cSVFormat8.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withEscape((java.lang.Character) 'a');
        java.lang.Character char12 = cSVFormat11.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withQuote(' ');
        boolean boolean15 = cSVFormat11.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat11.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat17.withIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\"' + "'", char12 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        java.lang.Character char3 = cSVFormat2.getEscapeCharacter();
        java.lang.Character char4 = cSVFormat2.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withQuote(' ');
        boolean boolean7 = cSVFormat6.isEscapeCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNull(char4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray9 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withHeaderComments(objArray9);
        java.sql.ResultSet resultSet11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat4.withHeader(resultSet11);
        java.io.Reader reader13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser14 = cSVFormat12.parse(reader13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreSurroundingSpaces();
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = cSVFormat4.equals(obj7);
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withRecordSeparator('a');
        java.lang.String[] strArray14 = cSVFormat13.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat21.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray26 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat21.withHeaderComments(objArray26);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat16.withHeaderComments(objArray26);
        boolean boolean29 = cSVFormat28.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat35.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray40 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat35.withHeaderComments(objArray40);
        java.lang.Object[] objArray42 = new java.lang.Object[] { cSVFormat35 };
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat30.withHeaderComments(objArray42);
        java.lang.String str44 = cSVFormat28.format(objArray42);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat4.withHeaderComments(objArray42);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat45.withQuote('a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertArrayEquals(objArray26, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertArrayEquals(objArray40, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false]");
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "4Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false4a" + "'", str44, "4Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false4a");
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat47);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSet7);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withSkipHeaderRecord();
        boolean boolean10 = cSVFormat9.isCommentMarkerSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSet7);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray19 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat14.withHeaderComments(objArray19);
        java.lang.String str21 = cSVFormat8.format(objArray19);
        java.lang.String[] strArray27 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "hi!", "Delimiter=<,> QuoteChar=<4> NullString=<Delimiter=<,> Escape=< > QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false HeaderComments:[]", "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false\"a", "Delimiter=<,> QuoteChar=<4> NullString=<Delimiter=<,> Escape=< > QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false HeaderComments:[]" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat8.withHeader(strArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The header contains a duplicate entry: 'Delimiter=<,> QuoteChar=<4> NullString=<Delimiter=<,> Escape=< > QuoteChar=<\"> RecordSeparator=<??> SkipHeaderRecord:false> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false HeaderComments:[]' in [Delimiter=<,> QuoteChar=<\"> RecordSeparator=<??> EmptyLines:ignored SkipHeaderRecord:false, hi!, Delimiter=<,> QuoteChar=<4> NullString=<Delimiter=<,> Escape=< > QuoteChar=<\"> RecordSeparator=<??> SkipHeaderRecord:false> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false HeaderComments:[], \"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false\"a, Delimiter=<,> QuoteChar=<4> NullString=<Delimiter=<,> Escape=< > QuoteChar=<\"> RecordSeparator=<??> SkipHeaderRecord:false> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false HeaderComments:[]]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "a" + "'", str21, "a");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "hi!", "Delimiter=<,> QuoteChar=<4> NullString=<Delimiter=<,> Escape=< > QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false HeaderComments:[]", "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false\"a", "Delimiter=<,> QuoteChar=<4> NullString=<Delimiter=<,> Escape=< > QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false HeaderComments:[]" });
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withHeaderComments(objArray17);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat7.withHeaderComments(objArray17);
        boolean boolean20 = cSVFormat19.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withQuote('4');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withRecordSeparator("");
        java.lang.Character char28 = cSVFormat27.getEscapeCharacter();
        java.lang.Character char29 = cSVFormat27.getEscapeCharacter();
        org.apache.commons.csv.QuoteMode quoteMode30 = null;
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat27.withQuoteMode(quoteMode30);
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withRecordSeparator('a');
        java.lang.String[] strArray37 = cSVFormat36.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withRecordSeparator('a');
        java.lang.String[] strArray43 = cSVFormat42.getHeader();
        java.lang.String[] strArray44 = cSVFormat42.getHeaderComments();
        java.lang.Object[] objArray46 = new java.lang.Object[] { cSVFormat27, strArray37, cSVFormat42, "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat24.withHeaderComments((java.lang.Object[]) strArray37);
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat24.withIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNull(char28);
        org.junit.Assert.assertNull(char29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNull(strArray37);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNull(strArray43);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<> EmptyLines:ignored SkipHeaderRecord:false, null, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<> EmptyLines:ignored SkipHeaderRecord:false, null, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false, hi!]");
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat48);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withSkipHeaderRecord();
        char char5 = cSVFormat3.getDelimiter();
        boolean boolean6 = cSVFormat3.isCommentMarkerSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + ',' + "'", char5 == ',');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withEscape((java.lang.Character) ' ');
        java.lang.String str7 = cSVFormat6.toString();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withEscape('#');
        boolean boolean12 = cSVFormat6.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Delimiter=<,> Escape=< > QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false" + "'", str7, "Delimiter=<,> Escape=< > QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreEmptyLines(false);
        boolean boolean4 = cSVFormat0.getAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        java.lang.Character char3 = cSVFormat2.getCommentMarker();
        boolean boolean4 = cSVFormat2.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        java.lang.Character char7 = cSVFormat6.getEscapeCharacter();
        java.sql.ResultSetMetaData resultSetMetaData8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withHeader(resultSetMetaData8);
        boolean boolean10 = cSVFormat9.getAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        java.lang.Character char3 = cSVFormat2.getEscapeCharacter();
        java.lang.Character char4 = cSVFormat2.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withQuote(' ');
        java.lang.String str7 = cSVFormat2.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withQuote((java.lang.Character) 'a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNull(char4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray9 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withHeaderComments(objArray9);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat4.withIgnoreSurroundingSpaces();
        boolean boolean12 = cSVFormat4.isEscapeCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSet7);
        boolean boolean9 = cSVFormat8.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withEscape((java.lang.Character) 'a');
        java.lang.Character char12 = cSVFormat11.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withRecordSeparator("a");
        java.sql.ResultSet resultSet17 = null;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withHeader(resultSet17);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\"' + "'", char12 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSet7);
        org.apache.commons.csv.QuoteMode quoteMode9 = cSVFormat8.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withQuote('#');
        java.lang.Character char13 = cSVFormat12.getCommentMarker();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(quoteMode9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(char13);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withSkipHeaderRecord();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter11 = new org.apache.commons.csv.CSVPrinter(appendable0, cSVFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        java.lang.Character char3 = cSVFormat2.getCommentMarker();
        boolean boolean4 = cSVFormat2.isEscapeCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withHeaderComments(objArray17);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat7.withHeaderComments(objArray17);
        boolean boolean20 = cSVFormat19.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withQuote('4');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withRecordSeparator("");
        java.lang.Character char28 = cSVFormat27.getEscapeCharacter();
        java.lang.Character char29 = cSVFormat27.getEscapeCharacter();
        org.apache.commons.csv.QuoteMode quoteMode30 = null;
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat27.withQuoteMode(quoteMode30);
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withRecordSeparator('a');
        java.lang.String[] strArray37 = cSVFormat36.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withRecordSeparator('a');
        java.lang.String[] strArray43 = cSVFormat42.getHeader();
        java.lang.String[] strArray44 = cSVFormat42.getHeaderComments();
        java.lang.Object[] objArray46 = new java.lang.Object[] { cSVFormat27, strArray37, cSVFormat42, "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat24.withHeaderComments((java.lang.Object[]) strArray37);
        java.lang.Character char48 = cSVFormat24.getQuoteCharacter();
        java.sql.ResultSetMetaData resultSetMetaData49 = null;
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat24.withHeader(resultSetMetaData49);
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat24.withIgnoreHeaderCase(false);
        java.lang.Appendable appendable53 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter54 = cSVFormat52.print(appendable53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNull(char28);
        org.junit.Assert.assertNull(char29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNull(strArray37);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNull(strArray43);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<> EmptyLines:ignored SkipHeaderRecord:false, null, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<> EmptyLines:ignored SkipHeaderRecord:false, null, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false, hi!]");
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertTrue("'" + char48 + "' != '" + '4' + "'", char48 == '4');
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat52);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray9 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withHeaderComments(objArray9);
        org.apache.commons.csv.QuoteMode quoteMode11 = cSVFormat10.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withRecordSeparator("4Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false4a");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(quoteMode11);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withIgnoreEmptyLines(true);
        boolean boolean9 = cSVFormat8.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        java.lang.String[] strArray6 = cSVFormat4.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withIgnoreHeaderCase(false);
        boolean boolean11 = cSVFormat10.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withRecordSeparator("Delimiter=<,> QuoteChar=<4> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false HeaderComments:[]");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray9 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withHeaderComments(objArray9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withIgnoreHeaderCase(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        char char1 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withSkipHeaderRecord();
        boolean boolean5 = cSVFormat4.getIgnoreSurroundingSpaces();
        boolean boolean6 = cSVFormat4.getAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ',' + "'", char1 == ',');
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withHeaderComments(objArray17);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat7.withHeaderComments(objArray17);
        boolean boolean20 = cSVFormat19.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withNullString("\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false\"a");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withAllowMissingColumnNames(false);
        java.lang.Character char9 = cSVFormat4.getQuoteCharacter();
        boolean boolean10 = cSVFormat4.isNullStringSet();
        char char11 = cSVFormat4.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\"' + "'", char9 == '\"');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + ',' + "'", char11 == ',');
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withHeaderComments(objArray17);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat7.withHeaderComments(objArray17);
        boolean boolean20 = cSVFormat19.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withQuote('4');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withRecordSeparator("");
        java.lang.Character char28 = cSVFormat27.getEscapeCharacter();
        java.lang.Character char29 = cSVFormat27.getEscapeCharacter();
        org.apache.commons.csv.QuoteMode quoteMode30 = null;
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat27.withQuoteMode(quoteMode30);
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withRecordSeparator('a');
        java.lang.String[] strArray37 = cSVFormat36.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withRecordSeparator('a');
        java.lang.String[] strArray43 = cSVFormat42.getHeader();
        java.lang.String[] strArray44 = cSVFormat42.getHeaderComments();
        java.lang.Object[] objArray46 = new java.lang.Object[] { cSVFormat27, strArray37, cSVFormat42, "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat24.withHeaderComments((java.lang.Object[]) strArray37);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat47.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat49.withSkipHeaderRecord(false);
        java.lang.Character char52 = cSVFormat51.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat53 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat53.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat55.withRecordSeparator('a');
        java.lang.String[] strArray58 = cSVFormat57.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat57.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat61 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat61.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat63.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat65.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat65.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray70 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat65.withHeaderComments(objArray70);
        org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat60.withHeaderComments(objArray70);
        org.apache.commons.csv.CSVFormat cSVFormat73 = cSVFormat51.withHeaderComments(objArray70);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNull(char28);
        org.junit.Assert.assertNull(char29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNull(strArray37);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNull(strArray43);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<> EmptyLines:ignored SkipHeaderRecord:false, null, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<> EmptyLines:ignored SkipHeaderRecord:false, null, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false, hi!]");
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertTrue("'" + char52 + "' != '" + 'a' + "'", char52 == 'a');
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertNull(strArray58);
        org.junit.Assert.assertNotNull(cSVFormat60);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertNotNull(cSVFormat63);
        org.junit.Assert.assertNotNull(cSVFormat65);
        org.junit.Assert.assertNotNull(cSVFormat67);
        org.junit.Assert.assertNotNull(cSVFormat69);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertArrayEquals(objArray70, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat71);
        org.junit.Assert.assertNotNull(cSVFormat72);
        org.junit.Assert.assertNotNull(cSVFormat73);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote(' ');
        boolean boolean5 = cSVFormat4.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withCommentMarker('4');
        java.lang.Class<?> wildcardClass10 = cSVFormat9.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withQuote((java.lang.Character) 'a');
        java.lang.String str10 = cSVFormat4.getRecordSeparator();
        java.sql.ResultSet resultSet11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat4.withHeader(resultSet11);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "a" + "'", str10, "a");
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        char char1 = cSVFormat0.getDelimiter();
        boolean boolean2 = cSVFormat0.getIgnoreHeaderCase();
        boolean boolean3 = cSVFormat0.isNullStringSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ',' + "'", char1 == ',');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAllowMissingColumnNames(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray9 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withHeaderComments(objArray9);
        org.apache.commons.csv.QuoteMode quoteMode11 = cSVFormat10.getQuoteMode();
        boolean boolean12 = cSVFormat10.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(quoteMode11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSet7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withAllowMissingColumnNames(true);
        boolean boolean11 = cSVFormat8.isEscapeCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape(',');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreSurroundingSpaces();
        java.lang.Object obj7 = new java.lang.Object();
        boolean boolean8 = cSVFormat4.equals(obj7);
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withRecordSeparator('a');
        java.lang.String[] strArray14 = cSVFormat13.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat21.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray26 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat21.withHeaderComments(objArray26);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat16.withHeaderComments(objArray26);
        boolean boolean29 = cSVFormat28.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat35.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray40 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat35.withHeaderComments(objArray40);
        java.lang.Object[] objArray42 = new java.lang.Object[] { cSVFormat35 };
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat30.withHeaderComments(objArray42);
        java.lang.String str44 = cSVFormat28.format(objArray42);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat4.withHeaderComments(objArray42);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat4.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat46.withIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertArrayEquals(objArray26, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertArrayEquals(objArray40, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false]");
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "4Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false4a" + "'", str44, "4Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false4a");
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat47);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        boolean boolean2 = cSVFormat1.getSkipHeaderRecord();
        java.sql.ResultSet resultSet3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeader(resultSet3);
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray14 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat9.withHeaderComments(objArray14);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat9.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withIgnoreSurroundingSpaces();
        java.sql.ResultSetMetaData resultSetMetaData18 = null;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withHeader(resultSetMetaData18);
        boolean boolean20 = cSVFormat1.equals((java.lang.Object) resultSetMetaData18);
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.TDF + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.TDF));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreSurroundingSpaces();
        boolean boolean2 = cSVFormat1.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withNullString("\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false\"a");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withAllowMissingColumnNames(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSet7);
        boolean boolean9 = cSVFormat8.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withEscape((java.lang.Character) 'a');
        java.lang.Character char12 = cSVFormat11.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withQuote(' ');
        java.lang.String[] strArray19 = new java.lang.String[] { "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false\"a", "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false\"a", "a", "Delimiter=<,> QuoteChar=<4> NullString=<Delimiter=<,> Escape=< > QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false HeaderComments:[]" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat14.withHeader(strArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The header contains a duplicate entry: '\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false\"a' in [\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false\"a, \"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false\"a, a, Delimiter=<,> QuoteChar=<4> NullString=<Delimiter=<,> Escape=< > QuoteChar=<\"> RecordSeparator=<??> SkipHeaderRecord:false> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false HeaderComments:[]]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\"' + "'", char12 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false\"a", "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false\"a", "a", "Delimiter=<,> QuoteChar=<4> NullString=<Delimiter=<,> Escape=< > QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false HeaderComments:[]" });
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withQuote((java.lang.Character) '4');
        boolean boolean8 = cSVFormat7.getAllowMissingColumnNames();
        java.lang.Character char9 = cSVFormat7.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withQuote('a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '4' + "'", char9 == '4');
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat15.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray20 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat15.withHeaderComments(objArray20);
        java.lang.Object[] objArray22 = new java.lang.Object[] { cSVFormat15 };
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat10.withHeaderComments(objArray22);
        java.lang.String str24 = cSVFormat4.format(objArray22);
        boolean boolean25 = cSVFormat4.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat4.withSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertArrayEquals(objArray20, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false]");
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false\"a" + "'", str24, "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false\"a");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cSVFormat26);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withHeaderComments(objArray17);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat7.withHeaderComments(objArray17);
        boolean boolean20 = cSVFormat19.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withQuote('4');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withRecordSeparator("");
        java.lang.Character char28 = cSVFormat27.getEscapeCharacter();
        java.lang.Character char29 = cSVFormat27.getEscapeCharacter();
        org.apache.commons.csv.QuoteMode quoteMode30 = null;
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat27.withQuoteMode(quoteMode30);
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withRecordSeparator('a');
        java.lang.String[] strArray37 = cSVFormat36.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withRecordSeparator('a');
        java.lang.String[] strArray43 = cSVFormat42.getHeader();
        java.lang.String[] strArray44 = cSVFormat42.getHeaderComments();
        java.lang.Object[] objArray46 = new java.lang.Object[] { cSVFormat27, strArray37, cSVFormat42, "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat24.withHeaderComments((java.lang.Object[]) strArray37);
        java.lang.Character char48 = cSVFormat24.getQuoteCharacter();
        java.sql.ResultSetMetaData resultSetMetaData49 = null;
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat24.withHeader(resultSetMetaData49);
        java.lang.String[] strArray51 = cSVFormat50.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNull(char28);
        org.junit.Assert.assertNull(char29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNull(strArray37);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNull(strArray43);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<> EmptyLines:ignored SkipHeaderRecord:false, null, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<> EmptyLines:ignored SkipHeaderRecord:false, null, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false, hi!]");
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertTrue("'" + char48 + "' != '" + '4' + "'", char48 == '4');
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNull(strArray51);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreSurroundingSpaces(false);
        boolean boolean3 = cSVFormat2.isQuoteCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withIgnoreEmptyLines(true);
        boolean boolean9 = cSVFormat8.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withAllowMissingColumnNames();
        java.sql.ResultSet resultSet11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withHeader(resultSet11);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withSkipHeaderRecord(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSet7);
        boolean boolean9 = cSVFormat8.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withEscape((java.lang.Character) 'a');
        java.lang.Character char12 = cSVFormat11.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withQuote(' ');
        boolean boolean15 = cSVFormat11.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withRecordSeparator('4');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\"' + "'", char12 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray9 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withHeaderComments(objArray9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote(' ');
        boolean boolean5 = cSVFormat4.getIgnoreSurroundingSpaces();
        boolean boolean6 = cSVFormat4.getSkipHeaderRecord();
        java.lang.String[] strArray7 = cSVFormat4.getHeaderComments();
        java.sql.ResultSetMetaData resultSetMetaData8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withHeader(resultSetMetaData8);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSet7);
        boolean boolean9 = cSVFormat8.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withEscape((java.lang.Character) 'a');
        java.lang.Character char12 = cSVFormat11.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withQuote(' ');
        boolean boolean15 = cSVFormat11.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat11.withSkipHeaderRecord();
        org.apache.commons.csv.QuoteMode quoteMode18 = cSVFormat11.getQuoteMode();
        boolean boolean19 = cSVFormat11.isQuoteCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\"' + "'", char12 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNull(quoteMode18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreHeaderCase(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('4');
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withDelimiter(' ');
        java.lang.Character char5 = cSVFormat4.getEscapeCharacter();
        org.apache.commons.csv.QuoteMode quoteMode6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withQuoteMode(quoteMode6);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray9 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withHeaderComments(objArray9);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat4.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withIgnoreSurroundingSpaces();
        java.sql.ResultSetMetaData resultSetMetaData13 = null;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withHeader(resultSetMetaData13);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withEscape((java.lang.Character) '\"');
        java.lang.String[] strArray17 = cSVFormat16.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNull(strArray17);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withHeaderComments(objArray17);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat7.withHeaderComments(objArray17);
        boolean boolean20 = cSVFormat19.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withQuote('4');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withRecordSeparator("");
        java.lang.Character char28 = cSVFormat27.getEscapeCharacter();
        java.lang.Character char29 = cSVFormat27.getEscapeCharacter();
        org.apache.commons.csv.QuoteMode quoteMode30 = null;
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat27.withQuoteMode(quoteMode30);
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withRecordSeparator('a');
        java.lang.String[] strArray37 = cSVFormat36.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withRecordSeparator('a');
        java.lang.String[] strArray43 = cSVFormat42.getHeader();
        java.lang.String[] strArray44 = cSVFormat42.getHeaderComments();
        java.lang.Object[] objArray46 = new java.lang.Object[] { cSVFormat27, strArray37, cSVFormat42, "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat24.withHeaderComments((java.lang.Object[]) strArray37);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat47.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat47.withRecordSeparator("");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNull(char28);
        org.junit.Assert.assertNull(char29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNull(strArray37);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNull(strArray43);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<> EmptyLines:ignored SkipHeaderRecord:false, null, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<> EmptyLines:ignored SkipHeaderRecord:false, null, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false, hi!]");
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat51);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withAllowMissingColumnNames(false);
        org.apache.commons.csv.QuoteMode quoteMode9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withQuoteMode(quoteMode9);
        boolean boolean11 = cSVFormat4.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat4.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withRecordSeparator("");
        java.lang.Character char18 = cSVFormat17.getEscapeCharacter();
        java.lang.Character char19 = cSVFormat17.getEscapeCharacter();
        org.apache.commons.csv.QuoteMode quoteMode20 = null;
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat17.withQuoteMode(quoteMode20);
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat26.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray31 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat26.withHeaderComments(objArray31);
        java.lang.String str33 = cSVFormat17.format(objArray31);
        java.sql.ResultSet resultSet34 = null;
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat17.withHeader(resultSet34);
        boolean boolean36 = cSVFormat14.equals((java.lang.Object) cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNull(char18);
        org.junit.Assert.assertNull(char19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertArrayEquals(objArray31, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withAllowMissingColumnNames(false);
        org.apache.commons.csv.QuoteMode quoteMode9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withQuoteMode(quoteMode9);
        boolean boolean11 = cSVFormat4.getSkipHeaderRecord();
        java.lang.Appendable appendable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter13 = cSVFormat4.print(appendable12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        java.lang.Character char3 = cSVFormat2.getEscapeCharacter();
        java.lang.Character char4 = cSVFormat2.getEscapeCharacter();
        org.apache.commons.csv.QuoteMode quoteMode5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withQuoteMode(quoteMode5);
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray16 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat11.withHeaderComments(objArray16);
        java.lang.String str18 = cSVFormat2.format(objArray16);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat2.withIgnoreSurroundingSpaces(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNull(char4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(cSVFormat20);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        java.lang.Character char3 = cSVFormat2.getEscapeCharacter();
        java.lang.Character char4 = cSVFormat2.getEscapeCharacter();
        org.apache.commons.csv.QuoteMode quoteMode5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withQuoteMode(quoteMode5);
        java.lang.String str7 = cSVFormat6.getRecordSeparator();
        boolean boolean8 = cSVFormat6.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNull(char4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSet7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withRecordSeparator("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withIgnoreSurroundingSpaces();
        boolean boolean14 = cSVFormat12.getIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSet7);
        org.apache.commons.csv.QuoteMode quoteMode9 = cSVFormat8.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withQuote('#');
        boolean boolean13 = cSVFormat12.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(quoteMode9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withEscape('\"');
        java.lang.String[] strArray3 = cSVFormat2.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withCommentMarker('a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        char char1 = cSVFormat0.getDelimiter();
        boolean boolean2 = cSVFormat0.isQuoteCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ',' + "'", char1 == ',');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSet7);
        boolean boolean9 = cSVFormat8.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withEscape((java.lang.Character) 'a');
        java.lang.Character char12 = cSVFormat11.getQuoteCharacter();
        boolean boolean13 = cSVFormat11.isQuoteCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\"' + "'", char12 == '\"');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withHeaderComments(objArray17);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat7.withHeaderComments(objArray17);
        boolean boolean20 = cSVFormat19.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat26.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray31 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat26.withHeaderComments(objArray31);
        java.lang.Object[] objArray33 = new java.lang.Object[] { cSVFormat26 };
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat21.withHeaderComments(objArray33);
        java.lang.String str35 = cSVFormat19.format(objArray33);
        boolean boolean36 = cSVFormat19.isQuoteCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertArrayEquals(objArray31, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false]");
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "4Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false4a" + "'", str35, "4Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false4a");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote(' ');
        java.lang.String str5 = cSVFormat0.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withEscape('\"');
        java.lang.Character char8 = cSVFormat0.getCommentMarker();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\r\n" + "'", str5, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(char8);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withHeaderComments(objArray17);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat7.withHeaderComments(objArray17);
        boolean boolean20 = cSVFormat19.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withQuote('4');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat19.withNullString("4Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false4a");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSet7);
        boolean boolean9 = cSVFormat8.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withEscape((java.lang.Character) 'a');
        java.lang.Character char12 = cSVFormat11.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withQuote(' ');
        boolean boolean15 = cSVFormat11.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat11.withIgnoreHeaderCase(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\"' + "'", char12 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withSkipHeaderRecord();
        char char5 = cSVFormat3.getDelimiter();
        java.lang.String str6 = cSVFormat3.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + ',' + "'", char5 == ',');
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        char char1 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withSkipHeaderRecord();
        boolean boolean5 = cSVFormat4.getAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ',' + "'", char1 == ',');
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withHeaderComments(objArray17);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat7.withHeaderComments(objArray17);
        boolean boolean20 = cSVFormat19.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat26.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray31 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat26.withHeaderComments(objArray31);
        java.lang.Object[] objArray33 = new java.lang.Object[] { cSVFormat26 };
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat21.withHeaderComments(objArray33);
        java.lang.String str35 = cSVFormat19.format(objArray33);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat19.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat19.withRecordSeparator('4');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertArrayEquals(objArray31, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false]");
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "4Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false4a" + "'", str35, "4Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false4a");
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withRecordSeparator("");
        boolean boolean8 = cSVFormat7.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withCommentMarker((java.lang.Character) ',');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withHeaderComments(objArray17);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat7.withHeaderComments(objArray17);
        boolean boolean20 = cSVFormat19.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withQuote('4');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withRecordSeparator("");
        java.lang.Character char28 = cSVFormat27.getEscapeCharacter();
        java.lang.Character char29 = cSVFormat27.getEscapeCharacter();
        org.apache.commons.csv.QuoteMode quoteMode30 = null;
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat27.withQuoteMode(quoteMode30);
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withRecordSeparator('a');
        java.lang.String[] strArray37 = cSVFormat36.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withRecordSeparator('a');
        java.lang.String[] strArray43 = cSVFormat42.getHeader();
        java.lang.String[] strArray44 = cSVFormat42.getHeaderComments();
        java.lang.Object[] objArray46 = new java.lang.Object[] { cSVFormat27, strArray37, cSVFormat42, "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat24.withHeaderComments((java.lang.Object[]) strArray37);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat47.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat47.withDelimiter('#');
        boolean boolean52 = cSVFormat47.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNull(char28);
        org.junit.Assert.assertNull(char29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNull(strArray37);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNull(strArray43);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<> EmptyLines:ignored SkipHeaderRecord:false, null, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<> EmptyLines:ignored SkipHeaderRecord:false, null, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false, hi!]");
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        java.lang.String[] strArray6 = cSVFormat4.getHeaderComments();
        java.lang.String[] strArray7 = cSVFormat4.getHeader();
        boolean boolean8 = cSVFormat4.getSkipHeaderRecord();
        java.lang.Character char9 = cSVFormat4.getEscapeCharacter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(char9);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        char char1 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        boolean boolean6 = cSVFormat0.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ',' + "'", char1 == ',');
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withSkipHeaderRecord();
        boolean boolean5 = cSVFormat3.getIgnoreEmptyLines();
        java.lang.String[] strArray6 = cSVFormat3.getHeaderComments();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strArray6);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.String[] strArray1 = cSVFormat0.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withCommentMarker('a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(strArray1);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withHeaderComments(objArray17);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat7.withHeaderComments(objArray17);
        boolean boolean20 = cSVFormat19.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withQuote('4');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat22.withQuote('\"');
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat22.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat22.withSkipHeaderRecord(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withHeaderComments(objArray17);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat7.withHeaderComments(objArray17);
        boolean boolean20 = cSVFormat19.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withQuote('4');
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withRecordSeparator('a');
        java.lang.String[] strArray28 = cSVFormat27.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat27.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat35.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray40 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat35.withHeaderComments(objArray40);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat30.withHeaderComments(objArray40);
        boolean boolean43 = cSVFormat42.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat44 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat45 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat45.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat47.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat49.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat49.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray54 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat49.withHeaderComments(objArray54);
        java.lang.Object[] objArray56 = new java.lang.Object[] { cSVFormat49 };
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat44.withHeaderComments(objArray56);
        java.lang.String str58 = cSVFormat42.format(objArray56);
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat19.withHeaderComments(objArray56);
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat59.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat59.withDelimiter('\"');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNull(strArray28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertArrayEquals(objArray40, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertArrayEquals(objArray54, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false]");
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "4Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false4a" + "'", str58, "4Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false4a");
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertNotNull(cSVFormat63);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        char char1 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withSkipHeaderRecord();
        boolean boolean5 = cSVFormat3.isCommentMarkerSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ',' + "'", char1 == ',');
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote(' ');
        boolean boolean5 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withIgnoreHeaderCase(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withHeaderComments(objArray17);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat7.withHeaderComments(objArray17);
        boolean boolean20 = cSVFormat19.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withQuote('4');
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withRecordSeparator('a');
        java.lang.String[] strArray28 = cSVFormat27.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat27.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat35.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray40 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat35.withHeaderComments(objArray40);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat30.withHeaderComments(objArray40);
        boolean boolean43 = cSVFormat42.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat44 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat45 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat45.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat47.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat49.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat49.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray54 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat49.withHeaderComments(objArray54);
        java.lang.Object[] objArray56 = new java.lang.Object[] { cSVFormat49 };
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat44.withHeaderComments(objArray56);
        java.lang.String str58 = cSVFormat42.format(objArray56);
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat19.withHeaderComments(objArray56);
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat59.withIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode62 = null;
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat61.withQuoteMode(quoteMode62);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNull(strArray28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertArrayEquals(objArray40, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertArrayEquals(objArray54, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false]");
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "4Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false4a" + "'", str58, "4Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false4a");
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertNotNull(cSVFormat63);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withHeaderComments(objArray17);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat7.withHeaderComments(objArray17);
        boolean boolean20 = cSVFormat19.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withQuote('4');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withRecordSeparator("");
        java.lang.Character char28 = cSVFormat27.getEscapeCharacter();
        java.lang.Character char29 = cSVFormat27.getEscapeCharacter();
        org.apache.commons.csv.QuoteMode quoteMode30 = null;
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat27.withQuoteMode(quoteMode30);
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withRecordSeparator('a');
        java.lang.String[] strArray37 = cSVFormat36.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withRecordSeparator('a');
        java.lang.String[] strArray43 = cSVFormat42.getHeader();
        java.lang.String[] strArray44 = cSVFormat42.getHeaderComments();
        java.lang.Object[] objArray46 = new java.lang.Object[] { cSVFormat27, strArray37, cSVFormat42, "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat24.withHeaderComments((java.lang.Object[]) strArray37);
        java.lang.Character char48 = cSVFormat24.getQuoteCharacter();
        java.sql.ResultSetMetaData resultSetMetaData49 = null;
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat24.withHeader(resultSetMetaData49);
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat24.withRecordSeparator('\"');
        java.lang.Character char53 = cSVFormat24.getEscapeCharacter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNull(char28);
        org.junit.Assert.assertNull(char29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNull(strArray37);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNull(strArray43);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<> EmptyLines:ignored SkipHeaderRecord:false, null, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<> EmptyLines:ignored SkipHeaderRecord:false, null, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false, hi!]");
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertTrue("'" + char48 + "' != '" + '4' + "'", char48 == '4');
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNull(char53);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withHeaderComments(objArray17);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat7.withHeaderComments(objArray17);
        boolean boolean20 = cSVFormat19.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withQuote('4');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withRecordSeparator("");
        java.lang.Character char28 = cSVFormat27.getEscapeCharacter();
        java.lang.Character char29 = cSVFormat27.getEscapeCharacter();
        org.apache.commons.csv.QuoteMode quoteMode30 = null;
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat27.withQuoteMode(quoteMode30);
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withRecordSeparator('a');
        java.lang.String[] strArray37 = cSVFormat36.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withRecordSeparator('a');
        java.lang.String[] strArray43 = cSVFormat42.getHeader();
        java.lang.String[] strArray44 = cSVFormat42.getHeaderComments();
        java.lang.Object[] objArray46 = new java.lang.Object[] { cSVFormat27, strArray37, cSVFormat42, "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat24.withHeaderComments((java.lang.Object[]) strArray37);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat47.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat47.withDelimiter('#');
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat51.withRecordSeparator('\"');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat51.withQuote('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The quoteChar character and the delimiter cannot be the same ('#')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNull(char28);
        org.junit.Assert.assertNull(char29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNull(strArray37);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNull(strArray43);
        org.junit.Assert.assertNull(strArray44);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<> EmptyLines:ignored SkipHeaderRecord:false, null, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<> EmptyLines:ignored SkipHeaderRecord:false, null, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false, hi!]");
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNotNull(cSVFormat53);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withHeaderComments(objArray17);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat7.withHeaderComments(objArray17);
        boolean boolean20 = cSVFormat19.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withQuote('4');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withSkipHeaderRecord(false);
        boolean boolean25 = cSVFormat24.isCommentMarkerSet();
        java.sql.ResultSet resultSet26 = null;
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat24.withHeader(resultSet26);
        java.io.Reader reader28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser29 = cSVFormat27.parse(reader28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cSVFormat27);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreSurroundingSpaces();
        java.lang.String str2 = cSVFormat0.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false" + "'", str2, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray9 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withHeaderComments(objArray9);
        org.apache.commons.csv.QuoteMode quoteMode11 = cSVFormat10.getQuoteMode();
        java.sql.ResultSetMetaData resultSetMetaData12 = null;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withHeader(resultSetMetaData12);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(quoteMode11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withCommentMarker((java.lang.Character) '#');
        java.lang.Character char11 = cSVFormat10.getEscapeCharacter();
        boolean boolean12 = cSVFormat10.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(char11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withHeaderComments(objArray17);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat7.withHeaderComments(objArray17);
        boolean boolean20 = cSVFormat19.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withQuote('4');
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withRecordSeparator('a');
        java.lang.String[] strArray28 = cSVFormat27.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat27.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat35.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray40 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat35.withHeaderComments(objArray40);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat30.withHeaderComments(objArray40);
        boolean boolean43 = cSVFormat42.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat44 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat45 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat45.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat47.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat49.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat49.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray54 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat49.withHeaderComments(objArray54);
        java.lang.Object[] objArray56 = new java.lang.Object[] { cSVFormat49 };
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat44.withHeaderComments(objArray56);
        java.lang.String str58 = cSVFormat42.format(objArray56);
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat19.withHeaderComments(objArray56);
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat59.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat61.withDelimiter(' ');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNull(strArray28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertArrayEquals(objArray40, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertArrayEquals(objArray54, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false]");
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "4Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false4a" + "'", str58, "4Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false4a");
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertNotNull(cSVFormat63);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withHeaderComments(objArray17);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat7.withHeaderComments(objArray17);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat7.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withRecordSeparator('a');
        java.lang.String[] strArray27 = cSVFormat26.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat26.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat34.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray39 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat34.withHeaderComments(objArray39);
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat29.withHeaderComments(objArray39);
        boolean boolean42 = cSVFormat41.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat43 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat44 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat44.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat46.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat48.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat48.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray53 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat48.withHeaderComments(objArray53);
        java.lang.Object[] objArray55 = new java.lang.Object[] { cSVFormat48 };
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat43.withHeaderComments(objArray55);
        java.lang.String str57 = cSVFormat41.format(objArray55);
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat21.withHeaderComments(objArray55);
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat21.withRecordSeparator("\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false\"a");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNull(strArray27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertArrayEquals(objArray39, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertArrayEquals(objArray53, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false]");
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "4Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false4a" + "'", str57, "4Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false4a");
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertNotNull(cSVFormat60);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withHeaderComments(objArray17);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat7.withHeaderComments(objArray17);
        boolean boolean20 = cSVFormat19.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withQuote('4');
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withRecordSeparator('a');
        java.lang.String[] strArray28 = cSVFormat27.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat27.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat35.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray40 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat35.withHeaderComments(objArray40);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat30.withHeaderComments(objArray40);
        boolean boolean43 = cSVFormat42.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat44 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat45 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat45.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat47.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat49.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat49.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray54 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat49.withHeaderComments(objArray54);
        java.lang.Object[] objArray56 = new java.lang.Object[] { cSVFormat49 };
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat44.withHeaderComments(objArray56);
        java.lang.String str58 = cSVFormat42.format(objArray56);
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat19.withHeaderComments(objArray56);
        boolean boolean60 = cSVFormat19.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNull(strArray28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertArrayEquals(objArray40, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertArrayEquals(objArray54, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false]");
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "4Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false4a" + "'", str58, "4Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false4a");
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withHeaderComments(objArray10);
        java.lang.Object[] objArray12 = new java.lang.Object[] { cSVFormat5 };
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withHeaderComments(objArray12);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.QuoteMode quoteMode15 = null;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat0.withQuoteMode(quoteMode15);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false]");
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withDelimiter(' ');
        boolean boolean5 = cSVFormat4.isCommentMarkerSet();
        boolean boolean6 = cSVFormat4.getAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.Excel;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        boolean boolean4 = cSVFormat1.isNullStringSet();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.Excel + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.Excel));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withHeaderComments(objArray10);
        java.lang.Object[] objArray12 = new java.lang.Object[] { cSVFormat5 };
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withHeaderComments(objArray12);
        org.apache.commons.csv.QuoteMode quoteMode14 = cSVFormat0.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat0.withIgnoreSurroundingSpaces(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false]");
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNull(quoteMode14);
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withHeaderComments(objArray10);
        java.lang.Object[] objArray12 = new java.lang.Object[] { cSVFormat5 };
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withHeaderComments(objArray12);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withRecordSeparator("a");
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat16.withDelimiter('4');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false]");
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withRecordSeparator("");
        java.lang.Character char12 = cSVFormat11.getEscapeCharacter();
        java.lang.Character char13 = cSVFormat11.getEscapeCharacter();
        org.apache.commons.csv.QuoteMode quoteMode14 = null;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withQuoteMode(quoteMode14);
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat20.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray25 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat20.withHeaderComments(objArray25);
        java.lang.String str27 = cSVFormat11.format(objArray25);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat8.withHeaderComments(objArray25);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat28.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withDelimiter('a');
        java.io.Reader reader32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser33 = cSVFormat31.parse(reader32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(char12);
        org.junit.Assert.assertNull(char13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertArrayEquals(objArray25, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withDelimiter(' ');
        java.lang.String[] strArray5 = cSVFormat0.getHeaderComments();
        java.lang.String[] strArray6 = cSVFormat0.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        char char2 = cSVFormat1.getDelimiter();
        java.lang.String[] strArray3 = cSVFormat1.getHeaderComments();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withHeaderComments(objArray17);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat7.withHeaderComments(objArray17);
        boolean boolean20 = cSVFormat19.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withQuote('4');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat22.withQuote('\"');
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat22.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withQuote(' ');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSet7);
        boolean boolean9 = cSVFormat8.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withEscape((java.lang.Character) 'a');
        java.lang.Character char12 = cSVFormat11.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withQuote(' ');
        boolean boolean15 = cSVFormat11.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat11.withNullString("Delimiter=<,> QuoteChar=<4> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false HeaderComments:[]");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\"' + "'", char12 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(cSVFormat17);
    }
}

