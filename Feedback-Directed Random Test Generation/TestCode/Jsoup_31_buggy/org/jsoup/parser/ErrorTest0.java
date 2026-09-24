package org.jsoup.parser;

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
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = startTag0.toString();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = endTag0.toString();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = startTag0.name();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        startTag0.newAttribute();
        boolean boolean5 = startTag0.isComment();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = startTag0.toString();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        startTag0.newAttribute();
        boolean boolean5 = startTag0.isComment();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = startTag0.name();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.selfClosing;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = endTag0.toString();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isEOF();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = startTag0.toString();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isEOF();
        startTag0.appendAttributeValue("hi!");
        startTag0.appendAttributeName('#');
        startTag0.appendAttributeValue('4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = startTag0.toString();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        boolean boolean4 = startTag0.isEOF();
        startTag0.newAttribute();
        startTag0.appendAttributeName("</<hi!>>");
        startTag0.appendAttributeName("</<hi!>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = startTag0.toString();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.selfClosing;
        endTag0.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes4 = endTag0.getAttributes();
        boolean boolean5 = endTag0.isSelfClosing();
        boolean boolean6 = endTag0.isEndTag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = endTag0.toString();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isEOF();
        startTag0.appendAttributeValue("hi!");
        startTag0.appendAttributeName('#');
        boolean boolean9 = startTag0.isSelfClosing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = startTag0.toString();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.selfClosing;
        endTag0.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes4 = endTag0.getAttributes();
        boolean boolean5 = endTag0.isSelfClosing();
        org.jsoup.parser.Token.EndTag endTag6 = endTag0.asEndTag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = endTag6.name();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        boolean boolean4 = startTag0.isEOF();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = startTag0.name();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.selfClosing;
        endTag0.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes4 = endTag0.getAttributes();
        boolean boolean5 = endTag0.isSelfClosing();
        boolean boolean6 = endTag0.isCharacter();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("");
        startTag8.appendTagName('a');
        org.jsoup.nodes.Attributes attributes11 = startTag8.getAttributes();
        endTag0.attributes = attributes11;
        boolean boolean13 = endTag0.isComment();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = endTag0.toString();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.selfClosing;
        endTag0.appendAttributeName('#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = endTag0.toString();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.selfClosing;
        endTag0.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes4 = endTag0.getAttributes();
        boolean boolean5 = endTag0.isSelfClosing();
        boolean boolean6 = endTag0.isCharacter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = endTag0.toString();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.selfClosing;
        endTag0.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes4 = endTag0.getAttributes();
        boolean boolean5 = endTag0.isSelfClosing();
        boolean boolean6 = endTag0.isCharacter();
        endTag0.appendAttributeName("</<!---->>");
        org.jsoup.parser.Token.EndTag endTag9 = endTag0.asEndTag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = endTag0.toString();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.selfClosing;
        endTag0.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes4 = endTag0.getAttributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = endTag0.name();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType4 = startTag0.type;
        org.jsoup.nodes.Attributes attributes5 = startTag0.getAttributes();
        startTag0.appendAttributeValue("<hi!>");
        org.jsoup.parser.Token.StartTag startTag8 = startTag0.asStartTag();
        startTag8.finaliseTag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = startTag8.toString();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.selfClosing;
        endTag0.newAttribute();
        boolean boolean3 = endTag0.isStartTag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = endTag0.toString();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isEOF();
        startTag0.appendAttributeName('4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = startTag0.name();
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        boolean boolean4 = startTag0.isEOF();
        startTag0.appendAttributeValue('#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = startTag0.toString();
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.selfClosing;
        endTag0.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes4 = endTag0.getAttributes();
        boolean boolean5 = endTag0.isSelfClosing();
        boolean boolean6 = endTag0.isEndTag();
        endTag0.appendAttributeName("</<hi!>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = endTag0.toString();
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.EndTag endTag2 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag2.appendAttributeValue('#');
        endTag2.finaliseTag();
        endTag2.appendTagName("StartTag");
        endTag2.newAttribute();
        org.jsoup.parser.Token.TokenType tokenType9 = endTag2.type;
        endTag0.type = tokenType9;
        endTag0.finaliseTag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = endTag0.toString();
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        org.jsoup.nodes.Attributes attributes4 = startTag0.attributes;
        startTag0.appendAttributeName("<!---->");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = startTag0.toString();
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.selfClosing;
        endTag0.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes4 = endTag0.getAttributes();
        boolean boolean5 = endTag0.isSelfClosing();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = endTag0.toString();
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        boolean boolean4 = startTag0.isEOF();
        startTag0.newAttribute();
        boolean boolean6 = startTag0.isSelfClosing();
        startTag0.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes9 = startTag0.attributes;
        boolean boolean10 = startTag0.isEndTag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = startTag0.name();
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        org.jsoup.nodes.Attributes attributes4 = startTag0.attributes;
        startTag0.appendAttributeName("</<!---->>");
        boolean boolean7 = startTag0.selfClosing;
        startTag0.selfClosing = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = startTag0.name();
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isEOF();
        startTag0.appendAttributeValue("hi!");
        boolean boolean7 = startTag0.selfClosing;
        startTag0.selfClosing = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = startTag0.name();
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.selfClosing;
        boolean boolean2 = endTag0.isCharacter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = endTag0.toString();
    }
}

