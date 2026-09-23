package org.apache.commons.csv;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

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
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withEscape(' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat2", cSVFormat0.equals(cSVFormat2) ? cSVFormat0.hashCode() == cSVFormat2.hashCode() : true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreHeaderCase();
        java.lang.Class<?> wildcardClass3 = cSVFormat0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat2", cSVFormat0.equals(cSVFormat2) ? cSVFormat0.hashCode() == cSVFormat2.hashCode() : true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("4Delimiter=<,> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SkipHeaderRecord:false4a");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat2", cSVFormat0.equals(cSVFormat2) ? cSVFormat0.hashCode() == cSVFormat2.hashCode() : true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray13 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withHeaderComments(objArray13);
        java.lang.Object[] objArray15 = new java.lang.Object[] { cSVFormat8 };
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat3.withHeaderComments(objArray15);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat2.withHeaderComments(objArray15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat2", cSVFormat0.equals(cSVFormat2) ? cSVFormat0.hashCode() == cSVFormat2.hashCode() : true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
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
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat4.withIgnoreSurroundingSpaces(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat4 and cSVFormat13", cSVFormat4.equals(cSVFormat13) ? cSVFormat4.hashCode() == cSVFormat13.hashCode() : true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreHeaderCase();
        java.lang.Character char2 = cSVFormat1.getEscapeCharacter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat1", cSVFormat0.equals(cSVFormat1) ? cSVFormat0.hashCode() == cSVFormat1.hashCode() : true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('a');
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withIgnoreHeaderCase(false);
        java.sql.ResultSet resultSet13 = null;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withHeader(resultSet13);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat17.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat20.withSkipHeaderRecord();
        java.lang.String[] strArray22 = cSVFormat20.getHeader();
        java.lang.String str23 = cSVFormat20.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat24.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat.Predefined predefined26 = org.apache.commons.csv.CSVFormat.Predefined.MySQL;
        org.apache.commons.csv.CSVFormat cSVFormat27 = predefined26.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withRecordSeparator("");
        java.lang.Character char32 = cSVFormat31.getEscapeCharacter();
        java.lang.Character char33 = cSVFormat31.getEscapeCharacter();
        org.apache.commons.csv.QuoteMode quoteMode34 = null;
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat31.withQuoteMode(quoteMode34);
        org.apache.commons.csv.CSVFormat cSVFormat36 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat36.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat40.withIgnoreEmptyLines(true);
        java.lang.Object[] objArray45 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat40.withHeaderComments(objArray45);
        java.lang.String str47 = cSVFormat31.format(objArray45);
        java.lang.Object[] objArray48 = new java.lang.Object[] { cSVFormat16, cSVFormat20, cSVFormat24, predefined26, (-1L), objArray45 };
        java.lang.String str49 = cSVFormat4.format(objArray45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat17 and cSVFormat25", cSVFormat17.equals(cSVFormat25) ? cSVFormat17.hashCode() == cSVFormat25.hashCode() : true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('#');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat1", cSVFormat0.equals(cSVFormat1) ? cSVFormat0.hashCode() == cSVFormat1.hashCode() : true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker((java.lang.Character) ' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat1", cSVFormat0.equals(cSVFormat1) ? cSVFormat0.hashCode() == cSVFormat1.hashCode() : true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreHeaderCase(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat1", cSVFormat0.equals(cSVFormat1) ? cSVFormat0.hashCode() == cSVFormat1.hashCode() : true);
    }
}

