package org.jsoup.parser;

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
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType3 = org.jsoup.parser.Token.TokenType.EOF;
        doctype0.type = tokenType3;
        doctype0.forceQuirks = false;
        boolean boolean7 = doctype0.isForceQuirks();
        java.lang.String str8 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType9 = doctype0.type;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.EOF));
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        org.jsoup.parser.Token.TokenType tokenType2 = comment0.type;
        boolean boolean3 = comment0.isComment();
        java.lang.String str4 = comment0.getData();
        java.lang.String str5 = comment0.toString();
        java.lang.String str6 = comment0.getData();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        startTag7.appendAttributeValue('4');
        boolean boolean10 = startTag7.isEndTag();
        startTag7.newAttribute();
        boolean boolean12 = startTag7.isComment();
        boolean boolean13 = startTag7.selfClosing;
        org.jsoup.nodes.Attributes attributes14 = null;
        startTag7.attributes = attributes14;
        org.jsoup.parser.Token.EndTag endTag16 = new org.jsoup.parser.Token.EndTag();
        boolean boolean17 = endTag16.selfClosing;
        org.jsoup.parser.Token.Tag tag19 = endTag16.name("<!---->");
        org.jsoup.parser.Token.TokenType tokenType20 = org.jsoup.parser.Token.TokenType.StartTag;
        tag19.type = tokenType20;
        startTag7.type = tokenType20;
        org.jsoup.nodes.Attributes attributes23 = startTag7.getAttributes();
        boolean boolean24 = startTag7.isSelfClosing();
        boolean boolean25 = startTag7.isCharacter();
        org.jsoup.parser.Token.TokenType tokenType26 = startTag7.type;
        comment0.type = tokenType26;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(attributes23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + tokenType26 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType26.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.forceQuirks = false;
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        boolean boolean8 = doctype7.forceQuirks;
        org.jsoup.parser.Token.Doctype doctype9 = doctype7.asDoctype();
        java.lang.StringBuilder stringBuilder10 = doctype9.systemIdentifier;
        doctype9.forceQuirks = true;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doctype9);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        endTag1.appendTagName("StartTag");
        endTag1.newAttribute();
        org.jsoup.parser.Token.TokenType tokenType8 = endTag1.type;
        boolean boolean9 = endTag1.isCharacter();
        endTag1.appendAttributeValue('#');
        endTag1.appendAttributeValue(' ');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment14 = endTag1.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("hi!", attributes2);
        startTag3.newAttribute();
        startTag3.tagName = "";
        org.jsoup.nodes.Attributes attributes7 = startTag3.attributes;
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("", attributes7);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendAttributeValue('4');
        boolean boolean12 = startTag9.isDoctype();
        org.jsoup.nodes.Attributes attributes13 = startTag9.attributes;
        startTag8.attributes = attributes13;
        org.jsoup.parser.Token.StartTag startTag15 = startTag8.asStartTag();
        startTag8.appendAttributeValue(' ');
        java.lang.String str18 = startTag8.tokenType();
        startTag8.appendTagName('#');
        org.jsoup.parser.Token.StartTag startTag21 = startTag8.asStartTag();
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(startTag15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "StartTag" + "'", str18, "StartTag");
        org.junit.Assert.assertNotNull(startTag21);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        boolean boolean4 = startTag2.selfClosing;
        boolean boolean5 = startTag2.isEndTag();
        startTag2.finaliseTag();
        boolean boolean7 = startTag2.selfClosing;
        org.jsoup.parser.Token.Tag tag9 = startTag2.name("EndTag");
        org.jsoup.parser.Token.Tag tag11 = startTag2.name("</<hi!>>");
        org.jsoup.parser.Token.Doctype doctype12 = new org.jsoup.parser.Token.Doctype();
        boolean boolean13 = doctype12.isForceQuirks();
        java.lang.String str14 = doctype12.getName();
        boolean boolean15 = doctype12.isCharacter();
        java.lang.StringBuilder stringBuilder16 = doctype12.publicIdentifier;
        org.jsoup.parser.Token.EndTag endTag17 = new org.jsoup.parser.Token.EndTag();
        boolean boolean18 = endTag17.selfClosing;
        org.jsoup.parser.Token.Tag tag20 = endTag17.name("<!---->");
        boolean boolean21 = tag20.isCharacter();
        tag20.appendTagName("Comment");
        org.jsoup.nodes.Attributes attributes24 = tag20.attributes;
        org.jsoup.parser.Token.TokenType tokenType25 = tag20.type;
        doctype12.type = tokenType25;
        tag11.type = tokenType25;
        org.jsoup.nodes.Attributes attributes29 = null;
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag("hi!", attributes29);
        startTag30.appendAttributeValue(' ');
        java.lang.String str33 = startTag30.tokenType();
        boolean boolean34 = startTag30.isEOF();
        startTag30.appendTagName("Comment");
        boolean boolean37 = startTag30.isEndTag();
        org.jsoup.nodes.Attributes attributes39 = null;
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag("hi!", attributes39);
        org.jsoup.parser.Token.TokenType tokenType41 = startTag40.type;
        startTag40.finaliseTag();
        boolean boolean43 = startTag40.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType44 = startTag40.type;
        java.lang.String str45 = startTag40.tokenType();
        org.jsoup.parser.Token.TokenType tokenType46 = startTag40.type;
        startTag30.type = tokenType46;
        tag11.type = tokenType46;
        tag11.appendAttributeName("</<!---->StartTag<!----><<!---->>>");
        tag11.appendTagName("</EndTag>");
        org.jsoup.nodes.Attributes attributes53 = tag11.attributes;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(attributes24);
        org.junit.Assert.assertTrue("'" + tokenType25 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType25.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "StartTag" + "'", str33, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + tokenType41 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType41.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + tokenType44 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType44.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "StartTag" + "'", str45, "StartTag");
        org.junit.Assert.assertTrue("'" + tokenType46 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType46.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(attributes53);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.tokenType();
        boolean boolean3 = startTag1.isComment();
        org.jsoup.parser.Token.Tag tag5 = startTag1.name("<<!---->>");
        boolean boolean6 = startTag1.isSelfClosing();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("hi!", attributes3);
        startTag4.newAttribute();
        startTag4.tagName = "";
        org.jsoup.nodes.Attributes attributes8 = startTag4.attributes;
        startTag1.attributes = attributes8;
        boolean boolean10 = startTag1.isDoctype();
        org.jsoup.parser.Token.StartTag startTag11 = startTag1.asStartTag();
        boolean boolean12 = startTag11.isEOF();
        startTag11.selfClosing = true;
        org.jsoup.parser.Token.Tag tag16 = startTag11.name("hi!");
        boolean boolean17 = startTag11.selfClosing;
        java.lang.String str18 = startTag11.toString();
        startTag11.selfClosing = true;
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<hi!>" + "'", str18, "<hi!>");
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.toString();
        org.jsoup.parser.Token.Tag tag4 = startTag1.name("</<!---->StartTag<!----><<!---->>>");
        org.jsoup.parser.Token.Tag tag6 = tag4.name("</<<!---->>>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<<!---->>" + "'", str2, "<<!---->>");
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        java.lang.String str3 = doctype0.getName();
        org.jsoup.parser.Token.Doctype doctype4 = doctype0.asDoctype();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(doctype4);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendAttributeName('4');
        java.lang.String str6 = startTag2.tokenType();
        java.lang.String str7 = startTag2.tokenType();
        boolean boolean8 = startTag2.isEOF();
        startTag2.selfClosing = true;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character11 = startTag2.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "StartTag" + "'", str6, "StartTag");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "StartTag" + "'", str7, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList7);
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        xmlTreeBuilder0.initialiseParse("<!---->", "hi!", parseErrorList11);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder0.initialiseParse("<<!---->>", "", parseErrorList15);
        org.jsoup.nodes.Attributes attributes19 = null;
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag("hi!", attributes19);
        boolean boolean21 = startTag20.isComment();
        org.jsoup.parser.Token.Comment comment22 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType23 = org.jsoup.parser.Token.TokenType.Doctype;
        comment22.type = tokenType23;
        startTag20.type = tokenType23;
        java.lang.String str26 = startTag20.tagName;
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes30 = null;
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag("hi!", attributes30);
        startTag31.newAttribute();
        startTag31.tagName = "";
        org.jsoup.nodes.Attributes attributes35 = startTag31.attributes;
        startTag28.attributes = attributes35;
        startTag20.attributes = attributes35;
        org.jsoup.nodes.Attributes attributes38 = startTag20.getAttributes();
        org.jsoup.parser.Token.StartTag startTag39 = new org.jsoup.parser.Token.StartTag("<!---->StartTag", attributes38);
        org.jsoup.nodes.Element element40 = xmlTreeBuilder0.insert(startTag39);
        startTag39.finaliseTag();
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + tokenType23 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType23.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertNotNull(element40);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        org.jsoup.nodes.Attributes attributes3 = startTag0.attributes;
        boolean boolean4 = startTag0.selfClosing;
        boolean boolean5 = startTag0.isStartTag();
        boolean boolean6 = startTag0.isSelfClosing();
        org.junit.Assert.assertNotNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.forceQuirks = false;
        java.lang.String str5 = doctype0.getName();
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        boolean boolean8 = doctype0.forceQuirks;
        java.lang.String str9 = doctype0.getName();
        java.lang.StringBuilder stringBuilder10 = doctype0.publicIdentifier;
        java.lang.String str11 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList7);
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        xmlTreeBuilder0.initialiseParse("<!---->", "hi!", parseErrorList11);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder0.initialiseParse("<<!---->>", "", parseErrorList15);
        org.jsoup.nodes.Attributes attributes19 = null;
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag("hi!", attributes19);
        boolean boolean21 = startTag20.isComment();
        org.jsoup.parser.Token.Comment comment22 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType23 = org.jsoup.parser.Token.TokenType.Doctype;
        comment22.type = tokenType23;
        startTag20.type = tokenType23;
        java.lang.String str26 = startTag20.tagName;
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes30 = null;
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag("hi!", attributes30);
        startTag31.newAttribute();
        startTag31.tagName = "";
        org.jsoup.nodes.Attributes attributes35 = startTag31.attributes;
        startTag28.attributes = attributes35;
        startTag20.attributes = attributes35;
        org.jsoup.nodes.Attributes attributes38 = startTag20.getAttributes();
        org.jsoup.parser.Token.StartTag startTag39 = new org.jsoup.parser.Token.StartTag("<!---->StartTag", attributes38);
        org.jsoup.nodes.Element element40 = xmlTreeBuilder0.insert(startTag39);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder41 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        xmlTreeBuilder41.initialiseParse("</<!---->>", "StartTag", parseErrorList44);
        org.jsoup.parser.ParseErrorList parseErrorList48 = null;
        xmlTreeBuilder41.initialiseParse("<!---->", "<<!---->>", parseErrorList48);
        org.jsoup.parser.Token.Character character51 = new org.jsoup.parser.Token.Character("");
        java.lang.String str52 = character51.toString();
        java.lang.String str53 = character51.getData();
        java.lang.String str54 = character51.toString();
        java.lang.String str55 = character51.toString();
        boolean boolean56 = xmlTreeBuilder41.process((org.jsoup.parser.Token) character51);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder57 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList60 = null;
        xmlTreeBuilder57.initialiseParse("</<!---->>", "</<!---->>", parseErrorList60);
        org.jsoup.parser.ParseErrorList parseErrorList64 = null;
        xmlTreeBuilder57.initialiseParse("", "<<!---->>", parseErrorList64);
        org.jsoup.parser.ParseErrorList parseErrorList68 = null;
        xmlTreeBuilder57.initialiseParse("<!---->", "hi!", parseErrorList68);
        org.jsoup.parser.Token.StartTag startTag71 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str72 = startTag71.tokenType();
        boolean boolean73 = startTag71.selfClosing;
        org.jsoup.nodes.Element element74 = xmlTreeBuilder57.insert(startTag71);
        boolean boolean75 = xmlTreeBuilder41.process((org.jsoup.parser.Token) startTag71);
        org.jsoup.parser.Token.Comment comment76 = new org.jsoup.parser.Token.Comment();
        boolean boolean77 = comment76.isStartTag();
        org.jsoup.parser.Token.Comment comment78 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType79 = org.jsoup.parser.Token.TokenType.Doctype;
        comment78.type = tokenType79;
        comment76.type = tokenType79;
        boolean boolean82 = comment76.isStartTag();
        java.lang.String str83 = comment76.toString();
        xmlTreeBuilder41.insert(comment76);
        xmlTreeBuilder0.insert(comment76);
        org.jsoup.parser.Token.Character character87 = new org.jsoup.parser.Token.Character("");
        java.lang.String str88 = character87.toString();
        java.lang.String str89 = character87.getData();
        java.lang.String str90 = character87.getData();
        java.lang.String str91 = character87.getData();
        xmlTreeBuilder0.insert(character87);
        org.jsoup.parser.ParseErrorList parseErrorList95 = null;
        xmlTreeBuilder0.initialiseParse("</<<!---->>>", "", parseErrorList95);
        org.jsoup.parser.Token.Character character98 = new org.jsoup.parser.Token.Character("</hi!>");
        xmlTreeBuilder0.insert(character98);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + tokenType23 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType23.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "StartTag" + "'", str72, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(element74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + tokenType79 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType79.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "<!---->" + "'", str83, "<!---->");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isEOF();
        startTag0.appendAttributeValue("hi!");
        startTag0.appendTagName('4');
        boolean boolean9 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag11 = startTag0.name("hi!");
        boolean boolean12 = startTag0.isComment();
        org.jsoup.parser.Token.StartTag startTag13 = startTag0.asStartTag();
        startTag13.tagName = "</</hi!<!---->>>";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(startTag13);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        org.jsoup.parser.Token.StartTag startTag4 = startTag2.asStartTag();
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        startTag5.appendAttributeValue('4');
        boolean boolean8 = startTag5.isDoctype();
        boolean boolean9 = startTag5.isDoctype();
        java.lang.String str10 = startTag5.tokenType();
        startTag5.appendTagName('a');
        org.jsoup.parser.Token.Tag tag14 = startTag5.name("hi!");
        org.jsoup.nodes.Attributes attributes16 = null;
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag("hi!", attributes16);
        boolean boolean18 = startTag17.isComment();
        startTag17.appendAttributeName('4');
        java.lang.String str21 = startTag17.tokenType();
        org.jsoup.nodes.Attributes attributes23 = null;
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag("hi!", attributes23);
        startTag24.appendAttributeValue(' ');
        java.lang.String str27 = startTag24.tokenType();
        java.lang.String str28 = startTag24.name();
        startTag24.appendTagName("<!---->");
        startTag24.tagName = "StartTag";
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag();
        startTag33.selfClosing = false;
        startTag33.appendTagName("hi!");
        org.jsoup.nodes.Attributes attributes38 = startTag33.getAttributes();
        startTag24.attributes = attributes38;
        startTag17.attributes = attributes38;
        tag14.attributes = attributes38;
        startTag2.attributes = attributes38;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(startTag4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "StartTag" + "'", str10, "StartTag");
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "StartTag" + "'", str21, "StartTag");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "StartTag" + "'", str27, "StartTag");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(attributes38);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder3 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder4 = doctype0.name;
        doctype0.forceQuirks = true;
        java.lang.String str7 = doctype0.getPublicIdentifier();
        boolean boolean8 = doctype0.isCharacter();
        boolean boolean9 = doctype0.forceQuirks;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.selfClosing;
        boolean boolean2 = endTag0.isCharacter();
        boolean boolean3 = endTag0.isDoctype();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType6 = org.jsoup.parser.Token.TokenType.Doctype;
        comment5.type = tokenType6;
        java.lang.StringBuilder stringBuilder8 = comment5.data;
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Comment comment10 = new org.jsoup.parser.Token.Comment();
        java.lang.String str11 = comment10.toString();
        xmlTreeBuilder0.insert(comment10);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder0.initialiseParse("</<hi!>>", "<<!---->>", parseErrorList15);
        org.jsoup.nodes.Attributes attributes18 = null;
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag("hi!", attributes18);
        startTag19.newAttribute();
        boolean boolean21 = startTag19.isSelfClosing();
        java.lang.String str22 = startTag19.name();
        org.jsoup.nodes.Element element23 = xmlTreeBuilder0.insert(startTag19);
        org.jsoup.parser.Token.Character character25 = new org.jsoup.parser.Token.Character("<hi!4hi!EndTag>");
        xmlTreeBuilder0.insert(character25);
        org.jsoup.nodes.Attributes attributes28 = null;
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag("hi!", attributes28);
        boolean boolean30 = startTag29.isComment();
        startTag29.appendAttributeName('4');
        java.lang.String str33 = startTag29.tokenType();
        java.lang.String str34 = startTag29.tokenType();
        java.lang.String str35 = startTag29.tagName;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "StartTag" + "'", str33, "StartTag");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "StartTag" + "'", str34, "StartTag");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "<hi!>", parseErrorList7);
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->StartTag>", parseErrorList11);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder0.initialiseParse("<!----><<!---->>", "StartTag", parseErrorList15);
        org.jsoup.parser.Token.Comment comment17 = new org.jsoup.parser.Token.Comment();
        java.lang.String str18 = comment17.toString();
        java.lang.StringBuilder stringBuilder19 = comment17.data;
        java.lang.StringBuilder stringBuilder20 = comment17.data;
        boolean boolean21 = comment17.isEndTag();
        boolean boolean22 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment17);
        org.jsoup.parser.Token.Comment comment23 = new org.jsoup.parser.Token.Comment();
        java.lang.String str24 = comment23.toString();
        org.jsoup.parser.Token.TokenType tokenType25 = comment23.type;
        boolean boolean26 = comment23.isComment();
        java.lang.String str27 = comment23.getData();
        org.jsoup.parser.Token.EndTag endTag29 = new org.jsoup.parser.Token.EndTag("");
        org.jsoup.nodes.Attributes attributes31 = null;
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag("hi!", attributes31);
        org.jsoup.parser.Token.TokenType tokenType33 = startTag32.type;
        endTag29.type = tokenType33;
        comment23.type = tokenType33;
        org.jsoup.parser.Token.TokenType tokenType36 = comment23.type;
        java.lang.String str37 = comment23.getData();
        xmlTreeBuilder0.insert(comment23);
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag();
        startTag40.appendAttributeValue('4');
        boolean boolean43 = startTag40.isEndTag();
        startTag40.newAttribute();
        boolean boolean45 = startTag40.isComment();
        org.jsoup.parser.Token.StartTag startTag47 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes49 = null;
        org.jsoup.parser.Token.StartTag startTag50 = new org.jsoup.parser.Token.StartTag("hi!", attributes49);
        startTag50.newAttribute();
        startTag50.tagName = "";
        org.jsoup.nodes.Attributes attributes54 = startTag50.attributes;
        startTag47.attributes = attributes54;
        startTag40.attributes = attributes54;
        org.jsoup.parser.Token.StartTag startTag57 = new org.jsoup.parser.Token.StartTag("<!---->", attributes54);
        org.jsoup.nodes.Element element58 = xmlTreeBuilder0.insert(startTag57);
        startTag57.appendAttributeName(' ');
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!---->" + "'", str18, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!---->" + "'", str24, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType25 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType25.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + tokenType33 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType33.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + tokenType36 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType36.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(attributes54);
        org.junit.Assert.assertNotNull(element58);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("hi!", attributes3);
        startTag4.newAttribute();
        startTag4.tagName = "";
        org.jsoup.nodes.Attributes attributes8 = startTag4.attributes;
        startTag1.attributes = attributes8;
        boolean boolean10 = startTag1.isDoctype();
        org.jsoup.parser.Token.StartTag startTag11 = startTag1.asStartTag();
        startTag1.tagName = "<hi!</</<!---->>>>";
        org.jsoup.parser.Token.Tag tag15 = startTag1.name("</</<!---->>>");
        org.jsoup.parser.Token.Doctype doctype16 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str17 = doctype16.getName();
        java.lang.StringBuilder stringBuilder18 = doctype16.name;
        doctype16.forceQuirks = false;
        java.lang.String str21 = doctype16.getPublicIdentifier();
        java.lang.String str22 = doctype16.getSystemIdentifier();
        java.lang.String str23 = doctype16.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType24 = doctype16.type;
        tag15.type = tokenType24;
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + tokenType24 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType24.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        startTag0.newAttribute();
        boolean boolean5 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType6 = null;
        startTag0.type = tokenType6;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype8 = startTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.tokenType();
        boolean boolean3 = startTag1.isSelfClosing();
        startTag1.finaliseTag();
        java.lang.String str5 = startTag1.tagName;
        java.lang.String str6 = startTag1.tokenType();
        boolean boolean7 = startTag1.isEOF();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "StartTag" + "'", str6, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "<!---->", parseErrorList7);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        java.lang.String str10 = comment9.getData();
        xmlTreeBuilder0.insert(comment9);
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        startTag12.appendAttributeValue('4');
        boolean boolean15 = startTag12.isEndTag();
        boolean boolean16 = startTag12.isEOF();
        startTag12.appendAttributeValue("hi!");
        startTag12.appendTagName('4');
        boolean boolean21 = startTag12.isSelfClosing();
        org.jsoup.parser.Token.Tag tag23 = startTag12.name("hi!");
        startTag12.appendAttributeValue("<!----><<!---->>");
        org.jsoup.nodes.Element element26 = xmlTreeBuilder0.insert(startTag12);
        boolean boolean27 = startTag12.selfClosing;
        startTag12.selfClosing = true;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        xmlTreeBuilder0.initialiseParse("<<<!---->>>", "</</<!---->>>", parseErrorList10);
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        boolean boolean13 = comment12.isStartTag();
        org.jsoup.parser.Token.Comment comment14 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType15 = org.jsoup.parser.Token.TokenType.Doctype;
        comment14.type = tokenType15;
        comment12.type = tokenType15;
        boolean boolean18 = comment12.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType19 = comment12.type;
        java.lang.String str20 = comment12.getData();
        java.lang.StringBuilder stringBuilder21 = comment12.data;
        java.lang.StringBuilder stringBuilder22 = comment12.data;
        xmlTreeBuilder0.insert(comment12);
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->StartTag>", "hi!EndTag", parseErrorList26);
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str30 = startTag29.tokenType();
        boolean boolean31 = startTag29.isComment();
        java.lang.String str32 = startTag29.toString();
        boolean boolean33 = startTag29.isComment();
        startTag29.appendAttributeName('#');
        boolean boolean36 = startTag29.isStartTag();
        org.jsoup.nodes.Element element37 = xmlTreeBuilder0.insert(startTag29);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + tokenType19 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType19.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "StartTag" + "'", str30, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<<!---->>" + "'", str32, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(element37);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        boolean boolean2 = doctype0.forceQuirks;
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.isComment();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("hi!", attributes2);
        startTag3.newAttribute();
        startTag3.tagName = "";
        boolean boolean7 = startTag3.isComment();
        startTag3.selfClosing = true;
        org.jsoup.nodes.Attributes attributes10 = startTag3.attributes;
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("<!---->StartTag", attributes10);
        boolean boolean12 = startTag11.isSelfClosing();
        boolean boolean13 = startTag11.isEndTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character14 = startTag11.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag("hi!", attributes5);
        org.jsoup.parser.Token.TokenType tokenType7 = startTag6.type;
        startTag6.finaliseTag();
        boolean boolean9 = startTag6.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType10 = startTag6.type;
        doctype0.type = tokenType10;
        java.lang.String str12 = doctype0.getName();
        java.lang.String str13 = doctype0.getSystemIdentifier();
        boolean boolean14 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder15 = doctype0.systemIdentifier;
        java.lang.String str16 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        endTag1.appendTagName("StartTag");
        java.lang.String str7 = endTag1.tokenType();
        org.jsoup.nodes.Attributes attributes8 = endTag1.attributes;
        endTag1.appendAttributeName('#');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EndTag" + "'", str7, "EndTag");
        org.junit.Assert.assertNull(attributes8);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.toString();
        java.lang.String str3 = startTag1.name();
        boolean boolean4 = startTag1.isDoctype();
        boolean boolean5 = startTag1.isCharacter();
        boolean boolean6 = startTag1.selfClosing;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<<!---->>" + "'", str2, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isEOF();
        startTag0.appendAttributeValue("hi!");
        startTag0.appendTagName('4');
        boolean boolean9 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag11 = startTag0.name("hi!");
        boolean boolean12 = startTag0.isComment();
        org.jsoup.parser.Token.StartTag startTag13 = startTag0.asStartTag();
        org.jsoup.parser.Token.StartTag startTag14 = startTag13.asStartTag();
        org.jsoup.parser.Token.StartTag startTag15 = startTag14.asStartTag();
        startTag15.tagName = "<<!---->>4";
        java.lang.String str18 = startTag15.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(startTag13);
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertNotNull(startTag15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<<<!---->>4>" + "'", str18, "<<<!---->>4>");
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag5 = new org.jsoup.parser.Token.EndTag();
        boolean boolean6 = endTag5.selfClosing;
        org.jsoup.parser.Token.Tag tag8 = endTag5.name("<!---->");
        org.jsoup.parser.Token.TokenType tokenType9 = org.jsoup.parser.Token.TokenType.StartTag;
        tag8.type = tokenType9;
        endTag1.type = tokenType9;
        boolean boolean12 = endTag1.selfClosing;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!<!---->");
        endTag1.selfClosing = true;
        boolean boolean4 = endTag1.isStartTag();
        endTag1.appendAttributeValue('a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isEOF();
        startTag0.appendAttributeValue("hi!");
        startTag0.appendTagName('4');
        boolean boolean9 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag11 = startTag0.name("hi!");
        startTag0.appendAttributeValue("<!----><<!---->>");
        org.jsoup.parser.Token.Tag tag15 = startTag0.name("<<hi!>>");
        java.lang.String str16 = startTag0.tagName;
        boolean boolean17 = startTag0.selfClosing;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<<hi!>>" + "'", str16, "<<hi!>>");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("</hi!<!---->>");
        java.lang.String str2 = startTag1.toString();
        startTag1.appendTagName('#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<</hi!<!---->>>" + "'", str2, "<</hi!<!---->>>");
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendAttributeName('4');
        boolean boolean6 = startTag2.isDoctype();
        org.jsoup.parser.Token.Tag tag8 = startTag2.name("StartTag");
        java.lang.String str9 = tag8.tokenType();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "StartTag" + "'", str9, "StartTag");
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        doctype0.forceQuirks = true;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        java.lang.String str7 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        boolean boolean9 = doctype0.isForceQuirks();
        java.lang.String str10 = doctype0.getName();
        java.lang.StringBuilder stringBuilder11 = doctype0.name;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendAttributeName('4');
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        startTag6.appendAttributeValue('4');
        boolean boolean9 = startTag6.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType10 = startTag6.type;
        startTag2.type = tokenType10;
        java.lang.String str12 = startTag2.toString();
        startTag2.appendAttributeName('4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<hi!>" + "'", str12, "<hi!>");
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        java.lang.String str5 = endTag1.toString();
        endTag1.appendAttributeValue("<!----><<!---->>");
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        startTag8.appendAttributeValue('4');
        boolean boolean11 = startTag8.isEndTag();
        startTag8.newAttribute();
        boolean boolean13 = startTag8.isComment();
        boolean boolean14 = startTag8.selfClosing;
        org.jsoup.nodes.Attributes attributes16 = null;
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag("hi!", attributes16);
        boolean boolean18 = startTag17.isComment();
        org.jsoup.parser.Token.Comment comment19 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType20 = org.jsoup.parser.Token.TokenType.Doctype;
        comment19.type = tokenType20;
        startTag17.type = tokenType20;
        startTag8.type = tokenType20;
        endTag1.type = tokenType20;
        boolean boolean25 = endTag1.isDoctype();
        boolean boolean26 = endTag1.selfClosing;
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes30 = null;
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag("hi!", attributes30);
        startTag31.newAttribute();
        startTag31.tagName = "";
        org.jsoup.nodes.Attributes attributes35 = startTag31.attributes;
        startTag28.attributes = attributes35;
        boolean boolean37 = startTag28.isDoctype();
        org.jsoup.parser.Token.StartTag startTag38 = startTag28.asStartTag();
        boolean boolean39 = startTag28.isEndTag();
        startTag28.finaliseTag();
        org.jsoup.parser.Token.TokenType tokenType41 = startTag28.type;
        endTag1.type = tokenType41;
        java.lang.String str43 = endTag1.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "</<!---->>" + "'", str5, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(startTag38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + tokenType41 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType41.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "</<!---->>" + "'", str43, "</<!---->>");
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isEOF();
        startTag0.appendAttributeValue("hi!");
        startTag0.appendTagName('4');
        startTag0.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag10 = startTag0.asStartTag();
        boolean boolean11 = startTag10.isStartTag();
        boolean boolean12 = startTag10.selfClosing;
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        startTag13.appendAttributeValue('4');
        boolean boolean16 = startTag13.isEndTag();
        boolean boolean17 = startTag13.isEOF();
        startTag13.appendAttributeValue("hi!");
        startTag13.appendTagName('4');
        boolean boolean22 = startTag13.isSelfClosing();
        boolean boolean23 = startTag13.isComment();
        boolean boolean24 = startTag13.isEOF();
        startTag13.finaliseTag();
        org.jsoup.nodes.Attributes attributes27 = null;
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag("hi!", attributes27);
        boolean boolean29 = startTag28.isComment();
        org.jsoup.parser.Token.Comment comment30 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType31 = org.jsoup.parser.Token.TokenType.Doctype;
        comment30.type = tokenType31;
        startTag28.type = tokenType31;
        java.lang.String str34 = startTag28.tagName;
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes38 = null;
        org.jsoup.parser.Token.StartTag startTag39 = new org.jsoup.parser.Token.StartTag("hi!", attributes38);
        startTag39.newAttribute();
        startTag39.tagName = "";
        org.jsoup.nodes.Attributes attributes43 = startTag39.attributes;
        startTag36.attributes = attributes43;
        startTag28.attributes = attributes43;
        startTag28.appendAttributeValue(' ');
        org.jsoup.nodes.Attributes attributes48 = startTag28.getAttributes();
        startTag13.attributes = attributes48;
        startTag10.attributes = attributes48;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + tokenType31 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType31.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(attributes43);
        org.junit.Assert.assertNotNull(attributes48);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str2 = endTag1.toString();
        endTag1.appendAttributeValue('4');
        boolean boolean5 = endTag1.isSelfClosing();
        java.lang.String str6 = endTag1.tagName;
        java.lang.String str7 = endTag1.toString();
        org.jsoup.parser.Token.Tag tag9 = endTag1.name("</</hi!<!---->>>");
        boolean boolean10 = endTag1.isCharacter();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</<!---->>" + "'", str2, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</<!---->>" + "'", str7, "</<!---->>");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str2 = endTag1.toString();
        endTag1.appendAttributeValue('4');
        boolean boolean5 = endTag1.isEOF();
        endTag1.appendAttributeValue('#');
        java.lang.String str8 = endTag1.toString();
        endTag1.appendTagName('a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</<!---->>" + "'", str2, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</<!---->>" + "'", str8, "</<!---->>");
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.appendAttributeValue(' ');
        boolean boolean5 = startTag2.isSelfClosing();
        boolean boolean6 = startTag2.isEndTag();
        startTag2.tagName = "";
        startTag2.tagName = "hi!4<</hi!<!---->>>";
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.tokenType();
        boolean boolean3 = startTag1.isComment();
        org.jsoup.parser.Token.Tag tag5 = startTag1.name("<<!---->>");
        tag5.newAttribute();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        startTag7.appendAttributeValue('4');
        boolean boolean10 = startTag7.isEndTag();
        boolean boolean11 = startTag7.isEOF();
        startTag7.appendAttributeValue("hi!");
        startTag7.appendTagName('4');
        boolean boolean16 = startTag7.isSelfClosing();
        boolean boolean17 = startTag7.isComment();
        org.jsoup.nodes.Attributes attributes19 = null;
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag("hi!", attributes19);
        boolean boolean21 = startTag20.isComment();
        startTag20.appendAttributeName('4');
        java.lang.String str24 = startTag20.tokenType();
        org.jsoup.nodes.Attributes attributes26 = null;
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag("hi!", attributes26);
        startTag27.appendAttributeValue(' ');
        java.lang.String str30 = startTag27.tokenType();
        java.lang.String str31 = startTag27.name();
        startTag27.appendTagName("<!---->");
        startTag27.tagName = "StartTag";
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag();
        startTag36.selfClosing = false;
        startTag36.appendTagName("hi!");
        org.jsoup.nodes.Attributes attributes41 = startTag36.getAttributes();
        startTag27.attributes = attributes41;
        startTag20.attributes = attributes41;
        java.lang.String str44 = startTag20.toString();
        org.jsoup.parser.Token.EndTag endTag45 = new org.jsoup.parser.Token.EndTag();
        boolean boolean46 = endTag45.selfClosing;
        endTag45.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes49 = endTag45.getAttributes();
        boolean boolean50 = endTag45.isSelfClosing();
        boolean boolean51 = endTag45.isCharacter();
        org.jsoup.parser.Token.StartTag startTag53 = new org.jsoup.parser.Token.StartTag("");
        startTag53.appendTagName('a');
        org.jsoup.nodes.Attributes attributes56 = startTag53.getAttributes();
        endTag45.attributes = attributes56;
        startTag20.attributes = attributes56;
        startTag7.attributes = attributes56;
        tag5.attributes = attributes56;
        java.lang.String str61 = tag5.tagName;
        java.lang.String str62 = tag5.tagName;
        boolean boolean63 = tag5.selfClosing;
        org.jsoup.nodes.Attributes attributes64 = tag5.attributes;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "StartTag" + "'", str24, "StartTag");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "StartTag" + "'", str30, "StartTag");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "<hi!>" + "'", str44, "<hi!>");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(attributes49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(attributes56);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "<<!---->>" + "'", str61, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "<<!---->>" + "'", str62, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(attributes64);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        boolean boolean6 = comment5.isStartTag();
        org.jsoup.parser.Token.Comment comment7 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.Doctype;
        comment7.type = tokenType8;
        comment5.type = tokenType8;
        boolean boolean11 = comment5.isStartTag();
        java.lang.String str12 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        xmlTreeBuilder0.initialiseParse("EndTag", "<<!---->>", parseErrorList16);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder18 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        xmlTreeBuilder18.initialiseParse("", "<<!---->>", parseErrorList21);
        org.jsoup.parser.Token.EndTag endTag24 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str25 = endTag24.toString();
        java.lang.String str26 = endTag24.toString();
        boolean boolean27 = xmlTreeBuilder18.process((org.jsoup.parser.Token) endTag24);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        xmlTreeBuilder18.initialiseParse("hi!<!---->", "", parseErrorList30);
        org.jsoup.parser.Token.Character character33 = new org.jsoup.parser.Token.Character("EndTag");
        xmlTreeBuilder18.insert(character33);
        xmlTreeBuilder0.insert(character33);
        java.lang.String str36 = character33.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag37 = character33.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "</<!---->>" + "'", str25, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "</<!---->>" + "'", str26, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "EndTag" + "'", str36, "EndTag");
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isCharacter();
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        boolean boolean6 = doctype0.isForceQuirks();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendTagName('4');
        startTag2.appendAttributeValue("<!---->");
        java.lang.String str8 = startTag2.tokenType();
        startTag2.appendAttributeName('4');
        boolean boolean11 = startTag2.isStartTag();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "StartTag" + "'", str8, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "<!---->", parseErrorList7);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        java.lang.String str10 = comment9.getData();
        xmlTreeBuilder0.insert(comment9);
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        java.lang.String str13 = comment12.toString();
        boolean boolean14 = comment12.isEndTag();
        xmlTreeBuilder0.insert(comment12);
        org.jsoup.parser.Token.Character character17 = new org.jsoup.parser.Token.Character("hi!");
        java.lang.String str18 = character17.getData();
        java.lang.String str19 = character17.toString();
        xmlTreeBuilder0.insert(character17);
        org.jsoup.parser.Token.Comment comment21 = new org.jsoup.parser.Token.Comment();
        boolean boolean22 = comment21.isStartTag();
        org.jsoup.parser.Token.Comment comment23 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType24 = org.jsoup.parser.Token.TokenType.Doctype;
        comment23.type = tokenType24;
        comment21.type = tokenType24;
        boolean boolean27 = comment21.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType28 = comment21.type;
        java.lang.String str29 = comment21.getData();
        java.lang.StringBuilder stringBuilder30 = comment21.data;
        java.lang.StringBuilder stringBuilder31 = comment21.data;
        java.lang.String str32 = comment21.getData();
        xmlTreeBuilder0.insert(comment21);
        java.lang.String str34 = comment21.getData();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + tokenType24 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType24.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + tokenType28 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType28.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(stringBuilder30);
        org.junit.Assert.assertEquals(stringBuilder30.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder31);
        org.junit.Assert.assertEquals(stringBuilder31.toString(), "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("");
        boolean boolean2 = character1.isComment();
        boolean boolean3 = character1.isComment();
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag("hi!", attributes5);
        boolean boolean7 = startTag6.isComment();
        org.jsoup.parser.Token.Comment comment8 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType9 = org.jsoup.parser.Token.TokenType.Doctype;
        comment8.type = tokenType9;
        startTag6.type = tokenType9;
        startTag6.appendAttributeName("hi!");
        org.jsoup.parser.Token.EndTag endTag14 = new org.jsoup.parser.Token.EndTag();
        boolean boolean15 = endTag14.selfClosing;
        org.jsoup.parser.Token.Tag tag17 = endTag14.name("<!---->");
        org.jsoup.parser.Token.TokenType tokenType18 = org.jsoup.parser.Token.TokenType.StartTag;
        tag17.type = tokenType18;
        startTag6.type = tokenType18;
        character1.type = tokenType18;
        org.jsoup.parser.Token.TokenType tokenType22 = character1.type;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + tokenType18 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType18.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + tokenType22 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType22.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.selfClosing = false;
        startTag0.appendTagName("hi!");
        org.jsoup.nodes.Attributes attributes5 = startTag0.getAttributes();
        startTag0.appendAttributeValue('a');
        org.jsoup.parser.Token.StartTag startTag8 = startTag0.asStartTag();
        org.jsoup.parser.Token.Doctype doctype9 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str10 = doctype9.getName();
        java.lang.StringBuilder stringBuilder11 = doctype9.name;
        doctype9.forceQuirks = false;
        boolean boolean14 = doctype9.forceQuirks;
        java.lang.StringBuilder stringBuilder15 = doctype9.systemIdentifier;
        org.jsoup.parser.Token.Doctype doctype16 = doctype9.asDoctype();
        org.jsoup.parser.Token.TokenType tokenType17 = doctype9.type;
        startTag8.type = tokenType17;
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertNotNull(doctype16);
        org.junit.Assert.assertTrue("'" + tokenType17 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType17.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<<hi!>>");
        java.lang.String str2 = endTag1.toString();
        org.jsoup.nodes.Attributes attributes3 = endTag1.attributes;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</<<hi!>>>" + "'", str2, "</<<hi!>>>");
        org.junit.Assert.assertNull(attributes3);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        startTag0.appendTagName("StartTag");
        org.jsoup.parser.Token.TokenType tokenType6 = startTag0.type;
        startTag0.appendTagName('4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList3);
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str7 = endTag6.toString();
        java.lang.String str8 = endTag6.toString();
        boolean boolean9 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag6);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        xmlTreeBuilder0.initialiseParse("hi!<!---->", "", parseErrorList12);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        xmlTreeBuilder14.initialiseParse("</<!---->>", "</<!---->>", parseErrorList17);
        org.jsoup.parser.Token.Comment comment19 = new org.jsoup.parser.Token.Comment();
        java.lang.String str20 = comment19.toString();
        org.jsoup.parser.Token.TokenType tokenType21 = comment19.type;
        java.lang.String str22 = comment19.getData();
        xmlTreeBuilder14.insert(comment19);
        org.jsoup.parser.Token.Comment comment24 = new org.jsoup.parser.Token.Comment();
        java.lang.String str25 = comment24.toString();
        org.jsoup.parser.Token.TokenType tokenType26 = comment24.type;
        java.lang.String str27 = comment24.toString();
        xmlTreeBuilder14.insert(comment24);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        xmlTreeBuilder29.initialiseParse("</<!---->>", "StartTag", parseErrorList32);
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        xmlTreeBuilder29.initialiseParse("<!---->", "<<!---->>", parseErrorList36);
        org.jsoup.parser.Token.Character character39 = new org.jsoup.parser.Token.Character("");
        java.lang.String str40 = character39.toString();
        java.lang.String str41 = character39.getData();
        java.lang.String str42 = character39.toString();
        java.lang.String str43 = character39.toString();
        boolean boolean44 = xmlTreeBuilder29.process((org.jsoup.parser.Token) character39);
        xmlTreeBuilder14.insert(character39);
        org.jsoup.parser.Token.StartTag startTag46 = new org.jsoup.parser.Token.StartTag();
        startTag46.appendAttributeValue('4');
        boolean boolean49 = startTag46.isDoctype();
        boolean boolean50 = startTag46.isDoctype();
        java.lang.String str51 = startTag46.tokenType();
        startTag46.appendTagName('a');
        org.jsoup.parser.Token.Tag tag55 = startTag46.name("hi!");
        boolean boolean56 = xmlTreeBuilder14.process((org.jsoup.parser.Token) startTag46);
        org.jsoup.nodes.Element element57 = xmlTreeBuilder0.insert(startTag46);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder58 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList61 = null;
        xmlTreeBuilder58.initialiseParse("</<!---->>", "</<!---->>", parseErrorList61);
        org.jsoup.parser.Token.Comment comment63 = new org.jsoup.parser.Token.Comment();
        java.lang.String str64 = comment63.toString();
        org.jsoup.parser.Token.TokenType tokenType65 = comment63.type;
        java.lang.String str66 = comment63.getData();
        xmlTreeBuilder58.insert(comment63);
        org.jsoup.parser.Token.Comment comment68 = new org.jsoup.parser.Token.Comment();
        boolean boolean69 = comment68.isStartTag();
        java.lang.String str70 = comment68.toString();
        boolean boolean71 = comment68.isCharacter();
        xmlTreeBuilder58.insert(comment68);
        java.lang.String str73 = comment68.getData();
        java.lang.StringBuilder stringBuilder74 = comment68.data;
        java.lang.StringBuilder stringBuilder75 = comment68.data;
        xmlTreeBuilder0.insert(comment68);
        org.jsoup.nodes.Attributes attributes78 = null;
        org.jsoup.parser.Token.StartTag startTag79 = new org.jsoup.parser.Token.StartTag("hi!", attributes78);
        boolean boolean80 = startTag79.isComment();
        boolean boolean81 = startTag79.selfClosing;
        startTag79.newAttribute();
        java.lang.String str83 = startTag79.tagName;
        org.jsoup.nodes.Element element84 = xmlTreeBuilder0.insert(startTag79);
        org.jsoup.parser.Token.Character character86 = new org.jsoup.parser.Token.Character("<hi!EndTag>");
        java.lang.String str87 = character86.getData();
        xmlTreeBuilder0.insert(character86);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</<!---->>" + "'", str7, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</<!---->>" + "'", str8, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!---->" + "'", str20, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType21 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType21.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!---->" + "'", str25, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType26 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType26.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!---->" + "'", str27, "<!---->");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "StartTag" + "'", str51, "StartTag");
        org.junit.Assert.assertNotNull(tag55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "<!---->" + "'", str64, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType65 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType65.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "<!---->" + "'", str70, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(stringBuilder74);
        org.junit.Assert.assertEquals(stringBuilder74.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder75);
        org.junit.Assert.assertEquals(stringBuilder75.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertNotNull(element84);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "<hi!EndTag>" + "'", str87, "<hi!EndTag>");
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        startTag1.appendAttributeValue('4');
        boolean boolean4 = startTag1.isEndTag();
        startTag1.newAttribute();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        startTag6.appendAttributeValue('4');
        org.jsoup.nodes.Attributes attributes9 = startTag6.attributes;
        startTag1.attributes = attributes9;
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("<<hi!>StartTag>", attributes9);
        org.jsoup.parser.Token.TokenType tokenType12 = startTag11.type;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype13 = startTag11.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        java.lang.String str3 = startTag2.toString();
        boolean boolean4 = startTag2.isSelfClosing();
        startTag2.appendTagName("</<!---->StartTag>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<hi!>" + "'", str3, "<hi!>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        boolean boolean2 = doctype0.isDoctype();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        boolean boolean6 = doctype0.isComment();
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        java.lang.String str8 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder9 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder10 = doctype0.systemIdentifier;
        boolean boolean11 = doctype0.isCharacter();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList3);
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str7 = endTag6.toString();
        java.lang.String str8 = endTag6.toString();
        boolean boolean9 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag6);
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag("hi!", attributes11);
        startTag12.newAttribute();
        boolean boolean14 = startTag12.isStartTag();
        boolean boolean15 = startTag12.isCharacter();
        org.jsoup.nodes.Element element16 = xmlTreeBuilder0.insert(startTag12);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        xmlTreeBuilder17.initialiseParse("</<!---->>", "StartTag", parseErrorList20);
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        xmlTreeBuilder17.initialiseParse("<!---->", "<<!---->>", parseErrorList24);
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        xmlTreeBuilder17.initialiseParse("<!----><<!---->>", "<hi!>", parseErrorList28);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder30 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        xmlTreeBuilder30.initialiseParse("</<!---->>", "</<!---->>", parseErrorList33);
        org.jsoup.parser.Token.Comment comment35 = new org.jsoup.parser.Token.Comment();
        java.lang.String str36 = comment35.toString();
        org.jsoup.parser.Token.TokenType tokenType37 = comment35.type;
        java.lang.String str38 = comment35.getData();
        xmlTreeBuilder30.insert(comment35);
        org.jsoup.parser.Token.Comment comment40 = new org.jsoup.parser.Token.Comment();
        java.lang.String str41 = comment40.toString();
        org.jsoup.parser.Token.TokenType tokenType42 = comment40.type;
        java.lang.String str43 = comment40.toString();
        xmlTreeBuilder30.insert(comment40);
        xmlTreeBuilder17.insert(comment40);
        xmlTreeBuilder0.insert(comment40);
        java.lang.String str47 = comment40.toString();
        java.lang.String str48 = comment40.getData();
        java.lang.StringBuilder stringBuilder49 = comment40.data;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag50 = comment40.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</<!---->>" + "'", str7, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</<!---->>" + "'", str8, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<!---->" + "'", str36, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType37 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType37.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "<!---->" + "'", str41, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType42 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType42.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "<!---->" + "'", str43, "<!---->");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "<!---->" + "'", str47, "<!---->");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(stringBuilder49);
        org.junit.Assert.assertEquals(stringBuilder49.toString(), "");
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        endTag1.appendTagName("StartTag");
        endTag1.newAttribute();
        org.jsoup.parser.Token.TokenType tokenType8 = endTag1.type;
        boolean boolean9 = endTag1.isCharacter();
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        boolean boolean13 = endTag1.isEndTag();
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        startTag0.newAttribute();
        boolean boolean5 = startTag0.isComment();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("hi!", attributes9);
        startTag10.newAttribute();
        startTag10.tagName = "";
        org.jsoup.nodes.Attributes attributes14 = startTag10.attributes;
        startTag7.attributes = attributes14;
        startTag0.attributes = attributes14;
        startTag0.newAttribute();
        org.jsoup.nodes.Attributes attributes18 = startTag0.getAttributes();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<hi!EndTag>");
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        boolean boolean2 = startTag1.isSelfClosing();
        boolean boolean3 = startTag1.isDoctype();
        startTag1.newAttribute();
        org.jsoup.parser.Token.Tag tag6 = startTag1.name("<<!---->>");
        boolean boolean7 = tag6.isCharacter();
        org.jsoup.parser.Token.Tag tag9 = tag6.name("</<!---->>");
        tag6.appendAttributeName("</<hi!>>");
        tag6.appendAttributeValue('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        org.jsoup.parser.Token.TokenType tokenType7 = comment5.type;
        java.lang.String str8 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Comment comment10 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType11 = org.jsoup.parser.Token.TokenType.Doctype;
        comment10.type = tokenType11;
        xmlTreeBuilder0.insert(comment10);
        org.jsoup.parser.Token.Comment comment14 = new org.jsoup.parser.Token.Comment();
        java.lang.String str15 = comment14.toString();
        boolean boolean16 = comment14.isEOF();
        boolean boolean17 = comment14.isEndTag();
        xmlTreeBuilder0.insert(comment14);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->StartTag<!----><<!---->>>", "</EndTag>", parseErrorList21);
        org.jsoup.parser.Token.Comment comment23 = new org.jsoup.parser.Token.Comment();
        java.lang.String str24 = comment23.toString();
        java.lang.StringBuilder stringBuilder25 = comment23.data;
        java.lang.StringBuilder stringBuilder26 = comment23.data;
        java.lang.StringBuilder stringBuilder27 = comment23.data;
        java.lang.String str28 = comment23.toString();
        java.lang.String str29 = comment23.getData();
        java.lang.String str30 = comment23.getData();
        xmlTreeBuilder0.insert(comment23);
        org.jsoup.parser.Token.Character character33 = new org.jsoup.parser.Token.Character("");
        java.lang.String str34 = character33.toString();
        java.lang.String str35 = character33.toString();
        boolean boolean36 = character33.isDoctype();
        xmlTreeBuilder0.insert(character33);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!---->" + "'", str15, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!---->" + "'", str24, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!---->" + "'", str28, "<!---->");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        boolean boolean2 = doctype0.isDoctype();
        boolean boolean3 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder4 = doctype0.systemIdentifier;
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        boolean boolean2 = doctype0.isDoctype();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        boolean boolean9 = doctype0.isComment();
        java.lang.StringBuilder stringBuilder10 = doctype0.publicIdentifier;
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder13 = doctype0.systemIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        org.jsoup.nodes.Attributes attributes4 = startTag2.attributes;
        java.lang.String str5 = startTag2.name();
        startTag2.tagName = "EndTag";
        java.lang.String str8 = startTag2.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<EndTag>" + "'", str8, "<EndTag>");
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.forceQuirks = false;
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        java.lang.StringBuilder stringBuilder9 = doctype0.systemIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        boolean boolean4 = startTag2.selfClosing;
        boolean boolean5 = startTag2.isEndTag();
        startTag2.finaliseTag();
        boolean boolean7 = startTag2.isEndTag();
        boolean boolean8 = startTag2.selfClosing;
        boolean boolean9 = startTag2.isStartTag();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.toString();
        java.lang.String str3 = startTag1.name();
        org.jsoup.parser.Token.Tag tag5 = startTag1.name("<hi!>");
        boolean boolean6 = startTag1.isComment();
        org.jsoup.nodes.Attributes attributes8 = null;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("hi!", attributes8);
        org.jsoup.parser.Token.TokenType tokenType10 = startTag9.type;
        startTag9.finaliseTag();
        boolean boolean12 = startTag9.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType13 = startTag9.type;
        startTag1.type = tokenType13;
        startTag1.appendAttributeValue("<<<!---->>>");
        startTag1.selfClosing = true;
        java.lang.String str19 = startTag1.tagName;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<<!---->>" + "'", str2, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<hi!>" + "'", str19, "<hi!>");
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        boolean boolean5 = endTag1.selfClosing;
        java.lang.String str6 = endTag1.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "</<!---->>" + "'", str6, "</<!---->>");
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        org.jsoup.nodes.Attributes attributes3 = startTag2.attributes;
        boolean boolean4 = startTag2.isComment();
        boolean boolean5 = startTag2.isEndTag();
        startTag2.appendAttributeName(' ');
        org.jsoup.nodes.Attributes attributes8 = startTag2.getAttributes();
        boolean boolean9 = startTag2.isDoctype();
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.tokenType();
        boolean boolean3 = startTag1.isComment();
        org.jsoup.parser.Token.Tag tag5 = startTag1.name("<<!---->>");
        tag5.appendTagName("</<!---->>");
        tag5.tagName = "</EndTag>";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tag5);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.newAttribute();
        startTag2.tagName = "";
        boolean boolean6 = startTag2.isComment();
        startTag2.appendTagName('a');
        org.jsoup.nodes.Attributes attributes9 = startTag2.attributes;
        org.jsoup.nodes.Attributes attributes10 = startTag2.attributes;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag11 = startTag2.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag("hi!", attributes5);
        org.jsoup.parser.Token.TokenType tokenType7 = startTag6.type;
        startTag6.finaliseTag();
        boolean boolean9 = startTag6.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType10 = startTag6.type;
        doctype0.type = tokenType10;
        boolean boolean12 = doctype0.isForceQuirks();
        boolean boolean13 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder14 = doctype0.systemIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character15 = doctype0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        boolean boolean2 = doctype0.isForceQuirks();
        boolean boolean3 = doctype0.isForceQuirks();
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag("hi!", attributes5);
        boolean boolean7 = startTag6.isComment();
        org.jsoup.parser.Token.Comment comment8 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType9 = org.jsoup.parser.Token.TokenType.Doctype;
        comment8.type = tokenType9;
        startTag6.type = tokenType9;
        doctype0.type = tokenType9;
        java.lang.StringBuilder stringBuilder13 = doctype0.name;
        java.lang.StringBuilder stringBuilder14 = doctype0.systemIdentifier;
        java.lang.String str15 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendTagName("EndTag");
        org.jsoup.parser.Token.StartTag startTag6 = startTag2.asStartTag();
        startTag6.appendAttributeValue('a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(startTag6);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.jsoup.parser.Token.EndTag endTag2 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str3 = endTag2.toString();
        endTag2.appendTagName("<<!---->>");
        org.jsoup.nodes.Attributes attributes10 = null;
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("hi!", attributes10);
        startTag11.newAttribute();
        startTag11.tagName = "";
        org.jsoup.nodes.Attributes attributes15 = startTag11.attributes;
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag("", attributes15);
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        startTag17.appendAttributeValue('4');
        boolean boolean20 = startTag17.isDoctype();
        org.jsoup.nodes.Attributes attributes21 = startTag17.attributes;
        startTag16.attributes = attributes21;
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag("<!----><<!---->>", attributes21);
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag("</</<!---->>>", attributes21);
        endTag2.attributes = attributes21;
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag("<hi!EndTag>", attributes21);
        java.lang.Class<?> wildcardClass27 = startTag26.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</<!---->>" + "'", str3, "</<!---->>");
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        boolean boolean4 = startTag2.selfClosing;
        startTag2.newAttribute();
        org.jsoup.nodes.Attributes attributes6 = startTag2.getAttributes();
        startTag2.newAttribute();
        boolean boolean8 = startTag2.isSelfClosing();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("</<!---->StartTag>");
        java.lang.String str2 = character1.toString();
        java.lang.String str3 = character1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</<!---->StartTag>" + "'", str2, "</<!---->StartTag>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</<!---->StartTag>" + "'", str3, "</<!---->StartTag>");
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.forceQuirks = false;
        java.lang.String str5 = doctype0.getName();
        java.lang.String str6 = doctype0.getPublicIdentifier();
        boolean boolean7 = doctype0.isComment();
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.newAttribute();
        boolean boolean4 = startTag2.isStartTag();
        org.jsoup.nodes.Attributes attributes5 = startTag2.attributes;
        boolean boolean6 = startTag2.isEOF();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        org.jsoup.parser.Token.TokenType tokenType4 = doctype0.type;
        boolean boolean5 = doctype0.forceQuirks;
        boolean boolean6 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder7 = doctype0.name;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("</<!---->>");
        java.lang.String str2 = endTag1.toString();
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag();
        startTag4.appendAttributeValue('4');
        boolean boolean7 = startTag4.isEndTag();
        startTag4.newAttribute();
        boolean boolean9 = startTag4.isComment();
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes13 = null;
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag("hi!", attributes13);
        startTag14.newAttribute();
        startTag14.tagName = "";
        org.jsoup.nodes.Attributes attributes18 = startTag14.attributes;
        startTag11.attributes = attributes18;
        startTag4.attributes = attributes18;
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag("<!---->", attributes18);
        endTag1.attributes = attributes18;
        endTag1.finaliseTag();
        org.jsoup.nodes.Attributes attributes24 = endTag1.attributes;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype25 = endTag1.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</</<!---->>>" + "'", str2, "</</<!---->>>");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(attributes24);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "<!---->", parseErrorList7);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        java.lang.String str10 = comment9.getData();
        xmlTreeBuilder0.insert(comment9);
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        java.lang.String str13 = comment12.toString();
        boolean boolean14 = comment12.isEndTag();
        xmlTreeBuilder0.insert(comment12);
        org.jsoup.parser.Token.Comment comment16 = new org.jsoup.parser.Token.Comment();
        boolean boolean17 = comment16.isStartTag();
        org.jsoup.parser.Token.Comment comment18 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType19 = org.jsoup.parser.Token.TokenType.Doctype;
        comment18.type = tokenType19;
        comment16.type = tokenType19;
        xmlTreeBuilder0.insert(comment16);
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        xmlTreeBuilder0.initialiseParse("Comment", "hi!", parseErrorList25);
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag();
        startTag29.appendAttributeValue('4');
        boolean boolean32 = startTag29.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType33 = startTag29.type;
        org.jsoup.nodes.Attributes attributes34 = startTag29.getAttributes();
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag("", attributes34);
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag("<<<!---->>>", attributes34);
        boolean boolean37 = startTag36.isStartTag();
        startTag36.appendAttributeName('a');
        java.lang.String str40 = startTag36.name();
        boolean boolean41 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag36);
        org.jsoup.parser.Token.Doctype doctype42 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str43 = doctype42.getName();
        java.lang.StringBuilder stringBuilder44 = doctype42.name;
        doctype42.forceQuirks = false;
        java.lang.String str47 = doctype42.getName();
        java.lang.StringBuilder stringBuilder48 = doctype42.publicIdentifier;
        java.lang.StringBuilder stringBuilder49 = doctype42.publicIdentifier;
        java.lang.StringBuilder stringBuilder50 = doctype42.systemIdentifier;
        boolean boolean51 = doctype42.forceQuirks;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean52 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + tokenType19 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType19.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + tokenType33 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType33.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "<<<!---->>>" + "'", str40, "<<<!---->>>");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(stringBuilder44);
        org.junit.Assert.assertEquals(stringBuilder44.toString(), "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(stringBuilder48);
        org.junit.Assert.assertEquals(stringBuilder48.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder49);
        org.junit.Assert.assertEquals(stringBuilder49.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder50);
        org.junit.Assert.assertEquals(stringBuilder50.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes4 = null;
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag("hi!", attributes4);
        startTag5.newAttribute();
        startTag5.tagName = "";
        org.jsoup.nodes.Attributes attributes9 = startTag5.attributes;
        startTag2.attributes = attributes9;
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("StartTag", attributes9);
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes15 = null;
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag("hi!", attributes15);
        startTag16.newAttribute();
        startTag16.tagName = "";
        org.jsoup.nodes.Attributes attributes20 = startTag16.attributes;
        startTag13.attributes = attributes20;
        startTag11.attributes = attributes20;
        startTag11.appendAttributeValue("hi!");
        org.jsoup.parser.Token.Tag tag26 = startTag11.name("EndTag");
        org.jsoup.nodes.Attributes attributes28 = null;
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag("hi!", attributes28);
        boolean boolean30 = startTag29.isComment();
        startTag29.appendAttributeName("StartTag");
        startTag29.appendAttributeName("");
        startTag29.appendAttributeName('#');
        org.jsoup.parser.Token.Tag tag38 = startTag29.name("<!---->");
        startTag29.appendTagName(' ');
        java.lang.String str41 = startTag29.tagName;
        org.jsoup.parser.Token.TokenType tokenType42 = startTag29.type;
        startTag11.type = tokenType42;
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "<!----> " + "'", str41, "<!----> ");
        org.junit.Assert.assertTrue("'" + tokenType42 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType42.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        boolean boolean4 = startTag0.isEOF();
        startTag0.newAttribute();
        startTag0.appendAttributeName("</<hi!>>");
        startTag0.newAttribute();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isStartTag();
        java.lang.String str2 = comment0.toString();
        java.lang.String str3 = comment0.getData();
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        java.lang.String str5 = comment0.getData();
        java.lang.String str6 = comment0.toString();
        java.lang.String str7 = comment0.tokenType();
        java.lang.StringBuilder stringBuilder8 = comment0.data;
        java.lang.StringBuilder stringBuilder9 = comment0.data;
        java.lang.String str10 = comment0.getData();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Comment" + "'", str7, "Comment");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isForceQuirks();
        java.lang.String str4 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
        java.lang.String str7 = doctype0.getPublicIdentifier();
        java.lang.String str8 = doctype0.getName();
        boolean boolean9 = doctype0.isCharacter();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        xmlTreeBuilder0.initialiseParse("<<<!---->>>", "</</<!---->>>", parseErrorList10);
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        boolean boolean13 = comment12.isStartTag();
        org.jsoup.parser.Token.Comment comment14 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType15 = org.jsoup.parser.Token.TokenType.Doctype;
        comment14.type = tokenType15;
        comment12.type = tokenType15;
        boolean boolean18 = comment12.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType19 = comment12.type;
        java.lang.String str20 = comment12.getData();
        java.lang.StringBuilder stringBuilder21 = comment12.data;
        java.lang.StringBuilder stringBuilder22 = comment12.data;
        xmlTreeBuilder0.insert(comment12);
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes27 = null;
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag("hi!", attributes27);
        startTag28.newAttribute();
        startTag28.tagName = "";
        org.jsoup.nodes.Attributes attributes32 = startTag28.attributes;
        startTag25.attributes = attributes32;
        boolean boolean34 = startTag25.isDoctype();
        org.jsoup.parser.Token.StartTag startTag35 = startTag25.asStartTag();
        startTag25.selfClosing = true;
        org.jsoup.parser.Token.TokenType tokenType38 = startTag25.type;
        startTag25.appendTagName('4');
        org.jsoup.nodes.Element element41 = xmlTreeBuilder0.insert(startTag25);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag42 = startTag25.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + tokenType19 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType19.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(startTag35);
        org.junit.Assert.assertTrue("'" + tokenType38 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType38.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(element41);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("a");
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.newAttribute();
        startTag2.finaliseTag();
        java.lang.String str5 = startTag2.toString();
        java.lang.String str6 = startTag2.name();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!>" + "'", str5, "<hi!>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isEOF();
        startTag0.appendAttributeValue("hi!");
        startTag0.appendTagName('4');
        boolean boolean9 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag11 = startTag0.name("hi!");
        boolean boolean12 = startTag0.isCharacter();
        org.jsoup.parser.Token.StartTag startTag13 = startTag0.asStartTag();
        boolean boolean14 = startTag0.isSelfClosing();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(startTag13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getName();
        java.lang.String str3 = doctype0.getName();
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        startTag1.appendTagName("<<!---->>");
        java.lang.String str4 = startTag1.tokenType();
        boolean boolean5 = startTag1.isStartTag();
        startTag1.newAttribute();
        startTag1.appendAttributeValue(' ');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "StartTag" + "'", str4, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("<<!---->>", "<hi!>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.getData();
        boolean boolean7 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment5);
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        xmlTreeBuilder0.initialiseParse("<<!----><hi!>>", "<hi!</</<!---->>>>", parseErrorList10);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder12.initialiseParse("</<!---->>", "</<!---->>", parseErrorList15);
        org.jsoup.parser.Token.Comment comment17 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType18 = org.jsoup.parser.Token.TokenType.Doctype;
        comment17.type = tokenType18;
        java.lang.StringBuilder stringBuilder20 = comment17.data;
        xmlTreeBuilder12.insert(comment17);
        org.jsoup.parser.Token.Comment comment22 = new org.jsoup.parser.Token.Comment();
        java.lang.String str23 = comment22.toString();
        xmlTreeBuilder12.insert(comment22);
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        xmlTreeBuilder12.initialiseParse("</<hi!>>", "<<!---->>", parseErrorList27);
        org.jsoup.parser.Token.Character character30 = new org.jsoup.parser.Token.Character("");
        java.lang.String str31 = character30.toString();
        java.lang.String str32 = character30.toString();
        boolean boolean33 = character30.isDoctype();
        xmlTreeBuilder12.insert(character30);
        xmlTreeBuilder0.insert(character30);
        java.lang.String str36 = character30.getData();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + tokenType18 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType18.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<!---->" + "'", str23, "<!---->");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.newAttribute();
        startTag2.tagName = "";
        boolean boolean6 = startTag2.isComment();
        startTag2.appendTagName('a');
        org.jsoup.nodes.Attributes attributes9 = startTag2.attributes;
        org.jsoup.nodes.Attributes attributes10 = startTag2.attributes;
        org.jsoup.parser.Token.StartTag startTag11 = startTag2.asStartTag();
        org.jsoup.nodes.Attributes attributes12 = startTag11.attributes;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        boolean boolean2 = startTag1.isSelfClosing();
        boolean boolean3 = startTag1.isDoctype();
        startTag1.newAttribute();
        org.jsoup.parser.Token.Tag tag6 = startTag1.name("<<!---->>");
        boolean boolean7 = tag6.isCharacter();
        org.jsoup.parser.Token.Tag tag9 = tag6.name("</<!---->>");
        org.jsoup.nodes.Attributes attributes10 = tag9.attributes;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.getData();
        java.lang.StringBuilder stringBuilder2 = comment0.data;
        java.lang.String str3 = comment0.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype4 = comment0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        endTag1.appendTagName("StartTag");
        java.lang.String str7 = endTag1.toString();
        java.lang.String str8 = endTag1.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</<!---->StartTag>" + "'", str7, "</<!---->StartTag>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</<!---->StartTag>" + "'", str8, "</<!---->StartTag>");
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "<!---->", parseErrorList7);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        xmlTreeBuilder9.initialiseParse("</<!---->>", "</<!---->>", parseErrorList12);
        org.jsoup.parser.Token.Comment comment14 = new org.jsoup.parser.Token.Comment();
        java.lang.String str15 = comment14.toString();
        org.jsoup.parser.Token.TokenType tokenType16 = comment14.type;
        java.lang.String str17 = comment14.getData();
        xmlTreeBuilder9.insert(comment14);
        java.lang.String str19 = comment14.toString();
        xmlTreeBuilder0.insert(comment14);
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        startTag21.selfClosing = false;
        startTag21.appendTagName("hi!");
        org.jsoup.nodes.Attributes attributes26 = startTag21.getAttributes();
        startTag21.appendAttributeValue('a');
        startTag21.finaliseTag();
        org.jsoup.nodes.Element element30 = xmlTreeBuilder0.insert(startTag21);
        org.jsoup.parser.Token.Character character31 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(character31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!---->" + "'", str15, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!---->" + "'", str19, "<!---->");
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(element30);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "<!---->", parseErrorList7);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        java.lang.String str10 = comment9.getData();
        xmlTreeBuilder0.insert(comment9);
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        java.lang.String str13 = comment12.toString();
        boolean boolean14 = comment12.isEndTag();
        xmlTreeBuilder0.insert(comment12);
        java.lang.String str16 = comment12.getData();
        org.jsoup.parser.Token.TokenType tokenType17 = comment12.type;
        boolean boolean18 = comment12.isDoctype();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + tokenType17 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType17.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.forceQuirks = false;
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        boolean boolean8 = doctype7.forceQuirks;
        boolean boolean9 = doctype7.isForceQuirks();
        java.lang.StringBuilder stringBuilder10 = doctype7.systemIdentifier;
        java.lang.StringBuilder stringBuilder11 = doctype7.publicIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        endTag1.tagName = "";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character6 = endTag1.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</<!---->>" + "'", str2, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</<!---->>" + "'", str3, "</<!---->>");
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        endTag1.appendTagName("StartTag");
        endTag1.newAttribute();
        org.jsoup.parser.Token.TokenType tokenType8 = endTag1.type;
        boolean boolean9 = endTag1.isCharacter();
        endTag1.appendAttributeValue('#');
        endTag1.appendAttributeValue(' ');
        endTag1.appendTagName("<hi!<!---->>");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.newAttribute();
        boolean boolean4 = startTag2.isStartTag();
        java.lang.String str5 = startTag2.toString();
        java.lang.String str6 = startTag2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!>" + "'", str5, "<hi!>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<hi!>" + "'", str6, "<hi!>");
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.selfClosing = false;
        startTag0.appendTagName("hi!");
        org.jsoup.nodes.Attributes attributes5 = startTag0.getAttributes();
        startTag0.appendAttributeValue('a');
        org.jsoup.parser.Token.StartTag startTag8 = startTag0.asStartTag();
        org.jsoup.parser.Token.Doctype doctype9 = new org.jsoup.parser.Token.Doctype();
        boolean boolean10 = doctype9.isForceQuirks();
        java.lang.String str11 = doctype9.getName();
        boolean boolean12 = doctype9.isCharacter();
        java.lang.StringBuilder stringBuilder13 = doctype9.publicIdentifier;
        org.jsoup.parser.Token.EndTag endTag14 = new org.jsoup.parser.Token.EndTag();
        boolean boolean15 = endTag14.selfClosing;
        org.jsoup.parser.Token.Tag tag17 = endTag14.name("<!---->");
        boolean boolean18 = tag17.isCharacter();
        tag17.appendTagName("Comment");
        org.jsoup.nodes.Attributes attributes21 = tag17.attributes;
        org.jsoup.parser.Token.TokenType tokenType22 = tag17.type;
        doctype9.type = tokenType22;
        startTag0.type = tokenType22;
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(attributes21);
        org.junit.Assert.assertTrue("'" + tokenType22 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType22.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.tokenType();
        boolean boolean3 = startTag1.isSelfClosing();
        startTag1.finaliseTag();
        java.lang.String str5 = startTag1.tagName;
        startTag1.selfClosing = false;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType5 = org.jsoup.parser.Token.TokenType.Doctype;
        comment4.type = tokenType5;
        startTag2.type = tokenType5;
        startTag2.appendAttributeName("hi!");
        org.jsoup.parser.Token.EndTag endTag10 = new org.jsoup.parser.Token.EndTag();
        boolean boolean11 = endTag10.selfClosing;
        org.jsoup.parser.Token.Tag tag13 = endTag10.name("<!---->");
        org.jsoup.parser.Token.TokenType tokenType14 = org.jsoup.parser.Token.TokenType.StartTag;
        tag13.type = tokenType14;
        startTag2.type = tokenType14;
        org.jsoup.parser.Token.TokenType tokenType17 = startTag2.type;
        startTag2.appendAttributeValue("<!---->4");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + tokenType17 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType17.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("");
        startTag1.appendTagName('a');
        boolean boolean4 = startTag1.selfClosing;
        java.lang.String str5 = startTag1.tagName;
        startTag1.appendTagName("Doctype");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a" + "'", str5, "a");
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        boolean boolean2 = startTag1.isSelfClosing();
        boolean boolean3 = startTag1.isDoctype();
        boolean boolean4 = startTag1.isSelfClosing();
        startTag1.appendTagName("<hi!>");
        org.jsoup.nodes.Attributes attributes7 = startTag1.attributes;
        boolean boolean8 = startTag1.isDoctype();
        boolean boolean9 = startTag1.isEOF();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("<EndTag>", attributes1);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.appendAttributeValue(' ');
        boolean boolean5 = startTag2.isSelfClosing();
        org.jsoup.parser.Token.Tag tag7 = startTag2.name("<<!---->>");
        org.jsoup.nodes.Attributes attributes8 = tag7.attributes;
        boolean boolean9 = tag7.isEOF();
        boolean boolean10 = tag7.selfClosing;
        java.lang.String str11 = tag7.tokenType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "StartTag" + "'", str11, "StartTag");
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        endTag1.appendTagName("StartTag");
        org.jsoup.parser.Token.Tag tag8 = endTag1.name("hi!EndTag");
        tag8.appendAttributeName("</hi!<!---->>");
        java.lang.String str11 = tag8.tagName;
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!EndTag" + "'", str11, "hi!EndTag");
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("");
        boolean boolean2 = character1.isEndTag();
        java.lang.String str3 = character1.toString();
        java.lang.String str4 = character1.getData();
        java.lang.String str5 = character1.toString();
        boolean boolean6 = character1.isEndTag();
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder8 = doctype7.publicIdentifier;
        java.lang.StringBuilder stringBuilder9 = doctype7.publicIdentifier;
        java.lang.String str10 = doctype7.getSystemIdentifier();
        org.jsoup.nodes.Attributes attributes12 = null;
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("hi!", attributes12);
        org.jsoup.parser.Token.TokenType tokenType14 = startTag13.type;
        startTag13.finaliseTag();
        boolean boolean16 = startTag13.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType17 = startTag13.type;
        doctype7.type = tokenType17;
        character1.type = tokenType17;
        java.lang.String str20 = character1.getData();
        java.lang.String str21 = character1.getData();
        java.lang.String str22 = character1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + tokenType17 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType17.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isCharacter();
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment6 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.tokenType();
        boolean boolean3 = startTag1.isComment();
        java.lang.String str4 = startTag1.toString();
        boolean boolean5 = startTag1.isComment();
        org.jsoup.parser.Token.Tag tag7 = startTag1.name("");
        org.jsoup.parser.Token.Tag tag9 = tag7.name("<<!---->>");
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        startTag11.appendAttributeValue('4');
        boolean boolean14 = startTag11.isEndTag();
        boolean boolean15 = startTag11.isEOF();
        startTag11.appendAttributeValue("hi!");
        startTag11.appendAttributeName('#');
        boolean boolean20 = startTag11.isSelfClosing();
        org.jsoup.nodes.Attributes attributes22 = null;
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag("hi!", attributes22);
        startTag23.newAttribute();
        startTag23.tagName = "";
        org.jsoup.nodes.Attributes attributes27 = startTag23.attributes;
        startTag11.attributes = attributes27;
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag("</<!---->StartTag>", attributes27);
        tag9.attributes = attributes27;
        org.jsoup.parser.Token.Doctype doctype31 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str32 = doctype31.getName();
        java.lang.StringBuilder stringBuilder33 = doctype31.name;
        java.lang.StringBuilder stringBuilder34 = doctype31.name;
        doctype31.forceQuirks = true;
        java.lang.StringBuilder stringBuilder37 = doctype31.publicIdentifier;
        doctype31.forceQuirks = false;
        java.lang.String str40 = doctype31.getSystemIdentifier();
        org.jsoup.parser.Token.StartTag startTag41 = new org.jsoup.parser.Token.StartTag();
        startTag41.appendAttributeValue('4');
        boolean boolean44 = startTag41.isEndTag();
        startTag41.newAttribute();
        boolean boolean46 = startTag41.isComment();
        boolean boolean47 = startTag41.selfClosing;
        org.jsoup.nodes.Attributes attributes48 = null;
        startTag41.attributes = attributes48;
        org.jsoup.parser.Token.EndTag endTag50 = new org.jsoup.parser.Token.EndTag();
        boolean boolean51 = endTag50.selfClosing;
        org.jsoup.parser.Token.Tag tag53 = endTag50.name("<!---->");
        org.jsoup.parser.Token.TokenType tokenType54 = org.jsoup.parser.Token.TokenType.StartTag;
        tag53.type = tokenType54;
        startTag41.type = tokenType54;
        org.jsoup.nodes.Attributes attributes57 = startTag41.getAttributes();
        boolean boolean58 = startTag41.isSelfClosing();
        boolean boolean59 = startTag41.isCharacter();
        org.jsoup.parser.Token.TokenType tokenType60 = startTag41.type;
        doctype31.type = tokenType60;
        tag9.type = tokenType60;
        boolean boolean63 = tag9.isCharacter();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<<!---->>" + "'", str4, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(stringBuilder33);
        org.junit.Assert.assertEquals(stringBuilder33.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder37);
        org.junit.Assert.assertEquals(stringBuilder37.toString(), "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(tag53);
        org.junit.Assert.assertTrue("'" + tokenType54 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType54.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(attributes57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + tokenType60 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType60.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        org.jsoup.parser.Token.Doctype doctype4 = new org.jsoup.parser.Token.Doctype();
        boolean boolean5 = doctype4.isForceQuirks();
        boolean boolean6 = doctype4.isForceQuirks();
        java.lang.StringBuilder stringBuilder7 = doctype4.systemIdentifier;
        java.lang.StringBuilder stringBuilder8 = doctype4.name;
        doctype4.forceQuirks = true;
        org.jsoup.nodes.Attributes attributes12 = null;
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("hi!", attributes12);
        startTag13.appendAttributeValue(' ');
        java.lang.String str16 = startTag13.tokenType();
        java.lang.String str17 = startTag13.name();
        startTag13.appendTagName("<!---->");
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        startTag20.appendAttributeValue('4');
        boolean boolean23 = startTag20.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType24 = startTag20.type;
        startTag13.type = tokenType24;
        doctype4.type = tokenType24;
        org.jsoup.parser.Token.TokenType tokenType27 = doctype4.type;
        endTag1.type = tokenType27;
        boolean boolean29 = endTag1.isCharacter();
        endTag1.appendAttributeName("hi!");
        java.lang.String str32 = endTag1.toString();
        boolean boolean33 = endTag1.isComment();
        java.lang.String str34 = endTag1.name();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</<!---->>" + "'", str2, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</<!---->>" + "'", str3, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "StartTag" + "'", str16, "StartTag");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + tokenType24 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType24.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + tokenType27 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType27.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "</<!---->>" + "'", str32, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!---->" + "'", str34, "<!---->");
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        endTag1.appendTagName("StartTag");
        org.jsoup.nodes.Attributes attributes7 = endTag1.attributes;
        endTag1.appendAttributeName('4');
        java.lang.String str10 = endTag1.toString();
        endTag1.tagName = "<4>";
        boolean boolean13 = endTag1.isEOF();
        endTag1.finaliseTag();
        endTag1.appendAttributeValue(' ');
        endTag1.appendAttributeValue(' ');
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "</<!---->StartTag>" + "'", str10, "</<!---->StartTag>");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        endTag1.appendTagName("StartTag");
        endTag1.finaliseTag();
        endTag1.newAttribute();
        boolean boolean9 = endTag1.isCharacter();
        org.jsoup.parser.Token.Doctype doctype10 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str11 = doctype10.getName();
        java.lang.StringBuilder stringBuilder12 = doctype10.name;
        doctype10.forceQuirks = false;
        boolean boolean15 = doctype10.forceQuirks;
        java.lang.StringBuilder stringBuilder16 = doctype10.systemIdentifier;
        org.jsoup.parser.Token.Doctype doctype17 = doctype10.asDoctype();
        boolean boolean18 = doctype17.forceQuirks;
        boolean boolean19 = doctype17.isForceQuirks();
        org.jsoup.parser.Token.EndTag endTag21 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str22 = endTag21.toString();
        endTag21.appendAttributeValue('4');
        boolean boolean25 = endTag21.isEOF();
        java.lang.String str26 = endTag21.toString();
        org.jsoup.parser.Token.EndTag endTag28 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str29 = endTag28.toString();
        endTag28.appendAttributeValue('4');
        boolean boolean32 = endTag28.isSelfClosing();
        endTag28.finaliseTag();
        org.jsoup.parser.Token.TokenType tokenType34 = endTag28.type;
        endTag21.type = tokenType34;
        org.jsoup.parser.Token.TokenType tokenType36 = endTag21.type;
        doctype17.type = tokenType36;
        endTag1.type = tokenType36;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
        org.junit.Assert.assertNotNull(doctype17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "</<!---->>" + "'", str22, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "</<!---->>" + "'", str26, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "</<!---->>" + "'", str29, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + tokenType34 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType34.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + tokenType36 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType36.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        boolean boolean2 = doctype0.isDoctype();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        java.lang.String str7 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder9 = doctype0.name;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        doctype0.forceQuirks = true;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        java.lang.String str7 = doctype0.getPublicIdentifier();
        boolean boolean8 = doctype0.forceQuirks;
        boolean boolean9 = doctype0.forceQuirks;
        org.jsoup.parser.Token.Doctype doctype10 = doctype0.asDoctype();
        java.lang.String str11 = doctype10.getPublicIdentifier();
        java.lang.String str12 = doctype10.getName();
        java.lang.String str13 = doctype10.getName();
        java.lang.StringBuilder stringBuilder14 = doctype10.name;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(doctype10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType5 = org.jsoup.parser.Token.TokenType.Doctype;
        comment4.type = tokenType5;
        startTag2.type = tokenType5;
        java.lang.String str8 = startTag2.tagName;
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes12 = null;
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("hi!", attributes12);
        startTag13.newAttribute();
        startTag13.tagName = "";
        org.jsoup.nodes.Attributes attributes17 = startTag13.attributes;
        startTag10.attributes = attributes17;
        startTag2.attributes = attributes17;
        java.lang.String str20 = startTag2.tagName;
        boolean boolean21 = startTag2.isCharacter();
        startTag2.appendAttributeValue("</<<!---->>>");
        startTag2.appendAttributeValue('#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes4 = null;
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag("hi!", attributes4);
        startTag5.newAttribute();
        startTag5.tagName = "";
        org.jsoup.nodes.Attributes attributes9 = startTag5.attributes;
        startTag2.attributes = attributes9;
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("StartTag", attributes9);
        java.lang.String str12 = startTag11.tagName;
        java.lang.String str13 = startTag11.name();
        boolean boolean14 = startTag11.selfClosing;
        org.jsoup.parser.Token.TokenType tokenType15 = startTag11.type;
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "StartTag" + "'", str12, "StartTag");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "StartTag" + "'", str13, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.tokenType();
        startTag1.appendAttributeValue('#');
        org.jsoup.parser.Token.Tag tag6 = startTag1.name("<StartTag>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes4 = null;
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag("hi!", attributes4);
        startTag5.newAttribute();
        startTag5.tagName = "";
        org.jsoup.nodes.Attributes attributes9 = startTag5.attributes;
        startTag2.attributes = attributes9;
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("StartTag", attributes9);
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes15 = null;
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag("hi!", attributes15);
        startTag16.newAttribute();
        startTag16.tagName = "";
        org.jsoup.nodes.Attributes attributes20 = startTag16.attributes;
        startTag13.attributes = attributes20;
        startTag11.attributes = attributes20;
        startTag11.finaliseTag();
        boolean boolean24 = startTag11.isCharacter();
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendTagName('4');
        startTag2.appendAttributeValue("<!---->");
        java.lang.String str8 = startTag2.tokenType();
        org.jsoup.parser.Token.StartTag startTag9 = startTag2.asStartTag();
        startTag2.appendAttributeName("</<hi!>>");
        startTag2.appendAttributeValue("<</<hi!>>>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "StartTag" + "'", str8, "StartTag");
        org.junit.Assert.assertNotNull(startTag9);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("");
        java.lang.String str2 = character1.toString();
        java.lang.String str3 = character1.getData();
        java.lang.String str4 = character1.toString();
        boolean boolean5 = character1.isCharacter();
        java.lang.String str6 = character1.getData();
        boolean boolean7 = character1.isDoctype();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList3);
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str7 = endTag6.toString();
        java.lang.String str8 = endTag6.toString();
        boolean boolean9 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag6);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        xmlTreeBuilder0.initialiseParse("hi!<!---->", "", parseErrorList12);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        xmlTreeBuilder14.initialiseParse("</<!---->>", "</<!---->>", parseErrorList17);
        org.jsoup.parser.Token.Comment comment19 = new org.jsoup.parser.Token.Comment();
        java.lang.String str20 = comment19.toString();
        org.jsoup.parser.Token.TokenType tokenType21 = comment19.type;
        java.lang.String str22 = comment19.getData();
        xmlTreeBuilder14.insert(comment19);
        org.jsoup.parser.Token.Comment comment24 = new org.jsoup.parser.Token.Comment();
        java.lang.String str25 = comment24.toString();
        org.jsoup.parser.Token.TokenType tokenType26 = comment24.type;
        java.lang.String str27 = comment24.toString();
        xmlTreeBuilder14.insert(comment24);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        xmlTreeBuilder29.initialiseParse("</<!---->>", "StartTag", parseErrorList32);
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        xmlTreeBuilder29.initialiseParse("<!---->", "<<!---->>", parseErrorList36);
        org.jsoup.parser.Token.Character character39 = new org.jsoup.parser.Token.Character("");
        java.lang.String str40 = character39.toString();
        java.lang.String str41 = character39.getData();
        java.lang.String str42 = character39.toString();
        java.lang.String str43 = character39.toString();
        boolean boolean44 = xmlTreeBuilder29.process((org.jsoup.parser.Token) character39);
        xmlTreeBuilder14.insert(character39);
        org.jsoup.parser.Token.StartTag startTag46 = new org.jsoup.parser.Token.StartTag();
        startTag46.appendAttributeValue('4');
        boolean boolean49 = startTag46.isDoctype();
        boolean boolean50 = startTag46.isDoctype();
        java.lang.String str51 = startTag46.tokenType();
        startTag46.appendTagName('a');
        org.jsoup.parser.Token.Tag tag55 = startTag46.name("hi!");
        boolean boolean56 = xmlTreeBuilder14.process((org.jsoup.parser.Token) startTag46);
        org.jsoup.nodes.Element element57 = xmlTreeBuilder0.insert(startTag46);
        org.jsoup.parser.Token.StartTag startTag61 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes63 = null;
        org.jsoup.parser.Token.StartTag startTag64 = new org.jsoup.parser.Token.StartTag("hi!", attributes63);
        startTag64.newAttribute();
        startTag64.tagName = "";
        org.jsoup.nodes.Attributes attributes68 = startTag64.attributes;
        startTag61.attributes = attributes68;
        org.jsoup.parser.Token.StartTag startTag70 = new org.jsoup.parser.Token.StartTag("StartTag", attributes68);
        org.jsoup.parser.Token.StartTag startTag71 = new org.jsoup.parser.Token.StartTag("StartTag", attributes68);
        org.jsoup.nodes.Element element72 = xmlTreeBuilder0.insert(startTag71);
        startTag71.tagName = "";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str75 = startTag71.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</<!---->>" + "'", str7, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</<!---->>" + "'", str8, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!---->" + "'", str20, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType21 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType21.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!---->" + "'", str25, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType26 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType26.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!---->" + "'", str27, "<!---->");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "StartTag" + "'", str51, "StartTag");
        org.junit.Assert.assertNotNull(tag55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(attributes68);
        org.junit.Assert.assertNotNull(element72);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<hi!>");
        boolean boolean2 = endTag1.isCharacter();
        java.lang.String str3 = endTag1.toString();
        endTag1.appendTagName('4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</<hi!>>" + "'", str3, "</<hi!>>");
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.selfClosing;
        org.jsoup.parser.Token.Tag tag3 = endTag0.name("<!---->");
        endTag0.tagName = "EndTag";
        org.jsoup.nodes.Attributes attributes6 = endTag0.attributes;
        java.lang.String str7 = endTag0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</EndTag>" + "'", str7, "</EndTag>");
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        xmlTreeBuilder0.initialiseParse("<<<!---->>>", "</</<!---->>>", parseErrorList10);
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        boolean boolean13 = comment12.isStartTag();
        org.jsoup.parser.Token.Comment comment14 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType15 = org.jsoup.parser.Token.TokenType.Doctype;
        comment14.type = tokenType15;
        comment12.type = tokenType15;
        boolean boolean18 = comment12.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType19 = comment12.type;
        java.lang.String str20 = comment12.getData();
        java.lang.StringBuilder stringBuilder21 = comment12.data;
        java.lang.StringBuilder stringBuilder22 = comment12.data;
        xmlTreeBuilder0.insert(comment12);
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        xmlTreeBuilder0.initialiseParse("hi!<<!----><hi!>>", "<hi!<!---->>", parseErrorList26);
        org.jsoup.parser.Token.Comment comment28 = new org.jsoup.parser.Token.Comment();
        java.lang.String str29 = comment28.toString();
        org.jsoup.parser.Token.TokenType tokenType30 = comment28.type;
        boolean boolean31 = comment28.isComment();
        java.lang.String str32 = comment28.getData();
        org.jsoup.parser.Token.EndTag endTag34 = new org.jsoup.parser.Token.EndTag("");
        org.jsoup.nodes.Attributes attributes36 = null;
        org.jsoup.parser.Token.StartTag startTag37 = new org.jsoup.parser.Token.StartTag("hi!", attributes36);
        org.jsoup.parser.Token.TokenType tokenType38 = startTag37.type;
        endTag34.type = tokenType38;
        comment28.type = tokenType38;
        org.jsoup.parser.Token.TokenType tokenType41 = comment28.type;
        xmlTreeBuilder0.insert(comment28);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + tokenType19 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType19.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!---->" + "'", str29, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType30 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType30.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + tokenType38 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType38.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + tokenType41 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType41.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        org.jsoup.parser.Token.TokenType tokenType7 = comment5.type;
        java.lang.String str8 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Comment comment10 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType11 = org.jsoup.parser.Token.TokenType.Doctype;
        comment10.type = tokenType11;
        xmlTreeBuilder0.insert(comment10);
        java.lang.String str14 = comment10.toString();
        boolean boolean15 = comment10.isEOF();
        java.lang.String str16 = comment10.toString();
        java.lang.String str17 = comment10.getData();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!---->" + "'", str14, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!---->" + "'", str16, "<!---->");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        org.jsoup.parser.Token.TokenType tokenType3 = startTag2.type;
        startTag2.finaliseTag();
        startTag2.appendAttributeValue('a');
        startTag2.appendAttributeName('4');
        java.lang.String str9 = startTag2.tokenType();
        startTag2.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag11 = startTag2.asStartTag();
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "StartTag" + "'", str9, "StartTag");
        org.junit.Assert.assertNotNull(startTag11);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.tokenType();
        boolean boolean3 = startTag1.isComment();
        java.lang.String str4 = startTag1.toString();
        boolean boolean5 = startTag1.isComment();
        org.jsoup.parser.Token.Tag tag7 = startTag1.name("");
        boolean boolean8 = tag7.isStartTag();
        org.jsoup.parser.Token.Doctype doctype9 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str10 = doctype9.getPublicIdentifier();
        java.lang.String str11 = doctype9.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType12 = org.jsoup.parser.Token.TokenType.EOF;
        doctype9.type = tokenType12;
        tag7.type = tokenType12;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment15 = tag7.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<<!---->>" + "'", str4, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.EOF));
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("hi!", attributes3);
        startTag4.newAttribute();
        startTag4.tagName = "";
        org.jsoup.nodes.Attributes attributes8 = startTag4.attributes;
        startTag1.attributes = attributes8;
        boolean boolean10 = startTag1.isDoctype();
        org.jsoup.parser.Token.StartTag startTag11 = startTag1.asStartTag();
        startTag1.tagName = "<hi!</</<!---->>>>";
        org.jsoup.parser.Token.Tag tag15 = startTag1.name("</</<!---->>>");
        org.jsoup.parser.Token.Tag tag17 = tag15.name("hi!4");
        tag17.appendTagName("<</hi!<!---->>>");
        tag17.selfClosing = true;
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(tag17);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendAttributeName("StartTag");
        startTag2.appendAttributeName("");
        startTag2.appendAttributeName('#');
        org.jsoup.parser.Token.Tag tag11 = startTag2.name("<!---->");
        java.lang.String str12 = startTag2.tokenType();
        startTag2.tagName = "<hi!4>";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "StartTag" + "'", str12, "StartTag");
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("EndTag");
        org.jsoup.nodes.Attributes attributes2 = endTag1.attributes;
        endTag1.appendAttributeName("</</</<!---->>>>");
        org.junit.Assert.assertNull(attributes2);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("");
        java.lang.String str2 = character1.toString();
        java.lang.String str3 = character1.toString();
        java.lang.String str4 = character1.getData();
        boolean boolean5 = character1.isComment();
        java.lang.String str6 = character1.getData();
        java.lang.String str7 = character1.getData();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("<hi!Comment>");
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "<!---->", parseErrorList7);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        java.lang.String str10 = comment9.getData();
        xmlTreeBuilder0.insert(comment9);
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        java.lang.String str13 = comment12.toString();
        boolean boolean14 = comment12.isEndTag();
        xmlTreeBuilder0.insert(comment12);
        org.jsoup.parser.Token.Comment comment16 = new org.jsoup.parser.Token.Comment();
        boolean boolean17 = comment16.isStartTag();
        org.jsoup.parser.Token.Comment comment18 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType19 = org.jsoup.parser.Token.TokenType.Doctype;
        comment18.type = tokenType19;
        comment16.type = tokenType19;
        xmlTreeBuilder0.insert(comment16);
        java.lang.String str23 = comment16.toString();
        java.lang.String str24 = comment16.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + tokenType19 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType19.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<!---->" + "'", str23, "<!---->");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!---->" + "'", str24, "<!---->");
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType4 = startTag0.type;
        java.lang.String str5 = startTag0.tagName;
        boolean boolean6 = startTag0.isEndTag();
        startTag0.appendAttributeValue("");
        startTag0.appendAttributeValue('a');
        startTag0.appendAttributeValue('4');
        org.jsoup.parser.Token.Tag tag14 = startTag0.name("</<hi!>a>");
        startTag0.appendAttributeName('a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag14);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        boolean boolean2 = doctype0.isDoctype();
        java.lang.String str3 = doctype0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        doctype0.forceQuirks = true;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        boolean boolean7 = doctype0.isForceQuirks();
        doctype0.forceQuirks = false;
        java.lang.String str10 = doctype0.getSystemIdentifier();
        java.lang.String str11 = doctype0.getPublicIdentifier();
        boolean boolean12 = doctype0.isEOF();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("<!---->", attributes1);
        java.lang.String str3 = startTag2.toString();
        boolean boolean4 = startTag2.selfClosing;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<<!---->>" + "'", str3, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder3 = doctype0.publicIdentifier;
        java.lang.String str4 = doctype0.getName();
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        java.lang.String str8 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Character character9 = new org.jsoup.parser.Token.Character("");
        java.lang.String str10 = character9.toString();
        xmlTreeBuilder0.insert(character9);
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        xmlTreeBuilder0.initialiseParse("Doctype", "</</<!---->>>", parseErrorList14);
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str18 = startTag17.tokenType();
        boolean boolean19 = startTag17.isSelfClosing();
        startTag17.finaliseTag();
        org.jsoup.nodes.Attributes attributes21 = startTag17.getAttributes();
        org.jsoup.nodes.Element element22 = xmlTreeBuilder0.insert(startTag17);
        java.lang.Class<?> wildcardClass23 = startTag17.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "StartTag" + "'", str18, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.forceQuirks = false;
        java.lang.String str5 = doctype0.getName();
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.String str7 = doctype0.tokenType();
        doctype0.forceQuirks = true;
        doctype0.forceQuirks = true;
        java.lang.String str12 = doctype0.getPublicIdentifier();
        boolean boolean13 = doctype0.forceQuirks;
        java.lang.String str14 = doctype0.getName();
        boolean boolean15 = doctype0.isForceQuirks();
        java.lang.String str16 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder17 = doctype0.name;
        boolean boolean18 = doctype0.isDoctype();
        boolean boolean19 = doctype0.isEndTag();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Doctype" + "'", str7, "Doctype");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        java.lang.String str3 = doctype0.getSystemIdentifier();
        java.lang.String str4 = doctype0.getName();
        java.lang.String str5 = doctype0.getSystemIdentifier();
        boolean boolean6 = doctype0.isComment();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        boolean boolean4 = startTag0.isEOF();
        startTag0.newAttribute();
        boolean boolean6 = startTag0.isSelfClosing();
        startTag0.tagName = "hi!EndTag";
        boolean boolean9 = startTag0.selfClosing;
        startTag0.newAttribute();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isEOF();
        startTag0.appendAttributeValue("hi!");
        startTag0.appendTagName('4');
        boolean boolean9 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag11 = startTag0.name("hi!");
        boolean boolean12 = startTag0.isComment();
        org.jsoup.parser.Token.StartTag startTag13 = startTag0.asStartTag();
        org.jsoup.parser.Token.StartTag startTag14 = startTag13.asStartTag();
        org.jsoup.nodes.Attributes attributes15 = startTag13.getAttributes();
        boolean boolean16 = startTag13.isCharacter();
        boolean boolean17 = startTag13.isCharacter();
        boolean boolean18 = startTag13.isSelfClosing();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(startTag13);
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder3 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder4 = doctype0.name;
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        java.lang.String str7 = doctype0.getSystemIdentifier();
        java.lang.String str8 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "<!---->", parseErrorList7);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        java.lang.String str10 = comment9.getData();
        xmlTreeBuilder0.insert(comment9);
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        java.lang.String str13 = comment12.toString();
        boolean boolean14 = comment12.isEndTag();
        xmlTreeBuilder0.insert(comment12);
        org.jsoup.parser.Token.Character character17 = new org.jsoup.parser.Token.Character("<<!---->>");
        java.lang.String str18 = character17.getData();
        xmlTreeBuilder0.insert(character17);
        org.jsoup.nodes.Attributes attributes21 = null;
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag("hi!", attributes21);
        org.jsoup.parser.Token.TokenType tokenType23 = startTag22.type;
        startTag22.selfClosing = true;
        startTag22.selfClosing = true;
        java.lang.String str28 = startTag22.toString();
        java.lang.String str29 = startTag22.toString();
        org.jsoup.parser.Token.Tag tag31 = startTag22.name("<<!----><hi!>>");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<<!---->>" + "'", str18, "<<!---->>");
        org.junit.Assert.assertTrue("'" + tokenType23 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType23.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<hi!>" + "'", str28, "<hi!>");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<hi!>" + "'", str29, "<hi!>");
        org.junit.Assert.assertNotNull(tag31);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isEOF();
        startTag0.appendAttributeValue("hi!");
        startTag0.appendTagName('4');
        boolean boolean9 = startTag0.isComment();
        startTag0.appendAttributeName("<!---->");
        boolean boolean12 = startTag0.isSelfClosing();
        java.lang.String str13 = startTag0.name();
        startTag0.appendAttributeValue('#');
        org.jsoup.parser.Token.EndTag endTag17 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag17.appendAttributeValue('#');
        endTag17.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag21 = new org.jsoup.parser.Token.EndTag();
        boolean boolean22 = endTag21.selfClosing;
        org.jsoup.parser.Token.Tag tag24 = endTag21.name("<!---->");
        org.jsoup.parser.Token.TokenType tokenType25 = org.jsoup.parser.Token.TokenType.StartTag;
        tag24.type = tokenType25;
        endTag17.type = tokenType25;
        startTag0.type = tokenType25;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4" + "'", str13, "4");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertTrue("'" + tokenType25 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType25.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("hi!", attributes3);
        startTag4.newAttribute();
        startTag4.tagName = "";
        org.jsoup.nodes.Attributes attributes8 = startTag4.attributes;
        startTag1.attributes = attributes8;
        boolean boolean10 = startTag1.isDoctype();
        org.jsoup.parser.Token.StartTag startTag11 = startTag1.asStartTag();
        startTag11.appendTagName('4');
        boolean boolean14 = startTag11.isDoctype();
        org.jsoup.nodes.Attributes attributes15 = startTag11.attributes;
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "<!---->", parseErrorList7);
        org.jsoup.parser.Token.Character character10 = new org.jsoup.parser.Token.Character("");
        java.lang.String str11 = character10.toString();
        java.lang.String str12 = character10.toString();
        java.lang.String str13 = character10.toString();
        java.lang.String str14 = character10.getData();
        xmlTreeBuilder0.insert(character10);
        java.lang.String str16 = character10.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag17 = character10.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.newAttribute();
        startTag2.tagName = "";
        boolean boolean6 = startTag2.isComment();
        startTag2.appendAttributeValue("<!----><<!---->>");
        org.jsoup.parser.Token.EndTag endTag10 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag10.appendAttributeValue('#');
        endTag10.finaliseTag();
        endTag10.appendTagName("StartTag");
        org.jsoup.nodes.Attributes attributes16 = endTag10.attributes;
        endTag10.appendAttributeName('4');
        java.lang.String str19 = endTag10.toString();
        endTag10.appendAttributeName('4');
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes26 = null;
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag("hi!", attributes26);
        startTag27.newAttribute();
        startTag27.tagName = "";
        org.jsoup.nodes.Attributes attributes31 = startTag27.attributes;
        startTag24.attributes = attributes31;
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag("StartTag", attributes31);
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes37 = null;
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag("hi!", attributes37);
        startTag38.newAttribute();
        startTag38.tagName = "";
        org.jsoup.nodes.Attributes attributes42 = startTag38.attributes;
        startTag35.attributes = attributes42;
        startTag33.attributes = attributes42;
        startTag33.newAttribute();
        org.jsoup.nodes.Attributes attributes47 = null;
        org.jsoup.parser.Token.StartTag startTag48 = new org.jsoup.parser.Token.StartTag("hi!", attributes47);
        boolean boolean49 = startTag48.isComment();
        startTag48.appendAttributeName('4');
        java.lang.String str52 = startTag48.tokenType();
        org.jsoup.nodes.Attributes attributes54 = null;
        org.jsoup.parser.Token.StartTag startTag55 = new org.jsoup.parser.Token.StartTag("hi!", attributes54);
        startTag55.appendAttributeValue(' ');
        java.lang.String str58 = startTag55.tokenType();
        java.lang.String str59 = startTag55.name();
        startTag55.appendTagName("<!---->");
        startTag55.tagName = "StartTag";
        org.jsoup.parser.Token.StartTag startTag64 = new org.jsoup.parser.Token.StartTag();
        startTag64.selfClosing = false;
        startTag64.appendTagName("hi!");
        org.jsoup.nodes.Attributes attributes69 = startTag64.getAttributes();
        startTag55.attributes = attributes69;
        startTag48.attributes = attributes69;
        startTag33.attributes = attributes69;
        endTag10.attributes = attributes69;
        startTag2.attributes = attributes69;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(attributes16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "</<!---->StartTag>" + "'", str19, "</<!---->StartTag>");
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "StartTag" + "'", str52, "StartTag");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "StartTag" + "'", str58, "StartTag");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNotNull(attributes69);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        endTag1.tagName = "";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype6 = endTag1.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</<!---->>" + "'", str2, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</<!---->>" + "'", str3, "</<!---->>");
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("hi!", attributes3);
        startTag4.newAttribute();
        startTag4.tagName = "";
        org.jsoup.nodes.Attributes attributes8 = startTag4.attributes;
        startTag1.attributes = attributes8;
        boolean boolean10 = startTag1.isDoctype();
        org.jsoup.parser.Token.StartTag startTag11 = startTag1.asStartTag();
        startTag1.selfClosing = true;
        org.jsoup.parser.Token.TokenType tokenType14 = startTag1.type;
        startTag1.appendAttributeValue("hi!");
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        startTag17.appendAttributeValue('4');
        boolean boolean20 = startTag17.isEndTag();
        boolean boolean21 = startTag17.isEOF();
        startTag17.appendAttributeValue("hi!");
        startTag17.appendTagName('4');
        boolean boolean26 = startTag17.isSelfClosing();
        boolean boolean27 = startTag17.isComment();
        boolean boolean28 = startTag17.isEOF();
        startTag17.finaliseTag();
        org.jsoup.nodes.Attributes attributes31 = null;
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag("hi!", attributes31);
        boolean boolean33 = startTag32.isComment();
        org.jsoup.parser.Token.Comment comment34 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType35 = org.jsoup.parser.Token.TokenType.Doctype;
        comment34.type = tokenType35;
        startTag32.type = tokenType35;
        java.lang.String str38 = startTag32.tagName;
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes42 = null;
        org.jsoup.parser.Token.StartTag startTag43 = new org.jsoup.parser.Token.StartTag("hi!", attributes42);
        startTag43.newAttribute();
        startTag43.tagName = "";
        org.jsoup.nodes.Attributes attributes47 = startTag43.attributes;
        startTag40.attributes = attributes47;
        startTag32.attributes = attributes47;
        startTag32.appendAttributeValue(' ');
        org.jsoup.nodes.Attributes attributes52 = startTag32.getAttributes();
        startTag17.attributes = attributes52;
        startTag1.attributes = attributes52;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype55 = startTag1.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + tokenType35 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType35.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(attributes47);
        org.junit.Assert.assertNotNull(attributes52);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("<!---->#");
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "<!---->", parseErrorList7);
        org.jsoup.parser.Token.Character character10 = new org.jsoup.parser.Token.Character("");
        java.lang.String str11 = character10.toString();
        xmlTreeBuilder0.insert(character10);
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag("hi!", attributes14);
        startTag15.appendAttributeValue(' ');
        boolean boolean18 = startTag15.isSelfClosing();
        boolean boolean19 = startTag15.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType20 = startTag15.type;
        boolean boolean21 = startTag15.isDoctype();
        boolean boolean22 = startTag15.isSelfClosing();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element23 = xmlTreeBuilder0.insert(startTag15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType5 = org.jsoup.parser.Token.TokenType.Doctype;
        comment4.type = tokenType5;
        startTag2.type = tokenType5;
        startTag2.appendAttributeName("hi!");
        org.jsoup.parser.Token.EndTag endTag10 = new org.jsoup.parser.Token.EndTag();
        boolean boolean11 = endTag10.selfClosing;
        org.jsoup.parser.Token.Tag tag13 = endTag10.name("<!---->");
        org.jsoup.parser.Token.TokenType tokenType14 = org.jsoup.parser.Token.TokenType.StartTag;
        tag13.type = tokenType14;
        startTag2.type = tokenType14;
        startTag2.tagName = "<!----><<!---->>a";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        java.lang.StringBuilder stringBuilder2 = comment0.data;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        boolean boolean4 = comment0.isEndTag();
        boolean boolean5 = comment0.isCharacter();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->StartTag");
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        boolean boolean2 = startTag1.isSelfClosing();
        boolean boolean3 = startTag1.isDoctype();
        startTag1.newAttribute();
        org.jsoup.parser.Token.Tag tag6 = startTag1.name("<<!---->>");
        boolean boolean7 = tag6.isCharacter();
        tag6.appendAttributeValue('#');
        tag6.appendTagName('4');
        boolean boolean12 = tag6.isSelfClosing();
        java.lang.String str13 = tag6.name();
        boolean boolean14 = tag6.selfClosing;
        tag6.tagName = "<StartTag>";
        tag6.newAttribute();
        tag6.finaliseTag();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<<!---->>4" + "'", str13, "<<!---->>4");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "<!---->", parseErrorList7);
        org.jsoup.parser.Token.Character character10 = new org.jsoup.parser.Token.Character("");
        java.lang.String str11 = character10.toString();
        xmlTreeBuilder0.insert(character10);
        org.jsoup.parser.Token.Doctype doctype13 = new org.jsoup.parser.Token.Doctype();
        boolean boolean14 = doctype13.isForceQuirks();
        java.lang.String str15 = doctype13.getName();
        boolean boolean16 = doctype13.isForceQuirks();
        java.lang.String str17 = doctype13.getPublicIdentifier();
        boolean boolean18 = doctype13.isStartTag();
        doctype13.forceQuirks = false;
        java.lang.String str21 = doctype13.getPublicIdentifier();
        java.lang.String str22 = doctype13.getPublicIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        startTag0.newAttribute();
        boolean boolean5 = startTag0.isComment();
        boolean boolean6 = startTag0.selfClosing;
        org.jsoup.nodes.Attributes attributes7 = null;
        startTag0.attributes = attributes7;
        org.jsoup.parser.Token.EndTag endTag9 = new org.jsoup.parser.Token.EndTag();
        boolean boolean10 = endTag9.selfClosing;
        org.jsoup.parser.Token.Tag tag12 = endTag9.name("<!---->");
        org.jsoup.parser.Token.TokenType tokenType13 = org.jsoup.parser.Token.TokenType.StartTag;
        tag12.type = tokenType13;
        startTag0.type = tokenType13;
        org.jsoup.nodes.Attributes attributes16 = startTag0.getAttributes();
        startTag0.appendAttributeValue("<<<!---->>>");
        boolean boolean19 = startTag0.isDoctype();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = startTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(attributes16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        org.jsoup.parser.Token.TokenType tokenType4 = doctype0.type;
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType4 = startTag0.type;
        java.lang.String str5 = startTag0.tagName;
        boolean boolean6 = startTag0.isEndTag();
        org.jsoup.nodes.Attributes attributes7 = startTag0.getAttributes();
        org.jsoup.nodes.Attributes attributes8 = startTag0.getAttributes();
        startTag0.newAttribute();
        startTag0.selfClosing = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        boolean boolean2 = startTag1.isSelfClosing();
        boolean boolean3 = startTag1.isDoctype();
        startTag1.newAttribute();
        org.jsoup.parser.Token.Tag tag6 = startTag1.name("<<!---->>");
        boolean boolean7 = tag6.isCharacter();
        org.jsoup.parser.Token.Tag tag9 = tag6.name("</<!---->>");
        tag9.appendAttributeValue("<hi!>");
        tag9.appendTagName('#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        org.jsoup.parser.Token.TokenType tokenType7 = comment5.type;
        java.lang.String str8 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Comment comment10 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType11 = org.jsoup.parser.Token.TokenType.Doctype;
        comment10.type = tokenType11;
        xmlTreeBuilder0.insert(comment10);
        org.jsoup.parser.Token.Comment comment14 = new org.jsoup.parser.Token.Comment();
        java.lang.String str15 = comment14.toString();
        boolean boolean16 = comment14.isEOF();
        boolean boolean17 = comment14.isEndTag();
        xmlTreeBuilder0.insert(comment14);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        xmlTreeBuilder0.initialiseParse("EndTag", "<<hi!>StartTag>", parseErrorList21);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder23 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        xmlTreeBuilder23.initialiseParse("</<!---->>", "</<!---->>", parseErrorList26);
        org.jsoup.parser.Token.Comment comment28 = new org.jsoup.parser.Token.Comment();
        java.lang.String str29 = comment28.toString();
        org.jsoup.parser.Token.TokenType tokenType30 = comment28.type;
        java.lang.String str31 = comment28.getData();
        xmlTreeBuilder23.insert(comment28);
        org.jsoup.parser.Token.Comment comment33 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType34 = org.jsoup.parser.Token.TokenType.Doctype;
        comment33.type = tokenType34;
        xmlTreeBuilder23.insert(comment33);
        org.jsoup.parser.Token.Comment comment37 = new org.jsoup.parser.Token.Comment();
        java.lang.String str38 = comment37.toString();
        boolean boolean39 = comment37.isEOF();
        boolean boolean40 = comment37.isEndTag();
        xmlTreeBuilder23.insert(comment37);
        xmlTreeBuilder0.insert(comment37);
        org.jsoup.parser.Token.EndTag endTag44 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag44.appendAttributeValue('#');
        boolean boolean47 = endTag44.isEndTag();
        boolean boolean48 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag44);
        boolean boolean49 = endTag44.isSelfClosing();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!---->" + "'", str15, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!---->" + "'", str29, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType30 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType30.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + tokenType34 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType34.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<!---->" + "'", str38, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType5 = org.jsoup.parser.Token.TokenType.Doctype;
        comment4.type = tokenType5;
        startTag2.type = tokenType5;
        startTag2.tagName = "<hi!>";
        startTag2.appendAttributeValue('4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("<</</<!---->>>>");
        java.lang.String str2 = character1.toString();
        java.lang.Class<?> wildcardClass3 = character1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<</</<!---->>>>" + "'", str2, "<</</<!---->>>>");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        org.jsoup.nodes.Attributes attributes2 = endTag1.getAttributes();
        endTag1.appendTagName(' ');
        org.junit.Assert.assertNull(attributes2);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType5 = org.jsoup.parser.Token.TokenType.Doctype;
        comment4.type = tokenType5;
        startTag2.type = tokenType5;
        startTag2.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag11 = startTag2.name("</</<!---->>>");
        boolean boolean12 = tag11.isSelfClosing();
        org.jsoup.nodes.Attributes attributes13 = tag11.attributes;
        tag11.appendAttributeName('a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(attributes13);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.isCharacter();
        org.jsoup.parser.Token.Doctype doctype5 = doctype0.asDoctype();
        org.jsoup.parser.Token.Doctype doctype6 = doctype5.asDoctype();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doctype5);
        org.junit.Assert.assertNotNull(doctype6);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        boolean boolean6 = doctype0.isForceQuirks();
        java.lang.String str7 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        boolean boolean2 = doctype0.forceQuirks;
        boolean boolean3 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        boolean boolean5 = doctype0.isStartTag();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.tokenType();
        boolean boolean3 = startTag1.isComment();
        java.lang.String str4 = startTag1.toString();
        boolean boolean5 = startTag1.isComment();
        java.lang.String str6 = startTag1.toString();
        boolean boolean7 = startTag1.isEndTag();
        startTag1.appendAttributeValue("<!---->hi!");
        org.jsoup.parser.Token.TokenType tokenType10 = startTag1.type;
        startTag1.appendTagName("<hi!EndTag>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<<!---->>" + "'", str4, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<<!---->>" + "'", str6, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder3 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder4 = doctype0.name;
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        java.lang.String str7 = doctype0.getSystemIdentifier();
        java.lang.String str8 = doctype0.getName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        org.jsoup.nodes.Attributes attributes4 = startTag2.getAttributes();
        boolean boolean5 = startTag2.isCharacter();
        boolean boolean6 = startTag2.isStartTag();
        startTag2.appendAttributeName('4');
        startTag2.tagName = "Character";
        startTag2.appendAttributeValue('4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendTagName('4');
        startTag2.appendAttributeValue("<!---->");
        java.lang.String str8 = startTag2.tokenType();
        org.jsoup.parser.Token.StartTag startTag9 = startTag2.asStartTag();
        boolean boolean10 = startTag2.selfClosing;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "StartTag" + "'", str8, "StartTag");
        org.junit.Assert.assertNotNull(startTag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        xmlTreeBuilder0.initialiseParse("<<<!---->>>", "</</<!---->>>", parseErrorList10);
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        boolean boolean13 = comment12.isStartTag();
        org.jsoup.parser.Token.Comment comment14 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType15 = org.jsoup.parser.Token.TokenType.Doctype;
        comment14.type = tokenType15;
        comment12.type = tokenType15;
        boolean boolean18 = comment12.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType19 = comment12.type;
        java.lang.String str20 = comment12.getData();
        java.lang.StringBuilder stringBuilder21 = comment12.data;
        java.lang.StringBuilder stringBuilder22 = comment12.data;
        xmlTreeBuilder0.insert(comment12);
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        xmlTreeBuilder0.initialiseParse("hi!<<!----><hi!>>", "<hi!<!---->>", parseErrorList26);
        org.jsoup.parser.Token.Character character29 = new org.jsoup.parser.Token.Character("");
        java.lang.String str30 = character29.toString();
        java.lang.String str31 = character29.toString();
        java.lang.String str32 = character29.getData();
        java.lang.String str33 = character29.toString();
        java.lang.String str34 = character29.getData();
        xmlTreeBuilder0.insert(character29);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + tokenType19 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType19.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.tokenType();
        boolean boolean3 = startTag1.isComment();
        org.jsoup.parser.Token.Tag tag5 = startTag1.name("<<!---->>");
        tag5.newAttribute();
        boolean boolean7 = tag5.isStartTag();
        tag5.appendAttributeName("");
        boolean boolean10 = tag5.selfClosing;
        java.lang.String str11 = tag5.name();
        tag5.appendTagName(' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<<!---->>" + "'", str11, "<<!---->>");
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "<!---->", parseErrorList7);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        java.lang.String str10 = comment9.getData();
        xmlTreeBuilder0.insert(comment9);
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        java.lang.String str13 = comment12.toString();
        boolean boolean14 = comment12.isEndTag();
        xmlTreeBuilder0.insert(comment12);
        org.jsoup.parser.Token.Character character17 = new org.jsoup.parser.Token.Character("hi!");
        java.lang.String str18 = character17.getData();
        java.lang.String str19 = character17.toString();
        xmlTreeBuilder0.insert(character17);
        org.jsoup.parser.Token.Comment comment21 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(comment21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag("hi!", attributes5);
        org.jsoup.parser.Token.TokenType tokenType7 = startTag6.type;
        startTag6.finaliseTag();
        boolean boolean9 = startTag6.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType10 = startTag6.type;
        doctype0.type = tokenType10;
        boolean boolean12 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder13 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder14 = doctype0.name;
        boolean boolean15 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder16 = doctype0.publicIdentifier;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        boolean boolean2 = doctype0.isDoctype();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        java.lang.String str7 = doctype0.getSystemIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment8 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        java.lang.String str3 = doctype0.getSystemIdentifier();
        java.lang.String str4 = doctype0.getName();
        java.lang.String str5 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        java.lang.String str8 = doctype0.getName();
        boolean boolean9 = doctype0.isEndTag();
        java.lang.StringBuilder stringBuilder10 = doctype0.name;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        org.jsoup.parser.Token.TokenType tokenType3 = startTag2.type;
        boolean boolean4 = startTag2.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag2.type;
        java.lang.String str6 = startTag2.tagName;
        startTag2.appendAttributeName('#');
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "<!---->", parseErrorList7);
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        xmlTreeBuilder0.initialiseParse("</<hi!>>", "<!----><<!---->>a", parseErrorList11);
        org.jsoup.parser.Token.Comment comment13 = new org.jsoup.parser.Token.Comment();
        boolean boolean14 = comment13.isStartTag();
        java.lang.String str15 = comment13.toString();
        boolean boolean16 = comment13.isCharacter();
        xmlTreeBuilder0.insert(comment13);
        org.jsoup.parser.Token.Character character19 = new org.jsoup.parser.Token.Character("<!----><<!---->>");
        java.lang.String str20 = character19.getData();
        java.lang.String str21 = character19.toString();
        xmlTreeBuilder0.insert(character19);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!---->" + "'", str15, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!----><<!---->>" + "'", str20, "<!----><<!---->>");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!----><<!---->>" + "'", str21, "<!----><<!---->>");
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        doctype0.forceQuirks = true;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        java.lang.String str7 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        boolean boolean9 = doctype0.isDoctype();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        org.jsoup.parser.Token.TokenType tokenType7 = comment5.type;
        java.lang.String str8 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Comment comment10 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType11 = org.jsoup.parser.Token.TokenType.Doctype;
        comment10.type = tokenType11;
        xmlTreeBuilder0.insert(comment10);
        org.jsoup.parser.Token.Comment comment14 = new org.jsoup.parser.Token.Comment();
        java.lang.String str15 = comment14.toString();
        boolean boolean16 = comment14.isEOF();
        boolean boolean17 = comment14.isEndTag();
        xmlTreeBuilder0.insert(comment14);
        org.jsoup.parser.Token.Character character20 = new org.jsoup.parser.Token.Character("");
        boolean boolean21 = character20.isEndTag();
        java.lang.String str22 = character20.toString();
        java.lang.String str23 = character20.getData();
        java.lang.String str24 = character20.toString();
        boolean boolean25 = character20.isEndTag();
        org.jsoup.parser.Token.Doctype doctype26 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder27 = doctype26.publicIdentifier;
        java.lang.StringBuilder stringBuilder28 = doctype26.publicIdentifier;
        java.lang.String str29 = doctype26.getSystemIdentifier();
        org.jsoup.nodes.Attributes attributes31 = null;
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag("hi!", attributes31);
        org.jsoup.parser.Token.TokenType tokenType33 = startTag32.type;
        startTag32.finaliseTag();
        boolean boolean35 = startTag32.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType36 = startTag32.type;
        doctype26.type = tokenType36;
        character20.type = tokenType36;
        java.lang.String str39 = character20.toString();
        boolean boolean40 = character20.isCharacter();
        java.lang.String str41 = character20.getData();
        xmlTreeBuilder0.insert(character20);
        boolean boolean43 = character20.isCharacter();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!---->" + "'", str15, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + tokenType33 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType33.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + tokenType36 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType36.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        startTag0.newAttribute();
        boolean boolean5 = startTag0.isComment();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("hi!", attributes9);
        startTag10.newAttribute();
        startTag10.tagName = "";
        org.jsoup.nodes.Attributes attributes14 = startTag10.attributes;
        startTag7.attributes = attributes14;
        startTag0.attributes = attributes14;
        org.jsoup.parser.Token.StartTag startTag17 = startTag0.asStartTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = startTag17.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(startTag17);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder3 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder4 = doctype0.name;
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        boolean boolean6 = doctype0.isForceQuirks();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList7);
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        xmlTreeBuilder0.initialiseParse("<!---->", "hi!", parseErrorList11);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder0.initialiseParse("<<!---->>", "", parseErrorList15);
        org.jsoup.parser.Token.Character character18 = new org.jsoup.parser.Token.Character("<<<!---->>>");
        boolean boolean19 = xmlTreeBuilder0.process((org.jsoup.parser.Token) character18);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag20 = character18.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        doctype0.forceQuirks = true;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        boolean boolean7 = doctype0.isForceQuirks();
        boolean boolean8 = doctype0.forceQuirks;
        java.lang.String str9 = doctype0.getPublicIdentifier();
        java.lang.Class<?> wildcardClass10 = doctype0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        boolean boolean2 = doctype0.isDoctype();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        boolean boolean9 = doctype0.isComment();
        boolean boolean10 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder11 = doctype0.systemIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "<!---->", parseErrorList7);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        java.lang.String str10 = comment9.getData();
        xmlTreeBuilder0.insert(comment9);
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        java.lang.String str13 = comment12.toString();
        boolean boolean14 = comment12.isEndTag();
        xmlTreeBuilder0.insert(comment12);
        org.jsoup.parser.Token.Character character17 = new org.jsoup.parser.Token.Character("hi!");
        java.lang.String str18 = character17.getData();
        java.lang.String str19 = character17.toString();
        xmlTreeBuilder0.insert(character17);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder21 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        xmlTreeBuilder21.initialiseParse("</<!---->>", "</<!---->>", parseErrorList24);
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        xmlTreeBuilder21.initialiseParse("StartTag", "<!---->", parseErrorList28);
        org.jsoup.parser.Token.Comment comment30 = new org.jsoup.parser.Token.Comment();
        java.lang.String str31 = comment30.getData();
        xmlTreeBuilder21.insert(comment30);
        org.jsoup.parser.Token.Comment comment33 = new org.jsoup.parser.Token.Comment();
        java.lang.String str34 = comment33.toString();
        boolean boolean35 = comment33.isEndTag();
        xmlTreeBuilder21.insert(comment33);
        org.jsoup.parser.Token.Character character38 = new org.jsoup.parser.Token.Character("<<!---->>");
        java.lang.String str39 = character38.getData();
        xmlTreeBuilder21.insert(character38);
        xmlTreeBuilder0.insert(character38);
        org.jsoup.parser.Token.Character character43 = new org.jsoup.parser.Token.Character("");
        java.lang.String str44 = character43.toString();
        java.lang.String str45 = character43.getData();
        xmlTreeBuilder0.insert(character43);
        org.jsoup.nodes.Attributes attributes48 = null;
        org.jsoup.parser.Token.StartTag startTag49 = new org.jsoup.parser.Token.StartTag("hi!", attributes48);
        org.jsoup.parser.Token.TokenType tokenType50 = startTag49.type;
        startTag49.finaliseTag();
        org.jsoup.parser.Token.Tag tag53 = startTag49.name("<<!----><hi!>>");
        org.jsoup.nodes.Attributes attributes54 = startTag49.getAttributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean55 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!---->" + "'", str34, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<<!---->>" + "'", str39, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + tokenType50 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType50.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag53);
        org.junit.Assert.assertNull(attributes54);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList3);
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str7 = endTag6.toString();
        java.lang.String str8 = endTag6.toString();
        boolean boolean9 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag6);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        xmlTreeBuilder10.initialiseParse("", "<<!---->>", parseErrorList13);
        org.jsoup.parser.Token.EndTag endTag16 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str17 = endTag16.toString();
        java.lang.String str18 = endTag16.toString();
        boolean boolean19 = xmlTreeBuilder10.process((org.jsoup.parser.Token) endTag16);
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        xmlTreeBuilder10.initialiseParse("hi!<!---->", "", parseErrorList22);
        org.jsoup.parser.Token.Character character25 = new org.jsoup.parser.Token.Character("");
        java.lang.String str26 = character25.toString();
        java.lang.String str27 = character25.toString();
        java.lang.String str28 = character25.getData();
        boolean boolean29 = character25.isComment();
        java.lang.String str30 = character25.toString();
        xmlTreeBuilder10.insert(character25);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder32 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList35 = null;
        xmlTreeBuilder32.initialiseParse("</<!---->>", "</<!---->>", parseErrorList35);
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        xmlTreeBuilder32.initialiseParse("StartTag", "<!---->", parseErrorList39);
        org.jsoup.parser.Token.Comment comment41 = new org.jsoup.parser.Token.Comment();
        java.lang.String str42 = comment41.getData();
        xmlTreeBuilder32.insert(comment41);
        java.lang.String str44 = comment41.toString();
        xmlTreeBuilder10.insert(comment41);
        org.jsoup.parser.Token.Comment comment46 = new org.jsoup.parser.Token.Comment();
        java.lang.String str47 = comment46.toString();
        org.jsoup.parser.Token.TokenType tokenType48 = comment46.type;
        boolean boolean49 = comment46.isComment();
        java.lang.String str50 = comment46.getData();
        java.lang.String str51 = comment46.toString();
        java.lang.String str52 = comment46.toString();
        xmlTreeBuilder10.insert(comment46);
        java.lang.String str54 = comment46.getData();
        java.lang.String str55 = comment46.getData();
        java.lang.String str56 = comment46.tokenType();
        java.lang.String str57 = comment46.toString();
        xmlTreeBuilder0.insert(comment46);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</<!---->>" + "'", str7, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</<!---->>" + "'", str8, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "</<!---->>" + "'", str17, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "</<!---->>" + "'", str18, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "<!---->" + "'", str44, "<!---->");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "<!---->" + "'", str47, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType48 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType48.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "<!---->" + "'", str51, "<!---->");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "<!---->" + "'", str52, "<!---->");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Comment" + "'", str56, "Comment");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "<!---->" + "'", str57, "<!---->");
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.appendAttributeValue(' ');
        boolean boolean5 = startTag2.isSelfClosing();
        boolean boolean6 = startTag2.isEndTag();
        boolean boolean7 = startTag2.isCharacter();
        startTag2.newAttribute();
        boolean boolean9 = startTag2.isStartTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype10 = startTag2.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType5 = org.jsoup.parser.Token.TokenType.Doctype;
        comment4.type = tokenType5;
        startTag2.type = tokenType5;
        startTag2.appendAttributeName("hi!");
        boolean boolean10 = startTag2.isCharacter();
        startTag2.finaliseTag();
        java.lang.String str12 = startTag2.tokenType();
        java.lang.String str13 = startTag2.tagName;
        startTag2.appendAttributeValue('4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "StartTag" + "'", str12, "StartTag");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        xmlTreeBuilder0.initialiseParse("StartTag<hi!<!---->> ", "<hi!>", parseErrorList10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isStartTag();
        java.lang.String str2 = comment0.toString();
        java.lang.String str3 = comment0.getData();
        boolean boolean4 = comment0.isEOF();
        java.lang.String str5 = comment0.getData();
        java.lang.String str6 = comment0.tokenType();
        java.lang.String str7 = comment0.getData();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Comment" + "'", str6, "Comment");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<</<<<!---->>>>>");
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        java.lang.StringBuilder stringBuilder2 = comment0.data;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        java.lang.String str5 = comment0.toString();
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        java.lang.String str7 = comment0.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag8 = comment0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!---->" + "'", str7, "<!---->");
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.forceQuirks = false;
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        boolean boolean8 = doctype7.forceQuirks;
        org.jsoup.parser.Token.Doctype doctype9 = doctype7.asDoctype();
        java.lang.String str10 = doctype7.getPublicIdentifier();
        java.lang.String str11 = doctype7.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doctype9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "<!---->", parseErrorList7);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        java.lang.String str10 = comment9.getData();
        xmlTreeBuilder0.insert(comment9);
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        java.lang.String str13 = comment12.toString();
        boolean boolean14 = comment12.isEndTag();
        xmlTreeBuilder0.insert(comment12);
        org.jsoup.parser.Token.Comment comment16 = new org.jsoup.parser.Token.Comment();
        boolean boolean17 = comment16.isStartTag();
        org.jsoup.parser.Token.Comment comment18 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType19 = org.jsoup.parser.Token.TokenType.Doctype;
        comment18.type = tokenType19;
        comment16.type = tokenType19;
        xmlTreeBuilder0.insert(comment16);
        java.lang.String str23 = comment16.toString();
        java.lang.StringBuilder stringBuilder24 = comment16.data;
        java.lang.String str25 = comment16.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character26 = comment16.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + tokenType19 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType19.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<!---->" + "'", str23, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder24);
        org.junit.Assert.assertEquals(stringBuilder24.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!---->" + "'", str25, "<!---->");
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str2 = endTag1.toString();
        endTag1.appendAttributeValue('4');
        boolean boolean5 = endTag1.isSelfClosing();
        java.lang.String str6 = endTag1.tagName;
        java.lang.String str7 = endTag1.toString();
        org.jsoup.parser.Token.Tag tag9 = endTag1.name("</</hi!<!---->>>");
        org.jsoup.parser.Token.EndTag endTag10 = endTag1.asEndTag();
        endTag1.appendAttributeName('#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</<!---->>" + "'", str2, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</<!---->>" + "'", str7, "</<!---->>");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(endTag10);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.selfClosing = false;
        startTag0.appendTagName("hi!");
        startTag0.tagName = "<hi!4>";
        startTag0.appendAttributeValue("</</<!---->>>");
        boolean boolean9 = startTag0.isSelfClosing();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("hi!", attributes3);
        startTag4.newAttribute();
        startTag4.tagName = "";
        org.jsoup.nodes.Attributes attributes8 = startTag4.attributes;
        startTag1.attributes = attributes8;
        boolean boolean10 = startTag1.isDoctype();
        org.jsoup.parser.Token.StartTag startTag11 = startTag1.asStartTag();
        startTag1.selfClosing = true;
        org.jsoup.parser.Token.TokenType tokenType14 = startTag1.type;
        startTag1.appendAttributeValue("hi!");
        startTag1.tagName = "hi!Comment";
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        boolean boolean2 = startTag1.isSelfClosing();
        boolean boolean3 = startTag1.isDoctype();
        startTag1.newAttribute();
        org.jsoup.parser.Token.Tag tag6 = startTag1.name("<<!---->>");
        tag6.appendAttributeValue('4');
        tag6.finaliseTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag10 = tag6.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        org.jsoup.parser.Token.EndTag endTag2 = new org.jsoup.parser.Token.EndTag();
        boolean boolean3 = endTag2.selfClosing;
        endTag2.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes6 = endTag2.getAttributes();
        boolean boolean7 = endTag2.isSelfClosing();
        org.jsoup.parser.Token.EndTag endTag8 = endTag2.asEndTag();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes12 = null;
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("hi!", attributes12);
        startTag13.newAttribute();
        startTag13.tagName = "";
        org.jsoup.nodes.Attributes attributes17 = startTag13.attributes;
        startTag10.attributes = attributes17;
        endTag8.attributes = attributes17;
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag("EndTag", attributes17);
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag("<<!----><hi!>>", attributes17);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(attributes6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(endTag8);
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendTagName('4');
        org.jsoup.parser.Token.StartTag startTag6 = startTag2.asStartTag();
        boolean boolean7 = startTag2.selfClosing;
        boolean boolean8 = startTag2.isSelfClosing();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList3);
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str7 = endTag6.toString();
        java.lang.String str8 = endTag6.toString();
        boolean boolean9 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag6);
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag("hi!", attributes11);
        startTag12.newAttribute();
        boolean boolean14 = startTag12.isStartTag();
        boolean boolean15 = startTag12.isCharacter();
        org.jsoup.nodes.Element element16 = xmlTreeBuilder0.insert(startTag12);
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str19 = startTag18.tokenType();
        boolean boolean20 = startTag18.isSelfClosing();
        startTag18.finaliseTag();
        java.lang.String str22 = startTag18.tagName;
        boolean boolean23 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag18);
        boolean boolean24 = startTag18.isSelfClosing();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</<!---->>" + "'", str7, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</<!---->>" + "'", str8, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "StartTag" + "'", str19, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!---->" + "'", str22, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        endTag1.appendTagName("StartTag");
        org.jsoup.nodes.Attributes attributes7 = endTag1.attributes;
        endTag1.appendAttributeName('4');
        java.lang.String str10 = endTag1.toString();
        java.lang.String str11 = endTag1.toString();
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "</<!---->StartTag>" + "'", str10, "</<!---->StartTag>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "</<!---->StartTag>" + "'", str11, "</<!---->StartTag>");
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType5 = org.jsoup.parser.Token.TokenType.Doctype;
        comment4.type = tokenType5;
        startTag2.type = tokenType5;
        java.lang.String str8 = startTag2.tagName;
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes12 = null;
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("hi!", attributes12);
        startTag13.newAttribute();
        startTag13.tagName = "";
        org.jsoup.nodes.Attributes attributes17 = startTag13.attributes;
        startTag10.attributes = attributes17;
        startTag2.attributes = attributes17;
        startTag2.appendAttributeValue(' ');
        startTag2.tagName = "</</<!---->>>";
        boolean boolean24 = startTag2.isSelfClosing();
        java.lang.String str25 = startTag2.name();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "</</<!---->>>" + "'", str25, "</</<!---->>>");
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<hi!>");
        java.lang.String str2 = endTag1.toString();
        endTag1.appendAttributeValue('a');
        endTag1.appendTagName('4');
        java.lang.String str7 = endTag1.tokenType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</<hi!>>" + "'", str2, "</<hi!>>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EndTag" + "'", str7, "EndTag");
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("hi!", attributes2);
        startTag3.newAttribute();
        startTag3.tagName = "";
        org.jsoup.nodes.Attributes attributes7 = startTag3.attributes;
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("", attributes7);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendAttributeValue('4');
        boolean boolean12 = startTag9.isDoctype();
        org.jsoup.nodes.Attributes attributes13 = startTag9.attributes;
        startTag8.attributes = attributes13;
        org.jsoup.parser.Token.StartTag startTag15 = startTag8.asStartTag();
        startTag8.appendAttributeValue(' ');
        boolean boolean18 = startTag8.isStartTag();
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(startTag15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("");
        startTag2.appendTagName('a');
        org.jsoup.nodes.Attributes attributes5 = startTag2.getAttributes();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag("<!---->hi!", attributes5);
        org.junit.Assert.assertNotNull(attributes5);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.tokenType();
        boolean boolean3 = startTag1.isComment();
        boolean boolean4 = startTag1.isStartTag();
        startTag1.tagName = "Doctype";
        startTag1.appendAttributeName(' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        boolean boolean4 = startTag2.selfClosing;
        startTag2.newAttribute();
        org.jsoup.nodes.Attributes attributes6 = startTag2.getAttributes();
        java.lang.String str7 = startTag2.name();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.newAttribute();
        startTag2.tagName = "";
        boolean boolean6 = startTag2.isComment();
        startTag2.appendTagName('a');
        org.jsoup.nodes.Attributes attributes9 = startTag2.attributes;
        org.jsoup.nodes.Attributes attributes10 = startTag2.attributes;
        org.jsoup.parser.Token.StartTag startTag11 = startTag2.asStartTag();
        boolean boolean12 = startTag2.isCharacter();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.tokenType();
        boolean boolean3 = startTag1.isComment();
        java.lang.String str4 = startTag1.toString();
        boolean boolean5 = startTag1.isComment();
        org.jsoup.parser.Token.Tag tag7 = startTag1.name("");
        boolean boolean8 = tag7.isStartTag();
        tag7.appendAttributeName('#');
        org.jsoup.parser.Token.TokenType tokenType11 = tag7.type;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<<!---->>" + "'", str4, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.selfClosing;
        endTag0.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes4 = endTag0.getAttributes();
        boolean boolean5 = endTag0.isSelfClosing();
        org.jsoup.parser.Token.EndTag endTag6 = endTag0.asEndTag();
        java.lang.String str7 = endTag0.tagName;
        org.jsoup.parser.Token.TokenType tokenType8 = endTag0.type;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(endTag6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        org.jsoup.parser.Token.TokenType tokenType2 = comment0.type;
        boolean boolean3 = comment0.isComment();
        java.lang.String str4 = comment0.getData();
        java.lang.String str5 = comment0.toString();
        java.lang.String str6 = comment0.toString();
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder8 = doctype7.publicIdentifier;
        java.lang.StringBuilder stringBuilder9 = doctype7.publicIdentifier;
        java.lang.String str10 = doctype7.getSystemIdentifier();
        org.jsoup.nodes.Attributes attributes12 = null;
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("hi!", attributes12);
        org.jsoup.parser.Token.TokenType tokenType14 = startTag13.type;
        startTag13.finaliseTag();
        boolean boolean16 = startTag13.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType17 = startTag13.type;
        doctype7.type = tokenType17;
        boolean boolean19 = doctype7.forceQuirks;
        org.jsoup.parser.Token.TokenType tokenType20 = doctype7.type;
        comment0.type = tokenType20;
        java.lang.String str22 = comment0.getData();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + tokenType17 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType17.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isCharacter();
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        boolean boolean6 = doctype0.isComment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        org.jsoup.parser.Token.TokenType tokenType3 = startTag2.type;
        startTag2.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag6 = startTag2.asStartTag();
        startTag6.finaliseTag();
        org.jsoup.nodes.Attributes attributes8 = startTag6.attributes;
        boolean boolean9 = startTag6.isDoctype();
        boolean boolean10 = startTag6.isSelfClosing();
        startTag6.appendTagName('a');
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        org.jsoup.parser.Token.TokenType tokenType7 = comment5.type;
        java.lang.String str8 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Comment comment10 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType11 = org.jsoup.parser.Token.TokenType.Doctype;
        comment10.type = tokenType11;
        xmlTreeBuilder0.insert(comment10);
        org.jsoup.parser.Token.Comment comment14 = new org.jsoup.parser.Token.Comment();
        java.lang.String str15 = comment14.toString();
        boolean boolean16 = comment14.isEOF();
        boolean boolean17 = comment14.isEndTag();
        xmlTreeBuilder0.insert(comment14);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        xmlTreeBuilder0.initialiseParse("EndTag", "<<hi!>StartTag>", parseErrorList21);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder23 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        xmlTreeBuilder23.initialiseParse("</<!---->>", "</<!---->>", parseErrorList26);
        org.jsoup.parser.Token.Comment comment28 = new org.jsoup.parser.Token.Comment();
        java.lang.String str29 = comment28.toString();
        org.jsoup.parser.Token.TokenType tokenType30 = comment28.type;
        java.lang.String str31 = comment28.getData();
        xmlTreeBuilder23.insert(comment28);
        org.jsoup.parser.Token.Comment comment33 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType34 = org.jsoup.parser.Token.TokenType.Doctype;
        comment33.type = tokenType34;
        xmlTreeBuilder23.insert(comment33);
        org.jsoup.parser.Token.Comment comment37 = new org.jsoup.parser.Token.Comment();
        java.lang.String str38 = comment37.toString();
        boolean boolean39 = comment37.isEOF();
        boolean boolean40 = comment37.isEndTag();
        xmlTreeBuilder23.insert(comment37);
        xmlTreeBuilder0.insert(comment37);
        org.jsoup.parser.Token.EndTag endTag44 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag44.appendAttributeValue('#');
        boolean boolean47 = endTag44.isEndTag();
        boolean boolean48 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag44);
        org.jsoup.nodes.Attributes attributes50 = null;
        org.jsoup.parser.Token.StartTag startTag51 = new org.jsoup.parser.Token.StartTag("hi!", attributes50);
        boolean boolean52 = startTag51.isComment();
        startTag51.appendTagName('4');
        startTag51.appendAttributeValue("<!---->");
        startTag51.appendAttributeValue("");
        startTag51.tagName = "</<!---->>";
        startTag51.newAttribute();
        startTag51.newAttribute();
        org.jsoup.parser.Token.StartTag startTag65 = new org.jsoup.parser.Token.StartTag();
        startTag65.appendAttributeValue('4');
        boolean boolean68 = startTag65.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType69 = startTag65.type;
        org.jsoup.nodes.Attributes attributes70 = startTag65.getAttributes();
        org.jsoup.parser.Token.StartTag startTag71 = new org.jsoup.parser.Token.StartTag("", attributes70);
        org.jsoup.parser.Token.StartTag startTag72 = new org.jsoup.parser.Token.StartTag("<<<!---->>>", attributes70);
        org.jsoup.parser.Token.TokenType tokenType73 = startTag72.type;
        startTag51.type = tokenType73;
        endTag44.type = tokenType73;
        java.lang.String str76 = endTag44.tagName;
        java.lang.String str77 = endTag44.tokenType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!---->" + "'", str15, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!---->" + "'", str29, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType30 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType30.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + tokenType34 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType34.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<!---->" + "'", str38, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + tokenType69 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType69.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes70);
        org.junit.Assert.assertTrue("'" + tokenType73 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType73.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "<!---->" + "'", str76, "<!---->");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "EndTag" + "'", str77, "EndTag");
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList3);
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str7 = endTag6.toString();
        java.lang.String str8 = endTag6.toString();
        boolean boolean9 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag6);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        xmlTreeBuilder0.initialiseParse("hi!<!---->", "", parseErrorList12);
        org.jsoup.parser.Token.Character character15 = new org.jsoup.parser.Token.Character("");
        java.lang.String str16 = character15.toString();
        java.lang.String str17 = character15.toString();
        java.lang.String str18 = character15.getData();
        boolean boolean19 = character15.isComment();
        java.lang.String str20 = character15.toString();
        xmlTreeBuilder0.insert(character15);
        org.jsoup.parser.Token.Character character23 = new org.jsoup.parser.Token.Character("");
        boolean boolean24 = character23.isEndTag();
        java.lang.String str25 = character23.toString();
        java.lang.String str26 = character23.getData();
        java.lang.String str27 = character23.toString();
        boolean boolean28 = character23.isEndTag();
        org.jsoup.parser.Token.Doctype doctype29 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder30 = doctype29.publicIdentifier;
        java.lang.StringBuilder stringBuilder31 = doctype29.publicIdentifier;
        java.lang.String str32 = doctype29.getSystemIdentifier();
        org.jsoup.nodes.Attributes attributes34 = null;
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag("hi!", attributes34);
        org.jsoup.parser.Token.TokenType tokenType36 = startTag35.type;
        startTag35.finaliseTag();
        boolean boolean38 = startTag35.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType39 = startTag35.type;
        doctype29.type = tokenType39;
        character23.type = tokenType39;
        java.lang.String str42 = character23.toString();
        boolean boolean43 = character23.isCharacter();
        xmlTreeBuilder0.insert(character23);
        org.jsoup.parser.Token.Doctype doctype45 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder46 = doctype45.publicIdentifier;
        doctype45.forceQuirks = false;
        boolean boolean49 = doctype45.isDoctype();
        java.lang.StringBuilder stringBuilder50 = doctype45.publicIdentifier;
        java.lang.String str51 = doctype45.getSystemIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</<!---->>" + "'", str7, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</<!---->>" + "'", str8, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(stringBuilder30);
        org.junit.Assert.assertEquals(stringBuilder30.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder31);
        org.junit.Assert.assertEquals(stringBuilder31.toString(), "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + tokenType36 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType36.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + tokenType39 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType39.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(stringBuilder46);
        org.junit.Assert.assertEquals(stringBuilder46.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(stringBuilder50);
        org.junit.Assert.assertEquals(stringBuilder50.toString(), "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        boolean boolean2 = endTag1.isDoctype();
        boolean boolean3 = endTag1.isEOF();
        java.lang.String str4 = endTag1.toString();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("<!---->", attributes6);
        startTag7.tagName = "</<hi!>>";
        java.lang.String str10 = startTag7.name();
        boolean boolean11 = startTag7.isEndTag();
        java.lang.String str12 = startTag7.tokenType();
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.appendAttributeValue('4');
        boolean boolean17 = startTag14.isEndTag();
        startTag14.newAttribute();
        boolean boolean19 = startTag14.isComment();
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes23 = null;
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag("hi!", attributes23);
        startTag24.newAttribute();
        startTag24.tagName = "";
        org.jsoup.nodes.Attributes attributes28 = startTag24.attributes;
        startTag21.attributes = attributes28;
        startTag14.attributes = attributes28;
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag("<!---->", attributes28);
        startTag7.attributes = attributes28;
        endTag1.attributes = attributes28;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</hi!>" + "'", str4, "</hi!>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "</<hi!>>" + "'", str10, "</<hi!>>");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "StartTag" + "'", str12, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributes28);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str2 = endTag1.toString();
        endTag1.appendAttributeValue('4');
        boolean boolean5 = endTag1.isSelfClosing();
        boolean boolean6 = endTag1.isSelfClosing();
        boolean boolean7 = endTag1.selfClosing;
        endTag1.selfClosing = true;
        endTag1.appendTagName("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</<!---->>" + "'", str2, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.appendAttributeValue(' ');
        java.lang.String str5 = startTag2.tokenType();
        java.lang.String str6 = startTag2.name();
        startTag2.appendTagName("<!---->");
        startTag2.tagName = "StartTag";
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        startTag11.selfClosing = false;
        startTag11.appendTagName("hi!");
        org.jsoup.nodes.Attributes attributes16 = startTag11.getAttributes();
        startTag2.attributes = attributes16;
        org.jsoup.parser.Token.StartTag startTag18 = startTag2.asStartTag();
        startTag18.appendAttributeName(' ');
        startTag18.appendTagName('#');
        startTag18.tagName = "hi!<<!----><hi!>>";
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(startTag18);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        org.jsoup.nodes.Attributes attributes4 = startTag2.getAttributes();
        startTag2.newAttribute();
        org.jsoup.parser.Token.EndTag endTag7 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag7.appendAttributeValue('#');
        endTag7.finaliseTag();
        java.lang.String str11 = endTag7.toString();
        endTag7.appendAttributeValue("<!----><<!---->>");
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.appendAttributeValue('4');
        boolean boolean17 = startTag14.isEndTag();
        startTag14.newAttribute();
        boolean boolean19 = startTag14.isComment();
        boolean boolean20 = startTag14.selfClosing;
        org.jsoup.nodes.Attributes attributes22 = null;
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag("hi!", attributes22);
        boolean boolean24 = startTag23.isComment();
        org.jsoup.parser.Token.Comment comment25 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType26 = org.jsoup.parser.Token.TokenType.Doctype;
        comment25.type = tokenType26;
        startTag23.type = tokenType26;
        startTag14.type = tokenType26;
        endTag7.type = tokenType26;
        startTag2.type = tokenType26;
        startTag2.newAttribute();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "</<!---->>" + "'", str11, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + tokenType26 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType26.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList7);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        java.lang.String str10 = comment9.toString();
        org.jsoup.parser.Token.TokenType tokenType11 = comment9.type;
        boolean boolean12 = comment9.isComment();
        java.lang.String str13 = comment9.getData();
        java.lang.String str14 = comment9.toString();
        java.lang.String str15 = comment9.getData();
        xmlTreeBuilder0.insert(comment9);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        xmlTreeBuilder17.initialiseParse("</<!---->>", "</<!---->>", parseErrorList20);
        org.jsoup.parser.Token.Comment comment22 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType23 = org.jsoup.parser.Token.TokenType.Doctype;
        comment22.type = tokenType23;
        java.lang.StringBuilder stringBuilder25 = comment22.data;
        xmlTreeBuilder17.insert(comment22);
        org.jsoup.parser.Token.Comment comment27 = new org.jsoup.parser.Token.Comment();
        java.lang.String str28 = comment27.toString();
        xmlTreeBuilder17.insert(comment27);
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        xmlTreeBuilder17.initialiseParse("</<hi!>>", "<<!---->>", parseErrorList32);
        org.jsoup.parser.Token.Comment comment34 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType35 = org.jsoup.parser.Token.TokenType.Doctype;
        comment34.type = tokenType35;
        java.lang.StringBuilder stringBuilder37 = comment34.data;
        boolean boolean38 = comment34.isEOF();
        xmlTreeBuilder17.insert(comment34);
        xmlTreeBuilder0.insert(comment34);
        org.jsoup.parser.Token.Comment comment41 = new org.jsoup.parser.Token.Comment();
        java.lang.String str42 = comment41.toString();
        org.jsoup.parser.Token.TokenType tokenType43 = comment41.type;
        java.lang.String str44 = comment41.getData();
        org.jsoup.parser.Token.StartTag startTag46 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes48 = null;
        org.jsoup.parser.Token.StartTag startTag49 = new org.jsoup.parser.Token.StartTag("hi!", attributes48);
        startTag49.newAttribute();
        startTag49.tagName = "";
        org.jsoup.nodes.Attributes attributes53 = startTag49.attributes;
        startTag46.attributes = attributes53;
        org.jsoup.parser.Token.TokenType tokenType55 = startTag46.type;
        comment41.type = tokenType55;
        comment34.type = tokenType55;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!---->" + "'", str10, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!---->" + "'", str14, "<!---->");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + tokenType23 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType23.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!---->" + "'", str28, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType35 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType35.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder37);
        org.junit.Assert.assertEquals(stringBuilder37.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<!---->" + "'", str42, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType43 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType43.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(attributes53);
        org.junit.Assert.assertTrue("'" + tokenType55 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType55.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        boolean boolean4 = startTag2.selfClosing;
        boolean boolean5 = startTag2.isEndTag();
        startTag2.finaliseTag();
        boolean boolean7 = startTag2.isEndTag();
        java.lang.String str8 = startTag2.toString();
        startTag2.tagName = "<</<hi!>>>";
        java.lang.String str11 = startTag2.tokenType();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<hi!>" + "'", str8, "<hi!>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "StartTag" + "'", str11, "StartTag");
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        boolean boolean8 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder9 = doctype0.name;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList3);
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str7 = endTag6.toString();
        java.lang.String str8 = endTag6.toString();
        boolean boolean9 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag6);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        xmlTreeBuilder0.initialiseParse("hi!<!---->", "", parseErrorList12);
        org.jsoup.parser.Token.Character character15 = new org.jsoup.parser.Token.Character("");
        java.lang.String str16 = character15.toString();
        java.lang.String str17 = character15.toString();
        java.lang.String str18 = character15.getData();
        boolean boolean19 = character15.isComment();
        java.lang.String str20 = character15.toString();
        xmlTreeBuilder0.insert(character15);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        xmlTreeBuilder22.initialiseParse("</<!---->>", "</<!---->>", parseErrorList25);
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        xmlTreeBuilder22.initialiseParse("StartTag", "<!---->", parseErrorList29);
        org.jsoup.parser.Token.Comment comment31 = new org.jsoup.parser.Token.Comment();
        java.lang.String str32 = comment31.getData();
        xmlTreeBuilder22.insert(comment31);
        java.lang.String str34 = comment31.toString();
        xmlTreeBuilder0.insert(comment31);
        org.jsoup.parser.Token.Comment comment36 = new org.jsoup.parser.Token.Comment();
        java.lang.String str37 = comment36.toString();
        org.jsoup.parser.Token.TokenType tokenType38 = comment36.type;
        boolean boolean39 = comment36.isComment();
        java.lang.String str40 = comment36.getData();
        java.lang.String str41 = comment36.toString();
        java.lang.String str42 = comment36.toString();
        xmlTreeBuilder0.insert(comment36);
        java.lang.String str44 = comment36.getData();
        boolean boolean45 = comment36.isStartTag();
        java.lang.StringBuilder stringBuilder46 = comment36.data;
        java.lang.String str47 = comment36.toString();
        java.lang.String str48 = comment36.getData();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</<!---->>" + "'", str7, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</<!---->>" + "'", str8, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!---->" + "'", str34, "<!---->");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<!---->" + "'", str37, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType38 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType38.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "<!---->" + "'", str41, "<!---->");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<!---->" + "'", str42, "<!---->");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(stringBuilder46);
        org.junit.Assert.assertEquals(stringBuilder46.toString(), "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "<!---->" + "'", str47, "<!---->");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str2 = endTag1.toString();
        endTag1.appendAttributeValue('4');
        boolean boolean5 = endTag1.isSelfClosing();
        java.lang.String str6 = endTag1.tagName;
        java.lang.String str7 = endTag1.toString();
        org.jsoup.parser.Token.Tag tag9 = endTag1.name("</</hi!<!---->>>");
        boolean boolean10 = tag9.isEndTag();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</<!---->>" + "'", str2, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</<!---->>" + "'", str7, "</<!---->>");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag();
        startTag2.appendAttributeValue('4');
        boolean boolean5 = startTag2.isEndTag();
        startTag2.newAttribute();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        startTag7.appendAttributeValue('4');
        org.jsoup.nodes.Attributes attributes10 = startTag7.attributes;
        startTag2.attributes = attributes10;
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag("<<hi!>StartTag>", attributes10);
        org.jsoup.nodes.Attributes attributes13 = startTag12.getAttributes();
        startTag12.newAttribute();
        org.jsoup.nodes.Attributes attributes15 = startTag12.attributes;
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag("4", attributes15);
        java.lang.String str17 = startTag16.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<4>" + "'", str17, "<4>");
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        boolean boolean2 = doctype0.isForceQuirks();
        boolean boolean3 = doctype0.isForceQuirks();
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag("hi!", attributes5);
        boolean boolean7 = startTag6.isComment();
        org.jsoup.parser.Token.Comment comment8 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType9 = org.jsoup.parser.Token.TokenType.Doctype;
        comment8.type = tokenType9;
        startTag6.type = tokenType9;
        doctype0.type = tokenType9;
        boolean boolean13 = doctype0.isComment();
        doctype0.forceQuirks = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        boolean boolean4 = startTag2.selfClosing;
        boolean boolean5 = startTag2.isEndTag();
        startTag2.finaliseTag();
        boolean boolean7 = startTag2.selfClosing;
        org.jsoup.parser.Token.Tag tag9 = startTag2.name("EndTag");
        org.jsoup.parser.Token.Tag tag11 = startTag2.name("</<hi!>>");
        org.jsoup.parser.Token.Doctype doctype12 = new org.jsoup.parser.Token.Doctype();
        boolean boolean13 = doctype12.isForceQuirks();
        java.lang.String str14 = doctype12.getName();
        boolean boolean15 = doctype12.isCharacter();
        java.lang.StringBuilder stringBuilder16 = doctype12.publicIdentifier;
        org.jsoup.parser.Token.EndTag endTag17 = new org.jsoup.parser.Token.EndTag();
        boolean boolean18 = endTag17.selfClosing;
        org.jsoup.parser.Token.Tag tag20 = endTag17.name("<!---->");
        boolean boolean21 = tag20.isCharacter();
        tag20.appendTagName("Comment");
        org.jsoup.nodes.Attributes attributes24 = tag20.attributes;
        org.jsoup.parser.Token.TokenType tokenType25 = tag20.type;
        doctype12.type = tokenType25;
        tag11.type = tokenType25;
        org.jsoup.nodes.Attributes attributes29 = null;
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag("hi!", attributes29);
        startTag30.appendAttributeValue(' ');
        java.lang.String str33 = startTag30.tokenType();
        boolean boolean34 = startTag30.isEOF();
        startTag30.appendTagName("Comment");
        boolean boolean37 = startTag30.isEndTag();
        org.jsoup.nodes.Attributes attributes39 = null;
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag("hi!", attributes39);
        org.jsoup.parser.Token.TokenType tokenType41 = startTag40.type;
        startTag40.finaliseTag();
        boolean boolean43 = startTag40.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType44 = startTag40.type;
        java.lang.String str45 = startTag40.tokenType();
        org.jsoup.parser.Token.TokenType tokenType46 = startTag40.type;
        startTag30.type = tokenType46;
        tag11.type = tokenType46;
        tag11.appendAttributeValue(' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(attributes24);
        org.junit.Assert.assertTrue("'" + tokenType25 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType25.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "StartTag" + "'", str33, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + tokenType41 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType41.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + tokenType44 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType44.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "StartTag" + "'", str45, "StartTag");
        org.junit.Assert.assertTrue("'" + tokenType46 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType46.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag();
        boolean boolean2 = endTag1.selfClosing;
        org.jsoup.parser.Token.Tag tag4 = endTag1.name("<!---->");
        boolean boolean5 = tag4.isCharacter();
        tag4.appendTagName("Comment");
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("</<!---->>");
        java.lang.String str10 = startTag9.tokenType();
        org.jsoup.nodes.Attributes attributes11 = startTag9.getAttributes();
        tag4.attributes = attributes11;
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("<!---->4", attributes11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag14 = startTag13.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "StartTag" + "'", str10, "StartTag");
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("<!---->", "<<!---->>", parseErrorList7);
        org.jsoup.parser.Token.Character character10 = new org.jsoup.parser.Token.Character("");
        java.lang.String str11 = character10.toString();
        java.lang.String str12 = character10.getData();
        java.lang.String str13 = character10.toString();
        java.lang.String str14 = character10.toString();
        boolean boolean15 = xmlTreeBuilder0.process((org.jsoup.parser.Token) character10);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        xmlTreeBuilder16.initialiseParse("</<!---->>", "</<!---->>", parseErrorList19);
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        xmlTreeBuilder16.initialiseParse("", "<<!---->>", parseErrorList23);
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        xmlTreeBuilder16.initialiseParse("<!---->", "hi!", parseErrorList27);
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str31 = startTag30.tokenType();
        boolean boolean32 = startTag30.selfClosing;
        org.jsoup.nodes.Element element33 = xmlTreeBuilder16.insert(startTag30);
        boolean boolean34 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag30);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder35 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        xmlTreeBuilder35.initialiseParse("", "<<!---->>", parseErrorList38);
        org.jsoup.parser.Token.EndTag endTag41 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str42 = endTag41.toString();
        java.lang.String str43 = endTag41.toString();
        boolean boolean44 = xmlTreeBuilder35.process((org.jsoup.parser.Token) endTag41);
        org.jsoup.parser.ParseErrorList parseErrorList47 = null;
        xmlTreeBuilder35.initialiseParse("hi!<!---->", "", parseErrorList47);
        org.jsoup.parser.Token.Character character50 = new org.jsoup.parser.Token.Character("");
        java.lang.String str51 = character50.toString();
        java.lang.String str52 = character50.toString();
        java.lang.String str53 = character50.getData();
        boolean boolean54 = character50.isComment();
        java.lang.String str55 = character50.toString();
        xmlTreeBuilder35.insert(character50);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder57 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList60 = null;
        xmlTreeBuilder57.initialiseParse("</<!---->>", "</<!---->>", parseErrorList60);
        org.jsoup.parser.ParseErrorList parseErrorList64 = null;
        xmlTreeBuilder57.initialiseParse("StartTag", "<!---->", parseErrorList64);
        org.jsoup.parser.Token.Comment comment66 = new org.jsoup.parser.Token.Comment();
        java.lang.String str67 = comment66.getData();
        xmlTreeBuilder57.insert(comment66);
        java.lang.String str69 = comment66.toString();
        xmlTreeBuilder35.insert(comment66);
        java.lang.String str71 = comment66.tokenType();
        xmlTreeBuilder0.insert(comment66);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "StartTag" + "'", str31, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "</<!---->>" + "'", str42, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "</<!---->>" + "'", str43, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "<!---->" + "'", str69, "<!---->");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Comment" + "'", str71, "Comment");
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        startTag1.appendAttributeValue('4');
        boolean boolean4 = startTag1.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag1.type;
        org.jsoup.nodes.Attributes attributes6 = startTag1.getAttributes();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("", attributes6);
        org.jsoup.parser.Token.Tag tag9 = startTag7.name("hi!EndTag");
        tag9.selfClosing = false;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        boolean boolean6 = comment5.isStartTag();
        org.jsoup.parser.Token.Comment comment7 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.Doctype;
        comment7.type = tokenType8;
        comment5.type = tokenType8;
        boolean boolean11 = comment5.isStartTag();
        java.lang.String str12 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Character character15 = new org.jsoup.parser.Token.Character("");
        java.lang.String str16 = character15.toString();
        java.lang.String str17 = character15.getData();
        java.lang.String str18 = character15.toString();
        boolean boolean19 = xmlTreeBuilder0.process((org.jsoup.parser.Token) character15);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        xmlTreeBuilder20.initialiseParse("</<!---->>", "</<!---->>", parseErrorList23);
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        xmlTreeBuilder20.initialiseParse("StartTag", "<!---->", parseErrorList27);
        org.jsoup.parser.Token.Character character30 = new org.jsoup.parser.Token.Character("");
        java.lang.String str31 = character30.toString();
        xmlTreeBuilder20.insert(character30);
        xmlTreeBuilder0.insert(character30);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder34 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        xmlTreeBuilder34.initialiseParse("", "<<!---->>", parseErrorList37);
        org.jsoup.parser.Token.EndTag endTag40 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str41 = endTag40.toString();
        java.lang.String str42 = endTag40.toString();
        boolean boolean43 = xmlTreeBuilder34.process((org.jsoup.parser.Token) endTag40);
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        xmlTreeBuilder34.initialiseParse("hi!<!---->", "", parseErrorList46);
        org.jsoup.parser.Token.Character character49 = new org.jsoup.parser.Token.Character("");
        java.lang.String str50 = character49.toString();
        java.lang.String str51 = character49.toString();
        java.lang.String str52 = character49.getData();
        boolean boolean53 = character49.isComment();
        java.lang.String str54 = character49.toString();
        xmlTreeBuilder34.insert(character49);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder56 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList59 = null;
        xmlTreeBuilder56.initialiseParse("</<!---->>", "</<!---->>", parseErrorList59);
        org.jsoup.parser.ParseErrorList parseErrorList63 = null;
        xmlTreeBuilder56.initialiseParse("StartTag", "<!---->", parseErrorList63);
        org.jsoup.parser.Token.Comment comment65 = new org.jsoup.parser.Token.Comment();
        java.lang.String str66 = comment65.getData();
        xmlTreeBuilder56.insert(comment65);
        java.lang.String str68 = comment65.toString();
        xmlTreeBuilder34.insert(comment65);
        org.jsoup.parser.Token.Comment comment70 = new org.jsoup.parser.Token.Comment();
        java.lang.String str71 = comment70.toString();
        org.jsoup.parser.Token.TokenType tokenType72 = comment70.type;
        boolean boolean73 = comment70.isComment();
        java.lang.String str74 = comment70.getData();
        java.lang.String str75 = comment70.toString();
        java.lang.String str76 = comment70.toString();
        xmlTreeBuilder34.insert(comment70);
        java.lang.String str78 = comment70.getData();
        java.lang.String str79 = comment70.getData();
        java.lang.String str80 = comment70.tokenType();
        java.lang.String str81 = comment70.toString();
        xmlTreeBuilder0.insert(comment70);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "</<!---->>" + "'", str41, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "</<!---->>" + "'", str42, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "<!---->" + "'", str68, "<!---->");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "<!---->" + "'", str71, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType72 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType72.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "<!---->" + "'", str75, "<!---->");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "<!---->" + "'", str76, "<!---->");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "Comment" + "'", str80, "Comment");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "<!---->" + "'", str81, "<!---->");
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.tokenType();
        boolean boolean3 = startTag1.isComment();
        java.lang.String str4 = startTag1.toString();
        boolean boolean5 = startTag1.isComment();
        startTag1.finaliseTag();
        startTag1.finaliseTag();
        startTag1.appendAttributeName("<<<!---->>4>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<<!---->>" + "'", str4, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "<hi!>", parseErrorList7);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        xmlTreeBuilder9.initialiseParse("</<!---->>", "</<!---->>", parseErrorList12);
        org.jsoup.parser.Token.Comment comment14 = new org.jsoup.parser.Token.Comment();
        java.lang.String str15 = comment14.toString();
        org.jsoup.parser.Token.TokenType tokenType16 = comment14.type;
        java.lang.String str17 = comment14.getData();
        xmlTreeBuilder9.insert(comment14);
        org.jsoup.parser.Token.Comment comment19 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType20 = org.jsoup.parser.Token.TokenType.Doctype;
        comment19.type = tokenType20;
        xmlTreeBuilder9.insert(comment19);
        xmlTreeBuilder0.insert(comment19);
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag();
        startTag24.appendAttributeValue('4');
        boolean boolean27 = startTag24.isEndTag();
        boolean boolean28 = startTag24.isEOF();
        startTag24.appendAttributeValue("hi!");
        startTag24.appendTagName('4');
        boolean boolean33 = startTag24.isSelfClosing();
        org.jsoup.parser.Token.Tag tag35 = startTag24.name("hi!");
        boolean boolean36 = startTag24.isComment();
        org.jsoup.parser.Token.StartTag startTag37 = startTag24.asStartTag();
        org.jsoup.parser.Token.StartTag startTag38 = startTag37.asStartTag();
        org.jsoup.parser.Token.StartTag startTag39 = startTag38.asStartTag();
        java.lang.String str40 = startTag39.toString();
        org.jsoup.nodes.Element element41 = xmlTreeBuilder0.insert(startTag39);
        org.jsoup.parser.Token.StartTag startTag42 = new org.jsoup.parser.Token.StartTag();
        startTag42.appendAttributeValue('4');
        boolean boolean45 = startTag42.isEndTag();
        boolean boolean46 = startTag42.isEOF();
        startTag42.appendAttributeValue("hi!");
        startTag42.appendTagName('4');
        boolean boolean51 = startTag42.isSelfClosing();
        org.jsoup.parser.Token.Tag tag53 = startTag42.name("hi!");
        org.jsoup.parser.Token.Tag tag55 = tag53.name("</<hi!>>");
        tag53.finaliseTag();
        boolean boolean57 = tag53.selfClosing;
        boolean boolean58 = xmlTreeBuilder0.process((org.jsoup.parser.Token) tag53);
        org.jsoup.parser.Token.EndTag endTag60 = new org.jsoup.parser.Token.EndTag("<!----><<!---->>");
        endTag60.appendTagName('a');
        java.lang.String str63 = endTag60.name();
        endTag60.appendTagName('4');
        boolean boolean66 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag60);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!---->" + "'", str15, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(startTag37);
        org.junit.Assert.assertNotNull(startTag38);
        org.junit.Assert.assertNotNull(startTag39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "<hi!>" + "'", str40, "<hi!>");
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(tag53);
        org.junit.Assert.assertNotNull(tag55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "<!----><<!---->>a" + "'", str63, "<!----><<!---->>a");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str2 = endTag1.toString();
        endTag1.appendAttributeValue('4');
        boolean boolean5 = endTag1.isEOF();
        java.lang.String str6 = endTag1.toString();
        endTag1.appendAttributeValue('4');
        org.jsoup.nodes.Attributes attributes9 = endTag1.attributes;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</<!---->>" + "'", str2, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "</<!---->>" + "'", str6, "</<!---->>");
        org.junit.Assert.assertNull(attributes9);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType6 = org.jsoup.parser.Token.TokenType.Doctype;
        comment5.type = tokenType6;
        java.lang.StringBuilder stringBuilder8 = comment5.data;
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Comment comment10 = new org.jsoup.parser.Token.Comment();
        java.lang.String str11 = comment10.toString();
        xmlTreeBuilder0.insert(comment10);
        org.jsoup.parser.Token.Character character14 = new org.jsoup.parser.Token.Character("");
        boolean boolean15 = character14.isEndTag();
        java.lang.String str16 = character14.toString();
        xmlTreeBuilder0.insert(character14);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder18 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        xmlTreeBuilder18.initialiseParse("</<!---->>", "StartTag", parseErrorList21);
        org.jsoup.parser.Token.Character character24 = new org.jsoup.parser.Token.Character("");
        java.lang.String str25 = character24.toString();
        java.lang.String str26 = character24.toString();
        boolean boolean27 = character24.isDoctype();
        xmlTreeBuilder18.insert(character24);
        java.lang.String str29 = character24.toString();
        xmlTreeBuilder0.insert(character24);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        xmlTreeBuilder31.initialiseParse("</<!---->>", "</<!---->>", parseErrorList34);
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        xmlTreeBuilder31.initialiseParse("StartTag", "<!---->", parseErrorList38);
        org.jsoup.parser.Token.Comment comment40 = new org.jsoup.parser.Token.Comment();
        java.lang.String str41 = comment40.getData();
        xmlTreeBuilder31.insert(comment40);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder43 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        xmlTreeBuilder43.initialiseParse("</<!---->>", "</<!---->>", parseErrorList46);
        org.jsoup.parser.Token.Comment comment48 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType49 = org.jsoup.parser.Token.TokenType.Doctype;
        comment48.type = tokenType49;
        java.lang.StringBuilder stringBuilder51 = comment48.data;
        xmlTreeBuilder43.insert(comment48);
        org.jsoup.parser.Token.Comment comment53 = new org.jsoup.parser.Token.Comment();
        java.lang.String str54 = comment53.toString();
        xmlTreeBuilder43.insert(comment53);
        xmlTreeBuilder31.insert(comment53);
        boolean boolean57 = comment53.isDoctype();
        java.lang.StringBuilder stringBuilder58 = comment53.data;
        xmlTreeBuilder0.insert(comment53);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype60 = comment53.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + tokenType49 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType49.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder51);
        org.junit.Assert.assertEquals(stringBuilder51.toString(), "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "<!---->" + "'", str54, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(stringBuilder58);
        org.junit.Assert.assertEquals(stringBuilder58.toString(), "");
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getName();
        java.lang.String str3 = doctype0.getName();
        java.lang.String str4 = doctype0.getName();
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        boolean boolean6 = doctype0.forceQuirks;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("StartTag");
        org.jsoup.parser.Token.Tag tag3 = startTag1.name("<hi!</</<!---->>>>");
        tag3.finaliseTag();
        tag3.appendAttributeValue('a');
        org.junit.Assert.assertNotNull(tag3);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        org.jsoup.parser.Token.Doctype doctype4 = new org.jsoup.parser.Token.Doctype();
        boolean boolean5 = doctype4.isForceQuirks();
        boolean boolean6 = doctype4.isForceQuirks();
        java.lang.StringBuilder stringBuilder7 = doctype4.systemIdentifier;
        java.lang.StringBuilder stringBuilder8 = doctype4.name;
        doctype4.forceQuirks = true;
        org.jsoup.nodes.Attributes attributes12 = null;
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("hi!", attributes12);
        startTag13.appendAttributeValue(' ');
        java.lang.String str16 = startTag13.tokenType();
        java.lang.String str17 = startTag13.name();
        startTag13.appendTagName("<!---->");
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        startTag20.appendAttributeValue('4');
        boolean boolean23 = startTag20.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType24 = startTag20.type;
        startTag13.type = tokenType24;
        doctype4.type = tokenType24;
        org.jsoup.parser.Token.TokenType tokenType27 = doctype4.type;
        endTag1.type = tokenType27;
        boolean boolean29 = endTag1.isCharacter();
        org.jsoup.parser.Token.Tag tag31 = endTag1.name("<<hi!>>");
        java.lang.String str32 = endTag1.toString();
        endTag1.finaliseTag();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</<!---->>" + "'", str2, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</<!---->>" + "'", str3, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "StartTag" + "'", str16, "StartTag");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + tokenType24 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType24.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + tokenType27 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType27.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "</<<hi!>>>" + "'", str32, "</<<hi!>>>");
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getName();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.StringBuilder stringBuilder4 = doctype0.name;
        java.lang.String str5 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("<<!---->>", "<hi!>", parseErrorList3);
        org.jsoup.parser.Token.Character character6 = new org.jsoup.parser.Token.Character("<<!---->>");
        java.lang.String str7 = character6.getData();
        java.lang.String str8 = character6.toString();
        java.lang.String str9 = character6.getData();
        java.lang.String str10 = character6.toString();
        xmlTreeBuilder0.insert(character6);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder12.initialiseParse("</<!---->>", "StartTag", parseErrorList15);
        org.jsoup.parser.Token.Character character18 = new org.jsoup.parser.Token.Character("");
        java.lang.String str19 = character18.toString();
        java.lang.String str20 = character18.toString();
        boolean boolean21 = character18.isDoctype();
        xmlTreeBuilder12.insert(character18);
        java.lang.String str23 = character18.getData();
        java.lang.String str24 = character18.toString();
        java.lang.String str25 = character18.getData();
        boolean boolean26 = xmlTreeBuilder0.process((org.jsoup.parser.Token) character18);
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        startTag27.appendAttributeValue('4');
        boolean boolean30 = startTag27.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType31 = startTag27.type;
        startTag27.tagName = "<!---->";
        org.jsoup.nodes.Attributes attributes34 = null;
        startTag27.attributes = attributes34;
        startTag27.appendAttributeName('a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<<!---->>" + "'", str7, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<<!---->>" + "'", str8, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<<!---->>" + "'", str9, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<<!---->>" + "'", str10, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + tokenType31 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType31.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("</<!---->>");
        java.lang.String str2 = endTag1.toString();
        boolean boolean3 = endTag1.isDoctype();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag4 = endTag1.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</</<!---->>>" + "'", str2, "</</<!---->>>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag5 = new org.jsoup.parser.Token.EndTag();
        boolean boolean6 = endTag5.selfClosing;
        org.jsoup.parser.Token.Tag tag8 = endTag5.name("<!---->");
        org.jsoup.parser.Token.TokenType tokenType9 = org.jsoup.parser.Token.TokenType.StartTag;
        tag8.type = tokenType9;
        endTag1.type = tokenType9;
        org.jsoup.nodes.Attributes attributes12 = endTag1.attributes;
        java.lang.String str13 = endTag1.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(attributes12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "</<!---->>" + "'", str13, "</<!---->>");
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.isCharacter();
        org.jsoup.parser.Token.Doctype doctype5 = doctype0.asDoctype();
        java.lang.String str6 = doctype5.getSystemIdentifier();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doctype5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        boolean boolean2 = doctype0.forceQuirks;
        boolean boolean3 = doctype0.isForceQuirks();
        java.lang.String str4 = doctype0.getPublicIdentifier();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment6 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList7);
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        xmlTreeBuilder0.initialiseParse("<!---->", "hi!", parseErrorList11);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder0.initialiseParse("<<!---->>", "", parseErrorList15);
        org.jsoup.nodes.Attributes attributes19 = null;
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag("hi!", attributes19);
        boolean boolean21 = startTag20.isComment();
        org.jsoup.parser.Token.Comment comment22 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType23 = org.jsoup.parser.Token.TokenType.Doctype;
        comment22.type = tokenType23;
        startTag20.type = tokenType23;
        java.lang.String str26 = startTag20.tagName;
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes30 = null;
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag("hi!", attributes30);
        startTag31.newAttribute();
        startTag31.tagName = "";
        org.jsoup.nodes.Attributes attributes35 = startTag31.attributes;
        startTag28.attributes = attributes35;
        startTag20.attributes = attributes35;
        org.jsoup.nodes.Attributes attributes38 = startTag20.getAttributes();
        org.jsoup.parser.Token.StartTag startTag39 = new org.jsoup.parser.Token.StartTag("<!---->StartTag", attributes38);
        org.jsoup.nodes.Element element40 = xmlTreeBuilder0.insert(startTag39);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder41 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        xmlTreeBuilder41.initialiseParse("</<!---->>", "StartTag", parseErrorList44);
        org.jsoup.parser.ParseErrorList parseErrorList48 = null;
        xmlTreeBuilder41.initialiseParse("<!---->", "<<!---->>", parseErrorList48);
        org.jsoup.parser.Token.Character character51 = new org.jsoup.parser.Token.Character("");
        java.lang.String str52 = character51.toString();
        java.lang.String str53 = character51.getData();
        java.lang.String str54 = character51.toString();
        java.lang.String str55 = character51.toString();
        boolean boolean56 = xmlTreeBuilder41.process((org.jsoup.parser.Token) character51);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder57 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList60 = null;
        xmlTreeBuilder57.initialiseParse("</<!---->>", "</<!---->>", parseErrorList60);
        org.jsoup.parser.ParseErrorList parseErrorList64 = null;
        xmlTreeBuilder57.initialiseParse("", "<<!---->>", parseErrorList64);
        org.jsoup.parser.ParseErrorList parseErrorList68 = null;
        xmlTreeBuilder57.initialiseParse("<!---->", "hi!", parseErrorList68);
        org.jsoup.parser.Token.StartTag startTag71 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str72 = startTag71.tokenType();
        boolean boolean73 = startTag71.selfClosing;
        org.jsoup.nodes.Element element74 = xmlTreeBuilder57.insert(startTag71);
        boolean boolean75 = xmlTreeBuilder41.process((org.jsoup.parser.Token) startTag71);
        org.jsoup.parser.Token.Comment comment76 = new org.jsoup.parser.Token.Comment();
        boolean boolean77 = comment76.isStartTag();
        org.jsoup.parser.Token.Comment comment78 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType79 = org.jsoup.parser.Token.TokenType.Doctype;
        comment78.type = tokenType79;
        comment76.type = tokenType79;
        boolean boolean82 = comment76.isStartTag();
        java.lang.String str83 = comment76.toString();
        xmlTreeBuilder41.insert(comment76);
        xmlTreeBuilder0.insert(comment76);
        org.jsoup.parser.Token.Doctype doctype86 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str87 = doctype86.getName();
        java.lang.StringBuilder stringBuilder88 = doctype86.name;
        java.lang.StringBuilder stringBuilder89 = doctype86.name;
        doctype86.forceQuirks = true;
        java.lang.String str92 = doctype86.getPublicIdentifier();
        boolean boolean93 = doctype86.isForceQuirks();
        doctype86.forceQuirks = false;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype86);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + tokenType23 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType23.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "StartTag" + "'", str72, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(element74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + tokenType79 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType79.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "<!---->" + "'", str83, "<!---->");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertNotNull(stringBuilder88);
        org.junit.Assert.assertEquals(stringBuilder88.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder89);
        org.junit.Assert.assertEquals(stringBuilder89.toString(), "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isEOF();
        startTag0.appendAttributeValue("hi!");
        startTag0.appendAttributeName('#');
        boolean boolean9 = startTag0.isSelfClosing();
        boolean boolean10 = startTag0.isStartTag();
        startTag0.appendTagName(' ');
        java.lang.String str13 = startTag0.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "< >" + "'", str13, "< >");
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "<!---->", parseErrorList7);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        java.lang.String str10 = comment9.getData();
        xmlTreeBuilder0.insert(comment9);
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        java.lang.String str13 = comment12.toString();
        boolean boolean14 = comment12.isEndTag();
        xmlTreeBuilder0.insert(comment12);
        org.jsoup.parser.Token.Comment comment16 = new org.jsoup.parser.Token.Comment();
        boolean boolean17 = comment16.isStartTag();
        org.jsoup.parser.Token.Comment comment18 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType19 = org.jsoup.parser.Token.TokenType.Doctype;
        comment18.type = tokenType19;
        comment16.type = tokenType19;
        xmlTreeBuilder0.insert(comment16);
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str25 = startTag24.toString();
        java.lang.String str26 = startTag24.name();
        org.jsoup.parser.Token.Tag tag28 = startTag24.name("<hi!>");
        boolean boolean29 = startTag24.isComment();
        org.jsoup.nodes.Attributes attributes31 = null;
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag("hi!", attributes31);
        org.jsoup.parser.Token.TokenType tokenType33 = startTag32.type;
        startTag32.finaliseTag();
        boolean boolean35 = startTag32.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType36 = startTag32.type;
        startTag24.type = tokenType36;
        org.jsoup.nodes.Element element38 = xmlTreeBuilder0.insert(startTag24);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder39 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        xmlTreeBuilder39.initialiseParse("", "<<!---->>", parseErrorList42);
        org.jsoup.parser.Token.EndTag endTag45 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str46 = endTag45.toString();
        java.lang.String str47 = endTag45.toString();
        boolean boolean48 = xmlTreeBuilder39.process((org.jsoup.parser.Token) endTag45);
        org.jsoup.parser.ParseErrorList parseErrorList51 = null;
        xmlTreeBuilder39.initialiseParse("hi!<!---->", "", parseErrorList51);
        org.jsoup.parser.Token.Character character54 = new org.jsoup.parser.Token.Character("EndTag");
        xmlTreeBuilder39.insert(character54);
        xmlTreeBuilder0.insert(character54);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder57 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList60 = null;
        xmlTreeBuilder57.initialiseParse("</<!---->>", "</<!---->>", parseErrorList60);
        org.jsoup.parser.ParseErrorList parseErrorList64 = null;
        xmlTreeBuilder57.initialiseParse("StartTag", "<hi!>", parseErrorList64);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder66 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList69 = null;
        xmlTreeBuilder66.initialiseParse("</<!---->>", "</<!---->>", parseErrorList69);
        org.jsoup.parser.Token.Comment comment71 = new org.jsoup.parser.Token.Comment();
        java.lang.String str72 = comment71.toString();
        org.jsoup.parser.Token.TokenType tokenType73 = comment71.type;
        java.lang.String str74 = comment71.getData();
        xmlTreeBuilder66.insert(comment71);
        org.jsoup.parser.Token.Comment comment76 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType77 = org.jsoup.parser.Token.TokenType.Doctype;
        comment76.type = tokenType77;
        xmlTreeBuilder66.insert(comment76);
        xmlTreeBuilder57.insert(comment76);
        xmlTreeBuilder0.insert(comment76);
        org.jsoup.parser.Token.StartTag startTag83 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str84 = startTag83.tokenType();
        boolean boolean85 = startTag83.isComment();
        org.jsoup.parser.Token.Tag tag87 = startTag83.name("<<!---->>");
        org.jsoup.parser.Token.TokenType tokenType88 = tag87.type;
        boolean boolean89 = tag87.isDoctype();
        boolean boolean90 = xmlTreeBuilder0.process((org.jsoup.parser.Token) tag87);
        org.jsoup.parser.Token.Doctype doctype91 = new org.jsoup.parser.Token.Doctype();
        boolean boolean92 = doctype91.isForceQuirks();
        java.lang.String str93 = doctype91.getName();
        boolean boolean94 = doctype91.isForceQuirks();
        java.lang.StringBuilder stringBuilder95 = doctype91.name;
        org.jsoup.parser.Token.TokenType tokenType96 = doctype91.type;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype91);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + tokenType19 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType19.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<<!---->>" + "'", str25, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!---->" + "'", str26, "<!---->");
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + tokenType33 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType33.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + tokenType36 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType36.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "</<!---->>" + "'", str46, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "</<!---->>" + "'", str47, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "<!---->" + "'", str72, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType73 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType73.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + tokenType77 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType77.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "StartTag" + "'", str84, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(tag87);
        org.junit.Assert.assertTrue("'" + tokenType88 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType88.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(stringBuilder95);
        org.junit.Assert.assertEquals(stringBuilder95.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType96 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType96.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        startTag0.newAttribute();
        boolean boolean5 = startTag0.isComment();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("hi!", attributes9);
        startTag10.newAttribute();
        startTag10.tagName = "";
        org.jsoup.nodes.Attributes attributes14 = startTag10.attributes;
        startTag7.attributes = attributes14;
        startTag0.attributes = attributes14;
        org.jsoup.nodes.Attributes attributes17 = null;
        startTag0.attributes = attributes17;
        boolean boolean19 = startTag0.isEOF();
        startTag0.appendAttributeName("</<hi!>a>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag();
        startTag2.appendAttributeValue('4');
        boolean boolean5 = startTag2.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType6 = startTag2.type;
        org.jsoup.nodes.Attributes attributes7 = startTag2.getAttributes();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("", attributes7);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("<<<!---->>>", attributes7);
        boolean boolean10 = startTag9.isStartTag();
        startTag9.appendAttributeName('a');
        java.lang.String str13 = startTag9.name();
        startTag9.appendAttributeValue('4');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<<<!---->>>" + "'", str13, "<<<!---->>>");
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("<!---->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype3 = tag2.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        startTag0.newAttribute();
        boolean boolean5 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType6 = null;
        startTag0.type = tokenType6;
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("hi!", attributes9);
        org.jsoup.nodes.Attributes attributes11 = startTag10.attributes;
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        startTag12.appendAttributeValue('4');
        boolean boolean15 = startTag12.isEndTag();
        boolean boolean16 = startTag12.isEOF();
        startTag12.appendAttributeValue("hi!");
        startTag12.newAttribute();
        startTag12.appendAttributeName("</</<!---->>>");
        org.jsoup.nodes.Attributes attributes22 = startTag12.getAttributes();
        startTag10.attributes = attributes22;
        startTag0.attributes = attributes22;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributes22);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType5 = org.jsoup.parser.Token.TokenType.Doctype;
        comment4.type = tokenType5;
        startTag2.type = tokenType5;
        java.lang.String str8 = startTag2.tagName;
        org.jsoup.parser.Token.Tag tag10 = startTag2.name("<!----><<!---->>");
        startTag2.finaliseTag();
        org.jsoup.parser.Token.Tag tag13 = startTag2.name("StartTag");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character14 = tag13.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tag13);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType6 = org.jsoup.parser.Token.TokenType.Doctype;
        comment5.type = tokenType6;
        java.lang.StringBuilder stringBuilder8 = comment5.data;
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        xmlTreeBuilder0.initialiseParse("<hi!>", "<hi!>", parseErrorList12);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        xmlTreeBuilder14.initialiseParse("</<!---->>", "</<!---->>", parseErrorList17);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        xmlTreeBuilder14.initialiseParse("", "<<!---->>", parseErrorList21);
        org.jsoup.parser.Token.Comment comment23 = new org.jsoup.parser.Token.Comment();
        java.lang.String str24 = comment23.toString();
        org.jsoup.parser.Token.TokenType tokenType25 = comment23.type;
        boolean boolean26 = comment23.isComment();
        java.lang.String str27 = comment23.getData();
        java.lang.String str28 = comment23.toString();
        java.lang.String str29 = comment23.getData();
        xmlTreeBuilder14.insert(comment23);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        xmlTreeBuilder31.initialiseParse("</<!---->>", "</<!---->>", parseErrorList34);
        org.jsoup.parser.Token.Comment comment36 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType37 = org.jsoup.parser.Token.TokenType.Doctype;
        comment36.type = tokenType37;
        java.lang.StringBuilder stringBuilder39 = comment36.data;
        xmlTreeBuilder31.insert(comment36);
        org.jsoup.parser.Token.Comment comment41 = new org.jsoup.parser.Token.Comment();
        java.lang.String str42 = comment41.toString();
        xmlTreeBuilder31.insert(comment41);
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        xmlTreeBuilder31.initialiseParse("</<hi!>>", "<<!---->>", parseErrorList46);
        org.jsoup.parser.Token.Comment comment48 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType49 = org.jsoup.parser.Token.TokenType.Doctype;
        comment48.type = tokenType49;
        java.lang.StringBuilder stringBuilder51 = comment48.data;
        boolean boolean52 = comment48.isEOF();
        xmlTreeBuilder31.insert(comment48);
        xmlTreeBuilder14.insert(comment48);
        xmlTreeBuilder0.insert(comment48);
        org.jsoup.parser.Token.Comment comment56 = new org.jsoup.parser.Token.Comment();
        boolean boolean57 = comment56.isStartTag();
        java.lang.String str58 = comment56.toString();
        java.lang.String str59 = comment56.getData();
        java.lang.String str60 = comment56.getData();
        xmlTreeBuilder0.insert(comment56);
        java.lang.String str62 = comment56.getData();
        boolean boolean63 = comment56.isDoctype();
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!---->" + "'", str24, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType25 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType25.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!---->" + "'", str28, "<!---->");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + tokenType37 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType37.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder39);
        org.junit.Assert.assertEquals(stringBuilder39.toString(), "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<!---->" + "'", str42, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType49 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType49.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder51);
        org.junit.Assert.assertEquals(stringBuilder51.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "<!---->" + "'", str58, "<!---->");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        startTag1.appendAttributeValue('4');
        boolean boolean4 = startTag1.isEndTag();
        startTag1.newAttribute();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        startTag6.appendAttributeValue('4');
        org.jsoup.nodes.Attributes attributes9 = startTag6.attributes;
        startTag1.attributes = attributes9;
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("<<hi!>StartTag>", attributes9);
        boolean boolean12 = startTag11.isEOF();
        startTag11.appendAttributeValue("<<<!---->>>");
        org.jsoup.nodes.Attributes attributes15 = startTag11.attributes;
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        startTag16.appendAttributeValue('4');
        boolean boolean19 = startTag16.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType20 = startTag16.type;
        startTag16.tagName = "<!---->";
        startTag16.tagName = "";
        org.jsoup.nodes.Attributes attributes27 = null;
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag("hi!", attributes27);
        startTag28.appendAttributeValue(' ');
        java.lang.String str31 = startTag28.tokenType();
        java.lang.String str32 = startTag28.name();
        startTag28.appendTagName("<!---->");
        startTag28.tagName = "StartTag";
        org.jsoup.parser.Token.StartTag startTag37 = new org.jsoup.parser.Token.StartTag();
        startTag37.selfClosing = false;
        startTag37.appendTagName("hi!");
        org.jsoup.nodes.Attributes attributes42 = startTag37.getAttributes();
        startTag28.attributes = attributes42;
        org.jsoup.parser.Token.StartTag startTag44 = new org.jsoup.parser.Token.StartTag("<<hi!>>", attributes42);
        startTag16.attributes = attributes42;
        startTag11.attributes = attributes42;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "StartTag" + "'", str31, "StartTag");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(attributes42);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag("hi!", attributes5);
        org.jsoup.parser.Token.TokenType tokenType7 = startTag6.type;
        startTag6.finaliseTag();
        boolean boolean9 = startTag6.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType10 = startTag6.type;
        doctype0.type = tokenType10;
        java.lang.String str12 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder13 = doctype0.systemIdentifier;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList7);
        org.jsoup.parser.Token.Character character10 = new org.jsoup.parser.Token.Character("");
        boolean boolean11 = character10.isComment();
        boolean boolean12 = character10.isComment();
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag("hi!", attributes14);
        boolean boolean16 = startTag15.isComment();
        org.jsoup.parser.Token.Comment comment17 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType18 = org.jsoup.parser.Token.TokenType.Doctype;
        comment17.type = tokenType18;
        startTag15.type = tokenType18;
        startTag15.appendAttributeName("hi!");
        org.jsoup.parser.Token.EndTag endTag23 = new org.jsoup.parser.Token.EndTag();
        boolean boolean24 = endTag23.selfClosing;
        org.jsoup.parser.Token.Tag tag26 = endTag23.name("<!---->");
        org.jsoup.parser.Token.TokenType tokenType27 = org.jsoup.parser.Token.TokenType.StartTag;
        tag26.type = tokenType27;
        startTag15.type = tokenType27;
        character10.type = tokenType27;
        java.lang.String str31 = character10.toString();
        xmlTreeBuilder0.insert(character10);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        xmlTreeBuilder33.initialiseParse("</<!---->>", "</<!---->>", parseErrorList36);
        org.jsoup.parser.ParseErrorList parseErrorList40 = null;
        xmlTreeBuilder33.initialiseParse("", "<<!---->>", parseErrorList40);
        org.jsoup.parser.Token.Comment comment42 = new org.jsoup.parser.Token.Comment();
        java.lang.String str43 = comment42.toString();
        org.jsoup.parser.Token.TokenType tokenType44 = comment42.type;
        boolean boolean45 = comment42.isComment();
        java.lang.String str46 = comment42.getData();
        java.lang.String str47 = comment42.toString();
        java.lang.String str48 = comment42.getData();
        xmlTreeBuilder33.insert(comment42);
        org.jsoup.parser.ParseErrorList parseErrorList52 = null;
        xmlTreeBuilder33.initialiseParse("StartTag", "StartTag", parseErrorList52);
        org.jsoup.parser.Token.Character character55 = new org.jsoup.parser.Token.Character("");
        java.lang.String str56 = character55.getData();
        java.lang.String str57 = character55.tokenType();
        xmlTreeBuilder33.insert(character55);
        xmlTreeBuilder0.insert(character55);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + tokenType18 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType18.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertTrue("'" + tokenType27 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType27.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "<!---->" + "'", str43, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType44 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType44.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "<!---->" + "'", str47, "<!---->");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Character" + "'", str57, "Character");
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isEOF();
        startTag0.appendAttributeValue("hi!");
        startTag0.appendTagName('4');
        startTag0.appendTagName("hi!");
        java.lang.String str11 = startTag0.tokenType();
        java.lang.String str12 = startTag0.tagName;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "StartTag" + "'", str11, "StartTag");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4hi!" + "'", str12, "4hi!");
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str3 = startTag2.tokenType();
        boolean boolean4 = startTag2.isComment();
        java.lang.String str5 = startTag2.toString();
        boolean boolean6 = startTag2.isComment();
        org.jsoup.parser.Token.Tag tag8 = startTag2.name("");
        org.jsoup.parser.Token.Tag tag10 = tag8.name("<<!---->>");
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        startTag12.appendAttributeValue('4');
        boolean boolean15 = startTag12.isEndTag();
        boolean boolean16 = startTag12.isEOF();
        startTag12.appendAttributeValue("hi!");
        startTag12.appendAttributeName('#');
        boolean boolean21 = startTag12.isSelfClosing();
        org.jsoup.nodes.Attributes attributes23 = null;
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag("hi!", attributes23);
        startTag24.newAttribute();
        startTag24.tagName = "";
        org.jsoup.nodes.Attributes attributes28 = startTag24.attributes;
        startTag12.attributes = attributes28;
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag("</<!---->StartTag>", attributes28);
        tag10.attributes = attributes28;
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag("<<!---->>4", attributes28);
        startTag32.finaliseTag();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "StartTag" + "'", str3, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<<!---->>" + "'", str5, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributes28);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.forceQuirks = false;
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        org.jsoup.parser.Token.Doctype doctype4 = new org.jsoup.parser.Token.Doctype();
        boolean boolean5 = doctype4.isForceQuirks();
        boolean boolean6 = doctype4.isForceQuirks();
        java.lang.StringBuilder stringBuilder7 = doctype4.systemIdentifier;
        java.lang.StringBuilder stringBuilder8 = doctype4.name;
        doctype4.forceQuirks = true;
        org.jsoup.nodes.Attributes attributes12 = null;
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("hi!", attributes12);
        startTag13.appendAttributeValue(' ');
        java.lang.String str16 = startTag13.tokenType();
        java.lang.String str17 = startTag13.name();
        startTag13.appendTagName("<!---->");
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        startTag20.appendAttributeValue('4');
        boolean boolean23 = startTag20.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType24 = startTag20.type;
        startTag13.type = tokenType24;
        doctype4.type = tokenType24;
        org.jsoup.parser.Token.TokenType tokenType27 = doctype4.type;
        endTag1.type = tokenType27;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character29 = endTag1.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</<!---->>" + "'", str2, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</<!---->>" + "'", str3, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "StartTag" + "'", str16, "StartTag");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + tokenType24 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType24.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + tokenType27 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType27.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("hi!", attributes3);
        startTag4.newAttribute();
        startTag4.tagName = "";
        org.jsoup.nodes.Attributes attributes8 = startTag4.attributes;
        startTag1.attributes = attributes8;
        boolean boolean10 = startTag1.isDoctype();
        org.jsoup.parser.Token.StartTag startTag11 = startTag1.asStartTag();
        boolean boolean12 = startTag1.isStartTag();
        boolean boolean13 = startTag1.isStartTag();
        org.jsoup.nodes.Attributes attributes14 = startTag1.getAttributes();
        java.lang.String str15 = startTag1.toString();
        java.lang.Class<?> wildcardClass16 = startTag1.getClass();
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<<!---->>" + "'", str15, "<<!---->>");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType6 = org.jsoup.parser.Token.TokenType.Doctype;
        comment5.type = tokenType6;
        java.lang.StringBuilder stringBuilder8 = comment5.data;
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        xmlTreeBuilder0.initialiseParse("<hi!>", "<hi!>", parseErrorList12);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        xmlTreeBuilder14.initialiseParse("</<!---->>", "</<!---->>", parseErrorList17);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        xmlTreeBuilder14.initialiseParse("", "<<!---->>", parseErrorList21);
        org.jsoup.parser.Token.Comment comment23 = new org.jsoup.parser.Token.Comment();
        java.lang.String str24 = comment23.toString();
        org.jsoup.parser.Token.TokenType tokenType25 = comment23.type;
        boolean boolean26 = comment23.isComment();
        java.lang.String str27 = comment23.getData();
        java.lang.String str28 = comment23.toString();
        java.lang.String str29 = comment23.getData();
        xmlTreeBuilder14.insert(comment23);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        xmlTreeBuilder31.initialiseParse("</<!---->>", "</<!---->>", parseErrorList34);
        org.jsoup.parser.Token.Comment comment36 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType37 = org.jsoup.parser.Token.TokenType.Doctype;
        comment36.type = tokenType37;
        java.lang.StringBuilder stringBuilder39 = comment36.data;
        xmlTreeBuilder31.insert(comment36);
        org.jsoup.parser.Token.Comment comment41 = new org.jsoup.parser.Token.Comment();
        java.lang.String str42 = comment41.toString();
        xmlTreeBuilder31.insert(comment41);
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        xmlTreeBuilder31.initialiseParse("</<hi!>>", "<<!---->>", parseErrorList46);
        org.jsoup.parser.Token.Comment comment48 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType49 = org.jsoup.parser.Token.TokenType.Doctype;
        comment48.type = tokenType49;
        java.lang.StringBuilder stringBuilder51 = comment48.data;
        boolean boolean52 = comment48.isEOF();
        xmlTreeBuilder31.insert(comment48);
        xmlTreeBuilder14.insert(comment48);
        xmlTreeBuilder0.insert(comment48);
        org.jsoup.parser.Token.Comment comment56 = new org.jsoup.parser.Token.Comment();
        boolean boolean57 = comment56.isStartTag();
        java.lang.String str58 = comment56.toString();
        java.lang.String str59 = comment56.getData();
        java.lang.String str60 = comment56.getData();
        xmlTreeBuilder0.insert(comment56);
        java.lang.String str62 = comment56.getData();
        java.lang.StringBuilder stringBuilder63 = comment56.data;
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!---->" + "'", str24, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType25 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType25.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!---->" + "'", str28, "<!---->");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + tokenType37 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType37.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder39);
        org.junit.Assert.assertEquals(stringBuilder39.toString(), "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<!---->" + "'", str42, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType49 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType49.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder51);
        org.junit.Assert.assertEquals(stringBuilder51.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "<!---->" + "'", str58, "<!---->");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(stringBuilder63);
        org.junit.Assert.assertEquals(stringBuilder63.toString(), "");
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "<!---->", parseErrorList7);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        java.lang.String str10 = comment9.getData();
        xmlTreeBuilder0.insert(comment9);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder12.initialiseParse("", "<<!---->>", parseErrorList15);
        org.jsoup.parser.Token.EndTag endTag18 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str19 = endTag18.toString();
        java.lang.String str20 = endTag18.toString();
        boolean boolean21 = xmlTreeBuilder12.process((org.jsoup.parser.Token) endTag18);
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        xmlTreeBuilder12.initialiseParse("hi!<!---->", "", parseErrorList24);
        org.jsoup.parser.Token.Character character27 = new org.jsoup.parser.Token.Character("");
        java.lang.String str28 = character27.toString();
        java.lang.String str29 = character27.toString();
        java.lang.String str30 = character27.getData();
        boolean boolean31 = character27.isComment();
        java.lang.String str32 = character27.toString();
        xmlTreeBuilder12.insert(character27);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder34 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        xmlTreeBuilder34.initialiseParse("</<!---->>", "</<!---->>", parseErrorList37);
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        xmlTreeBuilder34.initialiseParse("StartTag", "<!---->", parseErrorList41);
        org.jsoup.parser.Token.Comment comment43 = new org.jsoup.parser.Token.Comment();
        java.lang.String str44 = comment43.getData();
        xmlTreeBuilder34.insert(comment43);
        java.lang.String str46 = comment43.toString();
        xmlTreeBuilder12.insert(comment43);
        boolean boolean48 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment43);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "</<!---->>" + "'", str19, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "</<!---->>" + "'", str20, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "<!---->" + "'", str46, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType4 = startTag0.type;
        java.lang.String str5 = startTag0.tagName;
        boolean boolean6 = startTag0.isCharacter();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("<!---->", "<<!---->>", parseErrorList7);
        org.jsoup.parser.Token.Character character10 = new org.jsoup.parser.Token.Character("");
        java.lang.String str11 = character10.toString();
        java.lang.String str12 = character10.getData();
        java.lang.String str13 = character10.toString();
        java.lang.String str14 = character10.toString();
        boolean boolean15 = xmlTreeBuilder0.process((org.jsoup.parser.Token) character10);
        org.jsoup.parser.Token.Comment comment16 = new org.jsoup.parser.Token.Comment();
        boolean boolean17 = comment16.isStartTag();
        org.jsoup.parser.Token.Comment comment18 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType19 = org.jsoup.parser.Token.TokenType.Doctype;
        comment18.type = tokenType19;
        comment16.type = tokenType19;
        boolean boolean22 = comment16.isStartTag();
        java.lang.StringBuilder stringBuilder23 = comment16.data;
        boolean boolean24 = comment16.isStartTag();
        java.lang.String str25 = comment16.toString();
        xmlTreeBuilder0.insert(comment16);
        org.jsoup.nodes.Attributes attributes28 = null;
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag("hi!", attributes28);
        boolean boolean30 = startTag29.isComment();
        org.jsoup.nodes.Attributes attributes31 = startTag29.attributes;
        startTag29.finaliseTag();
        startTag29.appendAttributeName("<hi!>");
        startTag29.appendAttributeValue('4');
        startTag29.selfClosing = false;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element39 = xmlTreeBuilder0.insert(startTag29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + tokenType19 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType19.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!---->" + "'", str25, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(attributes31);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        boolean boolean2 = doctype0.isDoctype();
        doctype0.forceQuirks = true;
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("<<!---->>", "<hi!>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.getData();
        boolean boolean7 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment5);
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        xmlTreeBuilder0.initialiseParse("<<!----><hi!>>", "<hi!</</<!---->>>>", parseErrorList10);
        org.jsoup.nodes.Attributes attributes13 = null;
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag("hi!", attributes13);
        boolean boolean15 = startTag14.isComment();
        startTag14.appendTagName('4');
        startTag14.appendAttributeValue("<!---->");
        java.lang.String str20 = startTag14.tokenType();
        startTag14.newAttribute();
        org.jsoup.nodes.Attributes attributes22 = startTag14.attributes;
        org.jsoup.nodes.Element element23 = xmlTreeBuilder0.insert(startTag14);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "StartTag" + "'", str20, "StartTag");
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.selfClosing;
        boolean boolean4 = startTag0.selfClosing;
        java.lang.String str5 = startTag0.tokenType();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.selfClosing;
        endTag0.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes4 = endTag0.getAttributes();
        boolean boolean5 = endTag0.isSelfClosing();
        org.jsoup.parser.Token.EndTag endTag6 = endTag0.asEndTag();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes10 = null;
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("hi!", attributes10);
        startTag11.newAttribute();
        startTag11.tagName = "";
        org.jsoup.nodes.Attributes attributes15 = startTag11.attributes;
        startTag8.attributes = attributes15;
        endTag6.attributes = attributes15;
        org.jsoup.nodes.Attributes attributes18 = endTag6.attributes;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(endTag6);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList3);
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str7 = endTag6.toString();
        java.lang.String str8 = endTag6.toString();
        boolean boolean9 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag6);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        xmlTreeBuilder0.initialiseParse("hi!<!---->", "", parseErrorList12);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        xmlTreeBuilder14.initialiseParse("</<!---->>", "</<!---->>", parseErrorList17);
        org.jsoup.parser.Token.Comment comment19 = new org.jsoup.parser.Token.Comment();
        java.lang.String str20 = comment19.toString();
        org.jsoup.parser.Token.TokenType tokenType21 = comment19.type;
        java.lang.String str22 = comment19.getData();
        xmlTreeBuilder14.insert(comment19);
        org.jsoup.parser.Token.Comment comment24 = new org.jsoup.parser.Token.Comment();
        java.lang.String str25 = comment24.toString();
        org.jsoup.parser.Token.TokenType tokenType26 = comment24.type;
        java.lang.String str27 = comment24.toString();
        xmlTreeBuilder14.insert(comment24);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        xmlTreeBuilder29.initialiseParse("</<!---->>", "StartTag", parseErrorList32);
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        xmlTreeBuilder29.initialiseParse("<!---->", "<<!---->>", parseErrorList36);
        org.jsoup.parser.Token.Character character39 = new org.jsoup.parser.Token.Character("");
        java.lang.String str40 = character39.toString();
        java.lang.String str41 = character39.getData();
        java.lang.String str42 = character39.toString();
        java.lang.String str43 = character39.toString();
        boolean boolean44 = xmlTreeBuilder29.process((org.jsoup.parser.Token) character39);
        xmlTreeBuilder14.insert(character39);
        org.jsoup.parser.Token.StartTag startTag46 = new org.jsoup.parser.Token.StartTag();
        startTag46.appendAttributeValue('4');
        boolean boolean49 = startTag46.isDoctype();
        boolean boolean50 = startTag46.isDoctype();
        java.lang.String str51 = startTag46.tokenType();
        startTag46.appendTagName('a');
        org.jsoup.parser.Token.Tag tag55 = startTag46.name("hi!");
        boolean boolean56 = xmlTreeBuilder14.process((org.jsoup.parser.Token) startTag46);
        org.jsoup.nodes.Element element57 = xmlTreeBuilder0.insert(startTag46);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder58 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList61 = null;
        xmlTreeBuilder58.initialiseParse("</<!---->>", "</<!---->>", parseErrorList61);
        org.jsoup.parser.Token.Comment comment63 = new org.jsoup.parser.Token.Comment();
        java.lang.String str64 = comment63.toString();
        org.jsoup.parser.Token.TokenType tokenType65 = comment63.type;
        java.lang.String str66 = comment63.getData();
        xmlTreeBuilder58.insert(comment63);
        org.jsoup.parser.Token.Comment comment68 = new org.jsoup.parser.Token.Comment();
        boolean boolean69 = comment68.isStartTag();
        java.lang.String str70 = comment68.toString();
        boolean boolean71 = comment68.isCharacter();
        xmlTreeBuilder58.insert(comment68);
        java.lang.String str73 = comment68.getData();
        java.lang.StringBuilder stringBuilder74 = comment68.data;
        java.lang.StringBuilder stringBuilder75 = comment68.data;
        xmlTreeBuilder0.insert(comment68);
        org.jsoup.parser.Token.Doctype doctype77 = new org.jsoup.parser.Token.Doctype();
        boolean boolean78 = doctype77.isForceQuirks();
        java.lang.String str79 = doctype77.getName();
        boolean boolean80 = doctype77.isForceQuirks();
        boolean boolean81 = doctype77.isEOF();
        java.lang.StringBuilder stringBuilder82 = doctype77.publicIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype77);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</<!---->>" + "'", str7, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</<!---->>" + "'", str8, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!---->" + "'", str20, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType21 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType21.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!---->" + "'", str25, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType26 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType26.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!---->" + "'", str27, "<!---->");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "StartTag" + "'", str51, "StartTag");
        org.junit.Assert.assertNotNull(tag55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "<!---->" + "'", str64, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType65 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType65.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "<!---->" + "'", str70, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(stringBuilder74);
        org.junit.Assert.assertEquals(stringBuilder74.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder75);
        org.junit.Assert.assertEquals(stringBuilder75.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(stringBuilder82);
        org.junit.Assert.assertEquals(stringBuilder82.toString(), "");
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        boolean boolean6 = doctype0.isCharacter();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("<<!---->>", "<hi!>", parseErrorList3);
        org.jsoup.parser.Token.Character character6 = new org.jsoup.parser.Token.Character("<<!---->>");
        java.lang.String str7 = character6.getData();
        java.lang.String str8 = character6.toString();
        java.lang.String str9 = character6.getData();
        java.lang.String str10 = character6.toString();
        xmlTreeBuilder0.insert(character6);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder12.initialiseParse("</<!---->>", "StartTag", parseErrorList15);
        org.jsoup.parser.Token.Character character18 = new org.jsoup.parser.Token.Character("");
        java.lang.String str19 = character18.toString();
        java.lang.String str20 = character18.toString();
        boolean boolean21 = character18.isDoctype();
        xmlTreeBuilder12.insert(character18);
        java.lang.String str23 = character18.getData();
        java.lang.String str24 = character18.toString();
        java.lang.String str25 = character18.getData();
        boolean boolean26 = xmlTreeBuilder0.process((org.jsoup.parser.Token) character18);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype27 = character18.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<<!---->>" + "'", str7, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<<!---->>" + "'", str8, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<<!---->>" + "'", str9, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<<!---->>" + "'", str10, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "<!---->", parseErrorList7);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        java.lang.String str10 = comment9.getData();
        xmlTreeBuilder0.insert(comment9);
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        java.lang.String str13 = comment12.toString();
        boolean boolean14 = comment12.isEndTag();
        xmlTreeBuilder0.insert(comment12);
        org.jsoup.parser.Token.Comment comment16 = new org.jsoup.parser.Token.Comment();
        boolean boolean17 = comment16.isStartTag();
        org.jsoup.parser.Token.Comment comment18 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType19 = org.jsoup.parser.Token.TokenType.Doctype;
        comment18.type = tokenType19;
        comment16.type = tokenType19;
        xmlTreeBuilder0.insert(comment16);
        org.jsoup.parser.Token.Character character24 = new org.jsoup.parser.Token.Character("</<!---->StartTag<!----><<!---->>>");
        xmlTreeBuilder0.insert(character24);
        org.jsoup.nodes.Attributes attributes28 = null;
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag("hi!", attributes28);
        startTag29.newAttribute();
        startTag29.tagName = "";
        boolean boolean33 = startTag29.isComment();
        startTag29.selfClosing = true;
        org.jsoup.nodes.Attributes attributes36 = startTag29.attributes;
        org.jsoup.parser.Token.StartTag startTag37 = new org.jsoup.parser.Token.StartTag("<!---->StartTag", attributes36);
        boolean boolean38 = startTag37.isSelfClosing();
        boolean boolean39 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag37);
        org.jsoup.nodes.Attributes attributes40 = startTag37.attributes;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + tokenType19 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType19.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(attributes40);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "<!---->", parseErrorList7);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        java.lang.String str10 = comment9.getData();
        xmlTreeBuilder0.insert(comment9);
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        java.lang.String str13 = comment12.toString();
        boolean boolean14 = comment12.isEndTag();
        xmlTreeBuilder0.insert(comment12);
        org.jsoup.parser.Token.Comment comment16 = new org.jsoup.parser.Token.Comment();
        boolean boolean17 = comment16.isStartTag();
        org.jsoup.parser.Token.Comment comment18 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType19 = org.jsoup.parser.Token.TokenType.Doctype;
        comment18.type = tokenType19;
        comment16.type = tokenType19;
        xmlTreeBuilder0.insert(comment16);
        org.jsoup.parser.Token.EndTag endTag24 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag24.appendAttributeValue('#');
        endTag24.finaliseTag();
        endTag24.appendTagName("StartTag");
        endTag24.newAttribute();
        org.jsoup.parser.Token.TokenType tokenType31 = endTag24.type;
        java.lang.String str32 = endTag24.toString();
        boolean boolean33 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag24);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder34 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        xmlTreeBuilder34.initialiseParse("</<!---->>", "</<!---->>", parseErrorList37);
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        xmlTreeBuilder34.initialiseParse("StartTag", "<!---->", parseErrorList41);
        org.jsoup.parser.Token.Comment comment43 = new org.jsoup.parser.Token.Comment();
        boolean boolean44 = comment43.isStartTag();
        org.jsoup.parser.Token.Comment comment45 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType46 = org.jsoup.parser.Token.TokenType.Doctype;
        comment45.type = tokenType46;
        comment43.type = tokenType46;
        boolean boolean49 = comment43.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType50 = comment43.type;
        xmlTreeBuilder34.insert(comment43);
        java.lang.StringBuilder stringBuilder52 = comment43.data;
        xmlTreeBuilder0.insert(comment43);
        org.jsoup.parser.Token.StartTag startTag55 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str56 = startTag55.toString();
        boolean boolean57 = startTag55.isEndTag();
        startTag55.appendAttributeName("hi!EndTag");
        startTag55.appendTagName("<!----><<!---->>");
        org.jsoup.nodes.Element element62 = xmlTreeBuilder0.insert(startTag55);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + tokenType19 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType19.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + tokenType31 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType31.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "</<!---->StartTag>" + "'", str32, "</<!---->StartTag>");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + tokenType46 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType46.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + tokenType50 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType50.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder52);
        org.junit.Assert.assertEquals(stringBuilder52.toString(), "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "<<!---->>" + "'", str56, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(element62);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "<!---->", parseErrorList7);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        java.lang.String str10 = comment9.getData();
        xmlTreeBuilder0.insert(comment9);
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        java.lang.String str13 = comment12.toString();
        boolean boolean14 = comment12.isEndTag();
        xmlTreeBuilder0.insert(comment12);
        org.jsoup.parser.Token.Comment comment16 = new org.jsoup.parser.Token.Comment();
        boolean boolean17 = comment16.isStartTag();
        org.jsoup.parser.Token.Comment comment18 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType19 = org.jsoup.parser.Token.TokenType.Doctype;
        comment18.type = tokenType19;
        comment16.type = tokenType19;
        xmlTreeBuilder0.insert(comment16);
        org.jsoup.parser.Token.EndTag endTag24 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag24.appendAttributeValue('#');
        endTag24.finaliseTag();
        endTag24.appendTagName("StartTag");
        endTag24.newAttribute();
        org.jsoup.parser.Token.TokenType tokenType31 = endTag24.type;
        java.lang.String str32 = endTag24.toString();
        boolean boolean33 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag24);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder34 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        xmlTreeBuilder34.initialiseParse("</<!---->>", "</<!---->>", parseErrorList37);
        org.jsoup.parser.Token.Comment comment39 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType40 = org.jsoup.parser.Token.TokenType.Doctype;
        comment39.type = tokenType40;
        java.lang.StringBuilder stringBuilder42 = comment39.data;
        xmlTreeBuilder34.insert(comment39);
        org.jsoup.parser.Token.Comment comment44 = new org.jsoup.parser.Token.Comment();
        java.lang.String str45 = comment44.toString();
        xmlTreeBuilder34.insert(comment44);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder47 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList50 = null;
        xmlTreeBuilder47.initialiseParse("", "<<!---->>", parseErrorList50);
        org.jsoup.parser.Token.Comment comment52 = new org.jsoup.parser.Token.Comment();
        boolean boolean53 = comment52.isStartTag();
        org.jsoup.parser.Token.Comment comment54 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType55 = org.jsoup.parser.Token.TokenType.Doctype;
        comment54.type = tokenType55;
        comment52.type = tokenType55;
        boolean boolean58 = comment52.isStartTag();
        java.lang.String str59 = comment52.getData();
        xmlTreeBuilder47.insert(comment52);
        boolean boolean61 = comment52.isDoctype();
        java.lang.StringBuilder stringBuilder62 = comment52.data;
        java.lang.String str63 = comment52.tokenType();
        java.lang.String str64 = comment52.getData();
        xmlTreeBuilder34.insert(comment52);
        org.jsoup.parser.Token.Comment comment66 = new org.jsoup.parser.Token.Comment();
        java.lang.String str67 = comment66.toString();
        org.jsoup.parser.Token.TokenType tokenType68 = comment66.type;
        boolean boolean69 = comment66.isComment();
        java.lang.StringBuilder stringBuilder70 = comment66.data;
        xmlTreeBuilder34.insert(comment66);
        org.jsoup.parser.ParseErrorList parseErrorList74 = null;
        xmlTreeBuilder34.initialiseParse("hi!4", "<<!---->>", parseErrorList74);
        org.jsoup.parser.Token.Comment comment76 = new org.jsoup.parser.Token.Comment();
        boolean boolean77 = comment76.isStartTag();
        org.jsoup.parser.Token.Comment comment78 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType79 = org.jsoup.parser.Token.TokenType.Doctype;
        comment78.type = tokenType79;
        comment76.type = tokenType79;
        boolean boolean82 = comment76.isStartTag();
        java.lang.String str83 = comment76.getData();
        java.lang.String str84 = comment76.toString();
        org.jsoup.parser.Token.Comment comment85 = new org.jsoup.parser.Token.Comment();
        boolean boolean86 = comment85.isStartTag();
        org.jsoup.parser.Token.Comment comment87 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType88 = org.jsoup.parser.Token.TokenType.Doctype;
        comment87.type = tokenType88;
        comment85.type = tokenType88;
        boolean boolean91 = comment85.isStartTag();
        java.lang.StringBuilder stringBuilder92 = comment85.data;
        boolean boolean93 = comment85.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType94 = comment85.type;
        comment76.type = tokenType94;
        xmlTreeBuilder34.insert(comment76);
        xmlTreeBuilder0.insert(comment76);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + tokenType19 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType19.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + tokenType31 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType31.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "</<!---->StartTag>" + "'", str32, "</<!---->StartTag>");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + tokenType40 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType40.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder42);
        org.junit.Assert.assertEquals(stringBuilder42.toString(), "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "<!---->" + "'", str45, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + tokenType55 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType55.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(stringBuilder62);
        org.junit.Assert.assertEquals(stringBuilder62.toString(), "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Comment" + "'", str63, "Comment");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "<!---->" + "'", str67, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType68 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType68.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(stringBuilder70);
        org.junit.Assert.assertEquals(stringBuilder70.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + tokenType79 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType79.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "<!---->" + "'", str84, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + tokenType88 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType88.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(stringBuilder92);
        org.junit.Assert.assertEquals(stringBuilder92.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + tokenType94 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType94.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.tokenType();
        boolean boolean3 = startTag1.isComment();
        java.lang.String str4 = startTag1.toString();
        boolean boolean5 = startTag1.isComment();
        org.jsoup.parser.Token.Tag tag7 = startTag1.name("");
        tag7.appendTagName('a');
        tag7.newAttribute();
        org.jsoup.parser.Token.StartTag startTag11 = tag7.asStartTag();
        org.jsoup.parser.Token.StartTag startTag12 = tag7.asStartTag();
        boolean boolean13 = startTag12.isSelfClosing();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<<!---->>" + "'", str4, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder3 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder4 = doctype0.name;
        doctype0.forceQuirks = true;
        java.lang.String str7 = doctype0.getPublicIdentifier();
        boolean boolean8 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        endTag1.appendTagName("StartTag");
        endTag1.newAttribute();
        org.jsoup.parser.Token.TokenType tokenType8 = endTag1.type;
        boolean boolean9 = endTag1.isCharacter();
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        java.lang.String str13 = endTag1.tokenType();
        java.lang.String str14 = endTag1.toString();
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EndTag" + "'", str13, "EndTag");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "</<!---->StartTag>" + "'", str14, "</<!---->StartTag>");
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.appendAttributeName("EndTag");
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.toString();
        boolean boolean3 = startTag1.isEndTag();
        startTag1.appendAttributeName("hi!EndTag");
        startTag1.appendTagName("<!----><<!---->>");
        boolean boolean8 = startTag1.isStartTag();
        startTag1.appendAttributeValue('4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<<!---->>" + "'", str2, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        org.jsoup.parser.Token.TokenType tokenType4 = doctype0.type;
        java.lang.String str5 = doctype0.getSystemIdentifier();
        boolean boolean6 = doctype0.isComment();
        boolean boolean7 = doctype0.isForceQuirks();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder8 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        xmlTreeBuilder8.initialiseParse("</<!---->>", "</<!---->>", parseErrorList11);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder8.initialiseParse("StartTag", "<!---->", parseErrorList15);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        xmlTreeBuilder17.initialiseParse("</<!---->>", "</<!---->>", parseErrorList20);
        org.jsoup.parser.Token.Comment comment22 = new org.jsoup.parser.Token.Comment();
        java.lang.String str23 = comment22.toString();
        org.jsoup.parser.Token.TokenType tokenType24 = comment22.type;
        java.lang.String str25 = comment22.getData();
        xmlTreeBuilder17.insert(comment22);
        java.lang.String str27 = comment22.toString();
        xmlTreeBuilder8.insert(comment22);
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag();
        startTag29.selfClosing = false;
        startTag29.appendTagName("hi!");
        org.jsoup.nodes.Attributes attributes34 = startTag29.getAttributes();
        startTag29.appendAttributeValue('a');
        startTag29.finaliseTag();
        org.jsoup.nodes.Element element38 = xmlTreeBuilder8.insert(startTag29);
        org.jsoup.parser.Token.Comment comment39 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType40 = org.jsoup.parser.Token.TokenType.Doctype;
        comment39.type = tokenType40;
        java.lang.StringBuilder stringBuilder42 = comment39.data;
        org.jsoup.parser.Token.TokenType tokenType43 = comment39.type;
        startTag29.type = tokenType43;
        doctype0.type = tokenType43;
        doctype0.forceQuirks = true;
        boolean boolean48 = doctype0.isForceQuirks();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<!---->" + "'", str23, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType24 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType24.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!---->" + "'", str27, "<!---->");
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertTrue("'" + tokenType40 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType40.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder42);
        org.junit.Assert.assertEquals(stringBuilder42.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType43 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType43.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("hi!", attributes3);
        startTag4.newAttribute();
        startTag4.tagName = "";
        org.jsoup.nodes.Attributes attributes8 = startTag4.attributes;
        startTag1.attributes = attributes8;
        boolean boolean10 = startTag1.isDoctype();
        org.jsoup.parser.Token.StartTag startTag11 = startTag1.asStartTag();
        boolean boolean12 = startTag11.isEOF();
        startTag11.selfClosing = true;
        org.jsoup.nodes.Attributes attributes16 = null;
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag("hi!", attributes16);
        boolean boolean18 = startTag17.isComment();
        org.jsoup.parser.Token.Comment comment19 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType20 = org.jsoup.parser.Token.TokenType.Doctype;
        comment19.type = tokenType20;
        startTag17.type = tokenType20;
        startTag17.selfClosing = false;
        boolean boolean25 = startTag17.isCharacter();
        org.jsoup.nodes.Attributes attributes27 = null;
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag("hi!", attributes27);
        boolean boolean29 = startTag28.isComment();
        boolean boolean30 = startTag28.selfClosing;
        startTag28.newAttribute();
        org.jsoup.nodes.Attributes attributes32 = startTag28.getAttributes();
        startTag17.attributes = attributes32;
        startTag11.attributes = attributes32;
        startTag11.appendAttributeValue('#');
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(attributes32);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        org.jsoup.parser.Token.TokenType tokenType7 = comment5.type;
        java.lang.String str8 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Comment comment10 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType11 = org.jsoup.parser.Token.TokenType.Doctype;
        comment10.type = tokenType11;
        xmlTreeBuilder0.insert(comment10);
        org.jsoup.parser.Token.Comment comment14 = new org.jsoup.parser.Token.Comment();
        java.lang.String str15 = comment14.toString();
        boolean boolean16 = comment14.isEOF();
        boolean boolean17 = comment14.isEndTag();
        xmlTreeBuilder0.insert(comment14);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        xmlTreeBuilder0.initialiseParse("EndTag", "<<hi!>StartTag>", parseErrorList21);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder23 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        xmlTreeBuilder23.initialiseParse("</<!---->>", "</<!---->>", parseErrorList26);
        org.jsoup.parser.Token.Comment comment28 = new org.jsoup.parser.Token.Comment();
        java.lang.String str29 = comment28.toString();
        org.jsoup.parser.Token.TokenType tokenType30 = comment28.type;
        java.lang.String str31 = comment28.getData();
        xmlTreeBuilder23.insert(comment28);
        org.jsoup.parser.Token.Comment comment33 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType34 = org.jsoup.parser.Token.TokenType.Doctype;
        comment33.type = tokenType34;
        xmlTreeBuilder23.insert(comment33);
        org.jsoup.parser.Token.Comment comment37 = new org.jsoup.parser.Token.Comment();
        java.lang.String str38 = comment37.toString();
        boolean boolean39 = comment37.isEOF();
        boolean boolean40 = comment37.isEndTag();
        xmlTreeBuilder23.insert(comment37);
        xmlTreeBuilder0.insert(comment37);
        org.jsoup.parser.Token.EndTag endTag44 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag44.appendAttributeValue('#');
        boolean boolean47 = endTag44.isEndTag();
        boolean boolean48 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag44);
        org.jsoup.parser.Token.StartTag startTag49 = new org.jsoup.parser.Token.StartTag();
        startTag49.appendAttributeValue('4');
        boolean boolean52 = startTag49.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType53 = startTag49.type;
        java.lang.String str54 = startTag49.tagName;
        boolean boolean55 = startTag49.isEndTag();
        startTag49.appendAttributeValue("");
        startTag49.tagName = "<!----><<!---->>";
        boolean boolean60 = startTag49.isSelfClosing();
        boolean boolean61 = startTag49.isStartTag();
        boolean boolean62 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag49);
        org.jsoup.parser.Token.EndTag endTag64 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str65 = endTag64.toString();
        boolean boolean66 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag64);
        org.jsoup.nodes.Attributes attributes67 = endTag64.getAttributes();
        org.jsoup.parser.Token.Tag tag69 = endTag64.name("</EndTag>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!---->" + "'", str15, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!---->" + "'", str29, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType30 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType30.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + tokenType34 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType34.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<!---->" + "'", str38, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + tokenType53 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType53.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "</<!---->>" + "'", str65, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNull(attributes67);
        org.junit.Assert.assertNotNull(tag69);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        org.jsoup.parser.Token.TokenType tokenType7 = comment5.type;
        java.lang.String str8 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Comment comment10 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType11 = org.jsoup.parser.Token.TokenType.Doctype;
        comment10.type = tokenType11;
        xmlTreeBuilder0.insert(comment10);
        org.jsoup.parser.Token.Comment comment14 = new org.jsoup.parser.Token.Comment();
        java.lang.String str15 = comment14.toString();
        boolean boolean16 = comment14.isEOF();
        boolean boolean17 = comment14.isEndTag();
        xmlTreeBuilder0.insert(comment14);
        org.jsoup.parser.Token.Character character20 = new org.jsoup.parser.Token.Character("");
        boolean boolean21 = character20.isEndTag();
        java.lang.String str22 = character20.toString();
        java.lang.String str23 = character20.getData();
        java.lang.String str24 = character20.toString();
        boolean boolean25 = character20.isEndTag();
        org.jsoup.parser.Token.Doctype doctype26 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder27 = doctype26.publicIdentifier;
        java.lang.StringBuilder stringBuilder28 = doctype26.publicIdentifier;
        java.lang.String str29 = doctype26.getSystemIdentifier();
        org.jsoup.nodes.Attributes attributes31 = null;
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag("hi!", attributes31);
        org.jsoup.parser.Token.TokenType tokenType33 = startTag32.type;
        startTag32.finaliseTag();
        boolean boolean35 = startTag32.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType36 = startTag32.type;
        doctype26.type = tokenType36;
        character20.type = tokenType36;
        java.lang.String str39 = character20.toString();
        boolean boolean40 = character20.isCharacter();
        java.lang.String str41 = character20.getData();
        xmlTreeBuilder0.insert(character20);
        java.lang.String str43 = character20.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!---->" + "'", str15, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + tokenType33 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType33.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + tokenType36 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType36.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.newAttribute();
        startTag2.tagName = "";
        boolean boolean6 = startTag2.isComment();
        boolean boolean7 = startTag2.isSelfClosing();
        boolean boolean8 = startTag2.isStartTag();
        startTag2.appendTagName("<4>");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType6 = org.jsoup.parser.Token.TokenType.Doctype;
        comment5.type = tokenType6;
        java.lang.StringBuilder stringBuilder8 = comment5.data;
        xmlTreeBuilder0.insert(comment5);
        boolean boolean10 = comment5.isComment();
        boolean boolean11 = comment5.isStartTag();
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType5 = org.jsoup.parser.Token.TokenType.Doctype;
        comment4.type = tokenType5;
        startTag2.type = tokenType5;
        java.lang.String str8 = startTag2.tagName;
        org.jsoup.parser.Token.Tag tag10 = startTag2.name("<!----><<!---->>");
        tag10.selfClosing = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        boolean boolean2 = doctype0.isForceQuirks();
        boolean boolean3 = doctype0.isForceQuirks();
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag("hi!", attributes5);
        boolean boolean7 = startTag6.isComment();
        org.jsoup.parser.Token.Comment comment8 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType9 = org.jsoup.parser.Token.TokenType.Doctype;
        comment8.type = tokenType9;
        startTag6.type = tokenType9;
        doctype0.type = tokenType9;
        java.lang.String str13 = doctype0.tokenType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Doctype" + "'", str13, "Doctype");
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str3 = startTag2.tokenType();
        boolean boolean4 = startTag2.isSelfClosing();
        startTag2.finaliseTag();
        org.jsoup.nodes.Attributes attributes6 = startTag2.getAttributes();
        org.jsoup.nodes.Attributes attributes7 = startTag2.attributes;
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("<hi!>", attributes7);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "StartTag" + "'", str3, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.tokenType();
        boolean boolean3 = startTag1.isSelfClosing();
        java.lang.String str4 = startTag1.tokenType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "StartTag" + "'", str4, "StartTag");
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeName("Comment");
        java.lang.String str4 = endTag1.tokenType();
        org.jsoup.parser.Token.Tag tag6 = endTag1.name("4#");
        tag6.appendAttributeName(' ');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EndTag" + "'", str4, "EndTag");
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("<!---->", "<<!---->>", parseErrorList7);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        boolean boolean10 = comment9.isStartTag();
        org.jsoup.parser.Token.Comment comment11 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType12 = org.jsoup.parser.Token.TokenType.Doctype;
        comment11.type = tokenType12;
        comment9.type = tokenType12;
        boolean boolean15 = comment9.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType16 = comment9.type;
        xmlTreeBuilder0.insert(comment9);
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        startTag18.appendAttributeValue('4');
        boolean boolean21 = startTag18.isDoctype();
        boolean boolean22 = startTag18.isCharacter();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element23 = xmlTreeBuilder0.insert(startTag18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendTagName('4');
        org.jsoup.parser.Token.StartTag startTag6 = startTag2.asStartTag();
        java.lang.String str7 = startTag6.tokenType();
        boolean boolean8 = startTag6.isDoctype();
        org.jsoup.parser.Token.Tag tag10 = startTag6.name("hi!");
        tag10.selfClosing = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "StartTag" + "'", str7, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "<!---->", parseErrorList7);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        java.lang.String str10 = comment9.getData();
        xmlTreeBuilder0.insert(comment9);
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        java.lang.String str13 = comment12.toString();
        boolean boolean14 = comment12.isEndTag();
        xmlTreeBuilder0.insert(comment12);
        org.jsoup.parser.Token.Comment comment16 = new org.jsoup.parser.Token.Comment();
        boolean boolean17 = comment16.isStartTag();
        org.jsoup.parser.Token.Comment comment18 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType19 = org.jsoup.parser.Token.TokenType.Doctype;
        comment18.type = tokenType19;
        comment16.type = tokenType19;
        xmlTreeBuilder0.insert(comment16);
        org.jsoup.parser.Token.Character character24 = new org.jsoup.parser.Token.Character("</<!---->StartTag<!----><<!---->>>");
        xmlTreeBuilder0.insert(character24);
        java.lang.String str26 = character24.getData();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + tokenType19 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType19.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "</<!---->StartTag<!----><<!---->>>" + "'", str26, "</<!---->StartTag<!----><<!---->>>");
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendAttributeName("StartTag");
        java.lang.String str6 = startTag2.name();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str9 = startTag8.tokenType();
        boolean boolean10 = startTag8.isComment();
        java.lang.String str11 = startTag8.toString();
        boolean boolean12 = startTag8.isComment();
        org.jsoup.parser.Token.Tag tag14 = startTag8.name("");
        org.jsoup.parser.Token.Tag tag16 = tag14.name("<<!---->>");
        tag16.finaliseTag();
        org.jsoup.parser.Token.Character character19 = new org.jsoup.parser.Token.Character("");
        boolean boolean20 = character19.isEndTag();
        java.lang.String str21 = character19.toString();
        java.lang.String str22 = character19.getData();
        java.lang.String str23 = character19.toString();
        boolean boolean24 = character19.isEndTag();
        org.jsoup.parser.Token.Doctype doctype25 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder26 = doctype25.publicIdentifier;
        java.lang.StringBuilder stringBuilder27 = doctype25.publicIdentifier;
        java.lang.String str28 = doctype25.getSystemIdentifier();
        org.jsoup.nodes.Attributes attributes30 = null;
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag("hi!", attributes30);
        org.jsoup.parser.Token.TokenType tokenType32 = startTag31.type;
        startTag31.finaliseTag();
        boolean boolean34 = startTag31.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType35 = startTag31.type;
        doctype25.type = tokenType35;
        character19.type = tokenType35;
        tag16.type = tokenType35;
        startTag2.type = tokenType35;
        org.jsoup.nodes.Attributes attributes41 = null;
        org.jsoup.parser.Token.StartTag startTag42 = new org.jsoup.parser.Token.StartTag("hi!", attributes41);
        startTag42.appendAttributeValue(' ');
        java.lang.String str45 = startTag42.tokenType();
        java.lang.String str46 = startTag42.name();
        startTag42.appendTagName("<!---->");
        startTag42.tagName = "StartTag";
        startTag42.finaliseTag();
        java.lang.String str52 = startTag42.name();
        org.jsoup.parser.Token.TokenType tokenType53 = startTag42.type;
        startTag2.type = tokenType53;
        startTag2.tagName = "</<4>>";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "StartTag" + "'", str9, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<<!---->>" + "'", str11, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + tokenType32 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType32.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + tokenType35 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType35.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "StartTag" + "'", str45, "StartTag");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "StartTag" + "'", str52, "StartTag");
        org.junit.Assert.assertTrue("'" + tokenType53 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType53.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        org.jsoup.parser.Token.TokenType tokenType2 = comment0.type;
        boolean boolean3 = comment0.isComment();
        java.lang.String str4 = comment0.getData();
        java.lang.String str5 = comment0.toString();
        boolean boolean6 = comment0.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType7 = comment0.type;
        java.lang.String str8 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!---->" + "'", str8, "<!---->");
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.selfClosing;
        endTag0.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes4 = endTag0.getAttributes();
        org.jsoup.parser.Token.TokenType tokenType5 = endTag0.type;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("</<!---->>");
        java.lang.String str2 = endTag1.toString();
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag();
        startTag4.appendAttributeValue('4');
        boolean boolean7 = startTag4.isEndTag();
        startTag4.newAttribute();
        boolean boolean9 = startTag4.isComment();
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes13 = null;
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag("hi!", attributes13);
        startTag14.newAttribute();
        startTag14.tagName = "";
        org.jsoup.nodes.Attributes attributes18 = startTag14.attributes;
        startTag11.attributes = attributes18;
        startTag4.attributes = attributes18;
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag("<!---->", attributes18);
        endTag1.attributes = attributes18;
        endTag1.finaliseTag();
        java.lang.String str24 = endTag1.toString();
        java.lang.String str25 = endTag1.tagName;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</</<!---->>>" + "'", str2, "</</<!---->>>");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "</</<!---->>>" + "'", str24, "</</<!---->>>");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "</<!---->>" + "'", str25, "</<!---->>");
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag("hi!", attributes5);
        org.jsoup.parser.Token.TokenType tokenType7 = startTag6.type;
        startTag6.finaliseTag();
        boolean boolean9 = startTag6.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType10 = startTag6.type;
        doctype0.type = tokenType10;
        boolean boolean12 = doctype0.forceQuirks;
        boolean boolean13 = doctype0.isStartTag();
        java.lang.String str14 = doctype0.getPublicIdentifier();
        java.lang.String str15 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        endTag1.tagName = "</</<!---->>>";
        org.jsoup.nodes.Attributes attributes7 = endTag1.getAttributes();
        boolean boolean8 = endTag1.selfClosing;
        org.jsoup.parser.Token.Tag tag10 = endTag1.name("</<!---->StartTag<!----><<!---->>>");
        java.lang.String str11 = endTag1.toString();
        org.jsoup.parser.Token.Tag tag13 = endTag1.name("<</<<<!---->>>>>");
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "</</<!---->StartTag<!----><<!---->>>>" + "'", str11, "</</<!---->StartTag<!----><<!---->>>>");
        org.junit.Assert.assertNotNull(tag13);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.appendAttributeValue(' ');
        boolean boolean5 = startTag2.isSelfClosing();
        org.jsoup.parser.Token.Tag tag7 = startTag2.name("<<!---->>");
        org.jsoup.nodes.Attributes attributes8 = tag7.attributes;
        boolean boolean9 = tag7.isSelfClosing();
        org.jsoup.nodes.Attributes attributes10 = tag7.getAttributes();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(attributes10);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList7);
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        xmlTreeBuilder0.initialiseParse("<!---->", "hi!", parseErrorList11);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder0.initialiseParse("<<!---->>", "", parseErrorList15);
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes21 = null;
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag("hi!", attributes21);
        startTag22.newAttribute();
        startTag22.tagName = "";
        org.jsoup.nodes.Attributes attributes26 = startTag22.attributes;
        startTag19.attributes = attributes26;
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag("StartTag", attributes26);
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes32 = null;
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag("hi!", attributes32);
        startTag33.newAttribute();
        startTag33.tagName = "";
        org.jsoup.nodes.Attributes attributes37 = startTag33.attributes;
        startTag30.attributes = attributes37;
        startTag28.attributes = attributes37;
        startTag28.newAttribute();
        org.jsoup.nodes.Attributes attributes42 = null;
        org.jsoup.parser.Token.StartTag startTag43 = new org.jsoup.parser.Token.StartTag("hi!", attributes42);
        boolean boolean44 = startTag43.isComment();
        startTag43.appendAttributeName('4');
        java.lang.String str47 = startTag43.tokenType();
        org.jsoup.nodes.Attributes attributes49 = null;
        org.jsoup.parser.Token.StartTag startTag50 = new org.jsoup.parser.Token.StartTag("hi!", attributes49);
        startTag50.appendAttributeValue(' ');
        java.lang.String str53 = startTag50.tokenType();
        java.lang.String str54 = startTag50.name();
        startTag50.appendTagName("<!---->");
        startTag50.tagName = "StartTag";
        org.jsoup.parser.Token.StartTag startTag59 = new org.jsoup.parser.Token.StartTag();
        startTag59.selfClosing = false;
        startTag59.appendTagName("hi!");
        org.jsoup.nodes.Attributes attributes64 = startTag59.getAttributes();
        startTag50.attributes = attributes64;
        startTag43.attributes = attributes64;
        startTag28.attributes = attributes64;
        org.jsoup.nodes.Element element68 = xmlTreeBuilder0.insert(startTag28);
        org.jsoup.parser.Token.Character character70 = new org.jsoup.parser.Token.Character("");
        boolean boolean71 = character70.isEndTag();
        java.lang.String str72 = character70.toString();
        java.lang.String str73 = character70.getData();
        java.lang.String str74 = character70.toString();
        boolean boolean75 = character70.isEndTag();
        org.jsoup.parser.Token.Doctype doctype76 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder77 = doctype76.publicIdentifier;
        java.lang.StringBuilder stringBuilder78 = doctype76.publicIdentifier;
        java.lang.String str79 = doctype76.getSystemIdentifier();
        org.jsoup.nodes.Attributes attributes81 = null;
        org.jsoup.parser.Token.StartTag startTag82 = new org.jsoup.parser.Token.StartTag("hi!", attributes81);
        org.jsoup.parser.Token.TokenType tokenType83 = startTag82.type;
        startTag82.finaliseTag();
        boolean boolean85 = startTag82.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType86 = startTag82.type;
        doctype76.type = tokenType86;
        character70.type = tokenType86;
        java.lang.String str89 = character70.getData();
        java.lang.String str90 = character70.getData();
        boolean boolean91 = character70.isEOF();
        java.lang.String str92 = character70.toString();
        xmlTreeBuilder0.insert(character70);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "StartTag" + "'", str47, "StartTag");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "StartTag" + "'", str53, "StartTag");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertNotNull(attributes64);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(stringBuilder77);
        org.junit.Assert.assertEquals(stringBuilder77.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder78);
        org.junit.Assert.assertEquals(stringBuilder78.toString(), "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertTrue("'" + tokenType83 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType83.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + tokenType86 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType86.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        java.lang.StringBuilder stringBuilder2 = comment0.data;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        org.jsoup.parser.Token.TokenType tokenType4 = comment0.type;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.Comment));
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.appendAttributeValue(' ');
        startTag2.newAttribute();
        startTag2.finaliseTag();
        startTag2.finaliseTag();
        boolean boolean8 = startTag2.isComment();
        java.lang.String str9 = startTag2.name();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag5 = new org.jsoup.parser.Token.EndTag();
        boolean boolean6 = endTag5.selfClosing;
        org.jsoup.parser.Token.Tag tag8 = endTag5.name("<!---->");
        org.jsoup.parser.Token.TokenType tokenType9 = org.jsoup.parser.Token.TokenType.StartTag;
        tag8.type = tokenType9;
        endTag1.type = tokenType9;
        java.lang.String str12 = endTag1.toString();
        java.lang.String str13 = endTag1.tokenType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "</<!---->>" + "'", str12, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EndTag" + "'", str13, "EndTag");
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        boolean boolean6 = comment5.isStartTag();
        org.jsoup.parser.Token.Comment comment7 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.Doctype;
        comment7.type = tokenType8;
        comment5.type = tokenType8;
        boolean boolean11 = comment5.isStartTag();
        java.lang.String str12 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        xmlTreeBuilder0.initialiseParse("EndTag", "<<!---->>", parseErrorList16);
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        xmlTreeBuilder0.initialiseParse("<hi!4</<!---->>>", "<hi!4>", parseErrorList20);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.appendAttributeValue(' ');
        boolean boolean5 = startTag2.isSelfClosing();
        boolean boolean6 = startTag2.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType7 = startTag2.type;
        boolean boolean8 = startTag2.isDoctype();
        startTag2.selfClosing = false;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.selfClosing;
        org.jsoup.parser.Token.Tag tag3 = endTag0.name("<!---->");
        boolean boolean4 = tag3.isCharacter();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag5 = tag3.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isEOF();
        startTag0.appendAttributeValue("hi!");
        startTag0.appendTagName('4');
        boolean boolean9 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag11 = startTag0.name("hi!");
        boolean boolean12 = startTag0.isComment();
        org.jsoup.parser.Token.StartTag startTag13 = startTag0.asStartTag();
        org.jsoup.parser.Token.StartTag startTag14 = startTag13.asStartTag();
        org.jsoup.parser.Token.StartTag startTag15 = startTag14.asStartTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment16 = startTag15.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(startTag13);
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertNotNull(startTag15);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "<!---->", parseErrorList7);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        java.lang.String str10 = comment9.getData();
        xmlTreeBuilder0.insert(comment9);
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        java.lang.String str13 = comment12.toString();
        boolean boolean14 = comment12.isEndTag();
        xmlTreeBuilder0.insert(comment12);
        org.jsoup.parser.Token.Character character17 = new org.jsoup.parser.Token.Character("hi!");
        java.lang.String str18 = character17.getData();
        java.lang.String str19 = character17.toString();
        xmlTreeBuilder0.insert(character17);
        org.jsoup.parser.Token.Comment comment21 = new org.jsoup.parser.Token.Comment();
        boolean boolean22 = comment21.isStartTag();
        org.jsoup.parser.Token.Comment comment23 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType24 = org.jsoup.parser.Token.TokenType.Doctype;
        comment23.type = tokenType24;
        comment21.type = tokenType24;
        boolean boolean27 = comment21.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType28 = comment21.type;
        java.lang.String str29 = comment21.getData();
        java.lang.StringBuilder stringBuilder30 = comment21.data;
        java.lang.StringBuilder stringBuilder31 = comment21.data;
        java.lang.String str32 = comment21.getData();
        xmlTreeBuilder0.insert(comment21);
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str36 = startTag35.toString();
        boolean boolean37 = startTag35.isEndTag();
        boolean boolean38 = startTag35.isEOF();
        boolean boolean39 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + tokenType24 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType24.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + tokenType28 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType28.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(stringBuilder30);
        org.junit.Assert.assertEquals(stringBuilder30.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder31);
        org.junit.Assert.assertEquals(stringBuilder31.toString(), "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<<!---->>" + "'", str36, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.Doctype doctype6 = doctype0.asDoctype();
        doctype0.forceQuirks = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(doctype6);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        endTag1.appendTagName("StartTag");
        endTag1.newAttribute();
        org.jsoup.parser.Token.TokenType tokenType8 = endTag1.type;
        boolean boolean9 = endTag1.isCharacter();
        endTag1.appendAttributeName("");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        org.jsoup.nodes.Attributes attributes4 = null;
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag("hi!", attributes4);
        startTag5.newAttribute();
        startTag5.tagName = "";
        org.jsoup.nodes.Attributes attributes9 = startTag5.attributes;
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("", attributes9);
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        startTag11.appendAttributeValue('4');
        boolean boolean14 = startTag11.isDoctype();
        org.jsoup.nodes.Attributes attributes15 = startTag11.attributes;
        startTag10.attributes = attributes15;
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag("<!----><<!---->>", attributes15);
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag("</</<!---->>>", attributes15);
        boolean boolean19 = startTag18.isStartTag();
        org.jsoup.nodes.Attributes attributes20 = startTag18.attributes;
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(attributes20);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.newAttribute();
        boolean boolean4 = startTag2.isSelfClosing();
        boolean boolean5 = startTag2.isEOF();
        boolean boolean6 = startTag2.isEndTag();
        org.jsoup.parser.Token.TokenType tokenType7 = startTag2.type;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str10 = startTag9.toString();
        boolean boolean11 = startTag9.isEndTag();
        boolean boolean12 = startTag9.isEOF();
        java.lang.String str13 = startTag9.name();
        org.jsoup.nodes.Attributes attributes14 = startTag9.getAttributes();
        startTag2.attributes = attributes14;
        org.jsoup.parser.Token.TokenType tokenType16 = startTag2.type;
        boolean boolean17 = startTag2.isEOF();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<<!---->>" + "'", str10, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str2 = endTag1.toString();
        endTag1.appendAttributeValue('4');
        boolean boolean5 = endTag1.isSelfClosing();
        boolean boolean6 = endTag1.isSelfClosing();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag7 = endTag1.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</<!---->>" + "'", str2, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType5 = org.jsoup.parser.Token.TokenType.Doctype;
        comment4.type = tokenType5;
        startTag2.type = tokenType5;
        startTag2.selfClosing = false;
        boolean boolean10 = startTag2.isCharacter();
        startTag2.appendAttributeValue("Comment");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        boolean boolean2 = doctype0.isDoctype();
        boolean boolean3 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder4 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.String str8 = doctype0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        org.jsoup.parser.Token.EndTag endTag3 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag3.appendAttributeValue('#');
        endTag3.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag7 = new org.jsoup.parser.Token.EndTag();
        boolean boolean8 = endTag7.selfClosing;
        org.jsoup.parser.Token.Tag tag10 = endTag7.name("<!---->");
        org.jsoup.parser.Token.TokenType tokenType11 = org.jsoup.parser.Token.TokenType.StartTag;
        tag10.type = tokenType11;
        endTag3.type = tokenType11;
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.appendAttributeValue('4');
        boolean boolean17 = startTag14.isEndTag();
        boolean boolean18 = startTag14.isEOF();
        startTag14.appendAttributeValue("hi!");
        startTag14.appendAttributeName('#');
        boolean boolean23 = startTag14.isSelfClosing();
        org.jsoup.nodes.Attributes attributes25 = null;
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag("hi!", attributes25);
        startTag26.newAttribute();
        startTag26.tagName = "";
        org.jsoup.nodes.Attributes attributes30 = startTag26.attributes;
        startTag14.attributes = attributes30;
        endTag3.attributes = attributes30;
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag("<<<!---->>>", attributes30);
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag("</</hi!<!---->>>", attributes30);
        java.lang.String str35 = startTag34.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<</</hi!<!---->>>>" + "'", str35, "<</</hi!<!---->>>>");
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag5 = new org.jsoup.parser.Token.EndTag();
        boolean boolean6 = endTag5.selfClosing;
        endTag5.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes9 = endTag5.getAttributes();
        boolean boolean10 = endTag5.isSelfClosing();
        org.jsoup.parser.Token.EndTag endTag11 = endTag5.asEndTag();
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes15 = null;
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag("hi!", attributes15);
        startTag16.newAttribute();
        startTag16.tagName = "";
        org.jsoup.nodes.Attributes attributes20 = startTag16.attributes;
        startTag13.attributes = attributes20;
        endTag11.attributes = attributes20;
        endTag1.attributes = attributes20;
        endTag1.appendTagName("</</<!---->StartTag<!----><<!---->>>>");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(endTag11);
        org.junit.Assert.assertNotNull(attributes20);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        org.jsoup.parser.Token.TokenType tokenType2 = comment0.type;
        boolean boolean3 = comment0.isComment();
        java.lang.String str4 = comment0.getData();
        java.lang.String str5 = comment0.toString();
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        java.lang.StringBuilder stringBuilder7 = comment0.data;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        startTag5.appendAttributeValue('4');
        boolean boolean8 = startTag5.isEndTag();
        boolean boolean9 = startTag5.isEOF();
        startTag5.appendAttributeValue("hi!");
        startTag5.appendTagName('4');
        boolean boolean14 = startTag5.isSelfClosing();
        org.jsoup.parser.Token.Tag tag16 = startTag5.name("hi!");
        boolean boolean17 = startTag5.isComment();
        org.jsoup.parser.Token.StartTag startTag18 = startTag5.asStartTag();
        org.jsoup.parser.Token.StartTag startTag19 = startTag18.asStartTag();
        org.jsoup.nodes.Attributes attributes20 = startTag18.getAttributes();
        boolean boolean21 = startTag18.isCharacter();
        boolean boolean22 = startTag18.isCharacter();
        org.jsoup.nodes.Element element23 = xmlTreeBuilder0.insert(startTag18);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder24 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        xmlTreeBuilder24.initialiseParse("</<!---->>", "</<!---->>", parseErrorList27);
        org.jsoup.parser.Token.Comment comment29 = new org.jsoup.parser.Token.Comment();
        java.lang.String str30 = comment29.toString();
        org.jsoup.parser.Token.TokenType tokenType31 = comment29.type;
        java.lang.String str32 = comment29.getData();
        xmlTreeBuilder24.insert(comment29);
        boolean boolean34 = comment29.isComment();
        xmlTreeBuilder0.insert(comment29);
        org.jsoup.parser.Token.Comment comment36 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(comment36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(startTag18);
        org.junit.Assert.assertNotNull(startTag19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!---->" + "'", str30, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType31 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType31.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes4 = null;
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag("hi!", attributes4);
        startTag5.newAttribute();
        startTag5.tagName = "";
        org.jsoup.nodes.Attributes attributes9 = startTag5.attributes;
        startTag2.attributes = attributes9;
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("StartTag", attributes9);
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes15 = null;
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag("hi!", attributes15);
        startTag16.newAttribute();
        startTag16.tagName = "";
        org.jsoup.nodes.Attributes attributes20 = startTag16.attributes;
        startTag13.attributes = attributes20;
        startTag11.attributes = attributes20;
        startTag11.newAttribute();
        boolean boolean24 = startTag11.isDoctype();
        startTag11.appendAttributeName(' ');
        boolean boolean27 = startTag11.isStartTag();
        boolean boolean28 = startTag11.selfClosing;
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        boolean boolean4 = startTag0.isEOF();
        startTag0.newAttribute();
        boolean boolean6 = startTag0.isSelfClosing();
        startTag0.tagName = "hi!EndTag";
        boolean boolean9 = startTag0.selfClosing;
        boolean boolean10 = startTag0.selfClosing;
        boolean boolean11 = startTag0.isComment();
        startTag0.newAttribute();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        endTag1.appendTagName("StartTag");
        org.jsoup.nodes.Attributes attributes7 = endTag1.attributes;
        endTag1.appendAttributeName('4');
        java.lang.String str10 = endTag1.toString();
        endTag1.tagName = "<4>";
        boolean boolean13 = endTag1.isEOF();
        endTag1.finaliseTag();
        org.jsoup.parser.Token.TokenType tokenType15 = endTag1.type;
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "</<!---->StartTag>" + "'", str10, "</<!---->StartTag>");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.selfClosing;
        endTag0.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes4 = endTag0.getAttributes();
        boolean boolean5 = endTag0.isSelfClosing();
        boolean boolean6 = endTag0.isCharacter();
        endTag0.appendAttributeName("</<!---->>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment9 = endTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!----><<!---->>");
        endTag1.appendTagName('a');
        boolean boolean4 = endTag1.isStartTag();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("<<!---->>4");
        org.jsoup.parser.Token.Character character2 = character1.asCharacter();
        java.lang.String str3 = character2.getData();
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<<!---->>4" + "'", str3, "<<!---->>4");
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str3 = startTag2.toString();
        java.lang.String str4 = startTag2.name();
        org.jsoup.parser.Token.Tag tag6 = startTag2.name("<hi!>");
        org.jsoup.nodes.Attributes attributes7 = startTag2.attributes;
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("</<hi!>>", attributes7);
        startTag8.appendTagName('4');
        startTag8.appendAttributeValue(' ');
        org.jsoup.parser.Token.Comment comment13 = new org.jsoup.parser.Token.Comment();
        boolean boolean14 = comment13.isStartTag();
        org.jsoup.parser.Token.Comment comment15 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType16 = org.jsoup.parser.Token.TokenType.Doctype;
        comment15.type = tokenType16;
        comment13.type = tokenType16;
        boolean boolean19 = comment13.isStartTag();
        java.lang.String str20 = comment13.getData();
        java.lang.String str21 = comment13.getData();
        org.jsoup.parser.Token.TokenType tokenType22 = comment13.type;
        startTag8.type = tokenType22;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<<!---->>" + "'", str3, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + tokenType22 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType22.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Character character9 = new org.jsoup.parser.Token.Character("");
        java.lang.String str10 = character9.toString();
        xmlTreeBuilder0.insert(character9);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder12.initialiseParse("", "<<!---->>", parseErrorList15);
        org.jsoup.parser.Token.Comment comment17 = new org.jsoup.parser.Token.Comment();
        boolean boolean18 = comment17.isStartTag();
        org.jsoup.parser.Token.Comment comment19 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType20 = org.jsoup.parser.Token.TokenType.Doctype;
        comment19.type = tokenType20;
        comment17.type = tokenType20;
        boolean boolean23 = comment17.isStartTag();
        java.lang.String str24 = comment17.getData();
        xmlTreeBuilder12.insert(comment17);
        xmlTreeBuilder0.insert(comment17);
        java.lang.String str27 = comment17.toString();
        java.lang.StringBuilder stringBuilder28 = comment17.data;
        java.lang.String str29 = comment17.getData();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!---->" + "'", str27, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag("hi!", attributes5);
        org.jsoup.parser.Token.TokenType tokenType7 = startTag6.type;
        startTag6.finaliseTag();
        boolean boolean9 = startTag6.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType10 = startTag6.type;
        doctype0.type = tokenType10;
        boolean boolean12 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder13 = doctype0.publicIdentifier;
        boolean boolean14 = doctype0.isDoctype();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.toString();
        java.lang.String str3 = startTag1.name();
        org.jsoup.parser.Token.Tag tag5 = startTag1.name("<<!---->>4");
        tag5.appendTagName("</EndTag>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<<!---->>" + "'", str2, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertNotNull(tag5);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.systemIdentifier;
        boolean boolean4 = doctype0.forceQuirks;
        java.lang.String str5 = doctype0.getName();
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment7 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.tokenType();
        boolean boolean3 = startTag1.isComment();
        java.lang.String str4 = startTag1.toString();
        boolean boolean5 = startTag1.isComment();
        startTag1.tagName = "";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<<!---->>" + "'", str4, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        org.jsoup.parser.Token.TokenType tokenType3 = startTag2.type;
        startTag2.finaliseTag();
        startTag2.appendAttributeName("<!---->");
        java.lang.String str7 = startTag2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype8 = startTag2.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<hi!>" + "'", str7, "<hi!>");
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        org.jsoup.parser.Token.TokenType tokenType7 = comment5.type;
        java.lang.String str8 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Comment comment10 = new org.jsoup.parser.Token.Comment();
        java.lang.String str11 = comment10.toString();
        org.jsoup.parser.Token.TokenType tokenType12 = comment10.type;
        java.lang.String str13 = comment10.toString();
        xmlTreeBuilder0.insert(comment10);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        xmlTreeBuilder15.initialiseParse("</<!---->>", "StartTag", parseErrorList18);
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        xmlTreeBuilder15.initialiseParse("<!---->", "<<!---->>", parseErrorList22);
        org.jsoup.parser.Token.Character character25 = new org.jsoup.parser.Token.Character("");
        java.lang.String str26 = character25.toString();
        java.lang.String str27 = character25.getData();
        java.lang.String str28 = character25.toString();
        java.lang.String str29 = character25.toString();
        boolean boolean30 = xmlTreeBuilder15.process((org.jsoup.parser.Token) character25);
        xmlTreeBuilder0.insert(character25);
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        startTag32.appendAttributeValue('4');
        boolean boolean35 = startTag32.isDoctype();
        boolean boolean36 = startTag32.isDoctype();
        java.lang.String str37 = startTag32.tokenType();
        startTag32.appendTagName('a');
        org.jsoup.parser.Token.Tag tag41 = startTag32.name("hi!");
        boolean boolean42 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag32);
        java.lang.Class<?> wildcardClass43 = xmlTreeBuilder0.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "StartTag" + "'", str37, "StartTag");
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.newAttribute();
        startTag2.tagName = "";
        boolean boolean6 = startTag2.isComment();
        startTag2.appendTagName('a');
        org.jsoup.nodes.Attributes attributes9 = startTag2.attributes;
        boolean boolean10 = startTag2.isComment();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<<!---->>");
        startTag1.newAttribute();
        org.jsoup.parser.Token.Tag tag4 = startTag1.name("StartTag");
        org.jsoup.nodes.Attributes attributes5 = startTag1.attributes;
        startTag1.appendAttributeName('#');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag8 = startTag1.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(attributes5);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendAttributeName('4');
        boolean boolean6 = startTag2.isDoctype();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character7 = startTag2.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType5 = org.jsoup.parser.Token.TokenType.Doctype;
        comment4.type = tokenType5;
        startTag2.type = tokenType5;
        startTag2.appendAttributeName("hi!");
        boolean boolean10 = startTag2.isCharacter();
        boolean boolean11 = startTag2.selfClosing;
        java.lang.String str12 = startTag2.name();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "<!---->", parseErrorList7);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        java.lang.String str10 = comment9.getData();
        xmlTreeBuilder0.insert(comment9);
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        java.lang.String str13 = comment12.toString();
        boolean boolean14 = comment12.isEndTag();
        xmlTreeBuilder0.insert(comment12);
        org.jsoup.parser.Token.Comment comment16 = new org.jsoup.parser.Token.Comment();
        boolean boolean17 = comment16.isStartTag();
        org.jsoup.parser.Token.Comment comment18 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType19 = org.jsoup.parser.Token.TokenType.Doctype;
        comment18.type = tokenType19;
        comment16.type = tokenType19;
        xmlTreeBuilder0.insert(comment16);
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str25 = startTag24.toString();
        java.lang.String str26 = startTag24.name();
        org.jsoup.parser.Token.Tag tag28 = startTag24.name("<hi!>");
        boolean boolean29 = startTag24.isComment();
        org.jsoup.nodes.Attributes attributes31 = null;
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag("hi!", attributes31);
        org.jsoup.parser.Token.TokenType tokenType33 = startTag32.type;
        startTag32.finaliseTag();
        boolean boolean35 = startTag32.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType36 = startTag32.type;
        startTag24.type = tokenType36;
        org.jsoup.nodes.Element element38 = xmlTreeBuilder0.insert(startTag24);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder39 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        xmlTreeBuilder39.initialiseParse("", "<<!---->>", parseErrorList42);
        org.jsoup.parser.Token.EndTag endTag45 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str46 = endTag45.toString();
        java.lang.String str47 = endTag45.toString();
        boolean boolean48 = xmlTreeBuilder39.process((org.jsoup.parser.Token) endTag45);
        org.jsoup.parser.ParseErrorList parseErrorList51 = null;
        xmlTreeBuilder39.initialiseParse("hi!<!---->", "", parseErrorList51);
        org.jsoup.parser.Token.Character character54 = new org.jsoup.parser.Token.Character("EndTag");
        xmlTreeBuilder39.insert(character54);
        xmlTreeBuilder0.insert(character54);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder57 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList60 = null;
        xmlTreeBuilder57.initialiseParse("</<!---->>", "</<!---->>", parseErrorList60);
        org.jsoup.parser.ParseErrorList parseErrorList64 = null;
        xmlTreeBuilder57.initialiseParse("StartTag", "<hi!>", parseErrorList64);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder66 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList69 = null;
        xmlTreeBuilder66.initialiseParse("</<!---->>", "</<!---->>", parseErrorList69);
        org.jsoup.parser.Token.Comment comment71 = new org.jsoup.parser.Token.Comment();
        java.lang.String str72 = comment71.toString();
        org.jsoup.parser.Token.TokenType tokenType73 = comment71.type;
        java.lang.String str74 = comment71.getData();
        xmlTreeBuilder66.insert(comment71);
        org.jsoup.parser.Token.Comment comment76 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType77 = org.jsoup.parser.Token.TokenType.Doctype;
        comment76.type = tokenType77;
        xmlTreeBuilder66.insert(comment76);
        xmlTreeBuilder57.insert(comment76);
        xmlTreeBuilder0.insert(comment76);
        org.jsoup.parser.ParseErrorList parseErrorList84 = null;
        xmlTreeBuilder0.initialiseParse("", "<hi!</</<!---->>>>", parseErrorList84);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + tokenType19 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType19.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<<!---->>" + "'", str25, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!---->" + "'", str26, "<!---->");
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + tokenType33 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType33.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + tokenType36 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType36.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "</<!---->>" + "'", str46, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "</<!---->>" + "'", str47, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "<!---->" + "'", str72, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType73 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType73.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + tokenType77 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType77.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        doctype0.forceQuirks = true;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder7 = doctype0.systemIdentifier;
        java.lang.String str8 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = true;
        java.lang.String str11 = doctype0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendAttributeName("StartTag");
        startTag2.appendAttributeName("");
        startTag2.appendAttributeName('#');
        org.jsoup.parser.Token.Tag tag11 = startTag2.name("<!---->");
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag("hi!", attributes14);
        boolean boolean16 = startTag15.isComment();
        org.jsoup.parser.Token.Comment comment17 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType18 = org.jsoup.parser.Token.TokenType.Doctype;
        comment17.type = tokenType18;
        startTag15.type = tokenType18;
        java.lang.String str21 = startTag15.tagName;
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes25 = null;
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag("hi!", attributes25);
        startTag26.newAttribute();
        startTag26.tagName = "";
        org.jsoup.nodes.Attributes attributes30 = startTag26.attributes;
        startTag23.attributes = attributes30;
        startTag15.attributes = attributes30;
        org.jsoup.nodes.Attributes attributes33 = startTag15.getAttributes();
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag("<!---->StartTag", attributes33);
        startTag2.attributes = attributes33;
        startTag2.appendAttributeValue('a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + tokenType18 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType18.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNotNull(attributes33);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList7);
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        xmlTreeBuilder0.initialiseParse("<!---->", "hi!", parseErrorList11);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        xmlTreeBuilder13.initialiseParse("</<!---->>", "StartTag", parseErrorList16);
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        xmlTreeBuilder13.initialiseParse("<!---->", "<<!---->>", parseErrorList20);
        org.jsoup.parser.Token.Comment comment22 = new org.jsoup.parser.Token.Comment();
        boolean boolean23 = comment22.isStartTag();
        org.jsoup.parser.Token.Comment comment24 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType25 = org.jsoup.parser.Token.TokenType.Doctype;
        comment24.type = tokenType25;
        comment22.type = tokenType25;
        boolean boolean28 = comment22.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType29 = comment22.type;
        xmlTreeBuilder13.insert(comment22);
        xmlTreeBuilder0.insert(comment22);
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        xmlTreeBuilder0.initialiseParse("<</<hi!>>>", "<!----><<!---->>", parseErrorList34);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + tokenType25 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType25.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + tokenType29 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType29.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        startTag1.appendAttributeValue('4');
        boolean boolean4 = startTag1.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag1.type;
        org.jsoup.nodes.Attributes attributes6 = startTag1.getAttributes();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("<!---->", attributes6);
        startTag7.appendTagName("hi!4hi!EndTag");
        startTag7.finaliseTag();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str3 = startTag2.toString();
        java.lang.String str4 = startTag2.name();
        org.jsoup.parser.Token.Tag tag6 = startTag2.name("<hi!>");
        org.jsoup.nodes.Attributes attributes7 = startTag2.attributes;
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("</<hi!>>", attributes7);
        org.jsoup.nodes.Attributes attributes9 = startTag8.getAttributes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<<!---->>" + "'", str3, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.isDoctype();
        boolean boolean5 = doctype0.isForceQuirks();
        boolean boolean6 = doctype0.forceQuirks;
        java.lang.String str7 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str2 = endTag1.toString();
        endTag1.appendAttributeValue('4');
        boolean boolean5 = endTag1.isSelfClosing();
        java.lang.String str6 = endTag1.tagName;
        boolean boolean7 = endTag1.isCharacter();
        endTag1.finaliseTag();
        java.lang.String str9 = endTag1.tagName;
        endTag1.selfClosing = true;
        boolean boolean12 = endTag1.isSelfClosing();
        java.lang.String str13 = endTag1.toString();
        org.jsoup.nodes.Attributes attributes14 = endTag1.attributes;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</<!---->>" + "'", str2, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!---->" + "'", str9, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "</<!---->>" + "'", str13, "</<!---->>");
        org.junit.Assert.assertNull(attributes14);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("<<<hi!>>>");
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isCharacter();
        java.lang.String str4 = doctype0.getName();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder7 = doctype0.name;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "<hi!>", parseErrorList7);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        xmlTreeBuilder9.initialiseParse("</<!---->>", "</<!---->>", parseErrorList12);
        org.jsoup.parser.Token.Comment comment14 = new org.jsoup.parser.Token.Comment();
        java.lang.String str15 = comment14.toString();
        org.jsoup.parser.Token.TokenType tokenType16 = comment14.type;
        java.lang.String str17 = comment14.getData();
        xmlTreeBuilder9.insert(comment14);
        org.jsoup.parser.Token.Comment comment19 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType20 = org.jsoup.parser.Token.TokenType.Doctype;
        comment19.type = tokenType20;
        xmlTreeBuilder9.insert(comment19);
        xmlTreeBuilder0.insert(comment19);
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag();
        startTag24.appendAttributeValue('4');
        boolean boolean27 = startTag24.isEndTag();
        boolean boolean28 = startTag24.isEOF();
        startTag24.appendAttributeValue("hi!");
        startTag24.appendTagName('4');
        boolean boolean33 = startTag24.isSelfClosing();
        org.jsoup.parser.Token.Tag tag35 = startTag24.name("hi!");
        boolean boolean36 = startTag24.isComment();
        org.jsoup.parser.Token.StartTag startTag37 = startTag24.asStartTag();
        org.jsoup.parser.Token.StartTag startTag38 = startTag37.asStartTag();
        org.jsoup.parser.Token.StartTag startTag39 = startTag38.asStartTag();
        java.lang.String str40 = startTag39.toString();
        org.jsoup.nodes.Element element41 = xmlTreeBuilder0.insert(startTag39);
        org.jsoup.nodes.Attributes attributes43 = null;
        org.jsoup.parser.Token.StartTag startTag44 = new org.jsoup.parser.Token.StartTag("hi!", attributes43);
        startTag44.newAttribute();
        boolean boolean46 = startTag44.isStartTag();
        org.jsoup.nodes.Attributes attributes47 = startTag44.attributes;
        org.jsoup.nodes.Element element48 = xmlTreeBuilder0.insert(startTag44);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!---->" + "'", str15, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(startTag37);
        org.junit.Assert.assertNotNull(startTag38);
        org.junit.Assert.assertNotNull(startTag39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "<hi!>" + "'", str40, "<hi!>");
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(attributes47);
        org.junit.Assert.assertNotNull(element48);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "<!---->", parseErrorList7);
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        boolean boolean10 = comment9.isStartTag();
        org.jsoup.parser.Token.Comment comment11 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType12 = org.jsoup.parser.Token.TokenType.Doctype;
        comment11.type = tokenType12;
        comment9.type = tokenType12;
        boolean boolean15 = comment9.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType16 = comment9.type;
        xmlTreeBuilder0.insert(comment9);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder18 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        xmlTreeBuilder18.initialiseParse("</<!---->>", "</<!---->>", parseErrorList21);
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        xmlTreeBuilder18.initialiseParse("StartTag", "<hi!>", parseErrorList25);
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        xmlTreeBuilder18.initialiseParse("</<!---->>", "</<!---->StartTag>", parseErrorList29);
        org.jsoup.parser.Token.Comment comment31 = new org.jsoup.parser.Token.Comment();
        boolean boolean32 = comment31.isStartTag();
        org.jsoup.parser.Token.Comment comment33 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType34 = org.jsoup.parser.Token.TokenType.Doctype;
        comment33.type = tokenType34;
        comment31.type = tokenType34;
        boolean boolean37 = comment31.isStartTag();
        java.lang.String str38 = comment31.toString();
        xmlTreeBuilder18.insert(comment31);
        xmlTreeBuilder0.insert(comment31);
        org.jsoup.parser.Token.StartTag startTag43 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str44 = startTag43.tokenType();
        boolean boolean45 = startTag43.isComment();
        java.lang.String str46 = startTag43.toString();
        boolean boolean47 = startTag43.isComment();
        org.jsoup.nodes.Attributes attributes48 = startTag43.getAttributes();
        org.jsoup.parser.Token.StartTag startTag49 = new org.jsoup.parser.Token.StartTag("EndTag", attributes48);
        org.jsoup.nodes.Element element50 = xmlTreeBuilder0.insert(startTag49);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + tokenType34 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType34.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<!---->" + "'", str38, "<!---->");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "StartTag" + "'", str44, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "<<!---->>" + "'", str46, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(attributes48);
        org.junit.Assert.assertNotNull(element50);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("<!---->");
        startTag9.appendTagName("<<!---->>");
        java.lang.String str12 = startTag9.name();
        boolean boolean13 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag9);
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag("<!---->");
        startTag15.newAttribute();
        org.jsoup.nodes.Element element17 = xmlTreeBuilder0.insert(startTag15);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder18 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        xmlTreeBuilder18.initialiseParse("</<!---->>", "</<!---->>", parseErrorList21);
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        xmlTreeBuilder18.initialiseParse("StartTag", "<!---->", parseErrorList25);
        org.jsoup.parser.Token.Comment comment27 = new org.jsoup.parser.Token.Comment();
        java.lang.String str28 = comment27.getData();
        xmlTreeBuilder18.insert(comment27);
        org.jsoup.parser.Token.Comment comment30 = new org.jsoup.parser.Token.Comment();
        java.lang.String str31 = comment30.toString();
        boolean boolean32 = comment30.isEndTag();
        xmlTreeBuilder18.insert(comment30);
        org.jsoup.parser.Token.Comment comment34 = new org.jsoup.parser.Token.Comment();
        boolean boolean35 = comment34.isStartTag();
        org.jsoup.parser.Token.Comment comment36 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType37 = org.jsoup.parser.Token.TokenType.Doctype;
        comment36.type = tokenType37;
        comment34.type = tokenType37;
        xmlTreeBuilder18.insert(comment34);
        org.jsoup.parser.Token.StartTag startTag42 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str43 = startTag42.toString();
        java.lang.String str44 = startTag42.name();
        org.jsoup.parser.Token.Tag tag46 = startTag42.name("<hi!>");
        boolean boolean47 = startTag42.isComment();
        org.jsoup.nodes.Attributes attributes49 = null;
        org.jsoup.parser.Token.StartTag startTag50 = new org.jsoup.parser.Token.StartTag("hi!", attributes49);
        org.jsoup.parser.Token.TokenType tokenType51 = startTag50.type;
        startTag50.finaliseTag();
        boolean boolean53 = startTag50.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType54 = startTag50.type;
        startTag42.type = tokenType54;
        org.jsoup.nodes.Element element56 = xmlTreeBuilder18.insert(startTag42);
        org.jsoup.nodes.Element element57 = xmlTreeBuilder0.insert(startTag42);
        org.jsoup.parser.Token.StartTag startTag58 = new org.jsoup.parser.Token.StartTag();
        startTag58.appendAttributeValue('4');
        boolean boolean61 = startTag58.isEndTag();
        boolean boolean62 = startTag58.isEOF();
        startTag58.appendAttributeValue("hi!");
        startTag58.appendTagName('4');
        boolean boolean67 = startTag58.isSelfClosing();
        org.jsoup.parser.Token.Tag tag69 = startTag58.name("hi!");
        boolean boolean70 = startTag58.isComment();
        org.jsoup.parser.Token.StartTag startTag71 = startTag58.asStartTag();
        org.jsoup.parser.Token.StartTag startTag72 = startTag71.asStartTag();
        boolean boolean73 = startTag72.isEndTag();
        startTag72.appendTagName("</<hi!>>");
        boolean boolean76 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag72);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype77 = startTag72.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!----><<!---->>" + "'", str12, "<!----><<!---->>");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!---->" + "'", str31, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + tokenType37 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType37.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "<<!---->>" + "'", str43, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "<!---->" + "'", str44, "<!---->");
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + tokenType51 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType51.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + tokenType54 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType54.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(tag69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(startTag71);
        org.junit.Assert.assertNotNull(startTag72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        org.jsoup.parser.Token.TokenType tokenType3 = startTag2.type;
        startTag2.finaliseTag();
        startTag2.appendAttributeValue('a');
        startTag2.appendAttributeName('4');
        startTag2.appendTagName(' ');
        startTag2.finaliseTag();
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("<!---->", attributes1);
        startTag2.tagName = "</<hi!>>";
        java.lang.String str5 = startTag2.name();
        boolean boolean6 = startTag2.isEndTag();
        java.lang.String str7 = startTag2.tokenType();
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        startTag9.appendAttributeValue('4');
        boolean boolean12 = startTag9.isEndTag();
        startTag9.newAttribute();
        boolean boolean14 = startTag9.isComment();
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes18 = null;
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag("hi!", attributes18);
        startTag19.newAttribute();
        startTag19.tagName = "";
        org.jsoup.nodes.Attributes attributes23 = startTag19.attributes;
        startTag16.attributes = attributes23;
        startTag9.attributes = attributes23;
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag("<!---->", attributes23);
        startTag2.attributes = attributes23;
        startTag2.newAttribute();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "</<hi!>>" + "'", str5, "</<hi!>>");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "StartTag" + "'", str7, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes23);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("</<!---->StartTag<!----><<!---->>>");
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.forceQuirks;
        java.lang.String str5 = doctype0.getPublicIdentifier();
        boolean boolean6 = doctype0.isComment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.String str3 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder4 = doctype0.name;
        boolean boolean5 = doctype0.isForceQuirks();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Doctype" + "'", str3, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder3 = doctype0.systemIdentifier;
        boolean boolean4 = doctype0.isStartTag();
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag6 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.appendAttributeValue(' ');
        java.lang.String str5 = startTag2.tokenType();
        java.lang.String str6 = startTag2.name();
        startTag2.appendTagName("<!---->");
        startTag2.tagName = "StartTag";
        org.jsoup.parser.Token.StartTag startTag11 = startTag2.asStartTag();
        boolean boolean12 = startTag2.isSelfClosing();
        startTag2.newAttribute();
        startTag2.appendAttributeName(' ');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("<<!---->>", "<hi!>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.getData();
        boolean boolean7 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment5);
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        xmlTreeBuilder0.initialiseParse("<<!----><hi!>>", "<hi!</</<!---->>>>", parseErrorList10);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder12.initialiseParse("</<!---->>", "</<!---->>", parseErrorList15);
        org.jsoup.parser.Token.Comment comment17 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType18 = org.jsoup.parser.Token.TokenType.Doctype;
        comment17.type = tokenType18;
        java.lang.StringBuilder stringBuilder20 = comment17.data;
        xmlTreeBuilder12.insert(comment17);
        org.jsoup.parser.Token.Comment comment22 = new org.jsoup.parser.Token.Comment();
        java.lang.String str23 = comment22.toString();
        xmlTreeBuilder12.insert(comment22);
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        xmlTreeBuilder12.initialiseParse("</<hi!>>", "<<!---->>", parseErrorList27);
        org.jsoup.parser.Token.Character character30 = new org.jsoup.parser.Token.Character("");
        java.lang.String str31 = character30.toString();
        java.lang.String str32 = character30.toString();
        boolean boolean33 = character30.isDoctype();
        xmlTreeBuilder12.insert(character30);
        xmlTreeBuilder0.insert(character30);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder36 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        xmlTreeBuilder36.initialiseParse("</<!---->>", "</<!---->>", parseErrorList39);
        org.jsoup.parser.ParseErrorList parseErrorList43 = null;
        xmlTreeBuilder36.initialiseParse("StartTag", "<!---->", parseErrorList43);
        org.jsoup.parser.Token.Comment comment45 = new org.jsoup.parser.Token.Comment();
        java.lang.String str46 = comment45.getData();
        xmlTreeBuilder36.insert(comment45);
        org.jsoup.parser.Token.Comment comment48 = new org.jsoup.parser.Token.Comment();
        java.lang.String str49 = comment48.toString();
        boolean boolean50 = comment48.isEndTag();
        xmlTreeBuilder36.insert(comment48);
        org.jsoup.parser.Token.Comment comment52 = new org.jsoup.parser.Token.Comment();
        boolean boolean53 = comment52.isStartTag();
        org.jsoup.parser.Token.Comment comment54 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType55 = org.jsoup.parser.Token.TokenType.Doctype;
        comment54.type = tokenType55;
        comment52.type = tokenType55;
        xmlTreeBuilder36.insert(comment52);
        org.jsoup.parser.Token.StartTag startTag60 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str61 = startTag60.toString();
        java.lang.String str62 = startTag60.name();
        org.jsoup.parser.Token.Tag tag64 = startTag60.name("<hi!>");
        boolean boolean65 = startTag60.isComment();
        org.jsoup.nodes.Attributes attributes67 = null;
        org.jsoup.parser.Token.StartTag startTag68 = new org.jsoup.parser.Token.StartTag("hi!", attributes67);
        org.jsoup.parser.Token.TokenType tokenType69 = startTag68.type;
        startTag68.finaliseTag();
        boolean boolean71 = startTag68.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType72 = startTag68.type;
        startTag60.type = tokenType72;
        org.jsoup.nodes.Element element74 = xmlTreeBuilder36.insert(startTag60);
        org.jsoup.nodes.Element element75 = xmlTreeBuilder0.insert(startTag60);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + tokenType18 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType18.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<!---->" + "'", str23, "<!---->");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "<!---->" + "'", str49, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + tokenType55 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType55.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "<<!---->>" + "'", str61, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "<!---->" + "'", str62, "<!---->");
        org.junit.Assert.assertNotNull(tag64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + tokenType69 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType69.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + tokenType72 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType72.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(element74);
        org.junit.Assert.assertNotNull(element75);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType6 = org.jsoup.parser.Token.TokenType.Doctype;
        comment5.type = tokenType6;
        java.lang.StringBuilder stringBuilder8 = comment5.data;
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Comment comment10 = new org.jsoup.parser.Token.Comment();
        java.lang.String str11 = comment10.toString();
        xmlTreeBuilder0.insert(comment10);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder0.initialiseParse("</<hi!>>", "<<!---->>", parseErrorList15);
        org.jsoup.nodes.Attributes attributes18 = null;
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag("hi!", attributes18);
        startTag19.newAttribute();
        boolean boolean21 = startTag19.isSelfClosing();
        java.lang.String str22 = startTag19.name();
        org.jsoup.nodes.Element element23 = xmlTreeBuilder0.insert(startTag19);
        startTag19.appendAttributeName('4');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character26 = startTag19.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        org.jsoup.nodes.Attributes attributes4 = startTag0.attributes;
        startTag0.appendAttributeName("</<!---->>");
        boolean boolean7 = startTag0.selfClosing;
        startTag0.selfClosing = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.newAttribute();
        boolean boolean4 = startTag2.isSelfClosing();
        boolean boolean5 = startTag2.isEOF();
        boolean boolean6 = startTag2.isEndTag();
        org.jsoup.parser.Token.TokenType tokenType7 = startTag2.type;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str10 = startTag9.toString();
        boolean boolean11 = startTag9.isEndTag();
        boolean boolean12 = startTag9.isEOF();
        java.lang.String str13 = startTag9.name();
        org.jsoup.nodes.Attributes attributes14 = startTag9.getAttributes();
        startTag2.attributes = attributes14;
        org.jsoup.nodes.Attributes attributes16 = startTag2.attributes;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<<!---->>" + "'", str10, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.forceQuirks = false;
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.String str7 = doctype0.getPublicIdentifier();
        boolean boolean8 = doctype0.isForceQuirks();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList3);
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str7 = endTag6.toString();
        java.lang.String str8 = endTag6.toString();
        boolean boolean9 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag6);
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag("hi!", attributes11);
        startTag12.newAttribute();
        boolean boolean14 = startTag12.isStartTag();
        boolean boolean15 = startTag12.isCharacter();
        org.jsoup.nodes.Element element16 = xmlTreeBuilder0.insert(startTag12);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        xmlTreeBuilder17.initialiseParse("</<!---->>", "StartTag", parseErrorList20);
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        xmlTreeBuilder17.initialiseParse("<!---->", "<<!---->>", parseErrorList24);
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        xmlTreeBuilder17.initialiseParse("<!----><<!---->>", "<hi!>", parseErrorList28);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder30 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        xmlTreeBuilder30.initialiseParse("</<!---->>", "</<!---->>", parseErrorList33);
        org.jsoup.parser.Token.Comment comment35 = new org.jsoup.parser.Token.Comment();
        java.lang.String str36 = comment35.toString();
        org.jsoup.parser.Token.TokenType tokenType37 = comment35.type;
        java.lang.String str38 = comment35.getData();
        xmlTreeBuilder30.insert(comment35);
        org.jsoup.parser.Token.Comment comment40 = new org.jsoup.parser.Token.Comment();
        java.lang.String str41 = comment40.toString();
        org.jsoup.parser.Token.TokenType tokenType42 = comment40.type;
        java.lang.String str43 = comment40.toString();
        xmlTreeBuilder30.insert(comment40);
        xmlTreeBuilder17.insert(comment40);
        xmlTreeBuilder0.insert(comment40);
        java.lang.String str47 = comment40.getData();
        boolean boolean48 = comment40.isEOF();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</<!---->>" + "'", str7, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</<!---->>" + "'", str8, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<!---->" + "'", str36, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType37 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType37.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "<!---->" + "'", str41, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType42 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType42.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "<!---->" + "'", str43, "<!---->");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag("hi!", attributes5);
        org.jsoup.parser.Token.TokenType tokenType7 = startTag6.type;
        startTag6.finaliseTag();
        boolean boolean9 = startTag6.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType10 = startTag6.type;
        doctype0.type = tokenType10;
        boolean boolean12 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder13 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder14 = doctype0.name;
        java.lang.String str15 = doctype0.tokenType();
        java.lang.String str16 = doctype0.getSystemIdentifier();
        doctype0.forceQuirks = true;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Doctype" + "'", str15, "Doctype");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.isDoctype();
        boolean boolean5 = doctype0.isForceQuirks();
        boolean boolean6 = doctype0.isForceQuirks();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes8 = null;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("hi!", attributes8);
        startTag9.newAttribute();
        startTag9.tagName = "";
        org.jsoup.nodes.Attributes attributes13 = startTag9.attributes;
        startTag6.attributes = attributes13;
        boolean boolean15 = startTag6.isDoctype();
        org.jsoup.parser.Token.StartTag startTag16 = startTag6.asStartTag();
        boolean boolean17 = startTag16.isEOF();
        startTag16.selfClosing = true;
        org.jsoup.nodes.Element element20 = xmlTreeBuilder0.insert(startTag16);
        org.jsoup.parser.Token.Character character22 = new org.jsoup.parser.Token.Character("");
        java.lang.String str23 = character22.toString();
        java.lang.String str24 = character22.getData();
        java.lang.String str25 = character22.toString();
        java.lang.String str26 = character22.toString();
        xmlTreeBuilder0.insert(character22);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        xmlTreeBuilder0.initialiseParse("</<!----><StartTag>>", "<StartTag>", parseErrorList30);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(startTag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.AfterDoctypePublicKeyword;
        org.jsoup.parser.Tokeniser tokeniser1 = null;
        org.jsoup.parser.CharacterReader characterReader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState0.read(tokeniser1, characterReader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokeniserState0);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.appendAttributeValue(' ');
        java.lang.String str5 = startTag2.tokenType();
        boolean boolean6 = startTag2.isEOF();
        startTag2.appendTagName("Comment");
        boolean boolean9 = startTag2.isEndTag();
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag("hi!", attributes11);
        org.jsoup.parser.Token.TokenType tokenType13 = startTag12.type;
        startTag12.finaliseTag();
        boolean boolean15 = startTag12.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType16 = startTag12.type;
        java.lang.String str17 = startTag12.tokenType();
        org.jsoup.parser.Token.TokenType tokenType18 = startTag12.type;
        startTag2.type = tokenType18;
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        startTag20.appendAttributeValue('4');
        boolean boolean23 = startTag20.isEndTag();
        startTag20.newAttribute();
        boolean boolean25 = startTag20.isComment();
        boolean boolean26 = startTag20.selfClosing;
        org.jsoup.nodes.Attributes attributes27 = null;
        startTag20.attributes = attributes27;
        org.jsoup.parser.Token.EndTag endTag29 = new org.jsoup.parser.Token.EndTag();
        boolean boolean30 = endTag29.selfClosing;
        org.jsoup.parser.Token.Tag tag32 = endTag29.name("<!---->");
        org.jsoup.parser.Token.TokenType tokenType33 = org.jsoup.parser.Token.TokenType.StartTag;
        tag32.type = tokenType33;
        startTag20.type = tokenType33;
        org.jsoup.nodes.Attributes attributes36 = startTag20.getAttributes();
        boolean boolean37 = startTag20.isSelfClosing();
        org.jsoup.nodes.Attributes attributes40 = null;
        org.jsoup.parser.Token.StartTag startTag41 = new org.jsoup.parser.Token.StartTag("hi!", attributes40);
        startTag41.newAttribute();
        startTag41.tagName = "";
        org.jsoup.nodes.Attributes attributes45 = startTag41.attributes;
        org.jsoup.parser.Token.StartTag startTag46 = new org.jsoup.parser.Token.StartTag("", attributes45);
        org.jsoup.parser.Token.StartTag startTag47 = new org.jsoup.parser.Token.StartTag();
        startTag47.appendAttributeValue('4');
        boolean boolean50 = startTag47.isDoctype();
        org.jsoup.nodes.Attributes attributes51 = startTag47.attributes;
        startTag46.attributes = attributes51;
        startTag20.attributes = attributes51;
        startTag2.attributes = attributes51;
        java.lang.String str55 = startTag2.name();
        java.lang.String str56 = startTag2.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "StartTag" + "'", str17, "StartTag");
        org.junit.Assert.assertTrue("'" + tokenType18 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType18.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertTrue("'" + tokenType33 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType33.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(attributes36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(attributes45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(attributes51);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!Comment" + "'", str55, "hi!Comment");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "<hi!Comment>" + "'", str56, "<hi!Comment>");
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList3);
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str7 = endTag6.toString();
        java.lang.String str8 = endTag6.toString();
        boolean boolean9 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag6);
        endTag6.newAttribute();
        java.lang.String str11 = endTag6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</<!---->>" + "'", str7, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</<!---->>" + "'", str8, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "</<!---->>" + "'", str11, "</<!---->>");
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("");
        org.jsoup.nodes.Attributes attributes2 = endTag1.getAttributes();
        boolean boolean3 = endTag1.selfClosing;
        boolean boolean4 = endTag1.selfClosing;
        org.junit.Assert.assertNull(attributes2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        org.jsoup.parser.Token.TokenType tokenType4 = doctype0.type;
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        doctype0.forceQuirks = false;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Character character9 = new org.jsoup.parser.Token.Character("");
        java.lang.String str10 = character9.toString();
        xmlTreeBuilder0.insert(character9);
        org.jsoup.parser.Token.Character character13 = new org.jsoup.parser.Token.Character("<<!---->>");
        java.lang.String str14 = character13.toString();
        xmlTreeBuilder0.insert(character13);
        boolean boolean16 = character13.isStartTag();
        java.lang.String str17 = character13.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<<!---->>" + "'", str14, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<<!---->>" + "'", str17, "<<!---->>");
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList3);
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str7 = endTag6.toString();
        java.lang.String str8 = endTag6.toString();
        boolean boolean9 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag6);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        xmlTreeBuilder0.initialiseParse("hi!<!---->", "", parseErrorList12);
        org.jsoup.parser.Token.Character character15 = new org.jsoup.parser.Token.Character("");
        java.lang.String str16 = character15.toString();
        java.lang.String str17 = character15.toString();
        java.lang.String str18 = character15.getData();
        boolean boolean19 = character15.isComment();
        java.lang.String str20 = character15.toString();
        xmlTreeBuilder0.insert(character15);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        xmlTreeBuilder22.initialiseParse("</<!---->>", "</<!---->>", parseErrorList25);
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        xmlTreeBuilder22.initialiseParse("StartTag", "<!---->", parseErrorList29);
        org.jsoup.parser.Token.Comment comment31 = new org.jsoup.parser.Token.Comment();
        java.lang.String str32 = comment31.getData();
        xmlTreeBuilder22.insert(comment31);
        java.lang.String str34 = comment31.toString();
        xmlTreeBuilder0.insert(comment31);
        org.jsoup.parser.Token.Doctype doctype36 = new org.jsoup.parser.Token.Doctype();
        boolean boolean37 = doctype36.isForceQuirks();
        java.lang.String str38 = doctype36.getName();
        boolean boolean39 = doctype36.isForceQuirks();
        java.lang.String str40 = doctype36.getPublicIdentifier();
        doctype36.forceQuirks = false;
        java.lang.String str43 = doctype36.getPublicIdentifier();
        java.lang.String str44 = doctype36.getPublicIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</<!---->>" + "'", str7, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</<!---->>" + "'", str8, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!---->" + "'", str34, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.tokenType();
        boolean boolean3 = startTag1.isComment();
        java.lang.String str4 = startTag1.toString();
        boolean boolean5 = startTag1.isComment();
        startTag1.appendAttributeName('#');
        boolean boolean8 = startTag1.isStartTag();
        startTag1.newAttribute();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<<!---->>" + "'", str4, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("hi!", attributes3);
        startTag4.newAttribute();
        startTag4.tagName = "";
        org.jsoup.nodes.Attributes attributes8 = startTag4.attributes;
        startTag1.attributes = attributes8;
        boolean boolean10 = startTag1.isDoctype();
        org.jsoup.parser.Token.StartTag startTag11 = startTag1.asStartTag();
        startTag1.tagName = "<hi!</</<!---->>>>";
        org.jsoup.parser.Token.Tag tag15 = startTag1.name("</</<!---->>>");
        org.jsoup.parser.Token.Tag tag17 = tag15.name("hi!4");
        java.lang.String str18 = tag15.name();
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!4" + "'", str18, "hi!4");
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType5 = org.jsoup.parser.Token.TokenType.Doctype;
        comment4.type = tokenType5;
        startTag2.type = tokenType5;
        startTag2.appendAttributeName("hi!");
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        startTag10.appendAttributeValue('4');
        boolean boolean13 = startTag10.isEndTag();
        startTag10.newAttribute();
        boolean boolean15 = startTag10.isComment();
        boolean boolean16 = startTag10.selfClosing;
        org.jsoup.nodes.Attributes attributes17 = null;
        startTag10.attributes = attributes17;
        org.jsoup.parser.Token.EndTag endTag19 = new org.jsoup.parser.Token.EndTag();
        boolean boolean20 = endTag19.selfClosing;
        org.jsoup.parser.Token.Tag tag22 = endTag19.name("<!---->");
        org.jsoup.parser.Token.TokenType tokenType23 = org.jsoup.parser.Token.TokenType.StartTag;
        tag22.type = tokenType23;
        startTag10.type = tokenType23;
        startTag2.type = tokenType23;
        startTag2.appendAttributeValue("4");
        boolean boolean29 = startTag2.isDoctype();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + tokenType23 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType23.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        org.jsoup.parser.Token.TokenType tokenType7 = comment5.type;
        java.lang.String str8 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Comment comment10 = new org.jsoup.parser.Token.Comment();
        boolean boolean11 = comment10.isStartTag();
        java.lang.String str12 = comment10.toString();
        boolean boolean13 = comment10.isCharacter();
        xmlTreeBuilder0.insert(comment10);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        xmlTreeBuilder0.initialiseParse("hi!<!---->", "</<!---->>", parseErrorList17);
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        startTag19.appendAttributeValue('4');
        boolean boolean22 = startTag19.isEndTag();
        startTag19.newAttribute();
        boolean boolean24 = startTag19.isComment();
        org.jsoup.parser.Token.Tag tag26 = startTag19.name("</<!---->>");
        org.jsoup.nodes.Element element27 = xmlTreeBuilder0.insert(startTag19);
        boolean boolean28 = startTag19.isComment();
        boolean boolean29 = startTag19.selfClosing;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!---->" + "'", str12, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.appendAttributeValue(' ');
        java.lang.String str5 = startTag2.tokenType();
        java.lang.String str6 = startTag2.name();
        startTag2.appendTagName("<!---->");
        startTag2.tagName = "StartTag";
        boolean boolean11 = startTag2.isDoctype();
        boolean boolean12 = startTag2.isDoctype();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder3 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.Doctype doctype4 = doctype0.asDoctype();
        boolean boolean5 = doctype0.isForceQuirks();
        doctype0.forceQuirks = true;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(doctype4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("hi!", attributes3);
        startTag4.newAttribute();
        startTag4.tagName = "";
        org.jsoup.nodes.Attributes attributes8 = startTag4.attributes;
        startTag1.attributes = attributes8;
        org.jsoup.nodes.Attributes attributes10 = startTag1.attributes;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character11 = startTag1.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendAttributeName('4');
        boolean boolean6 = startTag2.isDoctype();
        java.lang.String str7 = startTag2.name();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder3 = doctype0.publicIdentifier;
        java.lang.String str4 = doctype0.getName();
        boolean boolean5 = doctype0.forceQuirks;
        doctype0.forceQuirks = true;
        java.lang.String str8 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isStartTag();
        java.lang.String str2 = comment0.toString();
        java.lang.String str3 = comment0.getData();
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        java.lang.String str5 = comment0.getData();
        java.lang.String str6 = comment0.toString();
        java.lang.String str7 = comment0.tokenType();
        java.lang.String str8 = comment0.getData();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Comment" + "'", str7, "Comment");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.appendAttributeValue(' ');
        boolean boolean5 = startTag2.isSelfClosing();
        org.jsoup.parser.Token.Tag tag7 = startTag2.name("<<!---->>");
        org.jsoup.nodes.Attributes attributes8 = tag7.attributes;
        boolean boolean9 = tag7.isEOF();
        boolean boolean10 = tag7.selfClosing;
        tag7.tagName = "hi!<!---->";
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.tokenType();
        boolean boolean3 = startTag1.isComment();
        java.lang.String str4 = startTag1.toString();
        boolean boolean5 = startTag1.isComment();
        org.jsoup.parser.Token.Tag tag7 = startTag1.name("");
        org.jsoup.parser.Token.Tag tag9 = tag7.name("<<!---->>");
        tag9.finaliseTag();
        org.jsoup.parser.Token.Character character12 = new org.jsoup.parser.Token.Character("");
        boolean boolean13 = character12.isEndTag();
        java.lang.String str14 = character12.toString();
        java.lang.String str15 = character12.getData();
        java.lang.String str16 = character12.toString();
        boolean boolean17 = character12.isEndTag();
        org.jsoup.parser.Token.Doctype doctype18 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder19 = doctype18.publicIdentifier;
        java.lang.StringBuilder stringBuilder20 = doctype18.publicIdentifier;
        java.lang.String str21 = doctype18.getSystemIdentifier();
        org.jsoup.nodes.Attributes attributes23 = null;
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag("hi!", attributes23);
        org.jsoup.parser.Token.TokenType tokenType25 = startTag24.type;
        startTag24.finaliseTag();
        boolean boolean27 = startTag24.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType28 = startTag24.type;
        doctype18.type = tokenType28;
        character12.type = tokenType28;
        tag9.type = tokenType28;
        tag9.appendAttributeName('a');
        boolean boolean34 = tag9.isEndTag();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<<!---->>" + "'", str4, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + tokenType25 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType25.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + tokenType28 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType28.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        boolean boolean2 = comment0.isEOF();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        boolean boolean4 = comment0.isStartTag();
        java.lang.String str5 = comment0.getData();
        java.lang.String str6 = comment0.tokenType();
        java.lang.StringBuilder stringBuilder7 = comment0.data;
        java.lang.Class<?> wildcardClass8 = stringBuilder7.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Comment" + "'", str6, "Comment");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.Doctype doctype4 = doctype0.asDoctype();
        java.lang.String str5 = doctype4.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder6 = doctype4.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype4.name;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(doctype4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList3);
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str7 = endTag6.toString();
        java.lang.String str8 = endTag6.toString();
        boolean boolean9 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag6);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        xmlTreeBuilder0.initialiseParse("hi!<!---->", "", parseErrorList12);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        xmlTreeBuilder14.initialiseParse("</<!---->>", "</<!---->>", parseErrorList17);
        org.jsoup.parser.Token.Comment comment19 = new org.jsoup.parser.Token.Comment();
        java.lang.String str20 = comment19.toString();
        org.jsoup.parser.Token.TokenType tokenType21 = comment19.type;
        java.lang.String str22 = comment19.getData();
        xmlTreeBuilder14.insert(comment19);
        org.jsoup.parser.Token.Comment comment24 = new org.jsoup.parser.Token.Comment();
        java.lang.String str25 = comment24.toString();
        org.jsoup.parser.Token.TokenType tokenType26 = comment24.type;
        java.lang.String str27 = comment24.toString();
        xmlTreeBuilder14.insert(comment24);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        xmlTreeBuilder29.initialiseParse("</<!---->>", "StartTag", parseErrorList32);
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        xmlTreeBuilder29.initialiseParse("<!---->", "<<!---->>", parseErrorList36);
        org.jsoup.parser.Token.Character character39 = new org.jsoup.parser.Token.Character("");
        java.lang.String str40 = character39.toString();
        java.lang.String str41 = character39.getData();
        java.lang.String str42 = character39.toString();
        java.lang.String str43 = character39.toString();
        boolean boolean44 = xmlTreeBuilder29.process((org.jsoup.parser.Token) character39);
        xmlTreeBuilder14.insert(character39);
        org.jsoup.parser.Token.StartTag startTag46 = new org.jsoup.parser.Token.StartTag();
        startTag46.appendAttributeValue('4');
        boolean boolean49 = startTag46.isDoctype();
        boolean boolean50 = startTag46.isDoctype();
        java.lang.String str51 = startTag46.tokenType();
        startTag46.appendTagName('a');
        org.jsoup.parser.Token.Tag tag55 = startTag46.name("hi!");
        boolean boolean56 = xmlTreeBuilder14.process((org.jsoup.parser.Token) startTag46);
        org.jsoup.nodes.Element element57 = xmlTreeBuilder0.insert(startTag46);
        org.jsoup.parser.Token.StartTag startTag60 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes62 = null;
        org.jsoup.parser.Token.StartTag startTag63 = new org.jsoup.parser.Token.StartTag("hi!", attributes62);
        startTag63.newAttribute();
        startTag63.tagName = "";
        org.jsoup.nodes.Attributes attributes67 = startTag63.attributes;
        startTag60.attributes = attributes67;
        org.jsoup.parser.Token.StartTag startTag69 = new org.jsoup.parser.Token.StartTag("StartTag", attributes67);
        org.jsoup.parser.Token.StartTag startTag71 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes73 = null;
        org.jsoup.parser.Token.StartTag startTag74 = new org.jsoup.parser.Token.StartTag("hi!", attributes73);
        startTag74.newAttribute();
        startTag74.tagName = "";
        org.jsoup.nodes.Attributes attributes78 = startTag74.attributes;
        startTag71.attributes = attributes78;
        startTag69.attributes = attributes78;
        startTag69.newAttribute();
        boolean boolean82 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag69);
        org.jsoup.parser.Token.StartTag startTag83 = new org.jsoup.parser.Token.StartTag();
        startTag83.appendAttributeValue('4');
        boolean boolean86 = startTag83.isEndTag();
        boolean boolean87 = startTag83.isEOF();
        startTag83.appendAttributeValue("hi!");
        startTag83.appendAttributeName('#');
        startTag83.appendAttributeValue('a');
        org.jsoup.parser.Token.StartTag startTag94 = startTag83.asStartTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element95 = xmlTreeBuilder0.insert(startTag83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</<!---->>" + "'", str7, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</<!---->>" + "'", str8, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!---->" + "'", str20, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType21 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType21.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!---->" + "'", str25, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType26 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType26.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!---->" + "'", str27, "<!---->");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "StartTag" + "'", str51, "StartTag");
        org.junit.Assert.assertNotNull(tag55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(element57);
        org.junit.Assert.assertNotNull(attributes67);
        org.junit.Assert.assertNotNull(attributes78);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(startTag94);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str3 = startTag2.tokenType();
        boolean boolean4 = startTag2.isComment();
        java.lang.String str5 = startTag2.toString();
        boolean boolean6 = startTag2.isComment();
        org.jsoup.parser.Token.Tag tag8 = startTag2.name("");
        boolean boolean9 = tag8.isStartTag();
        org.jsoup.parser.Token.Doctype doctype10 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str11 = doctype10.getPublicIdentifier();
        java.lang.String str12 = doctype10.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType13 = org.jsoup.parser.Token.TokenType.EOF;
        doctype10.type = tokenType13;
        tag8.type = tokenType13;
        org.jsoup.nodes.Attributes attributes16 = tag8.attributes;
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag("</Comment>", attributes16);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag18 = startTag17.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "StartTag" + "'", str3, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<<!---->>" + "'", str5, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("4");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag2 = character1.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.forceQuirks = false;
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        boolean boolean8 = doctype0.isForceQuirks();
        doctype0.forceQuirks = false;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        startTag0.newAttribute();
        boolean boolean5 = startTag0.isComment();
        boolean boolean6 = startTag0.selfClosing;
        org.jsoup.nodes.Attributes attributes8 = null;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("hi!", attributes8);
        boolean boolean10 = startTag9.isComment();
        org.jsoup.parser.Token.Comment comment11 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType12 = org.jsoup.parser.Token.TokenType.Doctype;
        comment11.type = tokenType12;
        startTag9.type = tokenType12;
        startTag0.type = tokenType12;
        org.jsoup.parser.Token.TokenType tokenType16 = startTag0.type;
        java.lang.String str17 = startTag0.tokenType();
        boolean boolean18 = startTag0.isStartTag();
        boolean boolean19 = startTag0.isEOF();
        org.jsoup.nodes.Attributes attributes20 = startTag0.attributes;
        startTag0.tagName = "4hi!";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "StartTag" + "'", str17, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributes20);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        doctype0.forceQuirks = false;
        doctype0.forceQuirks = false;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag7 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("");
        java.lang.String str2 = character1.toString();
        java.lang.String str3 = character1.toString();
        java.lang.String str4 = character1.getData();
        java.lang.String str5 = character1.getData();
        java.lang.String str6 = character1.getData();
        java.lang.String str7 = character1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        endTag1.appendTagName("StartTag");
        endTag1.newAttribute();
        org.jsoup.parser.Token.TokenType tokenType8 = endTag1.type;
        endTag1.appendAttributeValue("</<hi!>>");
        java.lang.String str11 = endTag1.toString();
        endTag1.finaliseTag();
        java.lang.String str13 = endTag1.toString();
        org.jsoup.parser.Token.Tag tag15 = endTag1.name("<hi!>");
        tag15.appendAttributeName("<!----> ");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "</<!---->StartTag>" + "'", str11, "</<!---->StartTag>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "</<!---->StartTag>" + "'", str13, "</<!---->StartTag>");
        org.junit.Assert.assertNotNull(tag15);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType6 = org.jsoup.parser.Token.TokenType.Doctype;
        comment5.type = tokenType6;
        java.lang.StringBuilder stringBuilder8 = comment5.data;
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        xmlTreeBuilder0.initialiseParse("<hi!>", "<hi!>", parseErrorList12);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        xmlTreeBuilder14.initialiseParse("</<!---->>", "</<!---->>", parseErrorList17);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        xmlTreeBuilder14.initialiseParse("", "<<!---->>", parseErrorList21);
        org.jsoup.parser.Token.Comment comment23 = new org.jsoup.parser.Token.Comment();
        java.lang.String str24 = comment23.toString();
        org.jsoup.parser.Token.TokenType tokenType25 = comment23.type;
        boolean boolean26 = comment23.isComment();
        java.lang.String str27 = comment23.getData();
        java.lang.String str28 = comment23.toString();
        java.lang.String str29 = comment23.getData();
        xmlTreeBuilder14.insert(comment23);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        xmlTreeBuilder31.initialiseParse("</<!---->>", "</<!---->>", parseErrorList34);
        org.jsoup.parser.Token.Comment comment36 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType37 = org.jsoup.parser.Token.TokenType.Doctype;
        comment36.type = tokenType37;
        java.lang.StringBuilder stringBuilder39 = comment36.data;
        xmlTreeBuilder31.insert(comment36);
        org.jsoup.parser.Token.Comment comment41 = new org.jsoup.parser.Token.Comment();
        java.lang.String str42 = comment41.toString();
        xmlTreeBuilder31.insert(comment41);
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        xmlTreeBuilder31.initialiseParse("</<hi!>>", "<<!---->>", parseErrorList46);
        org.jsoup.parser.Token.Comment comment48 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType49 = org.jsoup.parser.Token.TokenType.Doctype;
        comment48.type = tokenType49;
        java.lang.StringBuilder stringBuilder51 = comment48.data;
        boolean boolean52 = comment48.isEOF();
        xmlTreeBuilder31.insert(comment48);
        xmlTreeBuilder14.insert(comment48);
        xmlTreeBuilder0.insert(comment48);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder56 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList59 = null;
        xmlTreeBuilder56.initialiseParse("</<!---->>", "</<!---->>", parseErrorList59);
        org.jsoup.parser.Token.Comment comment61 = new org.jsoup.parser.Token.Comment();
        java.lang.String str62 = comment61.toString();
        org.jsoup.parser.Token.TokenType tokenType63 = comment61.type;
        java.lang.String str64 = comment61.getData();
        xmlTreeBuilder56.insert(comment61);
        org.jsoup.parser.Token.Comment comment66 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType67 = org.jsoup.parser.Token.TokenType.Doctype;
        comment66.type = tokenType67;
        xmlTreeBuilder56.insert(comment66);
        org.jsoup.parser.Token.Comment comment70 = new org.jsoup.parser.Token.Comment();
        java.lang.String str71 = comment70.toString();
        boolean boolean72 = comment70.isEOF();
        boolean boolean73 = comment70.isEndTag();
        xmlTreeBuilder56.insert(comment70);
        org.jsoup.parser.Token.Character character76 = new org.jsoup.parser.Token.Character("<<!---->>");
        java.lang.String str77 = character76.toString();
        xmlTreeBuilder56.insert(character76);
        java.lang.String str79 = character76.toString();
        xmlTreeBuilder0.insert(character76);
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!---->" + "'", str24, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType25 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType25.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!---->" + "'", str28, "<!---->");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + tokenType37 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType37.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder39);
        org.junit.Assert.assertEquals(stringBuilder39.toString(), "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<!---->" + "'", str42, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType49 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType49.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder51);
        org.junit.Assert.assertEquals(stringBuilder51.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "<!---->" + "'", str62, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType63 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType63.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + tokenType67 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType67.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "<!---->" + "'", str71, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "<<!---->>" + "'", str77, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "<<!---->>" + "'", str79, "<<!---->>");
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.forceQuirks = false;
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        boolean boolean8 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
        java.lang.String str10 = doctype0.getName();
        boolean boolean11 = doctype0.isForceQuirks();
        java.lang.String str12 = doctype0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendAttributeName("StartTag");
        java.lang.String str6 = startTag2.name();
        startTag2.appendAttributeValue(' ');
        org.jsoup.nodes.Attributes attributes9 = startTag2.attributes;
        org.jsoup.nodes.Attributes attributes10 = startTag2.attributes;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(attributes9);
        org.junit.Assert.assertNull(attributes10);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isEOF();
        startTag0.appendAttributeValue("hi!");
        startTag0.appendTagName('4');
        boolean boolean9 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag11 = startTag0.name("hi!");
        tag11.appendTagName('4');
        boolean boolean14 = tag11.isDoctype();
        tag11.selfClosing = false;
        tag11.newAttribute();
        tag11.appendAttributeValue('#');
        boolean boolean20 = tag11.selfClosing;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType4 = startTag0.type;
        java.lang.String str5 = startTag0.tagName;
        boolean boolean6 = startTag0.isEndTag();
        startTag0.appendAttributeValue("");
        startTag0.tagName = "<!----><<!---->>";
        startTag0.appendAttributeValue("</hi!<!---->>");
        org.jsoup.parser.Token.StartTag startTag13 = startTag0.asStartTag();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(startTag13);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isEndTag();
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("hi!", attributes3);
        startTag4.newAttribute();
        startTag4.tagName = "";
        org.jsoup.nodes.Attributes attributes8 = startTag4.attributes;
        startTag1.attributes = attributes8;
        boolean boolean10 = startTag1.isDoctype();
        org.jsoup.parser.Token.StartTag startTag11 = startTag1.asStartTag();
        startTag1.tagName = "<hi!</</<!---->>>>";
        org.jsoup.parser.Token.Tag tag15 = startTag1.name("</</<!---->>>");
        org.jsoup.parser.Token.Tag tag17 = tag15.name("hi!4");
        tag17.newAttribute();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag19 = tag17.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(tag17);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        boolean boolean6 = comment5.isStartTag();
        org.jsoup.parser.Token.Comment comment7 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.Doctype;
        comment7.type = tokenType8;
        comment5.type = tokenType8;
        boolean boolean11 = comment5.isStartTag();
        java.lang.String str12 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        xmlTreeBuilder0.initialiseParse("Character", "<!----><<!---->>", parseErrorList16);
        org.jsoup.parser.Token.Comment comment18 = new org.jsoup.parser.Token.Comment();
        java.lang.String str19 = comment18.toString();
        org.jsoup.parser.Token.TokenType tokenType20 = comment18.type;
        java.lang.String str21 = comment18.getData();
        xmlTreeBuilder0.insert(comment18);
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes26 = null;
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag("hi!", attributes26);
        startTag27.newAttribute();
        startTag27.tagName = "";
        org.jsoup.nodes.Attributes attributes31 = startTag27.attributes;
        startTag24.attributes = attributes31;
        boolean boolean33 = startTag24.isDoctype();
        java.lang.String str34 = startTag24.tagName;
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str37 = startTag36.tokenType();
        boolean boolean38 = startTag36.isComment();
        java.lang.String str39 = startTag36.toString();
        boolean boolean40 = startTag36.isComment();
        org.jsoup.parser.Token.Tag tag42 = startTag36.name("");
        startTag36.appendAttributeValue("Character");
        org.jsoup.parser.Token.TokenType tokenType45 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag36.type = tokenType45;
        startTag24.type = tokenType45;
        org.jsoup.nodes.Element element48 = xmlTreeBuilder0.insert(startTag24);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder49 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList52 = null;
        xmlTreeBuilder49.initialiseParse("</<!---->>", "StartTag", parseErrorList52);
        org.jsoup.parser.Token.Comment comment54 = new org.jsoup.parser.Token.Comment();
        java.lang.String str55 = comment54.toString();
        xmlTreeBuilder49.insert(comment54);
        org.jsoup.parser.Token.Character character58 = new org.jsoup.parser.Token.Character("");
        java.lang.String str59 = character58.toString();
        xmlTreeBuilder49.insert(character58);
        org.jsoup.parser.Token.Character character62 = new org.jsoup.parser.Token.Character("<<!---->>");
        java.lang.String str63 = character62.toString();
        xmlTreeBuilder49.insert(character62);
        xmlTreeBuilder0.insert(character62);
        org.jsoup.nodes.Attributes attributes67 = null;
        org.jsoup.parser.Token.StartTag startTag68 = new org.jsoup.parser.Token.StartTag("hi!", attributes67);
        startTag68.appendAttributeValue(' ');
        java.lang.String str71 = startTag68.tokenType();
        boolean boolean72 = startTag68.isEOF();
        startTag68.appendAttributeValue("<!----><<!---->>");
        startTag68.appendAttributeValue('#');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element77 = xmlTreeBuilder0.insert(startTag68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!---->" + "'", str19, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!---->" + "'", str34, "<!---->");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "StartTag" + "'", str37, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<<!---->>" + "'", str39, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertTrue("'" + tokenType45 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType45.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "<!---->" + "'", str55, "<!---->");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "<<!---->>" + "'", str63, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "StartTag" + "'", str71, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("Comment");
        boolean boolean2 = character1.isEndTag();
        java.lang.String str3 = character1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype4 = character1.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Comment" + "'", str3, "Comment");
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("hi!", attributes3);
        startTag4.newAttribute();
        startTag4.tagName = "";
        org.jsoup.nodes.Attributes attributes8 = startTag4.attributes;
        startTag1.attributes = attributes8;
        boolean boolean10 = startTag1.isDoctype();
        org.jsoup.parser.Token.StartTag startTag11 = startTag1.asStartTag();
        boolean boolean12 = startTag1.isStartTag();
        boolean boolean13 = startTag1.isStartTag();
        startTag1.appendTagName(' ');
        java.lang.String str16 = startTag1.toString();
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<<!----> >" + "'", str16, "<<!----> >");
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        startTag1.appendAttributeValue('4');
        boolean boolean4 = startTag1.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag1.type;
        java.lang.String str6 = startTag1.tagName;
        boolean boolean7 = startTag1.isEndTag();
        startTag1.appendAttributeValue("");
        startTag1.tagName = "<!----><<!---->>";
        startTag1.appendAttributeValue("</hi!<!---->>");
        org.jsoup.nodes.Attributes attributes14 = startTag1.getAttributes();
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag("EndTag", attributes14);
        startTag15.selfClosing = true;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType6 = org.jsoup.parser.Token.TokenType.Doctype;
        comment5.type = tokenType6;
        java.lang.StringBuilder stringBuilder8 = comment5.data;
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        xmlTreeBuilder10.initialiseParse("</<!---->>", "</<!---->>", parseErrorList13);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        xmlTreeBuilder10.initialiseParse("StartTag", "<hi!>", parseErrorList17);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        xmlTreeBuilder10.initialiseParse("</<!---->>", "</<!---->StartTag>", parseErrorList21);
        org.jsoup.parser.Token.Comment comment23 = new org.jsoup.parser.Token.Comment();
        boolean boolean24 = comment23.isStartTag();
        org.jsoup.parser.Token.Comment comment25 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType26 = org.jsoup.parser.Token.TokenType.Doctype;
        comment25.type = tokenType26;
        comment23.type = tokenType26;
        boolean boolean29 = comment23.isStartTag();
        java.lang.String str30 = comment23.toString();
        xmlTreeBuilder10.insert(comment23);
        java.lang.StringBuilder stringBuilder32 = comment23.data;
        xmlTreeBuilder0.insert(comment23);
        java.lang.StringBuilder stringBuilder34 = comment23.data;
        java.lang.String str35 = comment23.toString();
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + tokenType26 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType26.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!---->" + "'", str30, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder32);
        org.junit.Assert.assertEquals(stringBuilder32.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<!---->" + "'", str35, "<!---->");
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendTagName('4');
        startTag2.appendAttributeValue("<!---->");
        startTag2.appendTagName("hi!EndTag");
        boolean boolean10 = startTag2.isEndTag();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("</<!---->>");
        java.lang.String str2 = endTag1.toString();
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag();
        startTag4.appendAttributeValue('4');
        boolean boolean7 = startTag4.isEndTag();
        startTag4.newAttribute();
        boolean boolean9 = startTag4.isComment();
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes13 = null;
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag("hi!", attributes13);
        startTag14.newAttribute();
        startTag14.tagName = "";
        org.jsoup.nodes.Attributes attributes18 = startTag14.attributes;
        startTag11.attributes = attributes18;
        startTag4.attributes = attributes18;
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag("<!---->", attributes18);
        endTag1.attributes = attributes18;
        endTag1.appendAttributeName("<!---->");
        org.jsoup.nodes.Attributes attributes25 = endTag1.getAttributes();
        java.lang.String str26 = endTag1.toString();
        boolean boolean27 = endTag1.isSelfClosing();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</</<!---->>>" + "'", str2, "</</<!---->>>");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "</</<!---->>>" + "'", str26, "</</<!---->>>");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<<</<hi!>>>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype2 = startTag1.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.getData();
        java.lang.StringBuilder stringBuilder2 = comment0.data;
        java.lang.Class<?> wildcardClass3 = comment0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.newAttribute();
        boolean boolean4 = startTag2.isSelfClosing();
        boolean boolean5 = startTag2.isEOF();
        boolean boolean6 = startTag2.isEndTag();
        org.jsoup.parser.Token.TokenType tokenType7 = startTag2.type;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str10 = startTag9.toString();
        boolean boolean11 = startTag9.isEndTag();
        boolean boolean12 = startTag9.isEOF();
        java.lang.String str13 = startTag9.name();
        org.jsoup.nodes.Attributes attributes14 = startTag9.getAttributes();
        startTag2.attributes = attributes14;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        xmlTreeBuilder16.initialiseParse("</<!---->>", "StartTag", parseErrorList19);
        org.jsoup.parser.Token.Comment comment21 = new org.jsoup.parser.Token.Comment();
        java.lang.String str22 = comment21.toString();
        xmlTreeBuilder16.insert(comment21);
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag("<!---->");
        startTag25.appendTagName("<<!---->>");
        java.lang.String str28 = startTag25.name();
        boolean boolean29 = xmlTreeBuilder16.process((org.jsoup.parser.Token) startTag25);
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag("<!---->");
        startTag31.newAttribute();
        org.jsoup.nodes.Element element33 = xmlTreeBuilder16.insert(startTag31);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder34 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        xmlTreeBuilder34.initialiseParse("</<!---->>", "</<!---->>", parseErrorList37);
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        xmlTreeBuilder34.initialiseParse("StartTag", "<!---->", parseErrorList41);
        org.jsoup.parser.Token.Comment comment43 = new org.jsoup.parser.Token.Comment();
        java.lang.String str44 = comment43.getData();
        xmlTreeBuilder34.insert(comment43);
        org.jsoup.parser.Token.Comment comment46 = new org.jsoup.parser.Token.Comment();
        java.lang.String str47 = comment46.toString();
        boolean boolean48 = comment46.isEndTag();
        xmlTreeBuilder34.insert(comment46);
        org.jsoup.parser.Token.Comment comment50 = new org.jsoup.parser.Token.Comment();
        boolean boolean51 = comment50.isStartTag();
        org.jsoup.parser.Token.Comment comment52 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType53 = org.jsoup.parser.Token.TokenType.Doctype;
        comment52.type = tokenType53;
        comment50.type = tokenType53;
        xmlTreeBuilder34.insert(comment50);
        org.jsoup.parser.Token.StartTag startTag58 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str59 = startTag58.toString();
        java.lang.String str60 = startTag58.name();
        org.jsoup.parser.Token.Tag tag62 = startTag58.name("<hi!>");
        boolean boolean63 = startTag58.isComment();
        org.jsoup.nodes.Attributes attributes65 = null;
        org.jsoup.parser.Token.StartTag startTag66 = new org.jsoup.parser.Token.StartTag("hi!", attributes65);
        org.jsoup.parser.Token.TokenType tokenType67 = startTag66.type;
        startTag66.finaliseTag();
        boolean boolean69 = startTag66.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType70 = startTag66.type;
        startTag58.type = tokenType70;
        org.jsoup.nodes.Element element72 = xmlTreeBuilder34.insert(startTag58);
        org.jsoup.nodes.Element element73 = xmlTreeBuilder16.insert(startTag58);
        org.jsoup.parser.Token.StartTag startTag74 = new org.jsoup.parser.Token.StartTag();
        startTag74.appendAttributeValue('4');
        boolean boolean77 = startTag74.isEndTag();
        boolean boolean78 = startTag74.isEOF();
        startTag74.appendAttributeValue("hi!");
        startTag74.appendTagName('4');
        boolean boolean83 = startTag74.isSelfClosing();
        org.jsoup.parser.Token.Tag tag85 = startTag74.name("hi!");
        boolean boolean86 = startTag74.isComment();
        org.jsoup.parser.Token.StartTag startTag87 = startTag74.asStartTag();
        org.jsoup.parser.Token.StartTag startTag88 = startTag87.asStartTag();
        boolean boolean89 = startTag88.isEndTag();
        startTag88.appendTagName("</<hi!>>");
        boolean boolean92 = xmlTreeBuilder16.process((org.jsoup.parser.Token) startTag88);
        startTag88.tagName = "";
        org.jsoup.parser.Token.TokenType tokenType95 = startTag88.type;
        startTag2.type = tokenType95;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<<!---->>" + "'", str10, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!---->" + "'", str22, "<!---->");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!----><<!---->>" + "'", str28, "<!----><<!---->>");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "<!---->" + "'", str47, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + tokenType53 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType53.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "<<!---->>" + "'", str59, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "<!---->" + "'", str60, "<!---->");
        org.junit.Assert.assertNotNull(tag62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + tokenType67 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType67.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + tokenType70 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType70.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(element72);
        org.junit.Assert.assertNotNull(element73);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(tag85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(startTag87);
        org.junit.Assert.assertNotNull(startTag88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + tokenType95 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType95.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<<!----> >");
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        xmlTreeBuilder1.initialiseParse("</<!---->>", "StartTag", parseErrorList4);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        xmlTreeBuilder6.initialiseParse("</<!---->>", "</<!---->>", parseErrorList9);
        org.jsoup.parser.Token.Comment comment11 = new org.jsoup.parser.Token.Comment();
        java.lang.String str12 = comment11.toString();
        org.jsoup.parser.Token.TokenType tokenType13 = comment11.type;
        java.lang.String str14 = comment11.getData();
        xmlTreeBuilder6.insert(comment11);
        boolean boolean16 = comment11.isComment();
        xmlTreeBuilder1.insert(comment11);
        org.jsoup.nodes.Attributes attributes19 = null;
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag("hi!", attributes19);
        boolean boolean21 = startTag20.isComment();
        boolean boolean22 = startTag20.selfClosing;
        startTag20.newAttribute();
        org.jsoup.nodes.Attributes attributes24 = startTag20.getAttributes();
        startTag20.newAttribute();
        org.jsoup.nodes.Element element26 = xmlTreeBuilder1.insert(startTag20);
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag();
        startTag28.appendAttributeValue('4');
        org.jsoup.nodes.Attributes attributes31 = startTag28.attributes;
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag("", attributes31);
        startTag20.attributes = attributes31;
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag("<<hi!>>", attributes31);
        org.jsoup.parser.Token.StartTag startTag35 = startTag34.asStartTag();
        startTag35.appendAttributeName("</<!---->StartTag>");
        java.lang.String str38 = startTag35.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag39 = startTag35.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!---->" + "'", str12, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertNotNull(startTag35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<<<hi!>>>" + "'", str38, "<<<hi!>>>");
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.appendAttributeValue(' ');
        java.lang.String str5 = startTag2.tokenType();
        java.lang.String str6 = startTag2.name();
        boolean boolean7 = startTag2.isSelfClosing();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype8 = startTag2.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag("hi!", attributes5);
        org.jsoup.parser.Token.TokenType tokenType7 = startTag6.type;
        startTag6.finaliseTag();
        boolean boolean9 = startTag6.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType10 = startTag6.type;
        doctype0.type = tokenType10;
        boolean boolean12 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder13 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder14 = doctype0.name;
        java.lang.String str15 = doctype0.tokenType();
        boolean boolean16 = doctype0.forceQuirks;
        java.lang.String str17 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Doctype" + "'", str15, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.forceQuirks = false;
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        boolean boolean7 = doctype0.forceQuirks;
        boolean boolean8 = doctype0.isDoctype();
        boolean boolean9 = doctype0.isCharacter();
        java.lang.String str10 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        org.jsoup.nodes.Attributes attributes4 = startTag0.getAttributes();
        startTag0.tagName = "<!---->StartTag";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributes4);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<<hi!>>");
        java.lang.String str2 = endTag1.toString();
        endTag1.appendTagName("</<<hi!>>>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</<<hi!>>>" + "'", str2, "</<<hi!>>>");
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.selfClosing = false;
        startTag0.appendTagName("hi!");
        org.jsoup.nodes.Attributes attributes5 = startTag0.getAttributes();
        java.lang.String str6 = startTag0.name();
        java.lang.String str7 = startTag0.tokenType();
        org.jsoup.nodes.Attributes attributes8 = startTag0.getAttributes();
        org.jsoup.parser.Token.Tag tag10 = startTag0.name("<<!----><hi!>>");
        java.lang.String str11 = tag10.tokenType();
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "StartTag" + "'", str7, "StartTag");
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "StartTag" + "'", str11, "StartTag");
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendTagName('4');
        startTag2.appendAttributeValue("<!---->");
        startTag2.appendAttributeName(' ');
        startTag2.appendTagName("</<!---->>");
        boolean boolean12 = startTag2.isEndTag();
        org.jsoup.parser.Token.TokenType tokenType13 = startTag2.type;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        boolean boolean2 = doctype0.isDoctype();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        boolean boolean6 = doctype0.isComment();
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.String str8 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        startTag0.tagName = "Comment";
        boolean boolean6 = startTag0.isStartTag();
        startTag0.appendAttributeValue("<<!---->>");
        startTag0.selfClosing = false;
        java.lang.String str11 = startTag0.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<Comment>" + "'", str11, "<Comment>");
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.toString();
        boolean boolean3 = startTag1.isComment();
        java.lang.String str4 = startTag1.tokenType();
        startTag1.finaliseTag();
        startTag1.finaliseTag();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<<!---->>" + "'", str2, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "StartTag" + "'", str4, "StartTag");
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType5 = org.jsoup.parser.Token.TokenType.Doctype;
        comment4.type = tokenType5;
        startTag2.type = tokenType5;
        java.lang.String str8 = startTag2.tagName;
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes12 = null;
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("hi!", attributes12);
        startTag13.newAttribute();
        startTag13.tagName = "";
        org.jsoup.nodes.Attributes attributes17 = startTag13.attributes;
        startTag10.attributes = attributes17;
        startTag2.attributes = attributes17;
        startTag2.appendAttributeValue(' ');
        startTag2.tagName = "</</<!---->>>";
        boolean boolean24 = startTag2.isSelfClosing();
        java.lang.String str25 = startTag2.tagName;
        boolean boolean26 = startTag2.isDoctype();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "</</<!---->>>" + "'", str25, "</</<!---->>>");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.appendAttributeValue(' ');
        java.lang.String str5 = startTag2.tokenType();
        java.lang.String str6 = startTag2.name();
        startTag2.appendTagName("<!---->");
        startTag2.tagName = "StartTag";
        startTag2.finaliseTag();
        java.lang.String str12 = startTag2.name();
        java.lang.String str13 = startTag2.toString();
        boolean boolean14 = startTag2.isDoctype();
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        startTag17.appendAttributeValue('4');
        boolean boolean20 = startTag17.isEndTag();
        startTag17.newAttribute();
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        startTag22.appendAttributeValue('4');
        org.jsoup.nodes.Attributes attributes25 = startTag22.attributes;
        startTag17.attributes = attributes25;
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag("<<hi!>StartTag>", attributes25);
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag("</EndTag>", attributes25);
        startTag2.attributes = attributes25;
        boolean boolean30 = startTag2.isSelfClosing();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "StartTag" + "'", str12, "StartTag");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<StartTag>" + "'", str13, "<StartTag>");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.tokenType();
        boolean boolean3 = startTag1.isComment();
        java.lang.String str4 = startTag1.toString();
        boolean boolean5 = startTag1.isComment();
        org.jsoup.parser.Token.Tag tag7 = startTag1.name("");
        org.jsoup.parser.Token.Tag tag9 = tag7.name("<<!---->>");
        java.lang.String str10 = tag7.tagName;
        tag7.newAttribute();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<<!---->>" + "'", str4, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<<!---->>" + "'", str10, "<<!---->>");
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        startTag0.newAttribute();
        boolean boolean5 = startTag0.isComment();
        boolean boolean6 = startTag0.selfClosing;
        org.jsoup.nodes.Attributes attributes7 = null;
        startTag0.attributes = attributes7;
        org.jsoup.parser.Token.EndTag endTag9 = new org.jsoup.parser.Token.EndTag();
        boolean boolean10 = endTag9.selfClosing;
        org.jsoup.parser.Token.Tag tag12 = endTag9.name("<!---->");
        org.jsoup.parser.Token.TokenType tokenType13 = org.jsoup.parser.Token.TokenType.StartTag;
        tag12.type = tokenType13;
        startTag0.type = tokenType13;
        org.jsoup.nodes.Attributes attributes16 = startTag0.getAttributes();
        startTag0.appendAttributeValue("<<<!---->>>");
        boolean boolean19 = startTag0.isDoctype();
        java.lang.Class<?> wildcardClass20 = startTag0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(attributes16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.appendAttributeValue(' ');
        java.lang.String str5 = startTag2.tokenType();
        boolean boolean6 = startTag2.isEOF();
        startTag2.appendTagName("Comment");
        boolean boolean9 = startTag2.isEndTag();
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag("hi!", attributes11);
        org.jsoup.parser.Token.TokenType tokenType13 = startTag12.type;
        startTag12.finaliseTag();
        boolean boolean15 = startTag12.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType16 = startTag12.type;
        java.lang.String str17 = startTag12.tokenType();
        org.jsoup.parser.Token.TokenType tokenType18 = startTag12.type;
        startTag2.type = tokenType18;
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        startTag20.appendAttributeValue('4');
        boolean boolean23 = startTag20.isEndTag();
        startTag20.newAttribute();
        boolean boolean25 = startTag20.isComment();
        boolean boolean26 = startTag20.selfClosing;
        org.jsoup.nodes.Attributes attributes27 = null;
        startTag20.attributes = attributes27;
        org.jsoup.parser.Token.EndTag endTag29 = new org.jsoup.parser.Token.EndTag();
        boolean boolean30 = endTag29.selfClosing;
        org.jsoup.parser.Token.Tag tag32 = endTag29.name("<!---->");
        org.jsoup.parser.Token.TokenType tokenType33 = org.jsoup.parser.Token.TokenType.StartTag;
        tag32.type = tokenType33;
        startTag20.type = tokenType33;
        org.jsoup.nodes.Attributes attributes36 = startTag20.getAttributes();
        boolean boolean37 = startTag20.isSelfClosing();
        org.jsoup.nodes.Attributes attributes40 = null;
        org.jsoup.parser.Token.StartTag startTag41 = new org.jsoup.parser.Token.StartTag("hi!", attributes40);
        startTag41.newAttribute();
        startTag41.tagName = "";
        org.jsoup.nodes.Attributes attributes45 = startTag41.attributes;
        org.jsoup.parser.Token.StartTag startTag46 = new org.jsoup.parser.Token.StartTag("", attributes45);
        org.jsoup.parser.Token.StartTag startTag47 = new org.jsoup.parser.Token.StartTag();
        startTag47.appendAttributeValue('4');
        boolean boolean50 = startTag47.isDoctype();
        org.jsoup.nodes.Attributes attributes51 = startTag47.attributes;
        startTag46.attributes = attributes51;
        startTag20.attributes = attributes51;
        startTag2.attributes = attributes51;
        java.lang.String str55 = startTag2.name();
        startTag2.newAttribute();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "StartTag" + "'", str17, "StartTag");
        org.junit.Assert.assertTrue("'" + tokenType18 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType18.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertTrue("'" + tokenType33 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType33.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(attributes36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(attributes45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(attributes51);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!Comment" + "'", str55, "hi!Comment");
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        doctype0.forceQuirks = true;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        boolean boolean7 = doctype0.isForceQuirks();
        doctype0.forceQuirks = false;
        boolean boolean10 = doctype0.forceQuirks;
        boolean boolean11 = doctype0.isForceQuirks();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isCharacter();
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        boolean boolean5 = doctype0.isForceQuirks();
        boolean boolean6 = doctype0.forceQuirks;
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        java.lang.String str8 = doctype0.tokenType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str4 = startTag3.toString();
        java.lang.String str5 = startTag3.name();
        org.jsoup.parser.Token.Tag tag7 = startTag3.name("<hi!>");
        org.jsoup.nodes.Attributes attributes8 = startTag3.attributes;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("</<hi!>>", attributes8);
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("<!----><<!---->>", attributes8);
        startTag10.appendAttributeName("");
        org.jsoup.parser.Token.TokenType tokenType13 = startTag10.type;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<<!---->>" + "'", str4, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.newAttribute();
        boolean boolean4 = startTag2.isSelfClosing();
        boolean boolean5 = startTag2.isEOF();
        boolean boolean6 = startTag2.isEndTag();
        org.jsoup.parser.Token.TokenType tokenType7 = startTag2.type;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str10 = startTag9.toString();
        boolean boolean11 = startTag9.isEndTag();
        boolean boolean12 = startTag9.isEOF();
        java.lang.String str13 = startTag9.name();
        org.jsoup.nodes.Attributes attributes14 = startTag9.getAttributes();
        startTag2.attributes = attributes14;
        org.jsoup.parser.Token.TokenType tokenType16 = startTag2.type;
        boolean boolean17 = startTag2.isDoctype();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<<!---->>" + "'", str10, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.forceQuirks = false;
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.String str7 = doctype0.getPublicIdentifier();
        java.lang.String str8 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder9 = doctype0.systemIdentifier;
        java.lang.String str10 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        org.jsoup.parser.Token.TokenType tokenType3 = startTag2.type;
        startTag2.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag6 = startTag2.asStartTag();
        startTag6.finaliseTag();
        startTag6.selfClosing = false;
        startTag6.finaliseTag();
        java.lang.String str11 = startTag6.toString();
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<hi!>" + "'", str11, "<hi!>");
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        org.jsoup.parser.Token.Doctype doctype4 = new org.jsoup.parser.Token.Doctype();
        boolean boolean5 = doctype4.isForceQuirks();
        boolean boolean6 = doctype4.isForceQuirks();
        java.lang.StringBuilder stringBuilder7 = doctype4.systemIdentifier;
        java.lang.StringBuilder stringBuilder8 = doctype4.name;
        doctype4.forceQuirks = true;
        org.jsoup.nodes.Attributes attributes12 = null;
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("hi!", attributes12);
        startTag13.appendAttributeValue(' ');
        java.lang.String str16 = startTag13.tokenType();
        java.lang.String str17 = startTag13.name();
        startTag13.appendTagName("<!---->");
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        startTag20.appendAttributeValue('4');
        boolean boolean23 = startTag20.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType24 = startTag20.type;
        startTag13.type = tokenType24;
        doctype4.type = tokenType24;
        org.jsoup.parser.Token.TokenType tokenType27 = doctype4.type;
        endTag1.type = tokenType27;
        boolean boolean29 = endTag1.isCharacter();
        org.jsoup.parser.Token.Tag tag31 = endTag1.name("<<hi!>>");
        tag31.finaliseTag();
        boolean boolean33 = tag31.selfClosing;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</<!---->>" + "'", str2, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</<!---->>" + "'", str3, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "StartTag" + "'", str16, "StartTag");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + tokenType24 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType24.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + tokenType27 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType27.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        startTag0.newAttribute();
        boolean boolean5 = startTag0.isComment();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("hi!", attributes9);
        startTag10.newAttribute();
        startTag10.tagName = "";
        org.jsoup.nodes.Attributes attributes14 = startTag10.attributes;
        startTag7.attributes = attributes14;
        startTag0.attributes = attributes14;
        startTag0.appendAttributeName("<<<!---->>>");
        boolean boolean19 = startTag0.isComment();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendTagName('4');
        startTag2.appendAttributeValue("<!---->");
        startTag2.appendAttributeValue("");
        boolean boolean10 = startTag2.isDoctype();
        org.jsoup.nodes.Attributes attributes11 = startTag2.getAttributes();
        org.jsoup.parser.Token.Tag tag13 = startTag2.name("</<hi!>>");
        org.jsoup.parser.Token.Tag tag15 = startTag2.name("<<!---->>4");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag16 = tag15.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(attributes11);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(tag15);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        endTag1.tagName = "</</<!---->>>";
        org.jsoup.parser.Token.TokenType tokenType7 = endTag1.type;
        boolean boolean8 = endTag1.isDoctype();
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        org.jsoup.parser.Token.Doctype doctype2 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str3 = doctype2.getPublicIdentifier();
        boolean boolean4 = doctype2.forceQuirks;
        java.lang.StringBuilder stringBuilder5 = doctype2.publicIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype2.systemIdentifier;
        org.jsoup.parser.Token.TokenType tokenType7 = doctype2.type;
        doctype0.type = tokenType7;
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList7);
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        xmlTreeBuilder0.initialiseParse("<!---->", "hi!", parseErrorList11);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder0.initialiseParse("<<!---->>", "", parseErrorList15);
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes21 = null;
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag("hi!", attributes21);
        startTag22.newAttribute();
        startTag22.tagName = "";
        org.jsoup.nodes.Attributes attributes26 = startTag22.attributes;
        startTag19.attributes = attributes26;
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag("StartTag", attributes26);
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes32 = null;
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag("hi!", attributes32);
        startTag33.newAttribute();
        startTag33.tagName = "";
        org.jsoup.nodes.Attributes attributes37 = startTag33.attributes;
        startTag30.attributes = attributes37;
        startTag28.attributes = attributes37;
        startTag28.newAttribute();
        org.jsoup.nodes.Attributes attributes42 = null;
        org.jsoup.parser.Token.StartTag startTag43 = new org.jsoup.parser.Token.StartTag("hi!", attributes42);
        boolean boolean44 = startTag43.isComment();
        startTag43.appendAttributeName('4');
        java.lang.String str47 = startTag43.tokenType();
        org.jsoup.nodes.Attributes attributes49 = null;
        org.jsoup.parser.Token.StartTag startTag50 = new org.jsoup.parser.Token.StartTag("hi!", attributes49);
        startTag50.appendAttributeValue(' ');
        java.lang.String str53 = startTag50.tokenType();
        java.lang.String str54 = startTag50.name();
        startTag50.appendTagName("<!---->");
        startTag50.tagName = "StartTag";
        org.jsoup.parser.Token.StartTag startTag59 = new org.jsoup.parser.Token.StartTag();
        startTag59.selfClosing = false;
        startTag59.appendTagName("hi!");
        org.jsoup.nodes.Attributes attributes64 = startTag59.getAttributes();
        startTag50.attributes = attributes64;
        startTag43.attributes = attributes64;
        startTag28.attributes = attributes64;
        org.jsoup.nodes.Element element68 = xmlTreeBuilder0.insert(startTag28);
        boolean boolean69 = startTag28.selfClosing;
        startTag28.appendAttributeName('#');
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "StartTag" + "'", str47, "StartTag");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "StartTag" + "'", str53, "StartTag");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertNotNull(attributes64);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        org.jsoup.parser.Token.TokenType tokenType2 = comment0.type;
        boolean boolean3 = comment0.isComment();
        java.lang.String str4 = comment0.getData();
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        java.lang.String str6 = comment0.toString();
        java.lang.String str7 = comment0.toString();
        java.lang.String str8 = comment0.toString();
        java.lang.StringBuilder stringBuilder9 = comment0.data;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!---->" + "'", str7, "<!---->");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!---->" + "'", str8, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        boolean boolean4 = startTag0.isCharacter();
        boolean boolean5 = startTag0.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType6 = startTag0.type;
        startTag0.tagName = "<hi!<!---->>";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.selfClosing;
        endTag0.newAttribute();
        endTag0.appendAttributeValue("");
        org.jsoup.parser.Token.EndTag endTag5 = endTag0.asEndTag();
        endTag0.appendAttributeValue("<</EndTag>>");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(endTag5);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.toString();
        boolean boolean3 = startTag1.isEndTag();
        startTag1.appendAttributeName("hi!EndTag");
        startTag1.appendTagName("<!----><<!---->>");
        org.jsoup.parser.Token.StartTag startTag8 = startTag1.asStartTag();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<<!---->>" + "'", str2, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(startTag8);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        org.jsoup.nodes.Attributes attributes4 = null;
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag("hi!", attributes4);
        startTag5.newAttribute();
        startTag5.tagName = "";
        org.jsoup.nodes.Attributes attributes9 = startTag5.attributes;
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("", attributes9);
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("</<!---->>", attributes9);
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag("<hi!4</<!---->>>", attributes9);
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        boolean boolean2 = doctype0.forceQuirks;
        boolean boolean3 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        java.lang.String str5 = doctype0.getSystemIdentifier();
        java.lang.String str6 = doctype0.getPublicIdentifier();
        java.lang.String str7 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        doctype0.forceQuirks = true;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        boolean boolean7 = doctype0.isForceQuirks();
        doctype0.forceQuirks = false;
        java.lang.String str10 = doctype0.getSystemIdentifier();
        java.lang.String str11 = doctype0.getPublicIdentifier();
        boolean boolean12 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder13 = doctype0.systemIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        startTag1.appendAttributeValue('4');
        boolean boolean4 = startTag1.isEndTag();
        boolean boolean5 = startTag1.isEOF();
        startTag1.appendAttributeValue("hi!");
        startTag1.appendTagName('4');
        boolean boolean10 = startTag1.isSelfClosing();
        org.jsoup.parser.Token.Tag tag12 = startTag1.name("hi!");
        boolean boolean13 = startTag1.isComment();
        org.jsoup.parser.Token.StartTag startTag14 = startTag1.asStartTag();
        org.jsoup.nodes.Attributes attributes15 = startTag1.attributes;
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag("</</</<!---->>>>", attributes15);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertNotNull(attributes15);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        boolean boolean2 = doctype0.isDoctype();
        boolean boolean3 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder4 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        java.lang.String str6 = doctype0.tokenType();
        boolean boolean7 = doctype0.forceQuirks;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Doctype" + "'", str6, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        boolean boolean4 = startTag2.selfClosing;
        boolean boolean5 = startTag2.isEndTag();
        startTag2.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag7 = startTag2.asStartTag();
        startTag2.appendAttributeValue('a');
        startTag2.selfClosing = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(startTag7);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.Token.Character character6 = new org.jsoup.parser.Token.Character("");
        java.lang.String str7 = character6.toString();
        java.lang.String str8 = character6.toString();
        boolean boolean9 = character6.isDoctype();
        xmlTreeBuilder0.insert(character6);
        java.lang.String str11 = character6.getData();
        java.lang.String str12 = character6.toString();
        java.lang.String str13 = character6.getData();
        boolean boolean14 = character6.isEOF();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag();
        startTag2.appendAttributeValue('4');
        boolean boolean5 = startTag2.isEndTag();
        boolean boolean6 = startTag2.isEOF();
        startTag2.appendAttributeValue("hi!");
        startTag2.appendAttributeName('#');
        boolean boolean11 = startTag2.isSelfClosing();
        org.jsoup.nodes.Attributes attributes13 = null;
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag("hi!", attributes13);
        startTag14.newAttribute();
        startTag14.tagName = "";
        org.jsoup.nodes.Attributes attributes18 = startTag14.attributes;
        startTag2.attributes = attributes18;
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag("hi!EndTag", attributes18);
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag("<hi!EndTag>", attributes18);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character22 = startTag21.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("hi!", attributes3);
        startTag4.newAttribute();
        startTag4.tagName = "";
        org.jsoup.nodes.Attributes attributes8 = startTag4.attributes;
        startTag1.attributes = attributes8;
        boolean boolean10 = startTag1.isDoctype();
        java.lang.String str11 = startTag1.tagName;
        startTag1.finaliseTag();
        java.lang.String str13 = startTag1.name();
        startTag1.appendAttributeName("<hi!</</<!---->>>>");
        java.lang.String str16 = startTag1.tokenType();
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "StartTag" + "'", str16, "StartTag");
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        boolean boolean4 = startTag0.isEOF();
        startTag0.newAttribute();
        boolean boolean6 = startTag0.isSelfClosing();
        startTag0.appendAttributeName('#');
        boolean boolean9 = startTag0.selfClosing;
        org.jsoup.parser.Token.TokenType tokenType10 = startTag0.type;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        boolean boolean2 = doctype0.isDoctype();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder7 = doctype0.name;
        boolean boolean8 = doctype0.isForceQuirks();
        org.jsoup.parser.Token.Doctype doctype9 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder10 = doctype0.publicIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(doctype9);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        boolean boolean2 = startTag1.isSelfClosing();
        boolean boolean3 = startTag1.isDoctype();
        startTag1.newAttribute();
        org.jsoup.parser.Token.Tag tag6 = startTag1.name("<<!---->>");
        boolean boolean7 = tag6.isCharacter();
        tag6.appendAttributeValue('#');
        tag6.appendTagName('4');
        boolean boolean12 = tag6.isSelfClosing();
        org.jsoup.parser.Token.EndTag endTag14 = new org.jsoup.parser.Token.EndTag("</<!---->>");
        java.lang.String str15 = endTag14.toString();
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        startTag17.appendAttributeValue('4');
        boolean boolean20 = startTag17.isEndTag();
        startTag17.newAttribute();
        boolean boolean22 = startTag17.isComment();
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes26 = null;
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag("hi!", attributes26);
        startTag27.newAttribute();
        startTag27.tagName = "";
        org.jsoup.nodes.Attributes attributes31 = startTag27.attributes;
        startTag24.attributes = attributes31;
        startTag17.attributes = attributes31;
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag("<!---->", attributes31);
        endTag14.attributes = attributes31;
        endTag14.appendAttributeName("<!---->");
        org.jsoup.parser.Token.Comment comment38 = new org.jsoup.parser.Token.Comment();
        boolean boolean39 = comment38.isStartTag();
        org.jsoup.parser.Token.Comment comment40 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType41 = org.jsoup.parser.Token.TokenType.Doctype;
        comment40.type = tokenType41;
        comment38.type = tokenType41;
        boolean boolean44 = comment38.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType45 = comment38.type;
        endTag14.type = tokenType45;
        tag6.type = tokenType45;
        tag6.appendAttributeValue("<<!---->>4");
        tag6.appendAttributeName("</hi!<!---->>");
        boolean boolean52 = tag6.isEOF();
        boolean boolean53 = tag6.isSelfClosing();
        org.jsoup.nodes.Attributes attributes54 = tag6.attributes;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "</</<!---->>>" + "'", str15, "</</<!---->>>");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + tokenType41 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType41.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + tokenType45 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType45.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(attributes54);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        org.jsoup.parser.Token.TokenType tokenType7 = comment5.type;
        java.lang.String str8 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Comment comment10 = new org.jsoup.parser.Token.Comment();
        java.lang.String str11 = comment10.toString();
        org.jsoup.parser.Token.TokenType tokenType12 = comment10.type;
        java.lang.String str13 = comment10.toString();
        xmlTreeBuilder0.insert(comment10);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        xmlTreeBuilder15.initialiseParse("</<!---->>", "StartTag", parseErrorList18);
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        xmlTreeBuilder15.initialiseParse("<!---->", "<<!---->>", parseErrorList22);
        org.jsoup.parser.Token.Character character25 = new org.jsoup.parser.Token.Character("");
        java.lang.String str26 = character25.toString();
        java.lang.String str27 = character25.getData();
        java.lang.String str28 = character25.toString();
        java.lang.String str29 = character25.toString();
        boolean boolean30 = xmlTreeBuilder15.process((org.jsoup.parser.Token) character25);
        xmlTreeBuilder0.insert(character25);
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        startTag32.appendAttributeValue('4');
        boolean boolean35 = startTag32.isDoctype();
        boolean boolean36 = startTag32.isDoctype();
        java.lang.String str37 = startTag32.tokenType();
        startTag32.appendTagName('a');
        org.jsoup.parser.Token.Tag tag41 = startTag32.name("hi!");
        boolean boolean42 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag32);
        startTag32.newAttribute();
        startTag32.appendAttributeName("</<!---->>");
        boolean boolean46 = startTag32.selfClosing;
        java.lang.String str47 = startTag32.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "StartTag" + "'", str37, "StartTag");
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "<hi!>" + "'", str47, "<hi!>");
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder3 = doctype0.publicIdentifier;
        java.lang.String str4 = doctype0.getName();
        boolean boolean5 = doctype0.forceQuirks;
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        java.lang.String str3 = doctype0.getSystemIdentifier();
        org.jsoup.nodes.Attributes attributes5 = null;
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag("hi!", attributes5);
        org.jsoup.parser.Token.TokenType tokenType7 = startTag6.type;
        startTag6.finaliseTag();
        boolean boolean9 = startTag6.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType10 = startTag6.type;
        doctype0.type = tokenType10;
        boolean boolean12 = doctype0.forceQuirks;
        boolean boolean13 = doctype0.forceQuirks;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment14 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        boolean boolean2 = doctype0.isDoctype();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        boolean boolean6 = doctype0.isComment();
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        doctype0.forceQuirks = false;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.appendAttributeValue(' ');
        java.lang.String str5 = startTag2.tokenType();
        java.lang.String str6 = startTag2.name();
        startTag2.appendTagName("<!---->");
        boolean boolean9 = startTag2.isEOF();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag("hi!", attributes14);
        startTag15.newAttribute();
        startTag15.tagName = "";
        org.jsoup.nodes.Attributes attributes19 = startTag15.attributes;
        startTag12.attributes = attributes19;
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag("StartTag", attributes19);
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes25 = null;
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag("hi!", attributes25);
        startTag26.newAttribute();
        startTag26.tagName = "";
        org.jsoup.nodes.Attributes attributes30 = startTag26.attributes;
        startTag23.attributes = attributes30;
        startTag21.attributes = attributes30;
        startTag21.newAttribute();
        org.jsoup.nodes.Attributes attributes35 = null;
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag("hi!", attributes35);
        boolean boolean37 = startTag36.isComment();
        startTag36.appendAttributeName('4');
        java.lang.String str40 = startTag36.tokenType();
        org.jsoup.nodes.Attributes attributes42 = null;
        org.jsoup.parser.Token.StartTag startTag43 = new org.jsoup.parser.Token.StartTag("hi!", attributes42);
        startTag43.appendAttributeValue(' ');
        java.lang.String str46 = startTag43.tokenType();
        java.lang.String str47 = startTag43.name();
        startTag43.appendTagName("<!---->");
        startTag43.tagName = "StartTag";
        org.jsoup.parser.Token.StartTag startTag52 = new org.jsoup.parser.Token.StartTag();
        startTag52.selfClosing = false;
        startTag52.appendTagName("hi!");
        org.jsoup.nodes.Attributes attributes57 = startTag52.getAttributes();
        startTag43.attributes = attributes57;
        startTag36.attributes = attributes57;
        startTag21.attributes = attributes57;
        startTag2.attributes = attributes57;
        java.lang.String str62 = startTag2.tokenType();
        startTag2.selfClosing = true;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "StartTag" + "'", str40, "StartTag");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "StartTag" + "'", str46, "StartTag");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(attributes57);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "StartTag" + "'", str62, "StartTag");
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str4 = startTag3.toString();
        java.lang.String str5 = startTag3.name();
        org.jsoup.parser.Token.Tag tag7 = startTag3.name("<hi!>");
        org.jsoup.nodes.Attributes attributes8 = startTag3.getAttributes();
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("<!---->", attributes8);
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("<a>", attributes8);
        java.lang.String str11 = startTag10.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<<!---->>" + "'", str4, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<<a>>" + "'", str11, "<<a>>");
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isStartTag();
        org.jsoup.parser.Token.Comment comment2 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType3 = org.jsoup.parser.Token.TokenType.Doctype;
        comment2.type = tokenType3;
        comment0.type = tokenType3;
        boolean boolean6 = comment0.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType7 = comment0.type;
        java.lang.String str8 = comment0.getData();
        java.lang.StringBuilder stringBuilder9 = comment0.data;
        boolean boolean10 = comment0.isEndTag();
        boolean boolean11 = comment0.isStartTag();
        java.lang.String str12 = comment0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!---->" + "'", str12, "<!---->");
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        boolean boolean2 = startTag1.isSelfClosing();
        boolean boolean3 = startTag1.isDoctype();
        boolean boolean4 = startTag1.isSelfClosing();
        startTag1.appendTagName("<hi!>");
        startTag1.selfClosing = true;
        org.jsoup.parser.Token.Tag tag10 = startTag1.name("<EndTag>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.isEOF();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.String str7 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("hi!", attributes3);
        startTag4.newAttribute();
        startTag4.tagName = "";
        org.jsoup.nodes.Attributes attributes8 = startTag4.attributes;
        startTag1.attributes = attributes8;
        boolean boolean10 = startTag1.isDoctype();
        java.lang.String str11 = startTag1.tagName;
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str14 = startTag13.tokenType();
        boolean boolean15 = startTag13.isComment();
        java.lang.String str16 = startTag13.toString();
        boolean boolean17 = startTag13.isComment();
        org.jsoup.parser.Token.Tag tag19 = startTag13.name("");
        startTag13.appendAttributeValue("Character");
        org.jsoup.parser.Token.TokenType tokenType22 = org.jsoup.parser.Token.TokenType.Doctype;
        startTag13.type = tokenType22;
        startTag1.type = tokenType22;
        boolean boolean25 = startTag1.isSelfClosing();
        startTag1.appendAttributeValue("<a>");
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "StartTag" + "'", str14, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<<!---->>" + "'", str16, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertTrue("'" + tokenType22 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType22.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        org.jsoup.parser.Token.TokenType tokenType3 = startTag2.type;
        startTag2.finaliseTag();
        java.lang.String str5 = startTag2.toString();
        startTag2.appendAttributeName("");
        java.lang.String str8 = startTag2.toString();
        // The following exception was thrown during execution in test generation
        try {
            startTag2.finaliseTag();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!>" + "'", str5, "<hi!>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<hi!>" + "'", str8, "<hi!>");
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("</<hi!>a>");
        boolean boolean2 = startTag1.isEndTag();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("<!---->", "<<!---->>", parseErrorList7);
        org.jsoup.parser.Token.Character character10 = new org.jsoup.parser.Token.Character("");
        java.lang.String str11 = character10.toString();
        java.lang.String str12 = character10.getData();
        java.lang.String str13 = character10.toString();
        java.lang.String str14 = character10.toString();
        boolean boolean15 = xmlTreeBuilder0.process((org.jsoup.parser.Token) character10);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        xmlTreeBuilder16.initialiseParse("</<!---->>", "</<!---->>", parseErrorList19);
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        xmlTreeBuilder16.initialiseParse("", "<<!---->>", parseErrorList23);
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        xmlTreeBuilder16.initialiseParse("<!---->", "hi!", parseErrorList27);
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str31 = startTag30.tokenType();
        boolean boolean32 = startTag30.selfClosing;
        org.jsoup.nodes.Element element33 = xmlTreeBuilder16.insert(startTag30);
        boolean boolean34 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag30);
        org.jsoup.parser.Token.Comment comment35 = new org.jsoup.parser.Token.Comment();
        boolean boolean36 = comment35.isStartTag();
        org.jsoup.parser.Token.Comment comment37 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType38 = org.jsoup.parser.Token.TokenType.Doctype;
        comment37.type = tokenType38;
        comment35.type = tokenType38;
        boolean boolean41 = comment35.isStartTag();
        java.lang.String str42 = comment35.toString();
        xmlTreeBuilder0.insert(comment35);
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        xmlTreeBuilder0.initialiseParse("<<!---->>", "</<!---->>", parseErrorList46);
        org.jsoup.parser.ParseErrorList parseErrorList50 = null;
        xmlTreeBuilder0.initialiseParse("hi!<!---->", "<<</<hi!>>>>", parseErrorList50);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "StartTag" + "'", str31, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + tokenType38 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType38.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<!---->" + "'", str42, "<!---->");
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("hi!", attributes3);
        startTag4.newAttribute();
        startTag4.tagName = "";
        org.jsoup.nodes.Attributes attributes8 = startTag4.attributes;
        startTag1.attributes = attributes8;
        boolean boolean10 = startTag1.isDoctype();
        org.jsoup.parser.Token.StartTag startTag11 = startTag1.asStartTag();
        startTag1.selfClosing = true;
        org.jsoup.parser.Token.TokenType tokenType14 = startTag1.type;
        java.lang.String str15 = startTag1.name();
        boolean boolean16 = startTag1.isEndTag();
        startTag1.appendAttributeValue("< >");
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!---->" + "'", str15, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType5 = org.jsoup.parser.Token.TokenType.Doctype;
        comment4.type = tokenType5;
        startTag2.type = tokenType5;
        startTag2.tagName = "<hi!>";
        startTag2.appendTagName('a');
        boolean boolean12 = startTag2.isStartTag();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str2 = endTag1.toString();
        endTag1.appendAttributeValue('4');
        boolean boolean5 = endTag1.isEOF();
        endTag1.appendAttributeValue('#');
        boolean boolean8 = endTag1.selfClosing;
        boolean boolean9 = endTag1.isCharacter();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</<!---->>" + "'", str2, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        java.lang.String str5 = endTag1.toString();
        endTag1.appendAttributeValue("<!----><<!---->>");
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        startTag8.appendAttributeValue('4');
        boolean boolean11 = startTag8.isEndTag();
        startTag8.newAttribute();
        boolean boolean13 = startTag8.isComment();
        boolean boolean14 = startTag8.selfClosing;
        org.jsoup.nodes.Attributes attributes16 = null;
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag("hi!", attributes16);
        boolean boolean18 = startTag17.isComment();
        org.jsoup.parser.Token.Comment comment19 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType20 = org.jsoup.parser.Token.TokenType.Doctype;
        comment19.type = tokenType20;
        startTag17.type = tokenType20;
        startTag8.type = tokenType20;
        endTag1.type = tokenType20;
        boolean boolean25 = endTag1.isDoctype();
        java.lang.String str26 = endTag1.toString();
        boolean boolean27 = endTag1.isEndTag();
        endTag1.selfClosing = false;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "</<!---->>" + "'", str5, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "</<!---->>" + "'", str26, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("EndTag");
        org.jsoup.nodes.Attributes attributes2 = endTag1.attributes;
        endTag1.newAttribute();
        org.junit.Assert.assertNull(attributes2);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        org.jsoup.parser.Token.TokenType tokenType7 = comment5.type;
        java.lang.String str8 = comment5.getData();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Comment comment10 = new org.jsoup.parser.Token.Comment();
        boolean boolean11 = comment10.isStartTag();
        java.lang.String str12 = comment10.toString();
        boolean boolean13 = comment10.isCharacter();
        xmlTreeBuilder0.insert(comment10);
        java.lang.String str15 = comment10.getData();
        java.lang.String str16 = comment10.getData();
        java.lang.String str17 = comment10.getData();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!---->" + "'", str12, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        endTag1.appendAttributeValue("");
        endTag1.appendAttributeValue('#');
        org.jsoup.parser.Token.TokenType tokenType6 = endTag1.type;
        boolean boolean7 = endTag1.isStartTag();
        boolean boolean8 = endTag1.isDoctype();
        endTag1.appendAttributeValue('#');
        org.jsoup.nodes.Attributes attributes11 = endTag1.getAttributes();
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(attributes11);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("hi!", attributes3);
        startTag4.newAttribute();
        startTag4.tagName = "";
        org.jsoup.nodes.Attributes attributes8 = startTag4.attributes;
        startTag1.attributes = attributes8;
        boolean boolean10 = startTag1.isDoctype();
        org.jsoup.parser.Token.StartTag startTag11 = startTag1.asStartTag();
        boolean boolean12 = startTag1.isEndTag();
        startTag1.finaliseTag();
        org.jsoup.parser.Token.TokenType tokenType14 = startTag1.type;
        startTag1.appendAttributeValue('a');
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.Token.Character character6 = new org.jsoup.parser.Token.Character("");
        java.lang.String str7 = character6.toString();
        java.lang.String str8 = character6.toString();
        boolean boolean9 = character6.isDoctype();
        xmlTreeBuilder0.insert(character6);
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        xmlTreeBuilder0.initialiseParse("<4>", "4", parseErrorList13);
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        startTag15.appendAttributeValue('4');
        boolean boolean18 = startTag15.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType19 = startTag15.type;
        startTag15.tagName = "<!---->";
        startTag15.tagName = "";
        org.jsoup.nodes.Attributes attributes26 = null;
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag("hi!", attributes26);
        startTag27.appendAttributeValue(' ');
        java.lang.String str30 = startTag27.tokenType();
        java.lang.String str31 = startTag27.name();
        startTag27.appendTagName("<!---->");
        startTag27.tagName = "StartTag";
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag();
        startTag36.selfClosing = false;
        startTag36.appendTagName("hi!");
        org.jsoup.nodes.Attributes attributes41 = startTag36.getAttributes();
        startTag27.attributes = attributes41;
        org.jsoup.parser.Token.StartTag startTag43 = new org.jsoup.parser.Token.StartTag("<<hi!>>", attributes41);
        startTag15.attributes = attributes41;
        java.lang.String str45 = startTag15.tokenType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean46 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + tokenType19 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType19.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "StartTag" + "'", str30, "StartTag");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "StartTag" + "'", str45, "StartTag");
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.tokenType();
        boolean boolean3 = startTag1.isComment();
        org.jsoup.parser.Token.Tag tag5 = startTag1.name("<<!---->>");
        tag5.appendAttributeValue('a');
        tag5.appendTagName("<!----><<!---->>a");
        tag5.appendAttributeValue('a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tag5);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token.Character character9 = new org.jsoup.parser.Token.Character("");
        java.lang.String str10 = character9.toString();
        xmlTreeBuilder0.insert(character9);
        org.jsoup.parser.Token.Character character13 = new org.jsoup.parser.Token.Character("<<!---->>");
        java.lang.String str14 = character13.toString();
        xmlTreeBuilder0.insert(character13);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        xmlTreeBuilder16.initialiseParse("</<!---->>", "</<!---->>", parseErrorList19);
        org.jsoup.parser.Token.Comment comment21 = new org.jsoup.parser.Token.Comment();
        java.lang.String str22 = comment21.toString();
        org.jsoup.parser.Token.TokenType tokenType23 = comment21.type;
        java.lang.String str24 = comment21.getData();
        xmlTreeBuilder16.insert(comment21);
        org.jsoup.parser.Token.Comment comment26 = new org.jsoup.parser.Token.Comment();
        java.lang.String str27 = comment26.toString();
        org.jsoup.parser.Token.TokenType tokenType28 = comment26.type;
        java.lang.String str29 = comment26.toString();
        xmlTreeBuilder16.insert(comment26);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        xmlTreeBuilder31.initialiseParse("</<!---->>", "StartTag", parseErrorList34);
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        xmlTreeBuilder31.initialiseParse("<!---->", "<<!---->>", parseErrorList38);
        org.jsoup.parser.Token.Character character41 = new org.jsoup.parser.Token.Character("");
        java.lang.String str42 = character41.toString();
        java.lang.String str43 = character41.getData();
        java.lang.String str44 = character41.toString();
        java.lang.String str45 = character41.toString();
        boolean boolean46 = xmlTreeBuilder31.process((org.jsoup.parser.Token) character41);
        xmlTreeBuilder16.insert(character41);
        xmlTreeBuilder0.insert(character41);
        boolean boolean49 = character41.isComment();
        java.lang.String str50 = character41.getData();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<<!---->>" + "'", str14, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!---->" + "'", str22, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType23 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType23.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!---->" + "'", str27, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType28 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType28.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!---->" + "'", str29, "<!---->");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.forceQuirks = false;
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        boolean boolean8 = doctype7.forceQuirks;
        doctype7.forceQuirks = false;
        java.lang.StringBuilder stringBuilder11 = doctype7.publicIdentifier;
        java.lang.Class<?> wildcardClass12 = doctype7.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.forceQuirks = false;
        java.lang.String str5 = doctype0.getName();
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.String str7 = doctype0.tokenType();
        doctype0.forceQuirks = true;
        doctype0.forceQuirks = true;
        java.lang.String str12 = doctype0.getPublicIdentifier();
        java.lang.String str13 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Doctype" + "'", str7, "Doctype");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList3);
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str7 = endTag6.toString();
        java.lang.String str8 = endTag6.toString();
        boolean boolean9 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag6);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        xmlTreeBuilder0.initialiseParse("hi!<!---->", "", parseErrorList12);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        xmlTreeBuilder14.initialiseParse("</<!---->>", "</<!---->>", parseErrorList17);
        org.jsoup.parser.Token.Comment comment19 = new org.jsoup.parser.Token.Comment();
        java.lang.String str20 = comment19.toString();
        org.jsoup.parser.Token.TokenType tokenType21 = comment19.type;
        java.lang.String str22 = comment19.getData();
        xmlTreeBuilder14.insert(comment19);
        org.jsoup.parser.Token.Comment comment24 = new org.jsoup.parser.Token.Comment();
        java.lang.String str25 = comment24.toString();
        org.jsoup.parser.Token.TokenType tokenType26 = comment24.type;
        java.lang.String str27 = comment24.toString();
        xmlTreeBuilder14.insert(comment24);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        xmlTreeBuilder29.initialiseParse("</<!---->>", "StartTag", parseErrorList32);
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        xmlTreeBuilder29.initialiseParse("<!---->", "<<!---->>", parseErrorList36);
        org.jsoup.parser.Token.Character character39 = new org.jsoup.parser.Token.Character("");
        java.lang.String str40 = character39.toString();
        java.lang.String str41 = character39.getData();
        java.lang.String str42 = character39.toString();
        java.lang.String str43 = character39.toString();
        boolean boolean44 = xmlTreeBuilder29.process((org.jsoup.parser.Token) character39);
        xmlTreeBuilder14.insert(character39);
        org.jsoup.parser.Token.StartTag startTag46 = new org.jsoup.parser.Token.StartTag();
        startTag46.appendAttributeValue('4');
        boolean boolean49 = startTag46.isDoctype();
        boolean boolean50 = startTag46.isDoctype();
        java.lang.String str51 = startTag46.tokenType();
        startTag46.appendTagName('a');
        org.jsoup.parser.Token.Tag tag55 = startTag46.name("hi!");
        boolean boolean56 = xmlTreeBuilder14.process((org.jsoup.parser.Token) startTag46);
        org.jsoup.nodes.Element element57 = xmlTreeBuilder0.insert(startTag46);
        startTag46.appendAttributeName('4');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</<!---->>" + "'", str7, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</<!---->>" + "'", str8, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!---->" + "'", str20, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType21 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType21.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!---->" + "'", str25, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType26 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType26.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!---->" + "'", str27, "<!---->");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "StartTag" + "'", str51, "StartTag");
        org.junit.Assert.assertNotNull(tag55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(element57);
    }
}

