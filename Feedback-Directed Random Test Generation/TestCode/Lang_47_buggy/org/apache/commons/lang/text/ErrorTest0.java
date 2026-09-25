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
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder(100);
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.appendln(true);
        boolean boolean5 = strBuilder1.startsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrTokenizer strTokenizer8 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance("hi!");
        boolean boolean9 = strTokenizer8.isEmptyTokenAsNull();
        boolean boolean10 = strTokenizer8.hasNext();
        org.apache.commons.lang.text.StrMatcher strMatcher11 = strTokenizer8.getTrimmerMatcher();
        int int13 = strBuilder6.indexOf(strMatcher11, (int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder.StrBuilderWriter strBuilderWriter14 = strBuilder6.new StrBuilderWriter();
        int int16 = strBuilder6.lastIndexOf('4');
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance("hi!");
        boolean boolean19 = strTokenizer18.isEmptyTokenAsNull();
        java.util.List list20 = strTokenizer18.getTokenList();
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder6.appendWithSeparators((java.util.Collection) list20, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder6.setNullText("");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder1.append((java.lang.Object) strBuilder6);
        java.io.Writer writer26 = strBuilder1.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder27.ensureCapacity((int) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder29.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder29.append(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder29.append("");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder29.insert((int) (byte) 0, (-1L));
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder38.ensureCapacity((int) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrTokenizer strTokenizer43 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance("hi!");
        boolean boolean44 = strTokenizer43.isEmptyTokenAsNull();
        boolean boolean45 = strTokenizer43.hasNext();
        org.apache.commons.lang.text.StrMatcher strMatcher46 = strTokenizer43.getTrimmerMatcher();
        int int48 = strBuilder41.indexOf(strMatcher46, (int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder40.deleteFirst(strMatcher46);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder40.appendPadding((int) (short) 100, 'a');
        java.lang.StringBuffer stringBuffer53 = strBuilder52.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder29.appendln(stringBuffer53, 54, (int) ' ');
        java.io.Writer writer57 = writer26.append((java.lang.CharSequence) stringBuffer53);
        org.apache.commons.lang.text.StrBuilder strBuilder58 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder58.ensureCapacity((int) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder61 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrTokenizer strTokenizer63 = org.apache.commons.lang.text.StrTokenizer.getTSVInstance("hi!");
        boolean boolean64 = strTokenizer63.isEmptyTokenAsNull();
        boolean boolean65 = strTokenizer63.hasNext();
        org.apache.commons.lang.text.StrMatcher strMatcher66 = strTokenizer63.getTrimmerMatcher();
        int int68 = strBuilder61.indexOf(strMatcher66, (int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder60.deleteFirst(strMatcher66);
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder60.appendPadding((int) (short) 100, 'a');
        java.lang.StringBuffer stringBuffer73 = strBuilder72.toStringBuffer();
        java.io.Writer writer76 = writer26.append((java.lang.CharSequence) stringBuffer73, 55, 56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer53 and stringBuffer73", (stringBuffer53.compareTo(stringBuffer73) == 0) == stringBuffer53.equals(stringBuffer73));
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder0.ensureCapacity((int) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder2.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder2.append(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder2.appendPadding((int) (short) 100, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder2.replaceFirst('4', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder2.replaceAll("-1", "");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder(100);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.appendln((long) (byte) -1);
        java.lang.StringBuffer stringBuffer19 = strBuilder16.toStringBuffer();
        java.lang.StringBuffer stringBuffer20 = strBuilder16.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder14.appendln(stringBuffer20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer19 and stringBuffer20", (stringBuffer19.compareTo(stringBuffer20) == 0) == stringBuffer19.equals(stringBuffer20));
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder(100);
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.appendln((long) (byte) -1);
        java.lang.StringBuffer stringBuffer4 = strBuilder1.toStringBuffer();
        java.lang.StringBuffer stringBuffer5 = strBuilder1.toStringBuffer();
        java.io.Writer writer6 = strBuilder1.asWriter();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer4 and stringBuffer5", (stringBuffer4.compareTo(stringBuffer5) == 0) == stringBuffer4.equals(stringBuffer5));
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder(100);
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.appendln((long) (byte) -1);
        java.lang.StringBuffer stringBuffer4 = strBuilder1.toStringBuffer();
        java.lang.StringBuffer stringBuffer5 = strBuilder1.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.appendln(true);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer4 and stringBuffer5", (stringBuffer4.compareTo(stringBuffer5) == 0) == stringBuffer4.equals(stringBuffer5));
    }
}

