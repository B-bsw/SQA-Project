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
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("hi!");
        boolean boolean37 = strBuilder36.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder38.deleteFirst("StrTokenizer[not tokenized yet]");
        int int42 = strBuilder38.indexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder44.setLength(0);
        java.io.Writer writer47 = strBuilder46.asWriter();
        java.io.Writer writer49 = writer47.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder51 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder51.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder53.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer57 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list58 = strTokenizer57.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer59 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher60 = strTokenizer59.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer61 = strTokenizer57.setDelimiterMatcher(strMatcher60);
        int int63 = strBuilder56.indexOf(strMatcher60, (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder65 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder65.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer68 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher69 = strTokenizer68.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder65.deleteAll(strMatcher69);
        java.lang.StringBuffer stringBuffer71 = strBuilder70.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder56.append(stringBuffer71, (int) (short) 0, 0);
        java.io.Writer writer75 = writer49.append((java.lang.CharSequence) stringBuffer71);
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder38.append(stringBuffer71);
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder34.append(stringBuffer71, 0, 0);
        java.io.Writer writer80 = writer32.append((java.lang.CharSequence) stringBuffer71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer28 and stringBuffer71", (stringBuffer28.compareTo(stringBuffer71) == 0) == stringBuffer28.equals(stringBuffer71));
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder3.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder10.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder8.appendFixedWidthPadRight((java.lang.Object) strBuilder14, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = strBuilder8.asTokenizer();
        int int20 = strBuilder8.indexOf("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer25 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher26 = strTokenizer25.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder22.deleteAll(strMatcher26);
        java.lang.StringBuffer stringBuffer28 = strBuilder27.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder8.append(stringBuffer28);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder6.append(stringBuffer28);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer33 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder32.append(stringBuffer33, (-1), (int) ' ');
        char[] charArray37 = strBuilder36.toCharArray();
        boolean boolean38 = strBuilder6.equals(strBuilder36);
        char[] charArray40 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder36.insert(3, charArray40, (int) (byte) -1, (int) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder45.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder47.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrBuilder strBuilder52 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder54 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder54.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder54.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder52.appendFixedWidthPadRight((java.lang.Object) strBuilder58, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer62 = strBuilder52.asTokenizer();
        int int64 = strBuilder52.indexOf("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder66 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder66.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer69 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher70 = strTokenizer69.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder66.deleteAll(strMatcher70);
        java.lang.StringBuffer stringBuffer72 = strBuilder71.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder52.append(stringBuffer72);
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder50.append(stringBuffer72);
        org.apache.commons.lang.text.StrBuilder strBuilder76 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer77 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder76.append(stringBuffer77, (-1), (int) ' ');
        char[] charArray81 = strBuilder80.toCharArray();
        boolean boolean82 = strBuilder50.equals(strBuilder80);
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder80.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder87 = strBuilder36.appendFixedWidthPadRight((java.lang.Object) strBuilder80, 3, '#');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer28 and stringBuffer72", (stringBuffer28.compareTo(stringBuffer72) == 0) == stringBuffer28.equals(stringBuffer72));
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        boolean boolean2 = strBuilder1.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.deleteAll('#');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder7.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer10 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher11 = strTokenizer10.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder7.deleteAll(strMatcher11);
        java.lang.StringBuffer stringBuffer13 = strBuilder12.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder5.append(stringBuffer13);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder20.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder18.appendFixedWidthPadRight((java.lang.Object) strBuilder24, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer28 = strBuilder18.asTokenizer();
        int int30 = strBuilder18.lastIndexOf("hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher33 = strTokenizer32.getIgnoredMatcher();
        char[] charArray39 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer40 = strTokenizer32.reset(charArray39);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder18.insert((int) (byte) 1, charArray39);
        strBuilder14.getChars((int) (short) 0, 0, charArray39, (int) (short) 1);
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter44 = strBuilder14.new StrBuilderWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder46 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder46.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder48.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrBuilder strBuilder53 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder55.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder55.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder53.appendFixedWidthPadRight((java.lang.Object) strBuilder59, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer63 = strBuilder53.asTokenizer();
        int int65 = strBuilder53.indexOf("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder67 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder67.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer70 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher71 = strTokenizer70.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder67.deleteAll(strMatcher71);
        java.lang.StringBuffer stringBuffer73 = strBuilder72.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder53.append(stringBuffer73);
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder51.append(stringBuffer73);
        boolean boolean76 = strBuilder75.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder75.setNullText("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder14.append((java.lang.Object) strBuilder78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer13 and stringBuffer73", (stringBuffer13.compareTo(stringBuffer73) == 0) == stringBuffer13.equals(stringBuffer73));
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer8 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher9 = strTokenizer8.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder5.deleteAll(strMatcher9);
        java.lang.StringBuffer stringBuffer11 = strBuilder10.toStringBuffer();
        boolean boolean12 = strBuilder3.equals((java.lang.Object) strBuilder10);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.ensureCapacity((int) (short) 10);
        org.apache.commons.lang.text.StrTokenizer strTokenizer16 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = strTokenizer16.setIgnoreEmptyTokens(false);
        java.lang.String str19 = strTokenizer18.previousToken();
        java.lang.String[] strArray20 = strTokenizer18.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder3.appendWithSeparators((java.util.Iterator) strTokenizer18, "hi!");
        java.lang.String str23 = strBuilder3.toString();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder3.append('4');
        java.lang.String str26 = strBuilder25.getNewLineText();
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder28.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer31 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher32 = strTokenizer31.getIgnoredMatcher();
        char[] charArray38 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer39 = strTokenizer31.reset(charArray38);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder30.appendWithSeparators((java.util.Iterator) strTokenizer31, "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher42 = strTokenizer31.getTrimmerMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer44 = strTokenizer31.setEmptyTokenAsNull(false);
        org.apache.commons.lang.text.StrMatcher strMatcher45 = strTokenizer44.getDelimiterMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder47 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder49 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder49.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder49.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder47.appendFixedWidthPadRight((java.lang.Object) strBuilder53, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer57 = strBuilder47.asTokenizer();
        int int59 = strBuilder47.indexOf("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder61 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder61.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer64 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher65 = strTokenizer64.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder61.deleteAll(strMatcher65);
        java.lang.StringBuffer stringBuffer67 = strBuilder66.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder47.append(stringBuffer67);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader69 = strBuilder47.new StrBuilderReader();
        org.apache.commons.lang.text.StrBuilder strBuilder71 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder71.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer74 = strBuilder73.new StrBuilderTokenizer();
        char[] charArray75 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer76 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray75);
        java.util.List list79 = strBuilderTokenizer74.tokenize(charArray75, (int) (short) -1, (int) '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer80 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray75);
        org.apache.commons.lang.text.StrTokenizer strTokenizer81 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray75);
        int int82 = strBuilderReader69.read(charArray75);
        org.apache.commons.lang.text.StrTokenizer strTokenizer83 = strTokenizer44.reset(charArray75);
        char[] charArray84 = strBuilder25.getChars(charArray75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer11 and stringBuffer67", (stringBuffer11.compareTo(stringBuffer67) == 0) == stringBuffer11.equals(stringBuffer67));
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder3.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder10.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder8.appendFixedWidthPadRight((java.lang.Object) strBuilder14, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = strBuilder8.asTokenizer();
        int int20 = strBuilder8.indexOf("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer25 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher26 = strTokenizer25.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder22.deleteAll(strMatcher26);
        java.lang.StringBuffer stringBuffer28 = strBuilder27.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder8.append(stringBuffer28);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder6.append(stringBuffer28);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder6.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder((int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder34.setNullText("!ih");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder6.append(strBuilder34);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder6.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder("hi!");
        boolean boolean43 = strBuilder42.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder42.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder44.deleteFirst("StrTokenizer[not tokenized yet]");
        int int48 = strBuilder44.indexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder50 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder50.setLength(0);
        java.io.Writer writer53 = strBuilder52.asWriter();
        java.io.Writer writer55 = writer53.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder57 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder57.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder59.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer63 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list64 = strTokenizer63.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer65 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher66 = strTokenizer65.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer67 = strTokenizer63.setDelimiterMatcher(strMatcher66);
        int int69 = strBuilder62.indexOf(strMatcher66, (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder71 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder71.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer74 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher75 = strTokenizer74.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder71.deleteAll(strMatcher75);
        java.lang.StringBuffer stringBuffer77 = strBuilder76.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder62.append(stringBuffer77, (int) (short) 0, 0);
        java.io.Writer writer81 = writer55.append((java.lang.CharSequence) stringBuffer77);
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder44.append(stringBuffer77);
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder40.append(stringBuffer77, 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder86 = strBuilder6.append(stringBuffer77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer28 and stringBuffer77", (stringBuffer28.compareTo(stringBuffer77) == 0) == stringBuffer28.equals(stringBuffer77));
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer8 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher9 = strTokenizer8.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder5.deleteAll(strMatcher9);
        java.lang.StringBuffer stringBuffer11 = strBuilder10.toStringBuffer();
        boolean boolean12 = strBuilder3.equals((java.lang.Object) strBuilder10);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.ensureCapacity((int) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.append((long) 40);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer21 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher22 = strTokenizer21.getIgnoredMatcher();
        char[] charArray28 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = strTokenizer21.reset(charArray28);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder20.appendWithSeparators((java.util.Iterator) strTokenizer21, "hi!");
        int int34 = strBuilder20.lastIndexOf("i!", (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer36 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer38 = strTokenizer36.setIgnoreEmptyTokens(false);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder20.appendWithSeparators((java.util.Iterator) strTokenizer38, "i!");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder20.replaceFirst("hi!", " ");
        java.lang.StringBuffer stringBuffer44 = strBuilder20.toStringBuffer();
        java.lang.StringBuffer stringBuffer45 = strBuilder20.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder14.append(stringBuffer45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer44 and stringBuffer45", (stringBuffer44.compareTo(stringBuffer45) == 0) == stringBuffer44.equals(stringBuffer45));
    }
}

