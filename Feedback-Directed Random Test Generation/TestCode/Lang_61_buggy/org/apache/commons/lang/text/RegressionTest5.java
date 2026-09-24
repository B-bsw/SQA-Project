package org.apache.commons.lang.text;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

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
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.append((double) 1.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder3.appendPadding((int) '#', '#');
        char[] charArray9 = strBuilder8.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder8.replaceAll("!ih", "");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.append((double) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder12.insert(7, (long) 105);
        boolean boolean19 = strBuilder12.contains(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder12.append('h');
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strBuilder21);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) strBuilder7, 0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder10.appendNull();
        int int12 = strBuilder11.size;
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.append((double) 3);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder11.insert(0, "i!");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder11.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.setLength(0);
        int int24 = strBuilder23.capacity();
        int int26 = strBuilder23.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder23.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder27.deleteFirst('#');
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter30 = strBuilder27.new StrBuilderWriter();
        strBuilderWriter30.close();
        strBuilderWriter30.write((int) (byte) -1);
        java.io.Writer writer35 = strBuilderWriter30.append('4');
        strBuilderWriter30.flush();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder37.minimizeCapacity();
        char[] charArray39 = strBuilder37.toCharArray();
        strBuilderWriter30.write(charArray39);
        char[] charArray41 = strBuilder11.getChars(charArray39);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(writer35);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] {});
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] { 'i', '!', 'h', 'i', '!', '3', '.', '0', 't', 'r', 'u', 'e' });
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.apache.commons.lang.text.StrTokenizer strTokenizer0 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher1 = strTokenizer0.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer2 = strTokenizer0.reset();
        org.apache.commons.lang.text.StrBuilder strBuilder4 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer5 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.append(stringBuffer5, (-1), (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder4.reverse();
        java.lang.StringBuffer stringBuffer10 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.append(stringBuffer10);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.deleteFirst("hi!");
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader14 = strBuilder11.new StrBuilderReader();
        org.apache.commons.lang.text.StrTokenizer strTokenizer15 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher16 = strTokenizer15.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder11.deleteFirst(strMatcher16);
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = strTokenizer2.setQuoteMatcher(strMatcher16);
        java.lang.String str19 = strTokenizer18.toString();
        org.junit.Assert.assertNotNull(strTokenizer0);
        org.junit.Assert.assertNotNull(strMatcher1);
        org.junit.Assert.assertNotNull(strTokenizer2);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strTokenizer15);
        org.junit.Assert.assertNotNull(strMatcher16);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str19, "StrTokenizer[not tokenized yet]");
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer3 = strTokenizer1.setIgnoreEmptyTokens(false);
        java.lang.String str4 = strTokenizer3.previousToken();
        java.lang.String[] strArray5 = strTokenizer3.getTokenArray();
        java.util.List list6 = strTokenizer3.getTokenList();
        java.lang.String str7 = strTokenizer3.nextToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = strTokenizer3.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertNotNull(strTokenizer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.apache.commons.lang.text.StrTokenizer strTokenizer0 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher1 = strTokenizer0.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer2 = strTokenizer0.reset();
        java.lang.String str3 = strTokenizer0.toString();
        boolean boolean4 = strTokenizer0.isEmptyTokenAsNull();
        org.junit.Assert.assertNotNull(strTokenizer0);
        org.junit.Assert.assertNotNull(strMatcher1);
        org.junit.Assert.assertNotNull(strTokenizer2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str3, "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
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
        int int25 = strBuilder22.lastIndexOf("", (int) '4');
        org.apache.commons.lang.text.StrTokenizer strTokenizer26 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher27 = strTokenizer26.getIgnoredMatcher();
        char[] charArray33 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer34 = strTokenizer26.reset(charArray33);
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray33);
        org.apache.commons.lang.text.StrTokenizer strTokenizer36 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray33);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder22.appendFixedWidthPadRight((java.lang.Object) charArray33, 100, 'a');
        java.io.Writer writer40 = strBuilder22.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder22.clear();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(strMatcher10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n" + "'", str17, "\n");
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertNotNull(strMatcher27);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertNotNull(strTokenizer36);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(writer40);
        org.junit.Assert.assertNotNull(strBuilder41);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        int int7 = strBuilder1.lastIndexOf(strMatcher5, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader10 = strBuilder9.new StrBuilderReader();
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder9.append(stringBuffer11, (int) (short) 0, 3);
        org.apache.commons.lang.text.StrTokenizer strTokenizer15 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher16 = strTokenizer15.getIgnoredMatcher();
        char[] charArray22 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = strTokenizer15.reset(charArray22);
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray22);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder26.setLength(0);
        java.io.Writer writer29 = strBuilder28.asWriter();
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher31 = strTokenizer30.getIgnoredMatcher();
        int int32 = strBuilder28.indexOf(strMatcher31);
        org.apache.commons.lang.text.StrTokenizer strTokenizer33 = strTokenizer24.setDelimiterMatcher(strMatcher31);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder9.replaceFirst(strMatcher31, "\n");
        char[] charArray36 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer37 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray36);
        org.apache.commons.lang.text.StrTokenizer strTokenizer38 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list39 = strTokenizer38.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer40 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher41 = strTokenizer40.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer42 = strTokenizer38.setDelimiterMatcher(strMatcher41);
        org.apache.commons.lang.text.StrTokenizer strTokenizer43 = strTokenizer37.setQuoteMatcher(strMatcher41);
        java.lang.String[] strArray44 = strTokenizer37.getTokenArray();
        org.apache.commons.lang.text.StrTokenizer strTokenizer46 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        java.lang.Object obj47 = strTokenizer46.clone();
        int int48 = strTokenizer46.size();
        org.apache.commons.lang.text.StrMatcher strMatcher49 = strTokenizer46.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer50 = strTokenizer37.setDelimiterMatcher(strMatcher49);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder35.replace(strMatcher49, "hi!", 2, 5, (int) (short) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder57 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder59 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder59.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder59.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder57.appendFixedWidthPadRight((java.lang.Object) strBuilder63, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer67 = strBuilder57.asTokenizer();
        int int69 = strBuilder57.lastIndexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder71 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder71.deleteFirst("");
        char[] charArray74 = null;
        char[] charArray75 = strBuilder71.getChars(charArray74);
        boolean boolean76 = strBuilder57.equals((java.lang.Object) charArray74);
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder57.appendFixedWidthPadRight((java.lang.Object) "\n", 0, ' ');
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader81 = strBuilder80.new StrBuilderReader();
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer82 = strBuilder80.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder55.appendFixedWidthPadLeft((java.lang.Object) strBuilderTokenizer82, (int) '1', 'h');
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strTokenizer15);
        org.junit.Assert.assertNotNull(strMatcher16);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(writer29);
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(strMatcher31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer33);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertNotNull(strTokenizer38);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertNotNull(strMatcher41);
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertNotNull(strTokenizer43);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strTokenizer46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertEquals(obj47.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj47), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj47), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(strMatcher49);
        org.junit.Assert.assertNotNull(strTokenizer50);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strTokenizer67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertArrayEquals(charArray75, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertNotNull(strBuilder85);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        int int7 = strBuilder1.lastIndexOf(strMatcher5, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader10 = strBuilder9.new StrBuilderReader();
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder9.append(stringBuffer11, (int) (short) 0, 3);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer19 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher20 = strTokenizer19.getIgnoredMatcher();
        int int22 = strBuilder16.lastIndexOf(strMatcher20, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder16.append(true);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader25 = strBuilder24.new StrBuilderReader();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder24.append((java.lang.Object) "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder9.append(strBuilder24, 2, (int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder24.setNewLineText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer35 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder34.append(stringBuffer35, (-1), (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder34.reverse();
        char[] charArray40 = strBuilder39.buffer;
        org.apache.commons.lang.text.StrTokenizer strTokenizer41 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray40);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder24.append(charArray40, 0, 1);
        org.apache.commons.lang.text.StrMatcher strMatcher45 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder24.replaceAll(strMatcher45, "truehi!\000\000\000\000\000\000\00038");
        int int48 = strBuilder24.length();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(strMatcher20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertNotNull(strTokenizer41);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 11 + "'", int48 == 11);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder3.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrMatcher strMatcher7 = null;
        int int9 = strBuilder3.lastIndexOf(strMatcher7, (int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder3.append(' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher13 = strTokenizer12.getIgnoredMatcher();
        char[] charArray19 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = strTokenizer12.reset(charArray19);
        int int21 = strTokenizer12.size();
        boolean boolean22 = strTokenizer12.hasNext();
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = strTokenizer12.setIgnoredChar('#');
        org.apache.commons.lang.text.StrMatcher strMatcher25 = strTokenizer12.getDelimiterMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder3.replaceFirst(strMatcher25, "");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder3.append("StrTokenizer[truehi!\000\000\000\000\000\000\00038]");
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strMatcher13);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strMatcher25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder29);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) strBuilder7, 0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder7.append(0L);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.deleteFirst('#');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer19 = strBuilder18.new StrBuilderTokenizer();
        char[] charArray20 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer21 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray20);
        java.util.List list24 = strBuilderTokenizer19.tokenize(charArray20, (int) (short) -1, (int) '#');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder14.appendWithSeparators((java.util.Collection) list24, "\n");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder14.append("hi!truehi");
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder28);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.deleteAll("");
        java.lang.Object obj6 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append(obj6);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.replaceFirst("", "4   4");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder7.insert(0, (double) 10L);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.setNewLineText(" ");
        java.util.Iterator iterator16 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder13.appendWithSeparators(iterator16, "StrTokenizer[]");
        boolean boolean20 = strBuilder13.contains('i');
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.deleteAll("");
        java.lang.Object obj6 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append(obj6);
        java.lang.String str9 = strBuilder5.substring(1);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder5.appendFixedWidthPadRight(33, 0, '#');
        boolean boolean15 = strBuilder13.startsWith("4   4");
        boolean boolean17 = strBuilder13.startsWith("\n");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer22 = strBuilder21.new StrBuilderTokenizer();
        char[] charArray23 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray23);
        java.util.List list27 = strBuilderTokenizer22.tokenize(charArray23, (int) (short) -1, (int) '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = strBuilderTokenizer22.reset("\n");
        java.lang.String str30 = strBuilderTokenizer22.getContent();
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder13.appendFixedWidthPadRight((java.lang.Object) strBuilderTokenizer22, (int) (short) -1, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder33.append('a');
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "i!" + "'", str9, "i!");
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\n" + "'", str30, "\n");
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder35);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        java.io.Writer writer4 = strBuilder3.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.replaceAll("\n", "");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.setLength(0);
        int int14 = strBuilder13.capacity();
        char[] charArray15 = strBuilder13.toCharArray();
        char[] charArray16 = strBuilder5.getChars(charArray15);
        int int17 = strBuilder5.capacity();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder5.insert(0, 'a');
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(writer4);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertNotNull(strBuilder20);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) strBuilder7, 0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder7.append(0L);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder12.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder13.appendPadding(35, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder13.deleteAll("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder13.appendFixedWidthPadLeft((int) (short) 10, (int) (short) 10, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder24.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder24.deleteAll("");
        java.lang.Object obj29 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder28.append(obj29);
        java.lang.String str31 = strBuilder30.getNewLineText();
        int int34 = strBuilder30.lastIndexOf("", 10);
        int int35 = strBuilder30.capacity();
        int int36 = strBuilder30.capacity();
        int int37 = strBuilder30.capacity();
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder30.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder22.append(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 35 + "'", int35 == 35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder40);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        char[] charArray11 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strTokenizer4.reset(charArray11);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.appendWithSeparators((java.util.Iterator) strTokenizer4, "hi!");
        int int17 = strBuilder3.lastIndexOf("i!", (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer19 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer21 = strTokenizer19.setIgnoreEmptyTokens(false);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder3.appendWithSeparators((java.util.Iterator) strTokenizer21, "i!");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder3.replaceFirst("hi!", " ");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder28.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer34 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list35 = strTokenizer34.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer36 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher37 = strTokenizer36.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer38 = strTokenizer34.setDelimiterMatcher(strMatcher37);
        int int40 = strBuilder33.indexOf(strMatcher37, (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder42.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer45 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher46 = strTokenizer45.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder42.deleteAll(strMatcher46);
        java.lang.StringBuffer stringBuffer48 = strBuilder47.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder33.append(stringBuffer48, (int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder51.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder52.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder26.appendFixedWidthPadRight((java.lang.Object) strBuilder53, 3, '4');
        int int57 = strBuilder26.size;
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNotNull(strTokenizer36);
        org.junit.Assert.assertNotNull(strMatcher37);
        org.junit.Assert.assertNotNull(strTokenizer38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strTokenizer45);
        org.junit.Assert.assertNotNull(strMatcher46);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(stringBuffer48);
        org.junit.Assert.assertEquals(stringBuffer48.toString(), "");
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 9 + "'", int57 == 9);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) strBuilder7, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = strBuilder1.asTokenizer();
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader12 = strBuilder1.new StrBuilderReader();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder1.appendPadding(39, '4');
        int int16 = strBuilder1.size();
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 42 + "'", int16 == 42);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        int int4 = strBuilder3.capacity();
        int int6 = strBuilder3.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder7.deleteFirst('#');
        java.lang.String str11 = strBuilder9.rightString(1);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder9.append(true);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strBuilder13);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
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
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.replaceAll("-1", "1.00");
        int int34 = strBuilder30.length();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertNotNull(strMatcher26);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(stringBuffer28);
        org.junit.Assert.assertEquals(stringBuffer28.toString(), "");
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer4 = strBuilder3.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.replaceAll('a', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher13 = strTokenizer12.getIgnoredMatcher();
        int int15 = strBuilder9.lastIndexOf(strMatcher13, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder9.insert((int) (byte) 1, (int) '4');
        org.apache.commons.lang.text.StrTokenizer strTokenizer19 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher20 = strTokenizer19.getIgnoredMatcher();
        char[] charArray26 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = strTokenizer19.reset(charArray26);
        java.lang.String[] strArray28 = strTokenizer27.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder9.appendWithSeparators((java.lang.Object[]) strArray28, "StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder7.appendWithSeparators((java.lang.Object[]) strArray28, "");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer33 = strBuilder32.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder32.deleteAll("4   4");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder35.insert((int) '4', 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strMatcher13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(strMatcher20);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "4   4" });
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder35);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        boolean boolean2 = strBuilder1.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.deleteAll('#');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.ensureCapacity(39);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.insert(1, 10L);
        java.lang.String str13 = strBuilder10.substring((int) (short) 0, 12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h10i!" + "'", str13, "h10i!");
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        int int7 = strBuilder1.lastIndexOf(strMatcher5, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.insert((int) (byte) 1, (int) '4');
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher12 = strTokenizer11.getIgnoredMatcher();
        char[] charArray18 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer19 = strTokenizer11.reset(charArray18);
        java.lang.String[] strArray20 = strTokenizer19.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder1.appendWithSeparators((java.lang.Object[]) strArray20, "StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder22.appendFixedWidthPadLeft((int) 'a', 0, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder22.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.appendPadding(100, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder27.replaceFirst("hi!truehi", "h");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder27.append((long) 33);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder("!ih");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder39.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer42 = strBuilder41.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder41.replaceAll('a', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder41.trim();
        int int48 = strBuilder41.indexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder50 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder50.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer53 = strBuilder52.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrTokenizer strTokenizer54 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list55 = strTokenizer54.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer56 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher57 = strTokenizer56.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer58 = strTokenizer54.setDelimiterMatcher(strMatcher57);
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder52.deleteAll(strMatcher57);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder41.deleteFirst(strMatcher57);
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder37.replace(strMatcher57, " ", 0, (int) ' ', 39);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder35.replace(strMatcher57, "\n#", (int) (short) 1, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertNotNull(strMatcher12);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "4   4" });
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strTokenizer54);
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertNotNull(strTokenizer56);
        org.junit.Assert.assertNotNull(strMatcher57);
        org.junit.Assert.assertNotNull(strTokenizer58);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder65);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) strBuilder7, 0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder10.appendNull();
        java.lang.String str14 = strBuilder11.substring(0, 3);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder11.trim();
        int int17 = strBuilder15.lastIndexOf("!ih");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder15.deleteAll(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder15.setNewLineText("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder23.deleteAll("");
        java.lang.Object obj28 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder27.append(obj28);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder29.replaceFirst("", "4   4");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder32.setLength((int) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder34.ensureCapacity((-1));
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer39 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder38.append(stringBuffer39, (-1), (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder38.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder45 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder45.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer48 = strBuilder47.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder47.replaceAll('a', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder53 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder53.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer56 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher57 = strTokenizer56.getIgnoredMatcher();
        int int59 = strBuilder53.lastIndexOf(strMatcher57, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder53.insert((int) (byte) 1, (int) '4');
        org.apache.commons.lang.text.StrTokenizer strTokenizer63 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher64 = strTokenizer63.getIgnoredMatcher();
        char[] charArray70 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer71 = strTokenizer63.reset(charArray70);
        java.lang.String[] strArray72 = strTokenizer71.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder53.appendWithSeparators((java.lang.Object[]) strArray72, "StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder51.appendWithSeparators((java.lang.Object[]) strArray72, "");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer77 = strBuilder76.new StrBuilderTokenizer();
        char[] charArray78 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder76.append(charArray78);
        org.apache.commons.lang.text.StrBuilder strBuilder81 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer83 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        java.lang.Object obj84 = strTokenizer83.clone();
        int int85 = strTokenizer83.size();
        org.apache.commons.lang.text.StrMatcher strMatcher86 = strTokenizer83.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder88 = strBuilder81.replaceFirst(strMatcher86, "4   4");
        boolean boolean89 = strBuilder76.contains(strMatcher86);
        int int90 = strBuilder43.indexOf(strMatcher86);
        org.apache.commons.lang.text.StrBuilder strBuilder92 = strBuilder36.replaceAll(strMatcher86, "StrTokenizer[]");
        char[] charArray93 = strBuilder92.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder94 = strBuilder21.append(charArray93);
        int int95 = strBuilder21.capacity();
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strTokenizer56);
        org.junit.Assert.assertNotNull(strMatcher57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strTokenizer63);
        org.junit.Assert.assertNotNull(strMatcher64);
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertArrayEquals(charArray70, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer71);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertArrayEquals(strArray72, new java.lang.String[] { "4   4" });
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertNotNull(strTokenizer83);
        org.junit.Assert.assertNotNull(obj84);
        org.junit.Assert.assertEquals(obj84.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj84), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj84), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(strMatcher86);
        org.junit.Assert.assertNotNull(strBuilder88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertNotNull(strBuilder92);
        org.junit.Assert.assertNotNull(charArray93);
        org.junit.Assert.assertArrayEquals(charArray93, new char[] { 'h', 'i', '!', '\000', '\000', '\000', '\000', '\000', '\000', '\000' });
        org.junit.Assert.assertNotNull(strBuilder94);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 35 + "'", int95 == 35);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        int int4 = strBuilder3.capacity();
        int int6 = strBuilder3.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.trim();
        java.lang.String str9 = strBuilder7.rightString((-1));
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        java.lang.Object obj12 = strTokenizer11.clone();
        org.apache.commons.lang.text.StrTokenizer strTokenizer14 = strTokenizer11.setEmptyTokenAsNull(true);
        java.lang.String str15 = strTokenizer11.toString();
        org.apache.commons.lang.text.StrTokenizer strTokenizer17 = strTokenizer11.setDelimiterChar('a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer19 = strTokenizer17.setEmptyTokenAsNull(true);
        org.apache.commons.lang.text.StrTokenizer strTokenizer21 = strTokenizer17.setDelimiterChar('a');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder7.appendFixedWidthPadLeft((java.lang.Object) strTokenizer17, (int) (short) 100, 'a');
        int int27 = strBuilder7.indexOf("StrTokenizer[not tokenized yet]", (int) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder7.insert((int) '#', (-1.0d));
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder30.trim();
        java.lang.String str33 = strBuilder31.substring(100);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strTokenizer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str15, "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "yet]" + "'", str33, "yet]");
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) strBuilder7, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = strBuilder1.asTokenizer();
        int int13 = strBuilder1.lastIndexOf("hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer15 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher16 = strTokenizer15.getIgnoredMatcher();
        char[] charArray22 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = strTokenizer15.reset(charArray22);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder1.insert((int) (byte) 1, charArray22);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder26.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder26.deleteAll("");
        java.lang.Object obj31 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.append(obj31);
        java.lang.String str33 = strBuilder32.getNewLineText();
        java.lang.StringBuffer stringBuffer34 = strBuilder32.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder1.append(stringBuffer34, (int) (byte) 0, 0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer38 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list39 = strTokenizer38.getTokenList();
        int int40 = strTokenizer38.previousIndex();
        java.util.List list41 = strTokenizer38.getTokenList();
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder1.appendWithSeparators((java.util.Collection) list41, "i!");
        int int45 = strBuilder1.lastIndexOf(" 4444444444444444444444444444444444\n");
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strTokenizer15);
        org.junit.Assert.assertNotNull(strMatcher16);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(stringBuffer34);
        org.junit.Assert.assertEquals(stringBuffer34.toString(), "hi!");
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strTokenizer38);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) strBuilder7, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = strBuilder1.asTokenizer();
        int int13 = strBuilder1.lastIndexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.deleteFirst("");
        char[] charArray18 = null;
        char[] charArray19 = strBuilder15.getChars(charArray18);
        boolean boolean20 = strBuilder1.equals((java.lang.Object) charArray18);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) "\n", 0, ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer25 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher26 = strTokenizer25.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = strTokenizer25.reset();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder29.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher33 = strTokenizer32.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder29.deleteAll(strMatcher33);
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = strTokenizer27.setTrimmerMatcher(strMatcher33);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder37.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder39.append((double) 1.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder39.appendPadding((int) '#', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder44.appendFixedWidthPadLeft((int) ' ', 0, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer50 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder52 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder52.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder54.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer58 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list59 = strTokenizer58.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer60 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher61 = strTokenizer60.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer62 = strTokenizer58.setDelimiterMatcher(strMatcher61);
        int int64 = strBuilder57.indexOf(strMatcher61, (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer65 = strTokenizer50.setIgnoredMatcher(strMatcher61);
        int int67 = strBuilder44.lastIndexOf(strMatcher61, (int) (short) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder44.setNullText("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder69.deleteAll('a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer72 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher73 = strTokenizer72.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer74 = strTokenizer72.reset();
        org.apache.commons.lang.text.StrBuilder strBuilder76 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder76.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer79 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher80 = strTokenizer79.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder76.deleteAll(strMatcher80);
        org.apache.commons.lang.text.StrTokenizer strTokenizer82 = strTokenizer74.setTrimmerMatcher(strMatcher80);
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder69.replaceFirst(strMatcher80, "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer85 = strTokenizer27.setIgnoredMatcher(strMatcher80);
        org.apache.commons.lang.text.StrBuilder strBuilder87 = strBuilder24.replaceFirst(strMatcher80, "StrTokenizer[hi!]");
        int int88 = strBuilder24.size();
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertNotNull(strMatcher26);
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(strMatcher33);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strTokenizer50);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strTokenizer58);
        org.junit.Assert.assertNotNull(list59);
        org.junit.Assert.assertNotNull(strTokenizer60);
        org.junit.Assert.assertNotNull(strMatcher61);
        org.junit.Assert.assertNotNull(strTokenizer62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer65);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strTokenizer72);
        org.junit.Assert.assertNotNull(strMatcher73);
        org.junit.Assert.assertNotNull(strTokenizer74);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNotNull(strTokenizer79);
        org.junit.Assert.assertNotNull(strMatcher80);
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertNotNull(strTokenizer82);
        org.junit.Assert.assertNotNull(strBuilder84);
        org.junit.Assert.assertNotNull(strTokenizer85);
        org.junit.Assert.assertNotNull(strBuilder87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 3 + "'", int88 == 3);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.apache.commons.lang.text.StrTokenizer strTokenizer0 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher1 = strTokenizer0.getIgnoredMatcher();
        char[] charArray7 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer8 = strTokenizer0.reset(charArray7);
        org.apache.commons.lang.text.StrTokenizer strTokenizer9 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray7);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.setLength(0);
        java.io.Writer writer14 = strBuilder13.asWriter();
        org.apache.commons.lang.text.StrTokenizer strTokenizer15 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher16 = strTokenizer15.getIgnoredMatcher();
        int int17 = strBuilder13.indexOf(strMatcher16);
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = strTokenizer9.setDelimiterMatcher(strMatcher16);
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = strTokenizer9.setDelimiterString("\n");
        org.apache.commons.lang.text.StrTokenizer strTokenizer22 = strTokenizer9.setIgnoredChar('#');
        org.apache.commons.lang.text.StrMatcher strMatcher23 = strTokenizer22.getTrimmerMatcher();
        org.junit.Assert.assertNotNull(strTokenizer0);
        org.junit.Assert.assertNotNull(strMatcher1);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(writer14);
        org.junit.Assert.assertNotNull(strTokenizer15);
        org.junit.Assert.assertNotNull(strMatcher16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strTokenizer22);
        org.junit.Assert.assertNotNull(strMatcher23);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("StrTokenizer[4   4]");
        java.lang.String[] strArray2 = strTokenizer1.getTokenArray();
        org.apache.commons.lang.text.StrTokenizer strTokenizer3 = strTokenizer1.reset();
        org.apache.commons.lang.text.StrMatcher strMatcher4 = strTokenizer1.getQuoteMatcher();
        int int5 = strTokenizer1.nextIndex();
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "StrTokenizer[4   4]" });
        org.junit.Assert.assertNotNull(strTokenizer3);
        org.junit.Assert.assertNotNull(strMatcher4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer4 = strBuilder3.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.replaceAll('a', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher13 = strTokenizer12.getIgnoredMatcher();
        int int15 = strBuilder9.lastIndexOf(strMatcher13, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder9.insert((int) (byte) 1, (int) '4');
        org.apache.commons.lang.text.StrTokenizer strTokenizer19 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher20 = strTokenizer19.getIgnoredMatcher();
        char[] charArray26 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = strTokenizer19.reset(charArray26);
        java.lang.String[] strArray28 = strTokenizer27.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder9.appendWithSeparators((java.lang.Object[]) strArray28, "StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder7.appendWithSeparators((java.lang.Object[]) strArray28, "");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer33 = strBuilder32.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder32.replaceFirst('4', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder38.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer41 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher42 = strTokenizer41.getIgnoredMatcher();
        char[] charArray48 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer49 = strTokenizer41.reset(charArray48);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder40.appendWithSeparators((java.util.Iterator) strTokenizer41, "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer52 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list53 = strTokenizer52.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer54 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher55 = strTokenizer54.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer56 = strTokenizer52.setDelimiterMatcher(strMatcher55);
        int int58 = strBuilder40.lastIndexOf(strMatcher55, (int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder32.deleteFirst(strMatcher55);
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder32.setNewLineText("StrTokenizer[not tokenized yet]");
        char[] charArray62 = strBuilder32.buffer;
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strMatcher13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(strMatcher20);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "4   4" });
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strTokenizer41);
        org.junit.Assert.assertNotNull(strMatcher42);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertArrayEquals(charArray48, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer49);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strTokenizer52);
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertNotNull(strTokenizer54);
        org.junit.Assert.assertNotNull(strMatcher55);
        org.junit.Assert.assertNotNull(strTokenizer56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(charArray62);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        boolean boolean2 = strBuilder1.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.deleteFirst("StrTokenizer[not tokenized yet]");
        int int7 = strBuilder3.indexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.setLength(0);
        java.io.Writer writer12 = strBuilder11.asWriter();
        java.io.Writer writer14 = writer12.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer22 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list23 = strTokenizer22.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher25 = strTokenizer24.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer26 = strTokenizer22.setDelimiterMatcher(strMatcher25);
        int int28 = strBuilder21.indexOf(strMatcher25, (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer33 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher34 = strTokenizer33.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder30.deleteAll(strMatcher34);
        java.lang.StringBuffer stringBuffer36 = strBuilder35.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder21.append(stringBuffer36, (int) (short) 0, 0);
        java.io.Writer writer40 = writer14.append((java.lang.CharSequence) stringBuffer36);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder3.append(stringBuffer36);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder41.setNewLineText("StrTokenizer[4   4]");
        java.lang.String str44 = strBuilder43.getNullText();
        char[] charArray45 = strBuilder43.buffer;
        java.lang.String str47 = strBuilder43.leftString((int) (short) -1);
        int int49 = strBuilder43.indexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder43.append((long) 5);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder43.append('i');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(writer12);
        org.junit.Assert.assertNotNull(writer14);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strTokenizer22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strMatcher25);
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strTokenizer33);
        org.junit.Assert.assertNotNull(strMatcher34);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(stringBuffer36);
        org.junit.Assert.assertEquals(stringBuffer36.toString(), "");
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(writer40);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder53);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) strBuilder7, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = strBuilder1.asTokenizer();
        int int13 = strBuilder1.indexOf("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher19 = strTokenizer18.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder15.deleteAll(strMatcher19);
        java.lang.StringBuffer stringBuffer21 = strBuilder20.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder1.append(stringBuffer21);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader23 = strBuilder1.new StrBuilderReader();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer28 = strBuilder27.new StrBuilderTokenizer();
        char[] charArray29 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray29);
        java.util.List list33 = strBuilderTokenizer28.tokenize(charArray29, (int) (short) -1, (int) '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer34 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray29);
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray29);
        int int36 = strBuilderReader23.read(charArray29);
        org.apache.commons.lang.text.StrTokenizer strTokenizer37 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray29);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder39.setLength(0);
        java.io.Writer writer42 = strBuilder41.asWriter();
        org.apache.commons.lang.text.StrTokenizer strTokenizer43 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher44 = strTokenizer43.getIgnoredMatcher();
        int int45 = strBuilder41.indexOf(strMatcher44);
        org.apache.commons.lang.text.StrTokenizer strTokenizer46 = strTokenizer37.setTrimmerMatcher(strMatcher44);
        org.apache.commons.lang.text.StrTokenizer strTokenizer48 = strTokenizer46.setQuoteChar('4');
        org.apache.commons.lang.text.StrTokenizer strTokenizer50 = strTokenizer48.setIgnoredChar('#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer52 = strTokenizer50.setQuoteChar('#');
        org.apache.commons.lang.text.StrMatcher strMatcher53 = strTokenizer52.getTrimmerMatcher();
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(stringBuffer21);
        org.junit.Assert.assertEquals(stringBuffer21.toString(), "");
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(writer42);
        org.junit.Assert.assertNotNull(strTokenizer43);
        org.junit.Assert.assertNotNull(strMatcher44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer46);
        org.junit.Assert.assertNotNull(strTokenizer48);
        org.junit.Assert.assertNotNull(strTokenizer50);
        org.junit.Assert.assertNotNull(strTokenizer52);
        org.junit.Assert.assertNotNull(strMatcher53);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) strBuilder7, 0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder10.appendNull();
        int int12 = strBuilder11.size;
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.append((double) 3);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.insert(0, false);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer22 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher23 = strTokenizer22.getIgnoredMatcher();
        char[] charArray29 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = strTokenizer22.reset(charArray29);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder21.appendWithSeparators((java.util.Iterator) strTokenizer22, "hi!");
        int int35 = strBuilder21.lastIndexOf("i!", (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer37 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer39 = strTokenizer37.setIgnoreEmptyTokens(false);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder21.appendWithSeparators((java.util.Iterator) strTokenizer39, "i!");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder21.replaceFirst("hi!", " ");
        org.apache.commons.lang.text.StrTokenizer strTokenizer46 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder48.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder50.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer54 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list55 = strTokenizer54.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer56 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher57 = strTokenizer56.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer58 = strTokenizer54.setDelimiterMatcher(strMatcher57);
        int int60 = strBuilder53.indexOf(strMatcher57, (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer61 = strTokenizer46.setIgnoredMatcher(strMatcher57);
        java.lang.String str62 = strTokenizer46.previousToken();
        org.apache.commons.lang.text.StrBuilder strBuilder64 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder64.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer67 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher68 = strTokenizer67.getIgnoredMatcher();
        char[] charArray74 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer75 = strTokenizer67.reset(charArray74);
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder66.appendWithSeparators((java.util.Iterator) strTokenizer67, "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer78 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list79 = strTokenizer78.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer80 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher81 = strTokenizer80.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer82 = strTokenizer78.setDelimiterMatcher(strMatcher81);
        int int84 = strBuilder66.lastIndexOf(strMatcher81, (int) (byte) 0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer85 = strTokenizer46.setIgnoredMatcher(strMatcher81);
        org.apache.commons.lang.text.StrTokenizer strTokenizer87 = strTokenizer85.setIgnoredChar('4');
        org.apache.commons.lang.text.StrMatcher strMatcher88 = strTokenizer85.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder89 = strBuilder21.deleteFirst(strMatcher88);
        boolean boolean90 = strBuilder21.isEmpty();
        boolean boolean91 = strBuilder14.equals(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strTokenizer22);
        org.junit.Assert.assertNotNull(strMatcher23);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertNotNull(strTokenizer39);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strTokenizer46);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strTokenizer54);
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertNotNull(strTokenizer56);
        org.junit.Assert.assertNotNull(strMatcher57);
        org.junit.Assert.assertNotNull(strTokenizer58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer61);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strTokenizer67);
        org.junit.Assert.assertNotNull(strMatcher68);
        org.junit.Assert.assertNotNull(charArray74);
        org.junit.Assert.assertArrayEquals(charArray74, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer75);
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNotNull(strTokenizer78);
        org.junit.Assert.assertNotNull(list79);
        org.junit.Assert.assertNotNull(strTokenizer80);
        org.junit.Assert.assertNotNull(strMatcher81);
        org.junit.Assert.assertNotNull(strTokenizer82);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer85);
        org.junit.Assert.assertNotNull(strTokenizer87);
        org.junit.Assert.assertNotNull(strMatcher88);
        org.junit.Assert.assertNotNull(strBuilder89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.deleteAll("");
        java.lang.Object obj6 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append(obj6);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.replaceFirst("", "4   4");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder7.insert(0, (double) 10L);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher19 = strTokenizer18.getIgnoredMatcher();
        int int21 = strBuilder15.lastIndexOf(strMatcher19, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder15.append(true);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader24 = strBuilder23.new StrBuilderReader();
        boolean boolean25 = strBuilderReader24.markSupported();
        strBuilderReader24.mark((int) (byte) 100);
        java.io.Writer writer28 = java.io.Writer.nullWriter();
        long long29 = strBuilderReader24.transferTo(writer28);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder31.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer34 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher35 = strTokenizer34.getIgnoredMatcher();
        char[] charArray41 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer42 = strTokenizer34.reset(charArray41);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder33.appendWithSeparators((java.util.Iterator) strTokenizer34, "hi!");
        char[] charArray45 = strBuilder44.buffer;
        int int46 = strBuilderReader24.read(charArray45);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder7.append(charArray45);
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder7.setLength((int) (byte) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder51.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer54 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher55 = strTokenizer54.getIgnoredMatcher();
        char[] charArray61 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer62 = strTokenizer54.reset(charArray61);
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder53.appendWithSeparators((java.util.Iterator) strTokenizer54, "hi!");
        char[] charArray65 = strBuilder64.buffer;
        org.apache.commons.lang.text.StrBuilder strBuilder67 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder67.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer70 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher71 = strTokenizer70.getIgnoredMatcher();
        char[] charArray77 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer78 = strTokenizer70.reset(charArray77);
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder69.appendWithSeparators((java.util.Iterator) strTokenizer70, "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer81 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list82 = strTokenizer81.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer83 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher84 = strTokenizer83.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer85 = strTokenizer81.setDelimiterMatcher(strMatcher84);
        int int87 = strBuilder69.lastIndexOf(strMatcher84, (int) (byte) 0);
        int int89 = strBuilder64.indexOf(strMatcher84, (int) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder91 = strBuilder64.append((-1));
        boolean boolean92 = strBuilder7.equals(strBuilder64);
        java.io.Reader reader93 = strBuilder64.asReader();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(writer28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 7L + "'", long29 == 7L);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(strMatcher35);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strTokenizer54);
        org.junit.Assert.assertNotNull(strMatcher55);
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertArrayEquals(charArray61, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer62);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(strTokenizer70);
        org.junit.Assert.assertNotNull(strMatcher71);
        org.junit.Assert.assertNotNull(charArray77);
        org.junit.Assert.assertArrayEquals(charArray77, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer78);
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertNotNull(strTokenizer81);
        org.junit.Assert.assertNotNull(list82);
        org.junit.Assert.assertNotNull(strTokenizer83);
        org.junit.Assert.assertNotNull(strMatcher84);
        org.junit.Assert.assertNotNull(strTokenizer85);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertNotNull(strBuilder91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(reader93);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("h100i!");
        int int2 = strTokenizer1.previousIndex();
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
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
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher19 = strTokenizer18.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = strTokenizer18.reset();
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer25 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher26 = strTokenizer25.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder22.deleteAll(strMatcher26);
        org.apache.commons.lang.text.StrTokenizer strTokenizer28 = strTokenizer20.setTrimmerMatcher(strMatcher26);
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = strTokenizer20.reset("StrTokenizer[not tokenized yet]");
        boolean boolean31 = strTokenizer20.isIgnoreEmptyTokens();
        boolean boolean32 = strTokenizer20.hasPrevious();
        boolean boolean33 = strBuilder14.equals((java.lang.Object) strTokenizer20);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(strMatcher10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n" + "'", str17, "\n");
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertNotNull(strMatcher26);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer4 = strBuilder3.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.replaceAll('a', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher13 = strTokenizer12.getIgnoredMatcher();
        int int15 = strBuilder9.lastIndexOf(strMatcher13, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder9.insert((int) (byte) 1, (int) '4');
        org.apache.commons.lang.text.StrTokenizer strTokenizer19 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher20 = strTokenizer19.getIgnoredMatcher();
        char[] charArray26 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = strTokenizer19.reset(charArray26);
        java.lang.String[] strArray28 = strTokenizer27.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder9.appendWithSeparators((java.lang.Object[]) strArray28, "StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder7.appendWithSeparators((java.lang.Object[]) strArray28, "");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer33 = strBuilder32.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder32.deleteAll("4   4");
        boolean boolean37 = strBuilder35.endsWith("\n");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder39.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder39.deleteAll("");
        java.lang.Object obj44 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder43.append(obj44);
        java.lang.String str46 = strBuilder45.getNewLineText();
        java.lang.StringBuffer stringBuffer47 = strBuilder45.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder35.append(stringBuffer47);
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder48.append(false);
        java.lang.String str51 = strBuilder50.toString();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strMatcher13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(strMatcher20);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "4   4" });
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(stringBuffer47);
        org.junit.Assert.assertEquals(stringBuffer47.toString(), "hi!");
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!hi!false" + "'", str51, "hi!hi!false");
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer4 = strBuilder3.new StrBuilderTokenizer();
        char[] charArray5 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer6 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray5);
        java.util.List list9 = strBuilderTokenizer4.tokenize(charArray5, (int) (short) -1, (int) '#');
        java.lang.String str10 = strBuilderTokenizer4.getContent();
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder16.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list21 = strTokenizer20.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer22 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher23 = strTokenizer22.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = strTokenizer20.setDelimiterMatcher(strMatcher23);
        int int26 = strBuilder19.indexOf(strMatcher23, (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = strTokenizer12.setIgnoredMatcher(strMatcher23);
        java.lang.String str28 = strTokenizer12.previousToken();
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer33 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher34 = strTokenizer33.getIgnoredMatcher();
        char[] charArray40 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer41 = strTokenizer33.reset(charArray40);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder32.appendWithSeparators((java.util.Iterator) strTokenizer33, "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer44 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list45 = strTokenizer44.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer46 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher47 = strTokenizer46.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer48 = strTokenizer44.setDelimiterMatcher(strMatcher47);
        int int50 = strBuilder32.lastIndexOf(strMatcher47, (int) (byte) 0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer51 = strTokenizer12.setIgnoredMatcher(strMatcher47);
        org.apache.commons.lang.text.StrMatcher strMatcher52 = strTokenizer51.getDelimiterMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer53 = strBuilderTokenizer4.setQuoteMatcher(strMatcher52);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder55.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer58 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher59 = strTokenizer58.getIgnoredMatcher();
        char[] charArray65 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer66 = strTokenizer58.reset(charArray65);
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder57.appendWithSeparators((java.util.Iterator) strTokenizer58, "hi!");
        char[] charArray69 = strBuilder68.buffer;
        java.util.List list72 = strBuilderTokenizer4.tokenize(charArray69, (int) (short) 100, 4);
        java.lang.String str73 = strBuilderTokenizer4.getContent();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(strTokenizer22);
        org.junit.Assert.assertNotNull(strMatcher23);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strTokenizer33);
        org.junit.Assert.assertNotNull(strMatcher34);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer41);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strTokenizer44);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(strTokenizer46);
        org.junit.Assert.assertNotNull(strMatcher47);
        org.junit.Assert.assertNotNull(strTokenizer48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(strMatcher52);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strTokenizer58);
        org.junit.Assert.assertNotNull(strMatcher59);
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertArrayEquals(charArray65, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer66);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertNotNull(list72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        java.lang.Object obj2 = strTokenizer1.clone();
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = strTokenizer1.setEmptyTokenAsNull(true);
        java.lang.String str5 = strTokenizer1.toString();
        org.apache.commons.lang.text.StrTokenizer strTokenizer7 = strTokenizer1.setDelimiterChar('a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer9 = strTokenizer7.setEmptyTokenAsNull(true);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder13.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder11.appendFixedWidthPadRight((java.lang.Object) strBuilder17, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer21 = strBuilder11.asTokenizer();
        int int23 = strBuilder11.indexOf("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer28 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher29 = strTokenizer28.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder25.deleteAll(strMatcher29);
        java.lang.StringBuffer stringBuffer31 = strBuilder30.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder11.append(stringBuffer31);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader33 = strBuilder11.new StrBuilderReader();
        int int34 = strBuilderReader33.read();
        strBuilderReader33.mark(0);
        boolean boolean37 = strBuilderReader33.ready();
        boolean boolean38 = strBuilderReader33.markSupported();
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder((int) 'a');
        char[] charArray42 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer43 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray42);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder40.insert(0, charArray42);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer47 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder46.append(stringBuffer47, (-1), (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer51 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list52 = strTokenizer51.getTokenList();
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder46.appendWithSeparators((java.util.Collection) list52, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder40.appendFixedWidthPadRight((java.lang.Object) "hi!", (int) (byte) -1, '4');
        int int59 = strBuilder40.indexOf("\n");
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder40.append((float) 105);
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder40.insert((int) (short) 1, (long) 35);
        org.apache.commons.lang.text.StrBuilder strBuilder66 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder66.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer69 = strBuilder68.new StrBuilderTokenizer();
        char[] charArray70 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer71 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray70);
        java.util.List list74 = strBuilderTokenizer69.tokenize(charArray70, (int) (short) -1, (int) '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer75 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray70);
        org.apache.commons.lang.text.StrTokenizer strTokenizer76 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray70);
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder40.append(charArray70);
        org.apache.commons.lang.text.StrTokenizer strTokenizer78 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray70);
        int int79 = strBuilderReader33.read(charArray70);
        org.apache.commons.lang.text.StrTokenizer strTokenizer80 = strTokenizer7.reset(charArray70);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj81 = strTokenizer80.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str5, "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertNotNull(strMatcher29);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(stringBuffer31);
        org.junit.Assert.assertEquals(stringBuffer31.toString(), "");
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 104 + "'", int34 == 104);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer43);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertArrayEquals(charArray70, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer71);
        org.junit.Assert.assertNotNull(list74);
        org.junit.Assert.assertNotNull(strTokenizer75);
        org.junit.Assert.assertNotNull(strTokenizer76);
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNotNull(strTokenizer78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(strTokenizer80);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        int int7 = strBuilder1.lastIndexOf(strMatcher5, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader10 = strBuilder9.new StrBuilderReader();
        boolean boolean11 = strBuilderReader10.markSupported();
        int int12 = strBuilderReader10.read();
        strBuilderReader10.reset();
        strBuilderReader10.reset();
        boolean boolean15 = strBuilderReader10.markSupported();
        long long17 = strBuilderReader10.skip((long) 3);
        java.nio.CharBuffer charBuffer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = strBuilderReader10.read(charBuffer18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3L + "'", long17 == 3L);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer9 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list10 = strTokenizer9.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher12 = strTokenizer11.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer13 = strTokenizer9.setDelimiterMatcher(strMatcher12);
        int int15 = strBuilder8.indexOf(strMatcher12, (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer16 = strTokenizer1.setIgnoredMatcher(strMatcher12);
        java.lang.String str17 = strTokenizer1.previousToken();
        boolean boolean18 = strTokenizer1.hasPrevious();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher24 = strTokenizer23.getIgnoredMatcher();
        int int26 = strBuilder20.lastIndexOf(strMatcher24, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder20.insert((int) (byte) 1, (int) '4');
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer30 = strBuilder20.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder20.deleteAll('a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer34 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer36 = strTokenizer34.setIgnoredChar('4');
        org.apache.commons.lang.text.StrMatcher strMatcher37 = strTokenizer34.getIgnoredMatcher();
        org.apache.commons.lang.text.StrMatcher strMatcher38 = strTokenizer34.getDelimiterMatcher();
        int int40 = strBuilder32.indexOf(strMatcher38, 105);
        org.apache.commons.lang.text.StrTokenizer strTokenizer41 = strTokenizer1.setIgnoredMatcher(strMatcher38);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = strTokenizer41.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertNotNull(strMatcher12);
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertNotNull(strMatcher24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(strTokenizer36);
        org.junit.Assert.assertNotNull(strMatcher37);
        org.junit.Assert.assertNotNull(strMatcher38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer41);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
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
        org.apache.commons.lang.text.StrBuilder strBuilder45 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder45.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer48 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher49 = strTokenizer48.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder45.deleteAll(strMatcher49);
        int int52 = strBuilder14.indexOf(strMatcher49, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder14.appendNull();
        char[] charArray58 = new char[] { 'a', ' ', ' ' };
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder53.insert(0, charArray58);
        org.apache.commons.lang.text.StrTokenizer strTokenizer60 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray58);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj61 = strTokenizer60.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strTokenizer10);
        org.junit.Assert.assertNotNull(strMatcher11);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "");
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(strMatcher33);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strTokenizer48);
        org.junit.Assert.assertNotNull(strMatcher49);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertArrayEquals(charArray58, new char[] { 'a', ' ', ' ' });
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strTokenizer60);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder3.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrMatcher strMatcher7 = null;
        int int9 = strBuilder3.lastIndexOf(strMatcher7, (int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder3.append(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer19 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list20 = strTokenizer19.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer21 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher22 = strTokenizer21.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = strTokenizer19.setDelimiterMatcher(strMatcher22);
        int int25 = strBuilder18.indexOf(strMatcher22, (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder18.appendNewLine();
        org.apache.commons.lang.text.StrTokenizer strTokenizer28 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = strTokenizer28.setIgnoreEmptyTokens(false);
        java.lang.String str31 = strTokenizer30.previousToken();
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder18.appendWithSeparators((java.util.Iterator) strTokenizer30, "");
        java.lang.StringBuffer stringBuffer34 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder18.append(stringBuffer34, 35, 3);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder11.appendFixedWidthPadLeft((java.lang.Object) strBuilder18, (int) '#', '4');
        java.io.Writer writer41 = strBuilder40.asWriter();
        int int44 = strBuilder40.indexOf('i', 37);
        int int45 = strBuilder40.length();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strMatcher22);
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(writer41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 36 + "'", int45 == 36);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder(66);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteAll(strMatcher5);
        java.lang.String str8 = strBuilder6.leftString(100);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder6.append(" ");
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter11 = strBuilder6.new StrBuilderWriter();
        int int13 = strBuilder6.lastIndexOf("\n");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher19 = strTokenizer18.getIgnoredMatcher();
        char[] charArray25 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer26 = strTokenizer18.reset(charArray25);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder17.appendWithSeparators((java.util.Iterator) strTokenizer18, "hi!");
        int int30 = strBuilder28.indexOf("hi!");
        boolean boolean32 = strBuilder28.startsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder28.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder37.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder37.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder35.appendFixedWidthPadRight((java.lang.Object) strBuilder41, 0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder44.appendNull();
        java.lang.String str48 = strBuilder45.substring(0, 3);
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder45.trim();
        char[] charArray50 = strBuilder49.buffer;
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder28.appendFixedWidthPadLeft((java.lang.Object) charArray50, 104, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder6.append(charArray50);
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder54.append((int) '4');
        int int59 = strBuilder54.indexOf('h', (int) (byte) -1);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteAll(strMatcher5);
        java.lang.String str8 = strBuilder6.leftString(100);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder6.append(" ");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder6.append((int) (byte) 100);
        char[] charArray13 = strBuilder12.toCharArray();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { ' ', '1', '0', '0' });
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) strBuilder7, 0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder7.append(0L);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder12.reverse();
        boolean boolean14 = strBuilder13.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder13.deleteCharAt(0);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strBuilder16);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        java.io.Writer writer4 = strBuilder3.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.replaceAll("\n", "");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.setLength(0);
        int int14 = strBuilder13.capacity();
        char[] charArray15 = strBuilder13.toCharArray();
        char[] charArray16 = strBuilder5.getChars(charArray15);
        int int17 = strBuilder5.size();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder5.trim();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(writer4);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] {});
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(strBuilder18);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder((int) 'a');
        char[] charArray3 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.insert(0, charArray3);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder7.append(stringBuffer8, (-1), (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list13 = strTokenizer12.getTokenList();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder7.appendWithSeparators((java.util.Collection) list13, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) "hi!", (int) (byte) -1, '4');
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer19 = strBuilder1.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder21.deleteAll("");
        java.lang.Object obj26 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.append(obj26);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.replaceFirst("", "4   4");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder27.insert(0, (double) 10L);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder35.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer38 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher39 = strTokenizer38.getIgnoredMatcher();
        int int41 = strBuilder35.lastIndexOf(strMatcher39, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder35.append(true);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader44 = strBuilder43.new StrBuilderReader();
        boolean boolean45 = strBuilderReader44.markSupported();
        strBuilderReader44.mark((int) (byte) 100);
        java.io.Writer writer48 = java.io.Writer.nullWriter();
        long long49 = strBuilderReader44.transferTo(writer48);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder51.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer54 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher55 = strTokenizer54.getIgnoredMatcher();
        char[] charArray61 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer62 = strTokenizer54.reset(charArray61);
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder53.appendWithSeparators((java.util.Iterator) strTokenizer54, "hi!");
        char[] charArray65 = strBuilder64.buffer;
        int int66 = strBuilderReader44.read(charArray65);
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder27.append(charArray65);
        org.apache.commons.lang.text.StrTokenizer strTokenizer69 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder71 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder71.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder73.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer77 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list78 = strTokenizer77.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer79 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher80 = strTokenizer79.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer81 = strTokenizer77.setDelimiterMatcher(strMatcher80);
        int int83 = strBuilder76.indexOf(strMatcher80, (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer84 = strTokenizer69.setIgnoredMatcher(strMatcher80);
        java.lang.String str85 = strTokenizer69.previousToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer87 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer89 = strTokenizer87.setIgnoredChar('4');
        org.apache.commons.lang.text.StrMatcher strMatcher90 = strTokenizer87.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer91 = strTokenizer69.setTrimmerMatcher(strMatcher90);
        boolean boolean92 = strBuilder27.contains(strMatcher90);
        int int94 = strBuilder1.indexOf(strMatcher90, 42);
        strBuilder1.size = 46;
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strTokenizer38);
        org.junit.Assert.assertNotNull(strMatcher39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(writer48);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 7L + "'", long49 == 7L);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strTokenizer54);
        org.junit.Assert.assertNotNull(strMatcher55);
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertArrayEquals(charArray61, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer62);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(strTokenizer69);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(strTokenizer77);
        org.junit.Assert.assertNotNull(list78);
        org.junit.Assert.assertNotNull(strTokenizer79);
        org.junit.Assert.assertNotNull(strMatcher80);
        org.junit.Assert.assertNotNull(strTokenizer81);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer84);
        org.junit.Assert.assertNull(str85);
        org.junit.Assert.assertNotNull(strTokenizer87);
        org.junit.Assert.assertNotNull(strTokenizer89);
        org.junit.Assert.assertNotNull(strMatcher90);
        org.junit.Assert.assertNotNull(strTokenizer91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.apache.commons.lang.text.StrTokenizer strTokenizer0 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher1 = strTokenizer0.getIgnoredMatcher();
        char[] charArray7 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer8 = strTokenizer0.reset(charArray7);
        int int9 = strTokenizer0.size();
        boolean boolean10 = strTokenizer0.hasNext();
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strTokenizer0.setEmptyTokenAsNull(false);
        org.apache.commons.lang.text.StrTokenizer strTokenizer14 = strTokenizer12.reset("4   4");
        org.apache.commons.lang.text.StrTokenizer strTokenizer16 = strTokenizer14.setDelimiterString("\n0");
        org.junit.Assert.assertNotNull(strTokenizer0);
        org.junit.Assert.assertNotNull(strMatcher1);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strTokenizer14);
        org.junit.Assert.assertNotNull(strTokenizer16);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.append(stringBuffer2, (-1), (int) ' ');
        int int7 = strBuilder1.indexOf("StrTokenizer[not tokenized yet]");
        strBuilder1.size = (byte) 1;
        java.lang.String str10 = strBuilder1.toString();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder1.replaceAll(' ', 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer14 = strBuilder1.asTokenizer();
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strTokenizer14);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.deleteAll("");
        java.lang.Object obj6 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append(obj6);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.replaceFirst("", "4   4");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder10.minimizeCapacity();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder11);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.append(stringBuffer2, (-1), (int) ' ');
        boolean boolean7 = strBuilder1.startsWith("i!");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.append((double) 1.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder15.appendPadding((int) '#', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder20.appendFixedWidthPadLeft((int) ' ', 0, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer26 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder28.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer34 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list35 = strTokenizer34.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer36 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher37 = strTokenizer36.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer38 = strTokenizer34.setDelimiterMatcher(strMatcher37);
        int int40 = strBuilder33.indexOf(strMatcher37, (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer41 = strTokenizer26.setIgnoredMatcher(strMatcher37);
        int int43 = strBuilder20.lastIndexOf(strMatcher37, (int) (short) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder11.deleteFirst(strMatcher37);
        int int45 = strBuilder1.lastIndexOf(strMatcher37);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder47.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder49.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer53 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list54 = strTokenizer53.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer55 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher56 = strTokenizer55.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer57 = strTokenizer53.setDelimiterMatcher(strMatcher56);
        int int59 = strBuilder52.indexOf(strMatcher56, (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder52.appendNewLine();
        java.lang.String str63 = strBuilder60.midString((int) (short) 0, 100);
        org.apache.commons.lang.text.StrTokenizer strTokenizer65 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        java.lang.Object obj66 = strTokenizer65.clone();
        int int67 = strTokenizer65.size();
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder60.append((java.lang.Object) int67);
        int int71 = strBuilder68.lastIndexOf("", (int) '4');
        org.apache.commons.lang.text.StrBuilder strBuilder73 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder73.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer76 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher77 = strTokenizer76.getIgnoredMatcher();
        int int79 = strBuilder73.lastIndexOf(strMatcher77, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder68.deleteFirst(strMatcher77);
        int int82 = strBuilder1.lastIndexOf(strMatcher77, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder86 = strBuilder1.replace(55, 36, "                                                              ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNotNull(strTokenizer36);
        org.junit.Assert.assertNotNull(strMatcher37);
        org.junit.Assert.assertNotNull(strTokenizer38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertNotNull(strMatcher56);
        org.junit.Assert.assertNotNull(strTokenizer57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "\n" + "'", str63, "\n");
        org.junit.Assert.assertNotNull(strTokenizer65);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertEquals(obj66.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj66), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj66), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(strTokenizer76);
        org.junit.Assert.assertNotNull(strMatcher77);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.deleteAll("");
        java.lang.Object obj6 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append(obj6);
        java.lang.String str8 = strBuilder5.getNullText();
        int int10 = strBuilder5.lastIndexOf("h52i!4   4");
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        java.lang.Object obj13 = strTokenizer12.clone();
        org.apache.commons.lang.text.StrTokenizer strTokenizer15 = strTokenizer12.setEmptyTokenAsNull(true);
        java.lang.String str16 = strTokenizer12.toString();
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = strTokenizer12.setDelimiterChar('a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = strTokenizer18.setEmptyTokenAsNull(true);
        org.apache.commons.lang.text.StrTokenizer strTokenizer22 = strTokenizer20.setIgnoredChar('i');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder24.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder28.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.append((double) 1.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder30.appendPadding((int) '#', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder35.appendFixedWidthPadLeft((int) ' ', 0, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer41 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder43.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder45.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer49 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list50 = strTokenizer49.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer51 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher52 = strTokenizer51.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer53 = strTokenizer49.setDelimiterMatcher(strMatcher52);
        int int55 = strBuilder48.indexOf(strMatcher52, (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer56 = strTokenizer41.setIgnoredMatcher(strMatcher52);
        int int58 = strBuilder35.lastIndexOf(strMatcher52, (int) (short) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder26.deleteFirst(strMatcher52);
        org.apache.commons.lang.text.StrTokenizer strTokenizer60 = strTokenizer20.setQuoteMatcher(strMatcher52);
        int int62 = strBuilder5.indexOf(strMatcher52, 100);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strTokenizer15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str16, "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strTokenizer22);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strTokenizer41);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strTokenizer49);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(strMatcher52);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strTokenizer60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        int int7 = strBuilder1.lastIndexOf(strMatcher5, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader10 = strBuilder9.new StrBuilderReader();
        boolean boolean11 = strBuilderReader10.markSupported();
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher13 = strTokenizer12.getIgnoredMatcher();
        char[] charArray19 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = strTokenizer12.reset(charArray19);
        int int21 = strBuilderReader10.read(charArray19);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer26 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher27 = strTokenizer26.getIgnoredMatcher();
        int int29 = strBuilder23.lastIndexOf(strMatcher27, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder23.insert((int) (byte) 1, (int) '4');
        org.apache.commons.lang.text.StrTokenizer strTokenizer33 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher34 = strTokenizer33.getIgnoredMatcher();
        char[] charArray40 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer41 = strTokenizer33.reset(charArray40);
        java.lang.String[] strArray42 = strTokenizer41.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder23.appendWithSeparators((java.lang.Object[]) strArray42, "StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = new org.apache.commons.lang.text.StrBuilder("hi!");
        boolean boolean47 = strBuilder46.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder46.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder46.deleteAll('#');
        org.apache.commons.lang.text.StrBuilder strBuilder52 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder52.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer55 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher56 = strTokenizer55.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder52.deleteAll(strMatcher56);
        java.lang.StringBuffer stringBuffer58 = strBuilder57.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder50.append(stringBuffer58);
        org.apache.commons.lang.text.StrBuilder strBuilder63 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder65 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder65.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder65.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder63.appendFixedWidthPadRight((java.lang.Object) strBuilder69, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer73 = strBuilder63.asTokenizer();
        int int75 = strBuilder63.lastIndexOf("hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer77 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher78 = strTokenizer77.getIgnoredMatcher();
        char[] charArray84 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer85 = strTokenizer77.reset(charArray84);
        org.apache.commons.lang.text.StrBuilder strBuilder86 = strBuilder63.insert((int) (byte) 1, charArray84);
        strBuilder59.getChars((int) (short) 0, 0, charArray84, (int) (short) 1);
        char[] charArray89 = strBuilder44.getChars(charArray84);
        int int90 = strBuilderReader10.read(charArray84);
        java.nio.CharBuffer charBuffer91 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int92 = strBuilderReader10.read(charBuffer91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strMatcher13);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { 'h', 'i', '!', 't', 'r' });
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertNotNull(strMatcher27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strTokenizer33);
        org.junit.Assert.assertNotNull(strMatcher34);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "4   4" });
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertNotNull(strMatcher56);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(stringBuffer58);
        org.junit.Assert.assertEquals(stringBuffer58.toString(), "");
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strTokenizer73);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(strTokenizer77);
        org.junit.Assert.assertNotNull(strMatcher78);
        org.junit.Assert.assertNotNull(charArray84);
        org.junit.Assert.assertArrayEquals(charArray84, new char[] { 'u', 'e', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer85);
        org.junit.Assert.assertNotNull(strBuilder86);
        org.junit.Assert.assertNotNull(charArray89);
        org.junit.Assert.assertArrayEquals(charArray89, new char[] { 'h', '5', '2', 'i', '!', '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 2 + "'", int90 == 2);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.apache.commons.lang.text.StrTokenizer strTokenizer0 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher1 = strTokenizer0.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer2 = strTokenizer0.reset();
        java.lang.String str3 = strTokenizer2.toString();
        int int4 = strTokenizer2.previousIndex();
        org.junit.Assert.assertNotNull(strTokenizer0);
        org.junit.Assert.assertNotNull(strMatcher1);
        org.junit.Assert.assertNotNull(strTokenizer2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str3, "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        int int4 = strBuilder3.capacity();
        int int6 = strBuilder3.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder7.deleteFirst('#');
        int int10 = strBuilder7.size;
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder7.appendNewLine();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strBuilder11);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        int int7 = strBuilder1.lastIndexOf(strMatcher5, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader10 = strBuilder9.new StrBuilderReader();
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder9.append(stringBuffer11, (int) (short) 0, 3);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer19 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher20 = strTokenizer19.getIgnoredMatcher();
        int int22 = strBuilder16.lastIndexOf(strMatcher20, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder16.append(true);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader25 = strBuilder24.new StrBuilderReader();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder24.append((java.lang.Object) "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder9.append(strBuilder24, 2, (int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder32.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder34.appendFixedWidthPadLeft(0, (int) (byte) -1, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder34.insert(0, "StrTokenizer[4   4]");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer44 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder43.append(stringBuffer44, (-1), (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder43.reverse();
        org.apache.commons.lang.text.StrTokenizer strTokenizer49 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher50 = strTokenizer49.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer51 = strTokenizer49.reset();
        org.apache.commons.lang.text.StrBuilder strBuilder53 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder53.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer56 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher57 = strTokenizer56.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder53.deleteAll(strMatcher57);
        org.apache.commons.lang.text.StrTokenizer strTokenizer59 = strTokenizer51.setTrimmerMatcher(strMatcher57);
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder48.replace(strMatcher57, " ", (int) (short) 1, 1, 1);
        boolean boolean65 = strBuilder41.contains(strMatcher57);
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder24.replaceAll(strMatcher57, "!ih");
        char[] charArray68 = strBuilder67.toCharArray();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(strMatcher20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strTokenizer49);
        org.junit.Assert.assertNotNull(strMatcher50);
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strTokenizer56);
        org.junit.Assert.assertNotNull(strMatcher57);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strTokenizer59);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertArrayEquals(charArray68, new char[] { 'h', 'i', '!', 't', 'r', 'u', 'e', 'h', 'i', '!' });
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) strBuilder7, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = strBuilder1.asTokenizer();
        int int13 = strBuilder1.indexOf("StrTokenizer[not tokenized yet]");
        java.lang.String str14 = strBuilder1.getNewLineText();
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
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
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder6.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder6.deleteAll(' ');
        java.lang.String str42 = strBuilder40.leftString(112);
        org.apache.commons.lang.text.StrTokenizer strTokenizer43 = strBuilder40.asTokenizer();
        java.lang.String str45 = strBuilder40.rightString((int) '1');
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertNotNull(strMatcher26);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(stringBuffer28);
        org.junit.Assert.assertEquals(stringBuffer28.toString(), "");
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\n" + "'", str42, "\n");
        org.junit.Assert.assertNotNull(strTokenizer43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\n" + "'", str45, "\n");
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer8 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher9 = strTokenizer8.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder5.deleteAll(strMatcher9);
        java.lang.StringBuffer stringBuffer11 = strBuilder10.toStringBuffer();
        boolean boolean12 = strBuilder3.equals((java.lang.Object) strBuilder10);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder10.setNullText("StrTokenizer[]");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.replaceAll("-1.0", "hi!true");
        org.apache.commons.lang.text.StrMatcher strMatcher18 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder14.replaceFirst(strMatcher18, "1.00");
        // The following exception was thrown during execution in test generation
        try {
            int int23 = strBuilder20.validateRange(38, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(strMatcher9);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(stringBuffer11);
        org.junit.Assert.assertEquals(stringBuffer11.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        char[] charArray11 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strTokenizer4.reset(charArray11);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.appendWithSeparators((java.util.Iterator) strTokenizer4, "hi!");
        int int16 = strBuilder14.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder14.insert((int) (short) 1, "StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.append((double) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder19.insert((int) (short) 0, (double) '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer25 = strBuilder24.asTokenizer();
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = strTokenizer25.setEmptyTokenAsNull(true);
        java.lang.String[] strArray28 = strTokenizer27.getTokenArray();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "35.0hStrTokenizer[not", "tokenized", "yet]i!4", "4-1.0" });
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        boolean boolean2 = strBuilder1.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.deleteAll('#');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.ensureCapacity(39);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.insert(1, 10L);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder10.replaceFirst("                                                              ", "h52i!4   4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        java.io.Writer writer1 = java.io.Writer.nullWriter();
        java.io.Writer writer3 = writer1.append('#');
        long long4 = reader0.transferTo(writer1);
        org.apache.commons.lang.text.StrBuilder strBuilder6 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.setLength(0);
        int int9 = strBuilder8.capacity();
        int int11 = strBuilder8.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder8.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.deleteFirst('#');
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter15 = strBuilder12.new StrBuilderWriter();
        strBuilderWriter15.close();
        strBuilderWriter15.write((int) (byte) -1);
        long long19 = reader0.transferTo((java.io.Writer) strBuilderWriter15);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder21.deleteAll("");
        java.lang.Object obj26 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.append(obj26);
        java.lang.String str28 = strBuilder27.getNewLineText();
        java.lang.StringBuffer stringBuffer29 = strBuilder27.toStringBuffer();
        java.io.Writer writer30 = strBuilderWriter15.append((java.lang.CharSequence) stringBuffer29);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(writer1);
        org.junit.Assert.assertNotNull(writer3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(stringBuffer29);
        org.junit.Assert.assertEquals(stringBuffer29.toString(), "hi!");
        org.junit.Assert.assertNotNull(writer30);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
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
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list28 = strTokenizer27.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher30 = strTokenizer29.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer31 = strTokenizer27.setDelimiterMatcher(strMatcher30);
        int int33 = strBuilder26.indexOf(strMatcher30, (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer34 = strTokenizer19.setIgnoredMatcher(strMatcher30);
        java.lang.String str35 = strTokenizer19.previousToken();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder37.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer40 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher41 = strTokenizer40.getIgnoredMatcher();
        char[] charArray47 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer48 = strTokenizer40.reset(charArray47);
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder39.appendWithSeparators((java.util.Iterator) strTokenizer40, "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer51 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list52 = strTokenizer51.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer53 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher54 = strTokenizer53.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer55 = strTokenizer51.setDelimiterMatcher(strMatcher54);
        int int57 = strBuilder39.lastIndexOf(strMatcher54, (int) (byte) 0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer58 = strTokenizer19.setIgnoredMatcher(strMatcher54);
        org.apache.commons.lang.text.StrTokenizer strTokenizer60 = strTokenizer19.setEmptyTokenAsNull(true);
        org.apache.commons.lang.text.StrTokenizer strTokenizer61 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher62 = strTokenizer61.getIgnoredMatcher();
        char[] charArray68 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer69 = strTokenizer61.reset(charArray68);
        java.lang.String[] strArray70 = strTokenizer69.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder72 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder72.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder74.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer78 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list79 = strTokenizer78.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer80 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher81 = strTokenizer80.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer82 = strTokenizer78.setDelimiterMatcher(strMatcher81);
        int int84 = strBuilder77.indexOf(strMatcher81, (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer85 = strTokenizer69.setTrimmerMatcher(strMatcher81);
        org.apache.commons.lang.text.StrTokenizer strTokenizer86 = strTokenizer60.setDelimiterMatcher(strMatcher81);
        org.apache.commons.lang.text.StrBuilder strBuilder88 = strBuilder14.replaceAll(strMatcher81, "hi!");
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader89 = strBuilder14.new StrBuilderReader();
        org.apache.commons.lang.text.StrBuilder strBuilder92 = strBuilder14.insert(0, 6);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(strMatcher10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n" + "'", str17, "\n");
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strMatcher30);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertNotNull(strMatcher41);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer48);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertNotNull(strMatcher54);
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer58);
        org.junit.Assert.assertNotNull(strTokenizer60);
        org.junit.Assert.assertNotNull(strTokenizer61);
        org.junit.Assert.assertNotNull(strMatcher62);
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertArrayEquals(charArray68, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer69);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "4   4" });
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNotNull(strTokenizer78);
        org.junit.Assert.assertNotNull(list79);
        org.junit.Assert.assertNotNull(strTokenizer80);
        org.junit.Assert.assertNotNull(strMatcher81);
        org.junit.Assert.assertNotNull(strTokenizer82);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer85);
        org.junit.Assert.assertNotNull(strTokenizer86);
        org.junit.Assert.assertNotNull(strBuilder88);
        org.junit.Assert.assertNotNull(strBuilder92);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer9 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list10 = strTokenizer9.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher12 = strTokenizer11.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer13 = strTokenizer9.setDelimiterMatcher(strMatcher12);
        int int15 = strBuilder8.indexOf(strMatcher12, (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer16 = strTokenizer1.setIgnoredMatcher(strMatcher12);
        java.lang.String str17 = strTokenizer1.previousToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer19 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer21 = strTokenizer19.setIgnoredChar('4');
        org.apache.commons.lang.text.StrMatcher strMatcher22 = strTokenizer19.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = strTokenizer1.setTrimmerMatcher(strMatcher22);
        java.lang.Object obj24 = strTokenizer23.clone();
        org.apache.commons.lang.text.StrTokenizer strTokenizer26 = strTokenizer23.setDelimiterChar('a');
        org.apache.commons.lang.text.StrMatcher strMatcher27 = strTokenizer26.getIgnoredMatcher();
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertNotNull(strMatcher12);
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strMatcher22);
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertNotNull(strMatcher27);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        int int4 = strBuilder3.capacity();
        int int6 = strBuilder3.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder7.deleteFirst('#');
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter10 = strBuilder7.new StrBuilderWriter();
        strBuilderWriter10.write("                                                              ", 0, 36);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder3.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder3.setNewLineText("\n");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.setNullText("StrTokenizer[not tokenized yet]");
        java.io.Reader reader11 = strBuilder10.asReader();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(reader11);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer9 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("4   4");
        boolean boolean10 = strBuilder7.equals((java.lang.Object) strTokenizer9);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = new org.apache.commons.lang.text.StrBuilder("hi!");
        boolean boolean13 = strBuilder12.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.deleteFirst("StrTokenizer[not tokenized yet]");
        int int18 = strBuilder14.indexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.setLength(0);
        java.io.Writer writer23 = strBuilder22.asWriter();
        java.io.Writer writer25 = writer23.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder27.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder29.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer33 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list34 = strTokenizer33.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher36 = strTokenizer35.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer37 = strTokenizer33.setDelimiterMatcher(strMatcher36);
        int int39 = strBuilder32.indexOf(strMatcher36, (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder41 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder41.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer44 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher45 = strTokenizer44.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder41.deleteAll(strMatcher45);
        java.lang.StringBuffer stringBuffer47 = strBuilder46.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder32.append(stringBuffer47, (int) (short) 0, 0);
        java.io.Writer writer51 = writer25.append((java.lang.CharSequence) stringBuffer47);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder14.append(stringBuffer47);
        org.apache.commons.lang.text.StrBuilder strBuilder54 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder56 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder56.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder56.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder54.appendFixedWidthPadRight((java.lang.Object) strBuilder60, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer64 = strBuilder54.asTokenizer();
        int int66 = strBuilder54.lastIndexOf("hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer68 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher69 = strTokenizer68.getIgnoredMatcher();
        char[] charArray75 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer76 = strTokenizer68.reset(charArray75);
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder54.insert((int) (byte) 1, charArray75);
        org.apache.commons.lang.text.StrBuilder strBuilder79 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder79.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder79.deleteAll("");
        java.lang.Object obj84 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder83.append(obj84);
        java.lang.String str86 = strBuilder85.getNewLineText();
        java.lang.StringBuffer stringBuffer87 = strBuilder85.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder90 = strBuilder54.append(stringBuffer87, (int) (byte) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder91 = strBuilder52.append(stringBuffer87);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder94 = strBuilder7.append(stringBuffer87, 0, 19);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: length must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(writer23);
        org.junit.Assert.assertNotNull(writer25);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strTokenizer33);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertNotNull(strMatcher36);
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strTokenizer44);
        org.junit.Assert.assertNotNull(strMatcher45);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(stringBuffer47);
        org.junit.Assert.assertEquals(stringBuffer47.toString(), "");
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(writer51);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strTokenizer64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(strTokenizer68);
        org.junit.Assert.assertNotNull(strMatcher69);
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertArrayEquals(charArray75, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer76);
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertNotNull(strBuilder83);
        org.junit.Assert.assertNotNull(strBuilder85);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertNotNull(stringBuffer87);
        org.junit.Assert.assertEquals(stringBuffer87.toString(), "hi!");
        org.junit.Assert.assertNotNull(strBuilder90);
        org.junit.Assert.assertNotNull(strBuilder91);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
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
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer28 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher29 = strTokenizer28.getIgnoredMatcher();
        int int31 = strBuilder25.lastIndexOf(strMatcher29, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder25.append(true);
        char[] charArray34 = strBuilder33.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder14.insert(0, charArray34);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder14.appendPadding(40, 'i');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder38.insert(52, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(strMatcher10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n" + "'", str17, "\n");
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertNotNull(strMatcher29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] { 'h', 'i', '!', 't', 'r', 'u', 'e' });
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder38);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) strBuilder7, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = strBuilder1.asTokenizer();
        int int13 = strBuilder1.indexOf("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher19 = strTokenizer18.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder15.deleteAll(strMatcher19);
        java.lang.StringBuffer stringBuffer21 = strBuilder20.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder1.append(stringBuffer21);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader23 = strBuilder1.new StrBuilderReader();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer28 = strBuilder27.new StrBuilderTokenizer();
        char[] charArray29 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray29);
        java.util.List list33 = strBuilderTokenizer28.tokenize(charArray29, (int) (short) -1, (int) '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer34 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray29);
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray29);
        int int36 = strBuilderReader23.read(charArray29);
        org.apache.commons.lang.text.StrTokenizer strTokenizer37 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray29);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder39.setLength(0);
        java.io.Writer writer42 = strBuilder41.asWriter();
        org.apache.commons.lang.text.StrTokenizer strTokenizer43 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher44 = strTokenizer43.getIgnoredMatcher();
        int int45 = strBuilder41.indexOf(strMatcher44);
        org.apache.commons.lang.text.StrTokenizer strTokenizer46 = strTokenizer37.setTrimmerMatcher(strMatcher44);
        org.apache.commons.lang.text.StrTokenizer strTokenizer48 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder50.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder52.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer56 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list57 = strTokenizer56.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer58 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher59 = strTokenizer58.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer60 = strTokenizer56.setDelimiterMatcher(strMatcher59);
        int int62 = strBuilder55.indexOf(strMatcher59, (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer63 = strTokenizer48.setIgnoredMatcher(strMatcher59);
        org.apache.commons.lang.text.StrMatcher strMatcher64 = strTokenizer63.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer65 = strTokenizer46.setTrimmerMatcher(strMatcher64);
        java.lang.String str66 = strTokenizer46.toString();
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(stringBuffer21);
        org.junit.Assert.assertEquals(stringBuffer21.toString(), "");
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(writer42);
        org.junit.Assert.assertNotNull(strTokenizer43);
        org.junit.Assert.assertNotNull(strMatcher44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer46);
        org.junit.Assert.assertNotNull(strTokenizer48);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strTokenizer56);
        org.junit.Assert.assertNotNull(list57);
        org.junit.Assert.assertNotNull(strTokenizer58);
        org.junit.Assert.assertNotNull(strMatcher59);
        org.junit.Assert.assertNotNull(strTokenizer60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer63);
        org.junit.Assert.assertNotNull(strMatcher64);
        org.junit.Assert.assertNotNull(strTokenizer65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str66, "StrTokenizer[not tokenized yet]");
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer4 = strBuilder3.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.replaceAll('a', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.insert(2, (float) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder7.insert(2, "-1.0");
        boolean boolean15 = strBuilder13.endsWith("i!");
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder(33);
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.appendFixedWidthPadRight((java.lang.Object) strBuilder9, 0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder9.append(0L);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder14.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.appendPadding(35, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer24 = strBuilder23.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrTokenizer strTokenizer26 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder23.appendFixedWidthPadLeft((java.lang.Object) "", (int) (short) 1, ' ');
        java.lang.String str32 = strBuilder23.midString((-1), (int) (short) 0);
        char[] charArray33 = strBuilder23.buffer;
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder18.insert((int) (short) 1, charArray33);
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray33);
        char[] charArray36 = strBuilder1.getChars(charArray33);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder1.deleteAll("StrTokenizer[]");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder42.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer45 = strBuilder44.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder44.replaceAll('a', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder50 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder50.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer53 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher54 = strTokenizer53.getIgnoredMatcher();
        int int56 = strBuilder50.lastIndexOf(strMatcher54, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder50.insert((int) (byte) 1, (int) '4');
        org.apache.commons.lang.text.StrTokenizer strTokenizer60 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher61 = strTokenizer60.getIgnoredMatcher();
        char[] charArray67 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer68 = strTokenizer60.reset(charArray67);
        java.lang.String[] strArray69 = strTokenizer68.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder50.appendWithSeparators((java.lang.Object[]) strArray69, "StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder48.appendWithSeparators((java.lang.Object[]) strArray69, "");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer74 = strBuilder73.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder76 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder76.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder76.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder80.appendNull();
        char[] charArray82 = strBuilder80.buffer;
        strBuilder73.buffer = charArray82;
        // The following exception was thrown during execution in test generation
        try {
            strBuilder38.getChars(38, 66, charArray82, 40);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 66");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertNotNull(strMatcher54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strTokenizer60);
        org.junit.Assert.assertNotNull(strMatcher61);
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertArrayEquals(charArray67, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer68);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "4   4" });
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertNotNull(charArray82);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.append(stringBuffer2, (-1), (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.reverse();
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.append(stringBuffer7);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.deleteFirst("hi!");
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader11 = strBuilder8.new StrBuilderReader();
        strBuilderReader11.close();
        strBuilderReader11.reset();
        long long15 = strBuilderReader11.skip((long) '4');
        boolean boolean16 = strBuilderReader11.markSupported();
        int int17 = strBuilderReader11.read();
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3L + "'", long15 == 3L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) strBuilder7, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher12 = strTokenizer11.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder1.replaceAll(strMatcher12, "StrTokenizer[not tokenized yet]");
        char[] charArray15 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder1.append(charArray15);
        int int18 = strBuilder16.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder16.append((int) '4');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.deleteAll('h');
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertNotNull(strMatcher12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
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
        int int25 = strBuilder22.lastIndexOf("", (int) '4');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder27.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher31 = strTokenizer30.getIgnoredMatcher();
        int int33 = strBuilder27.lastIndexOf(strMatcher31, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder22.deleteFirst(strMatcher31);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder34.appendFixedWidthPadLeft(131, (int) 'i', ' ');
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(strMatcher10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n" + "'", str17, "\n");
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(strMatcher31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder38);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        char[] charArray11 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strTokenizer4.reset(charArray11);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.appendWithSeparators((java.util.Iterator) strTokenizer4, "hi!");
        int int16 = strBuilder14.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder14.insert((int) (short) 1, "StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.append((double) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder19.insert((int) (short) 0, (double) '#');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder19.delete(4, 5);
        char[] charArray28 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray28);
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list31 = strTokenizer30.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher33 = strTokenizer32.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer34 = strTokenizer30.setDelimiterMatcher(strMatcher33);
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = strTokenizer29.setQuoteMatcher(strMatcher33);
        java.lang.String[] strArray36 = strTokenizer29.getTokenArray();
        org.apache.commons.lang.text.StrTokenizer strTokenizer38 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        java.lang.Object obj39 = strTokenizer38.clone();
        int int40 = strTokenizer38.size();
        org.apache.commons.lang.text.StrMatcher strMatcher41 = strTokenizer38.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer42 = strTokenizer29.setDelimiterMatcher(strMatcher41);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder27.appendFixedWidthPadRight((java.lang.Object) strMatcher41, (int) (byte) 1, '1');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 46, count 57, length 47");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(strMatcher33);
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strTokenizer38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertEquals(obj39.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj39), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj39), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(strMatcher41);
        org.junit.Assert.assertNotNull(strTokenizer42);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) strBuilder7, 0, 'a');
        int int12 = strBuilder7.lastIndexOf("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder7.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder7.appendFixedWidthPadLeft(66, (int) (short) 10, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer20 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder19.append(stringBuffer20, (-1), (int) ' ');
        boolean boolean24 = strBuilder17.equalsIgnoreCase(strBuilder19);
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter25 = strBuilder17.new StrBuilderWriter();
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer4 = strBuilder3.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.replaceAll('a', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher13 = strTokenizer12.getIgnoredMatcher();
        int int15 = strBuilder9.lastIndexOf(strMatcher13, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder9.insert((int) (byte) 1, (int) '4');
        org.apache.commons.lang.text.StrTokenizer strTokenizer19 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher20 = strTokenizer19.getIgnoredMatcher();
        char[] charArray26 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = strTokenizer19.reset(charArray26);
        java.lang.String[] strArray28 = strTokenizer27.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder9.appendWithSeparators((java.lang.Object[]) strArray28, "StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder7.appendWithSeparators((java.lang.Object[]) strArray28, "");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer33 = strBuilder32.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder32.replaceFirst('4', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder38.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer41 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher42 = strTokenizer41.getIgnoredMatcher();
        char[] charArray48 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer49 = strTokenizer41.reset(charArray48);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder40.appendWithSeparators((java.util.Iterator) strTokenizer41, "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer52 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list53 = strTokenizer52.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer54 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher55 = strTokenizer54.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer56 = strTokenizer52.setDelimiterMatcher(strMatcher55);
        int int58 = strBuilder40.lastIndexOf(strMatcher55, (int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder32.deleteFirst(strMatcher55);
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder32.setNewLineText("StrTokenizer[not tokenized yet]");
        int int64 = strBuilder32.lastIndexOf(' ', 19);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strMatcher13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(strMatcher20);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "4   4" });
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strTokenizer41);
        org.junit.Assert.assertNotNull(strMatcher42);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertArrayEquals(charArray48, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer49);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strTokenizer52);
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertNotNull(strTokenizer54);
        org.junit.Assert.assertNotNull(strMatcher55);
        org.junit.Assert.assertNotNull(strTokenizer56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 6 + "'", int64 == 6);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.deleteAll("");
        boolean boolean7 = strBuilder5.contains('a');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.deleteFirst("");
        boolean boolean11 = strBuilder5.contains('#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder5.appendNewLine();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strBuilder12);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
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
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list28 = strTokenizer27.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher30 = strTokenizer29.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer31 = strTokenizer27.setDelimiterMatcher(strMatcher30);
        int int33 = strBuilder26.indexOf(strMatcher30, (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer34 = strTokenizer19.setIgnoredMatcher(strMatcher30);
        java.lang.String str35 = strTokenizer19.previousToken();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder37.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer40 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher41 = strTokenizer40.getIgnoredMatcher();
        char[] charArray47 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer48 = strTokenizer40.reset(charArray47);
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder39.appendWithSeparators((java.util.Iterator) strTokenizer40, "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer51 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list52 = strTokenizer51.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer53 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher54 = strTokenizer53.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer55 = strTokenizer51.setDelimiterMatcher(strMatcher54);
        int int57 = strBuilder39.lastIndexOf(strMatcher54, (int) (byte) 0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer58 = strTokenizer19.setIgnoredMatcher(strMatcher54);
        org.apache.commons.lang.text.StrTokenizer strTokenizer60 = strTokenizer19.setEmptyTokenAsNull(true);
        org.apache.commons.lang.text.StrTokenizer strTokenizer61 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher62 = strTokenizer61.getIgnoredMatcher();
        char[] charArray68 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer69 = strTokenizer61.reset(charArray68);
        java.lang.String[] strArray70 = strTokenizer69.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder72 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder72.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder74.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer78 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list79 = strTokenizer78.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer80 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher81 = strTokenizer80.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer82 = strTokenizer78.setDelimiterMatcher(strMatcher81);
        int int84 = strBuilder77.indexOf(strMatcher81, (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer85 = strTokenizer69.setTrimmerMatcher(strMatcher81);
        org.apache.commons.lang.text.StrTokenizer strTokenizer86 = strTokenizer60.setDelimiterMatcher(strMatcher81);
        org.apache.commons.lang.text.StrBuilder strBuilder88 = strBuilder14.replaceAll(strMatcher81, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder90 = strBuilder14.deleteAll('a');
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(strMatcher10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n" + "'", str17, "\n");
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strMatcher30);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertNotNull(strMatcher41);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer48);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertNotNull(strMatcher54);
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer58);
        org.junit.Assert.assertNotNull(strTokenizer60);
        org.junit.Assert.assertNotNull(strTokenizer61);
        org.junit.Assert.assertNotNull(strMatcher62);
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertArrayEquals(charArray68, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer69);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "4   4" });
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNotNull(strTokenizer78);
        org.junit.Assert.assertNotNull(list79);
        org.junit.Assert.assertNotNull(strTokenizer80);
        org.junit.Assert.assertNotNull(strMatcher81);
        org.junit.Assert.assertNotNull(strTokenizer82);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer85);
        org.junit.Assert.assertNotNull(strTokenizer86);
        org.junit.Assert.assertNotNull(strBuilder88);
        org.junit.Assert.assertNotNull(strBuilder90);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.apache.commons.lang.text.StrTokenizer strTokenizer0 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher1 = strTokenizer0.getIgnoredMatcher();
        char[] charArray7 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer8 = strTokenizer0.reset(charArray7);
        org.apache.commons.lang.text.StrTokenizer strTokenizer9 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray7);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.setLength(0);
        java.io.Writer writer14 = strBuilder13.asWriter();
        org.apache.commons.lang.text.StrTokenizer strTokenizer15 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher16 = strTokenizer15.getIgnoredMatcher();
        int int17 = strBuilder13.indexOf(strMatcher16);
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = strTokenizer9.setDelimiterMatcher(strMatcher16);
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = strTokenizer18.setEmptyTokenAsNull(true);
        org.apache.commons.lang.text.StrMatcher strMatcher21 = strTokenizer20.getTrimmerMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer31 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list32 = strTokenizer31.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer33 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher34 = strTokenizer33.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = strTokenizer31.setDelimiterMatcher(strMatcher34);
        int int37 = strBuilder30.indexOf(strMatcher34, (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer38 = strTokenizer23.setIgnoredMatcher(strMatcher34);
        org.apache.commons.lang.text.StrMatcher strMatcher39 = strTokenizer38.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer40 = strTokenizer20.setQuoteMatcher(strMatcher39);
        org.apache.commons.lang.text.StrMatcher strMatcher41 = strTokenizer20.getDelimiterMatcher();
        org.junit.Assert.assertNotNull(strTokenizer0);
        org.junit.Assert.assertNotNull(strMatcher1);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(writer14);
        org.junit.Assert.assertNotNull(strTokenizer15);
        org.junit.Assert.assertNotNull(strMatcher16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strMatcher21);
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(strTokenizer33);
        org.junit.Assert.assertNotNull(strMatcher34);
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer38);
        org.junit.Assert.assertNotNull(strMatcher39);
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertNotNull(strMatcher41);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) strBuilder7, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher12 = strTokenizer11.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder1.replaceAll(strMatcher12, "StrTokenizer[not tokenized yet]");
        int int16 = strBuilder14.indexOf('#');
        int int19 = strBuilder14.indexOf('4', (int) (byte) 10);
        strBuilder14.size = 5;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.setLength(0);
        int int26 = strBuilder25.capacity();
        int int28 = strBuilder25.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder25.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder29.deleteFirst('#');
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter32 = strBuilder29.new StrBuilderWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder14.appendFixedWidthPadRight((java.lang.Object) strBuilder29, (int) '4', '4');
        java.lang.String str36 = strBuilder14.getNewLineText();
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertNotNull(strMatcher12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer4 = strBuilder3.new StrBuilderTokenizer();
        char[] charArray5 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer6 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray5);
        java.util.List list9 = strBuilderTokenizer4.tokenize(charArray5, (int) (short) -1, (int) '#');
        java.lang.String str10 = strBuilderTokenizer4.getContent();
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder16.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list21 = strTokenizer20.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer22 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher23 = strTokenizer22.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = strTokenizer20.setDelimiterMatcher(strMatcher23);
        int int26 = strBuilder19.indexOf(strMatcher23, (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = strTokenizer12.setIgnoredMatcher(strMatcher23);
        java.lang.String str28 = strTokenizer12.previousToken();
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer33 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher34 = strTokenizer33.getIgnoredMatcher();
        char[] charArray40 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer41 = strTokenizer33.reset(charArray40);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder32.appendWithSeparators((java.util.Iterator) strTokenizer33, "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer44 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list45 = strTokenizer44.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer46 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher47 = strTokenizer46.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer48 = strTokenizer44.setDelimiterMatcher(strMatcher47);
        int int50 = strBuilder32.lastIndexOf(strMatcher47, (int) (byte) 0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer51 = strTokenizer12.setIgnoredMatcher(strMatcher47);
        org.apache.commons.lang.text.StrMatcher strMatcher52 = strTokenizer51.getDelimiterMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer53 = strBuilderTokenizer4.setQuoteMatcher(strMatcher52);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder55.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer58 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher59 = strTokenizer58.getIgnoredMatcher();
        char[] charArray65 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer66 = strTokenizer58.reset(charArray65);
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder57.appendWithSeparators((java.util.Iterator) strTokenizer58, "hi!");
        char[] charArray69 = strBuilder68.buffer;
        java.util.List list72 = strBuilderTokenizer4.tokenize(charArray69, (int) (short) 100, 4);
        org.apache.commons.lang.text.StrMatcher strMatcher73 = strBuilderTokenizer4.getDelimiterMatcher();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(strTokenizer22);
        org.junit.Assert.assertNotNull(strMatcher23);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strTokenizer33);
        org.junit.Assert.assertNotNull(strMatcher34);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer41);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strTokenizer44);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(strTokenizer46);
        org.junit.Assert.assertNotNull(strMatcher47);
        org.junit.Assert.assertNotNull(strTokenizer48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(strMatcher52);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strTokenizer58);
        org.junit.Assert.assertNotNull(strMatcher59);
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertArrayEquals(charArray65, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer66);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertNotNull(list72);
        org.junit.Assert.assertNotNull(strMatcher73);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        boolean boolean2 = strBuilder1.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.insert(0, true);
        int int7 = strBuilder1.lastIndexOf("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.append((double) 1.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder3.appendPadding((int) '#', '#');
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter9 = strBuilder8.new StrBuilderWriter();
        char[] charArray10 = strBuilder8.buffer;
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder16.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list21 = strTokenizer20.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer22 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher23 = strTokenizer22.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = strTokenizer20.setDelimiterMatcher(strMatcher23);
        int int26 = strBuilder19.indexOf(strMatcher23, (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = strTokenizer12.setIgnoredMatcher(strMatcher23);
        java.lang.String str28 = strTokenizer12.previousToken();
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer33 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher34 = strTokenizer33.getIgnoredMatcher();
        char[] charArray40 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer41 = strTokenizer33.reset(charArray40);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder32.appendWithSeparators((java.util.Iterator) strTokenizer33, "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer44 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list45 = strTokenizer44.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer46 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher47 = strTokenizer46.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer48 = strTokenizer44.setDelimiterMatcher(strMatcher47);
        int int50 = strBuilder32.lastIndexOf(strMatcher47, (int) (byte) 0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer51 = strTokenizer12.setIgnoredMatcher(strMatcher47);
        org.apache.commons.lang.text.StrTokenizer strTokenizer53 = strTokenizer51.setIgnoredChar('4');
        org.apache.commons.lang.text.StrMatcher strMatcher54 = strTokenizer51.getQuoteMatcher();
        org.apache.commons.lang.text.StrMatcher strMatcher55 = strTokenizer51.getDelimiterMatcher();
        java.lang.String[] strArray56 = strTokenizer51.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder8.appendWithSeparators((java.lang.Object[]) strArray56, "1.0###################################");
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(strTokenizer22);
        org.junit.Assert.assertNotNull(strMatcher23);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strTokenizer33);
        org.junit.Assert.assertNotNull(strMatcher34);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer41);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strTokenizer44);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(strTokenizer46);
        org.junit.Assert.assertNotNull(strMatcher47);
        org.junit.Assert.assertNotNull(strTokenizer48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertNotNull(strMatcher54);
        org.junit.Assert.assertNotNull(strMatcher55);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strBuilder58);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
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
        org.apache.commons.lang.text.StrBuilder strBuilder45 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder45.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer48 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher49 = strTokenizer48.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder45.deleteAll(strMatcher49);
        int int52 = strBuilder14.indexOf(strMatcher49, 0);
        int int54 = strBuilder14.indexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder56 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder56.setLength(0);
        int int59 = strBuilder58.capacity();
        int int61 = strBuilder58.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder58.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder62.deleteFirst('#');
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter65 = strBuilder62.new StrBuilderWriter();
        strBuilderWriter65.close();
        strBuilderWriter65.flush();
        strBuilderWriter65.write(10);
        strBuilderWriter65.write("");
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder14.append((java.lang.Object) strBuilderWriter65);
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder14.insert(0, (float) 40);
        // The following exception was thrown during execution in test generation
        try {
            int int78 = strBuilder75.validateRange(131, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strTokenizer10);
        org.junit.Assert.assertNotNull(strMatcher11);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "");
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(strMatcher33);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strTokenizer48);
        org.junit.Assert.assertNotNull(strMatcher49);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 35 + "'", int59 == 35);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strBuilder75);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        int int7 = strBuilder1.lastIndexOf(strMatcher5, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader10 = strBuilder9.new StrBuilderReader();
        boolean boolean11 = strBuilderReader10.markSupported();
        strBuilderReader10.mark((int) (byte) 100);
        java.io.Writer writer14 = java.io.Writer.nullWriter();
        long long15 = strBuilderReader10.transferTo(writer14);
        boolean boolean16 = strBuilderReader10.ready();
        strBuilderReader10.close();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("hi!");
        boolean boolean20 = strBuilder19.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder19.deleteAll('#');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder19.replaceFirst('#', 'a');
        char[] charArray27 = strBuilder19.toCharArray();
        // The following exception was thrown during execution in test generation
        try {
            int int30 = strBuilderReader10.read(charArray27, 0, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(writer14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 7L + "'", long15 == 7L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { 'h', 'i', '!' });
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) strBuilder7, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = strBuilder1.asTokenizer();
        int int13 = strBuilder1.indexOf("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrTokenizer strTokenizer14 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher15 = strTokenizer14.getIgnoredMatcher();
        char[] charArray21 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer22 = strTokenizer14.reset(charArray21);
        org.apache.commons.lang.text.StrMatcher strMatcher23 = strTokenizer22.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder1.replace(strMatcher23, "4   4", (int) (byte) 0, (int) (byte) 0, 33);
        java.lang.String str30 = strBuilder28.rightString(48);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer14);
        org.junit.Assert.assertNotNull(strMatcher15);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer22);
        org.junit.Assert.assertNotNull(strMatcher23);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder3.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer7 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list8 = strTokenizer7.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer9 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher10 = strTokenizer9.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = strTokenizer7.setDelimiterMatcher(strMatcher10);
        int int13 = strBuilder6.indexOf(strMatcher10, (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher19 = strTokenizer18.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder15.deleteAll(strMatcher19);
        java.lang.StringBuffer stringBuffer21 = strBuilder20.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder6.append(stringBuffer21, (int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder24.append((float) 12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = strBuilder26.substring((int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(strMatcher10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(stringBuffer21);
        org.junit.Assert.assertEquals(stringBuffer21.toString(), "");
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder26);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) strBuilder7, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = strBuilder1.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.setLength(0);
        java.io.Writer writer16 = strBuilder15.asWriter();
        org.apache.commons.lang.text.StrTokenizer strTokenizer17 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher18 = strTokenizer17.getIgnoredMatcher();
        int int19 = strBuilder15.indexOf(strMatcher18);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder1.replaceAll(strMatcher18, "StrTokenizer[hi!]");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder1.insert(16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 16");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(writer16);
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(strMatcher18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(strBuilder21);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.deleteAll("");
        java.lang.Object obj6 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append(obj6);
        java.lang.String str9 = strBuilder5.substring(1);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder5.appendFixedWidthPadRight(33, 0, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder17.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer21 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list22 = strTokenizer21.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher24 = strTokenizer23.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer25 = strTokenizer21.setDelimiterMatcher(strMatcher24);
        int int27 = strBuilder20.indexOf(strMatcher24, (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder20.appendNewLine();
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = strTokenizer30.setIgnoreEmptyTokens(false);
        java.lang.String str33 = strTokenizer32.previousToken();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder20.appendWithSeparators((java.util.Iterator) strTokenizer32, "");
        int int37 = strBuilder35.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder39.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer42 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher43 = strTokenizer42.getIgnoredMatcher();
        char[] charArray49 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer50 = strTokenizer42.reset(charArray49);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder41.appendWithSeparators((java.util.Iterator) strTokenizer42, "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher53 = strTokenizer42.getTrimmerMatcher();
        int int55 = strBuilder35.indexOf(strMatcher53, 32);
        int int56 = strBuilder5.indexOf(strMatcher53);
        org.apache.commons.lang.text.StrBuilder strBuilder59 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder61 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder61.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder61.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder59.appendFixedWidthPadRight((java.lang.Object) strBuilder65, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer69 = strBuilder59.asTokenizer();
        int int71 = strBuilder59.lastIndexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder73 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder73.deleteFirst("");
        char[] charArray76 = null;
        char[] charArray77 = strBuilder73.getChars(charArray76);
        boolean boolean78 = strBuilder59.equals((java.lang.Object) charArray76);
        java.lang.String str80 = strBuilder59.rightString((int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder59.deleteFirst("4   4");
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder59.append(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder86 = strBuilder84.deleteAll("\n\n0");
        char[] charArray87 = strBuilder84.toCharArray();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder88 = strBuilder5.insert(43, charArray87);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 43");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "i!" + "'", str9, "i!");
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertNotNull(strMatcher24);
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertNotNull(strMatcher43);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertArrayEquals(charArray49, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer50);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strMatcher53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strTokenizer69);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(charArray77);
        org.junit.Assert.assertArrayEquals(charArray77, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strBuilder84);
        org.junit.Assert.assertNotNull(strBuilder86);
        org.junit.Assert.assertNotNull(charArray87);
        org.junit.Assert.assertArrayEquals(charArray87, new char[] { 'h', 'i', '!', ' ' });
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.appendFixedWidthPadLeft(0, (int) (byte) -1, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder3.replaceFirst("StrTokenizer[not tokenized yet]", "StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.setNewLineText("i!");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder10.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.deleteFirst('i');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder17.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher21 = strTokenizer20.getIgnoredMatcher();
        int int23 = strBuilder17.lastIndexOf(strMatcher21, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder17.insert((int) (byte) 1, (int) '4');
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher28 = strTokenizer27.getIgnoredMatcher();
        char[] charArray34 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = strTokenizer27.reset(charArray34);
        java.lang.String[] strArray36 = strTokenizer35.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder17.appendWithSeparators((java.lang.Object[]) strArray36, "StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder38.appendFixedWidthPadLeft((int) 'a', 0, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder38.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder43.appendPadding(100, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder46.deleteAll("h");
        char[] charArray49 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer50 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray49);
        org.apache.commons.lang.text.StrTokenizer strTokenizer51 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list52 = strTokenizer51.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer53 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher54 = strTokenizer53.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer55 = strTokenizer51.setDelimiterMatcher(strMatcher54);
        org.apache.commons.lang.text.StrTokenizer strTokenizer56 = strTokenizer50.setQuoteMatcher(strMatcher54);
        java.lang.String[] strArray57 = strTokenizer50.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder59 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder59.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer62 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher63 = strTokenizer62.getIgnoredMatcher();
        int int65 = strBuilder59.lastIndexOf(strMatcher63, 100);
        org.apache.commons.lang.text.StrTokenizer strTokenizer66 = strTokenizer50.setIgnoredMatcher(strMatcher63);
        int int68 = strBuilder46.lastIndexOf(strMatcher63, 112);
        boolean boolean69 = strBuilder15.contains(strMatcher63);
        boolean boolean71 = strBuilder15.endsWith("h100i!");
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder15.minimizeCapacity();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strMatcher21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertNotNull(strMatcher28);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "4   4" });
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertArrayEquals(charArray49, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer50);
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertNotNull(strMatcher54);
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertNotNull(strTokenizer56);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strTokenizer62);
        org.junit.Assert.assertNotNull(strMatcher63);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer66);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(strBuilder72);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.deleteAll("");
        java.lang.Object obj6 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append(obj6);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.replaceFirst("", "4   4");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder7.insert(0, (double) 10L);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher19 = strTokenizer18.getIgnoredMatcher();
        int int21 = strBuilder15.lastIndexOf(strMatcher19, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder15.append(true);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader24 = strBuilder23.new StrBuilderReader();
        boolean boolean25 = strBuilderReader24.markSupported();
        strBuilderReader24.mark((int) (byte) 100);
        java.io.Writer writer28 = java.io.Writer.nullWriter();
        long long29 = strBuilderReader24.transferTo(writer28);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder31.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer34 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher35 = strTokenizer34.getIgnoredMatcher();
        char[] charArray41 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer42 = strTokenizer34.reset(charArray41);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder33.appendWithSeparators((java.util.Iterator) strTokenizer34, "hi!");
        char[] charArray45 = strBuilder44.buffer;
        int int46 = strBuilderReader24.read(charArray45);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder7.append(charArray45);
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder47.setNewLineText("i!");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder47.insert(66, "hStrTokenizer[not tokenized yet]i!4   4");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 66");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(writer28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 7L + "'", long29 == 7L);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(strMatcher35);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder49);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        boolean boolean2 = strBuilder1.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.append((int) (short) 10);
        int int6 = strBuilder4.lastIndexOf("4   4");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = new org.apache.commons.lang.text.StrBuilder("hi!");
        boolean boolean11 = strBuilder10.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.deleteFirst("StrTokenizer[not tokenized yet]");
        int int16 = strBuilder12.indexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.setLength(0);
        java.io.Writer writer21 = strBuilder20.asWriter();
        java.io.Writer writer23 = writer21.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer31 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list32 = strTokenizer31.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer33 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher34 = strTokenizer33.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = strTokenizer31.setDelimiterMatcher(strMatcher34);
        int int37 = strBuilder30.indexOf(strMatcher34, (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder39.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer42 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher43 = strTokenizer42.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder39.deleteAll(strMatcher43);
        java.lang.StringBuffer stringBuffer45 = strBuilder44.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder30.append(stringBuffer45, (int) (short) 0, 0);
        java.io.Writer writer49 = writer23.append((java.lang.CharSequence) stringBuffer45);
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder12.append(stringBuffer45);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder8.append(stringBuffer45, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder4.append(stringBuffer45, (-1), 3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(writer21);
        org.junit.Assert.assertNotNull(writer23);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(strTokenizer33);
        org.junit.Assert.assertNotNull(strMatcher34);
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertNotNull(strMatcher43);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(stringBuffer45);
        org.junit.Assert.assertEquals(stringBuffer45.toString(), "");
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(writer49);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder53);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        java.io.Writer writer4 = strBuilder3.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.replaceAll("\n", "");
        java.lang.String str9 = strBuilder5.toString();
        java.lang.String str12 = strBuilder5.midString(0, 131);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(writer4);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.deleteAll("");
        boolean boolean7 = strBuilder5.contains('a');
        java.lang.String str10 = strBuilder5.midString(0, (int) (short) 0);
        int int11 = strBuilder5.capacity();
        org.apache.commons.lang.text.StrMatcher strMatcher12 = null;
        int int13 = strBuilder5.indexOf(strMatcher12);
        org.apache.commons.lang.text.StrTokenizer strTokenizer14 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher15 = strTokenizer14.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer16 = strTokenizer14.reset();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer21 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher22 = strTokenizer21.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder18.deleteAll(strMatcher22);
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = strTokenizer16.setTrimmerMatcher(strMatcher22);
        int int25 = strBuilder5.indexOf(strMatcher22);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder29.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder29.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder27.appendFixedWidthPadRight((java.lang.Object) strBuilder33, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer37 = strBuilder27.asTokenizer();
        int int39 = strBuilder27.lastIndexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder5.append(strBuilder27, 0, 1);
        java.lang.String str43 = strBuilder5.getNewLineText();
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder5.append(3L);
        java.lang.Class<?> wildcardClass46 = strBuilder5.getClass();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer14);
        org.junit.Assert.assertNotNull(strMatcher15);
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strMatcher22);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        char[] charArray11 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strTokenizer4.reset(charArray11);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.appendWithSeparators((java.util.Iterator) strTokenizer4, "hi!");
        int int16 = strBuilder14.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder14.insert((int) (short) 1, "StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.append((double) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder19.delete(32, 131);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder24);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        int int7 = strBuilder1.lastIndexOf(strMatcher5, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer12 = strBuilder11.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder11.replaceAll('a', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder17.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher21 = strTokenizer20.getIgnoredMatcher();
        int int23 = strBuilder17.lastIndexOf(strMatcher21, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder17.insert((int) (byte) 1, (int) '4');
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher28 = strTokenizer27.getIgnoredMatcher();
        char[] charArray34 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = strTokenizer27.reset(charArray34);
        java.lang.String[] strArray36 = strTokenizer35.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder17.appendWithSeparators((java.lang.Object[]) strArray36, "StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder15.appendWithSeparators((java.lang.Object[]) strArray36, "");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder45.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder45.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder43.appendFixedWidthPadRight((java.lang.Object) strBuilder49, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer53 = strBuilder43.asTokenizer();
        int int55 = strBuilder43.indexOf("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder57 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder57.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer60 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher61 = strTokenizer60.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder57.deleteAll(strMatcher61);
        java.lang.StringBuffer stringBuffer63 = strBuilder62.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder43.append(stringBuffer63);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader65 = strBuilder43.new StrBuilderReader();
        int int66 = strBuilderReader65.read();
        java.io.Reader reader67 = java.io.Reader.nullReader();
        char[] charArray68 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer69 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray68);
        int int70 = reader67.read(charArray68);
        int int71 = strBuilderReader65.read(charArray68);
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder15.insert(1, charArray68);
        org.apache.commons.lang.text.StrTokenizer strTokenizer74 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        java.lang.Object obj75 = strTokenizer74.clone();
        int int76 = strTokenizer74.size();
        org.apache.commons.lang.text.StrMatcher strMatcher77 = strTokenizer74.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder72.deleteAll(strMatcher77);
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder1.replaceFirst(strMatcher77, "!\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strMatcher21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertNotNull(strMatcher28);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "4   4" });
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strTokenizer60);
        org.junit.Assert.assertNotNull(strMatcher61);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(stringBuffer63);
        org.junit.Assert.assertEquals(stringBuffer63.toString(), "");
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 104 + "'", int66 == 104);
        org.junit.Assert.assertNotNull(reader67);
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertArrayEquals(charArray68, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strTokenizer74);
        org.junit.Assert.assertNotNull(obj75);
        org.junit.Assert.assertEquals(obj75.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj75), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj75), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(strMatcher77);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNotNull(strBuilder80);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) strBuilder7, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = strBuilder1.asTokenizer();
        int int13 = strBuilder1.indexOf("StrTokenizer[not tokenized yet]");
        int int15 = strBuilder1.lastIndexOf('a');
        java.lang.Class<?> wildcardClass16 = strBuilder1.getClass();
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.append((double) 1.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder3.appendPadding((int) '#', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder8.appendFixedWidthPadLeft((int) ' ', 0, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer14 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer22 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list23 = strTokenizer22.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher25 = strTokenizer24.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer26 = strTokenizer22.setDelimiterMatcher(strMatcher25);
        int int28 = strBuilder21.indexOf(strMatcher25, (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = strTokenizer14.setIgnoredMatcher(strMatcher25);
        int int31 = strBuilder8.lastIndexOf(strMatcher25, (int) (short) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder8.setNullText("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder33.deleteAll('a');
        int int37 = strBuilder35.indexOf("");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder35.append('a');
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder39.append("hi!#");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder41.insert(4, 10.0d);
        java.lang.Object obj45 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder44.appendFixedWidthPadLeft(obj45, 46, '1');
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strTokenizer14);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strTokenizer22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strMatcher25);
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder48);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        int int4 = strBuilder3.capacity();
        int int6 = strBuilder3.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder7.deleteFirst('#');
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter10 = strBuilder7.new StrBuilderWriter();
        java.io.Writer writer12 = strBuilderWriter10.append(' ');
        strBuilderWriter10.close();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder((int) 'a');
        char[] charArray17 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray17);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder15.insert(0, charArray17);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer22 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder21.append(stringBuffer22, (-1), (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer26 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list27 = strTokenizer26.getTokenList();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder21.appendWithSeparators((java.util.Collection) list27, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder15.appendFixedWidthPadRight((java.lang.Object) "hi!", (int) (byte) -1, '4');
        int int34 = strBuilder15.indexOf("\n");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder15.append((float) 105);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder15.insert((int) (short) 1, (long) 35);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder41.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer44 = strBuilder43.new StrBuilderTokenizer();
        char[] charArray45 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer46 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray45);
        java.util.List list49 = strBuilderTokenizer44.tokenize(charArray45, (int) (short) -1, (int) '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer50 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray45);
        org.apache.commons.lang.text.StrTokenizer strTokenizer51 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray45);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder15.append(charArray45);
        org.apache.commons.lang.text.StrTokenizer strTokenizer53 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray45);
        strBuilderWriter10.write(charArray45);
        java.io.Writer writer56 = strBuilderWriter10.append('i');
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(writer12);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer46);
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertNotNull(strTokenizer50);
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertNotNull(writer56);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer9 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list10 = strTokenizer9.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher12 = strTokenizer11.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer13 = strTokenizer9.setDelimiterMatcher(strMatcher12);
        int int15 = strBuilder8.indexOf(strMatcher12, (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer16 = strTokenizer1.setIgnoredMatcher(strMatcher12);
        java.util.List list17 = strTokenizer16.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer19 = strTokenizer16.setEmptyTokenAsNull(true);
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertNotNull(strMatcher12);
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(strTokenizer19);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.deleteAll("");
        boolean boolean7 = strBuilder5.contains('a');
        java.lang.String str10 = strBuilder5.midString(0, (int) (short) 0);
        int int11 = strBuilder5.capacity();
        java.lang.String str14 = strBuilder5.midString((-1), (int) '#');
        int int16 = strBuilder5.lastIndexOf("4   4");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder5.appendPadding((int) '4', 'i');
        java.lang.String str20 = strBuilder5.getNewLineText();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        char[] charArray11 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strTokenizer4.reset(charArray11);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.appendWithSeparators((java.util.Iterator) strTokenizer4, "hi!");
        int int16 = strBuilder14.indexOf("hi!");
        boolean boolean18 = strBuilder14.startsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder14.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder23.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder21.appendFixedWidthPadRight((java.lang.Object) strBuilder27, 0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder30.appendNull();
        java.lang.String str34 = strBuilder31.substring(0, 3);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder31.trim();
        char[] charArray36 = strBuilder35.buffer;
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder14.appendFixedWidthPadLeft((java.lang.Object) charArray36, 104, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder39.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder39.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder42.appendFixedWidthPadLeft(43, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer47 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher48 = strTokenizer47.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder50.setLength(0);
        java.io.Writer writer53 = strBuilder52.asWriter();
        org.apache.commons.lang.text.StrTokenizer strTokenizer54 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher55 = strTokenizer54.getIgnoredMatcher();
        int int56 = strBuilder52.indexOf(strMatcher55);
        org.apache.commons.lang.text.StrTokenizer strTokenizer57 = strTokenizer47.setQuoteMatcher(strMatcher55);
        org.apache.commons.lang.text.StrTokenizer strTokenizer59 = strTokenizer47.reset(" ");
        org.apache.commons.lang.text.StrMatcher strMatcher60 = strTokenizer47.getTrimmerMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder46.replaceFirst(strMatcher60, "        66");
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder46.insert(0, '#');
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strTokenizer47);
        org.junit.Assert.assertNotNull(strMatcher48);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(writer53);
        org.junit.Assert.assertNotNull(strTokenizer54);
        org.junit.Assert.assertNotNull(strMatcher55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer57);
        org.junit.Assert.assertNotNull(strTokenizer59);
        org.junit.Assert.assertNotNull(strMatcher60);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder65);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.deleteAll("");
        java.lang.Object obj6 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append(obj6);
        org.apache.commons.lang.text.StrTokenizer strTokenizer8 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher9 = strTokenizer8.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder7.replaceAll(strMatcher9, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder7.insert(3, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher24 = strTokenizer23.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder20.deleteAll(strMatcher24);
        java.lang.StringBuffer stringBuffer26 = strBuilder25.toStringBuffer();
        boolean boolean27 = strBuilder18.equals((java.lang.Object) strBuilder25);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder18.ensureCapacity((int) (short) 10);
        org.apache.commons.lang.text.StrTokenizer strTokenizer31 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer33 = strTokenizer31.setIgnoreEmptyTokens(false);
        java.lang.String str34 = strTokenizer33.previousToken();
        java.lang.String[] strArray35 = strTokenizer33.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder18.appendWithSeparators((java.util.Iterator) strTokenizer33, "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer39 = strTokenizer33.setDelimiterChar('a');
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder7.appendFixedWidthPadRight((java.lang.Object) strTokenizer39, 0, ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer44 = strTokenizer39.setQuoteChar('#');
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(strMatcher9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertNotNull(strMatcher24);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(stringBuffer26);
        org.junit.Assert.assertEquals(stringBuffer26.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(strTokenizer33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strTokenizer39);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strTokenizer44);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst("i!", "hi!");
        java.lang.String str5 = strBuilder0.leftString((-1));
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder7.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder7.deleteAll("");
        boolean boolean13 = strBuilder11.contains('a');
        java.io.Writer writer14 = strBuilder11.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder11.replaceAll("4   4", "StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = strBuilder17.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder22.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder20.appendFixedWidthPadRight((java.lang.Object) strBuilder26, 0, 'a');
        int int31 = strBuilder26.lastIndexOf("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder26.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder34.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer38 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        java.lang.Object obj39 = strTokenizer38.clone();
        int int40 = strTokenizer38.size();
        org.apache.commons.lang.text.StrMatcher strMatcher41 = strTokenizer38.getIgnoredMatcher();
        int int43 = strBuilder36.indexOf(strMatcher41, 10);
        int int44 = strBuilder32.indexOf(strMatcher41);
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder17.replace(strMatcher41, "StrTokenizer[hi!]", 2, (int) '#', 6);
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder0.deleteFirst(strMatcher41);
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder50.appendFixedWidthPadRight(19, 88, '#');
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(writer14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strTokenizer38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertEquals(obj39.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj39), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj39), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(strMatcher41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder54);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        java.io.Writer writer4 = strBuilder3.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.replaceAll("\n", "");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder((int) 'a');
        boolean boolean12 = strBuilder5.equalsIgnoreCase(strBuilder11);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer21 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher22 = strTokenizer21.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder18.deleteAll(strMatcher22);
        java.lang.StringBuffer stringBuffer24 = strBuilder23.toStringBuffer();
        boolean boolean25 = strBuilder16.equals((java.lang.Object) strBuilder23);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder16.ensureCapacity((int) (short) 10);
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer31 = strTokenizer29.setIgnoreEmptyTokens(false);
        java.lang.String str32 = strTokenizer31.previousToken();
        java.lang.String[] strArray33 = strTokenizer31.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder16.appendWithSeparators((java.util.Iterator) strTokenizer31, "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer37 = strTokenizer31.setDelimiterChar('a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer39 = strTokenizer31.reset("StrTokenizer[]");
        org.apache.commons.lang.text.StrMatcher strMatcher40 = strTokenizer39.getQuoteMatcher();
        boolean boolean41 = strBuilder5.contains(strMatcher40);
        char[] charArray42 = strBuilder5.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder44.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer47 = strBuilder46.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder46.replaceAll('a', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder52 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder52.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer55 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher56 = strTokenizer55.getIgnoredMatcher();
        int int58 = strBuilder52.lastIndexOf(strMatcher56, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder52.insert((int) (byte) 1, (int) '4');
        org.apache.commons.lang.text.StrTokenizer strTokenizer62 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher63 = strTokenizer62.getIgnoredMatcher();
        char[] charArray69 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer70 = strTokenizer62.reset(charArray69);
        java.lang.String[] strArray71 = strTokenizer70.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder52.appendWithSeparators((java.lang.Object[]) strArray71, "StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder50.appendWithSeparators((java.lang.Object[]) strArray71, "");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer76 = strBuilder75.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder75.deleteAll("4   4");
        boolean boolean80 = strBuilder78.endsWith("\n");
        java.lang.StringBuffer stringBuffer81 = strBuilder78.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder5.append(stringBuffer81);
        char[] charArray83 = strBuilder5.buffer;
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(writer4);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strMatcher22);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(stringBuffer24);
        org.junit.Assert.assertEquals(stringBuffer24.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertNotNull(strTokenizer39);
        org.junit.Assert.assertNotNull(strMatcher40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] {});
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertNotNull(strMatcher56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strTokenizer62);
        org.junit.Assert.assertNotNull(strMatcher63);
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertArrayEquals(charArray69, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer70);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "4   4" });
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(stringBuffer81);
        org.junit.Assert.assertEquals(stringBuffer81.toString(), "hi!");
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(charArray83);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        char[] charArray11 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strTokenizer4.reset(charArray11);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.appendWithSeparators((java.util.Iterator) strTokenizer4, "hi!");
        int int16 = strBuilder14.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder14.insert((int) (short) 1, "StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.append((double) (short) -1);
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        java.lang.Object obj24 = strTokenizer23.clone();
        int int25 = strTokenizer23.size();
        org.apache.commons.lang.text.StrMatcher strMatcher26 = strTokenizer23.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder28.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer31 = strBuilder30.new StrBuilderTokenizer();
        int int34 = strBuilder30.indexOf("StrTokenizer[not tokenized yet]", (int) (short) 1);
        java.io.Writer writer35 = strBuilder30.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder37.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer40 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher41 = strTokenizer40.getIgnoredMatcher();
        int int43 = strBuilder37.lastIndexOf(strMatcher41, 100);
        int int45 = strBuilder30.indexOf(strMatcher41, (int) (short) 0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer46 = strTokenizer23.setDelimiterMatcher(strMatcher41);
        boolean boolean47 = strTokenizer23.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrMatcher strMatcher48 = strTokenizer23.getDelimiterMatcher();
        int int49 = strBuilder21.lastIndexOf(strMatcher48);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(strMatcher26);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(writer35);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertNotNull(strMatcher41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strMatcher48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) strBuilder7, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = strBuilder1.asTokenizer();
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader12 = strBuilder1.new StrBuilderReader();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder1.appendPadding(39, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.replaceFirst("hi!true", "#########################");
        // The following exception was thrown during execution in test generation
        try {
            char char20 = strBuilder18.charAt(88);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 88");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) strBuilder7, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = strBuilder1.asTokenizer();
        int int13 = strBuilder1.lastIndexOf("hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer15 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher16 = strTokenizer15.getIgnoredMatcher();
        char[] charArray22 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = strTokenizer15.reset(charArray22);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder1.insert((int) (byte) 1, charArray22);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder24.append('#');
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder24.insert(3, false);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder29.append(false);
        int int32 = strBuilder31.capacity();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder31.insert((int) (short) 0, (long) (short) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder35.replaceFirst("hi!truehi!35.0", "StrTokenizer[]");
        org.apache.commons.lang.text.StrTokenizer strTokenizer40 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder42.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer45 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher46 = strTokenizer45.getIgnoredMatcher();
        int int48 = strBuilder42.lastIndexOf(strMatcher46, 100);
        org.apache.commons.lang.text.StrTokenizer strTokenizer49 = strTokenizer40.setQuoteMatcher(strMatcher46);
        boolean boolean50 = strTokenizer40.isIgnoreEmptyTokens();
        org.apache.commons.lang.text.StrTokenizer strTokenizer51 = strTokenizer40.reset();
        java.lang.String[] strArray52 = strTokenizer40.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder35.appendWithSeparators((java.lang.Object[]) strArray52, "i!");
        int int55 = strBuilder35.size;
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strTokenizer15);
        org.junit.Assert.assertNotNull(strMatcher16);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strTokenizer45);
        org.junit.Assert.assertNotNull(strMatcher46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 22 + "'", int55 == 22);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder((int) (short) 10);
        char[] charArray2 = strBuilder1.buffer;
        org.apache.commons.lang.text.StrTokenizer strTokenizer3 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher4 = strTokenizer3.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = strTokenizer3.reset();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder7.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer10 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher11 = strTokenizer10.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder7.deleteAll(strMatcher11);
        org.apache.commons.lang.text.StrTokenizer strTokenizer13 = strTokenizer5.setTrimmerMatcher(strMatcher11);
        org.apache.commons.lang.text.StrTokenizer strTokenizer15 = strTokenizer5.reset("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer18 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder17.append(stringBuffer18, (-1), (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder17.reverse();
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher24 = strTokenizer23.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer25 = strTokenizer23.reset();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder27.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher31 = strTokenizer30.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder27.deleteAll(strMatcher31);
        org.apache.commons.lang.text.StrTokenizer strTokenizer33 = strTokenizer25.setTrimmerMatcher(strMatcher31);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder22.replace(strMatcher31, " ", (int) (short) 1, 1, 1);
        org.apache.commons.lang.text.StrTokenizer strTokenizer39 = strTokenizer5.setIgnoredMatcher(strMatcher31);
        int int41 = strBuilder1.lastIndexOf(strMatcher31, 45);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '\000' });
        org.junit.Assert.assertNotNull(strTokenizer3);
        org.junit.Assert.assertNotNull(strMatcher4);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strTokenizer10);
        org.junit.Assert.assertNotNull(strMatcher11);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertNotNull(strTokenizer15);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertNotNull(strMatcher24);
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(strMatcher31);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strTokenizer33);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strTokenizer39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        char[] charArray11 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strTokenizer4.reset(charArray11);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.appendWithSeparators((java.util.Iterator) strTokenizer4, "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher15 = strTokenizer4.getTrimmerMatcher();
        java.lang.String str16 = strTokenizer4.nextToken();
        java.lang.String str17 = strTokenizer4.previousToken();
        java.util.List list18 = strTokenizer4.getTokenList();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strMatcher15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4   4" + "'", str17, "4   4");
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        char[] charArray11 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strTokenizer4.reset(charArray11);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.appendWithSeparators((java.util.Iterator) strTokenizer4, "hi!");
        java.lang.StringBuffer stringBuffer15 = strBuilder14.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader16 = strBuilder14.new StrBuilderReader();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder14.replace(0, 104, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder24.replaceAll("hi!", "");
        char[] charArray28 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray28);
        char[] charArray30 = strBuilder24.getChars(charArray28);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder32.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder34.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer38 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list39 = strTokenizer38.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer40 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher41 = strTokenizer40.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer42 = strTokenizer38.setDelimiterMatcher(strMatcher41);
        int int44 = strBuilder37.indexOf(strMatcher41, (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder24.replaceAll(strMatcher41, "StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder20.replaceAll(strMatcher41, "i!");
        int int50 = strBuilder20.lastIndexOf("h52i!4   4");
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader51 = strBuilder20.new StrBuilderReader();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder20.insert(5, (double) 19);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(stringBuffer15);
        org.junit.Assert.assertEquals(stringBuffer15.toString(), "hi!4   4");
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] {});
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strTokenizer38);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertNotNull(strMatcher41);
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.append((double) 1.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder3.appendPadding((int) '#', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder8.appendFixedWidthPadLeft((int) ' ', 0, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer14 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer22 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list23 = strTokenizer22.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher25 = strTokenizer24.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer26 = strTokenizer22.setDelimiterMatcher(strMatcher25);
        int int28 = strBuilder21.indexOf(strMatcher25, (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = strTokenizer14.setIgnoredMatcher(strMatcher25);
        int int31 = strBuilder8.lastIndexOf(strMatcher25, (int) (short) 100);
        int int33 = strBuilder8.indexOf("StrTokenizer[not tokenized yet]");
        int int35 = strBuilder8.indexOf("StrTokenizer[not tokenized yet]");
        int int36 = strBuilder8.capacity();
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("!ih");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder8.append((java.lang.Object) "!ih");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder39.setNewLineText("StrTokenizer[hi!]");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder39.appendFixedWidthPadRight((int) '1', 105, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder47 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder49 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder49.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder49.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder47.appendFixedWidthPadRight((java.lang.Object) strBuilder53, 0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder56.appendNull();
        java.lang.String str60 = strBuilder57.substring(0, 3);
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder57.trim();
        int int63 = strBuilder61.lastIndexOf("!ih");
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder61.deleteAll(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder61.setNewLineText("StrTokenizer[not tokenized yet]");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder39.append(strBuilder61, 65, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strTokenizer14);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strTokenizer22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strMatcher25);
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 38 + "'", int36 == 38);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder67);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
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
        org.apache.commons.lang.text.StrBuilder strBuilder45 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder45.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer48 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher49 = strTokenizer48.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder45.deleteAll(strMatcher49);
        int int52 = strBuilder14.indexOf(strMatcher49, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder14.appendNull();
        int int54 = strBuilder53.size;
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder53.ensureCapacity((int) '4');
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder53.append(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strTokenizer10);
        org.junit.Assert.assertNotNull(strMatcher11);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "");
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(strMatcher33);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strTokenizer48);
        org.junit.Assert.assertNotNull(strMatcher49);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 3 + "'", int54 == 3);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder58);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.append((double) 1.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder3.appendPadding((int) '#', '#');
        char[] charArray9 = strBuilder8.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder8.replaceAll("!ih", "");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.append((double) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = strBuilder14.substring(55);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteAll(strMatcher5);
        java.lang.String str8 = strBuilder6.leftString(100);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder6.append(" ");
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter11 = strBuilder6.new StrBuilderWriter();
        java.io.Writer writer13 = strBuilderWriter11.append((java.lang.CharSequence) "105.044444");
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(writer13);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        java.io.Writer writer4 = strBuilder3.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.replaceAll("\n", "");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder((int) 'a');
        boolean boolean12 = strBuilder5.equalsIgnoreCase(strBuilder11);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.deleteAll("StrTokenizer[not tokenized yet]");
        int int16 = strBuilder11.lastIndexOf('#');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder11.append((float) (short) 100);
        int int21 = strBuilder11.indexOf("1", 66);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(writer4);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder((int) ' ');
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "StrTokenizer[not tokenized yet]");
        int int6 = strBuilder1.lastIndexOf('a');
        strBuilder1.size = (byte) 1;
        boolean boolean10 = strBuilder1.contains("hi!true");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder3.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrMatcher strMatcher7 = null;
        int int9 = strBuilder3.lastIndexOf(strMatcher7, (int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder3.append(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer19 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list20 = strTokenizer19.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer21 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher22 = strTokenizer21.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = strTokenizer19.setDelimiterMatcher(strMatcher22);
        int int25 = strBuilder18.indexOf(strMatcher22, (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder18.appendNewLine();
        org.apache.commons.lang.text.StrTokenizer strTokenizer28 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = strTokenizer28.setIgnoreEmptyTokens(false);
        java.lang.String str31 = strTokenizer30.previousToken();
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder18.appendWithSeparators((java.util.Iterator) strTokenizer30, "");
        java.lang.StringBuffer stringBuffer34 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder18.append(stringBuffer34, 35, 3);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder11.appendFixedWidthPadLeft((java.lang.Object) strBuilder18, (int) '#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder11.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder42.setNewLineText("h52i!4   4");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder44.insert(1, (float) 12);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strMatcher22);
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder47);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        char[] charArray11 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strTokenizer4.reset(charArray11);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.appendWithSeparators((java.util.Iterator) strTokenizer4, "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher15 = strTokenizer4.getTrimmerMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer17 = strTokenizer4.setEmptyTokenAsNull(false);
        org.apache.commons.lang.text.StrMatcher strMatcher18 = strTokenizer17.getDelimiterMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder22.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder20.appendFixedWidthPadRight((java.lang.Object) strBuilder26, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = strBuilder20.asTokenizer();
        int int32 = strBuilder20.indexOf("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder34.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer37 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher38 = strTokenizer37.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder34.deleteAll(strMatcher38);
        java.lang.StringBuffer stringBuffer40 = strBuilder39.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder20.append(stringBuffer40);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader42 = strBuilder20.new StrBuilderReader();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder44.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer47 = strBuilder46.new StrBuilderTokenizer();
        char[] charArray48 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer49 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray48);
        java.util.List list52 = strBuilderTokenizer47.tokenize(charArray48, (int) (short) -1, (int) '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer53 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray48);
        org.apache.commons.lang.text.StrTokenizer strTokenizer54 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray48);
        int int55 = strBuilderReader42.read(charArray48);
        org.apache.commons.lang.text.StrTokenizer strTokenizer56 = strTokenizer17.reset(charArray48);
        org.apache.commons.lang.text.StrTokenizer strTokenizer58 = strTokenizer17.setIgnoredChar('#');
        java.util.List list59 = strTokenizer17.getTokenList();
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer17.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strMatcher15);
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(strMatcher18);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertNotNull(strMatcher38);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(stringBuffer40);
        org.junit.Assert.assertEquals(stringBuffer40.toString(), "");
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertArrayEquals(charArray48, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer49);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertNotNull(strTokenizer54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(strTokenizer56);
        org.junit.Assert.assertNotNull(strTokenizer58);
        org.junit.Assert.assertNotNull(list59);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        int int4 = strBuilder3.capacity();
        int int6 = strBuilder3.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.trim();
        java.lang.String str9 = strBuilder7.rightString((-1));
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        java.lang.Object obj12 = strTokenizer11.clone();
        org.apache.commons.lang.text.StrTokenizer strTokenizer14 = strTokenizer11.setEmptyTokenAsNull(true);
        java.lang.String str15 = strTokenizer11.toString();
        org.apache.commons.lang.text.StrTokenizer strTokenizer17 = strTokenizer11.setDelimiterChar('a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer19 = strTokenizer17.setEmptyTokenAsNull(true);
        org.apache.commons.lang.text.StrTokenizer strTokenizer21 = strTokenizer17.setDelimiterChar('a');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder7.appendFixedWidthPadLeft((java.lang.Object) strTokenizer17, (int) (short) 100, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder24.insert((int) (byte) 1, 39L);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strTokenizer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str15, "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder27);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.apache.commons.lang.text.StrTokenizer strTokenizer0 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder2.setLength(0);
        int int5 = strBuilder4.capacity();
        int int7 = strBuilder4.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder8.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder9.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder10.appendPadding((int) (byte) 1, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer18 = strBuilder17.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder17.appendFixedWidthPadLeft((java.lang.Object) "", (int) (short) 1, ' ');
        java.lang.String str26 = strBuilder17.midString((-1), (int) (short) 0);
        int int29 = strBuilder17.indexOf('a', 35);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder17.insert((int) (short) 0, (double) 7L);
        int int34 = strBuilder32.lastIndexOf('#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer36 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder38.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder40.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer44 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list45 = strTokenizer44.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer46 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher47 = strTokenizer46.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer48 = strTokenizer44.setDelimiterMatcher(strMatcher47);
        int int50 = strBuilder43.indexOf(strMatcher47, (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer51 = strTokenizer36.setIgnoredMatcher(strMatcher47);
        org.apache.commons.lang.text.StrMatcher strMatcher52 = strTokenizer51.getQuoteMatcher();
        boolean boolean53 = strBuilder32.equals((java.lang.Object) strMatcher52);
        int int55 = strBuilder13.indexOf(strMatcher52, 40);
        org.apache.commons.lang.text.StrTokenizer strTokenizer56 = strTokenizer0.setIgnoredMatcher(strMatcher52);
        org.apache.commons.lang.text.StrTokenizer strTokenizer58 = strTokenizer56.setDelimiterString("h100i!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj59 = strTokenizer56.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strTokenizer0);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer36);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strTokenizer44);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(strTokenizer46);
        org.junit.Assert.assertNotNull(strMatcher47);
        org.junit.Assert.assertNotNull(strTokenizer48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(strMatcher52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer56);
        org.junit.Assert.assertNotNull(strTokenizer58);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.deleteAll("");
        boolean boolean7 = strBuilder5.contains('a');
        java.lang.String str10 = strBuilder5.midString(0, (int) (short) 0);
        int int11 = strBuilder5.capacity();
        org.apache.commons.lang.text.StrMatcher strMatcher12 = null;
        int int13 = strBuilder5.indexOf(strMatcher12);
        org.apache.commons.lang.text.StrTokenizer strTokenizer14 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher15 = strTokenizer14.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer16 = strTokenizer14.reset();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer21 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher22 = strTokenizer21.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder18.deleteAll(strMatcher22);
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = strTokenizer16.setTrimmerMatcher(strMatcher22);
        int int25 = strBuilder5.indexOf(strMatcher22);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder29.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder29.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder27.appendFixedWidthPadRight((java.lang.Object) strBuilder33, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer37 = strBuilder27.asTokenizer();
        int int39 = strBuilder27.lastIndexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder5.append(strBuilder27, 0, 1);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder42.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder42.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder45.append('#');
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder47.reverse();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer14);
        org.junit.Assert.assertNotNull(strMatcher15);
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strMatcher22);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder48);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer9 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list10 = strTokenizer9.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher12 = strTokenizer11.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer13 = strTokenizer9.setDelimiterMatcher(strMatcher12);
        int int15 = strBuilder8.indexOf(strMatcher12, (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer16 = strTokenizer1.setIgnoredMatcher(strMatcher12);
        java.lang.String str17 = strTokenizer1.previousToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer19 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer21 = strTokenizer19.setIgnoredChar('4');
        org.apache.commons.lang.text.StrMatcher strMatcher22 = strTokenizer19.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = strTokenizer1.setTrimmerMatcher(strMatcher22);
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = strTokenizer1.reset();
        int int25 = strTokenizer24.size();
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertNotNull(strMatcher12);
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strMatcher22);
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer4 = strBuilder3.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrTokenizer strTokenizer6 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) "", (int) (short) 1, ' ');
        java.lang.String str12 = strBuilder3.midString((-1), (int) (short) 0);
        int int15 = strBuilder3.indexOf('a', 35);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder3.insert((int) (short) 0, (double) 7L);
        int int20 = strBuilder18.lastIndexOf('#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer22 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder24.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder26.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list31 = strTokenizer30.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher33 = strTokenizer32.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer34 = strTokenizer30.setDelimiterMatcher(strMatcher33);
        int int36 = strBuilder29.indexOf(strMatcher33, (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer37 = strTokenizer22.setIgnoredMatcher(strMatcher33);
        org.apache.commons.lang.text.StrMatcher strMatcher38 = strTokenizer37.getQuoteMatcher();
        boolean boolean39 = strBuilder18.equals((java.lang.Object) strMatcher38);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder18.deleteFirst('4');
        org.apache.commons.lang.text.StrBuilder strBuilder43 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder43.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer46 = strBuilder45.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder45.replaceAll('a', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder51 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder51.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer54 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher55 = strTokenizer54.getIgnoredMatcher();
        int int57 = strBuilder51.lastIndexOf(strMatcher55, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder51.insert((int) (byte) 1, (int) '4');
        org.apache.commons.lang.text.StrTokenizer strTokenizer61 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher62 = strTokenizer61.getIgnoredMatcher();
        char[] charArray68 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer69 = strTokenizer61.reset(charArray68);
        java.lang.String[] strArray70 = strTokenizer69.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder51.appendWithSeparators((java.lang.Object[]) strArray70, "StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder49.appendWithSeparators((java.lang.Object[]) strArray70, "");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer75 = strBuilder74.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder74.deleteAll("4   4");
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder74.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder18.append((java.lang.Object) strBuilder78);
        int int80 = strBuilder79.size;
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer22);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(strMatcher33);
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertNotNull(strMatcher38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strTokenizer54);
        org.junit.Assert.assertNotNull(strMatcher55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strTokenizer61);
        org.junit.Assert.assertNotNull(strMatcher62);
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertArrayEquals(charArray68, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer69);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "4   4" });
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 10 + "'", int80 == 10);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer4 = strBuilder3.new StrBuilderTokenizer();
        char[] charArray5 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer6 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray5);
        java.util.List list9 = strBuilderTokenizer4.tokenize(charArray5, (int) (short) -1, (int) '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer10 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray5);
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray5);
        boolean boolean12 = strTokenizer11.hasNext();
        boolean boolean13 = strTokenizer11.hasNext();
        java.lang.String str14 = strTokenizer11.toString();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(strTokenizer10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "StrTokenizer[]" + "'", str14, "StrTokenizer[]");
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.deleteAll("");
        boolean boolean7 = strBuilder5.contains('a');
        java.io.Writer writer8 = strBuilder5.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder5.replaceAll("4   4", "StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strBuilder11.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder16.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder14.appendFixedWidthPadRight((java.lang.Object) strBuilder20, 0, 'a');
        int int25 = strBuilder20.lastIndexOf("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder20.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder28.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        java.lang.Object obj33 = strTokenizer32.clone();
        int int34 = strTokenizer32.size();
        org.apache.commons.lang.text.StrMatcher strMatcher35 = strTokenizer32.getIgnoredMatcher();
        int int37 = strBuilder30.indexOf(strMatcher35, 10);
        int int38 = strBuilder26.indexOf(strMatcher35);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder11.replace(strMatcher35, "StrTokenizer[hi!]", 2, (int) '#', 6);
        boolean boolean45 = strBuilder11.contains('1');
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(writer8);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(strMatcher35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.append((double) 1.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder3.appendPadding((int) '#', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder8.appendFixedWidthPadLeft((int) ' ', 0, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer14 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer22 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list23 = strTokenizer22.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher25 = strTokenizer24.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer26 = strTokenizer22.setDelimiterMatcher(strMatcher25);
        int int28 = strBuilder21.indexOf(strMatcher25, (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = strTokenizer14.setIgnoredMatcher(strMatcher25);
        int int31 = strBuilder8.lastIndexOf(strMatcher25, (int) (short) 100);
        int int33 = strBuilder8.indexOf("StrTokenizer[not tokenized yet]");
        int int35 = strBuilder8.indexOf("StrTokenizer[not tokenized yet]");
        int int36 = strBuilder8.capacity();
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("!ih");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder8.append((java.lang.Object) "!ih");
        int int42 = strBuilder39.lastIndexOf("\n", (int) '#');
        java.io.Writer writer43 = strBuilder39.asWriter();
        java.lang.String str45 = strBuilder39.leftString((int) (short) 1);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strTokenizer14);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strTokenizer22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strMatcher25);
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 38 + "'", int36 == 38);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(writer43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "1" + "'", str45, "1");
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder3.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer7 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list8 = strTokenizer7.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer9 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher10 = strTokenizer9.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = strTokenizer7.setDelimiterMatcher(strMatcher10);
        int int13 = strBuilder6.indexOf(strMatcher10, (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher19 = strTokenizer18.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder15.deleteAll(strMatcher19);
        java.lang.StringBuffer stringBuffer21 = strBuilder20.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder6.append(stringBuffer21, (int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder24.reverse();
        char[] charArray26 = strBuilder25.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder25.insert(0, true);
        org.apache.commons.lang.text.StrTokenizer strTokenizer31 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        java.lang.Object obj32 = strTokenizer31.clone();
        org.apache.commons.lang.text.StrTokenizer strTokenizer34 = strTokenizer31.reset("");
        java.lang.String str35 = strTokenizer31.previousToken();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer38 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder37.append(stringBuffer38, (-1), (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder43 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder43.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer46 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher47 = strTokenizer46.getIgnoredMatcher();
        char[] charArray53 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer54 = strTokenizer46.reset(charArray53);
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder45.appendWithSeparators((java.util.Iterator) strTokenizer46, "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer57 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher58 = strTokenizer57.getIgnoredMatcher();
        int int59 = strBuilder56.indexOf(strMatcher58);
        int int61 = strBuilder41.lastIndexOf(strMatcher58, (int) 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer62 = strTokenizer31.setTrimmerMatcher(strMatcher58);
        org.apache.commons.lang.text.StrMatcher strMatcher63 = strTokenizer62.getDelimiterMatcher();
        int int64 = strBuilder29.lastIndexOf(strMatcher63);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(strMatcher10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(stringBuffer21);
        org.junit.Assert.assertEquals(stringBuffer21.toString(), "");
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] {});
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strTokenizer46);
        org.junit.Assert.assertNotNull(strMatcher47);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer54);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strTokenizer57);
        org.junit.Assert.assertNotNull(strMatcher58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer62);
        org.junit.Assert.assertNotNull(strMatcher63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) strBuilder7, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = strBuilder1.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder1.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder1.appendFixedWidthPadLeft(42, (int) (byte) 1, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("4   4");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) "4   4", 105, 'i');
        java.lang.String str23 = strBuilder21.leftString((int) (short) 1);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "h" + "'", str23, "h");
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) strBuilder7, 0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder10.appendNull();
        int int12 = strBuilder11.size;
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.append((double) 3);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.append(35);
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter17 = strBuilder14.new StrBuilderWriter();
        org.apache.commons.lang.text.StrTokenizer strTokenizer19 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        java.lang.Object obj20 = strTokenizer19.clone();
        int int21 = strTokenizer19.size();
        org.apache.commons.lang.text.StrMatcher strMatcher22 = strTokenizer19.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder24.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer27 = strBuilder26.new StrBuilderTokenizer();
        int int30 = strBuilder26.indexOf("StrTokenizer[not tokenized yet]", (int) (short) 1);
        java.io.Writer writer31 = strBuilder26.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder33.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer36 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher37 = strTokenizer36.getIgnoredMatcher();
        int int39 = strBuilder33.lastIndexOf(strMatcher37, 100);
        int int41 = strBuilder26.indexOf(strMatcher37, (int) (short) 0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer42 = strTokenizer19.setDelimiterMatcher(strMatcher37);
        int int44 = strBuilder14.lastIndexOf(strMatcher37, (int) (byte) 0);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(strMatcher22);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(writer31);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strTokenizer36);
        org.junit.Assert.assertNotNull(strMatcher37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.deleteAll("");
        boolean boolean7 = strBuilder5.contains('a');
        java.lang.String str10 = strBuilder5.midString(0, (int) (short) 0);
        int int11 = strBuilder5.capacity();
        org.apache.commons.lang.text.StrMatcher strMatcher12 = null;
        int int13 = strBuilder5.indexOf(strMatcher12);
        org.apache.commons.lang.text.StrTokenizer strTokenizer14 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher15 = strTokenizer14.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer16 = strTokenizer14.reset();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer21 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher22 = strTokenizer21.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder18.deleteAll(strMatcher22);
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = strTokenizer16.setTrimmerMatcher(strMatcher22);
        int int25 = strBuilder5.indexOf(strMatcher22);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder29.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder29.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder27.appendFixedWidthPadRight((java.lang.Object) strBuilder33, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer37 = strBuilder27.asTokenizer();
        int int39 = strBuilder27.lastIndexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder5.append(strBuilder27, 0, 1);
        java.lang.String str43 = strBuilder42.getNullText();
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder42.deleteAll(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder47 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder47.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder49.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer53 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list54 = strTokenizer53.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer55 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher56 = strTokenizer55.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer57 = strTokenizer53.setDelimiterMatcher(strMatcher56);
        int int59 = strBuilder52.indexOf(strMatcher56, (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder52.appendNewLine();
        org.apache.commons.lang.text.StrTokenizer strTokenizer62 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer64 = strTokenizer62.setIgnoreEmptyTokens(false);
        java.lang.String str65 = strTokenizer64.previousToken();
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder52.appendWithSeparators((java.util.Iterator) strTokenizer64, "");
        boolean boolean68 = strTokenizer64.hasNext();
        java.lang.String str69 = strTokenizer64.toString();
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder42.appendWithSeparators((java.util.Iterator) strTokenizer64, "StrTokenizer[hi!]");
        char[] charArray72 = strBuilder42.toCharArray();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer14);
        org.junit.Assert.assertNotNull(strMatcher15);
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strMatcher22);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertNotNull(strMatcher56);
        org.junit.Assert.assertNotNull(strTokenizer57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strTokenizer62);
        org.junit.Assert.assertNotNull(strTokenizer64);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "StrTokenizer[]" + "'", str69, "StrTokenizer[]");
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(charArray72);
        org.junit.Assert.assertArrayEquals(charArray72, new char[] { 'h', 'i', '!', 'h' });
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) strBuilder7, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = strBuilder1.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder1.setCharAt((int) (short) 1, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer19 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher20 = strTokenizer19.getIgnoredMatcher();
        int int22 = strBuilder16.lastIndexOf(strMatcher20, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder16.insert((int) (byte) 1, (int) '4');
        org.apache.commons.lang.text.StrTokenizer strTokenizer26 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher27 = strTokenizer26.getIgnoredMatcher();
        char[] charArray33 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer34 = strTokenizer26.reset(charArray33);
        java.lang.String[] strArray35 = strTokenizer34.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder16.appendWithSeparators((java.lang.Object[]) strArray35, "StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder14.appendWithSeparators((java.lang.Object[]) strArray35, "-1.0");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder39.append((float) 3L);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(strMatcher20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertNotNull(strMatcher27);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "4   4" });
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder41);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        int int4 = strBuilder3.capacity();
        int int6 = strBuilder3.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder7.minimizeCapacity();
        int int9 = strBuilder7.capacity();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder7.deleteCharAt(97);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance("#\n");
        org.junit.Assert.assertNotNull(strTokenizer1);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        char[] charArray11 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strTokenizer4.reset(charArray11);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.appendWithSeparators((java.util.Iterator) strTokenizer4, "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer15 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher16 = strTokenizer15.getIgnoredMatcher();
        int int17 = strBuilder14.indexOf(strMatcher16);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        java.lang.Object obj24 = strTokenizer23.clone();
        int int25 = strTokenizer23.size();
        org.apache.commons.lang.text.StrMatcher strMatcher26 = strTokenizer23.getIgnoredMatcher();
        int int28 = strBuilder21.indexOf(strMatcher26, 10);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder14.replace(strMatcher26, "!ih", (int) (short) 1, (int) (short) 100, 3);
        java.lang.StringBuffer stringBuffer34 = strBuilder33.toStringBuffer();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strTokenizer15);
        org.junit.Assert.assertNotNull(strMatcher16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(strMatcher26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(stringBuffer34);
        org.junit.Assert.assertEquals(stringBuffer34.toString(), "hi!4   4");
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.appendFixedWidthPadLeft(0, (int) (byte) -1, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder3.replaceFirst("StrTokenizer[not tokenized yet]", "StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.setNewLineText("i!");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.ensureCapacity((int) '#');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.deleteFirst("");
        strBuilder16.size = 0;
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer25 = strBuilder24.new StrBuilderTokenizer();
        int int28 = strBuilder24.indexOf("StrTokenizer[not tokenized yet]", (int) (short) 1);
        java.io.Writer writer29 = strBuilder24.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder31.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer34 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher35 = strTokenizer34.getIgnoredMatcher();
        int int37 = strBuilder31.lastIndexOf(strMatcher35, 100);
        int int39 = strBuilder24.indexOf(strMatcher35, (int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder24.deleteFirst('a');
        char[] charArray44 = strBuilder24.toCharArray((int) (short) 0, 104);
        char[] charArray45 = strBuilder16.getChars(charArray44);
        char[] charArray46 = strBuilder12.getChars(charArray45);
        int int47 = strBuilder12.length();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder12.insert(55, (double) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 55");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(writer29);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(strMatcher35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertArrayEquals(charArray44, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
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
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder14.reverse();
        java.lang.String str48 = strBuilder45.midString(112, 1);
        int int51 = strBuilder45.lastIndexOf("a!ih", 9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strTokenizer10);
        org.junit.Assert.assertNotNull(strMatcher11);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "");
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(strMatcher33);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst("i!", "hi!");
        int int6 = strBuilder0.lastIndexOf("h52i!4   4", 6);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder0.setLength((int) 'i');
        java.lang.String str11 = strBuilder8.midString((int) (short) 1, 37);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str11, "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        boolean boolean2 = strBuilder1.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.append('#');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.replaceAll('4', '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder7);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance("StrTokenizer[]");
        boolean boolean2 = strTokenizer1.isEmptyTokenAsNull();
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer4 = strBuilder3.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrTokenizer strTokenizer6 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) "", (int) (short) 1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.deleteFirst("");
        char[] charArray14 = null;
        char[] charArray15 = strBuilder11.getChars(charArray14);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder9.append(charArray15);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.ensureCapacity(33);
        org.apache.commons.lang.text.StrTokenizer strTokenizer19 = strBuilder16.asTokenizer();
        org.apache.commons.lang.text.StrTokenizer strTokenizer21 = strTokenizer19.setQuoteChar('#');
        char[] charArray22 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray22);
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list25 = strTokenizer24.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer26 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher27 = strTokenizer26.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer28 = strTokenizer24.setDelimiterMatcher(strMatcher27);
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = strTokenizer23.setQuoteMatcher(strMatcher27);
        java.lang.String[] strArray30 = strTokenizer23.getTokenArray();
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        java.lang.Object obj33 = strTokenizer32.clone();
        int int34 = strTokenizer32.size();
        org.apache.commons.lang.text.StrMatcher strMatcher35 = strTokenizer32.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer36 = strTokenizer23.setDelimiterMatcher(strMatcher35);
        org.apache.commons.lang.text.StrTokenizer strTokenizer37 = strTokenizer19.setDelimiterMatcher(strMatcher35);
        org.apache.commons.lang.text.StrMatcher strMatcher38 = strTokenizer37.getTrimmerMatcher();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertNotNull(strMatcher27);
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(strMatcher35);
        org.junit.Assert.assertNotNull(strTokenizer36);
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertNotNull(strMatcher38);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        int int4 = strBuilder3.capacity();
        int int6 = strBuilder3.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder7.deleteFirst('#');
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter10 = strBuilder7.new StrBuilderWriter();
        strBuilderWriter10.close();
        strBuilderWriter10.flush();
        strBuilderWriter10.write(10);
        strBuilderWriter10.write((int) (short) 10);
        org.apache.commons.lang.text.StrTokenizer strTokenizer17 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher18 = strTokenizer17.getIgnoredMatcher();
        char[] charArray24 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer25 = strTokenizer17.reset(charArray24);
        org.apache.commons.lang.text.StrTokenizer strTokenizer26 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray24);
        strBuilderWriter10.write(charArray24);
        org.apache.commons.lang.text.StrTokenizer strTokenizer28 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher29 = strTokenizer28.getIgnoredMatcher();
        char[] charArray35 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer36 = strTokenizer28.reset(charArray35);
        org.apache.commons.lang.text.StrTokenizer strTokenizer37 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray35);
        java.lang.String[] strArray38 = strTokenizer37.getTokenArray();
        boolean boolean39 = strTokenizer37.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrBuilder strBuilder41 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder41.deleteFirst("");
        strBuilder41.size = 0;
        org.apache.commons.lang.text.StrBuilder strBuilder47 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder47.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer50 = strBuilder49.new StrBuilderTokenizer();
        int int53 = strBuilder49.indexOf("StrTokenizer[not tokenized yet]", (int) (short) 1);
        java.io.Writer writer54 = strBuilder49.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder56 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder56.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer59 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher60 = strTokenizer59.getIgnoredMatcher();
        int int62 = strBuilder56.lastIndexOf(strMatcher60, 100);
        int int64 = strBuilder49.indexOf(strMatcher60, (int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder49.deleteFirst('a');
        char[] charArray69 = strBuilder49.toCharArray((int) (short) 0, 104);
        char[] charArray70 = strBuilder41.getChars(charArray69);
        org.apache.commons.lang.text.StrTokenizer strTokenizer71 = strTokenizer37.reset(charArray70);
        // The following exception was thrown during execution in test generation
        try {
            strBuilderWriter10.write(charArray70, 46, 38);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Invalid startIndex: 38");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(strMatcher18);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertNotNull(strMatcher29);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer36);
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "4   4" });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(writer54);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strTokenizer59);
        org.junit.Assert.assertNotNull(strMatcher60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertArrayEquals(charArray69, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertArrayEquals(charArray70, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(strTokenizer71);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        char[] charArray11 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strTokenizer4.reset(charArray11);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.appendWithSeparators((java.util.Iterator) strTokenizer4, "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher15 = strTokenizer4.getTrimmerMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer17 = strTokenizer4.setEmptyTokenAsNull(false);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.setLength(0);
        java.io.Writer writer22 = strBuilder21.asWriter();
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher24 = strTokenizer23.getIgnoredMatcher();
        int int25 = strBuilder21.indexOf(strMatcher24);
        org.apache.commons.lang.text.StrTokenizer strTokenizer26 = strTokenizer17.setDelimiterMatcher(strMatcher24);
        org.apache.commons.lang.text.StrTokenizer strTokenizer28 = strTokenizer17.setDelimiterChar('a');
        boolean boolean29 = strTokenizer28.hasPrevious();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder31.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder35.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder37.append((double) 1.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder37.appendPadding((int) '#', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder42.appendFixedWidthPadLeft((int) ' ', 0, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer48 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder50.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder52.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer56 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list57 = strTokenizer56.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer58 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher59 = strTokenizer58.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer60 = strTokenizer56.setDelimiterMatcher(strMatcher59);
        int int62 = strBuilder55.indexOf(strMatcher59, (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer63 = strTokenizer48.setIgnoredMatcher(strMatcher59);
        int int65 = strBuilder42.lastIndexOf(strMatcher59, (int) (short) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder33.deleteFirst(strMatcher59);
        org.apache.commons.lang.text.StrTokenizer strTokenizer67 = strTokenizer28.setQuoteMatcher(strMatcher59);
        int int68 = strTokenizer28.nextIndex();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strMatcher15);
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(writer22);
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertNotNull(strMatcher24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strTokenizer48);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strTokenizer56);
        org.junit.Assert.assertNotNull(list57);
        org.junit.Assert.assertNotNull(strTokenizer58);
        org.junit.Assert.assertNotNull(strMatcher59);
        org.junit.Assert.assertNotNull(strTokenizer60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer63);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strTokenizer67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.append(stringBuffer2, (-1), (int) ' ');
        char[] charArray6 = strBuilder5.toCharArray();
        org.apache.commons.lang.text.StrTokenizer strTokenizer7 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray6);
        org.apache.commons.lang.text.StrTokenizer strTokenizer9 = strTokenizer7.setDelimiterString("7.0hi! ");
        org.apache.commons.lang.text.StrTokenizer strTokenizer10 = strTokenizer9.reset();
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(strTokenizer10);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
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
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list28 = strTokenizer27.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher30 = strTokenizer29.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer31 = strTokenizer27.setDelimiterMatcher(strMatcher30);
        int int33 = strBuilder26.indexOf(strMatcher30, (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer34 = strTokenizer19.setIgnoredMatcher(strMatcher30);
        java.lang.String str35 = strTokenizer19.previousToken();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder37.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer40 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher41 = strTokenizer40.getIgnoredMatcher();
        char[] charArray47 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer48 = strTokenizer40.reset(charArray47);
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder39.appendWithSeparators((java.util.Iterator) strTokenizer40, "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer51 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list52 = strTokenizer51.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer53 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher54 = strTokenizer53.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer55 = strTokenizer51.setDelimiterMatcher(strMatcher54);
        int int57 = strBuilder39.lastIndexOf(strMatcher54, (int) (byte) 0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer58 = strTokenizer19.setIgnoredMatcher(strMatcher54);
        org.apache.commons.lang.text.StrTokenizer strTokenizer60 = strTokenizer19.setEmptyTokenAsNull(true);
        org.apache.commons.lang.text.StrTokenizer strTokenizer61 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher62 = strTokenizer61.getIgnoredMatcher();
        char[] charArray68 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer69 = strTokenizer61.reset(charArray68);
        java.lang.String[] strArray70 = strTokenizer69.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder72 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder72.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder74.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer78 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list79 = strTokenizer78.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer80 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher81 = strTokenizer80.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer82 = strTokenizer78.setDelimiterMatcher(strMatcher81);
        int int84 = strBuilder77.indexOf(strMatcher81, (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer85 = strTokenizer69.setTrimmerMatcher(strMatcher81);
        org.apache.commons.lang.text.StrTokenizer strTokenizer86 = strTokenizer60.setDelimiterMatcher(strMatcher81);
        org.apache.commons.lang.text.StrBuilder strBuilder88 = strBuilder14.replaceAll(strMatcher81, "hi!");
        boolean boolean90 = strBuilder14.contains("hi!truehi!35.0");
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(strMatcher10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n" + "'", str17, "\n");
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strMatcher30);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertNotNull(strMatcher41);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer48);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertNotNull(strMatcher54);
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer58);
        org.junit.Assert.assertNotNull(strTokenizer60);
        org.junit.Assert.assertNotNull(strTokenizer61);
        org.junit.Assert.assertNotNull(strMatcher62);
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertArrayEquals(charArray68, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer69);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "4   4" });
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNotNull(strTokenizer78);
        org.junit.Assert.assertNotNull(list79);
        org.junit.Assert.assertNotNull(strTokenizer80);
        org.junit.Assert.assertNotNull(strMatcher81);
        org.junit.Assert.assertNotNull(strTokenizer82);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer85);
        org.junit.Assert.assertNotNull(strTokenizer86);
        org.junit.Assert.assertNotNull(strBuilder88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder3.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrMatcher strMatcher7 = null;
        int int9 = strBuilder3.lastIndexOf(strMatcher7, (int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder3.append(' ');
        java.lang.String str13 = strBuilder11.leftString((int) (byte) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder11.append('#');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder11.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.deleteAll(' ');
        java.lang.String str20 = strBuilder18.rightString((int) '4');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder18.setNewLineText("1.0");
        java.lang.String str23 = strBuilder18.getNullText();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " " + "'", str13, " ");
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#\n" + "'", str20, "#\n");
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.deleteAll("");
        boolean boolean7 = strBuilder5.contains('a');
        java.lang.String str10 = strBuilder5.midString(0, (int) (short) 0);
        int int11 = strBuilder5.capacity();
        org.apache.commons.lang.text.StrMatcher strMatcher12 = null;
        int int13 = strBuilder5.indexOf(strMatcher12);
        int int15 = strBuilder5.lastIndexOf('a');
        boolean boolean16 = strBuilder5.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer21 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher22 = strTokenizer21.getIgnoredMatcher();
        char[] charArray28 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = strTokenizer21.reset(charArray28);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder20.appendWithSeparators((java.util.Iterator) strTokenizer21, "hi!");
        java.lang.StringBuffer stringBuffer32 = strBuilder31.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder5.append(stringBuffer32);
        int int36 = strBuilder33.lastIndexOf("4   4", 16);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strMatcher22);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(stringBuffer32);
        org.junit.Assert.assertEquals(stringBuffer32.toString(), "hi!4   4");
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 6 + "'", int36 == 6);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.deleteAll("");
        java.lang.Object obj6 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append(obj6);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.replaceFirst("", "4   4");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder7.insert(0, (double) 10L);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher19 = strTokenizer18.getIgnoredMatcher();
        int int21 = strBuilder15.lastIndexOf(strMatcher19, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder15.append(true);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader24 = strBuilder23.new StrBuilderReader();
        boolean boolean25 = strBuilderReader24.markSupported();
        strBuilderReader24.mark((int) (byte) 100);
        java.io.Writer writer28 = java.io.Writer.nullWriter();
        long long29 = strBuilderReader24.transferTo(writer28);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder31.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer34 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher35 = strTokenizer34.getIgnoredMatcher();
        char[] charArray41 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer42 = strTokenizer34.reset(charArray41);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder33.appendWithSeparators((java.util.Iterator) strTokenizer34, "hi!");
        char[] charArray45 = strBuilder44.buffer;
        int int46 = strBuilderReader24.read(charArray45);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder7.append(charArray45);
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder47.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder47.appendNewLine();
        int int51 = strBuilder50.length();
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder50.replaceFirst("\n\n0", "0");
        java.io.Writer writer55 = strBuilder54.asWriter();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(writer28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 7L + "'", long29 == 7L);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(strMatcher35);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 48 + "'", int51 == 48);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(writer55);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.apache.commons.lang.text.StrTokenizer strTokenizer0 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher1 = strTokenizer0.getIgnoredMatcher();
        char[] charArray7 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer8 = strTokenizer0.reset(charArray7);
        org.apache.commons.lang.text.StrTokenizer strTokenizer9 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray7);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.setLength(0);
        java.io.Writer writer14 = strBuilder13.asWriter();
        org.apache.commons.lang.text.StrTokenizer strTokenizer15 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher16 = strTokenizer15.getIgnoredMatcher();
        int int17 = strBuilder13.indexOf(strMatcher16);
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = strTokenizer9.setDelimiterMatcher(strMatcher16);
        int int19 = strTokenizer9.previousIndex();
        org.junit.Assert.assertNotNull(strTokenizer0);
        org.junit.Assert.assertNotNull(strMatcher1);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(writer14);
        org.junit.Assert.assertNotNull(strTokenizer15);
        org.junit.Assert.assertNotNull(strMatcher16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        int int7 = strBuilder1.lastIndexOf(strMatcher5, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader10 = strBuilder9.new StrBuilderReader();
        boolean boolean11 = strBuilderReader10.markSupported();
        strBuilderReader10.mark((int) (byte) 100);
        java.io.Writer writer14 = java.io.Writer.nullWriter();
        long long15 = strBuilderReader10.transferTo(writer14);
        boolean boolean16 = strBuilderReader10.ready();
        boolean boolean17 = strBuilderReader10.ready();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.setLength(0);
        java.io.Writer writer22 = strBuilder21.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.replaceAll("\n", "");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder23.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder29.setLength(0);
        int int32 = strBuilder31.capacity();
        char[] charArray33 = strBuilder31.toCharArray();
        char[] charArray34 = strBuilder23.getChars(charArray33);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = strBuilderReader10.read(charArray34, 36, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(writer14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 7L + "'", long15 == 7L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(writer22);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] {});
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] {});
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        boolean boolean2 = strBuilder1.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.deleteFirst("StrTokenizer[not tokenized yet]");
        int int7 = strBuilder3.indexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.setLength(0);
        java.io.Writer writer12 = strBuilder11.asWriter();
        java.io.Writer writer14 = writer12.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer22 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list23 = strTokenizer22.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher25 = strTokenizer24.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer26 = strTokenizer22.setDelimiterMatcher(strMatcher25);
        int int28 = strBuilder21.indexOf(strMatcher25, (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer33 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher34 = strTokenizer33.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder30.deleteAll(strMatcher34);
        java.lang.StringBuffer stringBuffer36 = strBuilder35.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder21.append(stringBuffer36, (int) (short) 0, 0);
        java.io.Writer writer40 = writer14.append((java.lang.CharSequence) stringBuffer36);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder3.append(stringBuffer36);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder41.setNewLineText("StrTokenizer[4   4]");
        java.lang.String str44 = strBuilder43.getNullText();
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder43.deleteAll("4");
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder46.replaceAll("h", "441.0###################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(writer12);
        org.junit.Assert.assertNotNull(writer14);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strTokenizer22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strMatcher25);
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strTokenizer33);
        org.junit.Assert.assertNotNull(strMatcher34);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(stringBuffer36);
        org.junit.Assert.assertEquals(stringBuffer36.toString(), "");
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(writer40);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder49);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("1.0###################################");
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.append((double) 1.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder3.appendPadding((int) '#', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder8.appendFixedWidthPadLeft((int) ' ', 0, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer14 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer22 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list23 = strTokenizer22.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher25 = strTokenizer24.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer26 = strTokenizer22.setDelimiterMatcher(strMatcher25);
        int int28 = strBuilder21.indexOf(strMatcher25, (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = strTokenizer14.setIgnoredMatcher(strMatcher25);
        int int31 = strBuilder8.lastIndexOf(strMatcher25, (int) (short) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder8.setNullText("StrTokenizer[not tokenized yet]");
        char[] charArray34 = strBuilder8.toCharArray();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strTokenizer14);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strTokenizer22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strMatcher25);
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(charArray34);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list5 = strTokenizer4.getTokenList();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.appendWithSeparators((java.util.Collection) list5, "");
        java.lang.String str9 = strBuilder3.rightString((int) '#');
        int int10 = strBuilder3.length();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.setNullText("h52i!4   4");
        int int14 = strBuilder12.lastIndexOf('i');
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) strBuilder7, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = strBuilder1.asTokenizer();
        int int13 = strBuilder1.indexOf("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher19 = strTokenizer18.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder15.deleteAll(strMatcher19);
        java.lang.StringBuffer stringBuffer21 = strBuilder20.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder1.append(stringBuffer21);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader23 = strBuilder1.new StrBuilderReader();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer28 = strBuilder27.new StrBuilderTokenizer();
        char[] charArray29 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray29);
        java.util.List list33 = strBuilderTokenizer28.tokenize(charArray29, (int) (short) -1, (int) '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer34 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray29);
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray29);
        int int36 = strBuilderReader23.read(charArray29);
        org.apache.commons.lang.text.StrTokenizer strTokenizer37 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray29);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder39.setLength(0);
        java.io.Writer writer42 = strBuilder41.asWriter();
        org.apache.commons.lang.text.StrTokenizer strTokenizer43 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher44 = strTokenizer43.getIgnoredMatcher();
        int int45 = strBuilder41.indexOf(strMatcher44);
        org.apache.commons.lang.text.StrTokenizer strTokenizer46 = strTokenizer37.setTrimmerMatcher(strMatcher44);
        org.apache.commons.lang.text.StrTokenizer strTokenizer48 = strTokenizer46.setQuoteChar('4');
        java.util.List list49 = strTokenizer48.getTokenList();
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(stringBuffer21);
        org.junit.Assert.assertEquals(stringBuffer21.toString(), "");
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(writer42);
        org.junit.Assert.assertNotNull(strTokenizer43);
        org.junit.Assert.assertNotNull(strMatcher44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer46);
        org.junit.Assert.assertNotNull(strTokenizer48);
        org.junit.Assert.assertNotNull(list49);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrTokenizer strTokenizer2 = strTokenizer1.reset();
        org.apache.commons.lang.text.StrMatcher strMatcher3 = strTokenizer1.getQuoteMatcher();
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertNotNull(strTokenizer2);
        org.junit.Assert.assertNotNull(strMatcher3);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) strBuilder7, 0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder10.appendNull();
        java.lang.String str14 = strBuilder11.substring(0, 3);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder11.deleteAll("\n");
        org.apache.commons.lang.text.StrMatcher strMatcher17 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder16.replaceFirst(strMatcher17, "\n");
        boolean boolean21 = strBuilder19.startsWith("h52i!4   4");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder25.replaceAll("hi!", "");
        char[] charArray29 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray29);
        char[] charArray31 = strBuilder25.getChars(charArray29);
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray31);
        org.apache.commons.lang.text.StrMatcher strMatcher33 = strTokenizer32.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder19.appendFixedWidthPadRight((java.lang.Object) strTokenizer32, (-1), 'h');
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(strMatcher33);
        org.junit.Assert.assertNotNull(strBuilder36);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        boolean boolean2 = strBuilder1.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.deleteAll('#');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.ensureCapacity(39);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.insert(1, 10L);
        int int11 = strBuilder1.size;
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder1.minimizeCapacity();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(strBuilder12);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer4 = strBuilder3.new StrBuilderTokenizer();
        char[] charArray5 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer6 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray5);
        java.util.List list9 = strBuilderTokenizer4.tokenize(charArray5, (int) (short) -1, (int) '#');
        java.lang.String str10 = strBuilderTokenizer4.getContent();
        java.lang.Object obj11 = strBuilderTokenizer4.next();
        org.apache.commons.lang.text.StrTokenizer strTokenizer13 = strBuilderTokenizer4.setQuoteChar('4');
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertNotNull(strTokenizer13);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        java.lang.Object obj2 = strTokenizer1.clone();
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = strTokenizer1.reset("");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer9 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher10 = strTokenizer9.getIgnoredMatcher();
        int int12 = strBuilder6.lastIndexOf(strMatcher10, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder6.insert((int) (byte) 1, (int) '4');
        org.apache.commons.lang.text.StrTokenizer strTokenizer16 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher17 = strTokenizer16.getIgnoredMatcher();
        char[] charArray23 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = strTokenizer16.reset(charArray23);
        java.lang.String[] strArray25 = strTokenizer24.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder6.appendWithSeparators((java.lang.Object[]) strArray25, "StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder27.appendFixedWidthPadLeft((int) 'a', 0, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder27.clear();
        org.apache.commons.lang.text.StrTokenizer strTokenizer33 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher34 = strTokenizer33.getIgnoredMatcher();
        char[] charArray40 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer41 = strTokenizer33.reset(charArray40);
        org.apache.commons.lang.text.StrTokenizer strTokenizer42 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray40);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder44.setLength(0);
        java.io.Writer writer47 = strBuilder46.asWriter();
        org.apache.commons.lang.text.StrTokenizer strTokenizer48 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher49 = strTokenizer48.getIgnoredMatcher();
        int int50 = strBuilder46.indexOf(strMatcher49);
        org.apache.commons.lang.text.StrTokenizer strTokenizer51 = strTokenizer42.setDelimiterMatcher(strMatcher49);
        org.apache.commons.lang.text.StrTokenizer strTokenizer53 = strTokenizer42.setDelimiterString("\n");
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder27.append((java.lang.Object) strTokenizer53);
        java.io.Reader reader55 = strBuilder27.asReader();
        org.apache.commons.lang.text.StrBuilder strBuilder57 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder57.setLength(0);
        int int60 = strBuilder59.capacity();
        int int62 = strBuilder59.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder59.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder63.deleteFirst('#');
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter66 = strBuilder63.new StrBuilderWriter();
        java.io.Writer writer68 = strBuilderWriter66.append(' ');
        long long69 = reader55.transferTo((java.io.Writer) strBuilderWriter66);
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer4.add((java.lang.Object) long69);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(strMatcher10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertNotNull(strMatcher17);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "4   4" });
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strTokenizer33);
        org.junit.Assert.assertNotNull(strMatcher34);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer41);
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(writer47);
        org.junit.Assert.assertNotNull(strTokenizer48);
        org.junit.Assert.assertNotNull(strMatcher49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(reader55);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 35 + "'", int60 == 35);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(writer68);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 31L + "'", long69 == 31L);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
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
        org.apache.commons.lang.text.StrTokenizer strTokenizer16 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = strTokenizer16.setIgnoreEmptyTokens(false);
        java.lang.String str19 = strTokenizer18.previousToken();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder6.appendWithSeparators((java.util.Iterator) strTokenizer18, "");
        boolean boolean22 = strTokenizer18.hasNext();
        java.lang.String str23 = strTokenizer18.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = strTokenizer18.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(strMatcher10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "StrTokenizer[]" + "'", str23, "StrTokenizer[]");
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer4 = strBuilder3.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrTokenizer strTokenizer6 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) "", (int) (short) 1, ' ');
        java.lang.String str12 = strBuilder3.midString((-1), (int) (short) 0);
        int int15 = strBuilder3.indexOf('a', 35);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder3.insert((int) (short) 0, (double) 7L);
        int int20 = strBuilder18.lastIndexOf('#');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder24.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder24.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder22.appendFixedWidthPadRight((java.lang.Object) strBuilder28, 0, 'a');
        int int33 = strBuilder28.lastIndexOf("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder28.clear();
        java.lang.String str36 = strBuilder28.leftString(4);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder18.append(strBuilder28);
        boolean boolean39 = strBuilder37.endsWith(" hi!4   410444444444444444444444444444444444\n#");
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        org.apache.commons.lang.text.StrTokenizer strTokenizer0 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher1 = strTokenizer0.getIgnoredMatcher();
        char[] charArray7 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer8 = strTokenizer0.reset(charArray7);
        int int9 = strTokenizer0.size();
        boolean boolean10 = strTokenizer0.hasNext();
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strTokenizer0.setIgnoredChar('#');
        org.apache.commons.lang.text.StrMatcher strMatcher13 = strTokenizer0.getTrimmerMatcher();
        org.junit.Assert.assertNotNull(strTokenizer0);
        org.junit.Assert.assertNotNull(strMatcher1);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strMatcher13);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
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
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder36.deleteFirst("");
        int int43 = strBuilder40.indexOf('i', 9);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder40.appendFixedWidthPadLeft((int) (short) 10, 43, '1');
        org.apache.commons.lang.text.StrTokenizer strTokenizer48 = strBuilder40.asTokenizer();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertNotNull(strMatcher26);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(stringBuffer28);
        org.junit.Assert.assertEquals(stringBuffer28.toString(), "");
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strTokenizer48);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("i!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer6 = strBuilder5.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.replaceAll('a', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer14 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher15 = strTokenizer14.getIgnoredMatcher();
        int int17 = strBuilder11.lastIndexOf(strMatcher15, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder11.insert((int) (byte) 1, (int) '4');
        org.apache.commons.lang.text.StrTokenizer strTokenizer21 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher22 = strTokenizer21.getIgnoredMatcher();
        char[] charArray28 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = strTokenizer21.reset(charArray28);
        java.lang.String[] strArray30 = strTokenizer29.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder11.appendWithSeparators((java.lang.Object[]) strArray30, "StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder9.appendWithSeparators((java.lang.Object[]) strArray30, "");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer35 = strBuilder34.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder34.deleteAll("4   4");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder34.minimizeCapacity();
        char[] charArray39 = strBuilder38.toCharArray();
        org.apache.commons.lang.text.StrTokenizer strTokenizer40 = strTokenizer1.reset(charArray39);
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strTokenizer14);
        org.junit.Assert.assertNotNull(strMatcher15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strMatcher22);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "4   4" });
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(strTokenizer40);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.append((double) 1.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder3.appendPadding((int) '#', '#');
        boolean boolean10 = strBuilder3.contains("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer11 = strBuilder3.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder3.appendFixedWidthPadLeft(39, (int) (byte) 10, 'i');
        java.lang.String str17 = strBuilder3.rightString((int) (short) 10);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "iiiiiiii39" + "'", str17, "iiiiiiii39");
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer4 = strBuilder3.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder6 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer9 = strBuilder8.new StrBuilderTokenizer();
        char[] charArray10 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray10);
        java.util.List list14 = strBuilderTokenizer9.tokenize(charArray10, (int) (short) -1, (int) '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer15 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray10);
        int int16 = strTokenizer15.previousIndex();
        boolean boolean17 = strTokenizer15.isIgnoreEmptyTokens();
        boolean boolean18 = strBuilder3.equals((java.lang.Object) strTokenizer15);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.deleteFirst("hi!\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(strTokenizer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strBuilder20);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.append((double) 1.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder3.appendPadding((int) '#', '#');
        boolean boolean10 = strBuilder3.contains("");
        boolean boolean12 = strBuilder3.startsWith(" ");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.deleteAll("i!");
        char[] charArray17 = strBuilder3.toCharArray(6, 42);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder((int) ' ');
        java.util.Collection collection20 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder19.appendWithSeparators(collection20, "StrTokenizer[not tokenized yet]");
        int int24 = strBuilder19.lastIndexOf('a');
        strBuilder19.size = (byte) 1;
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder28.setLength(0);
        java.io.Writer writer31 = strBuilder30.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.reverse();
        boolean boolean33 = strBuilder19.equalsIgnoreCase(strBuilder32);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder3.appendFixedWidthPadRight((java.lang.Object) strBuilder32, (int) ' ', '#');
        int int38 = strBuilder3.lastIndexOf("izer[");
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(writer31);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        java.io.Writer writer4 = strBuilder3.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.replaceAll("\n", "");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder((int) 'a');
        boolean boolean12 = strBuilder5.equalsIgnoreCase(strBuilder11);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.deleteAll("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder14.appendFixedWidthPadLeft(16, 0, '#');
        int int21 = strBuilder14.lastIndexOf("h!", 33);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(writer4);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder((int) 'a');
        char[] charArray3 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.insert(0, charArray3);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder7.append(stringBuffer8, (-1), (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list13 = strTokenizer12.getTokenList();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder7.appendWithSeparators((java.util.Collection) list13, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) "hi!", (int) (byte) -1, '4');
        int int20 = strBuilder1.indexOf("\n");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder1.append((float) 105);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder1.insert((int) (short) 1, (long) 35);
        int int28 = strBuilder1.indexOf("StrTokenizer[not tokenized yet]", 0);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder1.replaceAll("StrTokenizer[not tokenized yet]", "-1.0");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder31.setLength((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder33.appendPadding((int) (byte) 10, '#');
        java.lang.String str37 = strBuilder33.getNewLineText();
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder33.insert((int) (short) 1, "105.044444");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(strBuilder40);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer9 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list10 = strTokenizer9.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher12 = strTokenizer11.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer13 = strTokenizer9.setDelimiterMatcher(strMatcher12);
        int int15 = strBuilder8.indexOf(strMatcher12, (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer16 = strTokenizer1.setIgnoredMatcher(strMatcher12);
        java.lang.String str17 = strTokenizer1.previousToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer19 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer21 = strTokenizer19.setIgnoredChar('4');
        org.apache.commons.lang.text.StrMatcher strMatcher22 = strTokenizer19.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = strTokenizer1.setTrimmerMatcher(strMatcher22);
        java.lang.Object obj24 = strTokenizer23.clone();
        java.lang.String str25 = strTokenizer23.nextToken();
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertNotNull(strMatcher12);
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strMatcher22);
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        int int7 = strBuilder1.lastIndexOf(strMatcher5, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader10 = strBuilder9.new StrBuilderReader();
        boolean boolean11 = strBuilderReader10.markSupported();
        int int12 = strBuilderReader10.read();
        strBuilderReader10.close();
        java.io.Writer writer14 = java.io.Writer.nullWriter();
        java.lang.CharSequence charSequence15 = null;
        java.io.Writer writer18 = writer14.append(charSequence15, (int) '#', (int) (short) 100);
        java.io.Writer writer20 = writer18.append((java.lang.CharSequence) "StrTokenizer[not tokenized yet]");
        java.io.Writer writer22 = writer20.append('#');
        java.io.Writer writer24 = writer22.append(' ');
        java.io.Writer writer26 = writer24.append(' ');
        long long27 = strBuilderReader10.transferTo(writer26);
        boolean boolean28 = strBuilderReader10.ready();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertNotNull(writer14);
        org.junit.Assert.assertNotNull(writer18);
        org.junit.Assert.assertNotNull(writer20);
        org.junit.Assert.assertNotNull(writer22);
        org.junit.Assert.assertNotNull(writer24);
        org.junit.Assert.assertNotNull(writer26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 6L + "'", long27 == 6L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
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
        org.apache.commons.lang.text.StrTokenizer strTokenizer16 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = strTokenizer16.setIgnoreEmptyTokens(false);
        java.lang.String str19 = strTokenizer18.previousToken();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder6.appendWithSeparators((java.util.Iterator) strTokenizer18, "");
        java.lang.StringBuffer stringBuffer22 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder6.append(stringBuffer22, 35, 3);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader26 = strBuilder25.new StrBuilderReader();
        java.io.Writer writer27 = java.io.Writer.nullWriter();
        java.lang.CharSequence charSequence28 = null;
        java.io.Writer writer31 = writer27.append(charSequence28, (int) '#', (int) (short) 100);
        long long32 = strBuilderReader26.transferTo(writer27);
        strBuilderReader26.reset();
        long long35 = strBuilderReader26.skip((long) 19);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(strMatcher10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(writer27);
        org.junit.Assert.assertNotNull(writer31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
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
        boolean boolean17 = strBuilder9.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder9.append("");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.setLength(0);
        int int25 = strBuilder24.capacity();
        int int27 = strBuilder24.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder24.trim();
        java.lang.String str30 = strBuilder28.rightString((-1));
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        java.lang.Object obj33 = strTokenizer32.clone();
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = strTokenizer32.setEmptyTokenAsNull(true);
        java.lang.String str36 = strTokenizer32.toString();
        org.apache.commons.lang.text.StrTokenizer strTokenizer38 = strTokenizer32.setDelimiterChar('a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer40 = strTokenizer38.setEmptyTokenAsNull(true);
        org.apache.commons.lang.text.StrTokenizer strTokenizer42 = strTokenizer38.setDelimiterChar('a');
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder28.appendFixedWidthPadLeft((java.lang.Object) strTokenizer38, (int) (short) 100, 'a');
        int int48 = strBuilder28.indexOf("StrTokenizer[not tokenized yet]", (int) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder28.insert((int) '#', (-1.0d));
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder51.trim();
        int int55 = strBuilder51.validateRange((int) '#', 35);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder19.insert(39, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 39");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str36, "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strTokenizer38);
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 35 + "'", int55 == 35);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
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
        java.lang.String str16 = strBuilder5.leftString(33);
        java.lang.String str17 = strBuilder5.getNewLineText();
        int int19 = strBuilder5.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher25 = strTokenizer24.getIgnoredMatcher();
        int int27 = strBuilder21.lastIndexOf(strMatcher25, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder21.append(true);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader30 = strBuilder29.new StrBuilderReader();
        java.lang.StringBuffer stringBuffer31 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder29.append(stringBuffer31, (int) (short) 0, 3);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer39 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher40 = strTokenizer39.getIgnoredMatcher();
        int int42 = strBuilder36.lastIndexOf(strMatcher40, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder36.append(true);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader45 = strBuilder44.new StrBuilderReader();
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder44.append((java.lang.Object) "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder29.append(strBuilder44, 2, (int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder44.setNewLineText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder54 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer55 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder54.append(stringBuffer55, (-1), (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder54.reverse();
        char[] charArray60 = strBuilder59.buffer;
        org.apache.commons.lang.text.StrTokenizer strTokenizer61 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray60);
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder44.append(charArray60, 0, 1);
        strBuilder5.buffer = charArray60;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strTokenizer10);
        org.junit.Assert.assertNotNull(strMatcher11);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "");
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strMatcher25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strTokenizer39);
        org.junit.Assert.assertNotNull(strMatcher40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertNotNull(strTokenizer61);
        org.junit.Assert.assertNotNull(strBuilder64);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.setNewLineText("\n");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder7.append(10);
        boolean boolean11 = strBuilder9.endsWith("hi!#   4");
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        int int7 = strBuilder1.lastIndexOf(strMatcher5, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader10 = strBuilder9.new StrBuilderReader();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.append((java.lang.Object) "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder9.insert((int) (short) 10, (double) 35);
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer16 = strBuilder15.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.setLength(0);
        int int21 = strBuilder20.capacity();
        int int23 = strBuilder20.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder20.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder24.deleteFirst('#');
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter27 = strBuilder24.new StrBuilderWriter();
        java.io.Writer writer29 = strBuilderWriter27.append(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder31.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder33.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer37 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list38 = strTokenizer37.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer39 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher40 = strTokenizer39.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer41 = strTokenizer37.setDelimiterMatcher(strMatcher40);
        int int43 = strBuilder36.indexOf(strMatcher40, (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder45 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder45.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer48 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher49 = strTokenizer48.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder45.deleteAll(strMatcher49);
        java.lang.StringBuffer stringBuffer51 = strBuilder50.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder36.append(stringBuffer51, (int) (short) 0, 0);
        java.io.Writer writer55 = strBuilderWriter27.append((java.lang.CharSequence) stringBuffer51);
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder15.append(stringBuffer51);
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder56.append(42);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(writer29);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNotNull(strTokenizer39);
        org.junit.Assert.assertNotNull(strMatcher40);
        org.junit.Assert.assertNotNull(strTokenizer41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strTokenizer48);
        org.junit.Assert.assertNotNull(strMatcher49);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(stringBuffer51);
        org.junit.Assert.assertEquals(stringBuffer51.toString(), "");
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(writer55);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder58);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.deleteAll("");
        java.lang.Object obj6 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append(obj6);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.replaceFirst("", "4   4");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.setLength((int) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.ensureCapacity((-1));
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer17 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder16.append(stringBuffer17, (-1), (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder16.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer26 = strBuilder25.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder25.replaceAll('a', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder31.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer34 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher35 = strTokenizer34.getIgnoredMatcher();
        int int37 = strBuilder31.lastIndexOf(strMatcher35, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder31.insert((int) (byte) 1, (int) '4');
        org.apache.commons.lang.text.StrTokenizer strTokenizer41 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher42 = strTokenizer41.getIgnoredMatcher();
        char[] charArray48 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer49 = strTokenizer41.reset(charArray48);
        java.lang.String[] strArray50 = strTokenizer49.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder31.appendWithSeparators((java.lang.Object[]) strArray50, "StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder29.appendWithSeparators((java.lang.Object[]) strArray50, "");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer55 = strBuilder54.new StrBuilderTokenizer();
        char[] charArray56 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder54.append(charArray56);
        org.apache.commons.lang.text.StrBuilder strBuilder59 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer61 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        java.lang.Object obj62 = strTokenizer61.clone();
        int int63 = strTokenizer61.size();
        org.apache.commons.lang.text.StrMatcher strMatcher64 = strTokenizer61.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder59.replaceFirst(strMatcher64, "4   4");
        boolean boolean67 = strBuilder54.contains(strMatcher64);
        int int68 = strBuilder21.indexOf(strMatcher64);
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder14.replaceAll(strMatcher64, "StrTokenizer[]");
        java.lang.String str71 = strBuilder14.getNewLineText();
        boolean boolean73 = strBuilder14.endsWith("h52i!4   4");
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(strMatcher35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strTokenizer41);
        org.junit.Assert.assertNotNull(strMatcher42);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertArrayEquals(charArray48, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer49);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "4   4" });
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strTokenizer61);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertEquals(obj62.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj62), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj62), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(strMatcher64);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) strBuilder7, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = strBuilder1.asTokenizer();
        int int13 = strBuilder1.lastIndexOf("hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer15 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher16 = strTokenizer15.getIgnoredMatcher();
        char[] charArray22 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = strTokenizer15.reset(charArray22);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder1.insert((int) (byte) 1, charArray22);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder24.append('#');
        boolean boolean28 = strBuilder24.startsWith("i!");
        int int30 = strBuilder24.lastIndexOf("105.044444");
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strTokenizer15);
        org.junit.Assert.assertNotNull(strMatcher16);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) strBuilder7, 0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder7.append(0L);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder12.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder13.appendPadding(35, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder13.deleteAll("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.delete((int) (short) 1, 100);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.appendFixedWidthPadLeft(0, (int) (byte) -1, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder3.replaceFirst("StrTokenizer[not tokenized yet]", "StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.setNewLineText("i!");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder10.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.deleteFirst('i');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder17.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher21 = strTokenizer20.getIgnoredMatcher();
        int int23 = strBuilder17.lastIndexOf(strMatcher21, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder17.insert((int) (byte) 1, (int) '4');
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher28 = strTokenizer27.getIgnoredMatcher();
        char[] charArray34 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = strTokenizer27.reset(charArray34);
        java.lang.String[] strArray36 = strTokenizer35.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder17.appendWithSeparators((java.lang.Object[]) strArray36, "StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder38.appendFixedWidthPadLeft((int) 'a', 0, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder38.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder43.appendPadding(100, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder46.deleteAll("h");
        char[] charArray49 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer50 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray49);
        org.apache.commons.lang.text.StrTokenizer strTokenizer51 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list52 = strTokenizer51.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer53 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher54 = strTokenizer53.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer55 = strTokenizer51.setDelimiterMatcher(strMatcher54);
        org.apache.commons.lang.text.StrTokenizer strTokenizer56 = strTokenizer50.setQuoteMatcher(strMatcher54);
        java.lang.String[] strArray57 = strTokenizer50.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder59 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder59.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer62 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher63 = strTokenizer62.getIgnoredMatcher();
        int int65 = strBuilder59.lastIndexOf(strMatcher63, 100);
        org.apache.commons.lang.text.StrTokenizer strTokenizer66 = strTokenizer50.setIgnoredMatcher(strMatcher63);
        int int68 = strBuilder46.lastIndexOf(strMatcher63, 112);
        boolean boolean69 = strBuilder15.contains(strMatcher63);
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder15.deleteAll("");
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strMatcher21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertNotNull(strMatcher28);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "4   4" });
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertArrayEquals(charArray49, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer50);
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertNotNull(strMatcher54);
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertNotNull(strTokenizer56);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strTokenizer62);
        org.junit.Assert.assertNotNull(strMatcher63);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer66);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(strBuilder71);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        int int4 = strBuilder3.capacity();
        int int6 = strBuilder3.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder7.deleteFirst('#');
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer12 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder11.append(stringBuffer12, (-1), (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder17.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher21 = strTokenizer20.getIgnoredMatcher();
        char[] charArray27 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer28 = strTokenizer20.reset(charArray27);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder19.appendWithSeparators((java.util.Iterator) strTokenizer20, "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer31 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher32 = strTokenizer31.getIgnoredMatcher();
        int int33 = strBuilder30.indexOf(strMatcher32);
        int int35 = strBuilder15.lastIndexOf(strMatcher32, (int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder7.deleteFirst(strMatcher32);
        org.apache.commons.lang.text.StrTokenizer strTokenizer37 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher38 = strTokenizer37.getIgnoredMatcher();
        char[] charArray44 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer45 = strTokenizer37.reset(charArray44);
        org.apache.commons.lang.text.StrTokenizer strTokenizer46 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray44);
        java.lang.String[] strArray47 = strTokenizer46.getTokenArray();
        boolean boolean48 = strTokenizer46.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder50.deleteFirst("");
        strBuilder50.size = 0;
        org.apache.commons.lang.text.StrBuilder strBuilder56 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder56.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer59 = strBuilder58.new StrBuilderTokenizer();
        int int62 = strBuilder58.indexOf("StrTokenizer[not tokenized yet]", (int) (short) 1);
        java.io.Writer writer63 = strBuilder58.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder65 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder65.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer68 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher69 = strTokenizer68.getIgnoredMatcher();
        int int71 = strBuilder65.lastIndexOf(strMatcher69, 100);
        int int73 = strBuilder58.indexOf(strMatcher69, (int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder58.deleteFirst('a');
        char[] charArray78 = strBuilder58.toCharArray((int) (short) 0, 104);
        char[] charArray79 = strBuilder50.getChars(charArray78);
        org.apache.commons.lang.text.StrTokenizer strTokenizer80 = strTokenizer46.reset(charArray79);
        strBuilder36.buffer = charArray79;
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strMatcher21);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(strMatcher32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertNotNull(strMatcher38);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertArrayEquals(charArray44, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer45);
        org.junit.Assert.assertNotNull(strTokenizer46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "4   4" });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(writer63);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(strTokenizer68);
        org.junit.Assert.assertNotNull(strMatcher69);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(charArray78);
        org.junit.Assert.assertArrayEquals(charArray78, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(charArray79);
        org.junit.Assert.assertArrayEquals(charArray79, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(strTokenizer80);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        int int4 = strBuilder3.capacity();
        int int6 = strBuilder3.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder7.deleteFirst('#');
        java.lang.String str11 = strBuilder9.rightString(1);
        java.lang.String str13 = strBuilder9.leftString((int) '#');
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.deleteAll("");
        boolean boolean7 = strBuilder5.contains('a');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.setLength(0);
        int int12 = strBuilder11.capacity();
        char[] charArray13 = strBuilder11.toCharArray();
        org.apache.commons.lang.text.StrTokenizer strTokenizer14 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray13);
        org.apache.commons.lang.text.StrTokenizer strTokenizer15 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray13);
        org.apache.commons.lang.text.StrTokenizer strTokenizer17 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        java.lang.Object obj18 = strTokenizer17.clone();
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = strTokenizer17.setEmptyTokenAsNull(true);
        org.apache.commons.lang.text.StrMatcher strMatcher21 = strTokenizer17.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer22 = strTokenizer15.setTrimmerMatcher(strMatcher21);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder5.deleteFirst(strMatcher21);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.appendPadding(97, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder23.deleteAll('#');
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer14);
        org.junit.Assert.assertNotNull(strTokenizer15);
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strMatcher21);
        org.junit.Assert.assertNotNull(strTokenizer22);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder28);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        int int7 = strBuilder1.lastIndexOf(strMatcher5, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader10 = strBuilder9.new StrBuilderReader();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.append((java.lang.Object) "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("hi!");
        boolean boolean15 = strBuilder14.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder14.deleteAll('#');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher24 = strTokenizer23.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder20.deleteAll(strMatcher24);
        java.lang.StringBuffer stringBuffer26 = strBuilder25.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder18.append(stringBuffer26);
        java.lang.String str29 = strBuilder18.leftString(33);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder31.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        java.lang.Object obj36 = strTokenizer35.clone();
        int int37 = strTokenizer35.size();
        org.apache.commons.lang.text.StrMatcher strMatcher38 = strTokenizer35.getIgnoredMatcher();
        int int40 = strBuilder33.indexOf(strMatcher38, 10);
        java.io.Writer writer41 = strBuilder33.asWriter();
        org.apache.commons.lang.text.StrTokenizer strTokenizer42 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher43 = strTokenizer42.getIgnoredMatcher();
        char[] charArray49 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer50 = strTokenizer42.reset(charArray49);
        org.apache.commons.lang.text.StrTokenizer strTokenizer51 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray49);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder53.setLength(0);
        java.io.Writer writer56 = strBuilder55.asWriter();
        org.apache.commons.lang.text.StrTokenizer strTokenizer57 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher58 = strTokenizer57.getIgnoredMatcher();
        int int59 = strBuilder55.indexOf(strMatcher58);
        org.apache.commons.lang.text.StrTokenizer strTokenizer60 = strTokenizer51.setDelimiterMatcher(strMatcher58);
        org.apache.commons.lang.text.StrTokenizer strTokenizer62 = strTokenizer60.setEmptyTokenAsNull(true);
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder33.appendWithSeparators((java.util.Iterator) strTokenizer62, "4   4");
        java.lang.String[] strArray65 = strTokenizer62.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder18.appendWithSeparators((java.lang.Object[]) strArray65, "hi!truehi");
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder9.appendWithSeparators((java.lang.Object[]) strArray65, "hi!truehi!35.0");
        java.lang.String str70 = strBuilder69.getNullText();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertNotNull(strMatcher24);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(stringBuffer26);
        org.junit.Assert.assertEquals(stringBuffer26.toString(), "");
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertEquals(obj36.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj36), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj36), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(strMatcher38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(writer41);
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertNotNull(strMatcher43);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertArrayEquals(charArray49, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer50);
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(writer56);
        org.junit.Assert.assertNotNull(strTokenizer57);
        org.junit.Assert.assertNotNull(strMatcher58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer60);
        org.junit.Assert.assertNotNull(strTokenizer62);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "4   4" });
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNull(str70);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) strBuilder7, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher12 = strTokenizer11.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder1.replaceAll(strMatcher12, "StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.deleteFirst("StrTokenizer[4   4]");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder16.insert((int) (short) 100, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertNotNull(strMatcher12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        java.io.Writer writer4 = strBuilder3.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.replaceAll("\n", "");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder9.append((double) 42);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder13.insert(46, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 46");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(writer4);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder13);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        int int4 = strBuilder3.capacity();
        int int6 = strBuilder3.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder7.deleteFirst('#');
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter10 = strBuilder7.new StrBuilderWriter();
        strBuilderWriter10.close();
        strBuilderWriter10.write((int) (byte) -1);
        java.io.Writer writer15 = strBuilderWriter10.append('4');
        strBuilderWriter10.flush();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.append((double) 1.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder20.appendPadding((int) '#', '#');
        char[] charArray26 = strBuilder25.toCharArray();
        strBuilderWriter10.write(charArray26);
        org.apache.commons.lang.text.StrTokenizer strTokenizer28 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray26);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(writer15);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertNotNull(strTokenizer28);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.deleteAll("");
        java.lang.Object obj6 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append(obj6);
        org.apache.commons.lang.text.StrTokenizer strTokenizer8 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher9 = strTokenizer8.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder7.replaceAll(strMatcher9, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = strBuilder11.substring(6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(strMatcher9);
        org.junit.Assert.assertNotNull(strBuilder11);
    }
}

