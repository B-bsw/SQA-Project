package org.apache.commons.lang.text;

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
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        java.io.Writer writer4 = strBuilder3.asWriter();
        java.io.Writer writer6 = writer4.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder10.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer14 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list15 = strTokenizer14.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer16 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher17 = strTokenizer16.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = strTokenizer14.setDelimiterMatcher(strMatcher17);
        int int20 = strBuilder13.indexOf(strMatcher17, (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer25 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher26 = strTokenizer25.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder22.deleteAll(strMatcher26);
        java.lang.StringBuffer stringBuffer28 = strBuilder27.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder13.append(stringBuffer28, (int) (short) 0, 0);
        java.io.Writer writer32 = writer6.append((java.lang.CharSequence) stringBuffer28);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("hi!");
        boolean boolean35 = strBuilder34.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder34.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder34.deleteAll('#');
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder40.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer43 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher44 = strTokenizer43.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder40.deleteAll(strMatcher44);
        java.lang.StringBuffer stringBuffer46 = strBuilder45.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder38.append(stringBuffer46);
        java.io.Writer writer48 = writer6.append((java.lang.CharSequence) stringBuffer46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer28 and stringBuffer46", (stringBuffer28.compareTo(stringBuffer46) == 0) == stringBuffer28.equals(stringBuffer46));
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        int int4 = strBuilder3.capacity();
        int int6 = strBuilder3.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder7.deleteFirst('#');
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter10 = strBuilder7.new StrBuilderWriter();
        java.io.Writer writer12 = strBuilderWriter10.append(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder16.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list21 = strTokenizer20.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer22 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher23 = strTokenizer22.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = strTokenizer20.setDelimiterMatcher(strMatcher23);
        int int26 = strBuilder19.indexOf(strMatcher23, (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder28.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer31 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher32 = strTokenizer31.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder28.deleteAll(strMatcher32);
        java.lang.StringBuffer stringBuffer34 = strBuilder33.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder19.append(stringBuffer34, (int) (short) 0, 0);
        java.io.Writer writer38 = strBuilderWriter10.append((java.lang.CharSequence) stringBuffer34);
        strBuilderWriter10.flush();
        org.apache.commons.lang.text.StrBuilder strBuilder41 = new org.apache.commons.lang.text.StrBuilder("hi!");
        boolean boolean42 = strBuilder41.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder41.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder41.deleteAll('#');
        org.apache.commons.lang.text.StrBuilder strBuilder47 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder47.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer50 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher51 = strTokenizer50.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder47.deleteAll(strMatcher51);
        java.lang.StringBuffer stringBuffer53 = strBuilder52.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder45.append(stringBuffer53);
        java.io.Writer writer55 = strBuilderWriter10.append((java.lang.CharSequence) stringBuffer53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer34 and stringBuffer53", (stringBuffer34.compareTo(stringBuffer53) == 0) == stringBuffer34.equals(stringBuffer53));
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        char[] charArray4 = null;
        char[] charArray5 = strBuilder1.getChars(charArray4);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder("hi!");
        boolean boolean8 = strBuilder7.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder7.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder7.deleteAll('#');
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer16 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher17 = strTokenizer16.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder13.deleteAll(strMatcher17);
        java.lang.StringBuffer stringBuffer19 = strBuilder18.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder11.append(stringBuffer19);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder1.append(stringBuffer19);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder1.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder1.appendPadding((int) (byte) 100, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder27.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher31 = strTokenizer30.getIgnoredMatcher();
        char[] charArray37 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer38 = strTokenizer30.reset(charArray37);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder29.appendWithSeparators((java.util.Iterator) strTokenizer30, "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher41 = strTokenizer30.getTrimmerMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer43 = strTokenizer30.setEmptyTokenAsNull(false);
        org.apache.commons.lang.text.StrMatcher strMatcher44 = strTokenizer43.getDelimiterMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder46 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder48.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder48.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder46.appendFixedWidthPadRight((java.lang.Object) strBuilder52, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer56 = strBuilder46.asTokenizer();
        int int58 = strBuilder46.indexOf("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder60 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder60.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer63 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher64 = strTokenizer63.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder60.deleteAll(strMatcher64);
        java.lang.StringBuffer stringBuffer66 = strBuilder65.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder46.append(stringBuffer66);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader68 = strBuilder46.new StrBuilderReader();
        org.apache.commons.lang.text.StrBuilder strBuilder70 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder70.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer73 = strBuilder72.new StrBuilderTokenizer();
        char[] charArray74 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer75 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray74);
        java.util.List list78 = strBuilderTokenizer73.tokenize(charArray74, (int) (short) -1, (int) '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer79 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray74);
        org.apache.commons.lang.text.StrTokenizer strTokenizer80 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray74);
        int int81 = strBuilderReader68.read(charArray74);
        org.apache.commons.lang.text.StrTokenizer strTokenizer82 = strTokenizer43.reset(charArray74);
        org.apache.commons.lang.text.StrMatcher strMatcher83 = strTokenizer43.getQuoteMatcher();
        org.apache.commons.lang.text.StrMatcher strMatcher84 = strTokenizer43.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder1.deleteFirst(strMatcher84);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer19 and stringBuffer66", (stringBuffer19.compareTo(stringBuffer66) == 0) == stringBuffer19.equals(stringBuffer66));
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        int int4 = strBuilder3.capacity();
        int int6 = strBuilder3.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder7.deleteFirst('#');
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter10 = strBuilder7.new StrBuilderWriter();
        java.io.Writer writer12 = strBuilderWriter10.append(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder16.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list21 = strTokenizer20.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer22 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher23 = strTokenizer22.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = strTokenizer20.setDelimiterMatcher(strMatcher23);
        int int26 = strBuilder19.indexOf(strMatcher23, (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder28.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer31 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher32 = strTokenizer31.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder28.deleteAll(strMatcher32);
        java.lang.StringBuffer stringBuffer34 = strBuilder33.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder19.append(stringBuffer34, (int) (short) 0, 0);
        java.io.Writer writer38 = strBuilderWriter10.append((java.lang.CharSequence) stringBuffer34);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder40.setLength(0);
        int int43 = strBuilder42.capacity();
        int int45 = strBuilder42.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder42.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder46.deleteFirst('#');
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder46.appendPadding(35, '#');
        boolean boolean53 = strBuilder46.contains('4');
        org.apache.commons.lang.text.StrBuilder strBuilder55 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer56 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder55.append(stringBuffer56, (-1), (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder55.reverse();
        java.lang.StringBuffer stringBuffer61 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder60.append(stringBuffer61);
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder62.deleteFirst("hi!");
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader65 = strBuilder62.new StrBuilderReader();
        org.apache.commons.lang.text.StrBuilder strBuilder67 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder67.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer70 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher71 = strTokenizer70.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder67.deleteAll(strMatcher71);
        java.lang.StringBuffer stringBuffer73 = strBuilder72.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder62.append(stringBuffer73);
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder46.append(stringBuffer73);
        java.io.Writer writer76 = writer38.append((java.lang.CharSequence) stringBuffer73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer34 and stringBuffer73", (stringBuffer34.compareTo(stringBuffer73) == 0) == stringBuffer34.equals(stringBuffer73));
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.append(stringBuffer2, (-1), (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.reverse();
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.append(stringBuffer7);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.deleteFirst("hi!");
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader11 = strBuilder8.new StrBuilderReader();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer16 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher17 = strTokenizer16.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder13.deleteAll(strMatcher17);
        java.lang.StringBuffer stringBuffer19 = strBuilder18.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder8.append(stringBuffer19);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.append((double) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.replaceFirst("i!", "hi!");
        java.lang.String str27 = strBuilder26.getNullText();
        java.lang.StringBuffer stringBuffer28 = strBuilder26.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder22.append(stringBuffer28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer19 and stringBuffer28", (stringBuffer19.compareTo(stringBuffer28) == 0) == stringBuffer19.equals(stringBuffer28));
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        int int7 = strBuilder1.lastIndexOf(strMatcher5, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader10 = strBuilder9.new StrBuilderReader();
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder9.append(stringBuffer11, (int) (short) 0, 3);
        int int16 = strBuilder9.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder20.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder18.appendFixedWidthPadRight((java.lang.Object) strBuilder24, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer28 = strBuilder18.asTokenizer();
        int int30 = strBuilder18.indexOf("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder32.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher36 = strTokenizer35.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder32.deleteAll(strMatcher36);
        java.lang.StringBuffer stringBuffer38 = strBuilder37.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder18.append(stringBuffer38);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader40 = strBuilder18.new StrBuilderReader();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder42.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer45 = strBuilder44.new StrBuilderTokenizer();
        char[] charArray46 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer47 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray46);
        java.util.List list50 = strBuilderTokenizer45.tokenize(charArray46, (int) (short) -1, (int) '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer51 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray46);
        org.apache.commons.lang.text.StrTokenizer strTokenizer52 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray46);
        int int53 = strBuilderReader40.read(charArray46);
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder9.appendFixedWidthPadRight((java.lang.Object) charArray46, 100, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder9.replaceFirst('#', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder61 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer62 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder61.append(stringBuffer62, (-1), (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder61.reverse();
        java.lang.StringBuffer stringBuffer67 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder66.append(stringBuffer67);
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder68.deleteFirst("hi!");
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader71 = strBuilder68.new StrBuilderReader();
        org.apache.commons.lang.text.StrBuilder strBuilder73 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder73.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer76 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher77 = strTokenizer76.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder73.deleteAll(strMatcher77);
        java.lang.StringBuffer stringBuffer79 = strBuilder78.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder68.append(stringBuffer79);
        org.apache.commons.lang.text.StrTokenizer strTokenizer81 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher82 = strTokenizer81.getTrimmerMatcher();
        int int83 = strBuilder68.indexOf(strMatcher82);
        int int84 = strBuilder9.indexOf(strMatcher82);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer38 and stringBuffer79", (stringBuffer38.compareTo(stringBuffer79) == 0) == stringBuffer38.equals(stringBuffer79));
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder3.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer7 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list8 = strTokenizer7.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer9 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher10 = strTokenizer9.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = strTokenizer7.setDelimiterMatcher(strMatcher10);
        int int13 = strBuilder6.indexOf(strMatcher10, (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder6.appendNewLine();
        java.lang.String str17 = strBuilder14.midString((int) (short) 0, 100);
        org.apache.commons.lang.text.StrTokenizer strTokenizer19 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        java.lang.Object obj20 = strTokenizer19.clone();
        int int21 = strTokenizer19.size();
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder14.append((java.lang.Object) int21);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder24.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer28 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        java.lang.Object obj29 = strTokenizer28.clone();
        int int30 = strTokenizer28.size();
        org.apache.commons.lang.text.StrMatcher strMatcher31 = strTokenizer28.getIgnoredMatcher();
        int int33 = strBuilder26.indexOf(strMatcher31, 10);
        java.io.Writer writer34 = strBuilder26.asWriter();
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher36 = strTokenizer35.getIgnoredMatcher();
        char[] charArray42 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer43 = strTokenizer35.reset(charArray42);
        org.apache.commons.lang.text.StrTokenizer strTokenizer44 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray42);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder46.setLength(0);
        java.io.Writer writer49 = strBuilder48.asWriter();
        org.apache.commons.lang.text.StrTokenizer strTokenizer50 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher51 = strTokenizer50.getIgnoredMatcher();
        int int52 = strBuilder48.indexOf(strMatcher51);
        org.apache.commons.lang.text.StrTokenizer strTokenizer53 = strTokenizer44.setDelimiterMatcher(strMatcher51);
        org.apache.commons.lang.text.StrTokenizer strTokenizer55 = strTokenizer53.setEmptyTokenAsNull(true);
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder26.appendWithSeparators((java.util.Iterator) strTokenizer55, "4   4");
        boolean boolean58 = strTokenizer55.isIgnoreEmptyTokens();
        org.apache.commons.lang.text.StrMatcher strMatcher59 = strTokenizer55.getTrimmerMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder14.deleteFirst(strMatcher59);
        org.apache.commons.lang.text.StrBuilder strBuilder62 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder62.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder64.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer68 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list69 = strTokenizer68.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer70 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher71 = strTokenizer70.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer72 = strTokenizer68.setDelimiterMatcher(strMatcher71);
        int int74 = strBuilder67.indexOf(strMatcher71, (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder76 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder76.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer79 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher80 = strTokenizer79.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder76.deleteAll(strMatcher80);
        java.lang.StringBuffer stringBuffer82 = strBuilder81.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder67.append(stringBuffer82, (int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder86 = strBuilder85.reverse();
        java.lang.StringBuffer stringBuffer87 = strBuilder86.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder88 = strBuilder14.append(stringBuffer87);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer82 and stringBuffer87", (stringBuffer82.compareTo(stringBuffer87) == 0) == stringBuffer82.equals(stringBuffer87));
    }
}

