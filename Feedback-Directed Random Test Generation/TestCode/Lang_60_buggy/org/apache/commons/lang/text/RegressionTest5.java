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
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder14.append(" ");
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader20 = strBuilder19.new StrBuilderReader();
        strBuilderReader20.reset();
        org.apache.commons.lang.text.StrTokenizer strTokenizer22 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher23 = strTokenizer22.getIgnoredMatcher();
        char[] charArray29 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = strTokenizer22.reset(charArray29);
        int int31 = strBuilderReader20.read(charArray29);
        strBuilderReader20.reset();
        boolean boolean33 = strBuilderReader20.ready();
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
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strTokenizer22);
        org.junit.Assert.assertNotNull(strMatcher23);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '\n', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.deleteAll("");
        java.lang.Object obj6 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append(obj6);
        java.lang.String str9 = strBuilder5.substring(1);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder5.appendFixedWidthPadRight(33, 0, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder5.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.append(0);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder17.append(1.0d);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "i!" + "'", str9, "i!");
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance("h!   !i!#");
        java.lang.String[] strArray6 = strTokenizer5.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.appendWithSeparators((java.lang.Object[]) strArray6, "");
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "h!   !i!#" });
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
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
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader25 = strBuilder24.new StrBuilderReader();
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder24.appendPadding((int) '4', '4');
        boolean boolean29 = strBuilder24.isEmpty();
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = strBuilder24.asTokenizer();
        char[] charArray31 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray31);
        org.apache.commons.lang.text.StrTokenizer strTokenizer33 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list34 = strTokenizer33.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher36 = strTokenizer35.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer37 = strTokenizer33.setDelimiterMatcher(strMatcher36);
        org.apache.commons.lang.text.StrTokenizer strTokenizer38 = strTokenizer32.setQuoteMatcher(strMatcher36);
        org.apache.commons.lang.text.StrMatcher strMatcher39 = strTokenizer38.getDelimiterMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder24.replaceAll(strMatcher39, "hi!truehi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer43 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer45 = strTokenizer43.setIgnoredChar('4');
        boolean boolean46 = strTokenizer43.isEmptyTokenAsNull();
        int int47 = strTokenizer43.size();
        boolean boolean48 = strTokenizer43.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder41.appendWithSeparators((java.util.Iterator) strTokenizer43, "!ih");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder41.insert(106, (float) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 106");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(strTokenizer33);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertNotNull(strMatcher36);
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertNotNull(strTokenizer38);
        org.junit.Assert.assertNotNull(strMatcher39);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strTokenizer43);
        org.junit.Assert.assertNotNull(strTokenizer45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strBuilder50);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder(42);
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.append((int) (byte) -1);
        org.junit.Assert.assertNotNull(strBuilder3);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.apache.commons.lang.text.StrTokenizer strTokenizer0 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher1 = strTokenizer0.getIgnoredMatcher();
        char[] charArray7 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer8 = strTokenizer0.reset(charArray7);
        int int9 = strTokenizer0.size();
        org.apache.commons.lang.text.StrMatcher strMatcher10 = strTokenizer0.getTrimmerMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strTokenizer0.setEmptyTokenAsNull(false);
        org.apache.commons.lang.text.StrMatcher strMatcher13 = strTokenizer12.getDelimiterMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer15 = strTokenizer12.setDelimiterString("0!ih44444444444444444444444444444444444");
        org.apache.commons.lang.text.StrTokenizer strTokenizer16 = strTokenizer15.reset();
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = strTokenizer15.setEmptyTokenAsNull(true);
        org.junit.Assert.assertNotNull(strTokenizer0);
        org.junit.Assert.assertNotNull(strMatcher1);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(strMatcher10);
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strMatcher13);
        org.junit.Assert.assertNotNull(strTokenizer15);
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertNotNull(strTokenizer18);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer3 = strTokenizer1.setIgnoredChar('4');
        boolean boolean4 = strTokenizer1.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrTokenizer strTokenizer6 = strTokenizer1.setDelimiterString("hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer8 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("!ih");
        org.apache.commons.lang.text.StrMatcher strMatcher9 = strTokenizer8.getDelimiterMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer10 = strTokenizer6.setDelimiterMatcher(strMatcher9);
        org.apache.commons.lang.text.StrMatcher strMatcher11 = strTokenizer10.getDelimiterMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer13 = strTokenizer10.setDelimiterString("0");
        org.apache.commons.lang.text.StrTokenizer strTokenizer14 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher15 = strTokenizer14.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer16 = strTokenizer14.reset();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer21 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher22 = strTokenizer21.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder18.deleteAll(strMatcher22);
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = strTokenizer16.setTrimmerMatcher(strMatcher22);
        org.apache.commons.lang.text.StrTokenizer strTokenizer25 = strTokenizer10.setDelimiterMatcher(strMatcher22);
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertNotNull(strTokenizer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(strMatcher9);
        org.junit.Assert.assertNotNull(strTokenizer10);
        org.junit.Assert.assertNotNull(strMatcher11);
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertNotNull(strTokenizer14);
        org.junit.Assert.assertNotNull(strMatcher15);
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strMatcher22);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strTokenizer25);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
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
        strBuilderWriter10.write("");
        strBuilderWriter10.flush();
        strBuilderWriter10.write(35);
        java.io.Writer writer21 = strBuilderWriter10.append(' ');
        // The following exception was thrown during execution in test generation
        try {
            strBuilderWriter10.write("StrTokenizer[hi!]", 99, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(writer21);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder((int) ' ');
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "StrTokenizer[not tokenized yet]");
        int int6 = strBuilder1.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.deleteFirst("0############");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.append(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder10.append("1.0##########################", 33, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
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
        boolean boolean18 = strTokenizer1.isIgnoreEmptyTokens();
        int int19 = strTokenizer1.previousIndex();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list5 = strTokenizer4.getTokenList();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.appendWithSeparators((java.util.Collection) list5, "");
        java.lang.String str9 = strBuilder3.rightString((int) '#');
        strBuilder3.size = (byte) -1;
        int int14 = strBuilder3.indexOf('0', (int) '#');
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
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
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.setNullText("i!");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.append(false);
        int int18 = strBuilder15.size();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder15.insert(3, (double) 44);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "i!" + "'", str9, "i!");
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertNotNull(strBuilder21);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
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
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder1.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder24.append((long) 3);
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher28 = strTokenizer27.getIgnoredMatcher();
        char[] charArray34 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = strTokenizer27.reset(charArray34);
        org.apache.commons.lang.text.StrTokenizer strTokenizer36 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray34);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder38.setLength(0);
        java.io.Writer writer41 = strBuilder40.asWriter();
        org.apache.commons.lang.text.StrTokenizer strTokenizer42 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher43 = strTokenizer42.getIgnoredMatcher();
        int int44 = strBuilder40.indexOf(strMatcher43);
        org.apache.commons.lang.text.StrTokenizer strTokenizer45 = strTokenizer36.setDelimiterMatcher(strMatcher43);
        java.lang.Object obj46 = strTokenizer36.next();
        java.lang.String str47 = strTokenizer36.nextToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer48 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher49 = strTokenizer48.getIgnoredMatcher();
        char[] charArray55 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer56 = strTokenizer48.reset(charArray55);
        org.apache.commons.lang.text.StrMatcher strMatcher57 = strTokenizer56.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer58 = strTokenizer36.setDelimiterMatcher(strMatcher57);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder26.replaceAll(strMatcher57, "");
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder60.append(34);
        char[] charArray65 = null;
        // The following exception was thrown during execution in test generation
        try {
            strBuilder60.getChars(11, (int) (byte) 1, charArray65, 23);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertNotNull(strMatcher28);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertNotNull(strTokenizer36);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(writer41);
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertNotNull(strMatcher43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer45);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + "4   4" + "'", obj46, "4   4");
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(strTokenizer48);
        org.junit.Assert.assertNotNull(strMatcher49);
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertArrayEquals(charArray55, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer56);
        org.junit.Assert.assertNotNull(strMatcher57);
        org.junit.Assert.assertNotNull(strTokenizer58);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder62);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.deleteAll("");
        java.lang.Object obj6 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append(obj6);
        java.lang.String str9 = strBuilder5.substring(1);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder5.appendFixedWidthPadRight(33, 0, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder15.deleteAll("");
        boolean boolean21 = strBuilder19.contains('a');
        java.lang.String str24 = strBuilder19.midString(0, (int) (short) 0);
        int int25 = strBuilder19.capacity();
        org.apache.commons.lang.text.StrMatcher strMatcher26 = null;
        int int27 = strBuilder19.indexOf(strMatcher26);
        org.apache.commons.lang.text.StrTokenizer strTokenizer28 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher29 = strTokenizer28.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = strTokenizer28.reset();
        org.apache.commons.lang.text.StrBuilder strBuilder32 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder32.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher36 = strTokenizer35.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder32.deleteAll(strMatcher36);
        org.apache.commons.lang.text.StrTokenizer strTokenizer38 = strTokenizer30.setTrimmerMatcher(strMatcher36);
        int int39 = strBuilder19.indexOf(strMatcher36);
        char[] charArray40 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer41 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray40);
        char[] charArray42 = strBuilder19.getChars(charArray40);
        org.apache.commons.lang.text.StrTokenizer strTokenizer43 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray40);
        char[] charArray44 = strBuilder13.getChars(charArray40);
        // The following exception was thrown during execution in test generation
        try {
            strBuilder13.validateIndex((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "i!" + "'", str9, "i!");
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertNotNull(strMatcher29);
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertNotNull(strMatcher36);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strTokenizer38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer41);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(strTokenizer43);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertArrayEquals(charArray44, new char[] { 'h', 'i', '!' });
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer4 = strBuilder3.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.insert((int) (short) 1, (int) (short) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder3.appendFixedWidthPadRight(2, 38, '4');
        int int12 = strBuilder3.size();
        java.lang.String str14 = strBuilder3.leftString(40);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 44 + "'", int12 == 44);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h100i!2444444444444444444444444444444444" + "'", str14, "h100i!2444444444444444444444444444444444");
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        java.lang.Object obj2 = strTokenizer1.clone();
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = strTokenizer1.setEmptyTokenAsNull(true);
        java.lang.String str5 = strTokenizer1.toString();
        org.apache.commons.lang.text.StrTokenizer strTokenizer7 = strTokenizer1.setDelimiterChar('a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer8 = strTokenizer7.reset();
        org.apache.commons.lang.text.StrTokenizer strTokenizer10 = strTokenizer8.setIgnoreEmptyTokens(false);
        boolean boolean11 = strTokenizer8.isEmptyTokenAsNull();
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str5, "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(strTokenizer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder3.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder3.deleteAll('a');
        // The following exception was thrown during execution in test generation
        try {
            char char10 = strBuilder8.charAt(9);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 9");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        int int7 = strBuilder1.lastIndexOf(strMatcher5, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader10 = strBuilder9.new StrBuilderReader();
        strBuilderReader10.close();
        strBuilderReader10.mark((-1));
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.setLength(0);
        int int18 = strBuilder17.capacity();
        int int20 = strBuilder17.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder17.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.deleteFirst('#');
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter24 = strBuilder21.new StrBuilderWriter();
        strBuilderWriter24.close();
        java.io.Writer writer27 = strBuilderWriter24.append('#');
        strBuilderWriter24.write((int) '#');
        long long30 = strBuilderReader10.transferTo((java.io.Writer) strBuilderWriter24);
        strBuilderWriter24.flush();
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder33.setLength(0);
        int int36 = strBuilder35.capacity();
        int int38 = strBuilder35.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder35.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder39.deleteFirst('#');
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter42 = strBuilder39.new StrBuilderWriter();
        strBuilderWriter42.close();
        strBuilderWriter42.flush();
        strBuilderWriter42.write(10);
        strBuilderWriter42.write("");
        org.apache.commons.lang.text.StrBuilder strBuilder49 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder49.replaceFirst("i!", "hi!");
        java.lang.String str53 = strBuilder52.getNullText();
        java.lang.StringBuffer stringBuffer54 = strBuilder52.toStringBuffer();
        java.io.Writer writer55 = strBuilderWriter42.append((java.lang.CharSequence) stringBuffer54);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Writer writer58 = strBuilderWriter24.append((java.lang.CharSequence) stringBuffer54, (int) (short) -1, 33);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: start -1, end 33, length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(writer27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 7L + "'", long30 == 7L);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(stringBuffer54);
        org.junit.Assert.assertEquals(stringBuffer54.toString(), "");
        org.junit.Assert.assertNotNull(writer55);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
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
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder40.appendPadding((int) (byte) 10, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder40.setCharAt(8, '0');
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder46.replaceAll('0', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder51 = new org.apache.commons.lang.text.StrBuilder("hi!");
        boolean boolean52 = strBuilder51.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder51.append(0L);
        boolean boolean55 = strBuilder46.equalsIgnoreCase(strBuilder51);
        char[] charArray56 = strBuilder46.toCharArray();
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
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(charArray56);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
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
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder26.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder28.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list33 = strTokenizer32.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer34 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher35 = strTokenizer34.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer36 = strTokenizer32.setDelimiterMatcher(strMatcher35);
        int int38 = strBuilder31.indexOf(strMatcher35, (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder31.appendNewLine();
        java.lang.String str42 = strBuilder39.midString((int) (short) 0, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder39.append(" ");
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader45 = strBuilder44.new StrBuilderReader();
        strBuilderReader45.reset();
        org.apache.commons.lang.text.StrTokenizer strTokenizer47 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher48 = strTokenizer47.getIgnoredMatcher();
        char[] charArray54 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer55 = strTokenizer47.reset(charArray54);
        int int56 = strBuilderReader45.read(charArray54);
        org.apache.commons.lang.text.StrTokenizer strTokenizer57 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray54);
        // The following exception was thrown during execution in test generation
        try {
            strBuilder22.getChars(32, (int) 'i', charArray54, 33);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 105");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertNotNull(strMatcher17);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(stringBuffer19);
        org.junit.Assert.assertEquals(stringBuffer19.toString(), "");
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(strMatcher35);
        org.junit.Assert.assertNotNull(strTokenizer36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\n" + "'", str42, "\n");
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strTokenizer47);
        org.junit.Assert.assertNotNull(strMatcher48);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertArrayEquals(charArray54, new char[] { '\n', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2 + "'", int56 == 2);
        org.junit.Assert.assertNotNull(strTokenizer57);
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
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader10 = strBuilder9.new StrBuilderReader();
        java.lang.StringBuffer stringBuffer11 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder9.append(stringBuffer11, (int) (short) 0, 3);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.replaceFirst(" ", "StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder17.append((float) (-1L));
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder17.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder20.appendFixedWidthPadRight(29, 44, 'a');
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder26);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        char[] charArray11 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strTokenizer4.reset(charArray11);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.appendWithSeparators((java.util.Iterator) strTokenizer4, "hi!");
        int int16 = strBuilder14.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder14.insert((int) (short) 1, "StrTokenizer[not tokenized yet]");
        boolean boolean20 = strBuilder19.isEmpty();
        int int22 = strBuilder19.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder19.replace(0, 0, "");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder28.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder28.deleteAll("");
        java.lang.Object obj33 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder32.append(obj33);
        int int35 = strBuilder34.size();
        boolean boolean37 = strBuilder34.contains('4');
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder19.append((java.lang.Object) strBuilder34);
        org.apache.commons.lang.text.StrTokenizer strTokenizer39 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher40 = strTokenizer39.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder42.setLength(0);
        java.io.Writer writer45 = strBuilder44.asWriter();
        org.apache.commons.lang.text.StrTokenizer strTokenizer46 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher47 = strTokenizer46.getIgnoredMatcher();
        int int48 = strBuilder44.indexOf(strMatcher47);
        org.apache.commons.lang.text.StrTokenizer strTokenizer49 = strTokenizer39.setQuoteMatcher(strMatcher47);
        org.apache.commons.lang.text.StrTokenizer strTokenizer51 = strTokenizer39.reset(" ");
        org.apache.commons.lang.text.StrMatcher strMatcher52 = strTokenizer51.getDelimiterMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder38.deleteFirst(strMatcher52);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strTokenizer39);
        org.junit.Assert.assertNotNull(strMatcher40);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(writer45);
        org.junit.Assert.assertNotNull(strTokenizer46);
        org.junit.Assert.assertNotNull(strMatcher47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer49);
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(strMatcher52);
        org.junit.Assert.assertNotNull(strBuilder53);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer8 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher9 = strTokenizer8.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder5.deleteAll(strMatcher9);
        java.lang.StringBuffer stringBuffer11 = strBuilder10.toStringBuffer();
        boolean boolean12 = strBuilder3.equals((java.lang.Object) strBuilder10);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.ensureCapacity(104);
        int int16 = strBuilder3.indexOf("");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder18.deleteAll("");
        java.lang.Object obj23 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.append(obj23);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder24.replaceFirst("", "4   4");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder24.insert(0, (double) 10L);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder32.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher36 = strTokenizer35.getIgnoredMatcher();
        int int38 = strBuilder32.lastIndexOf(strMatcher36, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder32.append(true);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader41 = strBuilder40.new StrBuilderReader();
        boolean boolean42 = strBuilderReader41.markSupported();
        strBuilderReader41.mark((int) (byte) 100);
        java.io.Writer writer45 = java.io.Writer.nullWriter();
        long long46 = strBuilderReader41.transferTo(writer45);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder48.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer51 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher52 = strTokenizer51.getIgnoredMatcher();
        char[] charArray58 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer59 = strTokenizer51.reset(charArray58);
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder50.appendWithSeparators((java.util.Iterator) strTokenizer51, "hi!");
        char[] charArray62 = strBuilder61.buffer;
        int int63 = strBuilderReader41.read(charArray62);
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder24.append(charArray62);
        int int67 = strBuilder64.indexOf('4', (int) '4');
        boolean boolean68 = strBuilder3.equals(strBuilder64);
        boolean boolean70 = strBuilder64.contains('i');
        int int71 = strBuilder64.capacity();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(strMatcher9);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(stringBuffer11);
        org.junit.Assert.assertEquals(stringBuffer11.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertNotNull(strMatcher36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(writer45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 7L + "'", long46 == 7L);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(strMatcher52);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertArrayEquals(charArray58, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer59);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 42 + "'", int71 == 42);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer4 = strBuilder3.new StrBuilderTokenizer();
        int int7 = strBuilder3.indexOf("StrTokenizer[not tokenized yet]", (int) (short) 1);
        java.io.Writer writer8 = strBuilder3.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.setLength(0);
        int int13 = strBuilder12.capacity();
        char[] charArray14 = strBuilder12.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder3.append(charArray14);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder17.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher21 = strTokenizer20.getIgnoredMatcher();
        char[] charArray27 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer28 = strTokenizer20.reset(charArray27);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder19.appendWithSeparators((java.util.Iterator) strTokenizer20, "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher31 = strTokenizer20.getTrimmerMatcher();
        java.lang.String str32 = strTokenizer20.nextToken();
        org.apache.commons.lang.text.StrMatcher strMatcher33 = strTokenizer20.getTrimmerMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder15.replaceAll(strMatcher33, "StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder35.deleteAll('#');
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder37.minimizeCapacity();
        int int39 = strBuilder37.size;
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(writer8);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strMatcher21);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strMatcher31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(strMatcher33);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        int int7 = strBuilder1.lastIndexOf(strMatcher5, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrTokenizer strTokenizer10 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher11 = strTokenizer10.getIgnoredMatcher();
        char[] charArray17 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = strTokenizer10.reset(charArray17);
        int int19 = strTokenizer10.size();
        boolean boolean20 = strTokenizer10.hasNext();
        org.apache.commons.lang.text.StrMatcher strMatcher21 = strTokenizer10.getQuoteMatcher();
        java.lang.String[] strArray22 = strTokenizer10.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder1.appendWithSeparators((java.lang.Object[]) strArray22, "!ih");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder24.insert((int) (byte) 100, (double) 73);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strTokenizer10);
        org.junit.Assert.assertNotNull(strMatcher11);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strMatcher21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "4   4" });
        org.junit.Assert.assertNotNull(strBuilder24);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer4 = strBuilder3.new StrBuilderTokenizer();
        char[] charArray5 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer6 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray5);
        java.util.List list9 = strBuilderTokenizer4.tokenize(charArray5, (int) (short) -1, (int) '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer10 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray5);
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray5);
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray5);
        org.apache.commons.lang.text.StrTokenizer strTokenizer14 = strTokenizer12.setIgnoreEmptyTokens(false);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(strTokenizer10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strTokenizer14);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer4 = strBuilder3.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.replaceAll('a', '4');
        java.lang.String str10 = strBuilder7.substring(0, 0);
        strBuilder7.size = 10;
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer15 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder14.append(stringBuffer15, (-1), (int) ' ');
        char[] charArray19 = strBuilder18.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder7.append((java.lang.Object) charArray19);
        java.lang.String str22 = strBuilder7.rightString(33);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder7.append((float) 0);
        java.lang.String str25 = strBuilder7.getNewLineText();
        boolean boolean27 = strBuilder7.contains("a");
        boolean boolean28 = strBuilder7.isEmpty();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNull(str25);
// flaky "1) test2527(org.apache.commons.lang.text.RegressionTest5)":         org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
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
        char[] charArray22 = strBuilder21.buffer;
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray22);
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray22);
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
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertNotNull(strTokenizer24);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.apache.commons.lang.text.StrTokenizer strTokenizer0 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher1 = strTokenizer0.getIgnoredMatcher();
        char[] charArray7 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer8 = strTokenizer0.reset(charArray7);
        java.lang.String[] strArray9 = strTokenizer8.getTokenArray();
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = strTokenizer8.setIgnoreEmptyTokens(true);
        org.apache.commons.lang.text.StrTokenizer strTokenizer13 = strTokenizer11.setDelimiterChar('#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer15 = strTokenizer13.setIgnoredChar('!');
        org.apache.commons.lang.text.StrMatcher strMatcher16 = strTokenizer15.getDelimiterMatcher();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = strTokenizer15.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strTokenizer0);
        org.junit.Assert.assertNotNull(strMatcher1);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "4   4" });
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertNotNull(strTokenizer15);
        org.junit.Assert.assertNotNull(strMatcher16);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
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
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder37.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder37.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder35.appendFixedWidthPadRight((java.lang.Object) strBuilder41, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer45 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher46 = strTokenizer45.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder35.replaceAll(strMatcher46, "StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder33.appendFixedWidthPadRight((java.lang.Object) strBuilder48, (int) (short) 0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder33.deleteCharAt(27);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder53.append((float) 69);
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder55.minimizeCapacity();
        java.lang.String str57 = strBuilder55.getNullText();
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder55.deleteAll("hi!true");
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
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strTokenizer45);
        org.junit.Assert.assertNotNull(strMatcher46);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str57, "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strBuilder59);
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
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = strBuilder1.asTokenizer();
        int int13 = strBuilder1.lastIndexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer18 = strBuilder17.new StrBuilderTokenizer();
        char[] charArray19 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray19);
        java.util.List list23 = strBuilderTokenizer18.tokenize(charArray19, (int) (short) -1, (int) '#');
        java.lang.String str24 = strBuilderTokenizer18.getContent();
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
        java.lang.String str42 = strTokenizer26.previousToken();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder44.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer47 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher48 = strTokenizer47.getIgnoredMatcher();
        char[] charArray54 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer55 = strTokenizer47.reset(charArray54);
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder46.appendWithSeparators((java.util.Iterator) strTokenizer47, "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer58 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list59 = strTokenizer58.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer60 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher61 = strTokenizer60.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer62 = strTokenizer58.setDelimiterMatcher(strMatcher61);
        int int64 = strBuilder46.lastIndexOf(strMatcher61, (int) (byte) 0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer65 = strTokenizer26.setIgnoredMatcher(strMatcher61);
        org.apache.commons.lang.text.StrMatcher strMatcher66 = strTokenizer65.getDelimiterMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer67 = strBuilderTokenizer18.setQuoteMatcher(strMatcher66);
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder1.deleteFirst(strMatcher66);
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter69 = strBuilder68.new StrBuilderWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder71 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder71.setLength(0);
        int int74 = strBuilder73.capacity();
        char[] charArray75 = strBuilder73.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder73.setNewLineText("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder73.setNullText("hi! ");
        char[] charArray80 = strBuilder73.buffer;
        strBuilderWriter69.write(charArray80);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
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
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strTokenizer47);
        org.junit.Assert.assertNotNull(strMatcher48);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertArrayEquals(charArray54, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strTokenizer58);
        org.junit.Assert.assertNotNull(list59);
        org.junit.Assert.assertNotNull(strTokenizer60);
        org.junit.Assert.assertNotNull(strMatcher61);
        org.junit.Assert.assertNotNull(strTokenizer62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer65);
        org.junit.Assert.assertNotNull(strMatcher66);
        org.junit.Assert.assertNotNull(strTokenizer67);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 35 + "'", int74 == 35);
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertArrayEquals(charArray75, new char[] {});
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertNotNull(charArray80);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        boolean boolean2 = strBuilder1.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.deleteAll('#');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.replaceFirst('#', 'a');
        int int11 = strBuilder8.lastIndexOf('4', 42);
        java.lang.StringBuffer stringBuffer12 = strBuilder8.toStringBuffer();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(stringBuffer12);
        org.junit.Assert.assertEquals(stringBuffer12.toString(), "hi!");
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder5.appendNull();
        char[] charArray7 = strBuilder5.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.append(' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer10 = strBuilder5.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder5.appendPadding(23, '4');
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strTokenizer10);
        org.junit.Assert.assertNotNull(strBuilder13);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        char[] charArray0 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer2 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list3 = strTokenizer2.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer6 = strTokenizer2.setDelimiterMatcher(strMatcher5);
        org.apache.commons.lang.text.StrTokenizer strTokenizer7 = strTokenizer1.setQuoteMatcher(strMatcher5);
        java.lang.String[] strArray8 = strTokenizer1.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer13 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher14 = strTokenizer13.getIgnoredMatcher();
        int int16 = strBuilder10.lastIndexOf(strMatcher14, 100);
        org.apache.commons.lang.text.StrTokenizer strTokenizer17 = strTokenizer1.setIgnoredMatcher(strMatcher14);
        boolean boolean18 = strTokenizer1.hasNext();
        java.lang.String[] strArray19 = strTokenizer1.getTokenArray();
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertNotNull(strTokenizer2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertNotNull(strMatcher14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] {});
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        java.io.Writer writer4 = strBuilder3.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.replaceAll("\n", "");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.reverse();
        int int12 = strBuilder5.lastIndexOf("#", (int) '#');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder5.append((double) 103);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder18.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder16.appendFixedWidthPadRight((java.lang.Object) strBuilder22, 0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder25.appendNull();
        java.lang.String str29 = strBuilder26.substring(0, 3);
        java.lang.StringBuffer stringBuffer30 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder26.append(stringBuffer30, 105, (int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder35.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer39 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        java.lang.Object obj40 = strTokenizer39.clone();
        int int41 = strTokenizer39.size();
        org.apache.commons.lang.text.StrMatcher strMatcher42 = strTokenizer39.getIgnoredMatcher();
        int int44 = strBuilder37.indexOf(strMatcher42, 10);
        int int45 = strBuilder26.lastIndexOf(strMatcher42);
        java.io.Reader reader46 = java.io.Reader.nullReader();
        char[] charArray47 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer48 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray47);
        int int49 = reader46.read(charArray47);
        org.apache.commons.lang.text.StrTokenizer strTokenizer50 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray47);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder26.append(charArray47);
        boolean boolean52 = strBuilder5.equalsIgnoreCase(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(writer4);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strTokenizer39);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertEquals(obj40.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj40), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj40), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(strMatcher42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(reader46);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(strTokenizer50);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        java.io.Writer writer4 = strBuilder3.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.replaceAll("\n", "");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer16 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher17 = strTokenizer16.getIgnoredMatcher();
        char[] charArray23 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = strTokenizer16.reset(charArray23);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder15.appendWithSeparators((java.util.Iterator) strTokenizer16, "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher27 = strTokenizer16.getTrimmerMatcher();
        java.lang.String str28 = strTokenizer16.nextToken();
        org.apache.commons.lang.text.StrMatcher strMatcher29 = strTokenizer16.getTrimmerMatcher();
        boolean boolean30 = strBuilder11.contains(strMatcher29);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder32.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder34.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer38 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list39 = strTokenizer38.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer40 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher41 = strTokenizer40.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer42 = strTokenizer38.setDelimiterMatcher(strMatcher41);
        int int44 = strBuilder37.indexOf(strMatcher41, (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder37.appendNewLine();
        org.apache.commons.lang.text.StrTokenizer strTokenizer47 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer49 = strTokenizer47.setIgnoreEmptyTokens(false);
        java.lang.String str50 = strTokenizer49.previousToken();
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder37.appendWithSeparators((java.util.Iterator) strTokenizer49, "");
        org.apache.commons.lang.text.StrBuilder strBuilder54 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder54.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer57 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher58 = strTokenizer57.getIgnoredMatcher();
        char[] charArray64 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer65 = strTokenizer57.reset(charArray64);
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder56.appendWithSeparators((java.util.Iterator) strTokenizer57, "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer68 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list69 = strTokenizer68.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer70 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher71 = strTokenizer70.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer72 = strTokenizer68.setDelimiterMatcher(strMatcher71);
        int int74 = strBuilder56.lastIndexOf(strMatcher71, (int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder37.deleteAll(strMatcher71);
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder37.append(' ');
        java.io.Reader reader78 = strBuilder37.asReader();
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder11.appendFixedWidthPadLeft((java.lang.Object) strBuilder37, 5, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder11.deleteFirst('4');
        org.apache.commons.lang.text.StrTokenizer strTokenizer85 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer87 = strTokenizer85.setIgnoreEmptyTokens(false);
        org.apache.commons.lang.text.StrMatcher strMatcher88 = strTokenizer85.getTrimmerMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder90 = strBuilder11.replaceAll(strMatcher88, "a");
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(writer4);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertNotNull(strMatcher17);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strMatcher27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(strMatcher29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strTokenizer38);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertNotNull(strMatcher41);
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strTokenizer47);
        org.junit.Assert.assertNotNull(strTokenizer49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strTokenizer57);
        org.junit.Assert.assertNotNull(strMatcher58);
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertArrayEquals(charArray64, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer65);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(strTokenizer68);
        org.junit.Assert.assertNotNull(list69);
        org.junit.Assert.assertNotNull(strTokenizer70);
        org.junit.Assert.assertNotNull(strMatcher71);
        org.junit.Assert.assertNotNull(strTokenizer72);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNotNull(reader78);
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertNotNull(strBuilder83);
        org.junit.Assert.assertNotNull(strTokenizer85);
        org.junit.Assert.assertNotNull(strTokenizer87);
        org.junit.Assert.assertNotNull(strMatcher88);
        org.junit.Assert.assertNotNull(strBuilder90);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
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
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder32.deleteAll('#');
        java.lang.StringBuffer stringBuffer38 = strBuilder32.toStringBuffer();
        char[] charArray39 = strBuilder32.buffer;
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
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(stringBuffer38);
        org.junit.Assert.assertEquals(stringBuffer38.toString(), "hi!");
        org.junit.Assert.assertNotNull(charArray39);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        int int4 = strBuilder3.capacity();
        int int6 = strBuilder3.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder7.deleteFirst('#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder7.appendPadding(35, '#');
        boolean boolean14 = strBuilder7.contains('4');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer17 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder16.append(stringBuffer17, (-1), (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder16.reverse();
        java.lang.StringBuffer stringBuffer22 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.append(stringBuffer22);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.deleteFirst("hi!");
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader26 = strBuilder23.new StrBuilderReader();
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder28.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer31 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher32 = strTokenizer31.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder28.deleteAll(strMatcher32);
        java.lang.StringBuffer stringBuffer34 = strBuilder33.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder23.append(stringBuffer34);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder7.append(stringBuffer34);
        org.apache.commons.lang.text.StrTokenizer strTokenizer38 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder40.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder42.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer46 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list47 = strTokenizer46.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer48 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher49 = strTokenizer48.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer50 = strTokenizer46.setDelimiterMatcher(strMatcher49);
        int int52 = strBuilder45.indexOf(strMatcher49, (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer53 = strTokenizer38.setIgnoredMatcher(strMatcher49);
        int int55 = strBuilder36.indexOf(strMatcher49, (int) (short) 10);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(strMatcher32);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(stringBuffer34);
        org.junit.Assert.assertEquals(stringBuffer34.toString(), "");
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strTokenizer38);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strTokenizer46);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertNotNull(strTokenizer48);
        org.junit.Assert.assertNotNull(strMatcher49);
        org.junit.Assert.assertNotNull(strTokenizer50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        char[] charArray11 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strTokenizer4.reset(charArray11);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.appendWithSeparators((java.util.Iterator) strTokenizer4, "hi!");
        int int16 = strBuilder14.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder14.insert((int) (short) 1, "StrTokenizer[not tokenized yet]");
        boolean boolean20 = strBuilder19.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.appendNull();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strBuilder21);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer4 = strBuilder3.new StrBuilderTokenizer();
        char[] charArray5 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer6 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray5);
        java.util.List list9 = strBuilderTokenizer4.tokenize(charArray5, (int) (short) -1, (int) '#');
        java.lang.String str10 = strBuilderTokenizer4.getContent();
        java.lang.Object obj11 = strBuilderTokenizer4.clone();
        java.lang.String str12 = strBuilderTokenizer4.toString();
        boolean boolean13 = strBuilderTokenizer4.isEmptyTokenAsNull();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str12, "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.append((double) 1.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder3.appendPadding((int) '#', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.appendFixedWidthPadLeft((int) (byte) 100, 0, '#');
        java.lang.String str14 = strBuilder12.leftString((-1));
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder16.deleteAll("");
        java.lang.Object obj21 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.append(obj21);
        java.lang.String str23 = strBuilder22.getNewLineText();
        int int26 = strBuilder22.lastIndexOf("", 10);
        int int27 = strBuilder22.length();
        char[] charArray28 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray28);
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list31 = strTokenizer30.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher33 = strTokenizer32.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer34 = strTokenizer30.setDelimiterMatcher(strMatcher33);
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = strTokenizer29.setQuoteMatcher(strMatcher33);
        org.apache.commons.lang.text.StrMatcher strMatcher36 = strTokenizer35.getDelimiterMatcher();
        int int37 = strBuilder22.lastIndexOf(strMatcher36);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder12.replaceFirst(strMatcher36, "  4");
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter40 = strBuilder39.new StrBuilderWriter();
        // The following exception was thrown during execution in test generation
        try {
            strBuilderWriter40.write("hi!#", 106, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(strMatcher33);
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertNotNull(strMatcher36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(strBuilder39);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer4 = strBuilder3.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.replaceAll('0', '!');
        java.lang.String str10 = strBuilder7.midString(100, 7);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        java.io.Writer writer4 = strBuilder3.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.replaceAll("\n", "");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer16 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher17 = strTokenizer16.getIgnoredMatcher();
        char[] charArray23 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = strTokenizer16.reset(charArray23);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder15.appendWithSeparators((java.util.Iterator) strTokenizer16, "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher27 = strTokenizer16.getTrimmerMatcher();
        java.lang.String str28 = strTokenizer16.nextToken();
        org.apache.commons.lang.text.StrMatcher strMatcher29 = strTokenizer16.getTrimmerMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder11.replaceAll(strMatcher29, "4   4");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder34.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer37 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher38 = strTokenizer37.getIgnoredMatcher();
        int int40 = strBuilder34.lastIndexOf(strMatcher38, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder34.append(true);
        char[] charArray43 = strBuilder42.toCharArray();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder11.insert((int) (byte) 10, charArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(writer4);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertNotNull(strMatcher17);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strMatcher27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(strMatcher29);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertNotNull(strMatcher38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertArrayEquals(charArray43, new char[] { 'h', 'i', '!', 't', 'r', 'u', 'e' });
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        int int7 = strBuilder1.lastIndexOf(strMatcher5, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader10 = strBuilder9.new StrBuilderReader();
        boolean boolean11 = strBuilderReader10.markSupported();
        strBuilderReader10.mark((int) (byte) 100);
        long long15 = strBuilderReader10.skip((long) (short) 0);
        strBuilderReader10.mark((-1));
        int int18 = strBuilderReader10.read();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 104 + "'", int18 == 104);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder(23);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
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
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder9.insert(1, (double) 33);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader21 = strBuilder20.new StrBuilderReader();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strBuilder20);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
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
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder7.appendFixedWidthPadRight((int) (byte) -1, 104, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder36.insert(10, (float) 8);
        org.apache.commons.lang.text.StrTokenizer strTokenizer41 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer43 = strTokenizer41.setIgnoreEmptyTokens(false);
        org.apache.commons.lang.text.StrMatcher strMatcher44 = strTokenizer43.getDelimiterMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder36.deleteAll(strMatcher44);
        org.apache.commons.lang.text.StrTokenizer strTokenizer46 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher47 = strTokenizer46.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder49 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder49.setLength(0);
        java.io.Writer writer52 = strBuilder51.asWriter();
        org.apache.commons.lang.text.StrTokenizer strTokenizer53 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher54 = strTokenizer53.getIgnoredMatcher();
        int int55 = strBuilder51.indexOf(strMatcher54);
        org.apache.commons.lang.text.StrTokenizer strTokenizer56 = strTokenizer46.setQuoteMatcher(strMatcher54);
        org.apache.commons.lang.text.StrTokenizer strTokenizer58 = strTokenizer46.reset(" ");
        org.apache.commons.lang.text.StrBuilder strBuilder60 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder60.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer63 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher64 = strTokenizer63.getIgnoredMatcher();
        char[] charArray70 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer71 = strTokenizer63.reset(charArray70);
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder62.appendWithSeparators((java.util.Iterator) strTokenizer63, "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher74 = strTokenizer63.getTrimmerMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer75 = strTokenizer46.setQuoteMatcher(strMatcher74);
        java.lang.Object obj76 = strTokenizer75.next();
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder36.appendWithSeparators((java.util.Iterator) strTokenizer75, "1");
        org.apache.commons.lang.text.StrBuilder strBuilder80 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder80.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder82.append((double) 1.0f);
        int int87 = strBuilder82.lastIndexOf('4', 38);
        char[] charArray88 = strBuilder82.toCharArray();
        org.apache.commons.lang.text.StrTokenizer strTokenizer89 = strTokenizer75.reset(charArray88);
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
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strTokenizer41);
        org.junit.Assert.assertNotNull(strTokenizer43);
        org.junit.Assert.assertNotNull(strMatcher44);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strTokenizer46);
        org.junit.Assert.assertNotNull(strMatcher47);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(writer52);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertNotNull(strMatcher54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer56);
        org.junit.Assert.assertNotNull(strTokenizer58);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strTokenizer63);
        org.junit.Assert.assertNotNull(strMatcher64);
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertArrayEquals(charArray70, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer71);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(strMatcher74);
        org.junit.Assert.assertNotNull(strTokenizer75);
        org.junit.Assert.assertEquals("'" + obj76 + "' != '" + "" + "'", obj76, "");
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strBuilder84);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertNotNull(charArray88);
        org.junit.Assert.assertArrayEquals(charArray88, new char[] { '1', '.', '0' });
        org.junit.Assert.assertNotNull(strTokenizer89);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer6 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher7 = strTokenizer6.getIgnoredMatcher();
        int int9 = strBuilder3.lastIndexOf(strMatcher7, 100);
        org.apache.commons.lang.text.StrTokenizer strTokenizer10 = strTokenizer1.setQuoteMatcher(strMatcher7);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder12.deleteAll("");
        java.lang.Object obj17 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.append(obj17);
        java.lang.String str20 = strBuilder16.substring(1);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder16.replaceFirst(' ', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer28 = strBuilder27.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder27.replaceAll('a', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder33.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer36 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher37 = strTokenizer36.getIgnoredMatcher();
        int int39 = strBuilder33.lastIndexOf(strMatcher37, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder33.insert((int) (byte) 1, (int) '4');
        org.apache.commons.lang.text.StrTokenizer strTokenizer43 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher44 = strTokenizer43.getIgnoredMatcher();
        char[] charArray50 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer51 = strTokenizer43.reset(charArray50);
        java.lang.String[] strArray52 = strTokenizer51.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder33.appendWithSeparators((java.lang.Object[]) strArray52, "StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder31.appendWithSeparators((java.lang.Object[]) strArray52, "");
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder16.appendWithSeparators((java.lang.Object[]) strArray52, "a");
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer10.set((java.lang.Object) strBuilder16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: set() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(strMatcher7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer10);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "i!" + "'", str20, "i!");
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strTokenizer36);
        org.junit.Assert.assertNotNull(strMatcher37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strTokenizer43);
        org.junit.Assert.assertNotNull(strMatcher44);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertArrayEquals(charArray50, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "4   4" });
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder58);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.apache.commons.lang.text.StrTokenizer strTokenizer0 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder2.setLength(0);
        int int5 = strBuilder4.capacity();
        int int7 = strBuilder4.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.deleteFirst('#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer13 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder12.append(stringBuffer13, (-1), (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer21 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher22 = strTokenizer21.getIgnoredMatcher();
        char[] charArray28 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = strTokenizer21.reset(charArray28);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder20.appendWithSeparators((java.util.Iterator) strTokenizer21, "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher33 = strTokenizer32.getIgnoredMatcher();
        int int34 = strBuilder31.indexOf(strMatcher33);
        int int36 = strBuilder16.lastIndexOf(strMatcher33, (int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder8.deleteFirst(strMatcher33);
        org.apache.commons.lang.text.StrTokenizer strTokenizer38 = strTokenizer0.setDelimiterMatcher(strMatcher33);
        java.lang.String str39 = strTokenizer38.previousToken();
        java.lang.String str40 = strTokenizer38.previousToken();
        org.junit.Assert.assertNotNull(strTokenizer0);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strMatcher22);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(strMatcher33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strTokenizer38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
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
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder9.replaceAll('i', '0');
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(strBuilder19);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
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
        char[] charArray17 = strBuilder9.toCharArray();
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray17);
        boolean boolean19 = strTokenizer18.hasNext();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { 'h', 'i', '!', 't', 'r', 'u', 'e' });
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder5.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder8.deleteAll("");
        java.lang.Object obj13 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.append(obj13);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.replaceFirst("", "4   4");
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
        java.util.List list35 = strTokenizer34.getTokenList();
        java.util.List list36 = strTokenizer34.getTokenList();
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder14.appendWithSeparators((java.util.Collection) list36, "");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder5.appendWithSeparators((java.util.Collection) list36, "h4   4i!#35.0");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder40.replaceAll("true#", "#####");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder43.append("1.0###################################", 106, (int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
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
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder43);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        java.io.Writer writer4 = strBuilder3.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.replaceAll("\n", "");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer16 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher17 = strTokenizer16.getIgnoredMatcher();
        char[] charArray23 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = strTokenizer16.reset(charArray23);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder15.appendWithSeparators((java.util.Iterator) strTokenizer16, "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher27 = strTokenizer16.getTrimmerMatcher();
        java.lang.String str28 = strTokenizer16.nextToken();
        org.apache.commons.lang.text.StrMatcher strMatcher29 = strTokenizer16.getTrimmerMatcher();
        boolean boolean30 = strBuilder11.contains(strMatcher29);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder32.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder34.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer38 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list39 = strTokenizer38.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer40 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher41 = strTokenizer40.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer42 = strTokenizer38.setDelimiterMatcher(strMatcher41);
        int int44 = strBuilder37.indexOf(strMatcher41, (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder37.appendNewLine();
        org.apache.commons.lang.text.StrTokenizer strTokenizer47 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer49 = strTokenizer47.setIgnoreEmptyTokens(false);
        java.lang.String str50 = strTokenizer49.previousToken();
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder37.appendWithSeparators((java.util.Iterator) strTokenizer49, "");
        org.apache.commons.lang.text.StrBuilder strBuilder54 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder54.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer57 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher58 = strTokenizer57.getIgnoredMatcher();
        char[] charArray64 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer65 = strTokenizer57.reset(charArray64);
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder56.appendWithSeparators((java.util.Iterator) strTokenizer57, "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer68 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list69 = strTokenizer68.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer70 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher71 = strTokenizer70.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer72 = strTokenizer68.setDelimiterMatcher(strMatcher71);
        int int74 = strBuilder56.lastIndexOf(strMatcher71, (int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder37.deleteAll(strMatcher71);
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder37.append(' ');
        java.io.Reader reader78 = strBuilder37.asReader();
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder11.appendFixedWidthPadLeft((java.lang.Object) strBuilder37, 5, 'a');
        boolean boolean83 = strBuilder81.startsWith("true#");
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(writer4);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertNotNull(strMatcher17);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strMatcher27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(strMatcher29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strTokenizer38);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertNotNull(strMatcher41);
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strTokenizer47);
        org.junit.Assert.assertNotNull(strTokenizer49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strTokenizer57);
        org.junit.Assert.assertNotNull(strMatcher58);
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertArrayEquals(charArray64, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer65);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(strTokenizer68);
        org.junit.Assert.assertNotNull(list69);
        org.junit.Assert.assertNotNull(strTokenizer70);
        org.junit.Assert.assertNotNull(strMatcher71);
        org.junit.Assert.assertNotNull(strTokenizer72);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNotNull(reader78);
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder7.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.append((double) 1.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder9.appendPadding((int) '#', '#');
        strBuilder14.validateIndex((int) (byte) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.setLength(0);
        int int21 = strBuilder20.capacity();
        char[] charArray22 = strBuilder20.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder20.setNewLineText("StrTokenizer[not tokenized yet]");
        char[] charArray25 = strBuilder24.buffer;
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder14.append(charArray25);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder26.setNewLineText("i!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher30 = strTokenizer29.getIgnoredMatcher();
        char[] charArray36 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer37 = strTokenizer29.reset(charArray36);
        java.lang.String[] strArray38 = strTokenizer37.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder28.appendFixedWidthPadRight((java.lang.Object) strTokenizer37, 0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder41.insert(2, 8);
        int int47 = strBuilder44.validateRange((int) (short) 0, (int) (byte) 100);
        char[] charArray48 = strBuilder44.buffer;
        // The following exception was thrown during execution in test generation
        try {
            strBuilder1.getChars((int) '0', 74, charArray48, 102);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 74");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strMatcher30);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "4   4" });
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 74 + "'", int47 == 74);
        org.junit.Assert.assertNotNull(charArray48);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
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
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder40.appendPadding((int) (byte) 10, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder43.replaceFirst("", "############################");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder46.trim();
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
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder47);
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
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.insert((int) (byte) 1, (int) '4');
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer11 = strBuilder1.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder1.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder1.append('#');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder15.reverse();
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer17 = strBuilder16.new StrBuilderTokenizer();
        java.lang.String str18 = strBuilderTokenizer17.toString();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str18, "StrTokenizer[not tokenized yet]");
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
        int int13 = strBuilder1.lastIndexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.deleteFirst("");
        char[] charArray18 = null;
        char[] charArray19 = strBuilder15.getChars(charArray18);
        boolean boolean20 = strBuilder1.equals((java.lang.Object) charArray18);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) "\n", 0, ' ');
        int int26 = strBuilder24.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder24.deleteFirst(" ");
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader29 = strBuilder28.new StrBuilderReader();
        java.nio.CharBuffer charBuffer30 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int31 = strBuilderReader29.read(charBuffer30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(strBuilder28);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.append((double) 1.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder3.appendPadding((int) '#', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder10 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.replaceAll("hi!", "");
        boolean boolean16 = strBuilder15.isEmpty();
        char[] charArray17 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray17);
        org.apache.commons.lang.text.StrTokenizer strTokenizer19 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list20 = strTokenizer19.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer21 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher22 = strTokenizer21.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = strTokenizer19.setDelimiterMatcher(strMatcher22);
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = strTokenizer18.setQuoteMatcher(strMatcher22);
        java.lang.String[] strArray25 = strTokenizer18.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder27.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher31 = strTokenizer30.getIgnoredMatcher();
        int int33 = strBuilder27.lastIndexOf(strMatcher31, 100);
        org.apache.commons.lang.text.StrTokenizer strTokenizer34 = strTokenizer18.setIgnoredMatcher(strMatcher31);
        java.lang.Object obj35 = strTokenizer34.clone();
        org.apache.commons.lang.text.StrTokenizer strTokenizer37 = strTokenizer34.setDelimiterString("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder15.appendWithSeparators((java.util.Iterator) strTokenizer37, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder3.append(strBuilder39);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder42.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder44.appendFixedWidthPadLeft(0, (int) (byte) -1, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder44.replaceFirst("StrTokenizer[not tokenized yet]", "StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder51.setNewLineText("i!");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder55.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder57.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer61 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list62 = strTokenizer61.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer63 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher64 = strTokenizer63.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer65 = strTokenizer61.setDelimiterMatcher(strMatcher64);
        int int67 = strBuilder60.indexOf(strMatcher64, (int) ' ');
        int int69 = strBuilder51.indexOf(strMatcher64, (int) 'a');
        int int71 = strBuilder3.indexOf(strMatcher64, 44);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder3.delete((int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strMatcher22);
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(strMatcher31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strTokenizer61);
        org.junit.Assert.assertNotNull(list62);
        org.junit.Assert.assertNotNull(strTokenizer63);
        org.junit.Assert.assertNotNull(strMatcher64);
        org.junit.Assert.assertNotNull(strTokenizer65);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.apache.commons.lang.text.StrTokenizer strTokenizer0 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder2.setLength(0);
        int int5 = strBuilder4.capacity();
        int int7 = strBuilder4.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.deleteFirst('#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer13 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder12.append(stringBuffer13, (-1), (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer21 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher22 = strTokenizer21.getIgnoredMatcher();
        char[] charArray28 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = strTokenizer21.reset(charArray28);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder20.appendWithSeparators((java.util.Iterator) strTokenizer21, "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher33 = strTokenizer32.getIgnoredMatcher();
        int int34 = strBuilder31.indexOf(strMatcher33);
        int int36 = strBuilder16.lastIndexOf(strMatcher33, (int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder8.deleteFirst(strMatcher33);
        org.apache.commons.lang.text.StrTokenizer strTokenizer38 = strTokenizer0.setDelimiterMatcher(strMatcher33);
        org.apache.commons.lang.text.StrTokenizer strTokenizer40 = strTokenizer38.setDelimiterString("StrTokenizer[]");
        java.util.List list41 = strTokenizer38.getTokenList();
        org.apache.commons.lang.text.StrBuilder strBuilder43 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder43.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer46 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher47 = strTokenizer46.getIgnoredMatcher();
        char[] charArray53 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer54 = strTokenizer46.reset(charArray53);
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder45.appendWithSeparators((java.util.Iterator) strTokenizer46, "hi!");
        int int58 = strBuilder56.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder56.insert((int) (short) 1, "StrTokenizer[not tokenized yet]");
        boolean boolean62 = strBuilder61.isEmpty();
        int int64 = strBuilder61.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder61.replace(0, 0, "");
        org.apache.commons.lang.text.StrBuilder strBuilder70 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder70.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder70.deleteAll("");
        java.lang.Object obj75 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder74.append(obj75);
        int int77 = strBuilder76.size();
        boolean boolean79 = strBuilder76.contains('4');
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder61.append((java.lang.Object) strBuilder76);
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer38.add((java.lang.Object) strBuilder61);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strTokenizer0);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strMatcher22);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(strMatcher33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strTokenizer38);
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strTokenizer46);
        org.junit.Assert.assertNotNull(strMatcher47);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer54);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 3 + "'", int77 == 3);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(strBuilder80);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
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
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder14.append(" ");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list28 = strTokenizer27.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher30 = strTokenizer29.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer31 = strTokenizer27.setDelimiterMatcher(strMatcher30);
        int int33 = strBuilder26.indexOf(strMatcher30, (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder26.appendNewLine();
        org.apache.commons.lang.text.StrTokenizer strTokenizer36 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer38 = strTokenizer36.setIgnoreEmptyTokens(false);
        java.lang.String str39 = strTokenizer38.previousToken();
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder26.appendWithSeparators((java.util.Iterator) strTokenizer38, "");
        org.apache.commons.lang.text.StrMatcher strMatcher42 = strTokenizer38.getTrimmerMatcher();
        java.lang.String str43 = strTokenizer38.toString();
        java.lang.String str44 = strTokenizer38.nextToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer45 = strTokenizer38.reset();
        org.apache.commons.lang.text.StrBuilder strBuilder47 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder47.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer50 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher51 = strTokenizer50.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder47.deleteAll(strMatcher51);
        org.apache.commons.lang.text.StrTokenizer strTokenizer53 = strTokenizer38.setQuoteMatcher(strMatcher51);
        int int55 = strBuilder14.indexOf(strMatcher51, 29);
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
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strMatcher30);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strTokenizer36);
        org.junit.Assert.assertNotNull(strTokenizer38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strMatcher42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "StrTokenizer[]" + "'", str43, "StrTokenizer[]");
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(strTokenizer45);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strTokenizer50);
        org.junit.Assert.assertNotNull(strMatcher51);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder((int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setNullText("!ih");
        int int4 = strBuilder3.length();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = strBuilder3.validateRange((int) '0', 7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder((int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.append(" ");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.appendFixedWidthPadLeft((int) ' ', (int) (short) 10, '4');
        org.apache.commons.lang.text.StrTokenizer strTokenizer8 = strBuilder1.asTokenizer();
        int int9 = strBuilder1.length();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
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
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder6.append("0");
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray37 = strBuilder6.toCharArray((int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(strBuilder34);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        char[] charArray11 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strTokenizer4.reset(charArray11);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.appendWithSeparators((java.util.Iterator) strTokenizer4, "hi!");
        strBuilder14.validateIndex(3);
        int int19 = strBuilder14.lastIndexOf('0', 7);
        int int21 = strBuilder14.lastIndexOf("#####");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer26 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher27 = strTokenizer26.getIgnoredMatcher();
        int int29 = strBuilder23.lastIndexOf(strMatcher27, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder23.append(true);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader32 = strBuilder31.new StrBuilderReader();
        java.lang.StringBuffer stringBuffer33 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder31.append(stringBuffer33, (int) (short) 0, 3);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder36.replaceFirst(" ", "StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrTokenizer strTokenizer40 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher41 = strTokenizer40.getIgnoredMatcher();
        char[] charArray47 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer48 = strTokenizer40.reset(charArray47);
        int int49 = strTokenizer40.size();
        boolean boolean50 = strTokenizer40.hasNext();
        org.apache.commons.lang.text.StrMatcher strMatcher51 = strTokenizer40.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer53 = strTokenizer40.setQuoteChar('a');
        char[] charArray54 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer55 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray54);
        org.apache.commons.lang.text.StrTokenizer strTokenizer56 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list57 = strTokenizer56.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer58 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher59 = strTokenizer58.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer60 = strTokenizer56.setDelimiterMatcher(strMatcher59);
        org.apache.commons.lang.text.StrTokenizer strTokenizer61 = strTokenizer55.setQuoteMatcher(strMatcher59);
        org.apache.commons.lang.text.StrMatcher strMatcher62 = strTokenizer61.getDelimiterMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer63 = strTokenizer40.setIgnoredMatcher(strMatcher62);
        org.apache.commons.lang.text.StrMatcher strMatcher64 = strTokenizer63.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder39.deleteAll(strMatcher64);
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder14.replaceFirst(strMatcher64, "##########################");
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder67.ensureCapacity(32);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertNotNull(strMatcher27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertNotNull(strMatcher41);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(strMatcher51);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertArrayEquals(charArray54, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertNotNull(strTokenizer56);
        org.junit.Assert.assertNotNull(list57);
        org.junit.Assert.assertNotNull(strTokenizer58);
        org.junit.Assert.assertNotNull(strMatcher59);
        org.junit.Assert.assertNotNull(strTokenizer60);
        org.junit.Assert.assertNotNull(strTokenizer61);
        org.junit.Assert.assertNotNull(strMatcher62);
        org.junit.Assert.assertNotNull(strTokenizer63);
        org.junit.Assert.assertNotNull(strMatcher64);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(strBuilder69);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.append(stringBuffer2, (-1), (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.reverse();
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.append(stringBuffer7);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.deleteFirst("hi!");
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader11 = strBuilder8.new StrBuilderReader();
        strBuilderReader11.mark(3);
        strBuilderReader11.close();
        boolean boolean15 = strBuilderReader11.markSupported();
        strBuilderReader11.reset();
        long long18 = strBuilderReader11.skip((long) (byte) -1);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        int int7 = strBuilder1.lastIndexOf(strMatcher5, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader10 = strBuilder9.new StrBuilderReader();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.append((java.lang.Object) "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder9.trim();
        int int16 = strBuilder13.indexOf('4', 9);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.setLength(0);
        int int21 = strBuilder20.capacity();
        int int23 = strBuilder20.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder20.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder24.deleteFirst('#');
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter27 = strBuilder24.new StrBuilderWriter();
        strBuilderWriter27.close();
        strBuilderWriter27.flush();
        strBuilderWriter27.write(10);
        strBuilderWriter27.write((int) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder35.setLength(0);
        java.io.Writer writer38 = strBuilder37.asWriter();
        java.io.Writer writer40 = writer38.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder42.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder44.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer48 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list49 = strTokenizer48.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer50 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher51 = strTokenizer50.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer52 = strTokenizer48.setDelimiterMatcher(strMatcher51);
        int int54 = strBuilder47.indexOf(strMatcher51, (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder56 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder56.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer59 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher60 = strTokenizer59.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder56.deleteAll(strMatcher60);
        java.lang.StringBuffer stringBuffer62 = strBuilder61.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder47.append(stringBuffer62, (int) (short) 0, 0);
        java.io.Writer writer66 = writer40.append((java.lang.CharSequence) stringBuffer62);
        java.io.Writer writer67 = strBuilderWriter27.append((java.lang.CharSequence) stringBuffer62);
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder13.append(stringBuffer62);
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder68.append((long) 99);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(writer38);
        org.junit.Assert.assertNotNull(writer40);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strTokenizer48);
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertNotNull(strTokenizer50);
        org.junit.Assert.assertNotNull(strMatcher51);
        org.junit.Assert.assertNotNull(strTokenizer52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strTokenizer59);
        org.junit.Assert.assertNotNull(strMatcher60);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(stringBuffer62);
        org.junit.Assert.assertEquals(stringBuffer62.toString(), "");
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(writer66);
        org.junit.Assert.assertNotNull(writer67);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder70);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer4 = strBuilder3.new StrBuilderTokenizer();
        java.io.Reader reader5 = java.io.Reader.nullReader();
        char[] charArray6 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer7 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray6);
        int int8 = reader5.read(charArray6);
        java.util.List list11 = strBuilderTokenizer4.tokenize(charArray6, (int) (short) 100, 100);
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher13 = strTokenizer12.getIgnoredMatcher();
        char[] charArray19 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = strTokenizer12.reset(charArray19);
        java.util.List list23 = strBuilderTokenizer4.tokenize(charArray19, 100, 0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer25 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = strTokenizer25.setIgnoredChar('4');
        char[] charArray28 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray28);
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list31 = strTokenizer30.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher33 = strTokenizer32.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer34 = strTokenizer30.setDelimiterMatcher(strMatcher33);
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = strTokenizer29.setQuoteMatcher(strMatcher33);
        java.lang.String[] strArray36 = strTokenizer29.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder38.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer41 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher42 = strTokenizer41.getIgnoredMatcher();
        int int44 = strBuilder38.lastIndexOf(strMatcher42, 100);
        org.apache.commons.lang.text.StrTokenizer strTokenizer45 = strTokenizer29.setIgnoredMatcher(strMatcher42);
        org.apache.commons.lang.text.StrTokenizer strTokenizer46 = strTokenizer25.setDelimiterMatcher(strMatcher42);
        org.apache.commons.lang.text.StrTokenizer strTokenizer47 = strBuilderTokenizer4.setIgnoredMatcher(strMatcher42);
        boolean boolean48 = strBuilderTokenizer4.isIgnoreEmptyTokens();
        char[] charArray49 = null;
        java.util.List list52 = strBuilderTokenizer4.tokenize(charArray49, 171, 0);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(reader5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strMatcher13);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertNotNull(strTokenizer27);
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
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strTokenizer41);
        org.junit.Assert.assertNotNull(strMatcher42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer45);
        org.junit.Assert.assertNotNull(strTokenizer46);
        org.junit.Assert.assertNotNull(strTokenizer47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(list52);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hStrTokenizer[not tokenized yet]i!4   4-1.0");
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder((int) ' ');
        int int4 = strBuilder1.lastIndexOf(" ", 2);
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher6 = strTokenizer5.getIgnoredMatcher();
        char[] charArray12 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer13 = strTokenizer5.reset(charArray12);
        int int14 = strTokenizer5.size();
        org.apache.commons.lang.text.StrMatcher strMatcher15 = strTokenizer5.getTrimmerMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer17 = strTokenizer5.setEmptyTokenAsNull(false);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder1.append((java.lang.Object) false);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder18.clear();
        java.io.Reader reader20 = strBuilder18.asReader();
        org.apache.commons.lang.text.StrTokenizer strTokenizer22 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        java.lang.Object obj23 = strTokenizer22.clone();
        org.apache.commons.lang.text.StrTokenizer strTokenizer25 = strTokenizer22.setEmptyTokenAsNull(true);
        java.lang.String str26 = strTokenizer22.toString();
        org.apache.commons.lang.text.StrTokenizer strTokenizer28 = strTokenizer22.setDelimiterChar('a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = strTokenizer28.setEmptyTokenAsNull(true);
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = strTokenizer28.setDelimiterChar('a');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("hi!");
        boolean boolean35 = strBuilder34.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder34.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.deleteFirst("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder40.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder42.append((double) 1.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder42.appendPadding((int) '#', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder47.appendFixedWidthPadLeft((int) ' ', 0, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer53 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder55.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder57.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer61 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list62 = strTokenizer61.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer63 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher64 = strTokenizer63.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer65 = strTokenizer61.setDelimiterMatcher(strMatcher64);
        int int67 = strBuilder60.indexOf(strMatcher64, (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer68 = strTokenizer53.setIgnoredMatcher(strMatcher64);
        int int70 = strBuilder47.lastIndexOf(strMatcher64, (int) (short) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder36.replaceAll(strMatcher64, "StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrTokenizer strTokenizer73 = strTokenizer32.setDelimiterMatcher(strMatcher64);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder18.replace(strMatcher64, "hi!#", 105, 104, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(strMatcher15);
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(reader20);
        org.junit.Assert.assertNotNull(strTokenizer22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str26, "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strTokenizer61);
        org.junit.Assert.assertNotNull(list62);
        org.junit.Assert.assertNotNull(strTokenizer63);
        org.junit.Assert.assertNotNull(strMatcher64);
        org.junit.Assert.assertNotNull(strTokenizer65);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer68);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strTokenizer73);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
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
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder14.trim();
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter24 = strBuilder23.new StrBuilderWriter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = strBuilder23.substring((int) '0');
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
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n" + "'", str17, "\n");
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder23);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.appendFixedWidthPadLeft(0, (int) (byte) -1, '4');
        int int9 = strBuilder7.indexOf("hi!\000\000\000\000\000\000\000h52i!4   4");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder7.append(104);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strBuilder11);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("StrTokenizer[4   4]");
        org.junit.Assert.assertNotNull(strTokenizer1);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        int int7 = strBuilder1.lastIndexOf(strMatcher5, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader10 = strBuilder9.new StrBuilderReader();
        strBuilderReader10.close();
        boolean boolean12 = strBuilderReader10.markSupported();
        strBuilderReader10.mark(44);
        strBuilderReader10.close();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.append(stringBuffer2, (-1), (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer6 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list7 = strTokenizer6.getTokenList();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder1.appendWithSeparators((java.util.Collection) list7, "hi!");
        java.lang.String str12 = strBuilder1.substring(0, (int) (short) 100);
        boolean boolean14 = strBuilder1.contains("i!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer16 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = strTokenizer16.setIgnoredChar('4');
        org.apache.commons.lang.text.StrMatcher strMatcher19 = strTokenizer16.getIgnoredMatcher();
        java.lang.String[] strArray20 = strTokenizer16.getTokenArray();
        org.apache.commons.lang.text.StrMatcher strMatcher21 = strTokenizer16.getDelimiterMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder1.replaceFirst(strMatcher21, "a");
        boolean boolean24 = strBuilder1.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder28.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder28.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder26.appendFixedWidthPadRight((java.lang.Object) strBuilder32, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer36 = strBuilder26.asTokenizer();
        int int38 = strBuilder26.lastIndexOf("hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer40 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher41 = strTokenizer40.getIgnoredMatcher();
        char[] charArray47 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer48 = strTokenizer40.reset(charArray47);
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder26.insert((int) (byte) 1, charArray47);
        org.apache.commons.lang.text.StrTokenizer strTokenizer50 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher51 = strTokenizer50.getTrimmerMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder26.replaceFirst(strMatcher51, "");
        boolean boolean55 = strBuilder53.contains('#');
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder53.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder53.appendNewLine();
        char[] charArray59 = strBuilder58.buffer;
        boolean boolean60 = strBuilder1.equals(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strMatcher21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strTokenizer36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertNotNull(strMatcher41);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertArrayEquals(charArray47, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer48);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strTokenizer50);
        org.junit.Assert.assertNotNull(strMatcher51);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
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
        boolean boolean20 = strBuilder19.isEmpty();
        int int22 = strBuilder19.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder19.replace(0, 0, "");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder28.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder28.deleteAll("");
        java.lang.Object obj33 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder32.append(obj33);
        int int35 = strBuilder34.size();
        boolean boolean37 = strBuilder34.contains('4');
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder19.append((java.lang.Object) strBuilder34);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = new org.apache.commons.lang.text.StrBuilder("hi!");
        int int42 = strBuilder41.capacity();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder41.deleteFirst("StrTokenizer[]");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder46.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder46.deleteAll("");
        boolean boolean52 = strBuilder50.contains('a');
        java.lang.String str55 = strBuilder50.midString(0, (int) (short) 0);
        int int56 = strBuilder50.capacity();
        org.apache.commons.lang.text.StrMatcher strMatcher57 = null;
        int int58 = strBuilder50.indexOf(strMatcher57);
        org.apache.commons.lang.text.StrTokenizer strTokenizer59 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher60 = strTokenizer59.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer61 = strTokenizer59.reset();
        org.apache.commons.lang.text.StrBuilder strBuilder63 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder63.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer66 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher67 = strTokenizer66.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder63.deleteAll(strMatcher67);
        org.apache.commons.lang.text.StrTokenizer strTokenizer69 = strTokenizer61.setTrimmerMatcher(strMatcher67);
        int int70 = strBuilder50.indexOf(strMatcher67);
        char[] charArray71 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer72 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray71);
        char[] charArray73 = strBuilder50.getChars(charArray71);
        org.apache.commons.lang.text.StrTokenizer strTokenizer74 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray73);
        char[] charArray75 = strBuilder41.getChars(charArray73);
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder19.insert((int) ' ', charArray75);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 35 + "'", int42 == 35);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 35 + "'", int56 == 35);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer59);
        org.junit.Assert.assertNotNull(strMatcher60);
        org.junit.Assert.assertNotNull(strTokenizer61);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strTokenizer66);
        org.junit.Assert.assertNotNull(strMatcher67);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strTokenizer69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(charArray71);
        org.junit.Assert.assertArrayEquals(charArray71, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer72);
        org.junit.Assert.assertNotNull(charArray73);
        org.junit.Assert.assertArrayEquals(charArray73, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(strTokenizer74);
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertArrayEquals(charArray75, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(strBuilder76);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder((int) 'a');
        char[] charArray3 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.insert(0, charArray3);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((long) 100);
        char char9 = strBuilder5.charAt(2);
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer10 = strBuilder5.new StrBuilderTokenizer();
        java.lang.String str11 = strBuilderTokenizer10.getContent();
        java.lang.String str12 = strBuilderTokenizer10.getContent();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '0' + "'", char9 == '0');
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100" + "'", str11, "100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100" + "'", str12, "100");
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!false");
        int int3 = strBuilder1.lastIndexOf("0");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        java.io.Reader reader0 = java.io.Reader.nullReader();
        char[] charArray1 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer2 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray1);
        int int3 = reader0.read(charArray1);
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray1);
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray1);
        org.junit.Assert.assertNotNull(reader0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strTokenizer5);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        boolean boolean2 = strBuilder1.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.append('#');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.deleteAll('!');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer9 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder8.append(stringBuffer9, (-1), (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder8.reverse();
        java.lang.StringBuffer stringBuffer14 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.append(stringBuffer14);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder17.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher21 = strTokenizer20.getIgnoredMatcher();
        int int23 = strBuilder17.lastIndexOf(strMatcher21, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder17.insert((int) (byte) 1, (int) '4');
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer27 = strBuilder17.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(" ");
        int int30 = strTokenizer29.previousIndex();
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = strTokenizer29.setIgnoreEmptyTokens(false);
        java.lang.String[] strArray33 = strTokenizer29.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder17.appendWithSeparators((java.lang.Object[]) strArray33, " ");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder37.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder37.deleteAll("");
        java.lang.Object obj42 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder41.append(obj42);
        java.lang.String str44 = strBuilder43.getNewLineText();
        int int47 = strBuilder43.lastIndexOf("", 10);
        int int48 = strBuilder43.length();
        char[] charArray49 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer50 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray49);
        org.apache.commons.lang.text.StrTokenizer strTokenizer51 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list52 = strTokenizer51.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer53 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher54 = strTokenizer53.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer55 = strTokenizer51.setDelimiterMatcher(strMatcher54);
        org.apache.commons.lang.text.StrTokenizer strTokenizer56 = strTokenizer50.setQuoteMatcher(strMatcher54);
        org.apache.commons.lang.text.StrMatcher strMatcher57 = strTokenizer56.getDelimiterMatcher();
        int int58 = strBuilder43.lastIndexOf(strMatcher57);
        int int60 = strBuilder17.lastIndexOf(strMatcher57, 99);
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder15.deleteFirst(strMatcher57);
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder6.replace(strMatcher57, "!ih", 2, 99, 33);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strMatcher21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3 + "'", int48 == 3);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertArrayEquals(charArray49, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer50);
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertNotNull(strMatcher54);
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertNotNull(strTokenizer56);
        org.junit.Assert.assertNotNull(strMatcher57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder66);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer3 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        java.lang.Object obj4 = strTokenizer3.clone();
        int int5 = strTokenizer3.size();
        org.apache.commons.lang.text.StrMatcher strMatcher6 = strTokenizer3.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.replaceFirst(strMatcher6, "4   4");
        int int9 = strBuilder1.length();
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer10 = strBuilder1.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder1.append("1");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder14.deleteAll("");
        java.lang.Object obj19 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.append(obj19);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer25 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher26 = strTokenizer25.getIgnoredMatcher();
        char[] charArray32 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer33 = strTokenizer25.reset(charArray32);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder24.appendWithSeparators((java.util.Iterator) strTokenizer25, "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher36 = strTokenizer25.getTrimmerMatcher();
        java.lang.String str37 = strTokenizer25.nextToken();
        org.apache.commons.lang.text.StrMatcher strMatcher38 = strTokenizer25.getTrimmerMatcher();
        java.lang.String[] strArray39 = strTokenizer25.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder20.appendWithSeparators((java.lang.Object[]) strArray39, "StrTokenizer[]");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder1.appendWithSeparators((java.lang.Object[]) strArray39, " ");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder45.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer48 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher49 = strTokenizer48.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder45.deleteAll(strMatcher49);
        int int52 = strBuilder43.lastIndexOf(strMatcher49, (int) 'a');
        org.junit.Assert.assertNotNull(strTokenizer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertNotNull(strMatcher26);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer33);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strMatcher36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(strMatcher38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "4   4" });
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strTokenizer48);
        org.junit.Assert.assertNotNull(strMatcher49);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer4 = strBuilder3.new StrBuilderTokenizer();
        int int7 = strBuilder3.indexOf("StrTokenizer[not tokenized yet]", (int) (short) 1);
        java.io.Writer writer8 = strBuilder3.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.setLength(0);
        int int13 = strBuilder12.capacity();
        char[] charArray14 = strBuilder12.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder3.append(charArray14);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder17.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher21 = strTokenizer20.getIgnoredMatcher();
        char[] charArray27 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer28 = strTokenizer20.reset(charArray27);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder19.appendWithSeparators((java.util.Iterator) strTokenizer20, "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher31 = strTokenizer20.getTrimmerMatcher();
        java.lang.String str32 = strTokenizer20.nextToken();
        org.apache.commons.lang.text.StrMatcher strMatcher33 = strTokenizer20.getTrimmerMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder15.replaceAll(strMatcher33, "StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder35.deleteAll('#');
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder37.ensureCapacity((int) '4');
        int int41 = strBuilder37.lastIndexOf("i!4444444444");
        org.apache.commons.lang.text.StrTokenizer strTokenizer43 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrTokenizer strTokenizer45 = strTokenizer43.setIgnoredChar('a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer47 = strTokenizer45.reset("i!");
        java.lang.String[] strArray48 = strTokenizer45.getTokenArray();
        int int49 = strTokenizer45.nextIndex();
        org.apache.commons.lang.text.StrMatcher strMatcher50 = strTokenizer45.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder37.replaceAll(strMatcher50, "!ih");
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(writer8);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strMatcher21);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strMatcher31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(strMatcher33);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer43);
        org.junit.Assert.assertNotNull(strTokenizer45);
        org.junit.Assert.assertNotNull(strTokenizer47);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "i!" });
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(strMatcher50);
        org.junit.Assert.assertNotNull(strBuilder52);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer3 = strTokenizer1.setIgnoredChar('4');
        org.apache.commons.lang.text.StrMatcher strMatcher4 = strTokenizer1.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer6 = strTokenizer1.setEmptyTokenAsNull(true);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder10.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder8.appendFixedWidthPadRight((java.lang.Object) strBuilder14, 0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder17.appendNull();
        int int19 = strBuilder18.size;
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.append((double) 3);
        int int24 = strBuilder21.indexOf('a', (-1));
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder26.setLength(0);
        int int29 = strBuilder28.capacity();
        int int31 = strBuilder28.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder28.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder32.deleteFirst('#');
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter35 = strBuilder32.new StrBuilderWriter();
        strBuilderWriter35.close();
        strBuilderWriter35.flush();
        strBuilderWriter35.write(10);
        strBuilderWriter35.write("");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder45.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder45.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder43.appendFixedWidthPadRight((java.lang.Object) strBuilder49, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer53 = strBuilder43.asTokenizer();
        int int55 = strBuilder43.lastIndexOf("hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer57 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher58 = strTokenizer57.getIgnoredMatcher();
        char[] charArray64 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer65 = strTokenizer57.reset(charArray64);
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder43.insert((int) (byte) 1, charArray64);
        strBuilderWriter35.write(charArray64);
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder21.append(charArray64);
        org.apache.commons.lang.text.StrTokenizer strTokenizer69 = strTokenizer1.reset(charArray64);
        org.apache.commons.lang.text.StrTokenizer strTokenizer70 = strTokenizer1.reset();
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertNotNull(strTokenizer3);
        org.junit.Assert.assertNotNull(strMatcher4);
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(strTokenizer57);
        org.junit.Assert.assertNotNull(strMatcher58);
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertArrayEquals(charArray64, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer65);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strTokenizer69);
        org.junit.Assert.assertNotNull(strTokenizer70);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
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
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder26.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer29 = strBuilder28.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrTokenizer strTokenizer31 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder28.appendFixedWidthPadLeft((java.lang.Object) "", (int) (short) 1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.deleteFirst("");
        char[] charArray39 = null;
        char[] charArray40 = strBuilder36.getChars(charArray39);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder34.append(charArray40);
        char[] charArray42 = strBuilder7.getChars(charArray40);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder7.append(38);
        java.lang.String str45 = strBuilder7.getNullText();
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder7.trim();
        strBuilder46.validateIndex(99);
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
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(strBuilder46);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.append(stringBuffer2, (-1), (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.reverse();
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.append(stringBuffer7);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.deleteFirst("hi!");
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader11 = strBuilder8.new StrBuilderReader();
        boolean boolean12 = strBuilderReader11.markSupported();
        strBuilderReader11.reset();
        strBuilderReader11.mark(100);
        boolean boolean16 = strBuilderReader11.ready();
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer4 = strBuilder3.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrTokenizer strTokenizer6 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) "", (int) (short) 1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.deleteAll(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.setLength(0);
        int int16 = strBuilder15.capacity();
        int int18 = strBuilder15.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder15.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder19.replaceAll("", "4   4");
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list24 = strTokenizer23.getTokenList();
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder22.appendWithSeparators((java.util.Collection) list24, " ");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder11.appendWithSeparators((java.util.Collection) list24, "!aaaaaaaaa0");
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder28);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        char[] charArray11 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strTokenizer4.reset(charArray11);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.appendWithSeparators((java.util.Iterator) strTokenizer4, "hi!");
        int int16 = strBuilder14.indexOf("hi!");
        boolean boolean18 = strBuilder14.startsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder14.setNewLineText("");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.append('a');
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        int int7 = strBuilder1.lastIndexOf(strMatcher5, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader10 = strBuilder9.new StrBuilderReader();
        boolean boolean11 = strBuilderReader10.markSupported();
        strBuilderReader10.mark((int) (byte) 100);
        long long15 = strBuilderReader10.skip((long) (short) 0);
        int int16 = strBuilderReader10.read();
        strBuilderReader10.reset();
        boolean boolean18 = strBuilderReader10.ready();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer23 = strBuilder22.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder22.replaceAll('a', '4');
        java.lang.String str29 = strBuilder26.substring(0, 0);
        strBuilder26.size = 10;
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer34 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder33.append(stringBuffer34, (-1), (int) ' ');
        char[] charArray38 = strBuilder37.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder26.append((java.lang.Object) charArray38);
        int int40 = strBuilderReader10.read(charArray38);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 104 + "'", int16 == 104);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        java.io.Writer writer4 = strBuilder3.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder6 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder8.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder6.appendFixedWidthPadRight((java.lang.Object) strBuilder12, 0, 'a');
        int int17 = strBuilder12.lastIndexOf("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendFixedWidthPadRight((java.lang.Object) strBuilder12, (int) (byte) 10, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.ensureCapacity(105);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder22.appendFixedWidthPadLeft((int) (byte) 0, (int) ' ', 'a');
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(writer4);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder26);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.apache.commons.lang.text.StrTokenizer strTokenizer0 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher1 = strTokenizer0.getIgnoredMatcher();
        char[] charArray7 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer8 = strTokenizer0.reset(charArray7);
        java.lang.String[] strArray9 = strTokenizer8.getTokenArray();
        boolean boolean10 = strTokenizer8.hasNext();
        java.lang.Object obj11 = strTokenizer8.next();
        org.junit.Assert.assertNotNull(strTokenizer0);
        org.junit.Assert.assertNotNull(strMatcher1);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "4   4" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "4   4" + "'", obj11, "4   4");
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) strBuilder7, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = strBuilder1.asTokenizer();
        int int13 = strBuilder1.lastIndexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer18 = strBuilder17.new StrBuilderTokenizer();
        char[] charArray19 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray19);
        java.util.List list23 = strBuilderTokenizer18.tokenize(charArray19, (int) (short) -1, (int) '#');
        java.lang.String str24 = strBuilderTokenizer18.getContent();
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
        java.lang.String str42 = strTokenizer26.previousToken();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder44.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer47 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher48 = strTokenizer47.getIgnoredMatcher();
        char[] charArray54 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer55 = strTokenizer47.reset(charArray54);
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder46.appendWithSeparators((java.util.Iterator) strTokenizer47, "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer58 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list59 = strTokenizer58.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer60 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher61 = strTokenizer60.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer62 = strTokenizer58.setDelimiterMatcher(strMatcher61);
        int int64 = strBuilder46.lastIndexOf(strMatcher61, (int) (byte) 0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer65 = strTokenizer26.setIgnoredMatcher(strMatcher61);
        org.apache.commons.lang.text.StrMatcher strMatcher66 = strTokenizer65.getDelimiterMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer67 = strBuilderTokenizer18.setQuoteMatcher(strMatcher66);
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder1.deleteFirst(strMatcher66);
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter69 = strBuilder68.new StrBuilderWriter();
        strBuilderWriter69.close();
        strBuilderWriter69.write((int) (byte) 10);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
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
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strTokenizer47);
        org.junit.Assert.assertNotNull(strMatcher48);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertArrayEquals(charArray54, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strTokenizer58);
        org.junit.Assert.assertNotNull(list59);
        org.junit.Assert.assertNotNull(strTokenizer60);
        org.junit.Assert.assertNotNull(strMatcher61);
        org.junit.Assert.assertNotNull(strTokenizer62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer65);
        org.junit.Assert.assertNotNull(strMatcher66);
        org.junit.Assert.assertNotNull(strTokenizer67);
        org.junit.Assert.assertNotNull(strBuilder68);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        int int7 = strBuilder1.lastIndexOf(strMatcher5, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.insert((int) (byte) 1, (int) '4');
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer11 = strBuilder1.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrTokenizer strTokenizer13 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(" ");
        int int14 = strTokenizer13.previousIndex();
        org.apache.commons.lang.text.StrTokenizer strTokenizer16 = strTokenizer13.setIgnoreEmptyTokens(false);
        java.lang.String[] strArray17 = strTokenizer13.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder1.appendWithSeparators((java.lang.Object[]) strArray17, " ");
        boolean boolean21 = strBuilder1.equals((java.lang.Object) 10L);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder1.deleteAll("\n");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder1.appendFixedWidthPadRight(48, 102, '!');
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer31 = strTokenizer29.setIgnoredChar('4');
        org.apache.commons.lang.text.StrMatcher strMatcher32 = strTokenizer29.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder34.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer37 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher38 = strTokenizer37.getIgnoredMatcher();
        char[] charArray44 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer45 = strTokenizer37.reset(charArray44);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder36.appendWithSeparators((java.util.Iterator) strTokenizer37, "hi!");
        int int50 = strBuilder47.indexOf('#', (int) (byte) -1);
        org.apache.commons.lang.text.StrTokenizer strTokenizer51 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrBuilder strBuilder53 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder53.setLength(0);
        int int56 = strBuilder55.capacity();
        int int58 = strBuilder55.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder55.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder59.deleteFirst('#');
        org.apache.commons.lang.text.StrBuilder strBuilder63 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer64 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder63.append(stringBuffer64, (-1), (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder69 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder69.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer72 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher73 = strTokenizer72.getIgnoredMatcher();
        char[] charArray79 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer80 = strTokenizer72.reset(charArray79);
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder71.appendWithSeparators((java.util.Iterator) strTokenizer72, "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer83 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher84 = strTokenizer83.getIgnoredMatcher();
        int int85 = strBuilder82.indexOf(strMatcher84);
        int int87 = strBuilder67.lastIndexOf(strMatcher84, (int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder88 = strBuilder59.deleteFirst(strMatcher84);
        org.apache.commons.lang.text.StrTokenizer strTokenizer89 = strTokenizer51.setDelimiterMatcher(strMatcher84);
        int int90 = strBuilder47.lastIndexOf(strMatcher84);
        org.apache.commons.lang.text.StrTokenizer strTokenizer91 = strTokenizer29.setTrimmerMatcher(strMatcher84);
        int int93 = strBuilder27.indexOf(strMatcher84, 38);
        boolean boolean94 = strBuilder27.isEmpty();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(strMatcher32);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertNotNull(strMatcher38);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertArrayEquals(charArray44, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer45);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 35 + "'", int56 == 35);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strTokenizer72);
        org.junit.Assert.assertNotNull(strMatcher73);
        org.junit.Assert.assertNotNull(charArray79);
        org.junit.Assert.assertArrayEquals(charArray79, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer80);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strTokenizer83);
        org.junit.Assert.assertNotNull(strMatcher84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertNotNull(strBuilder88);
        org.junit.Assert.assertNotNull(strTokenizer89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer91);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        char[] charArray11 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strTokenizer4.reset(charArray11);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.appendWithSeparators((java.util.Iterator) strTokenizer4, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.replaceAll('#', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer22 = strBuilder21.new StrBuilderTokenizer();
        char[] charArray23 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray23);
        java.util.List list27 = strBuilderTokenizer22.tokenize(charArray23, (int) (short) -1, (int) '#');
        java.lang.String str28 = strBuilderTokenizer22.getContent();
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder32.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder34.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer38 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list39 = strTokenizer38.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer40 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher41 = strTokenizer40.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer42 = strTokenizer38.setDelimiterMatcher(strMatcher41);
        int int44 = strBuilder37.indexOf(strMatcher41, (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer45 = strTokenizer30.setIgnoredMatcher(strMatcher41);
        java.lang.String str46 = strTokenizer30.previousToken();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder48.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer51 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher52 = strTokenizer51.getIgnoredMatcher();
        char[] charArray58 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer59 = strTokenizer51.reset(charArray58);
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder50.appendWithSeparators((java.util.Iterator) strTokenizer51, "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer62 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list63 = strTokenizer62.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer64 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher65 = strTokenizer64.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer66 = strTokenizer62.setDelimiterMatcher(strMatcher65);
        int int68 = strBuilder50.lastIndexOf(strMatcher65, (int) (byte) 0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer69 = strTokenizer30.setIgnoredMatcher(strMatcher65);
        org.apache.commons.lang.text.StrMatcher strMatcher70 = strTokenizer69.getDelimiterMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer71 = strBuilderTokenizer22.setQuoteMatcher(strMatcher70);
        int int72 = strBuilder14.indexOf(strMatcher70);
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder14.ensureCapacity(104);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strTokenizer38);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertNotNull(strMatcher41);
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(strMatcher52);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertArrayEquals(charArray58, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer59);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strTokenizer62);
        org.junit.Assert.assertNotNull(list63);
        org.junit.Assert.assertNotNull(strTokenizer64);
        org.junit.Assert.assertNotNull(strMatcher65);
        org.junit.Assert.assertNotNull(strTokenizer66);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer69);
        org.junit.Assert.assertNotNull(strMatcher70);
        org.junit.Assert.assertNotNull(strTokenizer71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(strBuilder74);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        int int7 = strBuilder1.lastIndexOf(strMatcher5, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader10 = strBuilder9.new StrBuilderReader();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.append((java.lang.Object) "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder9.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder13.minimizeCapacity();
        java.lang.String str15 = strBuilder14.toString();
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader16 = strBuilder14.new StrBuilderReader();
        strBuilderReader16.close();
        long long19 = strBuilderReader16.skip((long) (byte) 100);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!truehi!" + "'", str15, "hi!truehi!");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer4 = strBuilder3.new StrBuilderTokenizer();
        char[] charArray5 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer6 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray5);
        java.util.List list9 = strBuilderTokenizer4.tokenize(charArray5, (int) (short) -1, (int) '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer10 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray5);
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray5);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder13.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder17.appendNull();
        char[] charArray19 = strBuilder17.toCharArray();
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = strTokenizer11.reset(charArray19);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder24.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder24.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder22.appendFixedWidthPadRight((java.lang.Object) strBuilder28, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = strBuilder22.asTokenizer();
        int int34 = strBuilder22.indexOf("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer39 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher40 = strTokenizer39.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder36.deleteAll(strMatcher40);
        java.lang.StringBuffer stringBuffer42 = strBuilder41.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder22.append(stringBuffer42);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader44 = strBuilder22.new StrBuilderReader();
        org.apache.commons.lang.text.StrBuilder strBuilder46 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder46.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer49 = strBuilder48.new StrBuilderTokenizer();
        char[] charArray50 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer51 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray50);
        java.util.List list54 = strBuilderTokenizer49.tokenize(charArray50, (int) (short) -1, (int) '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer55 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray50);
        org.apache.commons.lang.text.StrTokenizer strTokenizer56 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray50);
        int int57 = strBuilderReader44.read(charArray50);
        org.apache.commons.lang.text.StrTokenizer strTokenizer58 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray50);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder60.setLength(0);
        java.io.Writer writer63 = strBuilder62.asWriter();
        org.apache.commons.lang.text.StrTokenizer strTokenizer64 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher65 = strTokenizer64.getIgnoredMatcher();
        int int66 = strBuilder62.indexOf(strMatcher65);
        org.apache.commons.lang.text.StrTokenizer strTokenizer67 = strTokenizer58.setTrimmerMatcher(strMatcher65);
        org.apache.commons.lang.text.StrTokenizer strTokenizer68 = strTokenizer20.setIgnoredMatcher(strMatcher65);
        org.apache.commons.lang.text.StrTokenizer strTokenizer69 = strTokenizer20.reset();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(strTokenizer10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strTokenizer39);
        org.junit.Assert.assertNotNull(strMatcher40);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(stringBuffer42);
        org.junit.Assert.assertEquals(stringBuffer42.toString(), "");
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertArrayEquals(charArray50, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertNotNull(strTokenizer56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(strTokenizer58);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(writer63);
        org.junit.Assert.assertNotNull(strTokenizer64);
        org.junit.Assert.assertNotNull(strMatcher65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer67);
        org.junit.Assert.assertNotNull(strTokenizer68);
        org.junit.Assert.assertNotNull(strTokenizer69);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
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
        org.apache.commons.lang.text.StrMatcher strMatcher37 = null;
        boolean boolean38 = strBuilder32.contains(strMatcher37);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder32.minimizeCapacity();
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strBuilder39);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
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
        org.apache.commons.lang.text.StrTokenizer strTokenizer33 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        java.lang.Object obj34 = strTokenizer33.clone();
        org.apache.commons.lang.text.StrTokenizer strTokenizer36 = strTokenizer33.setEmptyTokenAsNull(true);
        java.lang.String str37 = strTokenizer33.toString();
        org.apache.commons.lang.text.StrTokenizer strTokenizer39 = strTokenizer33.setDelimiterChar('a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer41 = strTokenizer39.setEmptyTokenAsNull(true);
        org.apache.commons.lang.text.StrTokenizer strTokenizer43 = strTokenizer39.setDelimiterChar('a');
        org.apache.commons.lang.text.StrBuilder strBuilder45 = new org.apache.commons.lang.text.StrBuilder("hi!");
        boolean boolean46 = strBuilder45.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder45.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder47.deleteFirst("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder51 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder51.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder53.append((double) 1.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder53.appendPadding((int) '#', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder58.appendFixedWidthPadLeft((int) ' ', 0, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer64 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder66 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder66.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder68.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer72 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list73 = strTokenizer72.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer74 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher75 = strTokenizer74.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer76 = strTokenizer72.setDelimiterMatcher(strMatcher75);
        int int78 = strBuilder71.indexOf(strMatcher75, (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer79 = strTokenizer64.setIgnoredMatcher(strMatcher75);
        int int81 = strBuilder58.lastIndexOf(strMatcher75, (int) (short) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder47.replaceAll(strMatcher75, "StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrTokenizer strTokenizer84 = strTokenizer43.setDelimiterMatcher(strMatcher75);
        org.apache.commons.lang.text.StrTokenizer strTokenizer86 = strTokenizer43.setEmptyTokenAsNull(true);
        int int87 = strTokenizer43.nextIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder90 = strBuilder8.appendFixedWidthPadRight((java.lang.Object) strTokenizer43, 19, 'i');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 38, count 31, length 57");
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
        org.junit.Assert.assertNotNull(strTokenizer33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strTokenizer36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str37, "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strTokenizer39);
        org.junit.Assert.assertNotNull(strTokenizer41);
        org.junit.Assert.assertNotNull(strTokenizer43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strTokenizer64);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strTokenizer72);
        org.junit.Assert.assertNotNull(list73);
        org.junit.Assert.assertNotNull(strTokenizer74);
        org.junit.Assert.assertNotNull(strMatcher75);
        org.junit.Assert.assertNotNull(strTokenizer76);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer79);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(strBuilder83);
        org.junit.Assert.assertNotNull(strTokenizer84);
        org.junit.Assert.assertNotNull(strTokenizer86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        boolean boolean2 = strBuilder1.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.minimizeCapacity();
        int int4 = strBuilder3.size();
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder3.deleteAll("hi! ");
        org.apache.commons.lang.text.StrTokenizer strTokenizer8 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer10 = strTokenizer8.setIgnoredChar('4');
        org.apache.commons.lang.text.StrMatcher strMatcher11 = strTokenizer8.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer13 = strTokenizer8.setEmptyTokenAsNull(true);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder17.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder17.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder15.appendFixedWidthPadRight((java.lang.Object) strBuilder21, 0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder24.appendNull();
        int int26 = strBuilder25.size;
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder25.append((double) 3);
        int int31 = strBuilder28.indexOf('a', (-1));
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder33.setLength(0);
        int int36 = strBuilder35.capacity();
        int int38 = strBuilder35.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder35.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder39.deleteFirst('#');
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter42 = strBuilder39.new StrBuilderWriter();
        strBuilderWriter42.close();
        strBuilderWriter42.flush();
        strBuilderWriter42.write(10);
        strBuilderWriter42.write("");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder52 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder52.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder52.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder50.appendFixedWidthPadRight((java.lang.Object) strBuilder56, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer60 = strBuilder50.asTokenizer();
        int int62 = strBuilder50.lastIndexOf("hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer64 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher65 = strTokenizer64.getIgnoredMatcher();
        char[] charArray71 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer72 = strTokenizer64.reset(charArray71);
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder50.insert((int) (byte) 1, charArray71);
        strBuilderWriter42.write(charArray71);
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder28.append(charArray71);
        org.apache.commons.lang.text.StrTokenizer strTokenizer76 = strTokenizer8.reset(charArray71);
        org.apache.commons.lang.text.StrTokenizer strTokenizer78 = strTokenizer8.setEmptyTokenAsNull(false);
        java.lang.String str79 = strTokenizer8.previousToken();
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder3.appendWithSeparators((java.util.Iterator) strTokenizer8, "i!4444444444");
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder3.insert(3, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(strTokenizer10);
        org.junit.Assert.assertNotNull(strMatcher11);
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strTokenizer60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(strTokenizer64);
        org.junit.Assert.assertNotNull(strMatcher65);
        org.junit.Assert.assertNotNull(charArray71);
        org.junit.Assert.assertArrayEquals(charArray71, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer72);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(strTokenizer76);
        org.junit.Assert.assertNotNull(strTokenizer78);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertNotNull(strBuilder84);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer4 = strBuilder3.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list6 = strTokenizer5.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer7 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher8 = strTokenizer7.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer9 = strTokenizer5.setDelimiterMatcher(strMatcher8);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder3.deleteAll(strMatcher8);
        boolean boolean11 = strBuilder3.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder3.append(false);
        int int14 = strBuilder13.length();
        int int17 = strBuilder13.lastIndexOf('a', 103);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertNotNull(strMatcher8);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        int int7 = strBuilder1.lastIndexOf(strMatcher5, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.insert((int) (byte) 1, (int) '4');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder1.deleteAll("44");
        boolean boolean14 = strBuilder12.startsWith("");
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder6 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.setLength(0);
        boolean boolean9 = strBuilder3.equals(strBuilder6);
        boolean boolean10 = strBuilder3.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder3.clear();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strBuilder11);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(" ");
        java.lang.String[] strArray2 = strTokenizer1.getTokenArray();
        int int3 = strTokenizer1.nextIndex();
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        int int7 = strBuilder1.lastIndexOf(strMatcher5, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader10 = strBuilder9.new StrBuilderReader();
        boolean boolean11 = strBuilderReader10.markSupported();
        strBuilderReader10.mark((int) (byte) 100);
        long long15 = strBuilderReader10.skip((long) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer18 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder17.append(stringBuffer18, (-1), (int) ' ');
        char[] charArray22 = strBuilder21.toCharArray();
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray22);
        int int24 = strBuilderReader10.read(charArray22);
        org.apache.commons.lang.text.StrTokenizer strTokenizer25 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray22);
        org.apache.commons.lang.text.StrTokenizer strTokenizer26 = strTokenizer25.reset();
        boolean boolean27 = strTokenizer25.isIgnoreEmptyTokens();
        java.lang.String str28 = strTokenizer25.previousToken();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
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
        int int26 = strBuilder24.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder24.insert(0, (double) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder24.replaceFirst(' ', '!');
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder24.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder33.deleteFirst('a');
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder33.replaceAll(' ', '0');
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder38);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer4 = strBuilder3.new StrBuilderTokenizer();
        java.io.Reader reader5 = java.io.Reader.nullReader();
        char[] charArray6 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer7 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray6);
        int int8 = reader5.read(charArray6);
        java.util.List list11 = strBuilderTokenizer4.tokenize(charArray6, (int) (short) 100, 100);
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher13 = strTokenizer12.getIgnoredMatcher();
        char[] charArray19 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = strTokenizer12.reset(charArray19);
        java.util.List list23 = strBuilderTokenizer4.tokenize(charArray19, 100, 0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer25 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = strTokenizer25.setIgnoredChar('4');
        char[] charArray28 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray28);
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list31 = strTokenizer30.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher33 = strTokenizer32.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer34 = strTokenizer30.setDelimiterMatcher(strMatcher33);
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = strTokenizer29.setQuoteMatcher(strMatcher33);
        java.lang.String[] strArray36 = strTokenizer29.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder38.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer41 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher42 = strTokenizer41.getIgnoredMatcher();
        int int44 = strBuilder38.lastIndexOf(strMatcher42, 100);
        org.apache.commons.lang.text.StrTokenizer strTokenizer45 = strTokenizer29.setIgnoredMatcher(strMatcher42);
        org.apache.commons.lang.text.StrTokenizer strTokenizer46 = strTokenizer25.setDelimiterMatcher(strMatcher42);
        org.apache.commons.lang.text.StrTokenizer strTokenizer47 = strBuilderTokenizer4.setIgnoredMatcher(strMatcher42);
        java.lang.String str48 = strBuilderTokenizer4.getContent();
        org.apache.commons.lang.text.StrMatcher strMatcher49 = strBuilderTokenizer4.getQuoteMatcher();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(reader5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strMatcher13);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertNotNull(strTokenizer27);
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
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strTokenizer41);
        org.junit.Assert.assertNotNull(strMatcher42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer45);
        org.junit.Assert.assertNotNull(strTokenizer46);
        org.junit.Assert.assertNotNull(strTokenizer47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(strMatcher49);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer3 = strTokenizer1.setIgnoredChar('4');
        org.apache.commons.lang.text.StrMatcher strMatcher4 = strTokenizer1.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer6 = strTokenizer1.setEmptyTokenAsNull(true);
        org.apache.commons.lang.text.StrTokenizer strTokenizer8 = strTokenizer6.setQuoteChar('i');
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertNotNull(strTokenizer3);
        org.junit.Assert.assertNotNull(strMatcher4);
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(strTokenizer8);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
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
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder6.replaceFirst("\n###", "h!   !i!#");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder27.append(false);
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
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder29);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.appendFixedWidthPadLeft(0, (int) (byte) -1, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder3.replaceFirst("StrTokenizer[not tokenized yet]", "StrTokenizer[not tokenized yet]");
        int int12 = strBuilder10.indexOf('#');
        int int13 = strBuilder10.size;
        java.lang.String str14 = strBuilder10.getNewLineText();
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder10.append('#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder10.insert(6, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 6");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strBuilder16);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
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
        java.io.Writer writer36 = strBuilder33.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder33.deleteAll('!');
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
        org.junit.Assert.assertNotNull(writer36);
        org.junit.Assert.assertNotNull(strBuilder38);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
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
        strBuilderWriter10.write("");
        strBuilderWriter10.flush();
        strBuilderWriter10.flush();
        strBuilderWriter10.close();
        strBuilderWriter10.write("4444444444", (int) (byte) 1, 3);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder(40);
        boolean boolean8 = strBuilder1.equals((java.lang.Object) strBuilder7);
        boolean boolean10 = strBuilder1.endsWith("hi!4   4");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder1.append('#');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.append('a');
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        boolean boolean2 = strBuilder1.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.deleteAll('#');
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter6 = strBuilder5.new StrBuilderWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.append(104);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder12.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder10.appendFixedWidthPadRight((java.lang.Object) strBuilder16, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = strBuilder10.asTokenizer();
        int int22 = strBuilder10.lastIndexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder24.deleteFirst("");
        char[] charArray27 = null;
        char[] charArray28 = strBuilder24.getChars(charArray27);
        boolean boolean29 = strBuilder10.equals((java.lang.Object) charArray27);
        org.apache.commons.lang.text.StrTokenizer strTokenizer31 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        java.lang.Object obj32 = strTokenizer31.clone();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder10.appendWithSeparators((java.util.Iterator) strTokenizer31, "0");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.setLength(0);
        int int39 = strBuilder38.capacity();
        int int41 = strBuilder38.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder38.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder42.deleteFirst('#');
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter45 = strBuilder42.new StrBuilderWriter();
        java.io.Writer writer47 = strBuilderWriter45.append(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder49 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder49.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder51.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer55 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list56 = strTokenizer55.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer57 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher58 = strTokenizer57.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer59 = strTokenizer55.setDelimiterMatcher(strMatcher58);
        int int61 = strBuilder54.indexOf(strMatcher58, (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder63 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder63.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer66 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher67 = strTokenizer66.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder63.deleteAll(strMatcher67);
        java.lang.StringBuffer stringBuffer69 = strBuilder68.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder54.append(stringBuffer69, (int) (short) 0, 0);
        java.io.Writer writer73 = strBuilderWriter45.append((java.lang.CharSequence) stringBuffer69);
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder34.append(stringBuffer69);
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder8.append(stringBuffer69);
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder75.insert(2, 'i');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(writer47);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertNotNull(strTokenizer57);
        org.junit.Assert.assertNotNull(strMatcher58);
        org.junit.Assert.assertNotNull(strTokenizer59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strTokenizer66);
        org.junit.Assert.assertNotNull(strMatcher67);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(stringBuffer69);
        org.junit.Assert.assertEquals(stringBuffer69.toString(), "");
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(writer73);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(strBuilder78);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list5 = strTokenizer4.getTokenList();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.appendWithSeparators((java.util.Collection) list5, "");
        java.lang.String str9 = strBuilder3.rightString((int) '#');
        strBuilder3.size = (byte) -1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = strBuilder3.substring((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        char[] charArray11 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strTokenizer4.reset(charArray11);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.appendWithSeparators((java.util.Iterator) strTokenizer4, "hi!");
        int int17 = strBuilder3.lastIndexOf("i!", (int) ' ');
        int int18 = strBuilder3.size;
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
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
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder26.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer29 = strBuilder28.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrTokenizer strTokenizer31 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder28.appendFixedWidthPadLeft((java.lang.Object) "", (int) (short) 1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.deleteFirst("");
        char[] charArray39 = null;
        char[] charArray40 = strBuilder36.getChars(charArray39);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder34.append(charArray40);
        char[] charArray42 = strBuilder7.getChars(charArray40);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder7.append(38);
        java.lang.String str45 = strBuilder7.getNullText();
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder7.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder46.appendFixedWidthPadLeft(52, 48, 'i');
        org.apache.commons.lang.text.StrBuilder strBuilder53 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder53.setLength(0);
        int int56 = strBuilder55.capacity();
        int int58 = strBuilder55.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder55.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder59.deleteFirst('#');
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter62 = strBuilder59.new StrBuilderWriter();
        strBuilderWriter62.close();
        java.io.Writer writer65 = strBuilderWriter62.append('#');
        strBuilderWriter62.write((int) '#');
        strBuilderWriter62.flush();
        org.apache.commons.lang.text.StrBuilder strBuilder70 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder70.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder72.replaceAll("hi!", "");
        char[] charArray76 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer77 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray76);
        char[] charArray78 = strBuilder72.getChars(charArray76);
        strBuilderWriter62.write(charArray78);
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder46.insert(7, charArray78);
        java.lang.String str81 = strBuilder80.getNewLineText();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str84 = strBuilder80.substring((int) 'a', 11);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 35 + "'", int56 == 35);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(writer65);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(charArray76);
        org.junit.Assert.assertArrayEquals(charArray76, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer77);
        org.junit.Assert.assertNotNull(charArray78);
        org.junit.Assert.assertArrayEquals(charArray78, new char[] {});
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertNull(str81);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
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
        java.lang.Object obj18 = strTokenizer16.clone();
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
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "StrTokenizer[not tokenized yet]");
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
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
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder35.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer38 = strBuilder37.new StrBuilderTokenizer();
        char[] charArray39 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer40 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray39);
        java.util.List list43 = strBuilderTokenizer38.tokenize(charArray39, (int) (short) -1, (int) '#');
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder8.appendWithSeparators((java.util.Collection) list43, "i!");
        int int48 = strBuilder45.indexOf(" ", 103);
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
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.append((double) 1.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder3.appendPadding((int) '#', '#');
        strBuilder8.validateIndex((int) (byte) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.setLength(0);
        int int15 = strBuilder14.capacity();
        char[] charArray16 = strBuilder14.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder14.setNewLineText("StrTokenizer[not tokenized yet]");
        char[] charArray19 = strBuilder18.buffer;
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder8.append(charArray19);
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer21 = strBuilder8.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = strBuilderTokenizer21.setIgnoredChar('#');
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] {});
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strTokenizer23);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        java.lang.Object obj2 = strTokenizer1.clone();
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = strTokenizer1.reset("");
        java.lang.String[] strArray5 = strTokenizer4.getTokenArray();
        org.apache.commons.lang.text.StrTokenizer strTokenizer7 = strTokenizer4.setDelimiterChar('a');
        int int8 = strTokenizer4.previousIndex();
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.append((double) 1.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder3.appendPadding((int) '#', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.appendFixedWidthPadLeft((int) (byte) 100, 0, '#');
        int int13 = strBuilder3.size();
        org.apache.commons.lang.text.StrTokenizer strTokenizer14 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher15 = strTokenizer14.getIgnoredMatcher();
        char[] charArray21 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer22 = strTokenizer14.reset(charArray21);
        org.apache.commons.lang.text.StrMatcher strMatcher23 = strTokenizer22.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder3.deleteAll(strMatcher23);
        java.lang.String str26 = strBuilder24.substring(10);
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder29.setLength(0);
        int int32 = strBuilder31.capacity();
        int int34 = strBuilder31.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder31.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder35.deleteFirst('#');
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer40 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder39.append(stringBuffer40, (-1), (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder45 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder45.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer48 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher49 = strTokenizer48.getIgnoredMatcher();
        char[] charArray55 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer56 = strTokenizer48.reset(charArray55);
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder47.appendWithSeparators((java.util.Iterator) strTokenizer48, "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer59 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher60 = strTokenizer59.getIgnoredMatcher();
        int int61 = strBuilder58.indexOf(strMatcher60);
        int int63 = strBuilder43.lastIndexOf(strMatcher60, (int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder35.deleteFirst(strMatcher60);
        org.apache.commons.lang.text.StrTokenizer strTokenizer65 = strTokenizer27.setDelimiterMatcher(strMatcher60);
        org.apache.commons.lang.text.StrTokenizer strTokenizer67 = strTokenizer65.setDelimiterString("StrTokenizer[]");
        java.util.List list68 = strTokenizer65.getTokenList();
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder24.appendWithSeparators((java.util.Collection) list68, "0#############################");
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 38 + "'", int13 == 38);
        org.junit.Assert.assertNotNull(strTokenizer14);
        org.junit.Assert.assertNotNull(strMatcher15);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer22);
        org.junit.Assert.assertNotNull(strMatcher23);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "############################" + "'", str26, "############################");
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strTokenizer48);
        org.junit.Assert.assertNotNull(strMatcher49);
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertArrayEquals(charArray55, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer56);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strTokenizer59);
        org.junit.Assert.assertNotNull(strMatcher60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(strTokenizer65);
        org.junit.Assert.assertNotNull(strTokenizer67);
        org.junit.Assert.assertNotNull(list68);
        org.junit.Assert.assertNotNull(strBuilder70);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) strBuilder7, 0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder7.append(0L);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.deleteFirst('#');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder12.appendPadding(13, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder12.append((long) 42);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = strBuilder12.substring(105);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
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
        long long15 = strBuilderReader10.skip(1L);
        long long17 = strBuilderReader10.skip((long) (byte) -1);
        strBuilderReader10.reset();
        java.nio.CharBuffer charBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = strBuilderReader10.read(charBuffer19);
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("hi!true-1.0");
        org.apache.commons.lang.text.StrTokenizer strTokenizer3 = strTokenizer1.setDelimiterString("!aaaaaaaaa0");
        // The following exception was thrown during execution in test generation
        try {
            strTokenizer3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertNotNull(strTokenizer3);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer4 = strBuilder3.new StrBuilderTokenizer();
        int int7 = strBuilder3.indexOf("StrTokenizer[not tokenized yet]", (int) (short) 1);
        java.io.Writer writer8 = strBuilder3.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.setLength(0);
        int int13 = strBuilder12.capacity();
        char[] charArray14 = strBuilder12.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder3.append(charArray14);
        java.lang.String str16 = strBuilder15.toString();
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.reverse();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(writer8);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] {});
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder18);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.append(stringBuffer2, (-1), (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.reverse();
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.append(stringBuffer7);
        org.apache.commons.lang.text.StrTokenizer strTokenizer9 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher10 = strTokenizer9.getIgnoredMatcher();
        char[] charArray16 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer17 = strTokenizer9.reset(charArray16);
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.setLength(0);
        java.io.Writer writer23 = strBuilder22.asWriter();
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher25 = strTokenizer24.getIgnoredMatcher();
        int int26 = strBuilder22.indexOf(strMatcher25);
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = strTokenizer18.setDelimiterMatcher(strMatcher25);
        int int28 = strBuilder6.lastIndexOf(strMatcher25);
        int int31 = strBuilder6.lastIndexOf('!', 33);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder6.deleteFirst('i');
        org.apache.commons.lang.text.StrTokenizer strTokenizer34 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher35 = strTokenizer34.getIgnoredMatcher();
        char[] charArray41 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer42 = strTokenizer34.reset(charArray41);
        org.apache.commons.lang.text.StrTokenizer strTokenizer43 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray41);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder45.setLength(0);
        java.io.Writer writer48 = strBuilder47.asWriter();
        org.apache.commons.lang.text.StrTokenizer strTokenizer49 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher50 = strTokenizer49.getIgnoredMatcher();
        int int51 = strBuilder47.indexOf(strMatcher50);
        org.apache.commons.lang.text.StrTokenizer strTokenizer52 = strTokenizer43.setDelimiterMatcher(strMatcher50);
        org.apache.commons.lang.text.StrTokenizer strTokenizer54 = strTokenizer52.setEmptyTokenAsNull(true);
        org.apache.commons.lang.text.StrTokenizer strTokenizer56 = strTokenizer54.setDelimiterChar('a');
        java.lang.String str57 = strTokenizer56.previousToken();
        org.apache.commons.lang.text.StrBuilder strBuilder59 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder61 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder61.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder61.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder59.appendFixedWidthPadRight((java.lang.Object) strBuilder65, 0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder65.append(0L);
        org.apache.commons.lang.text.StrTokenizer strTokenizer72 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder74 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder74.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder76.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer80 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list81 = strTokenizer80.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer82 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher83 = strTokenizer82.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer84 = strTokenizer80.setDelimiterMatcher(strMatcher83);
        int int86 = strBuilder79.indexOf(strMatcher83, (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer87 = strTokenizer72.setIgnoredMatcher(strMatcher83);
        org.apache.commons.lang.text.StrBuilder strBuilder89 = strBuilder70.replaceAll(strMatcher83, "4   4");
        org.apache.commons.lang.text.StrTokenizer strTokenizer90 = strTokenizer56.setQuoteMatcher(strMatcher83);
        org.apache.commons.lang.text.StrBuilder strBuilder92 = strBuilder33.replaceFirst(strMatcher83, "i!4444444444");
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(strMatcher10);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(writer23);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strMatcher25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(strMatcher35);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertArrayEquals(charArray41, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertNotNull(strTokenizer43);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(writer48);
        org.junit.Assert.assertNotNull(strTokenizer49);
        org.junit.Assert.assertNotNull(strMatcher50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer52);
        org.junit.Assert.assertNotNull(strTokenizer54);
        org.junit.Assert.assertNotNull(strTokenizer56);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strTokenizer72);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertNotNull(strTokenizer80);
        org.junit.Assert.assertNotNull(list81);
        org.junit.Assert.assertNotNull(strTokenizer82);
        org.junit.Assert.assertNotNull(strMatcher83);
        org.junit.Assert.assertNotNull(strTokenizer84);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer87);
        org.junit.Assert.assertNotNull(strBuilder89);
        org.junit.Assert.assertNotNull(strTokenizer90);
        org.junit.Assert.assertNotNull(strBuilder92);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        int int7 = strBuilder1.lastIndexOf(strMatcher5, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader10 = strBuilder9.new StrBuilderReader();
        boolean boolean11 = strBuilderReader10.markSupported();
        strBuilderReader10.mark((int) (byte) 100);
        long long15 = strBuilderReader10.skip((long) (short) 0);
        int int16 = strBuilderReader10.read();
        strBuilderReader10.reset();
        boolean boolean18 = strBuilderReader10.ready();
        strBuilderReader10.mark(0);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.setLength(0);
        int int25 = strBuilder24.capacity();
        int int27 = strBuilder24.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder24.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder28.deleteFirst('#');
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter31 = strBuilder28.new StrBuilderWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder33.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer36 = strBuilder35.new StrBuilderTokenizer();
        char[] charArray37 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer38 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray37);
        java.util.List list41 = strBuilderTokenizer36.tokenize(charArray37, (int) (short) -1, (int) '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer42 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray37);
        org.apache.commons.lang.text.StrTokenizer strTokenizer43 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray37);
        strBuilderWriter31.write(charArray37);
        long long45 = strBuilderReader10.transferTo((java.io.Writer) strBuilderWriter31);
        strBuilderReader10.mark((int) (short) 1);
        int int48 = strBuilderReader10.read();
        boolean boolean49 = strBuilderReader10.ready();
        boolean boolean50 = strBuilderReader10.markSupported();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 104 + "'", int16 == 104);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer38);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertNotNull(strTokenizer43);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 7L + "'", long45 == 7L);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.append((double) 1.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder3.appendPadding((int) '#', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.appendFixedWidthPadLeft((int) (byte) 100, 0, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher19 = strTokenizer18.getIgnoredMatcher();
        char[] charArray25 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer26 = strTokenizer18.reset(charArray25);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder17.appendWithSeparators((java.util.Iterator) strTokenizer18, "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher29 = strTokenizer18.getTrimmerMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer31 = strTokenizer18.setEmptyTokenAsNull(false);
        org.apache.commons.lang.text.StrTokenizer strTokenizer33 = strTokenizer18.setDelimiterChar('a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder37.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder39.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer43 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list44 = strTokenizer43.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer45 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher46 = strTokenizer45.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer47 = strTokenizer43.setDelimiterMatcher(strMatcher46);
        int int49 = strBuilder42.indexOf(strMatcher46, (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer50 = strTokenizer35.setIgnoredMatcher(strMatcher46);
        boolean boolean51 = strTokenizer35.hasPrevious();
        org.apache.commons.lang.text.StrMatcher strMatcher52 = strTokenizer35.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer53 = strTokenizer33.setIgnoredMatcher(strMatcher52);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder13.replaceAll(strMatcher52, "hi!4   4");
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder13.append((double) 100);
        java.lang.StringBuffer stringBuffer58 = strBuilder13.toStringBuffer();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strMatcher29);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(strTokenizer33);
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strTokenizer43);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertNotNull(strTokenizer45);
        org.junit.Assert.assertNotNull(strMatcher46);
        org.junit.Assert.assertNotNull(strTokenizer47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(strMatcher52);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(stringBuffer58);
        org.junit.Assert.assertEquals(stringBuffer58.toString(), "1.0###################################100.0");
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.deleteAll("");
        java.lang.Object obj6 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append(obj6);
        java.lang.String str9 = strBuilder5.substring(1);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder5.appendFixedWidthPadRight(33, 0, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder15.deleteAll("");
        boolean boolean21 = strBuilder19.contains('a');
        java.lang.String str24 = strBuilder19.midString(0, (int) (short) 0);
        int int25 = strBuilder19.capacity();
        org.apache.commons.lang.text.StrMatcher strMatcher26 = null;
        int int27 = strBuilder19.indexOf(strMatcher26);
        org.apache.commons.lang.text.StrTokenizer strTokenizer28 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher29 = strTokenizer28.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = strTokenizer28.reset();
        org.apache.commons.lang.text.StrBuilder strBuilder32 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder32.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher36 = strTokenizer35.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder32.deleteAll(strMatcher36);
        org.apache.commons.lang.text.StrTokenizer strTokenizer38 = strTokenizer30.setTrimmerMatcher(strMatcher36);
        int int39 = strBuilder19.indexOf(strMatcher36);
        char[] charArray40 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer41 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray40);
        char[] charArray42 = strBuilder19.getChars(charArray40);
        org.apache.commons.lang.text.StrTokenizer strTokenizer43 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray40);
        char[] charArray44 = strBuilder13.getChars(charArray40);
        char[] charArray45 = strBuilder13.toCharArray();
        java.lang.String str47 = strBuilder13.leftString(6);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "i!" + "'", str9, "i!");
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertNotNull(strMatcher29);
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertNotNull(strMatcher36);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strTokenizer38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer41);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(strTokenizer43);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertArrayEquals(charArray44, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrTokenizer strTokenizer3 = strTokenizer1.setIgnoredChar('a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = strTokenizer3.reset("i!");
        java.lang.String[] strArray6 = strTokenizer3.getTokenArray();
        int int7 = strTokenizer3.nextIndex();
        org.apache.commons.lang.text.StrMatcher strMatcher8 = strTokenizer3.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer10 = strTokenizer3.setEmptyTokenAsNull(true);
        org.apache.commons.lang.text.StrMatcher strMatcher11 = strTokenizer10.getTrimmerMatcher();
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertNotNull(strTokenizer3);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "i!" });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strMatcher8);
        org.junit.Assert.assertNotNull(strTokenizer10);
        org.junit.Assert.assertNotNull(strMatcher11);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
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
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder9.insert(1, (double) 33);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder20.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder21.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.append(' ');
        java.io.Reader reader25 = strBuilder22.asReader();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(reader25);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer3 = strTokenizer1.setIgnoredChar('4');
        int int4 = strTokenizer1.nextIndex();
        org.apache.commons.lang.text.StrTokenizer strTokenizer6 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder10.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer14 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list15 = strTokenizer14.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer16 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher17 = strTokenizer16.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = strTokenizer14.setDelimiterMatcher(strMatcher17);
        int int20 = strBuilder13.indexOf(strMatcher17, (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer21 = strTokenizer6.setIgnoredMatcher(strMatcher17);
        java.lang.String str22 = strTokenizer6.previousToken();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder24.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher28 = strTokenizer27.getIgnoredMatcher();
        char[] charArray34 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = strTokenizer27.reset(charArray34);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder26.appendWithSeparators((java.util.Iterator) strTokenizer27, "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer38 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list39 = strTokenizer38.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer40 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher41 = strTokenizer40.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer42 = strTokenizer38.setDelimiterMatcher(strMatcher41);
        int int44 = strBuilder26.lastIndexOf(strMatcher41, (int) (byte) 0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer45 = strTokenizer6.setIgnoredMatcher(strMatcher41);
        org.apache.commons.lang.text.StrTokenizer strTokenizer47 = strTokenizer6.setEmptyTokenAsNull(true);
        org.apache.commons.lang.text.StrMatcher strMatcher48 = strTokenizer6.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer49 = strTokenizer1.setIgnoredMatcher(strMatcher48);
        boolean boolean50 = strTokenizer1.hasNext();
        org.apache.commons.lang.text.StrBuilder strBuilder52 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder52.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder54.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder57 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder57.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer60 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher61 = strTokenizer60.getIgnoredMatcher();
        char[] charArray67 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer68 = strTokenizer60.reset(charArray67);
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder59.appendWithSeparators((java.util.Iterator) strTokenizer60, "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer71 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher72 = strTokenizer71.getIgnoredMatcher();
        int int73 = strBuilder70.indexOf(strMatcher72);
        int int74 = strBuilder54.lastIndexOf(strMatcher72);
        org.apache.commons.lang.text.StrTokenizer strTokenizer75 = strTokenizer1.setDelimiterMatcher(strMatcher72);
        java.lang.String str76 = strTokenizer1.toString();
        int int77 = strTokenizer1.previousIndex();
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertNotNull(strTokenizer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strTokenizer14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertNotNull(strMatcher17);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertNotNull(strMatcher28);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strTokenizer38);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertNotNull(strMatcher41);
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer45);
        org.junit.Assert.assertNotNull(strTokenizer47);
        org.junit.Assert.assertNotNull(strMatcher48);
        org.junit.Assert.assertNotNull(strTokenizer49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strTokenizer60);
        org.junit.Assert.assertNotNull(strMatcher61);
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertArrayEquals(charArray67, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer68);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strTokenizer71);
        org.junit.Assert.assertNotNull(strMatcher72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "StrTokenizer[]" + "'", str76, "StrTokenizer[]");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
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
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = strBuilder1.asTokenizer();
        int int13 = strBuilder1.lastIndexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.deleteFirst("");
        char[] charArray18 = null;
        char[] charArray19 = strBuilder15.getChars(charArray18);
        boolean boolean20 = strBuilder1.equals((java.lang.Object) charArray18);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) "\n", 0, ' ');
        int int26 = strBuilder24.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder24.insert(0, (double) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder24.replaceFirst(' ', '!');
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder24.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder33.deleteFirst('i');
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder35);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder3.replaceFirst(' ', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer11 = strBuilder10.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder10.replaceAll('a', '4');
        org.apache.commons.lang.text.StrTokenizer strTokenizer15 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher16 = strTokenizer15.getIgnoredMatcher();
        char[] charArray22 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = strTokenizer15.reset(charArray22);
        int int24 = strTokenizer15.size();
        boolean boolean25 = strTokenizer15.hasNext();
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = strTokenizer15.setEmptyTokenAsNull(false);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder10.appendFixedWidthPadLeft((java.lang.Object) false, (int) (byte) 100, '4');
        boolean boolean31 = strBuilder6.equals((java.lang.Object) '4');
        boolean boolean33 = strBuilder6.contains("StrTokenizer[4   4]");
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strTokenizer15);
        org.junit.Assert.assertNotNull(strMatcher16);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
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
        strBuilderWriter10.write("");
        strBuilderWriter10.flush();
        strBuilderWriter10.flush();
        strBuilderWriter10.flush();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.setLength(0);
        int int24 = strBuilder23.capacity();
        int int26 = strBuilder23.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder23.trim();
        java.lang.String str29 = strBuilder27.rightString((-1));
        org.apache.commons.lang.text.StrTokenizer strTokenizer31 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        java.lang.Object obj32 = strTokenizer31.clone();
        org.apache.commons.lang.text.StrTokenizer strTokenizer34 = strTokenizer31.setEmptyTokenAsNull(true);
        java.lang.String str35 = strTokenizer31.toString();
        org.apache.commons.lang.text.StrTokenizer strTokenizer37 = strTokenizer31.setDelimiterChar('a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer39 = strTokenizer37.setEmptyTokenAsNull(true);
        org.apache.commons.lang.text.StrTokenizer strTokenizer41 = strTokenizer37.setDelimiterChar('a');
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder27.appendFixedWidthPadLeft((java.lang.Object) strTokenizer37, (int) (short) 100, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder46 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder46.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer49 = strBuilder48.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrTokenizer strTokenizer51 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder48.appendFixedWidthPadLeft((java.lang.Object) "", (int) (short) 1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder56 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder56.deleteFirst("");
        char[] charArray59 = null;
        char[] charArray60 = strBuilder56.getChars(charArray59);
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder54.append(charArray60);
        char[] charArray62 = strBuilder27.getChars(charArray60);
        strBuilderWriter10.write(charArray60);
        strBuilderWriter10.write("hi!");
        strBuilderWriter10.write(10);
        strBuilderWriter10.close();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str35, "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertNotNull(strTokenizer39);
        org.junit.Assert.assertNotNull(strTokenizer41);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertArrayEquals(charArray60, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(charArray62);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder((int) ' ');
        int int4 = strBuilder1.lastIndexOf(" ", 2);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader5 = strBuilder1.new StrBuilderReader();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.insert(4, (java.lang.Object) (-1));
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder1.setLength((int) '0');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder16.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list21 = strTokenizer20.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer22 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher23 = strTokenizer22.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = strTokenizer20.setDelimiterMatcher(strMatcher23);
        int int26 = strBuilder19.indexOf(strMatcher23, (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder19.appendNewLine();
        java.lang.String str30 = strBuilder27.midString((int) (short) 0, 100);
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        java.lang.Object obj33 = strTokenizer32.clone();
        int int34 = strTokenizer32.size();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder27.append((java.lang.Object) int34);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder27.trim();
        java.lang.String str38 = strBuilder36.rightString((int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer39 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher40 = strTokenizer39.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer41 = strTokenizer39.reset();
        org.apache.commons.lang.text.StrBuilder strBuilder43 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder43.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer46 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher47 = strTokenizer46.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder43.deleteAll(strMatcher47);
        org.apache.commons.lang.text.StrTokenizer strTokenizer49 = strTokenizer41.setTrimmerMatcher(strMatcher47);
        boolean boolean50 = strTokenizer49.isIgnoreEmptyTokens();
        int int51 = strTokenizer49.size();
        org.apache.commons.lang.text.StrMatcher strMatcher52 = strTokenizer49.getDelimiterMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder36.replaceFirst(strMatcher52, "StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder12.replace(strMatcher52, "h4   4i!#35.0", 6, 69, 48);
        int int61 = strBuilder12.indexOf("i!4444444444");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(strTokenizer22);
        org.junit.Assert.assertNotNull(strMatcher23);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\n" + "'", str30, "\n");
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "0" + "'", str38, "0");
        org.junit.Assert.assertNotNull(strTokenizer39);
        org.junit.Assert.assertNotNull(strMatcher40);
        org.junit.Assert.assertNotNull(strTokenizer41);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strTokenizer46);
        org.junit.Assert.assertNotNull(strMatcher47);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strTokenizer49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(strMatcher52);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.append(stringBuffer2, (-1), (int) ' ');
        boolean boolean7 = strBuilder1.endsWith("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.replaceAll("44", "hi!#");
        char[] charArray11 = strBuilder10.toCharArray();
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { 'h', 'i', '!' });
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder3.trim();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder3.deleteCharAt(105);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 105");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder4);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        java.io.Writer writer4 = strBuilder3.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder6 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder8.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder6.appendFixedWidthPadRight((java.lang.Object) strBuilder12, 0, 'a');
        int int17 = strBuilder12.lastIndexOf("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendFixedWidthPadRight((java.lang.Object) strBuilder12, (int) (byte) 10, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder12.trim();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(writer4);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder21);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer3 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        java.lang.Object obj4 = strTokenizer3.clone();
        int int5 = strTokenizer3.size();
        org.apache.commons.lang.text.StrMatcher strMatcher6 = strTokenizer3.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.replaceFirst(strMatcher6, "4   4");
        int int9 = strBuilder1.length();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder1.append((long) (byte) 0);
        boolean boolean13 = strBuilder11.endsWith("4   4");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder11.append(true);
        char[] charArray16 = strBuilder15.buffer;
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.deleteFirst("\n###");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder15.append('!');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder15.replace(105, 0, " 4444444444444444444444444444444444\n");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strTokenizer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strMatcher6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        int int4 = strBuilder3.capacity();
        char[] charArray5 = strBuilder3.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.setNewLineText("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder7.setNullText("StrTokenizer[not tokenized yet]");
        int int10 = strBuilder7.length();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
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
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer25 = strBuilder24.new StrBuilderTokenizer();
        char[] charArray26 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray26);
        java.util.List list30 = strBuilderTokenizer25.tokenize(charArray26, (int) (short) -1, (int) '#');
        java.lang.String str31 = strBuilderTokenizer25.getContent();
        org.apache.commons.lang.text.StrMatcher strMatcher32 = strBuilderTokenizer25.getDelimiterMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder1.replaceFirst(strMatcher32, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder1.ensureCapacity((int) '#');
        int int37 = strBuilder1.capacity();
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder39.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer42 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher43 = strTokenizer42.getIgnoredMatcher();
        char[] charArray49 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer50 = strTokenizer42.reset(charArray49);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder41.appendWithSeparators((java.util.Iterator) strTokenizer42, "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher53 = strTokenizer42.getTrimmerMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer55 = strTokenizer42.setEmptyTokenAsNull(false);
        org.apache.commons.lang.text.StrMatcher strMatcher56 = strTokenizer55.getDelimiterMatcher();
        org.apache.commons.lang.text.StrMatcher strMatcher57 = strTokenizer55.getDelimiterMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder1.deleteFirst(strMatcher57);
        int int60 = strBuilder1.lastIndexOf('#');
        org.apache.commons.lang.text.StrBuilder strBuilder62 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer63 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder62.append(stringBuffer63, (-1), (int) ' ');
        char[] charArray67 = strBuilder66.toCharArray();
        org.apache.commons.lang.text.StrTokenizer strTokenizer68 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray67);
        strBuilder1.buffer = charArray67;
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
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(strMatcher32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertNotNull(strMatcher43);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertArrayEquals(charArray49, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer50);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strMatcher53);
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertNotNull(strMatcher56);
        org.junit.Assert.assertNotNull(strMatcher57);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertArrayEquals(charArray67, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(strTokenizer68);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        char[] charArray11 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strTokenizer4.reset(charArray11);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.appendWithSeparators((java.util.Iterator) strTokenizer4, "hi!");
        int int16 = strBuilder14.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer21 = strBuilder20.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrTokenizer strTokenizer22 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list23 = strTokenizer22.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher25 = strTokenizer24.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer26 = strTokenizer22.setDelimiterMatcher(strMatcher25);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder20.deleteAll(strMatcher25);
        int int28 = strBuilder20.size();
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder30.deleteAll("");
        java.lang.Object obj35 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder34.append(obj35);
        java.lang.String str37 = strBuilder36.getNewLineText();
        java.lang.StringBuffer stringBuffer38 = strBuilder36.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder20.append(stringBuffer38);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder39.append('#');
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder39.setLength(5);
        org.apache.commons.lang.text.StrTokenizer strTokenizer44 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher45 = strTokenizer44.getIgnoredMatcher();
        char[] charArray51 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer52 = strTokenizer44.reset(charArray51);
        org.apache.commons.lang.text.StrMatcher strMatcher53 = strTokenizer52.getIgnoredMatcher();
        int int55 = strBuilder39.indexOf(strMatcher53, 102);
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder14.deleteFirst(strMatcher53);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strTokenizer22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strMatcher25);
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(stringBuffer38);
        org.junit.Assert.assertEquals(stringBuffer38.toString(), "hi!");
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strTokenizer44);
        org.junit.Assert.assertNotNull(strMatcher45);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertArrayEquals(charArray51, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer52);
        org.junit.Assert.assertNotNull(strMatcher53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(strBuilder56);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer4 = strBuilder3.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.replaceAll('a', '4');
        java.lang.String str10 = strBuilder7.substring(0, 0);
        strBuilder7.size = 10;
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer15 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder14.append(stringBuffer15, (-1), (int) ' ');
        char[] charArray19 = strBuilder18.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder7.append((java.lang.Object) charArray19);
        java.lang.String str22 = strBuilder7.rightString(33);
        java.lang.StringBuffer stringBuffer23 = strBuilder7.toStringBuffer();
        strBuilder7.size = 13;
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(stringBuffer23);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer4 = strBuilder3.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrTokenizer strTokenizer6 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) "", (int) (short) 1, ' ');
        java.lang.String str12 = strBuilder3.midString((-1), (int) (short) 0);
        int int15 = strBuilder3.indexOf('a', 35);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder3.insert((int) (byte) 1, (long) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder18.trim();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder19);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer3 = strTokenizer1.setIgnoredChar('4');
        org.apache.commons.lang.text.StrMatcher strMatcher4 = strTokenizer1.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder6 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer9 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher10 = strTokenizer9.getIgnoredMatcher();
        char[] charArray16 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer17 = strTokenizer9.reset(charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder8.appendWithSeparators((java.util.Iterator) strTokenizer9, "hi!");
        int int22 = strBuilder19.indexOf('#', (int) (byte) -1);
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.setLength(0);
        int int28 = strBuilder27.capacity();
        int int30 = strBuilder27.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder27.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder31.deleteFirst('#');
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer36 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder35.append(stringBuffer36, (-1), (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder41 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder41.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer44 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher45 = strTokenizer44.getIgnoredMatcher();
        char[] charArray51 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer52 = strTokenizer44.reset(charArray51);
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder43.appendWithSeparators((java.util.Iterator) strTokenizer44, "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer55 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher56 = strTokenizer55.getIgnoredMatcher();
        int int57 = strBuilder54.indexOf(strMatcher56);
        int int59 = strBuilder39.lastIndexOf(strMatcher56, (int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder31.deleteFirst(strMatcher56);
        org.apache.commons.lang.text.StrTokenizer strTokenizer61 = strTokenizer23.setDelimiterMatcher(strMatcher56);
        int int62 = strBuilder19.lastIndexOf(strMatcher56);
        org.apache.commons.lang.text.StrTokenizer strTokenizer63 = strTokenizer1.setTrimmerMatcher(strMatcher56);
        org.apache.commons.lang.text.StrTokenizer strTokenizer65 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer67 = strTokenizer65.setIgnoredChar('4');
        boolean boolean68 = strTokenizer65.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrTokenizer strTokenizer70 = strTokenizer65.setDelimiterString("hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer72 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("!ih");
        org.apache.commons.lang.text.StrMatcher strMatcher73 = strTokenizer72.getDelimiterMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer74 = strTokenizer70.setDelimiterMatcher(strMatcher73);
        org.apache.commons.lang.text.StrTokenizer strTokenizer75 = strTokenizer1.setIgnoredMatcher(strMatcher73);
        org.apache.commons.lang.text.StrTokenizer strTokenizer77 = strTokenizer1.setIgnoredChar('!');
        org.apache.commons.lang.text.StrTokenizer strTokenizer79 = strTokenizer77.setDelimiterString("h52i!4   4");
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertNotNull(strTokenizer3);
        org.junit.Assert.assertNotNull(strMatcher4);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(strMatcher10);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strTokenizer44);
        org.junit.Assert.assertNotNull(strMatcher45);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertArrayEquals(charArray51, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer52);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertNotNull(strMatcher56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strTokenizer61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer63);
        org.junit.Assert.assertNotNull(strTokenizer65);
        org.junit.Assert.assertNotNull(strTokenizer67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(strTokenizer70);
        org.junit.Assert.assertNotNull(strTokenizer72);
        org.junit.Assert.assertNotNull(strMatcher73);
        org.junit.Assert.assertNotNull(strTokenizer74);
        org.junit.Assert.assertNotNull(strTokenizer75);
        org.junit.Assert.assertNotNull(strTokenizer77);
        org.junit.Assert.assertNotNull(strTokenizer79);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.deleteAll("");
        java.lang.Object obj6 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append(obj6);
        org.apache.commons.lang.text.StrTokenizer strTokenizer8 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher9 = strTokenizer8.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder7.replaceAll(strMatcher9, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder11.appendFixedWidthPadRight(8, 99, '0');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.deleteAll("h69.0i!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = strBuilder15.asTokenizer();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(strMatcher9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strTokenizer18);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        int int4 = strBuilder3.capacity();
        int int6 = strBuilder3.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder7.deleteFirst('#');
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter10 = strBuilder7.new StrBuilderWriter();
        strBuilderWriter10.close();
        java.io.Writer writer13 = strBuilderWriter10.append('#');
        strBuilderWriter10.close();
        java.io.Writer writer15 = java.io.Writer.nullWriter();
        java.io.Writer writer17 = writer15.append('#');
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.setLength(0);
        int int22 = strBuilder21.capacity();
        int int24 = strBuilder21.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder21.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.deleteFirst('#');
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter28 = strBuilder25.new StrBuilderWriter();
        strBuilderWriter28.close();
        strBuilderWriter28.flush();
        strBuilderWriter28.write(10);
        strBuilderWriter28.write((int) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.setLength(0);
        java.io.Writer writer39 = strBuilder38.asWriter();
        java.io.Writer writer41 = writer39.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder43 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder43.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder45.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer49 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list50 = strTokenizer49.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer51 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher52 = strTokenizer51.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer53 = strTokenizer49.setDelimiterMatcher(strMatcher52);
        int int55 = strBuilder48.indexOf(strMatcher52, (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder57 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder57.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer60 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher61 = strTokenizer60.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder57.deleteAll(strMatcher61);
        java.lang.StringBuffer stringBuffer63 = strBuilder62.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder48.append(stringBuffer63, (int) (short) 0, 0);
        java.io.Writer writer67 = writer41.append((java.lang.CharSequence) stringBuffer63);
        java.io.Writer writer68 = strBuilderWriter28.append((java.lang.CharSequence) stringBuffer63);
        java.io.Writer writer69 = writer15.append((java.lang.CharSequence) stringBuffer63);
        java.io.Writer writer70 = strBuilderWriter10.append((java.lang.CharSequence) stringBuffer63);
        strBuilderWriter10.write("0");
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(writer13);
        org.junit.Assert.assertNotNull(writer15);
        org.junit.Assert.assertNotNull(writer17);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(writer39);
        org.junit.Assert.assertNotNull(writer41);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strTokenizer49);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(strMatcher52);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strTokenizer60);
        org.junit.Assert.assertNotNull(strMatcher61);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(stringBuffer63);
        org.junit.Assert.assertEquals(stringBuffer63.toString(), "");
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(writer67);
        org.junit.Assert.assertNotNull(writer68);
        org.junit.Assert.assertNotNull(writer69);
        org.junit.Assert.assertNotNull(writer70);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
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
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder7.appendFixedWidthPadRight((int) (byte) -1, 104, '#');
        strBuilder36.validateIndex(99);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder40.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer43 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher44 = strTokenizer43.getIgnoredMatcher();
        int int46 = strBuilder40.lastIndexOf(strMatcher44, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder40.insert((int) (byte) 1, (int) '4');
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer50 = strBuilder40.new StrBuilderTokenizer();
        boolean boolean51 = strBuilderTokenizer50.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrBuilder strBuilder53 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder53.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer56 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher57 = strTokenizer56.getIgnoredMatcher();
        char[] charArray63 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer64 = strTokenizer56.reset(charArray63);
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder55.appendWithSeparators((java.util.Iterator) strTokenizer56, "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher67 = strTokenizer56.getTrimmerMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer69 = strTokenizer56.setEmptyTokenAsNull(false);
        org.apache.commons.lang.text.StrTokenizer strTokenizer70 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher71 = strTokenizer70.getTrimmerMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer72 = strTokenizer69.setDelimiterMatcher(strMatcher71);
        org.apache.commons.lang.text.StrTokenizer strTokenizer73 = strBuilderTokenizer50.setIgnoredMatcher(strMatcher71);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder36.appendFixedWidthPadRight((java.lang.Object) strMatcher71, 1, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 112, count 60, length 113");
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
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strTokenizer43);
        org.junit.Assert.assertNotNull(strMatcher44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strTokenizer56);
        org.junit.Assert.assertNotNull(strMatcher57);
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertArrayEquals(charArray63, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer64);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strMatcher67);
        org.junit.Assert.assertNotNull(strTokenizer69);
        org.junit.Assert.assertNotNull(strTokenizer70);
        org.junit.Assert.assertNotNull(strMatcher71);
        org.junit.Assert.assertNotNull(strTokenizer72);
        org.junit.Assert.assertNotNull(strTokenizer73);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        char[] charArray11 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strTokenizer4.reset(charArray11);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.appendWithSeparators((java.util.Iterator) strTokenizer4, "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher15 = strTokenizer4.getTrimmerMatcher();
        java.lang.String str16 = strTokenizer4.nextToken();
        org.apache.commons.lang.text.StrMatcher strMatcher17 = strTokenizer4.getTrimmerMatcher();
        boolean boolean18 = strTokenizer4.isIgnoreEmptyTokens();
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = strTokenizer4.setIgnoredChar('4');
        org.apache.commons.lang.text.StrTokenizer strTokenizer21 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher22 = strTokenizer21.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder24.setLength(0);
        java.io.Writer writer27 = strBuilder26.asWriter();
        org.apache.commons.lang.text.StrTokenizer strTokenizer28 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher29 = strTokenizer28.getIgnoredMatcher();
        int int30 = strBuilder26.indexOf(strMatcher29);
        org.apache.commons.lang.text.StrTokenizer strTokenizer31 = strTokenizer21.setQuoteMatcher(strMatcher29);
        org.apache.commons.lang.text.StrTokenizer strTokenizer33 = strTokenizer21.reset(" ");
        org.apache.commons.lang.text.StrMatcher strMatcher34 = strTokenizer21.getDelimiterMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = strTokenizer4.setDelimiterMatcher(strMatcher34);
        org.apache.commons.lang.text.StrTokenizer strTokenizer37 = strTokenizer35.setDelimiterString("hi! ");
        org.apache.commons.lang.text.StrMatcher strMatcher38 = strTokenizer37.getIgnoredMatcher();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strMatcher15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strMatcher17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strMatcher22);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(writer27);
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertNotNull(strMatcher29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(strTokenizer33);
        org.junit.Assert.assertNotNull(strMatcher34);
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertNotNull(strMatcher38);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer4 = strBuilder3.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.replaceAll('a', '4');
        java.lang.String str10 = strBuilder7.substring(0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder7.setNullText("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder12.minimizeCapacity();
        java.lang.String str14 = strBuilder12.getNewLineText();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder12.delete((int) 'i', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
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
        org.apache.commons.lang.text.StrMatcher strMatcher22 = strTokenizer18.getTrimmerMatcher();
        java.lang.String str23 = strTokenizer18.toString();
        java.lang.String str24 = strTokenizer18.nextToken();
        org.apache.commons.lang.text.StrTokenizer strTokenizer25 = strTokenizer18.reset();
        java.lang.Object obj26 = strTokenizer25.clone();
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
        org.junit.Assert.assertNotNull(strMatcher22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "StrTokenizer[]" + "'", str23, "StrTokenizer[]");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "StrTokenizer[not tokenized yet]");
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
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
        java.lang.CharSequence charSequence17 = null;
        java.io.Writer writer18 = strBuilderWriter10.append(charSequence17);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(writer18);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
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
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer22 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher23 = strTokenizer22.getIgnoredMatcher();
        char[] charArray29 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = strTokenizer22.reset(charArray29);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder21.appendWithSeparators((java.util.Iterator) strTokenizer22, "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer33 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list34 = strTokenizer33.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher36 = strTokenizer35.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer37 = strTokenizer33.setDelimiterMatcher(strMatcher36);
        int int39 = strBuilder21.lastIndexOf(strMatcher36, (int) (byte) 0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer40 = strTokenizer1.setIgnoredMatcher(strMatcher36);
        org.apache.commons.lang.text.StrTokenizer strTokenizer42 = strTokenizer1.setEmptyTokenAsNull(true);
        org.apache.commons.lang.text.StrTokenizer strTokenizer43 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher44 = strTokenizer43.getIgnoredMatcher();
        char[] charArray50 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer51 = strTokenizer43.reset(charArray50);
        java.lang.String[] strArray52 = strTokenizer51.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder54 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder54.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder56.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer60 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list61 = strTokenizer60.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer62 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher63 = strTokenizer62.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer64 = strTokenizer60.setDelimiterMatcher(strMatcher63);
        int int66 = strBuilder59.indexOf(strMatcher63, (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer67 = strTokenizer51.setTrimmerMatcher(strMatcher63);
        org.apache.commons.lang.text.StrTokenizer strTokenizer68 = strTokenizer42.setDelimiterMatcher(strMatcher63);
        java.lang.String str69 = strTokenizer68.toString();
        org.apache.commons.lang.text.StrTokenizer strTokenizer70 = strTokenizer68.reset();
        org.apache.commons.lang.text.StrMatcher strMatcher71 = strTokenizer68.getDelimiterMatcher();
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
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strTokenizer22);
        org.junit.Assert.assertNotNull(strMatcher23);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strTokenizer33);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertNotNull(strMatcher36);
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertNotNull(strTokenizer43);
        org.junit.Assert.assertNotNull(strMatcher44);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertArrayEquals(charArray50, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "4   4" });
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strTokenizer60);
        org.junit.Assert.assertNotNull(list61);
        org.junit.Assert.assertNotNull(strTokenizer62);
        org.junit.Assert.assertNotNull(strMatcher63);
        org.junit.Assert.assertNotNull(strTokenizer64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer67);
        org.junit.Assert.assertNotNull(strTokenizer68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "StrTokenizer[]" + "'", str69, "StrTokenizer[]");
        org.junit.Assert.assertNotNull(strTokenizer70);
        org.junit.Assert.assertNotNull(strMatcher71);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
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
        java.lang.String str21 = strTokenizer20.toString();
        java.lang.String[] strArray22 = strTokenizer20.getTokenArray();
        int int23 = strTokenizer20.previousIndex();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str21, "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "4   4" });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder3.replaceAll("hi!", "");
        char[] charArray7 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer8 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray7);
        char[] charArray9 = strBuilder3.getChars(charArray7);
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer13 = strTokenizer11.setIgnoreEmptyTokens(false);
        java.lang.String str14 = strTokenizer13.previousToken();
        java.lang.String[] strArray15 = strTokenizer13.getTokenArray();
        java.util.List list16 = strTokenizer13.getTokenList();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder3.appendWithSeparators((java.util.Collection) list16, " ");
        int int21 = strBuilder3.lastIndexOf("\n", 7);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder3.appendNewLine();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(strBuilder22);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.setLength(38);
        char[] charArray6 = strBuilder5.toCharArray();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(charArray6);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.append((double) 1.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder3.appendPadding((int) '#', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder10 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.replaceAll("hi!", "");
        boolean boolean16 = strBuilder15.isEmpty();
        char[] charArray17 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray17);
        org.apache.commons.lang.text.StrTokenizer strTokenizer19 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list20 = strTokenizer19.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer21 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher22 = strTokenizer21.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = strTokenizer19.setDelimiterMatcher(strMatcher22);
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = strTokenizer18.setQuoteMatcher(strMatcher22);
        java.lang.String[] strArray25 = strTokenizer18.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder27.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher31 = strTokenizer30.getIgnoredMatcher();
        int int33 = strBuilder27.lastIndexOf(strMatcher31, 100);
        org.apache.commons.lang.text.StrTokenizer strTokenizer34 = strTokenizer18.setIgnoredMatcher(strMatcher31);
        java.lang.Object obj35 = strTokenizer34.clone();
        org.apache.commons.lang.text.StrTokenizer strTokenizer37 = strTokenizer34.setDelimiterString("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder15.appendWithSeparators((java.util.Iterator) strTokenizer37, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder3.append(strBuilder39);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder((int) ' ');
        java.util.Collection collection43 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder42.appendWithSeparators(collection43, "StrTokenizer[not tokenized yet]");
        int int47 = strBuilder45.indexOf(' ');
        int int48 = strBuilder45.capacity();
        boolean boolean49 = strBuilder39.equals(strBuilder45);
        java.lang.String str50 = strBuilder39.getNewLineText();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strMatcher22);
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(strMatcher31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 32 + "'", int48 == 32);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(str50);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
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
        int int18 = strBuilder14.length();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder14.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder14.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder21.replaceFirst('0', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder21.ensureCapacity(29);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder21.append(5);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder28);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.deleteAll("");
        boolean boolean7 = strBuilder5.contains('a');
        java.lang.String str10 = strBuilder5.midString(0, (int) (short) 0);
        int int11 = strBuilder5.capacity();
        java.lang.String str14 = strBuilder5.midString((-1), (int) '#');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder16.deleteAll("");
        java.lang.Object obj21 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.append(obj21);
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher24 = strTokenizer23.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder22.replaceAll(strMatcher24, "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer28 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = strTokenizer28.setIgnoreEmptyTokens(false);
        java.lang.String str31 = strTokenizer30.previousToken();
        java.lang.String[] strArray32 = strTokenizer30.getTokenArray();
        java.util.List list33 = strTokenizer30.getTokenList();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder22.appendWithSeparators((java.util.Collection) list33, "\n");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder5.appendWithSeparators((java.util.Collection) list33, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder39.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder39.deleteAll("");
        java.lang.Object obj44 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder43.append(obj44);
        org.apache.commons.lang.text.StrTokenizer strTokenizer46 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher47 = strTokenizer46.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder45.replaceAll(strMatcher47, "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer51 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer53 = strTokenizer51.setIgnoreEmptyTokens(false);
        java.lang.String str54 = strTokenizer53.previousToken();
        java.lang.String[] strArray55 = strTokenizer53.getTokenArray();
        java.util.List list56 = strTokenizer53.getTokenList();
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder45.appendWithSeparators((java.util.Collection) list56, "\n");
        boolean boolean59 = strBuilder5.equals(strBuilder58);
        // The following exception was thrown during execution in test generation
        try {
            int int62 = strBuilder5.validateRange((-1), 5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertNotNull(strMatcher24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strTokenizer46);
        org.junit.Assert.assertNotNull(strMatcher47);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.apache.commons.lang.text.StrTokenizer strTokenizer0 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher1 = strTokenizer0.getIgnoredMatcher();
        char[] charArray7 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer8 = strTokenizer0.reset(charArray7);
        int int9 = strTokenizer0.size();
        boolean boolean10 = strTokenizer0.hasNext();
        org.apache.commons.lang.text.StrMatcher strMatcher11 = strTokenizer0.getQuoteMatcher();
        java.lang.Object obj12 = strTokenizer0.clone();
        org.apache.commons.lang.text.StrMatcher strMatcher13 = null;
        org.apache.commons.lang.text.StrTokenizer strTokenizer14 = strTokenizer0.setDelimiterMatcher(strMatcher13);
        org.apache.commons.lang.text.StrTokenizer strTokenizer16 = strTokenizer14.setDelimiterChar('i');
        org.junit.Assert.assertNotNull(strTokenizer0);
        org.junit.Assert.assertNotNull(strMatcher1);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strMatcher11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strTokenizer14);
        org.junit.Assert.assertNotNull(strTokenizer16);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
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
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder36.deleteFirst('4');
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder36.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder42.append(29);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder44.replaceFirst("0############", "StrTokenizer[]");
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
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder47);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer4 = strBuilder3.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.insert((int) (short) 1, (int) (short) 100);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader8 = strBuilder7.new StrBuilderReader();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder7.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.setLength(0);
        int int15 = strBuilder14.capacity();
        int int17 = strBuilder14.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder14.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.deleteFirst('#');
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter21 = strBuilder18.new StrBuilderWriter();
        strBuilderWriter21.close();
        strBuilderWriter21.flush();
        strBuilderWriter21.write(10);
        strBuilderWriter21.write((int) (short) 10);
        strBuilderWriter21.write(105);
        strBuilderWriter21.flush();
        strBuilderWriter21.write(1);
        strBuilderWriter21.write("\000\000\000\000");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder7.insert(8, (java.lang.Object) "\000\000\000\000");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 8");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        int int7 = strBuilder1.lastIndexOf(strMatcher5, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader10 = strBuilder9.new StrBuilderReader();
        boolean boolean11 = strBuilderReader10.markSupported();
        strBuilderReader10.mark((int) (byte) 100);
        long long15 = strBuilderReader10.skip((long) (short) 0);
        int int16 = strBuilderReader10.read();
        java.io.Writer writer17 = java.io.Writer.nullWriter();
        java.lang.CharSequence charSequence18 = null;
        java.io.Writer writer21 = writer17.append(charSequence18, (int) '#', (int) (short) 100);
        java.io.Writer writer23 = writer21.append((java.lang.CharSequence) "StrTokenizer[not tokenized yet]");
        java.io.Writer writer25 = writer23.append('#');
        java.io.Writer writer27 = writer25.append(' ');
        long long28 = strBuilderReader10.transferTo(writer25);
        int int29 = strBuilderReader10.read();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 104 + "'", int16 == 104);
        org.junit.Assert.assertNotNull(writer17);
        org.junit.Assert.assertNotNull(writer21);
        org.junit.Assert.assertNotNull(writer23);
        org.junit.Assert.assertNotNull(writer25);
        org.junit.Assert.assertNotNull(writer27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 6L + "'", long28 == 6L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
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
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher25 = strTokenizer24.getIgnoredMatcher();
        char[] charArray31 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = strTokenizer24.reset(charArray31);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder23.appendWithSeparators((java.util.Iterator) strTokenizer24, "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher35 = strTokenizer24.getTrimmerMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder14.deleteFirst(strMatcher35);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder14.append((long) 69);
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
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strMatcher25);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strMatcher35);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder38);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
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
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder36.deleteFirst('4');
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder36.append(false);
        org.apache.commons.lang.text.StrTokenizer strTokenizer44 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder46.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer49 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher50 = strTokenizer49.getIgnoredMatcher();
        int int52 = strBuilder46.lastIndexOf(strMatcher50, 100);
        org.apache.commons.lang.text.StrTokenizer strTokenizer53 = strTokenizer44.setQuoteMatcher(strMatcher50);
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder36.deleteFirst(strMatcher50);
        int int56 = strBuilder36.indexOf("h!   !i!#");
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder36.appendNull();
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
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strTokenizer44);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strTokenizer49);
        org.junit.Assert.assertNotNull(strMatcher50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(strBuilder57);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder((int) 'a');
        char[] charArray3 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.insert(0, charArray3);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((long) 100);
        char char9 = strBuilder5.charAt(2);
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer10 = strBuilder5.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder5.replaceFirst('!', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder13.reverse();
        int int17 = strBuilder14.lastIndexOf("hi!4   4", (int) (byte) 10);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '0' + "'", char9 == '0');
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.append(stringBuffer2, (-1), (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.reverse();
        org.apache.commons.lang.text.StrTokenizer strTokenizer7 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher8 = strTokenizer7.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer9 = strTokenizer7.reset();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer14 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher15 = strTokenizer14.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder11.deleteAll(strMatcher15);
        org.apache.commons.lang.text.StrTokenizer strTokenizer17 = strTokenizer9.setTrimmerMatcher(strMatcher15);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder6.replace(strMatcher15, " ", (int) (short) 1, 1, 1);
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = strBuilder6.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder(104);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer31 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        java.lang.Object obj32 = strTokenizer31.clone();
        int int33 = strTokenizer31.size();
        org.apache.commons.lang.text.StrMatcher strMatcher34 = strTokenizer31.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder29.replaceFirst(strMatcher34, "4   4");
        int int37 = strBuilder29.length();
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder29.append((long) (byte) 0);
        boolean boolean41 = strBuilder39.endsWith("4   4");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder39.append(true);
        char[] charArray44 = strBuilder43.buffer;
        char[] charArray45 = strBuilder27.getChars(charArray44);
        // The following exception was thrown during execution in test generation
        try {
            strBuilder6.getChars((int) (byte) 10, 4, charArray44, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 4");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertNotNull(strMatcher8);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strTokenizer14);
        org.junit.Assert.assertNotNull(strMatcher15);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(strMatcher34);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertNotNull(charArray45);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        int int4 = strBuilder3.capacity();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.appendPadding((int) (short) 100, ' ');
        int int11 = strBuilder10.length();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
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
        java.lang.String str21 = strTokenizer20.toString();
        boolean boolean22 = strTokenizer20.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder26.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder26.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder24.appendFixedWidthPadRight((java.lang.Object) strBuilder30, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer34 = strBuilder24.asTokenizer();
        int int36 = strBuilder24.indexOf("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder38.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer41 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher42 = strTokenizer41.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder38.deleteAll(strMatcher42);
        java.lang.StringBuffer stringBuffer44 = strBuilder43.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder24.append(stringBuffer44);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader46 = strBuilder24.new StrBuilderReader();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder48.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer51 = strBuilder50.new StrBuilderTokenizer();
        char[] charArray52 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer53 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray52);
        java.util.List list56 = strBuilderTokenizer51.tokenize(charArray52, (int) (short) -1, (int) '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer57 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray52);
        org.apache.commons.lang.text.StrTokenizer strTokenizer58 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray52);
        int int59 = strBuilderReader46.read(charArray52);
        org.apache.commons.lang.text.StrTokenizer strTokenizer60 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray52);
        org.apache.commons.lang.text.StrBuilder strBuilder62 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder62.setLength(0);
        java.io.Writer writer65 = strBuilder64.asWriter();
        org.apache.commons.lang.text.StrTokenizer strTokenizer66 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher67 = strTokenizer66.getIgnoredMatcher();
        int int68 = strBuilder64.indexOf(strMatcher67);
        org.apache.commons.lang.text.StrTokenizer strTokenizer69 = strTokenizer60.setTrimmerMatcher(strMatcher67);
        org.apache.commons.lang.text.StrTokenizer strTokenizer70 = strTokenizer20.setQuoteMatcher(strMatcher67);
        int int71 = strTokenizer70.previousIndex();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str21, "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strTokenizer41);
        org.junit.Assert.assertNotNull(strMatcher42);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(stringBuffer44);
        org.junit.Assert.assertEquals(stringBuffer44.toString(), "");
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertArrayEquals(charArray52, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertNotNull(strTokenizer57);
        org.junit.Assert.assertNotNull(strTokenizer58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(strTokenizer60);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(writer65);
        org.junit.Assert.assertNotNull(strTokenizer66);
        org.junit.Assert.assertNotNull(strMatcher67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer69);
        org.junit.Assert.assertNotNull(strTokenizer70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
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
        org.apache.commons.lang.text.StrMatcher strMatcher19 = strTokenizer17.getDelimiterMatcher();
        int int20 = strTokenizer17.size();
        org.apache.commons.lang.text.StrMatcher strMatcher21 = strTokenizer17.getDelimiterMatcher();
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
        org.junit.Assert.assertNotNull(strMatcher19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(strMatcher21);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
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
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer23 = strBuilder14.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer28 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher29 = strTokenizer28.getIgnoredMatcher();
        int int31 = strBuilder25.lastIndexOf(strMatcher29, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder25.insert((int) (byte) 1, (int) '4');
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder34.appendNewLine();
        char[] charArray36 = strBuilder35.buffer;
        java.util.List list39 = strBuilderTokenizer23.tokenize(charArray36, 13, (int) (byte) 1);
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
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertNotNull(list39);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        java.lang.Object obj6 = strTokenizer5.clone();
        int int7 = strTokenizer5.size();
        org.apache.commons.lang.text.StrMatcher strMatcher8 = strTokenizer5.getIgnoredMatcher();
        int int10 = strBuilder3.indexOf(strMatcher8, 10);
        java.io.Writer writer11 = strBuilder3.asWriter();
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher13 = strTokenizer12.getIgnoredMatcher();
        char[] charArray19 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = strTokenizer12.reset(charArray19);
        org.apache.commons.lang.text.StrTokenizer strTokenizer21 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray19);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.setLength(0);
        java.io.Writer writer26 = strBuilder25.asWriter();
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher28 = strTokenizer27.getIgnoredMatcher();
        int int29 = strBuilder25.indexOf(strMatcher28);
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = strTokenizer21.setDelimiterMatcher(strMatcher28);
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = strTokenizer30.setEmptyTokenAsNull(true);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder3.appendWithSeparators((java.util.Iterator) strTokenizer32, "4   4");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer35 = strBuilder3.new StrBuilderTokenizer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder3.insert(24, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 24");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strMatcher8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(writer11);
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strMatcher13);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(writer26);
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertNotNull(strMatcher28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(strBuilder34);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
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
        strBuilderWriter10.write("");
        strBuilderWriter10.write(32);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer4 = strBuilder3.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.replaceAll('a', '4');
        java.lang.String str10 = strBuilder7.substring(0, 0);
        strBuilder7.size = 10;
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer15 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder14.append(stringBuffer15, (-1), (int) ' ');
        char[] charArray19 = strBuilder18.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder7.append((java.lang.Object) charArray19);
        java.lang.String str22 = strBuilder7.rightString(33);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder7.append((float) 0);
        java.lang.String str25 = strBuilder7.getNewLineText();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder27.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer30 = strBuilder29.new StrBuilderTokenizer();
        int int33 = strBuilder29.indexOf("StrTokenizer[not tokenized yet]", (int) (short) 1);
        java.io.Writer writer34 = strBuilder29.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.setLength(0);
        int int39 = strBuilder38.capacity();
        char[] charArray40 = strBuilder38.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder29.append(charArray40);
        char[] charArray42 = strBuilder7.getChars(charArray40);
        org.apache.commons.lang.text.StrTokenizer strTokenizer43 = strBuilder7.asTokenizer();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(writer34);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] {});
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(charArray42);
// flaky "2) test2673(org.apache.commons.lang.text.RegressionTest5)":         org.junit.Assert.assertArrayEquals(charArray42, new char[] { 'h', 'i', '!', '\000', '\000', '\000', '\000', '\000', '\000', '\000', '[', 'C', '@', '2', 'f', 'a', 'd', '6', 'b', 'd', 'a', '0', '.', '0' });
        org.junit.Assert.assertNotNull(strTokenizer43);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        char[] charArray11 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strTokenizer4.reset(charArray11);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.appendWithSeparators((java.util.Iterator) strTokenizer4, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.replaceAll('#', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder14.setCharAt((int) (byte) 1, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder14.append((long) (short) 1);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
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
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer22 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher23 = strTokenizer22.getIgnoredMatcher();
        char[] charArray29 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = strTokenizer22.reset(charArray29);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder21.appendWithSeparators((java.util.Iterator) strTokenizer22, "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer33 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list34 = strTokenizer33.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher36 = strTokenizer35.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer37 = strTokenizer33.setDelimiterMatcher(strMatcher36);
        int int39 = strBuilder21.lastIndexOf(strMatcher36, (int) (byte) 0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer40 = strTokenizer1.setIgnoredMatcher(strMatcher36);
        org.apache.commons.lang.text.StrTokenizer strTokenizer42 = strTokenizer1.setEmptyTokenAsNull(true);
        org.apache.commons.lang.text.StrMatcher strMatcher43 = strTokenizer42.getQuoteMatcher();
        int int44 = strTokenizer42.nextIndex();
        org.apache.commons.lang.text.StrTokenizer strTokenizer45 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher46 = strTokenizer45.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer47 = strTokenizer45.reset();
        org.apache.commons.lang.text.StrTokenizer strTokenizer49 = strTokenizer47.setQuoteChar('a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer51 = strTokenizer49.setIgnoreEmptyTokens(true);
        org.apache.commons.lang.text.StrMatcher strMatcher52 = strTokenizer49.getTrimmerMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer53 = strTokenizer42.setDelimiterMatcher(strMatcher52);
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
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strTokenizer22);
        org.junit.Assert.assertNotNull(strMatcher23);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strTokenizer33);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertNotNull(strMatcher36);
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertNotNull(strMatcher43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(strTokenizer45);
        org.junit.Assert.assertNotNull(strMatcher46);
        org.junit.Assert.assertNotNull(strTokenizer47);
        org.junit.Assert.assertNotNull(strTokenizer49);
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(strMatcher52);
        org.junit.Assert.assertNotNull(strTokenizer53);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
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
        boolean boolean38 = strBuilder36.contains('#');
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder36.append((double) '!');
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder44.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder44.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder42.appendFixedWidthPadRight((java.lang.Object) strBuilder48, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer52 = strBuilder42.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder54 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder54.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer57 = strBuilder56.new StrBuilderTokenizer();
        java.io.Reader reader58 = java.io.Reader.nullReader();
        char[] charArray59 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer60 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray59);
        int int61 = reader58.read(charArray59);
        java.util.List list64 = strBuilderTokenizer57.tokenize(charArray59, (int) (short) 100, 100);
        org.apache.commons.lang.text.StrTokenizer strTokenizer65 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher66 = strTokenizer65.getIgnoredMatcher();
        char[] charArray72 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer73 = strTokenizer65.reset(charArray72);
        java.util.List list76 = strBuilderTokenizer57.tokenize(charArray72, 100, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder42.append((java.lang.Object) list76);
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder36.append(strBuilder42);
        int int79 = strBuilder42.size();
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strTokenizer52);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(reader58);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertArrayEquals(charArray59, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(list64);
        org.junit.Assert.assertNotNull(strTokenizer65);
        org.junit.Assert.assertNotNull(strMatcher66);
        org.junit.Assert.assertNotNull(charArray72);
        org.junit.Assert.assertArrayEquals(charArray72, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer73);
        org.junit.Assert.assertNotNull(list76);
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 5 + "'", int79 == 5);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.append(stringBuffer2, (-1), (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.reverse();
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.append(stringBuffer7);
        java.lang.String str10 = strBuilder8.leftString(33);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder8.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.appendPadding(35, ' ');
        java.io.Reader reader16 = strBuilder15.asReader();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder15.replaceAll('4', '0');
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "!ih" + "'", str10, "!ih");
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(reader16);
        org.junit.Assert.assertNotNull(strBuilder19);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst("i!", "hi!");
        java.lang.String str5 = strBuilder0.leftString((-1));
        java.lang.String str6 = strBuilder0.getNewLineText();
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter7 = strBuilder0.new StrBuilderWriter();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
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
        java.io.Reader reader11 = strBuilder7.asReader();
        boolean boolean13 = strBuilder7.startsWith("a");
        java.io.Reader reader14 = strBuilder7.asReader();
        boolean boolean16 = strBuilder7.contains("#####");
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(reader14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
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
        int int34 = strBuilder8.length();
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder8.deleteCharAt((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder36.insert((int) (short) 100, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 38 + "'", int34 == 38);
        org.junit.Assert.assertNotNull(strBuilder36);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        boolean boolean2 = strBuilder1.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.deleteAll('#');
        int int6 = strBuilder1.size();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.deleteFirst('0');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        int int4 = strBuilder3.capacity();
        int int6 = strBuilder3.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.trim();
        java.lang.String str9 = strBuilder7.rightString((-1));
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder13.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder11.appendFixedWidthPadRight((java.lang.Object) strBuilder17, 0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder17.append(0L);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.deleteFirst('#');
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder7.append(strBuilder24);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder27.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher31 = strTokenizer30.getIgnoredMatcher();
        int int33 = strBuilder27.lastIndexOf(strMatcher31, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder27.append(true);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader36 = strBuilder35.new StrBuilderReader();
        boolean boolean37 = strBuilderReader36.markSupported();
        strBuilderReader36.mark((int) (byte) 100);
        java.io.Writer writer40 = java.io.Writer.nullWriter();
        long long41 = strBuilderReader36.transferTo(writer40);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder7.append((java.lang.Object) writer40);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder42.replaceFirst('a', 'a');
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
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder60.trim();
        java.lang.String str71 = strBuilder69.rightString((int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer72 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher73 = strTokenizer72.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer74 = strTokenizer72.reset();
        org.apache.commons.lang.text.StrBuilder strBuilder76 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder76.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer79 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher80 = strTokenizer79.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder76.deleteAll(strMatcher80);
        org.apache.commons.lang.text.StrTokenizer strTokenizer82 = strTokenizer74.setTrimmerMatcher(strMatcher80);
        boolean boolean83 = strTokenizer82.isIgnoreEmptyTokens();
        int int84 = strTokenizer82.size();
        org.apache.commons.lang.text.StrMatcher strMatcher85 = strTokenizer82.getDelimiterMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder87 = strBuilder69.replaceFirst(strMatcher85, "StrTokenizer[not tokenized yet]");
        boolean boolean88 = strBuilder45.contains(strMatcher85);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(strMatcher31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(writer40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 7L + "'", long41 == 7L);
        org.junit.Assert.assertNotNull(strBuilder42);
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
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "\n" + "'", str63, "\n");
        org.junit.Assert.assertNotNull(strTokenizer65);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertEquals(obj66.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj66), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj66), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "0" + "'", str71, "0");
        org.junit.Assert.assertNotNull(strTokenizer72);
        org.junit.Assert.assertNotNull(strMatcher73);
        org.junit.Assert.assertNotNull(strTokenizer74);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNotNull(strTokenizer79);
        org.junit.Assert.assertNotNull(strMatcher80);
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertNotNull(strTokenizer82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertNotNull(strMatcher85);
        org.junit.Assert.assertNotNull(strBuilder87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.append(stringBuffer2, (-1), (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.reverse();
        org.apache.commons.lang.text.StrTokenizer strTokenizer7 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher8 = strTokenizer7.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer9 = strTokenizer7.reset();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer14 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher15 = strTokenizer14.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder11.deleteAll(strMatcher15);
        org.apache.commons.lang.text.StrTokenizer strTokenizer17 = strTokenizer9.setTrimmerMatcher(strMatcher15);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder6.replace(strMatcher15, " ", (int) (short) 1, 1, 1);
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = strBuilder6.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder6.append(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder28.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer31 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher32 = strTokenizer31.getIgnoredMatcher();
        char[] charArray38 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer39 = strTokenizer31.reset(charArray38);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder30.appendWithSeparators((java.util.Iterator) strTokenizer31, "hi!");
        int int43 = strBuilder41.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder41.insert((int) (short) 1, "StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder46.append((double) (short) -1);
        char[] charArray49 = strBuilder48.buffer;
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder25.insert(3, charArray49, 8, (int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder25.replaceAll('!', 'i');
        int int56 = strBuilder25.size;
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertNotNull(strMatcher8);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strTokenizer14);
        org.junit.Assert.assertNotNull(strMatcher15);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(strMatcher32);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer39);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 4 + "'", int56 == 4);
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
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter10 = strBuilder7.new StrBuilderWriter();
        strBuilderWriter10.close();
        strBuilderWriter10.flush();
        strBuilderWriter10.write(10);
        strBuilderWriter10.write("");
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
        strBuilderWriter10.write(charArray39);
        strBuilderWriter10.flush();
        org.apache.commons.lang.text.StrBuilder strBuilder45 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder45.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer48 = strBuilder47.new StrBuilderTokenizer();
        java.io.Reader reader49 = java.io.Reader.nullReader();
        char[] charArray50 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer51 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray50);
        int int52 = reader49.read(charArray50);
        java.util.List list55 = strBuilderTokenizer48.tokenize(charArray50, (int) (short) 100, 100);
        strBuilderWriter10.write(charArray50);
        org.apache.commons.lang.text.StrTokenizer strTokenizer57 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray50);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
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
        org.junit.Assert.assertNotNull(reader49);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertArrayEquals(charArray50, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertNotNull(strTokenizer57);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        java.lang.Object obj6 = strTokenizer5.clone();
        int int7 = strTokenizer5.size();
        org.apache.commons.lang.text.StrMatcher strMatcher8 = strTokenizer5.getIgnoredMatcher();
        int int10 = strBuilder3.indexOf(strMatcher8, 10);
        java.io.Writer writer11 = strBuilder3.asWriter();
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher13 = strTokenizer12.getIgnoredMatcher();
        char[] charArray19 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = strTokenizer12.reset(charArray19);
        org.apache.commons.lang.text.StrTokenizer strTokenizer21 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray19);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.setLength(0);
        java.io.Writer writer26 = strBuilder25.asWriter();
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher28 = strTokenizer27.getIgnoredMatcher();
        int int29 = strBuilder25.indexOf(strMatcher28);
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = strTokenizer21.setDelimiterMatcher(strMatcher28);
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = strTokenizer30.setEmptyTokenAsNull(true);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder3.appendWithSeparators((java.util.Iterator) strTokenizer32, "4   4");
        boolean boolean35 = strTokenizer32.isIgnoreEmptyTokens();
        org.apache.commons.lang.text.StrTokenizer strTokenizer37 = strTokenizer32.reset("44");
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strMatcher8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(writer11);
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strMatcher13);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(writer26);
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertNotNull(strMatcher28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strTokenizer37);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
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
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher24 = strTokenizer23.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder20.deleteAll(strMatcher24);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder16.appendFixedWidthPadRight((java.lang.Object) strBuilder25, 105, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder16.insert(29, 32);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder31.appendNewLine();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertNotNull(strMatcher24);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder32);
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
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = strBuilder1.asTokenizer();
        int int13 = strBuilder1.lastIndexOf("hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer15 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher16 = strTokenizer15.getIgnoredMatcher();
        char[] charArray22 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = strTokenizer15.reset(charArray22);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder1.insert((int) (byte) 1, charArray22);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder26.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer29 = strBuilder28.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrTokenizer strTokenizer31 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder28.appendFixedWidthPadLeft((java.lang.Object) "", (int) (short) 1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.deleteFirst("");
        char[] charArray39 = null;
        char[] charArray40 = strBuilder36.getChars(charArray39);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder34.append(charArray40);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder41.ensureCapacity(33);
        org.apache.commons.lang.text.StrTokenizer strTokenizer45 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder47.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder49.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer53 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list54 = strTokenizer53.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer55 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher56 = strTokenizer55.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer57 = strTokenizer53.setDelimiterMatcher(strMatcher56);
        int int59 = strBuilder52.indexOf(strMatcher56, (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer60 = strTokenizer45.setIgnoredMatcher(strMatcher56);
        java.lang.String str61 = strTokenizer45.previousToken();
        org.apache.commons.lang.text.StrBuilder strBuilder63 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder63.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer66 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher67 = strTokenizer66.getIgnoredMatcher();
        char[] charArray73 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer74 = strTokenizer66.reset(charArray73);
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder65.appendWithSeparators((java.util.Iterator) strTokenizer66, "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer77 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list78 = strTokenizer77.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer79 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher80 = strTokenizer79.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer81 = strTokenizer77.setDelimiterMatcher(strMatcher80);
        int int83 = strBuilder65.lastIndexOf(strMatcher80, (int) (byte) 0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer84 = strTokenizer45.setIgnoredMatcher(strMatcher80);
        org.apache.commons.lang.text.StrTokenizer strTokenizer86 = strTokenizer45.setEmptyTokenAsNull(true);
        org.apache.commons.lang.text.StrMatcher strMatcher87 = strTokenizer86.getQuoteMatcher();
        int int88 = strBuilder43.indexOf(strMatcher87);
        int int89 = strBuilder1.indexOf(strMatcher87);
        java.lang.String str90 = strBuilder1.getNewLineText();
        org.apache.commons.lang.text.StrBuilder strBuilder93 = strBuilder1.insert(0, '0');
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
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strTokenizer45);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertNotNull(strMatcher56);
        org.junit.Assert.assertNotNull(strTokenizer57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer60);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strTokenizer66);
        org.junit.Assert.assertNotNull(strMatcher67);
        org.junit.Assert.assertNotNull(charArray73);
        org.junit.Assert.assertArrayEquals(charArray73, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer74);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(strTokenizer77);
        org.junit.Assert.assertNotNull(list78);
        org.junit.Assert.assertNotNull(strTokenizer79);
        org.junit.Assert.assertNotNull(strMatcher80);
        org.junit.Assert.assertNotNull(strTokenizer81);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer84);
        org.junit.Assert.assertNotNull(strTokenizer86);
        org.junit.Assert.assertNotNull(strMatcher87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertNull(str90);
        org.junit.Assert.assertNotNull(strBuilder93);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        int int4 = strBuilder3.capacity();
        int int6 = strBuilder3.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.trim();
        java.lang.String str9 = strBuilder7.rightString((-1));
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder7.append((float) 27);
        java.lang.Class<?> wildcardClass12 = strBuilder11.getClass();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.append((double) 1.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder3.appendPadding((int) '#', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder8.appendFixedWidthPadLeft((int) ' ', 0, '#');
        char[] charArray13 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer14 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray13);
        boolean boolean15 = strTokenizer14.isIgnoreEmptyTokens();
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder8.appendWithSeparators((java.util.Iterator) strTokenizer14, "");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder8.deleteFirst("StrTokenizer[not tokenized yet]");
        java.lang.Class<?> wildcardClass20 = strBuilder19.getClass();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
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
        boolean boolean14 = strBuilderReader10.ready();
        strBuilderReader10.close();
        strBuilderReader10.reset();
        strBuilderReader10.close();
        strBuilderReader10.mark(69);
        strBuilderReader10.mark(0);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 104 + "'", int12 == 104);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer4 = strBuilder3.new StrBuilderTokenizer();
        java.io.Reader reader5 = java.io.Reader.nullReader();
        char[] charArray6 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer7 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray6);
        int int8 = reader5.read(charArray6);
        java.util.List list11 = strBuilderTokenizer4.tokenize(charArray6, (int) (short) 100, 100);
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher13 = strTokenizer12.getIgnoredMatcher();
        char[] charArray19 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = strTokenizer12.reset(charArray19);
        java.util.List list23 = strBuilderTokenizer4.tokenize(charArray19, 100, 0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer25 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = strTokenizer25.setIgnoredChar('4');
        char[] charArray28 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray28);
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list31 = strTokenizer30.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher33 = strTokenizer32.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer34 = strTokenizer30.setDelimiterMatcher(strMatcher33);
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = strTokenizer29.setQuoteMatcher(strMatcher33);
        java.lang.String[] strArray36 = strTokenizer29.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder38.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer41 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher42 = strTokenizer41.getIgnoredMatcher();
        int int44 = strBuilder38.lastIndexOf(strMatcher42, 100);
        org.apache.commons.lang.text.StrTokenizer strTokenizer45 = strTokenizer29.setIgnoredMatcher(strMatcher42);
        org.apache.commons.lang.text.StrTokenizer strTokenizer46 = strTokenizer25.setDelimiterMatcher(strMatcher42);
        org.apache.commons.lang.text.StrTokenizer strTokenizer47 = strBuilderTokenizer4.setIgnoredMatcher(strMatcher42);
        boolean boolean48 = strBuilderTokenizer4.isIgnoreEmptyTokens();
        org.apache.commons.lang.text.StrTokenizer strTokenizer50 = strBuilderTokenizer4.setDelimiterString("hi!800000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(reader5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strMatcher13);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertNotNull(strTokenizer27);
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
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strTokenizer41);
        org.junit.Assert.assertNotNull(strMatcher42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer45);
        org.junit.Assert.assertNotNull(strTokenizer46);
        org.junit.Assert.assertNotNull(strTokenizer47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(strTokenizer50);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer3 = strTokenizer1.setIgnoreEmptyTokens(false);
        int int4 = strTokenizer1.size();
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertNotNull(strTokenizer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        char[] charArray11 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strTokenizer4.reset(charArray11);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.appendWithSeparators((java.util.Iterator) strTokenizer4, "hi!");
        int int17 = strBuilder14.indexOf('#', (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder21.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder19.appendFixedWidthPadRight((java.lang.Object) strBuilder25, 0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder25.append(0L);
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder34.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder36.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer40 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list41 = strTokenizer40.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer42 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher43 = strTokenizer42.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer44 = strTokenizer40.setDelimiterMatcher(strMatcher43);
        int int46 = strBuilder39.indexOf(strMatcher43, (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer47 = strTokenizer32.setIgnoredMatcher(strMatcher43);
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder30.replaceAll(strMatcher43, "4   4");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder14.append((java.lang.Object) strMatcher43);
        org.apache.commons.lang.text.StrTokenizer strTokenizer51 = strBuilder50.asTokenizer();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertNotNull(strMatcher43);
        org.junit.Assert.assertNotNull(strTokenizer44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer47);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strTokenizer51);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder((int) 'a');
        char[] charArray3 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.insert(0, charArray3);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((long) 100);
        char char9 = strBuilder5.charAt(2);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder5.reverse();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '0' + "'", char9 == '0');
        org.junit.Assert.assertNotNull(strBuilder10);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
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
        java.lang.String str18 = strBuilder16.rightString((int) (short) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("hi!");
        boolean boolean21 = strBuilder20.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder20.deleteAll('#');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder26.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher30 = strTokenizer29.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder26.deleteAll(strMatcher30);
        java.lang.StringBuffer stringBuffer32 = strBuilder31.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder24.append(stringBuffer32);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder39.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder39.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder37.appendFixedWidthPadRight((java.lang.Object) strBuilder43, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer47 = strBuilder37.asTokenizer();
        int int49 = strBuilder37.lastIndexOf("hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer51 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher52 = strTokenizer51.getIgnoredMatcher();
        char[] charArray58 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer59 = strTokenizer51.reset(charArray58);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder37.insert((int) (byte) 1, charArray58);
        strBuilder33.getChars((int) (short) 0, 0, charArray58, (int) (short) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder64 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder64.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer67 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher68 = strTokenizer67.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder64.deleteAll(strMatcher68);
        int int71 = strBuilder33.indexOf(strMatcher68, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder16.replaceAll(strMatcher68, "hi!truehi!");
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertNotNull(strMatcher12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strMatcher30);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(stringBuffer32);
        org.junit.Assert.assertEquals(stringBuffer32.toString(), "");
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strTokenizer47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(strMatcher52);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertArrayEquals(charArray58, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer59);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strTokenizer67);
        org.junit.Assert.assertNotNull(strMatcher68);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(strBuilder73);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
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
        int int26 = strBuilder24.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder24.insert(0, (double) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder24.replaceFirst(' ', '!');
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder24.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder33.deleteFirst('a');
        // The following exception was thrown during execution in test generation
        try {
            char char37 = strBuilder33.charAt(13);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 13");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder35);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        java.lang.Object obj6 = strTokenizer5.clone();
        int int7 = strTokenizer5.size();
        org.apache.commons.lang.text.StrMatcher strMatcher8 = strTokenizer5.getIgnoredMatcher();
        int int10 = strBuilder3.indexOf(strMatcher8, 10);
        java.io.Writer writer11 = strBuilder3.asWriter();
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher13 = strTokenizer12.getIgnoredMatcher();
        char[] charArray19 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = strTokenizer12.reset(charArray19);
        org.apache.commons.lang.text.StrTokenizer strTokenizer21 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray19);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.setLength(0);
        java.io.Writer writer26 = strBuilder25.asWriter();
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher28 = strTokenizer27.getIgnoredMatcher();
        int int29 = strBuilder25.indexOf(strMatcher28);
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = strTokenizer21.setDelimiterMatcher(strMatcher28);
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = strTokenizer30.setEmptyTokenAsNull(true);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder3.appendWithSeparators((java.util.Iterator) strTokenizer32, "4   4");
        boolean boolean35 = strTokenizer32.isIgnoreEmptyTokens();
        org.apache.commons.lang.text.StrTokenizer strTokenizer37 = strTokenizer32.setQuoteChar('i');
        org.apache.commons.lang.text.StrTokenizer strTokenizer38 = strTokenizer32.reset();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strMatcher8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(writer11);
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strMatcher13);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(writer26);
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertNotNull(strMatcher28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertNotNull(strTokenizer38);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) strBuilder7, 0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder7.append(0L);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder7.setNullText("StrTokenizer[not tokenized yet]");
        java.lang.String str16 = strBuilder7.rightString(10);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder19.deleteAll("");
        java.lang.Object obj24 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.append(obj24);
        org.apache.commons.lang.text.StrTokenizer strTokenizer26 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher27 = strTokenizer26.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder25.replaceAll(strMatcher27, "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer31 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer33 = strTokenizer31.setIgnoreEmptyTokens(false);
        java.lang.String str34 = strTokenizer33.previousToken();
        java.lang.String[] strArray35 = strTokenizer33.getTokenArray();
        java.util.List list36 = strTokenizer33.getTokenList();
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder25.appendWithSeparators((java.util.Collection) list36, "\n");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder40.setLength(0);
        java.io.Writer writer43 = strBuilder42.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder45 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder47.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder47.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder45.appendFixedWidthPadRight((java.lang.Object) strBuilder51, 0, 'a');
        int int56 = strBuilder51.lastIndexOf("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder42.appendFixedWidthPadRight((java.lang.Object) strBuilder51, (int) (byte) 10, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder51.appendFixedWidthPadLeft((int) (short) 0, (int) (short) 10, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder65 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder65.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder67.appendFixedWidthPadLeft(0, (int) (byte) -1, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder67.replaceFirst("StrTokenizer[not tokenized yet]", "StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder74.setNewLineText("i!");
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder51.append(strBuilder74);
        char[] charArray78 = strBuilder51.toCharArray();
        char[] charArray79 = strBuilder25.getChars(charArray78);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder7.insert((-1), charArray78);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!0" + "'", str16, "hi!0");
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertNotNull(strMatcher27);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(strTokenizer33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(writer43);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNotNull(charArray78);
        org.junit.Assert.assertArrayEquals(charArray78, new char[] { 'h', 'i', '!', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', '0' });
        org.junit.Assert.assertNotNull(charArray79);
        org.junit.Assert.assertArrayEquals(charArray79, new char[] { 'h', 'i', '!', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', '0' });
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        org.apache.commons.lang.text.StrTokenizer strTokenizer0 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher1 = strTokenizer0.getIgnoredMatcher();
        char[] charArray7 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer8 = strTokenizer0.reset(charArray7);
        java.lang.String[] strArray9 = strTokenizer8.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder13.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer17 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list18 = strTokenizer17.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer19 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher20 = strTokenizer19.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer21 = strTokenizer17.setDelimiterMatcher(strMatcher20);
        int int23 = strBuilder16.indexOf(strMatcher20, (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = strTokenizer8.setTrimmerMatcher(strMatcher20);
        org.apache.commons.lang.text.StrTokenizer strTokenizer26 = strTokenizer24.setEmptyTokenAsNull(false);
        int int27 = strTokenizer26.nextIndex();
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = strTokenizer26.setQuoteChar(' ');
        org.junit.Assert.assertNotNull(strTokenizer0);
        org.junit.Assert.assertNotNull(strMatcher1);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "4   4" });
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(strMatcher20);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(strTokenizer29);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer4 = strBuilder3.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list6 = strTokenizer5.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer7 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher8 = strTokenizer7.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer9 = strTokenizer5.setDelimiterMatcher(strMatcher8);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder3.deleteAll(strMatcher8);
        boolean boolean12 = strBuilder10.endsWith("StrTokenizer[]");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder16.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder14.appendFixedWidthPadRight((java.lang.Object) strBuilder20, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = strBuilder14.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder14.setCharAt((int) (short) 1, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder31.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder33.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer37 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list38 = strTokenizer37.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer39 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher40 = strTokenizer39.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer41 = strTokenizer37.setDelimiterMatcher(strMatcher40);
        int int43 = strBuilder36.indexOf(strMatcher40, (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer44 = strTokenizer29.setIgnoredMatcher(strMatcher40);
        java.lang.String str45 = strTokenizer29.previousToken();
        int int46 = strTokenizer29.previousIndex();
        java.lang.String[] strArray47 = strTokenizer29.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder27.appendWithSeparators((java.lang.Object[]) strArray47, "4444444444");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder10.append(strBuilder49);
        int int53 = strBuilder50.indexOf('a', 5);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertNotNull(strMatcher8);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNotNull(strTokenizer39);
        org.junit.Assert.assertNotNull(strMatcher40);
        org.junit.Assert.assertNotNull(strTokenizer41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
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
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder26.append((double) '#');
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder28.append(0);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.setNewLineText("444444444444444444444444444444444");
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
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        char[] charArray11 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strTokenizer4.reset(charArray11);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.appendWithSeparators((java.util.Iterator) strTokenizer4, "hi!");
        int int17 = strBuilder14.indexOf('#', (int) (byte) -1);
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.setLength(0);
        int int23 = strBuilder22.capacity();
        int int25 = strBuilder22.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder22.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder26.deleteFirst('#');
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer31 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder30.append(stringBuffer31, (-1), (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer39 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher40 = strTokenizer39.getIgnoredMatcher();
        char[] charArray46 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer47 = strTokenizer39.reset(charArray46);
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder38.appendWithSeparators((java.util.Iterator) strTokenizer39, "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer50 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher51 = strTokenizer50.getIgnoredMatcher();
        int int52 = strBuilder49.indexOf(strMatcher51);
        int int54 = strBuilder34.lastIndexOf(strMatcher51, (int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder26.deleteFirst(strMatcher51);
        org.apache.commons.lang.text.StrTokenizer strTokenizer56 = strTokenizer18.setDelimiterMatcher(strMatcher51);
        int int57 = strBuilder14.lastIndexOf(strMatcher51);
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder14.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder14.delete((int) (byte) 0, (int) (short) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder14.setNullText("");
        java.io.Reader reader64 = strBuilder14.asReader();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder14.insert(4, "hi!4   4");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 4");
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strTokenizer39);
        org.junit.Assert.assertNotNull(strMatcher40);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertArrayEquals(charArray46, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer47);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strTokenizer50);
        org.junit.Assert.assertNotNull(strMatcher51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strTokenizer56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(reader64);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder((int) 'a');
        java.lang.String str2 = strBuilder1.getNewLineText();
        int int3 = strBuilder1.size();
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.ensureCapacity(35);
        boolean boolean7 = strBuilder5.contains("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.append(stringBuffer2, (-1), (int) ' ');
        int int7 = strBuilder1.indexOf("StrTokenizer[not tokenized yet]");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.delete((int) '0', 19);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
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
        strBuilderWriter10.write(105);
        strBuilderWriter10.flush();
        strBuilderWriter10.write(32);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) strBuilder7, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = strBuilder1.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder1.setCharAt((int) (short) 1, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder1.insert((int) (short) 1, (long) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder1.appendFixedWidthPadLeft((int) (short) -1, 40, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer25 = strTokenizer23.setIgnoredChar('4');
        boolean boolean26 = strTokenizer23.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrTokenizer strTokenizer28 = strTokenizer23.setDelimiterString("hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = strTokenizer28.setDelimiterString("a");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder1.append((java.lang.Object) strTokenizer28);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder35.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder35.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder33.appendFixedWidthPadRight((java.lang.Object) strBuilder39, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer43 = strBuilder33.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder33.replaceAll("i!", "4   4");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder33.append((long) 13);
        boolean boolean49 = strBuilder33.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder51 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder51.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder53.append((double) 1.0f);
        int int58 = strBuilder53.lastIndexOf('4', 38);
        org.apache.commons.lang.text.StrTokenizer strTokenizer59 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher60 = strTokenizer59.getIgnoredMatcher();
        char[] charArray66 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer67 = strTokenizer59.reset(charArray66);
        org.apache.commons.lang.text.StrMatcher strMatcher68 = strTokenizer67.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder53.replaceFirst(strMatcher68, "hi!0");
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder33.deleteFirst(strMatcher68);
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder1.replaceFirst(strMatcher68, "hi!\000\000\000\000\000\000\000h52i!4   4");
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strTokenizer43);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer59);
        org.junit.Assert.assertNotNull(strMatcher60);
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertArrayEquals(charArray66, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer67);
        org.junit.Assert.assertNotNull(strMatcher68);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strBuilder73);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.append(stringBuffer2, (-1), (int) ' ');
        char[] charArray6 = strBuilder5.toCharArray();
        org.apache.commons.lang.text.StrTokenizer strTokenizer7 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray6);
        org.apache.commons.lang.text.StrTokenizer strTokenizer8 = strTokenizer7.reset();
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertNotNull(strTokenizer8);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.appendFixedWidthPadLeft(0, (int) (byte) -1, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder3.replaceFirst("StrTokenizer[not tokenized yet]", "StrTokenizer[not tokenized yet]");
        int int12 = strBuilder10.indexOf('#');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder10.ensureCapacity(3);
        org.apache.commons.lang.text.StrTokenizer strTokenizer15 = strBuilder14.asTokenizer();
        org.apache.commons.lang.text.StrTokenizer strTokenizer17 = strTokenizer15.setDelimiterChar('#');
        org.apache.commons.lang.text.StrMatcher strMatcher18 = strTokenizer15.getQuoteMatcher();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strTokenizer15);
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(strMatcher18);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.setLength(38);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((long) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder11.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder9.appendFixedWidthPadRight((java.lang.Object) strBuilder15, 0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder18.appendNull();
        java.lang.String str22 = strBuilder19.substring(0, 3);
        java.lang.StringBuffer stringBuffer23 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder19.append(stringBuffer23, 105, (int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder28.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.append((double) 1.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder30.appendPadding((int) '#', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder30.appendFixedWidthPadLeft((int) (byte) 100, 0, '#');
        java.lang.StringBuffer stringBuffer40 = strBuilder30.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder26.append(stringBuffer40);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder41.replaceAll("a", " ");
        int int47 = strBuilder41.lastIndexOf(' ', (int) (byte) -1);
        char[] charArray50 = strBuilder41.toCharArray((int) (byte) 1, 10);
        boolean boolean51 = strBuilder5.equalsIgnoreCase(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(stringBuffer40);
        org.junit.Assert.assertEquals(stringBuffer40.toString(), "1.0###################################");
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertArrayEquals(charArray50, new char[] { 'i', '!', '1', '.', '0', '#', '#', '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.deleteAll("");
        java.lang.Object obj6 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append(obj6);
        java.lang.String str8 = strBuilder7.getNewLineText();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer13 = strBuilder12.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrMatcher strMatcher14 = strBuilderTokenizer13.getIgnoredMatcher();
        boolean boolean15 = strBuilder7.contains(strMatcher14);
        char char17 = strBuilder7.charAt(0);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strMatcher14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + 'h' + "'", char17 == 'h');
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
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
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer22 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher23 = strTokenizer22.getIgnoredMatcher();
        char[] charArray29 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = strTokenizer22.reset(charArray29);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder21.appendWithSeparators((java.util.Iterator) strTokenizer22, "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer33 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list34 = strTokenizer33.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher36 = strTokenizer35.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer37 = strTokenizer33.setDelimiterMatcher(strMatcher36);
        int int39 = strBuilder21.lastIndexOf(strMatcher36, (int) (byte) 0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer40 = strTokenizer1.setIgnoredMatcher(strMatcher36);
        org.apache.commons.lang.text.StrTokenizer strTokenizer42 = strTokenizer1.setEmptyTokenAsNull(true);
        org.apache.commons.lang.text.StrMatcher strMatcher43 = strTokenizer1.getQuoteMatcher();
        boolean boolean44 = strTokenizer1.hasPrevious();
        org.apache.commons.lang.text.StrTokenizer strTokenizer46 = strTokenizer1.setDelimiterString("hi!0");
        org.apache.commons.lang.text.StrTokenizer strTokenizer48 = strTokenizer1.setEmptyTokenAsNull(true);
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
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strTokenizer22);
        org.junit.Assert.assertNotNull(strMatcher23);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strTokenizer33);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertNotNull(strMatcher36);
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertNotNull(strMatcher43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strTokenizer46);
        org.junit.Assert.assertNotNull(strTokenizer48);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        java.lang.Object obj2 = strTokenizer1.clone();
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = strTokenizer1.setEmptyTokenAsNull(true);
        java.lang.String str5 = strTokenizer1.toString();
        org.apache.commons.lang.text.StrTokenizer strTokenizer7 = strTokenizer1.setDelimiterChar('a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer9 = strTokenizer7.setEmptyTokenAsNull(true);
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = strTokenizer7.setDelimiterChar('a');
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("hi!");
        boolean boolean14 = strBuilder13.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.deleteFirst("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.append((double) 1.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder21.appendPadding((int) '#', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder26.appendFixedWidthPadLeft((int) ' ', 0, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder34.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder36.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer40 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list41 = strTokenizer40.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer42 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher43 = strTokenizer42.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer44 = strTokenizer40.setDelimiterMatcher(strMatcher43);
        int int46 = strBuilder39.indexOf(strMatcher43, (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer47 = strTokenizer32.setIgnoredMatcher(strMatcher43);
        int int49 = strBuilder26.lastIndexOf(strMatcher43, (int) (short) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder15.replaceAll(strMatcher43, "StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrTokenizer strTokenizer52 = strTokenizer11.setDelimiterMatcher(strMatcher43);
        boolean boolean53 = strTokenizer52.isEmptyTokenAsNull();
        org.apache.commons.lang.text.StrMatcher strMatcher54 = strTokenizer52.getQuoteMatcher();
        char[] charArray55 = null;
        org.apache.commons.lang.text.StrTokenizer strTokenizer56 = strTokenizer52.reset(charArray55);
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str5, "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertNotNull(strMatcher43);
        org.junit.Assert.assertNotNull(strTokenizer44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strTokenizer52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(strMatcher54);
        org.junit.Assert.assertNotNull(strTokenizer56);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        int int7 = strBuilder1.lastIndexOf(strMatcher5, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader10 = strBuilder9.new StrBuilderReader();
        boolean boolean11 = strBuilderReader10.markSupported();
        strBuilderReader10.mark((int) (byte) 100);
        long long15 = strBuilderReader10.skip((long) (short) 0);
        int int16 = strBuilderReader10.read();
        strBuilderReader10.mark(8);
        boolean boolean19 = strBuilderReader10.ready();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 104 + "'", int16 == 104);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder3.replaceAll("hi!", "");
        char[] charArray7 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer8 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray7);
        char[] charArray9 = strBuilder3.getChars(charArray7);
        org.apache.commons.lang.text.StrTokenizer strTokenizer10 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray7);
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strTokenizer10.setDelimiterChar('#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = strTokenizer12.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer10);
        org.junit.Assert.assertNotNull(strTokenizer12);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.deleteAll("");
        java.lang.Object obj6 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append(obj6);
        java.lang.String str9 = strBuilder5.substring(1);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder5.appendFixedWidthPadRight(33, 0, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder5.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.append(0);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder17.trim();
        org.apache.commons.lang.text.StrTokenizer strTokenizer19 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher20 = strTokenizer19.getIgnoredMatcher();
        char[] charArray26 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = strTokenizer19.reset(charArray26);
        org.apache.commons.lang.text.StrTokenizer strTokenizer28 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher29 = strTokenizer28.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = strTokenizer28.reset();
        org.apache.commons.lang.text.StrBuilder strBuilder32 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder32.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher36 = strTokenizer35.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder32.deleteAll(strMatcher36);
        org.apache.commons.lang.text.StrTokenizer strTokenizer38 = strTokenizer30.setTrimmerMatcher(strMatcher36);
        org.apache.commons.lang.text.StrTokenizer strTokenizer40 = strTokenizer30.reset("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer43 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder42.append(stringBuffer43, (-1), (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder42.reverse();
        org.apache.commons.lang.text.StrTokenizer strTokenizer48 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher49 = strTokenizer48.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer50 = strTokenizer48.reset();
        org.apache.commons.lang.text.StrBuilder strBuilder52 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder52.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer55 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher56 = strTokenizer55.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder52.deleteAll(strMatcher56);
        org.apache.commons.lang.text.StrTokenizer strTokenizer58 = strTokenizer50.setTrimmerMatcher(strMatcher56);
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder47.replace(strMatcher56, " ", (int) (short) 1, 1, 1);
        org.apache.commons.lang.text.StrTokenizer strTokenizer64 = strTokenizer30.setIgnoredMatcher(strMatcher56);
        org.apache.commons.lang.text.StrTokenizer strTokenizer65 = strTokenizer27.setQuoteMatcher(strMatcher56);
        int int66 = strBuilder17.lastIndexOf(strMatcher56);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "i!" + "'", str9, "i!");
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(strMatcher20);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertNotNull(strMatcher29);
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertNotNull(strMatcher36);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strTokenizer38);
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strTokenizer48);
        org.junit.Assert.assertNotNull(strMatcher49);
        org.junit.Assert.assertNotNull(strTokenizer50);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertNotNull(strMatcher56);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strTokenizer58);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strTokenizer64);
        org.junit.Assert.assertNotNull(strTokenizer65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        int int4 = strBuilder3.capacity();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder7.clear();
        int int10 = strBuilder8.lastIndexOf(' ');
        int int12 = strBuilder8.lastIndexOf('0');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder8.replaceAll('4', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder15.appendFixedWidthPadRight((int) (byte) -1, 6, 'i');
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder19);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer4 = strBuilder3.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.replaceAll('a', '4');
        java.lang.String str10 = strBuilder7.substring(0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder7.setNullText("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder12.minimizeCapacity();
        java.lang.String str14 = strBuilder12.getNewLineText();
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder12.insert(0, "1.0###################################");
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strBuilder17);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.deleteAll("");
        java.lang.Object obj6 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append(obj6);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.replaceFirst("", "4   4");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder7.insert(0, (double) 10L);
        org.apache.commons.lang.text.StrTokenizer strTokenizer15 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder17.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder19.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list24 = strTokenizer23.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer25 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher26 = strTokenizer25.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = strTokenizer23.setDelimiterMatcher(strMatcher26);
        int int29 = strBuilder22.indexOf(strMatcher26, (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = strTokenizer15.setIgnoredMatcher(strMatcher26);
        java.lang.String str31 = strTokenizer15.previousToken();
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder33.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer36 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher37 = strTokenizer36.getIgnoredMatcher();
        char[] charArray43 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer44 = strTokenizer36.reset(charArray43);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder35.appendWithSeparators((java.util.Iterator) strTokenizer36, "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer47 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list48 = strTokenizer47.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer49 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher50 = strTokenizer49.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer51 = strTokenizer47.setDelimiterMatcher(strMatcher50);
        int int53 = strBuilder35.lastIndexOf(strMatcher50, (int) (byte) 0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer54 = strTokenizer15.setIgnoredMatcher(strMatcher50);
        org.apache.commons.lang.text.StrTokenizer strTokenizer56 = strTokenizer15.setEmptyTokenAsNull(true);
        org.apache.commons.lang.text.StrTokenizer strTokenizer57 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher58 = strTokenizer57.getIgnoredMatcher();
        char[] charArray64 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer65 = strTokenizer57.reset(charArray64);
        java.lang.String[] strArray66 = strTokenizer65.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder68 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder68.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder70.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer74 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list75 = strTokenizer74.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer76 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher77 = strTokenizer76.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer78 = strTokenizer74.setDelimiterMatcher(strMatcher77);
        int int80 = strBuilder73.indexOf(strMatcher77, (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer81 = strTokenizer65.setTrimmerMatcher(strMatcher77);
        org.apache.commons.lang.text.StrTokenizer strTokenizer82 = strTokenizer56.setDelimiterMatcher(strMatcher77);
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder7.append((java.lang.Object) strTokenizer82);
        java.lang.String str84 = strTokenizer82.toString();
        org.apache.commons.lang.text.StrTokenizer strTokenizer86 = strTokenizer82.setQuoteChar('!');
        int int87 = strTokenizer86.size();
        org.apache.commons.lang.text.StrTokenizer strTokenizer89 = strTokenizer86.setDelimiterString("true#");
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strTokenizer15);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertNotNull(strMatcher26);
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strTokenizer36);
        org.junit.Assert.assertNotNull(strMatcher37);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertArrayEquals(charArray43, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer44);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strTokenizer47);
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertNotNull(strTokenizer49);
        org.junit.Assert.assertNotNull(strMatcher50);
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer54);
        org.junit.Assert.assertNotNull(strTokenizer56);
        org.junit.Assert.assertNotNull(strTokenizer57);
        org.junit.Assert.assertNotNull(strMatcher58);
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertArrayEquals(charArray64, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer65);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "4   4" });
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(strTokenizer74);
        org.junit.Assert.assertNotNull(list75);
        org.junit.Assert.assertNotNull(strTokenizer76);
        org.junit.Assert.assertNotNull(strMatcher77);
        org.junit.Assert.assertNotNull(strTokenizer78);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer81);
        org.junit.Assert.assertNotNull(strTokenizer82);
        org.junit.Assert.assertNotNull(strBuilder83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "StrTokenizer[]" + "'", str84, "StrTokenizer[]");
        org.junit.Assert.assertNotNull(strTokenizer86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(strTokenizer89);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer4 = strBuilder3.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrTokenizer strTokenizer6 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) "", (int) (short) 1, ' ');
        java.lang.String str12 = strBuilder3.midString((-1), (int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder3.replace(0, (int) '!', "hi! ");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("hi!");
        int int19 = strBuilder18.capacity();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.deleteFirst("StrTokenizer[]");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder23.deleteAll("");
        boolean boolean29 = strBuilder27.contains('a');
        java.lang.String str32 = strBuilder27.midString(0, (int) (short) 0);
        int int33 = strBuilder27.capacity();
        org.apache.commons.lang.text.StrMatcher strMatcher34 = null;
        int int35 = strBuilder27.indexOf(strMatcher34);
        org.apache.commons.lang.text.StrTokenizer strTokenizer36 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher37 = strTokenizer36.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer38 = strTokenizer36.reset();
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder40.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer43 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher44 = strTokenizer43.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder40.deleteAll(strMatcher44);
        org.apache.commons.lang.text.StrTokenizer strTokenizer46 = strTokenizer38.setTrimmerMatcher(strMatcher44);
        int int47 = strBuilder27.indexOf(strMatcher44);
        char[] charArray48 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer49 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray48);
        char[] charArray50 = strBuilder27.getChars(charArray48);
        org.apache.commons.lang.text.StrTokenizer strTokenizer51 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray50);
        char[] charArray52 = strBuilder18.getChars(charArray50);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder3.append(charArray52);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer36);
        org.junit.Assert.assertNotNull(strMatcher37);
        org.junit.Assert.assertNotNull(strTokenizer38);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strTokenizer43);
        org.junit.Assert.assertNotNull(strMatcher44);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strTokenizer46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertArrayEquals(charArray48, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer49);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertArrayEquals(charArray50, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertArrayEquals(charArray52, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(strBuilder53);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
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
        java.io.Writer writer23 = strBuilder22.asWriter();
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
        org.junit.Assert.assertNotNull(writer23);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder((int) ' ');
        java.lang.String str2 = strBuilder1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        int int7 = strBuilder1.lastIndexOf(strMatcher5, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.insert((int) (byte) 1, (int) '4');
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer11 = strBuilder1.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder1.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder1.append('#');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder15.reverse();
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = strTokenizer18.setIgnoreEmptyTokens(false);
        org.apache.commons.lang.text.StrMatcher strMatcher21 = strTokenizer20.getDelimiterMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder15.appendWithSeparators((java.util.Iterator) strTokenizer20, "h!   !i!#");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer24 = strBuilder15.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrTokenizer strTokenizer26 = strBuilderTokenizer24.setDelimiterString("############################");
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strMatcher21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strTokenizer26);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
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
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer25 = strBuilder24.new StrBuilderTokenizer();
        char[] charArray26 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray26);
        java.util.List list30 = strBuilderTokenizer25.tokenize(charArray26, (int) (short) -1, (int) '#');
        java.lang.String str31 = strBuilderTokenizer25.getContent();
        org.apache.commons.lang.text.StrMatcher strMatcher32 = strBuilderTokenizer25.getDelimiterMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder1.replaceFirst(strMatcher32, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder1.setNullText("StrTokenizer[]");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer37 = strBuilder1.new StrBuilderTokenizer();
        boolean boolean38 = strBuilderTokenizer37.hasPrevious();
        java.lang.String str39 = strBuilderTokenizer37.getContent();
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
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(strMatcher32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("!ih0.01");
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrTokenizer strTokenizer2 = strTokenizer1.reset();
        java.lang.String str3 = strTokenizer1.toString();
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = strTokenizer1.setEmptyTokenAsNull(false);
        boolean boolean6 = strTokenizer5.hasNext();
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertNotNull(strTokenizer2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "StrTokenizer[not tokenized yet]" + "'", str3, "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        char[] charArray11 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strTokenizer4.reset(charArray11);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.appendWithSeparators((java.util.Iterator) strTokenizer4, "hi!");
        strBuilder14.validateIndex(3);
        int int19 = strBuilder14.lastIndexOf('0', 7);
        int int22 = strBuilder14.lastIndexOf("4", 42);
        java.lang.String str23 = strBuilder14.getNullText();
        java.lang.String str24 = strBuilder14.getNullText();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 7 + "'", int22 == 7);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        int int7 = strBuilder1.lastIndexOf(strMatcher5, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.insert((int) (byte) 1, (int) '4');
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer11 = strBuilder1.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder1.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder1.append('#');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder19.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder17.appendFixedWidthPadRight((java.lang.Object) strBuilder23, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher28 = strTokenizer27.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder17.replaceAll(strMatcher28, "StrTokenizer[not tokenized yet]");
        char[] charArray31 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder17.append(charArray31);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder17.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder38.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder38.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder36.appendFixedWidthPadRight((java.lang.Object) strBuilder42, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer46 = strBuilder36.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder34.appendFixedWidthPadLeft((java.lang.Object) strTokenizer46, 0, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher50 = strTokenizer46.getIgnoredMatcher();
        java.lang.String str51 = strTokenizer46.nextToken();
        org.apache.commons.lang.text.StrMatcher strMatcher52 = strTokenizer46.getDelimiterMatcher();
        org.apache.commons.lang.text.StrMatcher strMatcher53 = strTokenizer46.getTrimmerMatcher();
        int int55 = strBuilder15.indexOf(strMatcher53, 38);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertNotNull(strMatcher28);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strTokenizer46);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strMatcher50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(strMatcher52);
        org.junit.Assert.assertNotNull(strMatcher53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
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
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter44 = strBuilder5.new StrBuilderWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder5.appendNewLine();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder45.insert(7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 7");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
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
        strBuilderWriter10.write(105);
        strBuilderWriter10.close();
        java.io.Writer writer21 = strBuilderWriter10.append((java.lang.CharSequence) "0#############################");
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(writer21);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder3.replaceAll("hi!", "");
        boolean boolean7 = strBuilder6.isEmpty();
        char[] charArray8 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer9 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray8);
        org.apache.commons.lang.text.StrTokenizer strTokenizer10 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list11 = strTokenizer10.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher13 = strTokenizer12.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer14 = strTokenizer10.setDelimiterMatcher(strMatcher13);
        org.apache.commons.lang.text.StrTokenizer strTokenizer15 = strTokenizer9.setQuoteMatcher(strMatcher13);
        java.lang.String[] strArray16 = strTokenizer9.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer21 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher22 = strTokenizer21.getIgnoredMatcher();
        int int24 = strBuilder18.lastIndexOf(strMatcher22, 100);
        org.apache.commons.lang.text.StrTokenizer strTokenizer25 = strTokenizer9.setIgnoredMatcher(strMatcher22);
        java.lang.Object obj26 = strTokenizer25.clone();
        org.apache.commons.lang.text.StrTokenizer strTokenizer28 = strTokenizer25.setDelimiterString("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder6.appendWithSeparators((java.util.Iterator) strTokenizer28, "hi!");
        int int33 = strBuilder6.indexOf("4444444444", 48);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(strTokenizer10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strMatcher13);
        org.junit.Assert.assertNotNull(strTokenizer14);
        org.junit.Assert.assertNotNull(strTokenizer15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strMatcher22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
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
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader25 = strBuilder24.new StrBuilderReader();
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder24.appendPadding((int) '4', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder24.append((double) (byte) -1);
        int int32 = strBuilder30.lastIndexOf("4   4");
        boolean boolean34 = strBuilder30.contains("hi!");
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
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
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
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer29 = strBuilder28.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrTokenizer strTokenizer31 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder28.appendFixedWidthPadLeft((java.lang.Object) "", (int) (short) 1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.deleteFirst("");
        char[] charArray39 = null;
        char[] charArray40 = strBuilder36.getChars(charArray39);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder34.append(charArray40);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder41.ensureCapacity(33);
        org.apache.commons.lang.text.StrTokenizer strTokenizer45 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder47.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder49.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer53 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list54 = strTokenizer53.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer55 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher56 = strTokenizer55.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer57 = strTokenizer53.setDelimiterMatcher(strMatcher56);
        int int59 = strBuilder52.indexOf(strMatcher56, (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer60 = strTokenizer45.setIgnoredMatcher(strMatcher56);
        java.lang.String str61 = strTokenizer45.previousToken();
        org.apache.commons.lang.text.StrBuilder strBuilder63 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder63.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer66 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher67 = strTokenizer66.getIgnoredMatcher();
        char[] charArray73 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer74 = strTokenizer66.reset(charArray73);
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder65.appendWithSeparators((java.util.Iterator) strTokenizer66, "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer77 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list78 = strTokenizer77.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer79 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher80 = strTokenizer79.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer81 = strTokenizer77.setDelimiterMatcher(strMatcher80);
        int int83 = strBuilder65.lastIndexOf(strMatcher80, (int) (byte) 0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer84 = strTokenizer45.setIgnoredMatcher(strMatcher80);
        org.apache.commons.lang.text.StrTokenizer strTokenizer86 = strTokenizer45.setEmptyTokenAsNull(true);
        org.apache.commons.lang.text.StrMatcher strMatcher87 = strTokenizer86.getQuoteMatcher();
        int int88 = strBuilder43.indexOf(strMatcher87);
        int int89 = strBuilder1.indexOf(strMatcher87);
        java.lang.Class<?> wildcardClass90 = strMatcher87.getClass();
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
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strTokenizer45);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertNotNull(strMatcher56);
        org.junit.Assert.assertNotNull(strTokenizer57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer60);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strTokenizer66);
        org.junit.Assert.assertNotNull(strMatcher67);
        org.junit.Assert.assertNotNull(charArray73);
        org.junit.Assert.assertArrayEquals(charArray73, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer74);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(strTokenizer77);
        org.junit.Assert.assertNotNull(list78);
        org.junit.Assert.assertNotNull(strTokenizer79);
        org.junit.Assert.assertNotNull(strMatcher80);
        org.junit.Assert.assertNotNull(strTokenizer81);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer84);
        org.junit.Assert.assertNotNull(strTokenizer86);
        org.junit.Assert.assertNotNull(strMatcher87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.append((double) 1.0f);
        int int8 = strBuilder3.lastIndexOf('4', 38);
        org.apache.commons.lang.text.StrTokenizer strTokenizer9 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher10 = strTokenizer9.getIgnoredMatcher();
        char[] charArray16 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer17 = strTokenizer9.reset(charArray16);
        org.apache.commons.lang.text.StrMatcher strMatcher18 = strTokenizer17.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.replaceFirst(strMatcher18, "hi!0");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder3.append(32);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer25 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder24.append(stringBuffer25, (-1), (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder24.reverse();
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher31 = strTokenizer30.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = strTokenizer30.reset();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder34.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer37 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher38 = strTokenizer37.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder34.deleteAll(strMatcher38);
        org.apache.commons.lang.text.StrTokenizer strTokenizer40 = strTokenizer32.setTrimmerMatcher(strMatcher38);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder29.replace(strMatcher38, " ", (int) (short) 1, 1, 1);
        org.apache.commons.lang.text.StrTokenizer strTokenizer46 = strBuilder29.asTokenizer();
        boolean boolean47 = strBuilder3.equals(strBuilder29);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder3.insert(24, (float) 69);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 24");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(strMatcher10);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(strMatcher18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(strMatcher31);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertNotNull(strMatcher38);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strTokenizer46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        boolean boolean2 = strBuilder1.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.minimizeCapacity();
        int int4 = strBuilder3.size();
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder3.deleteAll("hi! ");
        java.lang.String str7 = strBuilder3.getNewLineText();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer3 = strTokenizer1.setIgnoredChar('4');
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer7 = strTokenizer5.setIgnoreEmptyTokens(false);
        org.apache.commons.lang.text.StrMatcher strMatcher8 = strTokenizer7.getDelimiterMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer9 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher10 = strTokenizer9.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = strTokenizer9.reset();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer16 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher17 = strTokenizer16.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder13.deleteAll(strMatcher17);
        org.apache.commons.lang.text.StrTokenizer strTokenizer19 = strTokenizer11.setTrimmerMatcher(strMatcher17);
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = strTokenizer7.setQuoteMatcher(strMatcher17);
        org.apache.commons.lang.text.StrTokenizer strTokenizer21 = strTokenizer3.setIgnoredMatcher(strMatcher17);
        java.lang.String str22 = strTokenizer3.previousToken();
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertNotNull(strTokenizer3);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertNotNull(strMatcher8);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(strMatcher10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertNotNull(strMatcher17);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.append((double) 1.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder3.appendPadding((int) '#', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder8.appendFixedWidthPadLeft((int) ' ', 0, '#');
        char[] charArray13 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer14 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray13);
        boolean boolean15 = strTokenizer14.isIgnoreEmptyTokens();
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder8.appendWithSeparators((java.util.Iterator) strTokenizer14, "");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder17.insert((int) 'i', (long) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 105");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strBuilder17);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
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
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder1.minimizeCapacity();
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher21 = strTokenizer20.getIgnoredMatcher();
        char[] charArray27 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer28 = strTokenizer20.reset(charArray27);
        int int29 = strTokenizer20.size();
        org.apache.commons.lang.text.StrMatcher strMatcher30 = strTokenizer20.getTrimmerMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = strTokenizer20.setEmptyTokenAsNull(false);
        org.apache.commons.lang.text.StrMatcher strMatcher33 = strTokenizer32.getQuoteMatcher();
        int int34 = strBuilder19.indexOf(strMatcher33);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder36.deleteAll("");
        java.lang.Object obj41 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder40.append(obj41);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder44.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer47 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher48 = strTokenizer47.getIgnoredMatcher();
        char[] charArray54 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer55 = strTokenizer47.reset(charArray54);
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder46.appendWithSeparators((java.util.Iterator) strTokenizer47, "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher58 = strTokenizer47.getTrimmerMatcher();
        java.lang.String str59 = strTokenizer47.nextToken();
        org.apache.commons.lang.text.StrMatcher strMatcher60 = strTokenizer47.getTrimmerMatcher();
        java.lang.String[] strArray61 = strTokenizer47.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder42.appendWithSeparators((java.lang.Object[]) strArray61, "StrTokenizer[]");
        org.apache.commons.lang.text.StrBuilder strBuilder65 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder65.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder65.deleteAll("");
        boolean boolean71 = strBuilder69.contains('a');
        java.lang.String str74 = strBuilder69.midString(0, (int) (short) 0);
        int int75 = strBuilder69.capacity();
        org.apache.commons.lang.text.StrMatcher strMatcher76 = null;
        int int77 = strBuilder69.indexOf(strMatcher76);
        org.apache.commons.lang.text.StrTokenizer strTokenizer78 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher79 = strTokenizer78.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer80 = strTokenizer78.reset();
        org.apache.commons.lang.text.StrBuilder strBuilder82 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder82.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer85 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher86 = strTokenizer85.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder87 = strBuilder82.deleteAll(strMatcher86);
        org.apache.commons.lang.text.StrTokenizer strTokenizer88 = strTokenizer80.setTrimmerMatcher(strMatcher86);
        int int89 = strBuilder69.indexOf(strMatcher86);
        char[] charArray90 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer91 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray90);
        char[] charArray92 = strBuilder69.getChars(charArray90);
        org.apache.commons.lang.text.StrBuilder strBuilder93 = strBuilder42.append(charArray90);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder96 = strBuilder19.append(charArray90, (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Invalid startIndex: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strMatcher21);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(strMatcher30);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(strMatcher33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strTokenizer47);
        org.junit.Assert.assertNotNull(strMatcher48);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertArrayEquals(charArray54, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strMatcher58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(strMatcher60);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "4   4" });
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 35 + "'", int75 == 35);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer78);
        org.junit.Assert.assertNotNull(strMatcher79);
        org.junit.Assert.assertNotNull(strTokenizer80);
        org.junit.Assert.assertNotNull(strBuilder84);
        org.junit.Assert.assertNotNull(strTokenizer85);
        org.junit.Assert.assertNotNull(strMatcher86);
        org.junit.Assert.assertNotNull(strBuilder87);
        org.junit.Assert.assertNotNull(strTokenizer88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertNotNull(charArray90);
        org.junit.Assert.assertArrayEquals(charArray90, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer91);
        org.junit.Assert.assertNotNull(charArray92);
        org.junit.Assert.assertArrayEquals(charArray92, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(strBuilder93);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        int int7 = strBuilder1.lastIndexOf(strMatcher5, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader10 = strBuilder9.new StrBuilderReader();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.append((java.lang.Object) "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder9.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder13.minimizeCapacity();
        java.lang.String str15 = strBuilder14.toString();
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader16 = strBuilder14.new StrBuilderReader();
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer17 = strBuilder14.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrTokenizer strTokenizer19 = strBuilderTokenizer17.reset("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer21 = strTokenizer19.setDelimiterChar('i');
        char[] charArray22 = null;
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = strTokenizer19.reset(charArray22);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!truehi!" + "'", str15, "hi!truehi!");
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strTokenizer23);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        char[] charArray11 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strTokenizer4.reset(charArray11);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.appendWithSeparators((java.util.Iterator) strTokenizer4, "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher15 = strTokenizer4.getTrimmerMatcher();
        java.lang.String str16 = strTokenizer4.nextToken();
        org.apache.commons.lang.text.StrMatcher strMatcher17 = strTokenizer4.getTrimmerMatcher();
        java.lang.String str18 = strTokenizer4.toString();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer22 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        java.lang.Object obj23 = strTokenizer22.clone();
        int int24 = strTokenizer22.size();
        org.apache.commons.lang.text.StrMatcher strMatcher25 = strTokenizer22.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder20.replaceFirst(strMatcher25, "4   4");
        int int28 = strBuilder20.length();
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer29 = strBuilder20.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrTokenizer strTokenizer31 = strBuilderTokenizer29.setDelimiterString("1.0");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder33.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer36 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher37 = strTokenizer36.getIgnoredMatcher();
        char[] charArray43 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer44 = strTokenizer36.reset(charArray43);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder35.appendWithSeparators((java.util.Iterator) strTokenizer36, "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher47 = strTokenizer36.getTrimmerMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer49 = strTokenizer36.setEmptyTokenAsNull(false);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder51.setLength(0);
        java.io.Writer writer54 = strBuilder53.asWriter();
        org.apache.commons.lang.text.StrTokenizer strTokenizer55 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher56 = strTokenizer55.getIgnoredMatcher();
        int int57 = strBuilder53.indexOf(strMatcher56);
        org.apache.commons.lang.text.StrTokenizer strTokenizer58 = strTokenizer49.setDelimiterMatcher(strMatcher56);
        org.apache.commons.lang.text.StrTokenizer strTokenizer59 = strBuilderTokenizer29.setQuoteMatcher(strMatcher56);
        org.apache.commons.lang.text.StrTokenizer strTokenizer60 = strTokenizer4.setIgnoredMatcher(strMatcher56);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj61 = strTokenizer4.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
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
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strMatcher17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "StrTokenizer[4   4]" + "'", str18, "StrTokenizer[4   4]");
        org.junit.Assert.assertNotNull(strTokenizer22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(strMatcher25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strTokenizer36);
        org.junit.Assert.assertNotNull(strMatcher37);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertArrayEquals(charArray43, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer44);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strMatcher47);
        org.junit.Assert.assertNotNull(strTokenizer49);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(writer54);
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertNotNull(strMatcher56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer58);
        org.junit.Assert.assertNotNull(strTokenizer59);
        org.junit.Assert.assertNotNull(strTokenizer60);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.deleteAll("");
        java.lang.Object obj6 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append(obj6);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher13 = strTokenizer12.getIgnoredMatcher();
        char[] charArray19 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = strTokenizer12.reset(charArray19);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder11.appendWithSeparators((java.util.Iterator) strTokenizer12, "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher23 = strTokenizer12.getTrimmerMatcher();
        java.lang.String str24 = strTokenizer12.nextToken();
        org.apache.commons.lang.text.StrMatcher strMatcher25 = strTokenizer12.getTrimmerMatcher();
        java.lang.String[] strArray26 = strTokenizer12.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder7.appendWithSeparators((java.lang.Object[]) strArray26, "StrTokenizer[]");
        java.lang.String str30 = strBuilder28.rightString(1);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder28.reverse();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strMatcher13);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strMatcher23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(strMatcher25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "4   4" });
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "4" + "'", str30, "4");
        org.junit.Assert.assertNotNull(strBuilder31);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.append(stringBuffer2, (-1), (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.reverse();
        java.lang.StringBuffer stringBuffer7 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.append(stringBuffer7);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.deleteFirst("hi!");
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader11 = strBuilder8.new StrBuilderReader();
        boolean boolean12 = strBuilderReader11.markSupported();
        strBuilderReader11.reset();
        strBuilderReader11.mark(100);
        long long17 = strBuilderReader11.skip((long) 103);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3L + "'", long17 == 3L);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
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
        org.apache.commons.lang.text.StrTokenizer strTokenizer22 = strBuilder21.asTokenizer();
        java.lang.String[] strArray23 = strTokenizer22.getTokenArray();
        int int24 = strTokenizer22.previousIndex();
        java.lang.String str25 = strTokenizer22.toString();
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
        org.junit.Assert.assertNotNull(strTokenizer22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hStrTokenizer[not", "tokenized", "yet]i!4", "4-1.0" });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "StrTokenizer[hStrTokenizer[not, tokenized, yet]i!4, 4-1.0]" + "'", str25, "StrTokenizer[hStrTokenizer[not, tokenized, yet]i!4, 4-1.0]");
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
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
        boolean boolean24 = strBuilderReader23.markSupported();
        boolean boolean25 = strBuilderReader23.ready();
        boolean boolean26 = strBuilderReader23.markSupported();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) strBuilder7, 0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder10.appendNull();
        int int12 = strBuilder11.size;
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.append((double) 3);
        int int17 = strBuilder14.indexOf('a', (-1));
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.setLength(0);
        int int22 = strBuilder21.capacity();
        int int24 = strBuilder21.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder21.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.deleteFirst('#');
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter28 = strBuilder25.new StrBuilderWriter();
        strBuilderWriter28.close();
        strBuilderWriter28.flush();
        strBuilderWriter28.write(10);
        strBuilderWriter28.write("");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder38.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder38.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder36.appendFixedWidthPadRight((java.lang.Object) strBuilder42, 0, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer46 = strBuilder36.asTokenizer();
        int int48 = strBuilder36.lastIndexOf("hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer50 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher51 = strTokenizer50.getIgnoredMatcher();
        char[] charArray57 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer58 = strTokenizer50.reset(charArray57);
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder36.insert((int) (byte) 1, charArray57);
        strBuilderWriter28.write(charArray57);
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder14.append(charArray57);
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder14.clear();
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader63 = strBuilder62.new StrBuilderReader();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder62.replace(7, (int) (short) -1, "i!4444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strTokenizer46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(strTokenizer50);
        org.junit.Assert.assertNotNull(strMatcher51);
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertArrayEquals(charArray57, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer58);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder62);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        java.io.Writer writer4 = strBuilder3.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder6 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder8.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder6.appendFixedWidthPadRight((java.lang.Object) strBuilder12, 0, 'a');
        int int17 = strBuilder12.lastIndexOf("StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendFixedWidthPadRight((java.lang.Object) strBuilder12, (int) (byte) 10, 'a');
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter21 = strBuilder3.new StrBuilderWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder25.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list30 = strTokenizer29.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer31 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher32 = strTokenizer31.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer33 = strTokenizer29.setDelimiterMatcher(strMatcher32);
        int int35 = strBuilder28.indexOf(strMatcher32, (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder37.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer40 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher41 = strTokenizer40.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder37.deleteAll(strMatcher41);
        java.lang.StringBuffer stringBuffer43 = strBuilder42.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder28.append(stringBuffer43, (int) (short) 0, 0);
        java.io.Writer writer47 = strBuilderWriter21.append((java.lang.CharSequence) stringBuffer43);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Writer writer51 = strBuilderWriter21.append((java.lang.CharSequence) "0!ih!ih", 0, 48);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end 48, length 7");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(writer4);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(strMatcher32);
        org.junit.Assert.assertNotNull(strTokenizer33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertNotNull(strMatcher41);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(stringBuffer43);
        org.junit.Assert.assertEquals(stringBuffer43.toString(), "");
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(writer47);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        java.lang.Object obj6 = strTokenizer5.clone();
        int int7 = strTokenizer5.size();
        org.apache.commons.lang.text.StrMatcher strMatcher8 = strTokenizer5.getIgnoredMatcher();
        int int10 = strBuilder3.indexOf(strMatcher8, 10);
        java.io.Writer writer11 = strBuilder3.asWriter();
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher13 = strTokenizer12.getIgnoredMatcher();
        char[] charArray19 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = strTokenizer12.reset(charArray19);
        org.apache.commons.lang.text.StrTokenizer strTokenizer21 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray19);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.setLength(0);
        java.io.Writer writer26 = strBuilder25.asWriter();
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher28 = strTokenizer27.getIgnoredMatcher();
        int int29 = strBuilder25.indexOf(strMatcher28);
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = strTokenizer21.setDelimiterMatcher(strMatcher28);
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = strTokenizer30.setEmptyTokenAsNull(true);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder3.appendWithSeparators((java.util.Iterator) strTokenizer32, "4   4");
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
        org.apache.commons.lang.text.StrTokenizer strTokenizer57 = strTokenizer55.setDelimiterChar('a');
        org.apache.commons.lang.text.StrMatcher strMatcher58 = strTokenizer55.getIgnoredMatcher();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder3.appendFixedWidthPadRight((java.lang.Object) strTokenizer55, 3, 'h');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 5, count 31, length 35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strMatcher8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(writer11);
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strMatcher13);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(writer26);
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertNotNull(strMatcher28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertNotNull(strMatcher36);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer43);
        org.junit.Assert.assertNotNull(strTokenizer44);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(writer49);
        org.junit.Assert.assertNotNull(strTokenizer50);
        org.junit.Assert.assertNotNull(strMatcher51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertNotNull(strTokenizer57);
        org.junit.Assert.assertNotNull(strMatcher58);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
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
        boolean boolean20 = strBuilder18.contains('!');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder18.deleteFirst('!');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = strBuilder22.substring(99);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strBuilder22);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance("#####");
        org.junit.Assert.assertNotNull(strTokenizer1);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder((int) ' ');
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.setLength((int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher12 = strTokenizer11.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder8.deleteAll(strMatcher12);
        java.lang.String str16 = strBuilder8.midString(105, 104);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder4.appendFixedWidthPadRight((java.lang.Object) 104, 42, '0');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder4.insert((int) 'a', (int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder22.insert((int) (byte) 10, (double) 42);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertNotNull(strMatcher12);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder25);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        java.lang.Object obj2 = strTokenizer1.clone();
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = strTokenizer1.reset("");
        java.lang.String[] strArray5 = strTokenizer4.getTokenArray();
        org.apache.commons.lang.text.StrTokenizer strTokenizer7 = strTokenizer4.setDelimiterChar('a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer8 = strTokenizer7.reset();
        org.apache.commons.lang.text.StrTokenizer strTokenizer10 = strTokenizer8.setQuoteChar('#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer15 = strBuilder14.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder14.replaceAll('a', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher24 = strTokenizer23.getIgnoredMatcher();
        int int26 = strBuilder20.lastIndexOf(strMatcher24, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder20.insert((int) (byte) 1, (int) '4');
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher31 = strTokenizer30.getIgnoredMatcher();
        char[] charArray37 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer38 = strTokenizer30.reset(charArray37);
        java.lang.String[] strArray39 = strTokenizer38.getTokenArray();
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder20.appendWithSeparators((java.lang.Object[]) strArray39, "StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder18.appendWithSeparators((java.lang.Object[]) strArray39, "");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder18.appendFixedWidthPadRight((int) (byte) -1, 104, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder47.insert(10, (float) 8);
        org.apache.commons.lang.text.StrTokenizer strTokenizer52 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer54 = strTokenizer52.setIgnoreEmptyTokens(false);
        org.apache.commons.lang.text.StrMatcher strMatcher55 = strTokenizer54.getDelimiterMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder47.deleteAll(strMatcher55);
        org.apache.commons.lang.text.StrTokenizer strTokenizer57 = strTokenizer8.setQuoteMatcher(strMatcher55);
        boolean boolean58 = strTokenizer57.isEmptyTokenAsNull();
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strTokenizer7);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(strTokenizer10);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertNotNull(strMatcher24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(strMatcher31);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "4   4" });
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strTokenizer52);
        org.junit.Assert.assertNotNull(strTokenizer54);
        org.junit.Assert.assertNotNull(strMatcher55);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strTokenizer57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
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
        strBuilderWriter10.write("");
        strBuilderWriter10.close();
        char[] charArray23 = new char[] { ' ', ' ', '#', '4', ' ' };
        strBuilderWriter10.write(charArray23);
        strBuilderWriter10.write("a", 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder30.deleteAll("");
        java.lang.Object obj35 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder34.append(obj35);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder36.replaceFirst("", "4   4");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder36.insert(0, (double) 10L);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder44.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer47 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher48 = strTokenizer47.getIgnoredMatcher();
        int int50 = strBuilder44.lastIndexOf(strMatcher48, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder44.append(true);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader53 = strBuilder52.new StrBuilderReader();
        boolean boolean54 = strBuilderReader53.markSupported();
        strBuilderReader53.mark((int) (byte) 100);
        java.io.Writer writer57 = java.io.Writer.nullWriter();
        long long58 = strBuilderReader53.transferTo(writer57);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder60.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer63 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher64 = strTokenizer63.getIgnoredMatcher();
        char[] charArray70 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer71 = strTokenizer63.reset(charArray70);
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder62.appendWithSeparators((java.util.Iterator) strTokenizer63, "hi!");
        char[] charArray74 = strBuilder73.buffer;
        int int75 = strBuilderReader53.read(charArray74);
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder36.append(charArray74);
        strBuilderWriter10.write(charArray74);
        java.io.Writer writer79 = strBuilderWriter10.append((java.lang.CharSequence) "i!4444444444");
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { ' ', ' ', '#', '4', ' ' });
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strTokenizer47);
        org.junit.Assert.assertNotNull(strMatcher48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(writer57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 7L + "'", long58 == 7L);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strTokenizer63);
        org.junit.Assert.assertNotNull(strMatcher64);
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertArrayEquals(charArray70, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer71);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(charArray74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(writer79);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str49 = strBuilder47.substring((int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
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
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("hi! ");
        org.apache.commons.lang.text.StrTokenizer strTokenizer3 = strTokenizer1.setQuoteChar(' ');
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertNotNull(strTokenizer3);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
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
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher24 = strTokenizer23.getIgnoredMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder20.deleteAll(strMatcher24);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder16.appendFixedWidthPadRight((java.lang.Object) strBuilder25, 105, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder16.insert(29, 32);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder16.reverse();
        java.lang.String str33 = strBuilder16.getNewLineText();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertNotNull(strMatcher24);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer3 = strTokenizer1.setIgnoreEmptyTokens(false);
        org.apache.commons.lang.text.StrMatcher strMatcher4 = strTokenizer1.getTrimmerMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer6 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer8 = strTokenizer6.setIgnoredChar('4');
        int int9 = strTokenizer6.nextIndex();
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.replaceAll("hi!", "");
        org.apache.commons.lang.text.StrTokenizer strTokenizer19 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list20 = strTokenizer19.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer21 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher22 = strTokenizer21.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = strTokenizer19.setDelimiterMatcher(strMatcher22);
        int int25 = strBuilder18.indexOf(strMatcher22, (int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer26 = strTokenizer11.setIgnoredMatcher(strMatcher22);
        java.lang.String str27 = strTokenizer11.previousToken();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder29.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher33 = strTokenizer32.getIgnoredMatcher();
        char[] charArray39 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer40 = strTokenizer32.reset(charArray39);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder31.appendWithSeparators((java.util.Iterator) strTokenizer32, "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer43 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list44 = strTokenizer43.getTokenList();
        org.apache.commons.lang.text.StrTokenizer strTokenizer45 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher46 = strTokenizer45.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer47 = strTokenizer43.setDelimiterMatcher(strMatcher46);
        int int49 = strBuilder31.lastIndexOf(strMatcher46, (int) (byte) 0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer50 = strTokenizer11.setIgnoredMatcher(strMatcher46);
        org.apache.commons.lang.text.StrTokenizer strTokenizer52 = strTokenizer11.setEmptyTokenAsNull(true);
        org.apache.commons.lang.text.StrMatcher strMatcher53 = strTokenizer11.getQuoteMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer54 = strTokenizer6.setIgnoredMatcher(strMatcher53);
        boolean boolean55 = strTokenizer6.hasNext();
        org.apache.commons.lang.text.StrMatcher strMatcher56 = strTokenizer6.getIgnoredMatcher();
        org.apache.commons.lang.text.StrTokenizer strTokenizer57 = strTokenizer1.setIgnoredMatcher(strMatcher56);
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertNotNull(strTokenizer3);
        org.junit.Assert.assertNotNull(strMatcher4);
        org.junit.Assert.assertNotNull(strTokenizer6);
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strMatcher22);
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(strMatcher33);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer40);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strTokenizer43);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertNotNull(strTokenizer45);
        org.junit.Assert.assertNotNull(strMatcher46);
        org.junit.Assert.assertNotNull(strTokenizer47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer50);
        org.junit.Assert.assertNotNull(strTokenizer52);
        org.junit.Assert.assertNotNull(strMatcher53);
        org.junit.Assert.assertNotNull(strTokenizer54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(strMatcher56);
        org.junit.Assert.assertNotNull(strTokenizer57);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        org.apache.commons.lang.text.StrTokenizer strTokenizer0 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher1 = strTokenizer0.getIgnoredMatcher();
        char[] charArray7 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer8 = strTokenizer0.reset(charArray7);
        java.lang.String[] strArray9 = strTokenizer8.getTokenArray();
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = strTokenizer8.setIgnoreEmptyTokens(true);
        org.apache.commons.lang.text.StrTokenizer strTokenizer13 = strTokenizer11.setDelimiterChar('#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer15 = strTokenizer13.setIgnoredChar('!');
        boolean boolean16 = strTokenizer15.isEmptyTokenAsNull();
        org.junit.Assert.assertNotNull(strTokenizer0);
        org.junit.Assert.assertNotNull(strMatcher1);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "4   4" });
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertNotNull(strTokenizer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.append(stringBuffer2, (-1), (int) ' ');
        char[] charArray6 = strBuilder5.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder5.append((float) 7);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder12.deleteAll("");
        java.lang.Object obj17 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.append(obj17);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.replaceFirst("", "4   4");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder18.insert(0, (double) 10L);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder26.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher30 = strTokenizer29.getIgnoredMatcher();
        int int32 = strBuilder26.lastIndexOf(strMatcher30, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder26.append(true);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader35 = strBuilder34.new StrBuilderReader();
        boolean boolean36 = strBuilderReader35.markSupported();
        strBuilderReader35.mark((int) (byte) 100);
        java.io.Writer writer39 = java.io.Writer.nullWriter();
        long long40 = strBuilderReader35.transferTo(writer39);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder42.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer45 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher46 = strTokenizer45.getIgnoredMatcher();
        char[] charArray52 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer53 = strTokenizer45.reset(charArray52);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder44.appendWithSeparators((java.util.Iterator) strTokenizer45, "hi!");
        char[] charArray56 = strBuilder55.buffer;
        int int57 = strBuilderReader35.read(charArray56);
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder18.append(charArray56);
        org.apache.commons.lang.text.StrTokenizer strTokenizer59 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray56);
        strBuilder5.buffer = charArray56;
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strMatcher30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(writer39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 7L + "'", long40 == 7L);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strTokenizer45);
        org.junit.Assert.assertNotNull(strMatcher46);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertArrayEquals(charArray52, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strTokenizer59);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
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
        boolean boolean26 = strBuilder7.contains("ih");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder28.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer31 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher32 = strTokenizer31.getIgnoredMatcher();
        int int34 = strBuilder28.lastIndexOf(strMatcher32, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder28.append(true);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader37 = strBuilder36.new StrBuilderReader();
        java.lang.StringBuffer stringBuffer38 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder36.append(stringBuffer38, (int) (short) 0, 3);
        int int43 = strBuilder36.lastIndexOf('a');
        char[] charArray44 = strBuilder36.toCharArray();
        boolean boolean45 = strBuilder7.equals(strBuilder36);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(strMatcher32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertArrayEquals(charArray44, new char[] { 'h', 'i', '!', 't', 'r', 'u', 'e' });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        int int4 = strBuilder3.capacity();
        int int6 = strBuilder3.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.trim();
        java.lang.String str9 = strBuilder7.rightString((-1));
        int int11 = strBuilder7.indexOf("StrTokenizer[not tokenized yet]");
        int int12 = strBuilder7.length();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder7.trim();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strBuilder13);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
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
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder26.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer29 = strBuilder28.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrTokenizer strTokenizer31 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder28.appendFixedWidthPadLeft((java.lang.Object) "", (int) (short) 1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.deleteFirst("");
        char[] charArray39 = null;
        char[] charArray40 = strBuilder36.getChars(charArray39);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder34.append(charArray40);
        char[] charArray42 = strBuilder7.getChars(charArray40);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder7.append(38);
        java.lang.String str45 = strBuilder7.getNullText();
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder7.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder46.appendFixedWidthPadLeft(52, 48, 'i');
        org.apache.commons.lang.text.StrBuilder strBuilder53 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder53.setLength(0);
        int int56 = strBuilder55.capacity();
        int int58 = strBuilder55.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder55.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder59.deleteFirst('#');
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter62 = strBuilder59.new StrBuilderWriter();
        strBuilderWriter62.close();
        java.io.Writer writer65 = strBuilderWriter62.append('#');
        strBuilderWriter62.write((int) '#');
        strBuilderWriter62.flush();
        org.apache.commons.lang.text.StrBuilder strBuilder70 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder70.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder72.replaceAll("hi!", "");
        char[] charArray76 = new char[] {};
        org.apache.commons.lang.text.StrTokenizer strTokenizer77 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray76);
        char[] charArray78 = strBuilder72.getChars(charArray76);
        strBuilderWriter62.write(charArray78);
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder46.insert(7, charArray78);
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder46.insert((int) 'h', (float) (short) 100);
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
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strTokenizer31);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 35 + "'", int56 == 35);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(writer65);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(charArray76);
        org.junit.Assert.assertArrayEquals(charArray76, new char[] {});
        org.junit.Assert.assertNotNull(strTokenizer77);
        org.junit.Assert.assertNotNull(charArray78);
        org.junit.Assert.assertArrayEquals(charArray78, new char[] {});
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertNotNull(strBuilder83);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
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
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder((int) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher25 = strTokenizer24.getIgnoredMatcher();
        char[] charArray31 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = strTokenizer24.reset(charArray31);
        org.apache.commons.lang.text.StrTokenizer strTokenizer33 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray31);
        org.apache.commons.lang.text.StrTokenizer strTokenizer34 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance(charArray31);
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance(charArray31);
        char[] charArray36 = strBuilder23.getChars(charArray31);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) charArray31, 10, ' ');
        int int41 = strBuilder1.lastIndexOf(" ");
        // The following exception was thrown during execution in test generation
        try {
            int int44 = strBuilder1.validateRange((int) (byte) 100, (int) 'i');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strTokenizer16);
        org.junit.Assert.assertNotNull(strMatcher17);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(stringBuffer19);
        org.junit.Assert.assertEquals(stringBuffer19.toString(), "");
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strMatcher25);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(strTokenizer33);
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        char[] charArray4 = null;
        char[] charArray5 = strBuilder1.getChars(charArray4);
        int int8 = strBuilder1.indexOf("hi!\000\000\000\000\000\000\000", (int) (short) 100);
        int int11 = strBuilder1.lastIndexOf("4", 1);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.appendFixedWidthPadLeft(0, (int) (byte) -1, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder3.replaceFirst("StrTokenizer[not tokenized yet]", "StrTokenizer[not tokenized yet]");
        int int12 = strBuilder10.indexOf('#');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder10.ensureCapacity(3);
        boolean boolean16 = strBuilder14.startsWith(" ");
        boolean boolean18 = strBuilder14.endsWith("");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder14.insert(171, false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 171");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) strBuilder7, 0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder7.append(0L);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder12.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder13.appendPadding(35, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder13.deleteAll("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.insert(171, (float) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 171");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        org.apache.commons.lang.text.StrTokenizer strTokenizer1 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance("h!   !i!#");
        java.lang.String[] strArray2 = strTokenizer1.getTokenArray();
        java.lang.String str3 = strTokenizer1.toString();
        org.junit.Assert.assertNotNull(strTokenizer1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "h!   !i!#" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "StrTokenizer[h!   !i!#]" + "'", str3, "StrTokenizer[h!   !i!#]");
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
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
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder47.setNullText("!ih");
        int int52 = strBuilder47.lastIndexOf(" ", 38);
        java.lang.String str55 = strBuilder47.midString((int) '!', 4);
        boolean boolean57 = strBuilder47.startsWith("1.0");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder47.insert((-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
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
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 13 + "'", int52 == 13);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\000\000\000\000" + "'", str55, "\000\000\000\000");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.appendFixedWidthPadLeft(0, (int) (byte) -1, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder3.replaceFirst("StrTokenizer[not tokenized yet]", "StrTokenizer[not tokenized yet]");
        int int12 = strBuilder10.indexOf('#');
        int int13 = strBuilder10.size;
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer18 = strBuilder17.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance("");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder17.appendFixedWidthPadLeft((java.lang.Object) "", (int) (short) 1, ' ');
        java.lang.String str26 = strBuilder17.midString((-1), (int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder28.deleteFirst("");
        char[] charArray31 = null;
        char[] charArray32 = strBuilder28.getChars(charArray31);
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
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder28.append(stringBuffer46);
        boolean boolean49 = strBuilder17.equals(strBuilder28);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder17.appendFixedWidthPadLeft((int) 'a', (int) (byte) -1, ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer54 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher55 = strTokenizer54.getIgnoredMatcher();
        char[] charArray61 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer62 = strTokenizer54.reset(charArray61);
        int int63 = strTokenizer54.size();
        boolean boolean64 = strTokenizer54.hasNext();
        org.apache.commons.lang.text.StrMatcher strMatcher65 = strTokenizer54.getQuoteMatcher();
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder53.replaceFirst(strMatcher65, "a");
        boolean boolean68 = strBuilder10.contains(strMatcher65);
        strBuilder10.size = 24;
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strTokenizer43);
        org.junit.Assert.assertNotNull(strMatcher44);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(stringBuffer46);
        org.junit.Assert.assertEquals(stringBuffer46.toString(), "");
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strTokenizer54);
        org.junit.Assert.assertNotNull(strMatcher55);
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertArrayEquals(charArray61, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(strMatcher65);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list5 = strTokenizer4.getTokenList();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.appendWithSeparators((java.util.Collection) list5, "");
        java.lang.String str8 = strBuilder7.getNewLineText();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        org.apache.commons.lang.text.StrTokenizer strTokenizer0 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        java.util.List list1 = strTokenizer0.getTokenList();
        int int2 = strTokenizer0.previousIndex();
        java.lang.Object obj3 = strTokenizer0.clone();
        org.junit.Assert.assertNotNull(strTokenizer0);
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "StrTokenizer[not tokenized yet]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "StrTokenizer[not tokenized yet]");
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer strBuilderTokenizer4 = strBuilder3.new StrBuilderTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.replaceAll('a', '4');
        java.lang.String str10 = strBuilder7.substring(0, 0);
        strBuilder7.size = 10;
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("hi!");
        java.lang.StringBuffer stringBuffer15 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder14.append(stringBuffer15, (-1), (int) ' ');
        char[] charArray19 = strBuilder18.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder7.append((java.lang.Object) charArray19);
        java.lang.String str22 = strBuilder7.rightString(33);
        int int25 = strBuilder7.lastIndexOf('i', (int) '0');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder27.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer30 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher31 = strTokenizer30.getIgnoredMatcher();
        char[] charArray37 = new char[] { '4', ' ', ' ', ' ', '4' };
        org.apache.commons.lang.text.StrTokenizer strTokenizer38 = strTokenizer30.reset(charArray37);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder29.appendWithSeparators((java.util.Iterator) strTokenizer30, "hi!");
        int int42 = strBuilder40.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder40.insert((int) (short) 1, "StrTokenizer[not tokenized yet]");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder45.append((double) (short) -1);
        org.apache.commons.lang.text.StrTokenizer strTokenizer48 = strBuilder47.asTokenizer();
        boolean boolean49 = strBuilder7.equalsIgnoreCase(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { 'h', 'i', '!' });
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strTokenizer30);
        org.junit.Assert.assertNotNull(strMatcher31);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { '4', ' ', ' ', ' ', '4' });
        org.junit.Assert.assertNotNull(strTokenizer38);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strTokenizer48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteFirst("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = org.apache.commons.lang.text.StrTokenizer.getCSVInstance();
        org.apache.commons.lang.text.StrMatcher strMatcher5 = strTokenizer4.getIgnoredMatcher();
        int int7 = strBuilder1.lastIndexOf(strMatcher5, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder.StrBuilderReader strBuilderReader10 = strBuilder9.new StrBuilderReader();
        boolean boolean11 = strBuilderReader10.markSupported();
        boolean boolean12 = strBuilderReader10.markSupported();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strMatcher5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        boolean boolean2 = strBuilder1.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.append('#');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append((double) 1.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder8.appendPadding((int) '#', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder13.appendFixedWidthPadLeft((int) ' ', 0, '#');
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
        int int36 = strBuilder13.lastIndexOf(strMatcher30, (int) (short) 100);
        int int38 = strBuilder13.indexOf("StrTokenizer[not tokenized yet]");
        int int40 = strBuilder13.indexOf("StrTokenizer[not tokenized yet]");
        boolean boolean41 = strBuilder1.equals(strBuilder13);
        java.lang.String str42 = strBuilder13.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder17);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "1.0###################################" + "'", str42, "1.0###################################");
    }
}
