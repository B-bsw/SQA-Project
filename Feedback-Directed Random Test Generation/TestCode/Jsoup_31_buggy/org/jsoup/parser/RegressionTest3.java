package org.jsoup.parser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendAttributeName('4');
        java.lang.String str6 = startTag2.tokenType();
        org.jsoup.nodes.Attributes attributes8 = null;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("hi!", attributes8);
        startTag9.appendAttributeValue(' ');
        java.lang.String str12 = startTag9.tokenType();
        java.lang.String str13 = startTag9.name();
        startTag9.appendTagName("<!---->");
        startTag9.tagName = "StartTag";
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        startTag18.selfClosing = false;
        startTag18.appendTagName("hi!");
        org.jsoup.nodes.Attributes attributes23 = startTag18.getAttributes();
        startTag9.attributes = attributes23;
        startTag2.attributes = attributes23;
        java.lang.String str26 = startTag2.toString();
        org.jsoup.nodes.Attributes attributes27 = startTag2.attributes;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "StartTag" + "'", str6, "StartTag");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "StartTag" + "'", str12, "StartTag");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<hi!>" + "'", str26, "<hi!>");
        org.junit.Assert.assertNotNull(attributes27);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
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
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag("</</<!---->>>");
        org.jsoup.nodes.Element element36 = xmlTreeBuilder0.insert(startTag35);
        org.jsoup.parser.Token.Doctype doctype37 = new org.jsoup.parser.Token.Doctype();
        boolean boolean38 = doctype37.isForceQuirks();
        java.lang.StringBuilder stringBuilder39 = doctype37.systemIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + tokenType19 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType19.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + tokenType31 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType31.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "</<!---->StartTag>" + "'", str32, "</<!---->StartTag>");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(stringBuilder39);
        org.junit.Assert.assertEquals(stringBuilder39.toString(), "");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        org.jsoup.parser.Token.Tag tag3 = endTag1.name("<<!---->>");
        boolean boolean4 = endTag1.selfClosing;
        boolean boolean5 = endTag1.isEndTag();
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendTagName('4');
        org.jsoup.parser.Token.StartTag startTag6 = startTag2.asStartTag();
        java.lang.String str7 = startTag6.tokenType();
        boolean boolean8 = startTag6.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType9 = startTag6.type;
        startTag6.selfClosing = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "StartTag" + "'", str7, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
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
        startTag2.appendAttributeValue("<<hi!>StartTag>");
        org.jsoup.nodes.Attributes attributes24 = startTag2.attributes;
        java.lang.String str25 = startTag2.tokenType();
        startTag2.appendTagName("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "StartTag" + "'", str25, "StartTag");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        boolean boolean2 = startTag1.isSelfClosing();
        boolean boolean3 = startTag1.isDoctype();
        startTag1.newAttribute();
        org.jsoup.parser.Token.Tag tag6 = startTag1.name("<<!---->>");
        tag6.appendAttributeValue('4');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype9 = tag6.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
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
        org.jsoup.nodes.Attributes attributes14 = startTag0.attributes;
        java.lang.String str15 = startTag0.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(startTag13);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<hi!>" + "'", str15, "<hi!>");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        doctype0.forceQuirks = true;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        boolean boolean7 = doctype0.isForceQuirks();
        doctype0.forceQuirks = true;
        java.lang.String str10 = doctype0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
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
        startTag11.appendTagName("<hi!<!---->>");
        startTag11.appendTagName(' ');
        java.lang.String str18 = startTag11.name();
        startTag11.appendTagName("<<!---->>4");
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "StartTag" + "'", str12, "StartTag");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "StartTag" + "'", str13, "StartTag");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "StartTag<hi!<!---->> " + "'", str18, "StartTag<hi!<!---->> ");
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isEOF();
        startTag0.appendAttributeValue("hi!");
        startTag0.appendTagName('4');
        startTag0.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag10 = startTag0.asStartTag();
        java.lang.String str11 = startTag0.toString();
        java.lang.String str12 = startTag0.name();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(startTag10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<4>" + "'", str11, "<4>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4" + "'", str12, "4");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
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
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        startTag13.appendAttributeValue('4');
        boolean boolean16 = startTag13.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType17 = startTag13.type;
        org.jsoup.nodes.Attributes attributes18 = startTag13.getAttributes();
        org.jsoup.nodes.Attributes attributes19 = startTag13.attributes;
        startTag1.attributes = attributes19;
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + tokenType17 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType17.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(attributes19);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("<!---->");
        boolean boolean3 = tag2.isCharacter();
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
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
        org.jsoup.parser.Token.TokenType tokenType20 = org.jsoup.parser.Token.TokenType.Doctype;
        comment19.type = tokenType20;
        java.lang.StringBuilder stringBuilder22 = comment19.data;
        xmlTreeBuilder14.insert(comment19);
        boolean boolean24 = comment19.isComment();
        java.lang.String str25 = comment19.tokenType();
        xmlTreeBuilder0.insert(comment19);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</<!---->>" + "'", str7, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</<!---->>" + "'", str8, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Comment" + "'", str25, "Comment");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.Token.Character character6 = new org.jsoup.parser.Token.Character("");
        java.lang.String str7 = character6.toString();
        java.lang.String str8 = character6.toString();
        boolean boolean9 = character6.isDoctype();
        xmlTreeBuilder0.insert(character6);
        org.jsoup.nodes.Attributes attributes12 = null;
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("hi!", attributes12);
        boolean boolean14 = startTag13.isComment();
        boolean boolean15 = startTag13.selfClosing;
        startTag13.newAttribute();
        java.lang.String str17 = startTag13.tagName;
        org.jsoup.nodes.Element element18 = xmlTreeBuilder0.insert(startTag13);
        org.jsoup.nodes.Attributes attributes23 = null;
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag("hi!", attributes23);
        startTag24.newAttribute();
        startTag24.tagName = "";
        org.jsoup.nodes.Attributes attributes28 = startTag24.attributes;
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag("", attributes28);
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag();
        startTag30.appendAttributeValue('4');
        boolean boolean33 = startTag30.isDoctype();
        org.jsoup.nodes.Attributes attributes34 = startTag30.attributes;
        startTag29.attributes = attributes34;
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag("<!----><<!---->>", attributes34);
        org.jsoup.parser.Token.StartTag startTag37 = new org.jsoup.parser.Token.StartTag("</</<!---->>>", attributes34);
        org.jsoup.nodes.Element element38 = xmlTreeBuilder0.insert(startTag37);
        java.lang.Class<?> wildcardClass39 = element38.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.tokenType();
        boolean boolean3 = startTag1.isComment();
        java.lang.String str4 = startTag1.toString();
        boolean boolean5 = startTag1.isComment();
        startTag1.appendAttributeName('#');
        startTag1.finaliseTag();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<<!---->>" + "'", str4, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.newAttribute();
        startTag2.tagName = "";
        boolean boolean6 = startTag2.isComment();
        startTag2.appendTagName('a');
        org.jsoup.nodes.Attributes attributes9 = startTag2.attributes;
        org.jsoup.nodes.Attributes attributes10 = startTag2.attributes;
        org.jsoup.parser.Token.StartTag startTag11 = startTag2.asStartTag();
        boolean boolean12 = startTag2.isComment();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
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
        java.lang.String str48 = tag6.name();
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
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "<<!---->>4" + "'", str48, "<<!---->>4");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.forceQuirks = false;
        java.lang.String str5 = doctype0.getName();
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag8 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
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
        boolean boolean16 = startTag0.isCharacter();
        org.jsoup.nodes.Attributes attributes18 = null;
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag("hi!", attributes18);
        boolean boolean20 = startTag19.isComment();
        boolean boolean21 = startTag19.selfClosing;
        boolean boolean22 = startTag19.isEndTag();
        startTag19.finaliseTag();
        boolean boolean24 = startTag19.selfClosing;
        org.jsoup.parser.Token.Tag tag26 = startTag19.name("EndTag");
        org.jsoup.parser.Token.Tag tag28 = startTag19.name("</<hi!>>");
        org.jsoup.parser.Token.Doctype doctype29 = new org.jsoup.parser.Token.Doctype();
        boolean boolean30 = doctype29.isForceQuirks();
        java.lang.String str31 = doctype29.getName();
        boolean boolean32 = doctype29.isCharacter();
        java.lang.StringBuilder stringBuilder33 = doctype29.publicIdentifier;
        org.jsoup.parser.Token.EndTag endTag34 = new org.jsoup.parser.Token.EndTag();
        boolean boolean35 = endTag34.selfClosing;
        org.jsoup.parser.Token.Tag tag37 = endTag34.name("<!---->");
        boolean boolean38 = tag37.isCharacter();
        tag37.appendTagName("Comment");
        org.jsoup.nodes.Attributes attributes41 = tag37.attributes;
        org.jsoup.parser.Token.TokenType tokenType42 = tag37.type;
        doctype29.type = tokenType42;
        tag28.type = tokenType42;
        startTag0.type = tokenType42;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(stringBuilder33);
        org.junit.Assert.assertEquals(stringBuilder33.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(attributes41);
        org.junit.Assert.assertTrue("'" + tokenType42 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType42.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        org.jsoup.parser.Token.TokenType tokenType2 = comment0.type;
        boolean boolean3 = comment0.isComment();
        java.lang.String str4 = comment0.getData();
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        java.lang.String str6 = comment0.toString();
        java.lang.String str7 = comment0.toString();
        org.jsoup.parser.Token.TokenType tokenType8 = comment0.type;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!---->" + "'", str7, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Comment));
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
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
        java.lang.Class<?> wildcardClass17 = startTag2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType5 = org.jsoup.parser.Token.TokenType.Doctype;
        comment4.type = tokenType5;
        startTag2.type = tokenType5;
        java.lang.String str8 = startTag2.tagName;
        startTag2.finaliseTag();
        boolean boolean10 = startTag2.isCharacter();
        boolean boolean11 = startTag2.isDoctype();
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str14 = startTag13.toString();
        boolean boolean15 = startTag13.isEndTag();
        boolean boolean16 = startTag13.isEOF();
        org.jsoup.nodes.Attributes attributes17 = startTag13.attributes;
        startTag2.attributes = attributes17;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<<!---->>" + "'", str14, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList7);
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("<!---->");
        startTag10.appendTagName("<<!---->>");
        java.lang.String str13 = startTag10.name();
        boolean boolean14 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag10);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        xmlTreeBuilder0.initialiseParse("<</</<!---->>>>", "hi!EndTag", parseErrorList17);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        xmlTreeBuilder0.initialiseParse("hi!4hi!EndTag", "hi!4hi!EndTag", parseErrorList21);
        org.jsoup.nodes.Attributes attributes24 = null;
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag("hi!", attributes24);
        boolean boolean26 = startTag25.isComment();
        org.jsoup.parser.Token.Comment comment27 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType28 = org.jsoup.parser.Token.TokenType.Doctype;
        comment27.type = tokenType28;
        startTag25.type = tokenType28;
        startTag25.appendAttributeName("hi!");
        boolean boolean33 = startTag25.isComment();
        org.jsoup.parser.Token.StartTag startTag34 = startTag25.asStartTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element35 = xmlTreeBuilder0.insert(startTag34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!----><<!---->>" + "'", str13, "<!----><<!---->>");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + tokenType28 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType28.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(startTag34);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType6 = org.jsoup.parser.Token.TokenType.Doctype;
        comment5.type = tokenType6;
        java.lang.StringBuilder stringBuilder8 = comment5.data;
        xmlTreeBuilder0.insert(comment5);
        java.lang.String str10 = comment5.getData();
        java.lang.StringBuilder stringBuilder11 = comment5.data;
        org.jsoup.parser.Token.Comment comment12 = comment5.asComment();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character13 = comment5.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertNotNull(comment12);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        java.lang.String str3 = doctype0.getSystemIdentifier();
        java.lang.String str4 = doctype0.getName();
        java.lang.String str5 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        boolean boolean7 = doctype0.isStartTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag8 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
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
        java.lang.String str20 = character18.toString();
        java.lang.String str21 = character18.toString();
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<<<!---->>>" + "'", str20, "<<<!---->>>");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<<<!---->>>" + "'", str21, "<<<!---->>>");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendTagName('4');
        org.jsoup.parser.Token.StartTag startTag6 = startTag2.asStartTag();
        java.lang.String str7 = startTag6.tokenType();
        boolean boolean8 = startTag6.isDoctype();
        org.jsoup.parser.Token.Tag tag10 = startTag6.name("hi!");
        tag10.finaliseTag();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "StartTag" + "'", str7, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.isForceQuirks();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder3 = doctype0.systemIdentifier;
        boolean boolean4 = doctype0.isStartTag();
        doctype0.forceQuirks = true;
        boolean boolean7 = doctype0.forceQuirks;
        doctype0.forceQuirks = false;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendTagName('4');
        startTag2.appendAttributeValue("<!---->");
        startTag2.appendAttributeValue("");
        startTag2.tagName = "</<!---->>";
        startTag2.newAttribute();
        startTag2.newAttribute();
        startTag2.tagName = "Comment";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        boolean boolean2 = startTag1.isSelfClosing();
        boolean boolean3 = startTag1.isDoctype();
        startTag1.newAttribute();
        startTag1.tagName = "</<!---->>";
        org.jsoup.nodes.Attributes attributes7 = startTag1.attributes;
        org.jsoup.parser.Token.Tag tag9 = startTag1.name("<<!---->>4");
        java.lang.String str10 = startTag1.name();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<<!---->>4" + "'", str10, "<<!---->>4");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
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
        boolean boolean14 = character6.isEndTag();
        java.lang.String str15 = character6.getData();
        java.lang.String str16 = character6.toString();
        java.lang.String str17 = character6.getData();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.toString();
        endTag1.appendAttributeValue("<<<hi!>>>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</<!---->>" + "'", str2, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</<!---->>" + "'", str3, "</<!---->>");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        org.jsoup.nodes.Attributes attributes4 = startTag2.attributes;
        java.lang.String str5 = startTag2.name();
        startTag2.appendAttributeName('4');
        org.jsoup.nodes.Attributes attributes8 = startTag2.getAttributes();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(attributes8);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
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
        java.lang.String str16 = character10.getData();
        java.lang.String str17 = character10.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment18 = character10.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType4 = startTag0.type;
        java.lang.String str5 = startTag0.tagName;
        boolean boolean6 = startTag0.isEndTag();
        startTag0.appendAttributeValue("");
        startTag0.tagName = "<!----><<!---->>";
        boolean boolean11 = startTag0.isCharacter();
        boolean boolean12 = startTag0.selfClosing;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.newAttribute();
        startTag2.tagName = "";
        boolean boolean6 = startTag2.isComment();
        org.jsoup.parser.Token.StartTag startTag7 = startTag2.asStartTag();
        startTag2.appendAttributeValue('4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(startTag7);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
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
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str18 = startTag17.tokenType();
        startTag17.appendAttributeValue('#');
        java.lang.String str21 = startTag17.name();
        boolean boolean22 = startTag17.isEndTag();
        boolean boolean23 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag17);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "StartTag" + "'", str18, "StartTag");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!---->" + "'", str21, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        java.lang.String str3 = startTag2.toString();
        startTag2.appendAttributeValue("<!----> ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<hi!>" + "'", str3, "<hi!>");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        org.jsoup.parser.Token.TokenType tokenType4 = doctype0.type;
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        boolean boolean8 = doctype0.isEOF();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.tokenType();
        boolean boolean3 = startTag1.selfClosing;
        java.lang.String str4 = startTag1.toString();
        org.jsoup.parser.Token.StartTag startTag5 = startTag1.asStartTag();
        startTag1.appendAttributeValue("Comment");
        startTag1.newAttribute();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<<!---->>" + "'", str4, "<<!---->>");
        org.junit.Assert.assertNotNull(startTag5);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        startTag1.appendAttributeValue('4');
        boolean boolean4 = startTag1.isEndTag();
        startTag1.appendTagName(' ');
        org.jsoup.nodes.Attributes attributes7 = startTag1.getAttributes();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("<<!----><hi!>>", attributes7);
        boolean boolean9 = startTag8.isEndTag();
        boolean boolean10 = startTag8.isComment();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendAttributeName('4');
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        startTag6.appendAttributeValue('4');
        boolean boolean9 = startTag6.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType10 = startTag6.type;
        startTag2.type = tokenType10;
        boolean boolean12 = startTag2.isSelfClosing();
        boolean boolean13 = startTag2.selfClosing;
        org.jsoup.nodes.Attributes attributes14 = startTag2.getAttributes();
        startTag2.appendAttributeValue('#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(attributes14);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<<!----><hi!>>");
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("hi!4hi!EndTag");
        boolean boolean2 = character1.isEOF();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.appendAttributeValue(' ');
        boolean boolean5 = startTag2.isSelfClosing();
        startTag2.newAttribute();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
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
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder36 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        xmlTreeBuilder36.initialiseParse("</<!---->>", "StartTag", parseErrorList39);
        org.jsoup.parser.Token.Comment comment41 = new org.jsoup.parser.Token.Comment();
        java.lang.String str42 = comment41.toString();
        xmlTreeBuilder36.insert(comment41);
        org.jsoup.parser.Token.Character character45 = new org.jsoup.parser.Token.Character("");
        java.lang.String str46 = character45.toString();
        xmlTreeBuilder36.insert(character45);
        org.jsoup.parser.Token.Character character49 = new org.jsoup.parser.Token.Character("<<!---->>");
        java.lang.String str50 = character49.toString();
        xmlTreeBuilder36.insert(character49);
        java.lang.String str52 = character49.getData();
        xmlTreeBuilder0.insert(character49);
        java.lang.String str54 = character49.getData();
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
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<!---->" + "'", str42, "<!---->");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "<<!---->>" + "'", str50, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "<<!---->>" + "'", str52, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "<<!---->>" + "'", str54, "<<!---->>");
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.appendAttributeValue(' ');
        java.lang.String str5 = startTag2.tokenType();
        java.lang.String str6 = startTag2.name();
        boolean boolean7 = startTag2.isSelfClosing();
        startTag2.appendAttributeName("<<!---->>4");
        startTag2.appendAttributeValue(' ');
        org.jsoup.parser.Token.StartTag startTag12 = startTag2.asStartTag();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(startTag12);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("<<!---->>", "<hi!>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.getData();
        boolean boolean7 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment5);
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        xmlTreeBuilder0.initialiseParse("<<!----><hi!>>", "<hi!</</<!---->>>>", parseErrorList10);
        org.jsoup.parser.Token.Doctype doctype12 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str13 = doctype12.getName();
        java.lang.StringBuilder stringBuilder14 = doctype12.name;
        java.lang.StringBuilder stringBuilder15 = doctype12.name;
        doctype12.forceQuirks = true;
        java.lang.String str18 = doctype12.getPublicIdentifier();
        java.lang.String str19 = doctype12.getPublicIdentifier();
        boolean boolean20 = doctype12.forceQuirks;
        java.lang.String str21 = doctype12.getSystemIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        endTag1.appendAttributeValue("");
        endTag1.appendAttributeValue('#');
        org.jsoup.parser.Token.TokenType tokenType6 = endTag1.type;
        boolean boolean7 = endTag1.isStartTag();
        boolean boolean8 = endTag1.isDoctype();
        endTag1.appendAttributeValue('#');
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag("hi!", attributes14);
        startTag15.newAttribute();
        startTag15.tagName = "";
        org.jsoup.nodes.Attributes attributes19 = startTag15.attributes;
        startTag12.attributes = attributes19;
        boolean boolean21 = startTag12.isDoctype();
        org.jsoup.parser.Token.StartTag startTag22 = startTag12.asStartTag();
        boolean boolean23 = startTag22.isEOF();
        boolean boolean24 = startTag22.isStartTag();
        org.jsoup.nodes.Attributes attributes25 = startTag22.attributes;
        endTag1.attributes = attributes25;
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(startTag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(attributes25);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("</hi!<!---->>");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.tokenType();
        endTag1.selfClosing = true;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</</hi!<!---->>>" + "'", str2, "</</hi!<!---->>>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EndTag" + "'", str3, "EndTag");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
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
        endTag1.tagName = "hi!<<!----><hi!>>";
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "</<!---->StartTag>" + "'", str10, "</<!---->StartTag>");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
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
        java.lang.String str20 = character1.toString();
        boolean boolean21 = character1.isCharacter();
        java.lang.String str22 = character1.getData();
        java.lang.Class<?> wildcardClass23 = character1.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isEOF();
        startTag0.appendAttributeValue("hi!");
        startTag0.appendTagName('4');
        startTag0.finaliseTag();
        boolean boolean10 = startTag0.isCharacter();
        java.lang.String str11 = startTag0.toString();
        startTag0.appendTagName("<<hi!>>");
        startTag0.appendAttributeValue('a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<4>" + "'", str11, "<4>");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isEOF();
        startTag0.appendAttributeValue("hi!");
        startTag0.appendTagName('4');
        java.lang.String str9 = startTag0.tagName;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4" + "'", str9, "4");
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("Comment");
        boolean boolean2 = character1.isEndTag();
        java.lang.String str3 = character1.getData();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Comment" + "'", str3, "Comment");
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.appendAttributeValue(' ');
        java.lang.String str5 = startTag2.tokenType();
        boolean boolean6 = startTag2.isEOF();
        startTag2.appendTagName("Comment");
        boolean boolean9 = startTag2.isEndTag();
        org.jsoup.parser.Token.Tag tag11 = startTag2.name("Comment");
        java.lang.String str12 = startTag2.name();
        startTag2.newAttribute();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Comment" + "'", str12, "Comment");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isForceQuirks();
        org.jsoup.parser.Token.TokenType tokenType5 = doctype0.type;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment6 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<<<!---->>>");
        org.jsoup.parser.Token.Tag tag3 = endTag1.name("");
        tag3.appendAttributeName('#');
        tag3.newAttribute();
        org.junit.Assert.assertNotNull(tag3);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.appendAttributeValue(' ');
        java.lang.String str5 = startTag2.tokenType();
        boolean boolean6 = startTag2.isEOF();
        startTag2.appendTagName("Comment");
        boolean boolean9 = startTag2.isEndTag();
        org.jsoup.parser.Token.Tag tag11 = startTag2.name("Comment");
        java.lang.String str12 = tag11.name();
        tag11.appendAttributeValue('#');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character15 = tag11.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Comment" + "'", str12, "Comment");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isEOF();
        startTag0.appendAttributeValue("hi!");
        startTag0.appendTagName('4');
        boolean boolean9 = startTag0.isSelfClosing();
        boolean boolean10 = startTag0.isComment();
        startTag0.appendAttributeValue(' ');
        startTag0.selfClosing = true;
        startTag0.appendAttributeName(' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        boolean boolean2 = doctype0.isDoctype();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder9 = doctype0.name;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
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
        boolean boolean11 = doctype9.forceQuirks;
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
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
        xmlTreeBuilder12.initialiseParse("</<!---->>", "</<!---->>", parseErrorList15);
        org.jsoup.parser.Token.Comment comment17 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType18 = org.jsoup.parser.Token.TokenType.Doctype;
        comment17.type = tokenType18;
        java.lang.StringBuilder stringBuilder20 = comment17.data;
        xmlTreeBuilder12.insert(comment17);
        org.jsoup.parser.Token.Comment comment22 = new org.jsoup.parser.Token.Comment();
        java.lang.String str23 = comment22.toString();
        xmlTreeBuilder12.insert(comment22);
        xmlTreeBuilder0.insert(comment22);
        org.jsoup.nodes.Attributes attributes28 = null;
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag("hi!", attributes28);
        startTag29.newAttribute();
        startTag29.tagName = "";
        org.jsoup.nodes.Attributes attributes33 = startTag29.attributes;
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag("", attributes33);
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag();
        startTag35.appendAttributeValue('4');
        boolean boolean38 = startTag35.isDoctype();
        org.jsoup.nodes.Attributes attributes39 = startTag35.attributes;
        startTag34.attributes = attributes39;
        org.jsoup.parser.Token.StartTag startTag41 = startTag34.asStartTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element42 = xmlTreeBuilder0.insert(startTag41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + tokenType18 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType18.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<!---->" + "'", str23, "<!---->");
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertNotNull(startTag41);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        org.jsoup.parser.Token.TokenType tokenType4 = doctype0.type;
        java.lang.String str5 = doctype0.getSystemIdentifier();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        boolean boolean7 = doctype0.isDoctype();
        java.lang.String str8 = doctype0.getSystemIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment9 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
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
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder13 = doctype0.systemIdentifier;
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
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
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
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        xmlTreeBuilder0.initialiseParse("EndTag", "</<!---->>", parseErrorList18);
        org.jsoup.nodes.Attributes attributes21 = null;
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag("hi!", attributes21);
        boolean boolean23 = startTag22.isComment();
        org.jsoup.nodes.Attributes attributes24 = startTag22.attributes;
        startTag22.finaliseTag();
        startTag22.appendAttributeName("<hi!>");
        startTag22.appendTagName("</</<!---->>>");
        java.lang.String str30 = startTag22.toString();
        boolean boolean31 = startTag22.isSelfClosing();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element32 = xmlTreeBuilder0.insert(startTag22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(attributes24);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<hi!</</<!---->>>>" + "'", str30, "<hi!</</<!---->>>>");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.Doctype doctype4 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(doctype4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        xmlTreeBuilder0.insert(comment5);
        java.lang.String str8 = comment5.toString();
        boolean boolean9 = comment5.isEndTag();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!---->" + "'", str8, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        boolean boolean4 = startTag2.selfClosing;
        boolean boolean5 = startTag2.isEndTag();
        startTag2.appendAttributeValue('4');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character8 = startTag2.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag0.name("<!---->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype3 = startTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag2);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "<hi!>", parseErrorList7);
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->StartTag>", parseErrorList11);
        org.jsoup.parser.Token.Comment comment13 = new org.jsoup.parser.Token.Comment();
        boolean boolean14 = comment13.isStartTag();
        org.jsoup.parser.Token.Comment comment15 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType16 = org.jsoup.parser.Token.TokenType.Doctype;
        comment15.type = tokenType16;
        comment13.type = tokenType16;
        boolean boolean19 = comment13.isStartTag();
        java.lang.String str20 = comment13.toString();
        xmlTreeBuilder0.insert(comment13);
        java.lang.StringBuilder stringBuilder22 = comment13.data;
        java.lang.String str23 = comment13.getData();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!---->" + "'", str20, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isEOF();
        startTag0.appendAttributeValue("hi!");
        startTag0.appendTagName('4');
        boolean boolean9 = startTag0.isSelfClosing();
        boolean boolean10 = startTag0.isComment();
        org.jsoup.nodes.Attributes attributes12 = null;
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("hi!", attributes12);
        boolean boolean14 = startTag13.isComment();
        startTag13.appendAttributeName('4');
        java.lang.String str17 = startTag13.tokenType();
        org.jsoup.nodes.Attributes attributes19 = null;
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag("hi!", attributes19);
        startTag20.appendAttributeValue(' ');
        java.lang.String str23 = startTag20.tokenType();
        java.lang.String str24 = startTag20.name();
        startTag20.appendTagName("<!---->");
        startTag20.tagName = "StartTag";
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag();
        startTag29.selfClosing = false;
        startTag29.appendTagName("hi!");
        org.jsoup.nodes.Attributes attributes34 = startTag29.getAttributes();
        startTag20.attributes = attributes34;
        startTag13.attributes = attributes34;
        java.lang.String str37 = startTag13.toString();
        org.jsoup.parser.Token.EndTag endTag38 = new org.jsoup.parser.Token.EndTag();
        boolean boolean39 = endTag38.selfClosing;
        endTag38.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes42 = endTag38.getAttributes();
        boolean boolean43 = endTag38.isSelfClosing();
        boolean boolean44 = endTag38.isCharacter();
        org.jsoup.parser.Token.StartTag startTag46 = new org.jsoup.parser.Token.StartTag("");
        startTag46.appendTagName('a');
        org.jsoup.nodes.Attributes attributes49 = startTag46.getAttributes();
        endTag38.attributes = attributes49;
        startTag13.attributes = attributes49;
        startTag0.attributes = attributes49;
        boolean boolean53 = startTag0.selfClosing;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "StartTag" + "'", str17, "StartTag");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "StartTag" + "'", str23, "StartTag");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<hi!>" + "'", str37, "<hi!>");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(attributes42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(attributes49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
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
        java.lang.String str13 = comment10.toString();
        java.lang.StringBuilder stringBuilder14 = comment10.data;
        boolean boolean15 = comment10.isDoctype();
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        boolean boolean2 = startTag1.isSelfClosing();
        boolean boolean3 = startTag1.isDoctype();
        startTag1.newAttribute();
        org.jsoup.parser.Token.Tag tag6 = startTag1.name("<<!---->>");
        boolean boolean7 = tag6.isCharacter();
        tag6.appendAttributeValue('#');
        tag6.appendTagName('4');
        boolean boolean12 = tag6.isSelfClosing();
        tag6.appendAttributeName("<hi!<!---->>");
        boolean boolean15 = tag6.isStartTag();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<<!---->>");
        startTag1.newAttribute();
        startTag1.appendAttributeName("hi!EndTag");
        boolean boolean5 = startTag1.isCharacter();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendTagName('4');
        startTag2.appendAttributeValue("<!---->");
        startTag2.appendAttributeValue("");
        boolean boolean10 = startTag2.isDoctype();
        org.jsoup.nodes.Attributes attributes11 = startTag2.getAttributes();
        org.jsoup.parser.Token.Tag tag13 = startTag2.name("</<hi!>>");
        boolean boolean14 = tag13.selfClosing;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(attributes11);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendTagName('4');
        org.jsoup.parser.Token.StartTag startTag6 = startTag2.asStartTag();
        java.lang.String str7 = startTag6.tokenType();
        boolean boolean8 = startTag6.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType9 = startTag6.type;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype10 = startTag6.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "StartTag" + "'", str7, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        boolean boolean4 = startTag0.isCharacter();
        startTag0.finaliseTag();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        boolean boolean4 = startTag2.selfClosing;
        startTag2.newAttribute();
        org.jsoup.nodes.Attributes attributes6 = startTag2.getAttributes();
        org.jsoup.nodes.Attributes attributes7 = startTag2.getAttributes();
        boolean boolean8 = startTag2.selfClosing;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
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
        java.lang.StringBuilder stringBuilder11 = doctype0.publicIdentifier;
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
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType3 = org.jsoup.parser.Token.TokenType.EOF;
        doctype0.type = tokenType3;
        doctype0.forceQuirks = false;
        boolean boolean7 = doctype0.isComment();
        java.lang.String str8 = doctype0.getName();
        java.lang.String str9 = doctype0.getName();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        startTag10.appendAttributeValue('4');
        org.jsoup.nodes.Attributes attributes13 = startTag10.attributes;
        boolean boolean14 = startTag10.isEOF();
        boolean boolean15 = startTag10.isSelfClosing();
        org.jsoup.parser.Token.EndTag endTag17 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag17.appendAttributeValue('#');
        endTag17.finaliseTag();
        endTag17.appendTagName("StartTag");
        endTag17.newAttribute();
        org.jsoup.parser.Token.TokenType tokenType24 = endTag17.type;
        startTag10.type = tokenType24;
        doctype0.type = tokenType24;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + tokenType24 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType24.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("");
        java.lang.String str2 = character1.toString();
        java.lang.String str3 = character1.getData();
        java.lang.String str4 = character1.toString();
        java.lang.String str5 = character1.toString();
        java.lang.String str6 = character1.getData();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isEOF();
        startTag0.appendAttributeValue("hi!");
        startTag0.appendTagName('4');
        boolean boolean9 = startTag0.isEndTag();
        startTag0.appendAttributeName('#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType5 = org.jsoup.parser.Token.TokenType.Doctype;
        comment4.type = tokenType5;
        startTag2.type = tokenType5;
        java.lang.String str8 = startTag2.tagName;
        org.jsoup.parser.Token.Tag tag10 = startTag2.name("<!----><<!---->>");
        boolean boolean11 = startTag2.isDoctype();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType4 = startTag0.type;
        startTag0.tagName = "<!---->";
        startTag0.appendTagName('4');
        boolean boolean9 = startTag0.isCharacter();
        startTag0.appendTagName("</<hi!>>");
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        startTag12.appendAttributeValue('4');
        boolean boolean15 = startTag12.isEndTag();
        boolean boolean16 = startTag12.isEOF();
        startTag12.appendAttributeValue("hi!");
        startTag12.appendTagName('4');
        boolean boolean21 = startTag12.isSelfClosing();
        org.jsoup.parser.Token.Tag tag23 = startTag12.name("hi!");
        boolean boolean24 = startTag12.isComment();
        org.jsoup.parser.Token.StartTag startTag25 = startTag12.asStartTag();
        org.jsoup.nodes.Attributes attributes26 = startTag12.attributes;
        startTag0.attributes = attributes26;
        startTag0.appendTagName("hi!EndTag");
        startTag0.appendTagName("a");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(startTag25);
        org.junit.Assert.assertNotNull(attributes26);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("hi!", attributes3);
        startTag4.newAttribute();
        startTag4.tagName = "";
        org.jsoup.nodes.Attributes attributes8 = startTag4.attributes;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("", attributes8);
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("<<!---->>", attributes8);
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
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
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        startTag27.appendAttributeValue('4');
        boolean boolean30 = startTag27.isEndTag();
        boolean boolean31 = startTag27.isEOF();
        startTag27.appendAttributeValue("hi!");
        startTag27.appendTagName('4');
        boolean boolean36 = startTag27.isSelfClosing();
        boolean boolean37 = startTag27.isComment();
        org.jsoup.nodes.Element element38 = xmlTreeBuilder0.insert(startTag27);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder39 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        xmlTreeBuilder39.initialiseParse("</<!---->>", "</<!---->>", parseErrorList42);
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        xmlTreeBuilder39.initialiseParse("StartTag", "<!---->", parseErrorList46);
        org.jsoup.parser.Token.Comment comment48 = new org.jsoup.parser.Token.Comment();
        java.lang.String str49 = comment48.getData();
        xmlTreeBuilder39.insert(comment48);
        org.jsoup.parser.Token.Comment comment51 = new org.jsoup.parser.Token.Comment();
        java.lang.String str52 = comment51.toString();
        boolean boolean53 = comment51.isEndTag();
        xmlTreeBuilder39.insert(comment51);
        org.jsoup.parser.Token.Character character56 = new org.jsoup.parser.Token.Character("hi!");
        java.lang.String str57 = character56.getData();
        java.lang.String str58 = character56.toString();
        xmlTreeBuilder39.insert(character56);
        xmlTreeBuilder0.insert(character56);
        org.jsoup.parser.Token.StartTag startTag62 = new org.jsoup.parser.Token.StartTag();
        startTag62.appendAttributeValue('4');
        boolean boolean65 = startTag62.isEndTag();
        startTag62.newAttribute();
        org.jsoup.parser.Token.StartTag startTag67 = new org.jsoup.parser.Token.StartTag();
        startTag67.appendAttributeValue('4');
        org.jsoup.nodes.Attributes attributes70 = startTag67.attributes;
        startTag62.attributes = attributes70;
        org.jsoup.parser.Token.StartTag startTag72 = new org.jsoup.parser.Token.StartTag("<<hi!>StartTag>", attributes70);
        boolean boolean73 = startTag72.isEOF();
        startTag72.appendAttributeValue("<<<!---->>>");
        org.jsoup.nodes.Attributes attributes76 = startTag72.attributes;
        boolean boolean77 = startTag72.isSelfClosing();
        boolean boolean78 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag72);
        org.jsoup.parser.Token.Doctype doctype79 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str80 = doctype79.getPublicIdentifier();
        boolean boolean81 = doctype79.forceQuirks;
        java.lang.StringBuilder stringBuilder82 = doctype79.publicIdentifier;
        java.lang.StringBuilder stringBuilder83 = doctype79.systemIdentifier;
        doctype79.forceQuirks = true;
        doctype79.forceQuirks = false;
        boolean boolean88 = doctype79.isForceQuirks();
        doctype79.forceQuirks = true;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "<!---->" + "'", str52, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(attributes70);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(attributes76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(stringBuilder82);
        org.junit.Assert.assertEquals(stringBuilder82.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder83);
        org.junit.Assert.assertEquals(stringBuilder83.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.tokenType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character3 = startTag1.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.tokenType();
        boolean boolean3 = startTag1.isSelfClosing();
        startTag1.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag5 = startTag1.asStartTag();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(startTag5);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.Doctype doctype4 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(doctype4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        endTag1.appendTagName("StartTag");
        org.jsoup.nodes.Attributes attributes7 = endTag1.attributes;
        endTag1.appendAttributeName('4');
        java.lang.String str10 = endTag1.toString();
        endTag1.tagName = "<4>";
        java.lang.String str13 = endTag1.tokenType();
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "</<!---->StartTag>" + "'", str10, "</<!---->StartTag>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EndTag" + "'", str13, "EndTag");
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
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
        org.jsoup.parser.Token.StartTag startTag20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element21 = xmlTreeBuilder0.insert(startTag20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("");
        boolean boolean2 = character1.isEndTag();
        java.lang.String str3 = character1.toString();
        java.lang.String str4 = character1.getData();
        java.lang.String str5 = character1.toString();
        java.lang.String str6 = character1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
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
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag("</<!---->StartTag>", attributes18);
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag("</</<!---->>>", attributes18);
        java.lang.String str22 = startTag21.tagName;
        startTag21.tagName = "</<<<!---->>>>";
        boolean boolean25 = startTag21.isDoctype();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "</</<!---->>>" + "'", str22, "</</<!---->>>");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
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
        org.jsoup.parser.Token.StartTag startTag68 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes70 = null;
        org.jsoup.parser.Token.StartTag startTag71 = new org.jsoup.parser.Token.StartTag("hi!", attributes70);
        startTag71.newAttribute();
        startTag71.tagName = "";
        org.jsoup.nodes.Attributes attributes75 = startTag71.attributes;
        startTag68.attributes = attributes75;
        boolean boolean77 = startTag68.isDoctype();
        org.jsoup.parser.Token.StartTag startTag78 = startTag68.asStartTag();
        boolean boolean79 = startTag78.isEOF();
        startTag78.selfClosing = true;
        org.jsoup.parser.Token.Tag tag83 = startTag78.name("hi!");
        org.jsoup.nodes.Element element84 = xmlTreeBuilder0.insert(startTag78);
        startTag78.appendTagName('a');
        boolean boolean87 = startTag78.isCharacter();
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
        org.junit.Assert.assertNotNull(attributes75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(startTag78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(tag83);
        org.junit.Assert.assertNotNull(element84);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        org.jsoup.nodes.Attributes attributes3 = startTag2.attributes;
        boolean boolean4 = startTag2.isComment();
        boolean boolean5 = startTag2.isEndTag();
        boolean boolean6 = startTag2.isSelfClosing();
        startTag2.appendAttributeValue("</hi!<!---->>");
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
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
        org.jsoup.parser.Token.Comment comment31 = new org.jsoup.parser.Token.Comment();
        boolean boolean32 = comment31.isStartTag();
        java.lang.String str33 = comment31.toString();
        java.lang.String str34 = comment31.getData();
        java.lang.StringBuilder stringBuilder35 = comment31.data;
        java.lang.String str36 = comment31.getData();
        java.lang.String str37 = comment31.toString();
        java.lang.String str38 = comment31.tokenType();
        xmlTreeBuilder0.insert(comment31);
        org.jsoup.parser.Token.Character character41 = new org.jsoup.parser.Token.Character("hi!<!---->");
        xmlTreeBuilder0.insert(character41);
        org.jsoup.nodes.Attributes attributes44 = null;
        org.jsoup.parser.Token.StartTag startTag45 = new org.jsoup.parser.Token.StartTag("hi!", attributes44);
        boolean boolean46 = startTag45.isComment();
        boolean boolean47 = startTag45.selfClosing;
        boolean boolean48 = startTag45.isEndTag();
        org.jsoup.nodes.Attributes attributes49 = startTag45.attributes;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean50 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!---->" + "'", str15, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!---->" + "'", str19, "<!---->");
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!---->" + "'", str33, "<!---->");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(stringBuilder35);
        org.junit.Assert.assertEquals(stringBuilder35.toString(), "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<!---->" + "'", str37, "<!---->");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Comment" + "'", str38, "Comment");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(attributes49);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        endTag1.tagName = "</</<!---->>>";
        org.jsoup.nodes.Attributes attributes7 = endTag1.getAttributes();
        boolean boolean8 = endTag1.selfClosing;
        org.jsoup.parser.Token.Tag tag10 = endTag1.name("</<!---->StartTag<!----><<!---->>>");
        java.lang.String str11 = endTag1.toString();
        boolean boolean12 = endTag1.selfClosing;
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "</</<!---->StartTag<!----><<!---->>>>" + "'", str11, "</</<!---->StartTag<!----><<!---->>>>");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
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
        org.jsoup.parser.Token.StartTag startTag12 = startTag2.asStartTag();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(startTag12);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.forceQuirks;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag8 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.toString();
        boolean boolean3 = startTag1.isComment();
        java.lang.String str4 = startTag1.tokenType();
        org.jsoup.parser.Token.Tag tag6 = startTag1.name("hi!<<!----><hi!>>");
        startTag1.appendAttributeValue("</hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<<!---->>" + "'", str2, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "StartTag" + "'", str4, "StartTag");
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("");
        java.lang.String str2 = character1.getData();
        org.jsoup.parser.Token.Character character3 = character1.asCharacter();
        java.lang.String str4 = character1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(character3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.appendAttributeValue(' ');
        java.lang.String str5 = startTag2.tokenType();
        java.lang.String str6 = startTag2.name();
        startTag2.appendTagName("<!---->");
        java.lang.String str9 = startTag2.name();
        startTag2.appendAttributeValue('#');
        boolean boolean12 = startTag2.isEOF();
        boolean boolean13 = startTag2.isStartTag();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!<!---->" + "'", str9, "hi!<!---->");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        org.jsoup.nodes.Attributes attributes4 = startTag2.attributes;
        startTag2.finaliseTag();
        startTag2.appendAttributeName("<hi!>");
        startTag2.appendTagName("</</<!---->>>");
        java.lang.String str10 = startTag2.toString();
        boolean boolean11 = startTag2.isSelfClosing();
        boolean boolean12 = startTag2.isDoctype();
        startTag2.appendAttributeValue("<hi!>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<hi!</</<!---->>>>" + "'", str10, "<hi!</</<!---->>>>");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!----><<!---->>");
        endTag1.appendTagName('a');
        boolean boolean4 = endTag1.isEndTag();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.toString();
        boolean boolean3 = startTag1.isEndTag();
        startTag1.appendAttributeName("hi!EndTag");
        startTag1.appendTagName("<!----><<!---->>");
        boolean boolean8 = startTag1.isStartTag();
        java.lang.String str9 = startTag1.tokenType();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<<!---->>" + "'", str2, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "StartTag" + "'", str9, "StartTag");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.selfClosing = false;
        startTag0.appendTagName("hi!");
        org.jsoup.nodes.Attributes attributes5 = startTag0.getAttributes();
        java.lang.String str6 = startTag0.name();
        java.lang.String str7 = startTag0.tokenType();
        org.jsoup.nodes.Attributes attributes8 = startTag0.getAttributes();
        org.jsoup.parser.Token.Tag tag10 = startTag0.name("<<!----><hi!>>");
        tag10.finaliseTag();
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "StartTag" + "'", str7, "StartTag");
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
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
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        xmlTreeBuilder15.initialiseParse("</<!---->>", "StartTag", parseErrorList18);
        org.jsoup.parser.Token.Comment comment20 = new org.jsoup.parser.Token.Comment();
        java.lang.String str21 = comment20.toString();
        xmlTreeBuilder15.insert(comment20);
        org.jsoup.parser.Token.Character character24 = new org.jsoup.parser.Token.Character("");
        java.lang.String str25 = character24.toString();
        xmlTreeBuilder15.insert(character24);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder27 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        xmlTreeBuilder27.initialiseParse("", "<<!---->>", parseErrorList30);
        org.jsoup.parser.Token.Comment comment32 = new org.jsoup.parser.Token.Comment();
        boolean boolean33 = comment32.isStartTag();
        org.jsoup.parser.Token.Comment comment34 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType35 = org.jsoup.parser.Token.TokenType.Doctype;
        comment34.type = tokenType35;
        comment32.type = tokenType35;
        boolean boolean38 = comment32.isStartTag();
        java.lang.String str39 = comment32.getData();
        xmlTreeBuilder27.insert(comment32);
        xmlTreeBuilder15.insert(comment32);
        xmlTreeBuilder0.insert(comment32);
        java.lang.String str43 = comment32.getData();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!---->" + "'", str12, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!---->" + "'", str21, "<!---->");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + tokenType35 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType35.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendAttributeName('4');
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        startTag6.appendAttributeValue('4');
        boolean boolean9 = startTag6.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType10 = startTag6.type;
        startTag2.type = tokenType10;
        boolean boolean12 = startTag2.isSelfClosing();
        startTag2.appendTagName("</</<!---->>>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType3 = org.jsoup.parser.Token.TokenType.EOF;
        doctype0.type = tokenType3;
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.EndTag endTag8 = new org.jsoup.parser.Token.EndTag("</<!---->>");
        java.lang.String str9 = endTag8.toString();
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        startTag11.appendAttributeValue('4');
        boolean boolean14 = startTag11.isEndTag();
        startTag11.newAttribute();
        boolean boolean16 = startTag11.isComment();
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes20 = null;
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag("hi!", attributes20);
        startTag21.newAttribute();
        startTag21.tagName = "";
        org.jsoup.nodes.Attributes attributes25 = startTag21.attributes;
        startTag18.attributes = attributes25;
        startTag11.attributes = attributes25;
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag("<!---->", attributes25);
        endTag8.attributes = attributes25;
        endTag8.appendAttributeName("<!---->");
        org.jsoup.parser.Token.Comment comment32 = new org.jsoup.parser.Token.Comment();
        boolean boolean33 = comment32.isStartTag();
        org.jsoup.parser.Token.Comment comment34 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType35 = org.jsoup.parser.Token.TokenType.Doctype;
        comment34.type = tokenType35;
        comment32.type = tokenType35;
        boolean boolean38 = comment32.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType39 = comment32.type;
        endTag8.type = tokenType39;
        doctype0.type = tokenType39;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "</</<!---->>>" + "'", str9, "</</<!---->>>");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + tokenType35 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType35.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + tokenType39 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType39.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType6 = org.jsoup.parser.Token.TokenType.Doctype;
        comment5.type = tokenType6;
        java.lang.StringBuilder stringBuilder8 = comment5.data;
        xmlTreeBuilder0.insert(comment5);
        java.lang.String str10 = comment5.getData();
        java.lang.String str11 = comment5.toString();
        java.lang.StringBuilder stringBuilder12 = comment5.data;
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        doctype0.forceQuirks = true;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        java.lang.String str7 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder9 = doctype0.name;
        java.lang.String str10 = doctype0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        java.lang.StringBuilder stringBuilder2 = comment0.data;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        boolean boolean4 = comment0.isEndTag();
        java.lang.String str5 = comment0.getData();
        org.jsoup.parser.Token.TokenType tokenType6 = comment0.type;
        java.lang.String str7 = comment0.tokenType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Comment" + "'", str7, "Comment");
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
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
        java.lang.String str39 = startTag35.tokenType();
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "StartTag" + "'", str39, "StartTag");
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.CommentEndDash;
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
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        boolean boolean2 = doctype0.forceQuirks;
        boolean boolean3 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        java.lang.String str5 = doctype0.getSystemIdentifier();
        java.lang.String str6 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.newAttribute();
        startTag2.tagName = "";
        boolean boolean6 = startTag2.isComment();
        org.jsoup.parser.Token.StartTag startTag7 = startTag2.asStartTag();
        startTag2.appendAttributeValue(' ');
        startTag2.newAttribute();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(startTag7);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        boolean boolean2 = startTag1.isSelfClosing();
        boolean boolean3 = startTag1.isDoctype();
        startTag1.newAttribute();
        org.jsoup.parser.Token.Tag tag6 = startTag1.name("<<!---->>");
        tag6.appendTagName('a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        startTag0.appendTagName(' ');
        org.jsoup.nodes.Attributes attributes6 = startTag0.getAttributes();
        java.lang.String str7 = startTag0.tagName;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        doctype0.forceQuirks = true;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        java.lang.String str7 = doctype0.getPublicIdentifier();
        boolean boolean8 = doctype0.forceQuirks;
        boolean boolean9 = doctype0.forceQuirks;
        doctype0.forceQuirks = false;
        java.lang.String str12 = doctype0.getName();
        java.lang.StringBuilder stringBuilder13 = doctype0.systemIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isForceQuirks();
        doctype0.forceQuirks = false;
        boolean boolean6 = doctype0.forceQuirks;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getName();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.isForceQuirks();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        org.jsoup.nodes.Attributes attributes4 = startTag2.attributes;
        startTag2.finaliseTag();
        startTag2.appendAttributeName("<hi!>");
        startTag2.appendTagName("</</<!---->>>");
        java.lang.String str10 = startTag2.toString();
        startTag2.tagName = "<hi!>";
        java.lang.String str13 = startTag2.toString();
        startTag2.appendAttributeName("</<!---->StartTag>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<hi!</</<!---->>>>" + "'", str10, "<hi!</</<!---->>>>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<<hi!>>" + "'", str13, "<<hi!>>");
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        startTag0.appendTagName("StartTag");
        org.jsoup.parser.Token.TokenType tokenType6 = startTag0.type;
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str9 = startTag8.tokenType();
        boolean boolean10 = startTag8.isSelfClosing();
        startTag8.finaliseTag();
        java.lang.String str12 = startTag8.tagName;
        boolean boolean13 = startTag8.isEndTag();
        boolean boolean14 = startTag8.isComment();
        boolean boolean15 = startTag8.isEOF();
        org.jsoup.nodes.Attributes attributes16 = startTag8.getAttributes();
        startTag0.attributes = attributes16;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "StartTag" + "'", str9, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!---->" + "'", str12, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.String str3 = doctype0.getName();
        org.jsoup.parser.Token.Doctype doctype4 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str5 = doctype4.getPublicIdentifier();
        java.lang.String str6 = doctype4.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType7 = org.jsoup.parser.Token.TokenType.EOF;
        doctype4.type = tokenType7;
        doctype0.type = tokenType7;
        doctype0.forceQuirks = false;
        doctype0.forceQuirks = false;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.EOF));
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
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
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag("<!---->");
        boolean boolean37 = startTag36.isSelfClosing();
        boolean boolean38 = startTag36.isDoctype();
        boolean boolean39 = startTag36.isSelfClosing();
        org.jsoup.nodes.Element element40 = xmlTreeBuilder0.insert(startTag36);
        org.jsoup.parser.ParseErrorList parseErrorList43 = null;
        xmlTreeBuilder0.initialiseParse("<!----><<!---->>", "<</</<!---->>>>", parseErrorList43);
        org.jsoup.parser.Token.Doctype doctype45 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str46 = doctype45.getName();
        java.lang.StringBuilder stringBuilder47 = doctype45.name;
        java.lang.StringBuilder stringBuilder48 = doctype45.name;
        doctype45.forceQuirks = true;
        java.lang.String str51 = doctype45.getPublicIdentifier();
        boolean boolean52 = doctype45.isForceQuirks();
        doctype45.forceQuirks = false;
        boolean boolean55 = doctype45.forceQuirks;
        java.lang.StringBuilder stringBuilder56 = doctype45.publicIdentifier;
        java.lang.String str57 = doctype45.getSystemIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "StartTag" + "'", str31, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(stringBuilder47);
        org.junit.Assert.assertEquals(stringBuilder47.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder48);
        org.junit.Assert.assertEquals(stringBuilder48.toString(), "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(stringBuilder56);
        org.junit.Assert.assertEquals(stringBuilder56.toString(), "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("</</</<!---->>>>", attributes1);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag27 = startTag26.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</<!---->>" + "'", str3, "</<!---->>");
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(attributes21);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
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
        xmlTreeBuilder0.initialiseParse("<!---->", "<hi!</</<!---->>>>", parseErrorList20);
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        xmlTreeBuilder0.initialiseParse("<!----> ", "hi!EndTag", parseErrorList24);
        org.jsoup.parser.Token.Doctype doctype26 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str27 = doctype26.getName();
        boolean boolean28 = doctype26.isDoctype();
        doctype26.forceQuirks = true;
        java.lang.StringBuilder stringBuilder31 = doctype26.systemIdentifier;
        java.lang.String str32 = doctype26.getPublicIdentifier();
        boolean boolean33 = doctype26.forceQuirks;
        java.lang.StringBuilder stringBuilder34 = doctype26.systemIdentifier;
        boolean boolean35 = doctype26.isEOF();
        java.lang.StringBuilder stringBuilder36 = doctype26.publicIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(stringBuilder31);
        org.junit.Assert.assertEquals(stringBuilder31.toString(), "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(stringBuilder36);
        org.junit.Assert.assertEquals(stringBuilder36.toString(), "");
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        org.jsoup.nodes.Attributes attributes4 = startTag2.attributes;
        startTag2.finaliseTag();
        startTag2.appendAttributeName("<hi!>");
        startTag2.appendTagName("</</<!---->>>");
        startTag2.appendTagName("<!---->StartTag");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(attributes4);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag();
        startTag2.appendAttributeValue('4');
        boolean boolean5 = startTag2.isEndTag();
        startTag2.appendTagName(' ');
        org.jsoup.nodes.Attributes attributes8 = startTag2.getAttributes();
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("<<!----><hi!>>", attributes8);
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("<hi!<!---->>", attributes8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        org.jsoup.nodes.Attributes attributes2 = endTag1.attributes;
        endTag1.tagName = "</</<!---->StartTag<!----><<!---->>>>";
        org.junit.Assert.assertNull(attributes2);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
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
        org.jsoup.parser.ParseErrorList parseErrorList47 = null;
        xmlTreeBuilder0.initialiseParse("<!----><<!---->>", "<hi!<!---->>", parseErrorList47);
        org.jsoup.parser.Token.Doctype doctype49 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str50 = doctype49.getName();
        java.lang.StringBuilder stringBuilder51 = doctype49.name;
        java.lang.StringBuilder stringBuilder52 = doctype49.name;
        doctype49.forceQuirks = true;
        java.lang.String str55 = doctype49.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder56 = doctype49.systemIdentifier;
        java.lang.String str57 = doctype49.getPublicIdentifier();
        doctype49.forceQuirks = true;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean60 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype49);
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
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(stringBuilder51);
        org.junit.Assert.assertEquals(stringBuilder51.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder52);
        org.junit.Assert.assertEquals(stringBuilder52.toString(), "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(stringBuilder56);
        org.junit.Assert.assertEquals(stringBuilder56.toString(), "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("</hi!EndTag>");
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        startTag0.newAttribute();
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        startTag5.appendAttributeValue('4');
        org.jsoup.nodes.Attributes attributes8 = startTag5.attributes;
        startTag0.attributes = attributes8;
        java.lang.String str10 = startTag0.tagName;
        startTag0.newAttribute();
        startTag0.finaliseTag();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.Token.Character character6 = new org.jsoup.parser.Token.Character("");
        java.lang.String str7 = character6.toString();
        java.lang.String str8 = character6.toString();
        boolean boolean9 = character6.isDoctype();
        xmlTreeBuilder0.insert(character6);
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        xmlTreeBuilder0.initialiseParse("</EndTag>", "</EndTag>", parseErrorList13);
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag("<4>");
        org.jsoup.nodes.Element element17 = xmlTreeBuilder0.insert(startTag16);
        java.lang.String str18 = startTag16.name();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character19 = startTag16.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<4>" + "'", str18, "<4>");
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        org.jsoup.parser.Token.TokenType tokenType3 = startTag2.type;
        startTag2.finaliseTag();
        java.lang.String str5 = startTag2.toString();
        startTag2.selfClosing = false;
        startTag2.appendAttributeValue(' ');
        startTag2.appendTagName("");
        java.lang.String str12 = startTag2.name();
        startTag2.selfClosing = false;
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<hi!>" + "'", str5, "<hi!>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        doctype0.forceQuirks = true;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag9 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isEOF();
        startTag0.appendAttributeValue("hi!");
        startTag0.appendTagName('4');
        boolean boolean9 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag11 = startTag0.name("hi!");
        boolean boolean12 = startTag0.isComment();
        java.lang.String str13 = startTag0.toString();
        boolean boolean14 = startTag0.isEndTag();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<hi!>" + "'", str13, "<hi!>");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<<hi!>StartTag>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character2 = endTag1.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        startTag0.newAttribute();
        boolean boolean5 = startTag0.isComment();
        boolean boolean6 = startTag0.selfClosing;
        boolean boolean7 = startTag0.selfClosing;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag8 = startTag0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
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
        boolean boolean17 = startTag0.isSelfClosing();
        boolean boolean18 = startTag0.isSelfClosing();
        boolean boolean19 = startTag0.isDoctype();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(attributes16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.appendAttributeValue(' ');
        java.lang.String str5 = startTag2.tokenType();
        boolean boolean6 = startTag2.isEOF();
        startTag2.appendTagName("Comment");
        java.lang.String str9 = startTag2.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<hi!Comment>" + "'", str9, "<hi!Comment>");
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        startTag1.appendTagName("<<!---->>");
        java.lang.String str4 = startTag1.tokenType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag5 = startTag1.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "StartTag" + "'", str4, "StartTag");
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        org.jsoup.parser.Token.TokenType tokenType3 = startTag2.type;
        startTag2.selfClosing = true;
        startTag2.selfClosing = true;
        java.lang.String str8 = startTag2.toString();
        org.jsoup.parser.Token.TokenType tokenType9 = startTag2.type;
        org.jsoup.nodes.Attributes attributes10 = startTag2.attributes;
        startTag2.appendTagName("<hi!>");
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<hi!>" + "'", str8, "<hi!>");
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(attributes10);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder3 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder4 = doctype0.name;
        doctype0.forceQuirks = true;
        java.lang.String str7 = doctype0.getPublicIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag8 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendAttributeName("StartTag");
        startTag2.appendAttributeName("");
        startTag2.appendAttributeName('#');
        org.jsoup.parser.Token.Tag tag11 = startTag2.name("<!---->");
        startTag2.appendTagName(' ');
        java.lang.String str14 = startTag2.tagName;
        org.jsoup.parser.Token.TokenType tokenType15 = startTag2.type;
        boolean boolean16 = startTag2.isComment();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!----> " + "'", str14, "<!----> ");
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        xmlTreeBuilder0.initialiseParse("</</<!---->>>", "</<hi!>>", parseErrorList10);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder12.initialiseParse("</<!---->>", "</<!---->>", parseErrorList15);
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        xmlTreeBuilder12.initialiseParse("StartTag", "<!---->", parseErrorList19);
        org.jsoup.parser.Token.Comment comment21 = new org.jsoup.parser.Token.Comment();
        java.lang.String str22 = comment21.getData();
        xmlTreeBuilder12.insert(comment21);
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag();
        startTag24.appendAttributeValue('4');
        boolean boolean27 = startTag24.isEndTag();
        boolean boolean28 = startTag24.isEOF();
        startTag24.appendAttributeValue("hi!");
        startTag24.appendTagName('4');
        boolean boolean33 = startTag24.isSelfClosing();
        org.jsoup.parser.Token.Tag tag35 = startTag24.name("hi!");
        startTag24.appendAttributeValue("<!----><<!---->>");
        org.jsoup.nodes.Element element38 = xmlTreeBuilder12.insert(startTag24);
        org.jsoup.nodes.Element element39 = xmlTreeBuilder0.insert(startTag24);
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag();
        startTag40.appendAttributeValue('4');
        boolean boolean43 = startTag40.isEndTag();
        boolean boolean44 = startTag40.isEOF();
        startTag40.appendAttributeValue("hi!");
        startTag40.appendTagName('4');
        boolean boolean49 = startTag40.isComment();
        startTag40.appendAttributeName("<!---->");
        org.jsoup.nodes.Element element52 = xmlTreeBuilder0.insert(startTag40);
        org.jsoup.nodes.Attributes attributes54 = null;
        org.jsoup.parser.Token.StartTag startTag55 = new org.jsoup.parser.Token.StartTag("hi!", attributes54);
        boolean boolean56 = startTag55.isComment();
        boolean boolean57 = startTag55.selfClosing;
        boolean boolean58 = startTag55.isEndTag();
        startTag55.finaliseTag();
        boolean boolean60 = startTag55.selfClosing;
        org.jsoup.parser.Token.Tag tag62 = startTag55.name("EndTag");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element63 = xmlTreeBuilder0.insert(startTag55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(tag62);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        xmlTreeBuilder0.initialiseParse("</</<!---->>>", "</<hi!>>", parseErrorList10);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder12.initialiseParse("</<!---->>", "</<!---->>", parseErrorList15);
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        xmlTreeBuilder12.initialiseParse("StartTag", "<!---->", parseErrorList19);
        org.jsoup.parser.Token.Comment comment21 = new org.jsoup.parser.Token.Comment();
        java.lang.String str22 = comment21.getData();
        xmlTreeBuilder12.insert(comment21);
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag();
        startTag24.appendAttributeValue('4');
        boolean boolean27 = startTag24.isEndTag();
        boolean boolean28 = startTag24.isEOF();
        startTag24.appendAttributeValue("hi!");
        startTag24.appendTagName('4');
        boolean boolean33 = startTag24.isSelfClosing();
        org.jsoup.parser.Token.Tag tag35 = startTag24.name("hi!");
        startTag24.appendAttributeValue("<!----><<!---->>");
        org.jsoup.nodes.Element element38 = xmlTreeBuilder12.insert(startTag24);
        org.jsoup.nodes.Element element39 = xmlTreeBuilder0.insert(startTag24);
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag();
        startTag40.appendAttributeValue('4');
        boolean boolean43 = startTag40.isEndTag();
        boolean boolean44 = startTag40.isEOF();
        startTag40.appendAttributeValue("hi!");
        startTag40.appendTagName('4');
        boolean boolean49 = startTag40.isComment();
        startTag40.appendAttributeName("<!---->");
        org.jsoup.nodes.Element element52 = xmlTreeBuilder0.insert(startTag40);
        boolean boolean53 = startTag40.isComment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.tokenType();
        boolean boolean3 = startTag1.isComment();
        java.lang.String str4 = startTag1.toString();
        boolean boolean5 = startTag1.isComment();
        org.jsoup.nodes.Attributes attributes6 = startTag1.getAttributes();
        java.lang.String str7 = startTag1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<<!---->>" + "'", str4, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<<!---->>" + "'", str7, "<<!---->>");
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        org.jsoup.parser.Token.TokenType tokenType3 = startTag2.type;
        startTag2.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag6 = startTag2.asStartTag();
        startTag6.finaliseTag();
        startTag6.selfClosing = false;
        java.lang.String str10 = startTag6.toString();
        java.lang.String str11 = startTag6.tagName;
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<hi!>" + "'", str10, "<hi!>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
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
        boolean boolean19 = startTag0.isCharacter();
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
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.selfClosing = false;
        startTag0.appendTagName("hi!");
        org.jsoup.nodes.Attributes attributes5 = startTag0.getAttributes();
        java.lang.String str6 = startTag0.name();
        java.lang.String str7 = startTag0.tokenType();
        java.lang.String str8 = startTag0.tagName;
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "StartTag" + "'", str7, "StartTag");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
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
        org.jsoup.parser.Token.Doctype doctype14 = new org.jsoup.parser.Token.Doctype();
        boolean boolean15 = doctype14.isForceQuirks();
        java.lang.String str16 = doctype14.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder17 = doctype14.name;
        boolean boolean18 = doctype14.isCharacter();
        org.jsoup.parser.Token.Doctype doctype19 = doctype14.asDoctype();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!----><<!---->>" + "'", str12, "<!----><<!---->>");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(doctype19);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendAttributeName('4');
        boolean boolean6 = startTag2.isDoctype();
        org.jsoup.parser.Token.Tag tag8 = startTag2.name("StartTag");
        boolean boolean9 = startTag2.isEndTag();
        startTag2.appendTagName("</EndTag>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag12 = startTag2.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("</</<!---->>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype2 = endTag1.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
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
        java.lang.String str16 = character10.getData();
        boolean boolean17 = character10.isCharacter();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType4 = startTag0.type;
        org.jsoup.nodes.Attributes attributes5 = startTag0.getAttributes();
        boolean boolean6 = startTag0.isComment();
        startTag0.appendTagName(' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.selfClosing;
        org.jsoup.parser.Token.Tag tag3 = endTag0.name("<!---->");
        endTag0.tagName = "EndTag";
        java.lang.String str6 = endTag0.toString();
        endTag0.finaliseTag();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "</EndTag>" + "'", str6, "</EndTag>");
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag13 = character6.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
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
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder44 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList47 = null;
        xmlTreeBuilder44.initialiseParse("</<!---->>", "StartTag", parseErrorList47);
        org.jsoup.parser.Token.StartTag startTag50 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes52 = null;
        org.jsoup.parser.Token.StartTag startTag53 = new org.jsoup.parser.Token.StartTag("hi!", attributes52);
        startTag53.newAttribute();
        startTag53.tagName = "";
        org.jsoup.nodes.Attributes attributes57 = startTag53.attributes;
        startTag50.attributes = attributes57;
        boolean boolean59 = startTag50.isDoctype();
        org.jsoup.parser.Token.StartTag startTag60 = startTag50.asStartTag();
        boolean boolean61 = startTag60.isEOF();
        startTag60.selfClosing = true;
        org.jsoup.nodes.Element element64 = xmlTreeBuilder44.insert(startTag60);
        org.jsoup.parser.Token.StartTag startTag65 = new org.jsoup.parser.Token.StartTag();
        startTag65.appendAttributeValue('4');
        boolean boolean68 = startTag65.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType69 = startTag65.type;
        java.lang.String str70 = startTag65.tagName;
        boolean boolean71 = startTag65.isEndTag();
        org.jsoup.nodes.Attributes attributes72 = startTag65.getAttributes();
        org.jsoup.nodes.Attributes attributes73 = startTag65.getAttributes();
        startTag60.attributes = attributes73;
        startTag32.attributes = attributes73;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype76 = startTag32.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(attributes57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(startTag60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + tokenType69 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType69.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(attributes72);
        org.junit.Assert.assertNotNull(attributes73);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("hi!<<!----><hi!>>");
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype3 = startTag1.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<<!---->>" + "'", str2, "<<!---->>");
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isStartTag();
        java.lang.String str2 = comment0.toString();
        java.lang.String str3 = comment0.getData();
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        xmlTreeBuilder0.initialiseParse("<<<!---->>>", "</</<!---->>>", parseErrorList10);
        org.jsoup.parser.Token.Doctype doctype12 = new org.jsoup.parser.Token.Doctype();
        boolean boolean13 = doctype12.isForceQuirks();
        java.lang.String str14 = doctype12.getName();
        boolean boolean15 = doctype12.isForceQuirks();
        java.lang.String str16 = doctype12.getPublicIdentifier();
        doctype12.forceQuirks = false;
        java.lang.String str19 = doctype12.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder20 = doctype12.publicIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.Token.Character character6 = new org.jsoup.parser.Token.Character("");
        java.lang.String str7 = character6.toString();
        java.lang.String str8 = character6.toString();
        boolean boolean9 = character6.isDoctype();
        xmlTreeBuilder0.insert(character6);
        org.jsoup.parser.Token.Character character12 = new org.jsoup.parser.Token.Character("<!----><<!---->>");
        xmlTreeBuilder0.insert(character12);
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.appendAttributeValue('4');
        boolean boolean17 = startTag14.isEndTag();
        boolean boolean18 = startTag14.isEOF();
        startTag14.appendAttributeValue("hi!");
        boolean boolean21 = startTag14.selfClosing;
        startTag14.selfClosing = false;
        org.jsoup.parser.Token.Tag tag25 = startTag14.name("<<!---->>4");
        org.jsoup.nodes.Element element26 = xmlTreeBuilder0.insert(startTag14);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder27 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        xmlTreeBuilder27.initialiseParse("</<!---->>", "StartTag", parseErrorList30);
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        xmlTreeBuilder27.initialiseParse("<!---->", "<<!---->>", parseErrorList34);
        org.jsoup.parser.Token.Character character37 = new org.jsoup.parser.Token.Character("");
        java.lang.String str38 = character37.toString();
        java.lang.String str39 = character37.getData();
        java.lang.String str40 = character37.toString();
        java.lang.String str41 = character37.toString();
        boolean boolean42 = xmlTreeBuilder27.process((org.jsoup.parser.Token) character37);
        org.jsoup.parser.Token.Comment comment43 = new org.jsoup.parser.Token.Comment();
        boolean boolean44 = comment43.isStartTag();
        org.jsoup.parser.Token.Comment comment45 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType46 = org.jsoup.parser.Token.TokenType.Doctype;
        comment45.type = tokenType46;
        comment43.type = tokenType46;
        boolean boolean49 = comment43.isStartTag();
        java.lang.StringBuilder stringBuilder50 = comment43.data;
        boolean boolean51 = comment43.isStartTag();
        java.lang.String str52 = comment43.toString();
        xmlTreeBuilder27.insert(comment43);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder54 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList57 = null;
        xmlTreeBuilder54.initialiseParse("</<!---->>", "</<!---->>", parseErrorList57);
        org.jsoup.parser.ParseErrorList parseErrorList61 = null;
        xmlTreeBuilder54.initialiseParse("StartTag", "<!---->", parseErrorList61);
        org.jsoup.parser.Token.Comment comment63 = new org.jsoup.parser.Token.Comment();
        java.lang.String str64 = comment63.getData();
        xmlTreeBuilder54.insert(comment63);
        org.jsoup.parser.Token.Comment comment66 = new org.jsoup.parser.Token.Comment();
        java.lang.String str67 = comment66.toString();
        boolean boolean68 = comment66.isEndTag();
        xmlTreeBuilder54.insert(comment66);
        org.jsoup.parser.Token.Character character71 = new org.jsoup.parser.Token.Character("hi!");
        java.lang.String str72 = character71.getData();
        java.lang.String str73 = character71.toString();
        xmlTreeBuilder54.insert(character71);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder75 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList78 = null;
        xmlTreeBuilder75.initialiseParse("</<!---->>", "</<!---->>", parseErrorList78);
        org.jsoup.parser.ParseErrorList parseErrorList82 = null;
        xmlTreeBuilder75.initialiseParse("StartTag", "<!---->", parseErrorList82);
        org.jsoup.parser.Token.Comment comment84 = new org.jsoup.parser.Token.Comment();
        java.lang.String str85 = comment84.getData();
        xmlTreeBuilder75.insert(comment84);
        org.jsoup.parser.Token.Comment comment87 = new org.jsoup.parser.Token.Comment();
        java.lang.String str88 = comment87.toString();
        boolean boolean89 = comment87.isEndTag();
        xmlTreeBuilder75.insert(comment87);
        org.jsoup.parser.Token.Character character92 = new org.jsoup.parser.Token.Character("<<!---->>");
        java.lang.String str93 = character92.getData();
        xmlTreeBuilder75.insert(character92);
        xmlTreeBuilder54.insert(character92);
        xmlTreeBuilder27.insert(character92);
        xmlTreeBuilder0.insert(character92);
        org.jsoup.parser.Token.Doctype doctype98 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype98);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + tokenType46 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType46.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(stringBuilder50);
        org.junit.Assert.assertEquals(stringBuilder50.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "<!---->" + "'", str52, "<!---->");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "<!---->" + "'", str67, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "<!---->" + "'", str88, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "<<!---->>" + "'", str93, "<<!---->>");
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.selfClosing;
        org.jsoup.parser.Token.Tag tag3 = endTag0.name("<!---->");
        endTag0.tagName = "EndTag";
        java.lang.String str6 = endTag0.toString();
        java.lang.String str7 = endTag0.toString();
        endTag0.appendAttributeName('a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "</EndTag>" + "'", str6, "</EndTag>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</EndTag>" + "'", str7, "</EndTag>");
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        java.lang.String str3 = doctype0.getSystemIdentifier();
        java.lang.String str4 = doctype0.getPublicIdentifier();
        java.lang.String str5 = doctype0.getSystemIdentifier();
        doctype0.forceQuirks = false;
        boolean boolean8 = doctype0.isEndTag();
        boolean boolean9 = doctype0.isDoctype();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
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
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        startTag27.appendAttributeValue('4');
        boolean boolean30 = startTag27.isEndTag();
        startTag27.newAttribute();
        boolean boolean32 = startTag27.isComment();
        org.jsoup.parser.Token.Tag tag34 = startTag27.name("<hi!>");
        org.jsoup.nodes.Element element35 = xmlTreeBuilder0.insert(startTag27);
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        xmlTreeBuilder0.initialiseParse("hi!4", "<<hi!>StartTag>", parseErrorList38);
        org.jsoup.parser.Token.Comment comment40 = new org.jsoup.parser.Token.Comment();
        xmlTreeBuilder0.insert(comment40);
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNotNull(element35);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder3 = doctype0.systemIdentifier;
        boolean boolean4 = doctype0.isForceQuirks();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
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
        java.lang.String str14 = startTag1.tagName;
        startTag1.selfClosing = true;
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!---->" + "'", str14, "<!---->");
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("<<!---->>4", "Doctype", parseErrorList7);
        org.jsoup.parser.Token.Doctype doctype9 = new org.jsoup.parser.Token.Doctype();
        boolean boolean10 = doctype9.isForceQuirks();
        boolean boolean11 = doctype9.isForceQuirks();
        java.lang.StringBuilder stringBuilder12 = doctype9.systemIdentifier;
        java.lang.StringBuilder stringBuilder13 = doctype9.name;
        java.lang.StringBuilder stringBuilder14 = doctype9.publicIdentifier;
        boolean boolean15 = doctype9.isCharacter();
        java.lang.String str16 = doctype9.getName();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
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
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder23 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        xmlTreeBuilder23.initialiseParse("", "<<!---->>", parseErrorList26);
        org.jsoup.parser.Token.EndTag endTag29 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str30 = endTag29.toString();
        java.lang.String str31 = endTag29.toString();
        boolean boolean32 = xmlTreeBuilder23.process((org.jsoup.parser.Token) endTag29);
        endTag29.newAttribute();
        endTag29.appendTagName('4');
        boolean boolean36 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag29);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!---->" + "'", str18, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "</<!---->>" + "'", str30, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "</<!---->>" + "'", str31, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        endTag1.appendTagName("StartTag");
        org.jsoup.nodes.Attributes attributes7 = endTag1.attributes;
        endTag1.appendAttributeName('4');
        java.lang.String str10 = endTag1.toString();
        endTag1.tagName = "<4>";
        boolean boolean13 = endTag1.isEOF();
        java.lang.String str14 = endTag1.toString();
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "</<!---->StartTag>" + "'", str10, "</<!---->StartTag>");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "</<4>>" + "'", str14, "</<4>>");
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        java.lang.String str3 = doctype0.getSystemIdentifier();
        java.lang.String str4 = doctype0.getName();
        java.lang.String str5 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        boolean boolean7 = doctype0.isStartTag();
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        java.lang.StringBuilder stringBuilder9 = doctype0.name;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendTagName('4');
        startTag2.appendAttributeValue("<!---->");
        startTag2.appendAttributeValue("");
        startTag2.tagName = "</<!---->>";
        java.lang.String str12 = startTag2.tagName;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag13 = startTag2.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "</<!---->>" + "'", str12, "</<!---->>");
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        org.jsoup.parser.Token.TokenType tokenType2 = comment0.type;
        boolean boolean3 = comment0.isComment();
        java.lang.String str4 = comment0.getData();
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag("");
        org.jsoup.nodes.Attributes attributes8 = null;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("hi!", attributes8);
        org.jsoup.parser.Token.TokenType tokenType10 = startTag9.type;
        endTag6.type = tokenType10;
        comment0.type = tokenType10;
        org.jsoup.parser.Token.TokenType tokenType13 = comment0.type;
        java.lang.String str14 = comment0.tokenType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character15 = comment0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Comment" + "'", str14, "Comment");
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.forceQuirks = false;
        java.lang.String str5 = doctype0.getName();
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character7 = doctype0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("</</</<!---->>>>");
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.Token.Character character6 = new org.jsoup.parser.Token.Character("");
        java.lang.String str7 = character6.toString();
        java.lang.String str8 = character6.getData();
        java.lang.String str9 = character6.toString();
        boolean boolean10 = character6.isCharacter();
        xmlTreeBuilder0.insert(character6);
        java.lang.Class<?> wildcardClass12 = xmlTreeBuilder0.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.tokenType();
        boolean boolean3 = startTag1.isComment();
        java.lang.String str4 = startTag1.toString();
        boolean boolean5 = startTag1.isComment();
        org.jsoup.parser.Token.Tag tag7 = startTag1.name("");
        boolean boolean8 = tag7.isStartTag();
        tag7.appendAttributeName('#');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment11 = tag7.asComment();
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
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendTagName("<hi!4>");
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.newAttribute();
        startTag2.tagName = "";
        boolean boolean6 = startTag2.isEOF();
        boolean boolean7 = startTag2.isSelfClosing();
        startTag2.appendAttributeValue("</<hi!>>");
        org.jsoup.nodes.Attributes attributes10 = startTag2.attributes;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        boolean boolean4 = startTag2.selfClosing;
        java.lang.String str5 = startTag2.name();
        startTag2.appendAttributeName('a');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag8 = startTag2.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment45 = character23.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
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
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
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
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag("<!---->");
        boolean boolean37 = startTag36.isSelfClosing();
        boolean boolean38 = startTag36.isDoctype();
        boolean boolean39 = startTag36.isSelfClosing();
        org.jsoup.nodes.Element element40 = xmlTreeBuilder0.insert(startTag36);
        org.jsoup.parser.ParseErrorList parseErrorList43 = null;
        xmlTreeBuilder0.initialiseParse("4#", "<!---->hi!", parseErrorList43);
        org.jsoup.parser.ParseErrorList parseErrorList47 = null;
        xmlTreeBuilder0.initialiseParse("</hi!<!---->>", "<a>", parseErrorList47);
        org.jsoup.parser.ParseErrorList parseErrorList51 = null;
        xmlTreeBuilder0.initialiseParse("</hi!EndTag>", "</<<!---->>>", parseErrorList51);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "StartTag" + "'", str31, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(element40);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.newAttribute();
        boolean boolean4 = startTag2.isSelfClosing();
        boolean boolean5 = startTag2.isEOF();
        boolean boolean6 = startTag2.isEndTag();
        org.jsoup.parser.Token.TokenType tokenType7 = startTag2.type;
        startTag2.newAttribute();
        startTag2.appendAttributeName('4');
        java.lang.String str11 = startTag2.name();
        startTag2.appendAttributeName("<<!----><hi!>>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<hi!>");
        java.lang.String str2 = endTag1.toString();
        boolean boolean3 = endTag1.selfClosing;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</<hi!>>" + "'", str2, "</<hi!>>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder3 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder4 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.TokenType tokenType5 = doctype0.type;
        boolean boolean6 = doctype0.forceQuirks;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        endTag1.appendTagName("StartTag");
        endTag1.newAttribute();
        org.jsoup.parser.Token.TokenType tokenType8 = endTag1.type;
        endTag1.appendAttributeValue("</<hi!>>");
        java.lang.String str11 = endTag1.toString();
        org.jsoup.parser.Token.EndTag endTag12 = endTag1.asEndTag();
        java.lang.String str13 = endTag12.name();
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "</<!---->StartTag>" + "'", str11, "</<!---->StartTag>");
        org.junit.Assert.assertNotNull(endTag12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->StartTag" + "'", str13, "<!---->StartTag");
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.tokenType();
        boolean boolean3 = startTag1.isComment();
        org.jsoup.parser.Token.Tag tag5 = startTag1.name("<<!---->>");
        tag5.newAttribute();
        boolean boolean7 = tag5.isStartTag();
        tag5.appendAttributeName("");
        boolean boolean10 = tag5.selfClosing;
        java.lang.String str11 = tag5.tokenType();
        boolean boolean12 = tag5.selfClosing;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "StartTag" + "'", str11, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        boolean boolean2 = startTag1.isSelfClosing();
        boolean boolean3 = startTag1.isDoctype();
        startTag1.finaliseTag();
        startTag1.appendTagName(' ');
        boolean boolean7 = startTag1.isComment();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.BogusComment;
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
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str2 = endTag1.toString();
        endTag1.appendAttributeValue('4');
        boolean boolean5 = endTag1.isSelfClosing();
        java.lang.String str6 = endTag1.tagName;
        boolean boolean7 = endTag1.isCharacter();
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("<<!---->>");
        startTag9.newAttribute();
        org.jsoup.parser.Token.Tag tag12 = startTag9.name("StartTag");
        org.jsoup.nodes.Attributes attributes13 = startTag9.attributes;
        endTag1.attributes = attributes13;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</<!---->>" + "'", str2, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!EndTag");
        org.jsoup.nodes.Attributes attributes2 = endTag1.attributes;
        org.junit.Assert.assertNull(attributes2);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
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
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        xmlTreeBuilder13.initialiseParse("", "<<!---->>", parseErrorList16);
        org.jsoup.parser.Token.Comment comment18 = new org.jsoup.parser.Token.Comment();
        boolean boolean19 = comment18.isStartTag();
        org.jsoup.parser.Token.Comment comment20 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType21 = org.jsoup.parser.Token.TokenType.Doctype;
        comment20.type = tokenType21;
        comment18.type = tokenType21;
        boolean boolean24 = comment18.isStartTag();
        java.lang.String str25 = comment18.getData();
        xmlTreeBuilder13.insert(comment18);
        boolean boolean27 = comment18.isDoctype();
        java.lang.StringBuilder stringBuilder28 = comment18.data;
        java.lang.String str29 = comment18.tokenType();
        java.lang.String str30 = comment18.getData();
        xmlTreeBuilder0.insert(comment18);
        org.jsoup.parser.Token.Comment comment32 = new org.jsoup.parser.Token.Comment();
        java.lang.String str33 = comment32.toString();
        org.jsoup.parser.Token.TokenType tokenType34 = comment32.type;
        boolean boolean35 = comment32.isComment();
        java.lang.StringBuilder stringBuilder36 = comment32.data;
        xmlTreeBuilder0.insert(comment32);
        org.jsoup.nodes.Attributes attributes39 = null;
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag("hi!", attributes39);
        boolean boolean41 = startTag40.isComment();
        org.jsoup.parser.Token.Comment comment42 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType43 = org.jsoup.parser.Token.TokenType.Doctype;
        comment42.type = tokenType43;
        startTag40.type = tokenType43;
        startTag40.appendAttributeName("hi!");
        boolean boolean48 = startTag40.isCharacter();
        startTag40.finaliseTag();
        java.lang.String str50 = startTag40.tokenType();
        java.lang.String str51 = startTag40.tagName;
        boolean boolean52 = startTag40.selfClosing;
        boolean boolean53 = startTag40.isDoctype();
        org.jsoup.parser.Token.Tag tag55 = startTag40.name("<<!---->>");
        org.jsoup.nodes.Element element56 = xmlTreeBuilder0.insert(startTag40);
        org.jsoup.nodes.Attributes attributes57 = startTag40.attributes;
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + tokenType21 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType21.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Comment" + "'", str29, "Comment");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!---->" + "'", str33, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType34 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType34.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(stringBuilder36);
        org.junit.Assert.assertEquals(stringBuilder36.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + tokenType43 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType43.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "StartTag" + "'", str50, "StartTag");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(tag55);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(attributes57);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("StartTag");
        startTag1.finaliseTag();
        org.jsoup.nodes.Attributes attributes3 = startTag1.getAttributes();
        org.junit.Assert.assertNotNull(attributes3);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendAttributeName('4');
        boolean boolean6 = startTag2.isDoctype();
        org.jsoup.parser.Token.Tag tag8 = startTag2.name("StartTag");
        boolean boolean9 = tag8.isEndTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character10 = tag8.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
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
        boolean boolean19 = startTag18.isComment();
        org.jsoup.parser.Token.TokenType tokenType20 = startTag18.type;
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        org.jsoup.nodes.Attributes attributes4 = startTag2.attributes;
        startTag2.finaliseTag();
        startTag2.appendAttributeName("<hi!>");
        startTag2.appendTagName("</</<!---->>>");
        java.lang.String str10 = startTag2.toString();
        boolean boolean11 = startTag2.isComment();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<hi!</</<!---->>>>" + "'", str10, "<hi!</</<!---->>>>");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        org.jsoup.parser.Token.TokenType tokenType3 = startTag2.type;
        startTag2.selfClosing = true;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment6 = startTag2.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isEOF();
        startTag0.appendAttributeValue("hi!");
        startTag0.appendTagName('4');
        boolean boolean9 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag11 = startTag0.name("hi!");
        boolean boolean12 = startTag0.isCharacter();
        java.lang.String str13 = startTag0.toString();
        java.lang.String str14 = startTag0.name();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<hi!>" + "'", str13, "<hi!>");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.forceQuirks = false;
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.String str7 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType8 = doctype0.type;
        java.lang.String str9 = doctype0.getPublicIdentifier();
        java.lang.String str10 = doctype0.tokenType();
        java.lang.StringBuilder stringBuilder11 = doctype0.publicIdentifier;
        java.lang.String str12 = doctype0.getPublicIdentifier();
        boolean boolean13 = doctype0.isEOF();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Doctype" + "'", str10, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "<hi!>", parseErrorList7);
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->StartTag>", parseErrorList11);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder0.initialiseParse("<!----><<!---->>", "StartTag", parseErrorList15);
        org.jsoup.nodes.Attributes attributes18 = null;
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag("hi!", attributes18);
        boolean boolean20 = startTag19.isComment();
        org.jsoup.parser.Token.Comment comment21 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType22 = org.jsoup.parser.Token.TokenType.Doctype;
        comment21.type = tokenType22;
        startTag19.type = tokenType22;
        startTag19.appendAttributeName("hi!");
        boolean boolean27 = startTag19.isCharacter();
        startTag19.finaliseTag();
        java.lang.String str29 = startTag19.tokenType();
        java.lang.String str30 = startTag19.tagName;
        boolean boolean31 = startTag19.selfClosing;
        boolean boolean32 = startTag19.isDoctype();
        org.jsoup.nodes.Attributes attributes33 = startTag19.attributes;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + tokenType22 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType22.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "StartTag" + "'", str29, "StartTag");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(attributes33);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder3 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder4 = doctype0.name;
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        boolean boolean6 = doctype0.isCharacter();
        java.lang.String str7 = doctype0.getName();
        java.lang.String str8 = doctype0.getName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        boolean boolean2 = doctype0.isDoctype();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        doctype0.forceQuirks = true;
        java.lang.String str11 = doctype0.getPublicIdentifier();
        boolean boolean12 = doctype0.forceQuirks;
        java.lang.String str13 = doctype0.getPublicIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag14 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
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
        endTag1.selfClosing = true;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "</<!---->>" + "'", str5, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
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
        boolean boolean28 = comment17.isDoctype();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!---->" + "'", str27, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
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
        endTag1.appendAttributeValue('4');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "</<!---->>" + "'", str5, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
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
        java.lang.StringBuilder stringBuilder12 = doctype7.publicIdentifier;
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
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList7);
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        xmlTreeBuilder0.initialiseParse("<!---->", "hi!", parseErrorList11);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder0.initialiseParse("<<!---->>", "", parseErrorList15);
        org.jsoup.parser.Token.Comment comment17 = new org.jsoup.parser.Token.Comment();
        boolean boolean18 = comment17.isStartTag();
        org.jsoup.parser.Token.Comment comment19 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType20 = org.jsoup.parser.Token.TokenType.Doctype;
        comment19.type = tokenType20;
        comment17.type = tokenType20;
        boolean boolean23 = comment17.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType24 = comment17.type;
        java.lang.String str25 = comment17.getData();
        java.lang.StringBuilder stringBuilder26 = comment17.data;
        boolean boolean27 = comment17.isEndTag();
        xmlTreeBuilder0.insert(comment17);
        org.jsoup.nodes.Attributes attributes30 = null;
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag("hi!", attributes30);
        boolean boolean32 = startTag31.isComment();
        startTag31.appendAttributeName("StartTag");
        boolean boolean35 = startTag31.isComment();
        startTag31.appendTagName("<!----><<!---->>");
        org.jsoup.nodes.Attributes attributes38 = startTag31.attributes;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element39 = xmlTreeBuilder0.insert(startTag31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + tokenType24 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType24.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(attributes38);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        boolean boolean2 = comment0.isEOF();
        java.lang.String str3 = comment0.toString();
        org.jsoup.parser.Token.EndTag endTag4 = new org.jsoup.parser.Token.EndTag();
        boolean boolean5 = endTag4.selfClosing;
        org.jsoup.parser.Token.Tag tag7 = endTag4.name("<!---->");
        org.jsoup.parser.Token.TokenType tokenType8 = org.jsoup.parser.Token.TokenType.StartTag;
        tag7.type = tokenType8;
        comment0.type = tokenType8;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        doctype0.forceQuirks = true;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        org.jsoup.parser.Token.TokenType tokenType3 = startTag2.type;
        startTag2.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag6 = startTag2.asStartTag();
        boolean boolean7 = startTag6.selfClosing;
        startTag6.finaliseTag();
        startTag6.appendAttributeValue("");
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.selfClosing;
        endTag0.newAttribute();
        endTag0.appendAttributeValue("");
        endTag0.newAttribute();
        boolean boolean6 = endTag0.isEndTag();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Character character6 = new org.jsoup.parser.Token.Character("StartTag");
        xmlTreeBuilder0.insert(character6);
        java.lang.String str8 = character6.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "StartTag" + "'", str8, "StartTag");
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
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
        org.jsoup.parser.Token.EndTag endTag16 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag16.appendAttributeValue('#');
        endTag16.finaliseTag();
        java.lang.String str20 = endTag16.toString();
        endTag16.appendAttributeValue("<!----><<!---->>");
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        startTag23.appendAttributeValue('4');
        boolean boolean26 = startTag23.isEndTag();
        startTag23.newAttribute();
        boolean boolean28 = startTag23.isComment();
        boolean boolean29 = startTag23.selfClosing;
        org.jsoup.nodes.Attributes attributes31 = null;
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag("hi!", attributes31);
        boolean boolean33 = startTag32.isComment();
        org.jsoup.parser.Token.Comment comment34 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType35 = org.jsoup.parser.Token.TokenType.Doctype;
        comment34.type = tokenType35;
        startTag32.type = tokenType35;
        startTag23.type = tokenType35;
        endTag16.type = tokenType35;
        boolean boolean40 = endTag16.isDoctype();
        boolean boolean41 = endTag16.selfClosing;
        org.jsoup.parser.Token.StartTag startTag43 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes45 = null;
        org.jsoup.parser.Token.StartTag startTag46 = new org.jsoup.parser.Token.StartTag("hi!", attributes45);
        startTag46.newAttribute();
        startTag46.tagName = "";
        org.jsoup.nodes.Attributes attributes50 = startTag46.attributes;
        startTag43.attributes = attributes50;
        boolean boolean52 = startTag43.isDoctype();
        org.jsoup.parser.Token.StartTag startTag53 = startTag43.asStartTag();
        boolean boolean54 = startTag43.isEndTag();
        startTag43.finaliseTag();
        org.jsoup.parser.Token.TokenType tokenType56 = startTag43.type;
        endTag16.type = tokenType56;
        tag11.type = tokenType56;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "</<!---->>" + "'", str20, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + tokenType35 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType35.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(startTag53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + tokenType56 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType56.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
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
        org.jsoup.nodes.Attributes attributes34 = null;
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag("hi!", attributes34);
        startTag35.newAttribute();
        startTag35.tagName = "";
        boolean boolean39 = startTag35.isComment();
        startTag35.appendTagName('a');
        org.jsoup.nodes.Attributes attributes42 = startTag35.attributes;
        org.jsoup.nodes.Attributes attributes43 = startTag35.attributes;
        org.jsoup.parser.Token.StartTag startTag44 = startTag35.asStartTag();
        org.jsoup.nodes.Element element45 = xmlTreeBuilder0.insert(startTag35);
        org.jsoup.parser.Token.StartTag startTag47 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str48 = startTag47.tokenType();
        boolean boolean49 = startTag47.isComment();
        java.lang.String str50 = startTag47.toString();
        boolean boolean51 = startTag47.isComment();
        org.jsoup.parser.Token.Tag tag53 = startTag47.name("");
        startTag47.appendTagName('a');
        org.jsoup.parser.Token.StartTag startTag56 = new org.jsoup.parser.Token.StartTag();
        startTag56.appendAttributeValue('4');
        boolean boolean59 = startTag56.isEndTag();
        boolean boolean60 = startTag56.isEOF();
        startTag56.appendAttributeValue("hi!");
        startTag56.appendTagName('4');
        boolean boolean65 = startTag56.isSelfClosing();
        org.jsoup.parser.Token.Tag tag67 = startTag56.name("hi!");
        startTag56.appendAttributeValue("<!----><<!---->>");
        java.lang.String str70 = startTag56.tokenType();
        java.lang.String str71 = startTag56.tagName;
        org.jsoup.parser.Token.StartTag startTag72 = new org.jsoup.parser.Token.StartTag();
        startTag72.appendAttributeValue('4');
        boolean boolean75 = startTag72.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType76 = startTag72.type;
        java.lang.String str77 = startTag72.tagName;
        boolean boolean78 = startTag72.isEndTag();
        org.jsoup.nodes.Attributes attributes79 = startTag72.getAttributes();
        startTag56.attributes = attributes79;
        startTag47.attributes = attributes79;
        org.jsoup.nodes.Attributes attributes82 = startTag47.getAttributes();
        startTag35.attributes = attributes82;
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + tokenType18 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType18.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertTrue("'" + tokenType27 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType27.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertNotNull(attributes43);
        org.junit.Assert.assertNotNull(startTag44);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "StartTag" + "'", str48, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "<<!---->>" + "'", str50, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(tag53);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(tag67);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "StartTag" + "'", str70, "StartTag");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + tokenType76 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType76.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(attributes79);
        org.junit.Assert.assertNotNull(attributes82);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendTagName('4');
        org.jsoup.parser.Token.StartTag startTag6 = startTag2.asStartTag();
        boolean boolean7 = startTag6.isCharacter();
        java.lang.String str8 = startTag6.name();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!4" + "'", str8, "hi!4");
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        boolean boolean4 = startTag2.selfClosing;
        startTag2.newAttribute();
        java.lang.String str6 = startTag2.tokenType();
        startTag2.finaliseTag();
        java.lang.Class<?> wildcardClass8 = startTag2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "StartTag" + "'", str6, "StartTag");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
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
        java.lang.String str32 = comment22.toString();
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + tokenType25 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType25.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + tokenType29 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType29.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<!---->" + "'", str32, "<!---->");
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
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
        java.lang.StringBuilder stringBuilder11 = doctype0.publicIdentifier;
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
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<<!---->>");
        startTag1.newAttribute();
        org.jsoup.parser.Token.Tag tag4 = startTag1.name("StartTag");
        org.jsoup.nodes.Attributes attributes5 = null;
        startTag1.attributes = attributes5;
        startTag1.newAttribute();
        startTag1.tagName = "</hi!<!---->>";
        startTag1.appendTagName('a');
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType4 = startTag0.type;
        java.lang.String str5 = startTag0.tagName;
        boolean boolean6 = startTag0.isEndTag();
        startTag0.appendAttributeValue("");
        startTag0.appendAttributeValue('a');
        boolean boolean11 = startTag0.isCharacter();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
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
        org.jsoup.nodes.Attributes attributes25 = null;
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag("hi!", attributes25);
        boolean boolean27 = startTag26.isComment();
        startTag26.appendAttributeName('4');
        java.lang.String str30 = startTag26.tokenType();
        org.jsoup.nodes.Attributes attributes32 = null;
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag("hi!", attributes32);
        startTag33.appendAttributeValue(' ');
        java.lang.String str36 = startTag33.tokenType();
        java.lang.String str37 = startTag33.name();
        startTag33.appendTagName("<!---->");
        startTag33.tagName = "StartTag";
        org.jsoup.parser.Token.StartTag startTag42 = new org.jsoup.parser.Token.StartTag();
        startTag42.selfClosing = false;
        startTag42.appendTagName("hi!");
        org.jsoup.nodes.Attributes attributes47 = startTag42.getAttributes();
        startTag33.attributes = attributes47;
        startTag26.attributes = attributes47;
        startTag11.attributes = attributes47;
        startTag11.appendTagName(' ');
        boolean boolean53 = startTag11.isSelfClosing();
        startTag11.appendAttributeValue('4');
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "StartTag" + "'", str30, "StartTag");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "StartTag" + "'", str36, "StartTag");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(attributes47);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("</</hi!<!---->>>");
        java.lang.String str2 = character1.getData();
        java.lang.String str3 = character1.getData();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</</hi!<!---->>>" + "'", str2, "</</hi!<!---->>>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</</hi!<!---->>>" + "'", str3, "</</hi!<!---->>>");
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.appendAttributeValue(' ');
        startTag2.newAttribute();
        org.jsoup.parser.Token.Tag tag7 = startTag2.name("<!---->");
        org.junit.Assert.assertNotNull(tag7);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendTagName('4');
        startTag2.appendAttributeValue("<!---->");
        startTag2.appendAttributeValue("");
        boolean boolean10 = startTag2.isDoctype();
        org.jsoup.nodes.Attributes attributes11 = startTag2.getAttributes();
        java.lang.String str12 = startTag2.tokenType();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(attributes11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "StartTag" + "'", str12, "StartTag");
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
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
        org.jsoup.nodes.Attributes attributes55 = null;
        org.jsoup.parser.Token.StartTag startTag56 = new org.jsoup.parser.Token.StartTag("hi!", attributes55);
        boolean boolean57 = startTag56.isComment();
        startTag56.appendAttributeName('4');
        java.lang.String str60 = startTag56.tokenType();
        org.jsoup.nodes.Attributes attributes62 = null;
        org.jsoup.parser.Token.StartTag startTag63 = new org.jsoup.parser.Token.StartTag("hi!", attributes62);
        startTag63.appendAttributeValue(' ');
        java.lang.String str66 = startTag63.tokenType();
        java.lang.String str67 = startTag63.name();
        startTag63.appendTagName("<!---->");
        startTag63.tagName = "StartTag";
        org.jsoup.parser.Token.StartTag startTag72 = new org.jsoup.parser.Token.StartTag();
        startTag72.selfClosing = false;
        startTag72.appendTagName("hi!");
        org.jsoup.nodes.Attributes attributes77 = startTag72.getAttributes();
        startTag63.attributes = attributes77;
        startTag56.attributes = attributes77;
        java.lang.String str80 = startTag56.tagName;
        boolean boolean81 = startTag56.isComment();
        startTag56.appendAttributeValue(' ');
        org.jsoup.nodes.Element element84 = xmlTreeBuilder0.insert(startTag56);
        org.jsoup.parser.Token.Character character86 = new org.jsoup.parser.Token.Character("");
        boolean boolean87 = character86.isEndTag();
        boolean boolean88 = character86.isCharacter();
        xmlTreeBuilder0.insert(character86);
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
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "StartTag" + "'", str60, "StartTag");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "StartTag" + "'", str66, "StartTag");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertNotNull(attributes77);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(element84);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isStartTag();
        org.jsoup.parser.Token.Comment comment2 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType3 = org.jsoup.parser.Token.TokenType.Doctype;
        comment2.type = tokenType3;
        comment0.type = tokenType3;
        boolean boolean6 = comment0.isStartTag();
        java.lang.String str7 = comment0.getData();
        java.lang.String str8 = comment0.getData();
        java.lang.String str9 = comment0.toString();
        java.lang.String str10 = comment0.getData();
        java.lang.String str11 = comment0.toString();
        java.lang.StringBuilder stringBuilder12 = comment0.data;
        java.lang.String str13 = comment0.getData();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!---->" + "'", str9, "<!---->");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        doctype0.forceQuirks = true;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        java.lang.String str7 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder9 = doctype0.name;
        java.lang.StringBuilder stringBuilder10 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder11 = doctype0.publicIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isEOF();
        startTag0.appendAttributeValue("hi!");
        startTag0.appendTagName('4');
        boolean boolean9 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag11 = startTag0.name("hi!");
        startTag0.appendAttributeValue("<!----><<!---->>");
        java.lang.String str14 = startTag0.tokenType();
        java.lang.String str15 = startTag0.tagName;
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        startTag16.appendAttributeValue('4');
        boolean boolean19 = startTag16.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType20 = startTag16.type;
        java.lang.String str21 = startTag16.tagName;
        boolean boolean22 = startTag16.isEndTag();
        org.jsoup.nodes.Attributes attributes23 = startTag16.getAttributes();
        startTag0.attributes = attributes23;
        org.jsoup.parser.Token.Tag tag26 = startTag0.name("<hi!</</<!---->>>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype27 = startTag0.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "StartTag" + "'", str14, "StartTag");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(tag26);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
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
        startTag34.appendAttributeValue("hi!Comment");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!---->" + "'", str12, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType13 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType13.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(attributes31);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("<!---->", "<<!---->>", parseErrorList7);
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        xmlTreeBuilder0.initialiseParse("<!----><<!---->>", "<hi!>", parseErrorList11);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        xmlTreeBuilder13.initialiseParse("</<!---->>", "</<!---->>", parseErrorList16);
        org.jsoup.parser.Token.Comment comment18 = new org.jsoup.parser.Token.Comment();
        java.lang.String str19 = comment18.toString();
        org.jsoup.parser.Token.TokenType tokenType20 = comment18.type;
        java.lang.String str21 = comment18.getData();
        xmlTreeBuilder13.insert(comment18);
        org.jsoup.parser.Token.Comment comment23 = new org.jsoup.parser.Token.Comment();
        java.lang.String str24 = comment23.toString();
        org.jsoup.parser.Token.TokenType tokenType25 = comment23.type;
        java.lang.String str26 = comment23.toString();
        xmlTreeBuilder13.insert(comment23);
        xmlTreeBuilder0.insert(comment23);
        org.jsoup.parser.ParseErrorList parseErrorList31 = null;
        xmlTreeBuilder0.initialiseParse("<<!---->>4", "</<<!---->>>", parseErrorList31);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!---->" + "'", str19, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<!---->" + "'", str24, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType25 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType25.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!---->" + "'", str26, "<!---->");
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        endTag1.appendTagName("StartTag");
        endTag1.newAttribute();
        org.jsoup.parser.Token.TokenType tokenType8 = endTag1.type;
        endTag1.appendAttributeValue("</<hi!>>");
        java.lang.String str11 = endTag1.toString();
        org.jsoup.nodes.Attributes attributes15 = null;
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag("hi!", attributes15);
        startTag16.newAttribute();
        startTag16.tagName = "";
        org.jsoup.nodes.Attributes attributes20 = startTag16.attributes;
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag("", attributes20);
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        startTag22.appendAttributeValue('4');
        boolean boolean25 = startTag22.isDoctype();
        org.jsoup.nodes.Attributes attributes26 = startTag22.attributes;
        startTag21.attributes = attributes26;
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag("<!----><<!---->>", attributes26);
        endTag1.attributes = attributes26;
        endTag1.selfClosing = false;
        endTag1.appendAttributeName('4');
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "</<!---->StartTag>" + "'", str11, "</<!---->StartTag>");
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(attributes26);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
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
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        xmlTreeBuilder16.initialiseParse("</<!---->>", "StartTag", parseErrorList19);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder21 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        xmlTreeBuilder21.initialiseParse("</<!---->>", "</<!---->>", parseErrorList24);
        org.jsoup.parser.Token.Comment comment26 = new org.jsoup.parser.Token.Comment();
        java.lang.String str27 = comment26.toString();
        org.jsoup.parser.Token.TokenType tokenType28 = comment26.type;
        java.lang.String str29 = comment26.getData();
        xmlTreeBuilder21.insert(comment26);
        boolean boolean31 = comment26.isComment();
        xmlTreeBuilder16.insert(comment26);
        org.jsoup.nodes.Attributes attributes34 = null;
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag("hi!", attributes34);
        boolean boolean36 = startTag35.isComment();
        boolean boolean37 = startTag35.selfClosing;
        startTag35.newAttribute();
        org.jsoup.nodes.Attributes attributes39 = startTag35.getAttributes();
        startTag35.newAttribute();
        org.jsoup.nodes.Element element41 = xmlTreeBuilder16.insert(startTag35);
        org.jsoup.nodes.Element element42 = xmlTreeBuilder0.insert(startTag35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!---->" + "'", str27, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType28 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType28.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(element42);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("<hi!>");
        java.lang.String str2 = character1.getData();
        java.lang.String str3 = character1.getData();
        java.lang.String str4 = character1.getData();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<hi!>" + "'", str2, "<hi!>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<hi!>" + "'", str3, "<hi!>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<hi!>" + "'", str4, "<hi!>");
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder3 = doctype0.publicIdentifier;
        java.lang.String str4 = doctype0.getName();
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        boolean boolean4 = startTag0.isEOF();
        startTag0.newAttribute();
        boolean boolean6 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag52 = tag6.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
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
        boolean boolean21 = character1.isCharacter();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        boolean boolean4 = endTag1.isEndTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment5 = endTag1.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        org.jsoup.nodes.Attributes attributes3 = startTag2.attributes;
        boolean boolean4 = startTag2.isComment();
        startTag2.appendTagName('4');
        startTag2.appendAttributeName('#');
        startTag2.selfClosing = true;
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        endTag1.appendTagName("StartTag");
        endTag1.appendAttributeValue('4');
        endTag1.appendTagName("<!----><<!---->>");
        java.lang.String str11 = endTag1.toString();
        boolean boolean12 = endTag1.isStartTag();
        org.jsoup.nodes.Attributes attributes13 = endTag1.attributes;
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "</<!---->StartTag<!----><<!---->>>" + "'", str11, "</<!---->StartTag<!----><<!---->>>");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(attributes13);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
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
        tag5.appendAttributeValue('a');
        java.lang.String str63 = tag5.tagName;
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
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "<<!---->>" + "'", str63, "<<!---->>");
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
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
        org.jsoup.nodes.Attributes attributes13 = endTag1.getAttributes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</<!---->>" + "'", str2, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!---->" + "'", str9, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(attributes13);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("");
        java.lang.String str2 = character1.toString();
        java.lang.String str3 = character1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag4 = character1.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.toString();
        boolean boolean3 = startTag1.isEndTag();
        boolean boolean4 = startTag1.isEOF();
        boolean boolean5 = startTag1.selfClosing;
        startTag1.finaliseTag();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<<!---->>" + "'", str2, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        xmlTreeBuilder0.insert(comment5);
        org.jsoup.parser.Token token8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = xmlTreeBuilder0.process(token8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.appendAttributeValue(' ');
        java.lang.String str5 = startTag2.tokenType();
        java.lang.String str6 = startTag2.name();
        startTag2.appendTagName("<!---->");
        startTag2.tagName = "StartTag";
        org.jsoup.parser.Token.StartTag startTag11 = startTag2.asStartTag();
        startTag11.appendAttributeValue(' ');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(startTag11);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        org.jsoup.parser.Token.EndTag endTag2 = new org.jsoup.parser.Token.EndTag("</<!---->>");
        java.lang.String str3 = endTag2.toString();
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        startTag5.appendAttributeValue('4');
        boolean boolean8 = startTag5.isEndTag();
        startTag5.newAttribute();
        boolean boolean10 = startTag5.isComment();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag("hi!", attributes14);
        startTag15.newAttribute();
        startTag15.tagName = "";
        org.jsoup.nodes.Attributes attributes19 = startTag15.attributes;
        startTag12.attributes = attributes19;
        startTag5.attributes = attributes19;
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag("<!---->", attributes19);
        endTag2.attributes = attributes19;
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag("<<!---->StartTag>", attributes19);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</</<!---->>>" + "'", str3, "</</<!---->>>");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes19);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("hi!", attributes3);
        startTag4.newAttribute();
        startTag4.tagName = "";
        org.jsoup.nodes.Attributes attributes8 = startTag4.attributes;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("", attributes8);
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        startTag10.appendAttributeValue('4');
        boolean boolean13 = startTag10.isDoctype();
        org.jsoup.nodes.Attributes attributes14 = startTag10.attributes;
        startTag9.attributes = attributes14;
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag("<hi!  4=\"\">", attributes14);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        endTag1.appendTagName("StartTag");
        endTag1.newAttribute();
        org.jsoup.parser.Token.TokenType tokenType8 = endTag1.type;
        endTag1.appendAttributeValue("</<hi!>>");
        java.lang.String str11 = endTag1.toString();
        org.jsoup.nodes.Attributes attributes15 = null;
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag("hi!", attributes15);
        startTag16.newAttribute();
        startTag16.tagName = "";
        org.jsoup.nodes.Attributes attributes20 = startTag16.attributes;
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag("", attributes20);
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        startTag22.appendAttributeValue('4');
        boolean boolean25 = startTag22.isDoctype();
        org.jsoup.nodes.Attributes attributes26 = startTag22.attributes;
        startTag21.attributes = attributes26;
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag("<!----><<!---->>", attributes26);
        endTag1.attributes = attributes26;
        java.lang.String str30 = endTag1.toString();
        java.lang.String str31 = endTag1.toString();
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "</<!---->StartTag>" + "'", str11, "</<!---->StartTag>");
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "</<!---->StartTag>" + "'", str30, "</<!---->StartTag>");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "</<!---->StartTag>" + "'", str31, "</<!---->StartTag>");
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.forceQuirks = false;
        java.lang.String str5 = doctype0.getName();
        java.lang.String str6 = doctype0.getPublicIdentifier();
        java.lang.String str7 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        boolean boolean9 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder10 = doctype0.publicIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        org.jsoup.nodes.Attributes attributes4 = startTag2.attributes;
        startTag2.finaliseTag();
        startTag2.selfClosing = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(attributes4);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.AttributeValue_unquoted;
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
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
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
        java.lang.StringBuilder stringBuilder18 = comment13.data;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!---->" + "'", str15, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isCharacter();
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.TokenType tokenType5 = doctype0.type;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        org.jsoup.nodes.Attributes attributes3 = startTag2.attributes;
        boolean boolean4 = startTag2.isComment();
        boolean boolean5 = startTag2.isEndTag();
        boolean boolean6 = startTag2.isSelfClosing();
        boolean boolean7 = startTag2.selfClosing;
        java.lang.String str8 = startTag2.tagName;
        startTag2.appendTagName("<<hi!>>");
        org.junit.Assert.assertNull(attributes3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder3 = doctype0.publicIdentifier;
        java.lang.String str4 = doctype0.getName();
        java.lang.String str5 = doctype0.getName();
        boolean boolean6 = doctype0.isForceQuirks();
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        java.lang.Class<?> wildcardClass9 = doctype0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isStartTag();
        org.jsoup.parser.Token.Comment comment2 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType3 = org.jsoup.parser.Token.TokenType.Doctype;
        comment2.type = tokenType3;
        comment0.type = tokenType3;
        boolean boolean6 = comment0.isStartTag();
        java.lang.String str7 = comment0.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag8 = comment0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!---->" + "'", str7, "<!---->");
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
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
        java.lang.String str68 = endTag64.tokenType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag69 = endTag64.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "EndTag" + "'", str68, "EndTag");
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendTagName('4');
        startTag2.appendAttributeValue("<!---->");
        startTag2.appendAttributeValue("");
        startTag2.tagName = "</<!---->>";
        boolean boolean12 = startTag2.isEndTag();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        boolean boolean2 = doctype0.forceQuirks;
        boolean boolean3 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        boolean boolean7 = doctype0.isEOF();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.newAttribute();
        startTag2.tagName = "";
        boolean boolean6 = startTag2.isEOF();
        startTag2.appendAttributeValue('4');
        startTag2.appendAttributeName("<!---->4");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("</<<<!---->>>>");
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("</hi!<!---->>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype2 = endTag1.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        boolean boolean2 = doctype0.isDoctype();
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.String str5 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.appendAttributeValue(' ');
        java.lang.String str5 = startTag2.tokenType();
        java.lang.String str6 = startTag2.name();
        startTag2.appendTagName("<!---->");
        boolean boolean9 = startTag2.isEOF();
        org.jsoup.nodes.Attributes attributes10 = startTag2.attributes;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(attributes10);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
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
        java.lang.String str18 = comment13.getData();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!---->" + "'", str15, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isForceQuirks();
        java.lang.String str4 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
        java.lang.String str7 = doctype0.getPublicIdentifier();
        java.lang.String str8 = doctype0.getPublicIdentifier();
        boolean boolean9 = doctype0.isEndTag();
        java.lang.StringBuilder stringBuilder10 = doctype0.systemIdentifier;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendTagName('4');
        startTag2.appendAttributeValue("<!---->");
        startTag2.appendAttributeName(' ');
        startTag2.appendTagName("</<!---->>");
        startTag2.selfClosing = false;
        java.lang.String str14 = startTag2.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<hi!4</<!---->>>" + "'", str14, "<hi!4</<!---->>>");
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.tokenType();
        boolean boolean3 = startTag1.isComment();
        java.lang.String str4 = startTag1.toString();
        boolean boolean5 = startTag1.isComment();
        org.jsoup.parser.Token.Tag tag7 = startTag1.name("");
        startTag1.appendAttributeValue("Character");
        org.jsoup.parser.Token.Tag tag11 = startTag1.name("<<!----><hi!>>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<<!---->>" + "'", str4, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(tag11);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.isEOF();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        doctype0.forceQuirks = true;
        boolean boolean8 = doctype0.isDoctype();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        endTag1.appendAttributeValue("");
        endTag1.appendAttributeValue("</<hi!>>");
        org.jsoup.parser.Token.TokenType tokenType6 = endTag1.type;
        java.lang.String str7 = endTag1.toString();
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</hi!>" + "'", str7, "</hi!>");
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
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
        org.jsoup.parser.Token.Comment comment31 = new org.jsoup.parser.Token.Comment();
        boolean boolean32 = comment31.isStartTag();
        org.jsoup.parser.Token.Comment comment33 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType34 = org.jsoup.parser.Token.TokenType.Doctype;
        comment33.type = tokenType34;
        comment31.type = tokenType34;
        boolean boolean37 = comment31.isStartTag();
        java.lang.String str38 = comment31.toString();
        boolean boolean39 = comment31.isCharacter();
        java.lang.String str40 = comment31.getData();
        xmlTreeBuilder0.insert(comment31);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!---->" + "'", str15, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!---->" + "'", str19, "<!---->");
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + tokenType34 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType34.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<!---->" + "'", str38, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
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
        org.jsoup.parser.Token.Doctype doctype19 = new org.jsoup.parser.Token.Doctype();
        boolean boolean20 = doctype19.isForceQuirks();
        java.lang.String str21 = doctype19.getName();
        boolean boolean22 = doctype19.isCharacter();
        boolean boolean23 = doctype19.isEndTag();
        java.lang.String str24 = doctype19.getSystemIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!---->" + "'", str15, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.appendTagName("<StartTag>");
        java.lang.String str6 = endTag1.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "</<!----><StartTag>>" + "'", str6, "</<!----><StartTag>>");
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
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
        org.jsoup.parser.Token.Character character22 = new org.jsoup.parser.Token.Character("<<!---->>4");
        xmlTreeBuilder0.insert(character22);
        java.lang.String str24 = character22.getData();
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(startTag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<<!---->>4" + "'", str24, "<<!---->>4");
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        boolean boolean2 = doctype0.isDoctype();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        boolean boolean9 = doctype0.isEOF();
        java.lang.StringBuilder stringBuilder10 = doctype0.name;
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
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder3 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder4 = doctype0.name;
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        boolean boolean6 = doctype0.isCharacter();
        java.lang.String str7 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        org.jsoup.parser.Token.TokenType tokenType2 = comment0.type;
        java.lang.String str3 = comment0.toString();
        java.lang.String str4 = comment0.toString();
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character7 = comment0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
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
        boolean boolean30 = endTag1.isCharacter();
        java.lang.String str31 = endTag1.name();
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!---->" + "'", str31, "<!---->");
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType4 = startTag0.type;
        startTag0.tagName = "<!---->";
        org.jsoup.nodes.Attributes attributes7 = null;
        startTag0.attributes = attributes7;
        boolean boolean9 = startTag0.isSelfClosing();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment10 = startTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        boolean boolean2 = startTag1.isSelfClosing();
        boolean boolean3 = startTag1.isDoctype();
        startTag1.newAttribute();
        org.jsoup.parser.Token.Tag tag6 = startTag1.name("<<!---->>");
        tag6.appendAttributeValue('4');
        tag6.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag11 = tag6.asStartTag();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(startTag11);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
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
        startTag2.appendAttributeName("");
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
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.Token.Character character6 = new org.jsoup.parser.Token.Character("");
        java.lang.String str7 = character6.toString();
        java.lang.String str8 = character6.getData();
        java.lang.String str9 = character6.toString();
        boolean boolean10 = character6.isCharacter();
        xmlTreeBuilder0.insert(character6);
        org.jsoup.parser.Token.Character character13 = new org.jsoup.parser.Token.Character("EndTag");
        xmlTreeBuilder0.insert(character13);
        java.lang.String str15 = character13.toString();
        java.lang.String str16 = character13.getData();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EndTag" + "'", str15, "EndTag");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EndTag" + "'", str16, "EndTag");
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("<<!---->>", "<hi!>", parseErrorList3);
        org.jsoup.parser.Token.Character character6 = new org.jsoup.parser.Token.Character("");
        boolean boolean7 = character6.isEndTag();
        java.lang.String str8 = character6.toString();
        java.lang.String str9 = character6.getData();
        java.lang.String str10 = character6.toString();
        boolean boolean11 = character6.isEndTag();
        org.jsoup.parser.Token.Doctype doctype12 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder13 = doctype12.publicIdentifier;
        java.lang.StringBuilder stringBuilder14 = doctype12.publicIdentifier;
        java.lang.String str15 = doctype12.getSystemIdentifier();
        org.jsoup.nodes.Attributes attributes17 = null;
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag("hi!", attributes17);
        org.jsoup.parser.Token.TokenType tokenType19 = startTag18.type;
        startTag18.finaliseTag();
        boolean boolean21 = startTag18.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType22 = startTag18.type;
        doctype12.type = tokenType22;
        character6.type = tokenType22;
        java.lang.String str25 = character6.getData();
        boolean boolean26 = character6.isCharacter();
        java.lang.String str27 = character6.getData();
        xmlTreeBuilder0.insert(character6);
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag();
        startTag29.appendAttributeValue('4');
        boolean boolean32 = startTag29.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType33 = startTag29.type;
        org.jsoup.nodes.Attributes attributes34 = startTag29.getAttributes();
        startTag29.tagName = "</</<!---->>>";
        org.jsoup.nodes.Element element37 = xmlTreeBuilder0.insert(startTag29);
        org.jsoup.parser.Token.Doctype doctype38 = new org.jsoup.parser.Token.Doctype();
        boolean boolean39 = doctype38.isForceQuirks();
        boolean boolean40 = doctype38.isEndTag();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + tokenType19 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType19.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + tokenType22 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType22.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + tokenType33 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType33.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        boolean boolean2 = doctype0.forceQuirks;
        boolean boolean3 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        java.lang.String str5 = doctype0.getSystemIdentifier();
        java.lang.String str6 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("</<<!---->>>");
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        endTag1.appendAttributeValue("");
        endTag1.appendAttributeValue('#');
        org.jsoup.nodes.Attributes attributes6 = endTag1.attributes;
        org.junit.Assert.assertNull(attributes6);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
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
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag("</<!---->StartTag>", attributes18);
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag("</</<!---->>>", attributes18);
        java.lang.String str22 = startTag21.tagName;
        startTag21.tagName = "</<<<!---->>>>";
        java.lang.String str25 = startTag21.tagName;
        java.lang.String str26 = startTag21.tokenType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "</</<!---->>>" + "'", str22, "</</<!---->>>");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "</<<<!---->>>>" + "'", str25, "</<<<!---->>>>");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "StartTag" + "'", str26, "StartTag");
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("Comment");
        java.lang.String str2 = character1.toString();
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str5 = startTag4.tokenType();
        boolean boolean6 = startTag4.isComment();
        java.lang.String str7 = startTag4.toString();
        boolean boolean8 = startTag4.isComment();
        org.jsoup.parser.Token.Tag tag10 = startTag4.name("");
        boolean boolean11 = tag10.isStartTag();
        org.jsoup.parser.Token.Doctype doctype12 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str13 = doctype12.getPublicIdentifier();
        java.lang.String str14 = doctype12.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType15 = org.jsoup.parser.Token.TokenType.EOF;
        doctype12.type = tokenType15;
        tag10.type = tokenType15;
        character1.type = tokenType15;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Comment" + "'", str2, "Comment");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<<!---->>" + "'", str7, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.EOF));
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.tokenType();
        boolean boolean3 = startTag1.isComment();
        boolean boolean4 = startTag1.isStartTag();
        startTag1.appendAttributeName("<</<hi!>>>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("hi!", attributes3);
        startTag4.newAttribute();
        startTag4.tagName = "";
        org.jsoup.nodes.Attributes attributes8 = startTag4.attributes;
        startTag1.attributes = attributes8;
        startTag1.tagName = "<!---->";
        startTag1.appendAttributeName('a');
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType1 = org.jsoup.parser.Token.TokenType.Doctype;
        comment0.type = tokenType1;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        org.jsoup.parser.Token.TokenType tokenType4 = comment0.type;
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        java.lang.String str6 = comment0.toString();
        org.junit.Assert.assertTrue("'" + tokenType1 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType1.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("<<!---->>", "<hi!>", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.getData();
        boolean boolean7 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment5);
        org.jsoup.parser.Token.Character character9 = new org.jsoup.parser.Token.Character("");
        java.lang.String str10 = character9.toString();
        java.lang.String str11 = character9.getData();
        java.lang.String str12 = character9.getData();
        xmlTreeBuilder0.insert(character9);
        org.jsoup.parser.Token token14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = xmlTreeBuilder0.process(token14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
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
        java.lang.StringBuilder stringBuilder17 = doctype0.systemIdentifier;
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
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList3);
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str7 = endTag6.toString();
        java.lang.String str8 = endTag6.toString();
        boolean boolean9 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag6);
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag("hi!", attributes11);
        boolean boolean13 = startTag12.isComment();
        boolean boolean14 = startTag12.selfClosing;
        startTag12.newAttribute();
        org.jsoup.nodes.Element element16 = xmlTreeBuilder0.insert(startTag12);
        org.jsoup.parser.Token.Doctype doctype17 = new org.jsoup.parser.Token.Doctype();
        boolean boolean18 = doctype17.isForceQuirks();
        java.lang.String str19 = doctype17.getName();
        boolean boolean20 = doctype17.isForceQuirks();
        java.lang.String str21 = doctype17.getPublicIdentifier();
        boolean boolean22 = doctype17.isStartTag();
        doctype17.forceQuirks = false;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</<!---->>" + "'", str7, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</<!---->>" + "'", str8, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("</</<!---->>>");
        org.jsoup.parser.Token.Character character2 = character1.asCharacter();
        java.lang.String str3 = character1.toString();
        org.junit.Assert.assertNotNull(character2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</</<!---->>>" + "'", str3, "</</<!---->>>");
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        endTag1.appendTagName("StartTag");
        org.jsoup.parser.Token.Tag tag8 = endTag1.name("hi!EndTag");
        java.lang.String str9 = endTag1.toString();
        java.lang.String str10 = endTag1.toString();
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "</hi!EndTag>" + "'", str9, "</hi!EndTag>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "</hi!EndTag>" + "'", str10, "</hi!EndTag>");
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        boolean boolean2 = comment0.isEOF();
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        org.jsoup.parser.Token.Doctype doctype5 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str6 = doctype5.getName();
        java.lang.String str7 = doctype5.tokenType();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        startTag8.appendAttributeValue('4');
        boolean boolean11 = startTag8.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType12 = startTag8.type;
        java.lang.String str13 = startTag8.tagName;
        boolean boolean14 = startTag8.isEndTag();
        org.jsoup.nodes.Attributes attributes15 = startTag8.getAttributes();
        org.jsoup.nodes.Attributes attributes16 = startTag8.getAttributes();
        startTag8.appendAttributeName('a');
        org.jsoup.parser.Token.TokenType tokenType19 = startTag8.type;
        doctype5.type = tokenType19;
        comment0.type = tokenType19;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Doctype" + "'", str7, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertTrue("'" + tokenType19 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType19.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.forceQuirks = false;
        java.lang.String str5 = doctype0.tokenType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Doctype" + "'", str5, "Doctype");
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        startTag1.appendAttributeValue('4');
        boolean boolean4 = startTag1.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType5 = startTag1.type;
        org.jsoup.nodes.Attributes attributes6 = startTag1.getAttributes();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("", attributes6);
        startTag7.appendAttributeName('#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = startTag7.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        endTag1.appendAttributeValue("");
        endTag1.appendAttributeValue('#');
        boolean boolean6 = endTag1.isSelfClosing();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList7);
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        xmlTreeBuilder0.initialiseParse("<!---->", "hi!", parseErrorList11);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder0.initialiseParse("<<!---->>", "", parseErrorList15);
        org.jsoup.parser.Token.Comment comment17 = new org.jsoup.parser.Token.Comment();
        boolean boolean18 = comment17.isStartTag();
        org.jsoup.parser.Token.Comment comment19 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType20 = org.jsoup.parser.Token.TokenType.Doctype;
        comment19.type = tokenType20;
        comment17.type = tokenType20;
        boolean boolean23 = comment17.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType24 = comment17.type;
        java.lang.String str25 = comment17.getData();
        java.lang.StringBuilder stringBuilder26 = comment17.data;
        boolean boolean27 = comment17.isEndTag();
        xmlTreeBuilder0.insert(comment17);
        java.lang.StringBuilder stringBuilder29 = comment17.data;
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + tokenType24 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType24.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(stringBuilder29);
        org.junit.Assert.assertEquals(stringBuilder29.toString(), "");
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
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
        org.jsoup.parser.Token.Character character20 = new org.jsoup.parser.Token.Character("<<!---->>");
        java.lang.String str21 = character20.toString();
        xmlTreeBuilder0.insert(character20);
        java.lang.String str23 = character20.getData();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!---->" + "'", str15, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<<!---->>" + "'", str21, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<<!---->>" + "'", str23, "<<!---->>");
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.selfClosing = false;
        startTag0.appendTagName("hi!");
        org.jsoup.nodes.Attributes attributes5 = startTag0.getAttributes();
        startTag0.appendAttributeValue('a');
        org.jsoup.parser.Token.StartTag startTag8 = startTag0.asStartTag();
        startTag8.appendAttributeName('4');
        org.jsoup.nodes.Attributes attributes11 = startTag8.attributes;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag12 = startTag8.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.appendAttributeValue(' ');
        java.lang.String str5 = startTag2.tokenType();
        java.lang.String str6 = startTag2.name();
        startTag2.appendTagName("<!---->");
        startTag2.tagName = "StartTag";
        org.jsoup.parser.Token.StartTag startTag11 = startTag2.asStartTag();
        boolean boolean12 = startTag11.isEndTag();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isEOF();
        startTag0.appendAttributeValue("hi!");
        startTag0.appendTagName('4');
        boolean boolean9 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag11 = startTag0.name("hi!");
        boolean boolean12 = tag11.isSelfClosing();
        tag11.appendAttributeName("<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        startTag1.appendAttributeValue('4');
        boolean boolean4 = startTag1.isEndTag();
        boolean boolean5 = startTag1.isEOF();
        startTag1.appendAttributeValue("hi!");
        startTag1.appendTagName('4');
        boolean boolean10 = startTag1.isSelfClosing();
        org.jsoup.parser.Token.Tag tag12 = startTag1.name("hi!");
        startTag1.appendAttributeValue("<!----><<!---->>");
        java.lang.String str15 = startTag1.tokenType();
        java.lang.String str16 = startTag1.tagName;
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        startTag17.appendAttributeValue('4');
        boolean boolean20 = startTag17.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType21 = startTag17.type;
        java.lang.String str22 = startTag17.tagName;
        boolean boolean23 = startTag17.isEndTag();
        org.jsoup.nodes.Attributes attributes24 = startTag17.getAttributes();
        startTag1.attributes = attributes24;
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag("hi!<!---->", attributes24);
        startTag26.newAttribute();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "StartTag" + "'", str15, "StartTag");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + tokenType21 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType21.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(attributes24);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.Token.Character character6 = new org.jsoup.parser.Token.Character("");
        java.lang.String str7 = character6.toString();
        java.lang.String str8 = character6.toString();
        boolean boolean9 = character6.isDoctype();
        xmlTreeBuilder0.insert(character6);
        org.jsoup.parser.Token.EndTag endTag13 = new org.jsoup.parser.Token.EndTag("</<!---->>");
        java.lang.String str14 = endTag13.toString();
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        startTag16.appendAttributeValue('4');
        boolean boolean19 = startTag16.isEndTag();
        startTag16.newAttribute();
        boolean boolean21 = startTag16.isComment();
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes25 = null;
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag("hi!", attributes25);
        startTag26.newAttribute();
        startTag26.tagName = "";
        org.jsoup.nodes.Attributes attributes30 = startTag26.attributes;
        startTag23.attributes = attributes30;
        startTag16.attributes = attributes30;
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag("<!---->", attributes30);
        endTag13.attributes = attributes30;
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag("hi!EndTag", attributes30);
        org.jsoup.nodes.Element element36 = xmlTreeBuilder0.insert(startTag35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "</</<!---->>>" + "'", str14, "</</<!---->>>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNotNull(element36);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<hi!  4=\"\">");
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
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
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        xmlTreeBuilder0.initialiseParse("<<!---->>4", "<<!----><hi!>>", parseErrorList21);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!---->" + "'", str12, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.forceQuirks = false;
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        boolean boolean7 = doctype0.isForceQuirks();
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
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getName();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.StringBuilder stringBuilder4 = doctype0.name;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
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
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder43 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        xmlTreeBuilder43.initialiseParse("</<!---->>", "</<!---->>", parseErrorList46);
        org.jsoup.parser.Token.Comment comment48 = new org.jsoup.parser.Token.Comment();
        java.lang.String str49 = comment48.toString();
        org.jsoup.parser.Token.TokenType tokenType50 = comment48.type;
        java.lang.String str51 = comment48.getData();
        xmlTreeBuilder43.insert(comment48);
        org.jsoup.parser.Token.Comment comment53 = new org.jsoup.parser.Token.Comment();
        boolean boolean54 = comment53.isStartTag();
        java.lang.String str55 = comment53.toString();
        boolean boolean56 = comment53.isCharacter();
        xmlTreeBuilder43.insert(comment53);
        java.lang.String str58 = comment53.getData();
        java.lang.StringBuilder stringBuilder59 = comment53.data;
        boolean boolean60 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment53);
        java.lang.StringBuilder stringBuilder61 = comment53.data;
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
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "<!---->" + "'", str49, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType50 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType50.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "<!---->" + "'", str55, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(stringBuilder59);
        org.junit.Assert.assertEquals(stringBuilder59.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(stringBuilder61);
        org.junit.Assert.assertEquals(stringBuilder61.toString(), "");
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.forceQuirks;
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        java.lang.String str7 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes1 = startTag0.getAttributes();
        org.jsoup.nodes.Attributes attributes2 = startTag0.attributes;
        org.junit.Assert.assertNotNull(attributes1);
        org.junit.Assert.assertNotNull(attributes2);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        boolean boolean2 = startTag1.isSelfClosing();
        boolean boolean3 = startTag1.isDoctype();
        startTag1.newAttribute();
        org.jsoup.parser.Token.Tag tag6 = startTag1.name("<<!---->>");
        tag6.appendAttributeValue('4');
        tag6.finaliseTag();
        java.lang.String str10 = tag6.tagName;
        tag6.appendAttributeName("<</hi!<!---->>>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<<!---->>" + "'", str10, "<<!---->>");
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendTagName('4');
        startTag2.appendAttributeValue("<!---->");
        startTag2.appendAttributeName(' ');
        java.lang.String str10 = startTag2.toString();
        startTag2.appendAttributeValue(" ");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<hi!4>" + "'", str10, "<hi!4>");
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType5 = org.jsoup.parser.Token.TokenType.Doctype;
        comment4.type = tokenType5;
        startTag2.type = tokenType5;
        startTag2.appendAttributeName("hi!");
        boolean boolean10 = startTag2.isComment();
        org.jsoup.parser.Token.StartTag startTag11 = startTag2.asStartTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag12 = startTag11.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(startTag11);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        org.jsoup.parser.Token.Tag tag3 = endTag1.name("<<!---->>");
        java.lang.String str4 = endTag1.toString();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes8 = null;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("hi!", attributes8);
        startTag9.newAttribute();
        startTag9.tagName = "";
        org.jsoup.nodes.Attributes attributes13 = startTag9.attributes;
        startTag6.attributes = attributes13;
        boolean boolean15 = startTag6.isDoctype();
        org.jsoup.parser.Token.StartTag startTag16 = startTag6.asStartTag();
        boolean boolean17 = startTag6.isEndTag();
        startTag6.finaliseTag();
        org.jsoup.parser.Token.TokenType tokenType19 = startTag6.type;
        endTag1.type = tokenType19;
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</<<!---->>>" + "'", str4, "</<<!---->>>");
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(startTag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + tokenType19 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType19.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        boolean boolean4 = startTag0.isDoctype();
        java.lang.String str5 = startTag0.tokenType();
        startTag0.appendTagName('a');
        org.jsoup.parser.Token.Tag tag9 = startTag0.name("hi!");
        boolean boolean10 = startTag0.isSelfClosing();
        java.lang.String str11 = startTag0.tagName;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        startTag0.newAttribute();
        boolean boolean5 = startTag0.isComment();
        boolean boolean6 = startTag0.selfClosing;
        java.lang.String str7 = startTag0.tagName;
        startTag0.selfClosing = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        startTag1.appendTagName("<<!---->>");
        java.lang.String str4 = startTag1.tokenType();
        boolean boolean5 = startTag1.isStartTag();
        startTag1.appendAttributeName("</<hi!>>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "StartTag" + "'", str4, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
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
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        xmlTreeBuilder0.initialiseParse("EndTag", "</<!---->>", parseErrorList18);
        org.jsoup.nodes.Attributes attributes21 = null;
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag("hi!", attributes21);
        boolean boolean23 = startTag22.isComment();
        org.jsoup.parser.Token.Comment comment24 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType25 = org.jsoup.parser.Token.TokenType.Doctype;
        comment24.type = tokenType25;
        startTag22.type = tokenType25;
        java.lang.String str28 = startTag22.tagName;
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes32 = null;
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag("hi!", attributes32);
        startTag33.newAttribute();
        startTag33.tagName = "";
        org.jsoup.nodes.Attributes attributes37 = startTag33.attributes;
        startTag30.attributes = attributes37;
        startTag22.attributes = attributes37;
        java.lang.String str40 = startTag22.tagName;
        boolean boolean41 = startTag22.isCharacter();
        startTag22.appendAttributeValue("<<hi!>StartTag>");
        org.jsoup.nodes.Attributes attributes44 = startTag22.attributes;
        org.jsoup.nodes.Element element45 = xmlTreeBuilder0.insert(startTag22);
        org.jsoup.parser.Token.TokenType tokenType46 = startTag22.type;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + tokenType25 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType25.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(attributes44);
        org.junit.Assert.assertNotNull(element45);
        org.junit.Assert.assertTrue("'" + tokenType46 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType46.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        startTag0.newAttribute();
        boolean boolean5 = startTag0.isComment();
        org.jsoup.parser.Token.Tag tag7 = startTag0.name("<hi!>");
        org.jsoup.parser.Token.Tag tag9 = tag7.name("Doctype");
        org.jsoup.nodes.Attributes attributes10 = tag7.attributes;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        doctype0.forceQuirks = true;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        boolean boolean7 = doctype0.isForceQuirks();
        doctype0.forceQuirks = false;
        boolean boolean10 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder11 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.Doctype doctype12 = doctype0.asDoctype();
        boolean boolean13 = doctype12.isStartTag();
        java.lang.String str14 = doctype12.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder15 = doctype12.name;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertNotNull(doctype12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.tokenType();
        boolean boolean3 = startTag1.isComment();
        java.lang.String str4 = startTag1.toString();
        boolean boolean5 = startTag1.isComment();
        org.jsoup.parser.Token.Tag tag7 = startTag1.name("");
        org.jsoup.parser.Token.Tag tag9 = tag7.name("<<!---->>");
        tag9.finaliseTag();
        boolean boolean11 = tag9.isEOF();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<<!---->>" + "'", str4, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.forceQuirks;
        boolean boolean5 = doctype0.forceQuirks;
        boolean boolean6 = doctype0.isForceQuirks();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character7 = doctype0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
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
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "StartTag", parseErrorList19);
        org.jsoup.parser.Token.Character character22 = new org.jsoup.parser.Token.Character("");
        java.lang.String str23 = character22.toString();
        java.lang.String str24 = character22.toString();
        boolean boolean25 = character22.isDoctype();
        xmlTreeBuilder0.insert(character22);
        org.jsoup.parser.Token.Doctype doctype27 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder28 = doctype27.publicIdentifier;
        java.lang.StringBuilder stringBuilder29 = doctype27.publicIdentifier;
        boolean boolean30 = doctype27.forceQuirks;
        java.lang.String str31 = doctype27.getName();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!---->" + "'", str10, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!---->" + "'", str14, "<!---->");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder29);
        org.junit.Assert.assertEquals(stringBuilder29.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
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
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag("<!---->");
        boolean boolean37 = startTag36.isSelfClosing();
        boolean boolean38 = startTag36.isDoctype();
        boolean boolean39 = startTag36.isSelfClosing();
        org.jsoup.nodes.Element element40 = xmlTreeBuilder0.insert(startTag36);
        startTag36.appendTagName("hi!");
        startTag36.appendAttributeName("<!----><<!---->>a");
        boolean boolean45 = startTag36.isCharacter();
        boolean boolean46 = startTag36.isCharacter();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "StartTag" + "'", str31, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        boolean boolean4 = startTag0.isEOF();
        startTag0.newAttribute();
        boolean boolean6 = startTag0.isSelfClosing();
        startTag0.tagName = "hi!EndTag";
        boolean boolean9 = startTag0.selfClosing;
        java.lang.Class<?> wildcardClass10 = startTag0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<hi!Comment>");
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        org.jsoup.parser.Token.TokenType tokenType3 = startTag2.type;
        startTag2.selfClosing = true;
        startTag2.selfClosing = true;
        java.lang.String str8 = startTag2.toString();
        org.jsoup.parser.Token.TokenType tokenType9 = startTag2.type;
        org.jsoup.nodes.Attributes attributes10 = startTag2.attributes;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character11 = startTag2.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<hi!>" + "'", str8, "<hi!>");
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(attributes10);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        endTag1.appendTagName("StartTag");
        endTag1.newAttribute();
        org.jsoup.parser.Token.TokenType tokenType8 = endTag1.type;
        java.lang.String str9 = endTag1.toString();
        boolean boolean10 = endTag1.isSelfClosing();
        java.lang.String str11 = endTag1.toString();
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "</<!---->StartTag>" + "'", str9, "</<!---->StartTag>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "</<!---->StartTag>" + "'", str11, "</<!---->StartTag>");
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        boolean boolean4 = startTag0.isDoctype();
        java.lang.String str5 = startTag0.tokenType();
        boolean boolean6 = startTag0.isEOF();
        startTag0.appendAttributeValue("<hi!>");
        org.jsoup.nodes.Attributes attributes9 = startTag0.attributes;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
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
        boolean boolean18 = doctype0.isForceQuirks();
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
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
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
        java.lang.String str43 = character20.getData();
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
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
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
        org.jsoup.parser.ParseErrorList parseErrorList85 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>4", parseErrorList85);
        org.jsoup.parser.ParseErrorList parseErrorList89 = null;
        xmlTreeBuilder0.initialiseParse("<<!---->>", "<hi!<!---->>", parseErrorList89);
        org.jsoup.parser.ParseErrorList parseErrorList93 = null;
        xmlTreeBuilder0.initialiseParse("<<hi!>>", "<<!---->StartTag>", parseErrorList93);
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
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag();
        startTag2.appendAttributeValue('4');
        boolean boolean5 = startTag2.isEndTag();
        startTag2.newAttribute();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        startTag7.appendAttributeValue('4');
        org.jsoup.nodes.Attributes attributes10 = startTag7.attributes;
        startTag2.attributes = attributes10;
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag("<<hi!>StartTag>", attributes10);
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("</EndTag>", attributes10);
        boolean boolean14 = startTag13.selfClosing;
        startTag13.newAttribute();
        java.lang.String str16 = startTag13.toString();
        startTag13.appendTagName('#');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<</EndTag>>" + "'", str16, "<</EndTag>>");
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        boolean boolean2 = doctype0.forceQuirks;
        boolean boolean3 = doctype0.isForceQuirks();
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        boolean boolean6 = doctype0.isForceQuirks();
        doctype0.forceQuirks = false;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder3 = doctype0.publicIdentifier;
        java.lang.String str4 = doctype0.getName();
        java.lang.String str5 = doctype0.getName();
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        java.lang.String str7 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isEOF();
        startTag0.appendAttributeValue("hi!");
        startTag0.appendAttributeName('#');
        boolean boolean9 = startTag0.isSelfClosing();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character10 = startTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        org.jsoup.nodes.Attributes attributes4 = startTag2.getAttributes();
        boolean boolean5 = startTag2.isCharacter();
        boolean boolean6 = startTag2.isStartTag();
        startTag2.appendAttributeName('4');
        startTag2.tagName = "Character";
        startTag2.appendTagName('a');
        org.jsoup.nodes.Attributes attributes14 = null;
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag("hi!", attributes14);
        boolean boolean16 = startTag15.isComment();
        startTag15.appendAttributeName("StartTag");
        java.lang.String str19 = startTag15.name();
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str22 = startTag21.tokenType();
        boolean boolean23 = startTag21.isComment();
        java.lang.String str24 = startTag21.toString();
        boolean boolean25 = startTag21.isComment();
        org.jsoup.parser.Token.Tag tag27 = startTag21.name("");
        org.jsoup.parser.Token.Tag tag29 = tag27.name("<<!---->>");
        tag29.finaliseTag();
        org.jsoup.parser.Token.Character character32 = new org.jsoup.parser.Token.Character("");
        boolean boolean33 = character32.isEndTag();
        java.lang.String str34 = character32.toString();
        java.lang.String str35 = character32.getData();
        java.lang.String str36 = character32.toString();
        boolean boolean37 = character32.isEndTag();
        org.jsoup.parser.Token.Doctype doctype38 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder39 = doctype38.publicIdentifier;
        java.lang.StringBuilder stringBuilder40 = doctype38.publicIdentifier;
        java.lang.String str41 = doctype38.getSystemIdentifier();
        org.jsoup.nodes.Attributes attributes43 = null;
        org.jsoup.parser.Token.StartTag startTag44 = new org.jsoup.parser.Token.StartTag("hi!", attributes43);
        org.jsoup.parser.Token.TokenType tokenType45 = startTag44.type;
        startTag44.finaliseTag();
        boolean boolean47 = startTag44.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType48 = startTag44.type;
        doctype38.type = tokenType48;
        character32.type = tokenType48;
        tag29.type = tokenType48;
        startTag15.type = tokenType48;
        org.jsoup.nodes.Attributes attributes54 = null;
        org.jsoup.parser.Token.StartTag startTag55 = new org.jsoup.parser.Token.StartTag("hi!", attributes54);
        startTag55.appendAttributeValue(' ');
        java.lang.String str58 = startTag55.tokenType();
        java.lang.String str59 = startTag55.name();
        startTag55.appendTagName("<!---->");
        startTag55.tagName = "StartTag";
        startTag55.finaliseTag();
        java.lang.String str65 = startTag55.name();
        org.jsoup.parser.Token.TokenType tokenType66 = startTag55.type;
        startTag15.type = tokenType66;
        startTag2.type = tokenType66;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "StartTag" + "'", str22, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<<!---->>" + "'", str24, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(stringBuilder39);
        org.junit.Assert.assertEquals(stringBuilder39.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder40);
        org.junit.Assert.assertEquals(stringBuilder40.toString(), "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + tokenType45 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType45.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + tokenType48 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType48.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "StartTag" + "'", str58, "StartTag");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "StartTag" + "'", str65, "StartTag");
        org.junit.Assert.assertTrue("'" + tokenType66 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType66.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        endTag1.appendTagName("StartTag");
        endTag1.newAttribute();
        org.jsoup.parser.Token.TokenType tokenType8 = endTag1.type;
        endTag1.appendAttributeValue("</<hi!>>");
        java.lang.String str11 = endTag1.toString();
        org.jsoup.nodes.Attributes attributes15 = null;
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag("hi!", attributes15);
        startTag16.newAttribute();
        startTag16.tagName = "";
        org.jsoup.nodes.Attributes attributes20 = startTag16.attributes;
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag("", attributes20);
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        startTag22.appendAttributeValue('4');
        boolean boolean25 = startTag22.isDoctype();
        org.jsoup.nodes.Attributes attributes26 = startTag22.attributes;
        startTag21.attributes = attributes26;
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag("<!----><<!---->>", attributes26);
        endTag1.attributes = attributes26;
        endTag1.finaliseTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype31 = endTag1.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "</<!---->StartTag>" + "'", str11, "</<!---->StartTag>");
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(attributes26);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str2 = endTag1.toString();
        endTag1.appendTagName("<<!---->>");
        java.lang.String str5 = endTag1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</<!---->>" + "'", str2, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "</<!----><<!---->>>" + "'", str5, "</<!----><<!---->>>");
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("hi!", attributes3);
        startTag4.appendAttributeValue(' ');
        boolean boolean7 = startTag4.isSelfClosing();
        org.jsoup.parser.Token.Tag tag9 = startTag4.name("<<!---->>");
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        startTag10.appendAttributeValue('4');
        boolean boolean13 = startTag10.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType14 = startTag10.type;
        org.jsoup.nodes.Attributes attributes15 = startTag10.getAttributes();
        org.jsoup.nodes.Attributes attributes16 = startTag10.attributes;
        tag9.attributes = attributes16;
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag("</<!---->StartTag>", attributes16);
        boolean boolean19 = startTag18.isEndTag();
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        startTag20.selfClosing = false;
        startTag20.appendTagName("hi!");
        startTag20.appendTagName("<<!----><hi!>>");
        java.lang.String str27 = startTag20.name();
        org.jsoup.nodes.Attributes attributes28 = startTag20.getAttributes();
        startTag18.attributes = attributes28;
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag("</<hi!>>", attributes28);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!<<!----><hi!>>" + "'", str27, "hi!<<!----><hi!>>");
        org.junit.Assert.assertNotNull(attributes28);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType4 = startTag0.type;
        java.lang.String str5 = startTag0.tagName;
        boolean boolean6 = startTag0.isEndTag();
        boolean boolean7 = startTag0.isCharacter();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag8 = startTag0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
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
        org.jsoup.parser.Token.Character character24 = new org.jsoup.parser.Token.Character("");
        boolean boolean25 = character24.isEndTag();
        boolean boolean26 = character24.isCharacter();
        org.jsoup.parser.Token.TokenType tokenType27 = character24.type;
        xmlTreeBuilder0.insert(character24);
        boolean boolean29 = character24.isStartTag();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!---->" + "'", str15, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + tokenType27 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType27.equals(org.jsoup.parser.Token.TokenType.Character));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.appendAttributeValue(' ');
        java.lang.String str5 = startTag2.tokenType();
        java.lang.String str6 = startTag2.name();
        boolean boolean7 = startTag2.isSelfClosing();
        startTag2.appendAttributeName("<<!---->>4");
        org.jsoup.parser.Token.TokenType tokenType10 = startTag2.type;
        boolean boolean11 = startTag2.isEndTag();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        startTag1.appendAttributeValue('4');
        boolean boolean4 = startTag1.isEndTag();
        boolean boolean5 = startTag1.isEOF();
        startTag1.appendAttributeValue("hi!");
        startTag1.appendTagName('4');
        boolean boolean10 = startTag1.isSelfClosing();
        org.jsoup.parser.Token.Tag tag12 = startTag1.name("hi!");
        startTag1.appendAttributeValue("<!----><<!---->>");
        java.lang.String str15 = startTag1.tokenType();
        java.lang.String str16 = startTag1.tagName;
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        startTag17.appendAttributeValue('4');
        boolean boolean20 = startTag17.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType21 = startTag17.type;
        java.lang.String str22 = startTag17.tagName;
        boolean boolean23 = startTag17.isEndTag();
        org.jsoup.nodes.Attributes attributes24 = startTag17.getAttributes();
        startTag1.attributes = attributes24;
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag("hi!<!---->", attributes24);
        boolean boolean27 = startTag26.isEndTag();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "StartTag" + "'", str15, "StartTag");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + tokenType21 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType21.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("</</hi!<!---->>>");
        java.lang.String str2 = character1.getData();
        org.jsoup.parser.Token.Character character3 = character1.asCharacter();
        java.lang.String str4 = character3.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</</hi!<!---->>>" + "'", str2, "</</hi!<!---->>>");
        org.junit.Assert.assertNotNull(character3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</</hi!<!---->>>" + "'", str4, "</</hi!<!---->>>");
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str2 = endTag1.toString();
        endTag1.appendTagName("<<!---->>");
        org.jsoup.nodes.Attributes attributes9 = null;
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("hi!", attributes9);
        startTag10.newAttribute();
        startTag10.tagName = "";
        org.jsoup.nodes.Attributes attributes14 = startTag10.attributes;
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag("", attributes14);
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        startTag16.appendAttributeValue('4');
        boolean boolean19 = startTag16.isDoctype();
        org.jsoup.nodes.Attributes attributes20 = startTag16.attributes;
        startTag15.attributes = attributes20;
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag("<!----><<!---->>", attributes20);
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag("</</<!---->>>", attributes20);
        endTag1.attributes = attributes20;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character25 = endTag1.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</<!---->>" + "'", str2, "</<!---->>");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributes20);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
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
        java.lang.String str20 = character1.toString();
        java.lang.String str21 = character1.getData();
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
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
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
        boolean boolean15 = doctype0.isCharacter();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        startTag0.newAttribute();
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        startTag5.appendAttributeValue('4');
        org.jsoup.nodes.Attributes attributes8 = startTag5.attributes;
        startTag0.attributes = attributes8;
        startTag0.tagName = "StartTag";
        boolean boolean12 = startTag0.isCharacter();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
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
        java.lang.Class<?> wildcardClass16 = tag15.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
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
        org.jsoup.parser.Token.Doctype doctype16 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<<!---->>" + "'", str14, "<<!---->>");
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        boolean boolean4 = startTag2.selfClosing;
        boolean boolean5 = startTag2.isStartTag();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
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
        boolean boolean23 = endTag1.selfClosing;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</</<!---->>>" + "'", str2, "</</<!---->>>");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
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
        doctype0.forceQuirks = true;
        java.lang.String str15 = doctype0.getName();
        java.lang.String str16 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        boolean boolean4 = startTag2.selfClosing;
        boolean boolean5 = startTag2.isEndTag();
        startTag2.finaliseTag();
        boolean boolean7 = startTag2.isEndTag();
        java.lang.String str8 = startTag2.toString();
        startTag2.tagName = "<</<hi!>>>";
        org.jsoup.nodes.Attributes attributes11 = startTag2.attributes;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<hi!>" + "'", str8, "<hi!>");
        org.junit.Assert.assertNull(attributes11);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
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
        boolean boolean27 = tag26.isSelfClosing();
        boolean boolean28 = tag26.selfClosing;
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        boolean boolean4 = startTag2.selfClosing;
        startTag2.newAttribute();
        java.lang.String str6 = startTag2.tagName;
        startTag2.tagName = "<!----><<!---->>";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<hi!4hi!EndTag>");
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("</<!----><StartTag>>");
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("<!---->");
        boolean boolean3 = startTag2.isSelfClosing();
        boolean boolean4 = startTag2.isDoctype();
        startTag2.newAttribute();
        startTag2.tagName = "</<!---->>";
        org.jsoup.nodes.Attributes attributes8 = startTag2.attributes;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("", attributes8);
        boolean boolean10 = startTag9.isEndTag();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        boolean boolean2 = startTag1.isSelfClosing();
        boolean boolean3 = startTag1.isDoctype();
        boolean boolean4 = startTag1.isSelfClosing();
        startTag1.appendTagName("<hi!>");
        startTag1.selfClosing = true;
        boolean boolean9 = startTag1.isStartTag();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.forceQuirks = false;
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character10 = doctype0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<<!---->>4");
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType5 = org.jsoup.parser.Token.TokenType.Doctype;
        comment4.type = tokenType5;
        startTag2.type = tokenType5;
        startTag2.appendAttributeName("hi!");
        boolean boolean10 = startTag2.isCharacter();
        java.lang.String str11 = startTag2.name();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag12 = startTag2.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        boolean boolean4 = startTag2.selfClosing;
        boolean boolean5 = startTag2.isEndTag();
        org.jsoup.nodes.Attributes attributes6 = startTag2.attributes;
        org.jsoup.parser.Token.Tag tag8 = startTag2.name("EndTag");
        startTag2.selfClosing = false;
        startTag2.appendTagName('#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(attributes6);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        doctype0.forceQuirks = true;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        boolean boolean7 = doctype0.isForceQuirks();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment8 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
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
        org.jsoup.parser.Token.StartTag startTag37 = new org.jsoup.parser.Token.StartTag("<</EndTag>>");
        org.jsoup.nodes.Element element38 = xmlTreeBuilder0.insert(startTag37);
        org.jsoup.parser.Token.EndTag endTag40 = new org.jsoup.parser.Token.EndTag();
        boolean boolean41 = endTag40.selfClosing;
        endTag40.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes44 = endTag40.getAttributes();
        boolean boolean45 = endTag40.isSelfClosing();
        org.jsoup.parser.Token.EndTag endTag46 = endTag40.asEndTag();
        org.jsoup.parser.Token.StartTag startTag48 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes50 = null;
        org.jsoup.parser.Token.StartTag startTag51 = new org.jsoup.parser.Token.StartTag("hi!", attributes50);
        startTag51.newAttribute();
        startTag51.tagName = "";
        org.jsoup.nodes.Attributes attributes55 = startTag51.attributes;
        startTag48.attributes = attributes55;
        endTag46.attributes = attributes55;
        org.jsoup.parser.Token.StartTag startTag58 = new org.jsoup.parser.Token.StartTag("</</<!---->>>", attributes55);
        boolean boolean59 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag58);
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
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(attributes44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(endTag46);
        org.junit.Assert.assertNotNull(attributes55);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isEOF();
        startTag0.appendAttributeValue("hi!");
        boolean boolean7 = startTag0.selfClosing;
        startTag0.selfClosing = false;
        org.jsoup.parser.Token.Tag tag11 = startTag0.name("<<!---->>4");
        boolean boolean12 = startTag0.isEOF();
        startTag0.tagName = "<<hi!>StartTag>";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        boolean boolean2 = startTag1.isSelfClosing();
        boolean boolean3 = startTag1.isDoctype();
        startTag1.newAttribute();
        org.jsoup.parser.Token.Tag tag6 = startTag1.name("<<!---->>");
        boolean boolean7 = tag6.isCharacter();
        tag6.appendAttributeValue('#');
        boolean boolean10 = tag6.isStartTag();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.tokenType();
        boolean boolean3 = startTag1.selfClosing;
        java.lang.String str4 = startTag1.toString();
        org.jsoup.parser.Token.StartTag startTag5 = startTag1.asStartTag();
        startTag5.appendAttributeName("<<hi!>StartTag>");
        startTag5.selfClosing = false;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<<!---->>" + "'", str4, "<<!---->>");
        org.junit.Assert.assertNotNull(startTag5);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        boolean boolean2 = doctype0.isDoctype();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        boolean boolean9 = doctype0.forceQuirks;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList3);
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str7 = endTag6.toString();
        java.lang.String str8 = endTag6.toString();
        boolean boolean9 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag6);
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag("hi!", attributes11);
        boolean boolean13 = startTag12.isComment();
        boolean boolean14 = startTag12.selfClosing;
        startTag12.newAttribute();
        org.jsoup.nodes.Element element16 = xmlTreeBuilder0.insert(startTag12);
        org.jsoup.parser.Token.Doctype doctype17 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str18 = doctype17.getName();
        java.lang.StringBuilder stringBuilder19 = doctype17.name;
        java.lang.StringBuilder stringBuilder20 = doctype17.name;
        doctype17.forceQuirks = true;
        java.lang.String str23 = doctype17.getSystemIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</<!---->>" + "'", str7, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</<!---->>" + "'", str8, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(element16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
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
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag("<!---->");
        boolean boolean37 = startTag36.isSelfClosing();
        boolean boolean38 = startTag36.isDoctype();
        boolean boolean39 = startTag36.isSelfClosing();
        org.jsoup.nodes.Element element40 = xmlTreeBuilder0.insert(startTag36);
        org.jsoup.parser.ParseErrorList parseErrorList43 = null;
        xmlTreeBuilder0.initialiseParse("4#", "<!---->hi!", parseErrorList43);
        org.jsoup.parser.ParseErrorList parseErrorList47 = null;
        xmlTreeBuilder0.initialiseParse("< >", "EndTag", parseErrorList47);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "StartTag" + "'", str31, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(element40);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendAttributeName("StartTag");
        java.lang.String str6 = startTag2.name();
        startTag2.appendAttributeValue(' ');
        org.jsoup.nodes.Attributes attributes9 = startTag2.attributes;
        boolean boolean10 = startTag2.isComment();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
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
        java.lang.String str16 = comment10.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!---->" + "'", str12, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!---->" + "'", str16, "<!---->");
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.tokenType();
        boolean boolean3 = startTag1.isSelfClosing();
        startTag1.appendAttributeValue("EndTag");
        boolean boolean6 = startTag1.isComment();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("</<hi!>>");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag();
        startTag2.appendAttributeValue('4');
        boolean boolean5 = startTag2.isEndTag();
        startTag2.newAttribute();
        boolean boolean7 = startTag2.isComment();
        boolean boolean8 = startTag2.selfClosing;
        org.jsoup.nodes.Attributes attributes10 = null;
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("hi!", attributes10);
        boolean boolean12 = startTag11.isComment();
        org.jsoup.parser.Token.Comment comment13 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType14 = org.jsoup.parser.Token.TokenType.Doctype;
        comment13.type = tokenType14;
        startTag11.type = tokenType14;
        startTag2.type = tokenType14;
        endTag1.type = tokenType14;
        endTag1.appendAttributeValue(' ');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.forceQuirks = false;
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        boolean boolean8 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder9 = doctype0.name;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
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
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder43 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        xmlTreeBuilder43.initialiseParse("</<!---->>", "</<!---->>", parseErrorList46);
        org.jsoup.parser.Token.Comment comment48 = new org.jsoup.parser.Token.Comment();
        java.lang.String str49 = comment48.toString();
        org.jsoup.parser.Token.TokenType tokenType50 = comment48.type;
        java.lang.String str51 = comment48.getData();
        xmlTreeBuilder43.insert(comment48);
        org.jsoup.parser.Token.Comment comment53 = new org.jsoup.parser.Token.Comment();
        boolean boolean54 = comment53.isStartTag();
        java.lang.String str55 = comment53.toString();
        boolean boolean56 = comment53.isCharacter();
        xmlTreeBuilder43.insert(comment53);
        java.lang.String str58 = comment53.getData();
        java.lang.StringBuilder stringBuilder59 = comment53.data;
        boolean boolean60 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment53);
        java.lang.String str61 = comment53.toString();
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
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "<!---->" + "'", str49, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType50 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType50.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "<!---->" + "'", str55, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(stringBuilder59);
        org.junit.Assert.assertEquals(stringBuilder59.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "<!---->" + "'", str61, "<!---->");
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("</<!---->>");
        java.lang.String str2 = endTag1.toString();
        endTag1.appendTagName("</<!----><<!---->>>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</</<!---->>>" + "'", str2, "</</<!---->>>");
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder3 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.Doctype doctype4 = doctype0.asDoctype();
        boolean boolean5 = doctype0.isForceQuirks();
        boolean boolean6 = doctype0.isDoctype();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(doctype4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.forceQuirks = false;
        java.lang.String str5 = doctype0.getName();
        java.lang.String str6 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        java.lang.String str8 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token.TokenType tokenType9 = doctype0.type;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        boolean boolean4 = doctype0.isCharacter();
        org.jsoup.parser.Token.Doctype doctype5 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doctype5);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str2 = endTag1.toString();
        endTag1.appendAttributeValue('4');
        boolean boolean5 = endTag1.isSelfClosing();
        boolean boolean6 = endTag1.isSelfClosing();
        boolean boolean7 = endTag1.selfClosing;
        endTag1.selfClosing = true;
        endTag1.appendAttributeName("<hi!>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</<!---->>" + "'", str2, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        org.jsoup.nodes.Attributes attributes4 = startTag2.attributes;
        java.lang.String str5 = startTag2.name();
        startTag2.appendAttributeName('4');
        startTag2.appendTagName("hi!Comment");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isEOF();
        startTag0.appendAttributeValue("hi!");
        startTag0.appendTagName('4');
        startTag0.finaliseTag();
        boolean boolean10 = startTag0.isCharacter();
        java.lang.String str11 = startTag0.toString();
        startTag0.appendTagName("<<hi!>>");
        org.jsoup.parser.Token.StartTag startTag14 = startTag0.asStartTag();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<4>" + "'", str11, "<4>");
        org.junit.Assert.assertNotNull(startTag14);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        startTag1.appendAttributeValue('4');
        boolean boolean4 = startTag1.isEndTag();
        startTag1.newAttribute();
        boolean boolean6 = startTag1.isComment();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes10 = null;
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("hi!", attributes10);
        startTag11.newAttribute();
        startTag11.tagName = "";
        org.jsoup.nodes.Attributes attributes15 = startTag11.attributes;
        startTag8.attributes = attributes15;
        startTag1.attributes = attributes15;
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag("<!---->", attributes15);
        org.jsoup.parser.Token.StartTag startTag19 = startTag18.asStartTag();
        startTag19.selfClosing = true;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(startTag19);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        doctype0.forceQuirks = false;
        doctype0.forceQuirks = false;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.newAttribute();
        boolean boolean4 = startTag2.isSelfClosing();
        boolean boolean5 = startTag2.isEOF();
        boolean boolean6 = startTag2.selfClosing;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
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
        java.lang.String str23 = comment17.toString();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!---->" + "'", str18, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<!---->" + "'", str23, "<!---->");
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendTagName('4');
        startTag2.appendAttributeValue("<!---->");
        startTag2.appendAttributeValue("");
        boolean boolean10 = startTag2.isDoctype();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character11 = startTag2.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        java.lang.StringBuilder stringBuilder2 = comment0.data;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        boolean boolean4 = comment0.isEndTag();
        java.lang.String str5 = comment0.getData();
        org.jsoup.parser.Token.TokenType tokenType6 = comment0.type;
        java.lang.String str7 = comment0.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag8 = comment0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<<!---->>");
        startTag1.newAttribute();
        startTag1.appendAttributeName("hi!EndTag");
        org.jsoup.parser.Token.TokenType tokenType5 = startTag1.type;
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        boolean boolean4 = startTag0.isDoctype();
        java.lang.String str5 = startTag0.tokenType();
        startTag0.appendTagName('a');
        org.jsoup.parser.Token.Tag tag9 = startTag0.name("hi!");
        boolean boolean10 = startTag0.isSelfClosing();
        boolean boolean11 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.EndTag endTag12 = new org.jsoup.parser.Token.EndTag();
        boolean boolean13 = endTag12.selfClosing;
        org.jsoup.parser.Token.Tag tag15 = endTag12.name("<!---->");
        boolean boolean16 = tag15.isCharacter();
        tag15.appendTagName("Comment");
        org.jsoup.nodes.Attributes attributes19 = tag15.attributes;
        org.jsoup.parser.Token.TokenType tokenType20 = tag15.type;
        startTag0.type = tokenType20;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(attributes19);
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
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
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        startTag27.appendAttributeValue('4');
        boolean boolean30 = startTag27.isEndTag();
        boolean boolean31 = startTag27.isEOF();
        startTag27.appendAttributeValue("hi!");
        startTag27.appendTagName('4');
        boolean boolean36 = startTag27.isSelfClosing();
        boolean boolean37 = startTag27.isComment();
        org.jsoup.nodes.Element element38 = xmlTreeBuilder0.insert(startTag27);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder39 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        xmlTreeBuilder39.initialiseParse("</<!---->>", "</<!---->>", parseErrorList42);
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        xmlTreeBuilder39.initialiseParse("StartTag", "<!---->", parseErrorList46);
        org.jsoup.parser.Token.Comment comment48 = new org.jsoup.parser.Token.Comment();
        java.lang.String str49 = comment48.getData();
        xmlTreeBuilder39.insert(comment48);
        org.jsoup.parser.Token.Comment comment51 = new org.jsoup.parser.Token.Comment();
        java.lang.String str52 = comment51.toString();
        boolean boolean53 = comment51.isEndTag();
        xmlTreeBuilder39.insert(comment51);
        org.jsoup.parser.Token.Character character56 = new org.jsoup.parser.Token.Character("hi!");
        java.lang.String str57 = character56.getData();
        java.lang.String str58 = character56.toString();
        xmlTreeBuilder39.insert(character56);
        xmlTreeBuilder0.insert(character56);
        org.jsoup.parser.Token.StartTag startTag62 = new org.jsoup.parser.Token.StartTag();
        startTag62.appendAttributeValue('4');
        boolean boolean65 = startTag62.isEndTag();
        startTag62.newAttribute();
        org.jsoup.parser.Token.StartTag startTag67 = new org.jsoup.parser.Token.StartTag();
        startTag67.appendAttributeValue('4');
        org.jsoup.nodes.Attributes attributes70 = startTag67.attributes;
        startTag62.attributes = attributes70;
        org.jsoup.parser.Token.StartTag startTag72 = new org.jsoup.parser.Token.StartTag("<<hi!>StartTag>", attributes70);
        boolean boolean73 = startTag72.isEOF();
        startTag72.appendAttributeValue("<<<!---->>>");
        org.jsoup.nodes.Attributes attributes76 = startTag72.attributes;
        boolean boolean77 = startTag72.isSelfClosing();
        boolean boolean78 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag72);
        org.jsoup.parser.Token.Doctype doctype79 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder80 = doctype79.publicIdentifier;
        java.lang.StringBuilder stringBuilder81 = doctype79.publicIdentifier;
        boolean boolean82 = doctype79.forceQuirks;
        boolean boolean83 = doctype79.forceQuirks;
        boolean boolean84 = doctype79.forceQuirks;
        java.lang.String str85 = doctype79.getPublicIdentifier();
        java.lang.String str86 = doctype79.getPublicIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "<!---->" + "'", str52, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(attributes70);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(attributes76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(stringBuilder80);
        org.junit.Assert.assertEquals(stringBuilder80.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder81);
        org.junit.Assert.assertEquals(stringBuilder81.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        boolean boolean2 = startTag1.isSelfClosing();
        boolean boolean3 = startTag1.isDoctype();
        startTag1.newAttribute();
        startTag1.tagName = "</<!---->>";
        org.jsoup.nodes.Attributes attributes7 = startTag1.attributes;
        org.jsoup.parser.Token.Tag tag9 = startTag1.name("<<!---->>4");
        tag9.appendAttributeName("<!---->");
        tag9.appendTagName("<hi!</</<!---->>>>");
        tag9.tagName = "<!---->";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        boolean boolean2 = doctype0.isDoctype();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        boolean boolean6 = doctype0.isComment();
        boolean boolean7 = doctype0.forceQuirks;
        boolean boolean8 = doctype0.isForceQuirks();
        java.lang.String str9 = doctype0.getSystemIdentifier();
        java.lang.String str10 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = true;
        java.lang.String str13 = doctype0.getName();
        boolean boolean14 = doctype0.isForceQuirks();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("hi!", attributes3);
        startTag4.newAttribute();
        startTag4.tagName = "";
        org.jsoup.nodes.Attributes attributes8 = startTag4.attributes;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("", attributes8);
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        startTag10.appendAttributeValue('4');
        boolean boolean13 = startTag10.isDoctype();
        org.jsoup.nodes.Attributes attributes14 = startTag10.attributes;
        startTag9.attributes = attributes14;
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag("StartTag", attributes14);
        boolean boolean17 = startTag16.isEndTag();
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        endTag1.appendTagName("StartTag");
        org.jsoup.parser.Token.Tag tag8 = endTag1.name("hi!EndTag");
        tag8.appendAttributeName("</hi!<!---->>");
        tag8.newAttribute();
        boolean boolean12 = tag8.isSelfClosing();
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
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
        java.lang.String str15 = startTag11.name();
        org.jsoup.parser.Token.TokenType tokenType16 = startTag11.type;
        org.jsoup.parser.Token.EndTag endTag18 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag18.appendAttributeValue('#');
        endTag18.finaliseTag();
        java.lang.String str22 = endTag18.toString();
        endTag18.appendAttributeValue("<!----><<!---->>");
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str27 = startTag26.tokenType();
        boolean boolean28 = startTag26.isSelfClosing();
        startTag26.appendAttributeValue("EndTag");
        org.jsoup.nodes.Attributes attributes31 = startTag26.attributes;
        endTag18.attributes = attributes31;
        startTag11.attributes = attributes31;
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "StartTag" + "'", str12, "StartTag");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "StartTag" + "'", str13, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "StartTag" + "'", str15, "StartTag");
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "</<!---->>" + "'", str22, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "StartTag" + "'", str27, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(attributes31);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        boolean boolean2 = doctype0.isDoctype();
        java.lang.StringBuilder stringBuilder3 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.TokenType tokenType4 = doctype0.type;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        boolean boolean4 = startTag0.isEOF();
        java.lang.String str5 = startTag0.tokenType();
        startTag0.selfClosing = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.forceQuirks = false;
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder9 = doctype0.publicIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment10 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
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
        org.jsoup.nodes.Attributes attributes16 = startTag1.attributes;
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.isEOF();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
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
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag("hi!4hi!EndTag", attributes21);
        startTag26.appendAttributeValue("<<!---->>4");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "</<!---->>" + "'", str3, "</<!---->>");
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(attributes21);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str2 = endTag1.toString();
        endTag1.appendAttributeValue('4');
        boolean boolean5 = endTag1.isSelfClosing();
        boolean boolean6 = endTag1.isComment();
        endTag1.finaliseTag();
        endTag1.finaliseTag();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</<!---->>" + "'", str2, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
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
        startTag32.finaliseTag();
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
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.forceQuirks = false;
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        boolean boolean8 = doctype7.forceQuirks;
        boolean boolean9 = doctype7.isForceQuirks();
        java.lang.StringBuilder stringBuilder10 = doctype7.publicIdentifier;
        org.jsoup.nodes.Attributes attributes12 = null;
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("hi!", attributes12);
        boolean boolean14 = startTag13.isComment();
        org.jsoup.parser.Token.Comment comment15 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType16 = org.jsoup.parser.Token.TokenType.Doctype;
        comment15.type = tokenType16;
        startTag13.type = tokenType16;
        startTag13.appendAttributeName("hi!");
        org.jsoup.parser.Token.Tag tag22 = startTag13.name("</</<!---->>>");
        org.jsoup.parser.Token.TokenType tokenType23 = startTag13.type;
        doctype7.type = tokenType23;
        java.lang.String str25 = doctype7.getName();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + tokenType23 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType23.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        boolean boolean4 = startTag0.isDoctype();
        java.lang.String str5 = startTag0.tokenType();
        boolean boolean6 = startTag0.isEOF();
        startTag0.appendAttributeValue("<hi!>");
        startTag0.finaliseTag();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        doctype0.forceQuirks = true;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        java.lang.String str7 = doctype0.getPublicIdentifier();
        boolean boolean8 = doctype0.forceQuirks;
        java.lang.String str9 = doctype0.getSystemIdentifier();
        java.lang.String str10 = doctype0.getPublicIdentifier();
        java.lang.String str11 = doctype0.tokenType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Doctype" + "'", str11, "Doctype");
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isEOF();
        startTag0.appendAttributeValue("hi!");
        startTag0.appendTagName('4');
        boolean boolean9 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag11 = startTag0.name("hi!");
        startTag0.appendAttributeValue("<!----><<!---->>");
        java.lang.String str14 = startTag0.tokenType();
        java.lang.String str15 = startTag0.tagName;
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        startTag16.appendAttributeValue('4');
        boolean boolean19 = startTag16.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType20 = startTag16.type;
        java.lang.String str21 = startTag16.tagName;
        boolean boolean22 = startTag16.isEndTag();
        org.jsoup.nodes.Attributes attributes23 = startTag16.getAttributes();
        startTag0.attributes = attributes23;
        boolean boolean25 = startTag0.isSelfClosing();
        org.jsoup.nodes.Attributes attributes26 = startTag0.attributes;
        boolean boolean27 = startTag0.isStartTag();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "StartTag" + "'", str14, "StartTag");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        boolean boolean2 = doctype0.isDoctype();
        boolean boolean3 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder4 = doctype0.systemIdentifier;
        boolean boolean5 = doctype0.isForceQuirks();
        org.jsoup.parser.Token.TokenType tokenType6 = doctype0.type;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isEndTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment2 = doctype0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
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
        boolean boolean14 = startTag11.isSelfClosing();
        boolean boolean15 = startTag11.isComment();
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
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
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        xmlTreeBuilder0.initialiseParse("<<<!---->>>", "<</EndTag>>", parseErrorList38);
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        xmlTreeBuilder0.initialiseParse("</hi!>", "<hi!EndTag>", parseErrorList42);
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
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
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
        java.lang.String str20 = character15.getData();
        boolean boolean21 = character15.isEndTag();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
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
        java.lang.String str14 = endTag1.toString();
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "</<!---->StartTag>" + "'", str11, "</<!---->StartTag>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "</<!---->StartTag>" + "'", str13, "</<!---->StartTag>");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "</<!---->StartTag>" + "'", str14, "</<!---->StartTag>");
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendTagName('4');
        startTag2.appendAttributeValue("<!---->");
        startTag2.appendTagName("hi!EndTag");
        boolean boolean10 = startTag2.isEOF();
        org.jsoup.parser.Token.Tag tag12 = startTag2.name("Doctype");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        startTag0.tagName = "Comment";
        boolean boolean6 = startTag0.isSelfClosing();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.isEOF();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        org.jsoup.nodes.Attributes attributes4 = startTag0.attributes;
        startTag0.appendAttributeName("<!---->");
        boolean boolean7 = startTag0.isEOF();
        org.jsoup.parser.Token.StartTag startTag8 = startTag0.asStartTag();
        java.lang.String str9 = startTag8.tagName;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
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
        xmlTreeBuilder0.initialiseParse("</<!----><StartTag>>", "<!----><<!---->>a", parseErrorList30);
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
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder3 = doctype0.systemIdentifier;
        boolean boolean4 = doctype0.isStartTag();
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        doctype0.forceQuirks = false;
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
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.forceQuirks;
        boolean boolean5 = doctype0.isComment();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        doctype0.forceQuirks = true;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        java.lang.String str7 = doctype0.getPublicIdentifier();
        boolean boolean8 = doctype0.forceQuirks;
        boolean boolean9 = doctype0.forceQuirks;
        java.lang.String str10 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
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
        org.jsoup.parser.Token.Character character18 = new org.jsoup.parser.Token.Character("");
        java.lang.String str19 = character18.toString();
        java.lang.String str20 = character18.toString();
        boolean boolean21 = character18.isDoctype();
        xmlTreeBuilder0.insert(character18);
        org.jsoup.parser.Token.StartTag startTag23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element24 = xmlTreeBuilder0.insert(startTag23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        doctype0.forceQuirks = true;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        boolean boolean7 = doctype0.isForceQuirks();
        boolean boolean8 = doctype0.isDoctype();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendAttributeName("StartTag");
        startTag2.appendAttributeName("");
        startTag2.appendAttributeName('#');
        org.jsoup.parser.Token.Tag tag11 = startTag2.name("<!---->");
        boolean boolean12 = tag11.isEOF();
        tag11.appendAttributeValue('#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isForceQuirks();
        java.lang.String str4 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
        java.lang.String str7 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag9 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("StartTag", "<!---->", parseErrorList7);
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        xmlTreeBuilder0.initialiseParse("hi!4", "<!---->hi!", parseErrorList11);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        org.jsoup.nodes.Attributes attributes4 = startTag2.attributes;
        startTag2.finaliseTag();
        startTag2.appendAttributeName("<hi!>");
        startTag2.appendTagName("</</<!---->>>");
        java.lang.String str10 = startTag2.toString();
        boolean boolean11 = startTag2.selfClosing;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<hi!</</<!---->>>>" + "'", str10, "<hi!</</<!---->>>>");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!Comment");
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
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
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag("<!---->");
        boolean boolean37 = startTag36.isSelfClosing();
        boolean boolean38 = startTag36.isDoctype();
        boolean boolean39 = startTag36.isSelfClosing();
        org.jsoup.nodes.Element element40 = xmlTreeBuilder0.insert(startTag36);
        org.jsoup.parser.Token.StartTag startTag41 = new org.jsoup.parser.Token.StartTag();
        startTag41.appendAttributeValue('4');
        boolean boolean44 = startTag41.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType45 = startTag41.type;
        org.jsoup.nodes.Attributes attributes46 = startTag41.getAttributes();
        startTag41.appendAttributeValue("<hi!>");
        org.jsoup.nodes.Attributes attributes49 = startTag41.attributes;
        startTag36.attributes = attributes49;
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "StartTag" + "'", str31, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + tokenType45 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType45.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertNotNull(attributes49);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder3 = doctype0.publicIdentifier;
        java.lang.String str4 = doctype0.getName();
        doctype0.forceQuirks = true;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType4 = startTag0.type;
        org.jsoup.nodes.Attributes attributes5 = startTag0.getAttributes();
        boolean boolean6 = startTag0.isComment();
        boolean boolean7 = startTag0.selfClosing;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        org.jsoup.nodes.Attributes attributes4 = startTag2.getAttributes();
        boolean boolean5 = startTag2.isCharacter();
        boolean boolean6 = startTag2.isStartTag();
        startTag2.appendAttributeName(' ');
        startTag2.appendAttributeValue("<!---->4");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
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
        boolean boolean14 = comment5.isDoctype();
        java.lang.StringBuilder stringBuilder15 = comment5.data;
        java.lang.String str16 = comment5.tokenType();
        java.lang.StringBuilder stringBuilder17 = comment5.data;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Comment" + "'", str16, "Comment");
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder3 = doctype0.publicIdentifier;
        boolean boolean4 = doctype0.forceQuirks;
        java.lang.String str5 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType6 = doctype0.type;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        boolean boolean1 = comment0.isStartTag();
        org.jsoup.parser.Token.Comment comment2 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType3 = org.jsoup.parser.Token.TokenType.Doctype;
        comment2.type = tokenType3;
        comment0.type = tokenType3;
        boolean boolean6 = comment0.isStartTag();
        java.lang.String str7 = comment0.getData();
        java.lang.String str8 = comment0.getData();
        org.jsoup.parser.Token.TokenType tokenType9 = comment0.type;
        java.lang.String str10 = comment0.getData();
        java.lang.String str11 = comment0.tokenType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Comment" + "'", str11, "Comment");
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
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
        org.jsoup.nodes.Attributes attributes42 = null;
        org.jsoup.parser.Token.StartTag startTag43 = new org.jsoup.parser.Token.StartTag("hi!", attributes42);
        startTag43.appendAttributeValue(' ');
        java.lang.String str46 = startTag43.tokenType();
        java.lang.String str47 = startTag43.name();
        startTag43.appendTagName("<!---->");
        startTag43.tagName = "StartTag";
        startTag43.finaliseTag();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean53 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + tokenType23 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType23.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "StartTag" + "'", str46, "StartTag");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        org.jsoup.parser.Token.TokenType tokenType4 = doctype0.type;
        boolean boolean5 = doctype0.isForceQuirks();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
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
        org.jsoup.parser.Token.Character character93 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(character93);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
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
        boolean boolean14 = startTag2.selfClosing;
        boolean boolean15 = startTag2.isDoctype();
        startTag2.appendTagName('#');
        startTag2.finaliseTag();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "StartTag" + "'", str12, "StartTag");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
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
        java.lang.StringBuilder stringBuilder17 = doctype0.name;
        java.lang.StringBuilder stringBuilder18 = doctype0.publicIdentifier;
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
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isForceQuirks();
        java.lang.String str4 = doctype0.getName();
        boolean boolean5 = doctype0.forceQuirks;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("<!---->", "<<!---->>", parseErrorList7);
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        xmlTreeBuilder0.initialiseParse("<!----><<!---->>", "<hi!>", parseErrorList11);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        xmlTreeBuilder0.initialiseParse("<a>", "<StartTag>", parseErrorList15);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
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
        org.jsoup.parser.Token.Character character21 = new org.jsoup.parser.Token.Character("");
        java.lang.String str22 = character21.toString();
        java.lang.String str23 = character21.getData();
        java.lang.String str24 = character21.toString();
        boolean boolean25 = character21.isCharacter();
        xmlTreeBuilder0.insert(character21);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder27 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        xmlTreeBuilder27.initialiseParse("", "<<!---->>", parseErrorList30);
        org.jsoup.parser.Token.EndTag endTag33 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str34 = endTag33.toString();
        java.lang.String str35 = endTag33.toString();
        boolean boolean36 = xmlTreeBuilder27.process((org.jsoup.parser.Token) endTag33);
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        xmlTreeBuilder27.initialiseParse("hi!<!---->", "", parseErrorList39);
        org.jsoup.parser.Token.Character character42 = new org.jsoup.parser.Token.Character("");
        java.lang.String str43 = character42.toString();
        java.lang.String str44 = character42.toString();
        java.lang.String str45 = character42.getData();
        boolean boolean46 = character42.isComment();
        java.lang.String str47 = character42.toString();
        xmlTreeBuilder27.insert(character42);
        org.jsoup.parser.Token.Character character50 = new org.jsoup.parser.Token.Character("");
        boolean boolean51 = character50.isEndTag();
        java.lang.String str52 = character50.toString();
        java.lang.String str53 = character50.getData();
        java.lang.String str54 = character50.toString();
        boolean boolean55 = character50.isEndTag();
        org.jsoup.parser.Token.Doctype doctype56 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder57 = doctype56.publicIdentifier;
        java.lang.StringBuilder stringBuilder58 = doctype56.publicIdentifier;
        java.lang.String str59 = doctype56.getSystemIdentifier();
        org.jsoup.nodes.Attributes attributes61 = null;
        org.jsoup.parser.Token.StartTag startTag62 = new org.jsoup.parser.Token.StartTag("hi!", attributes61);
        org.jsoup.parser.Token.TokenType tokenType63 = startTag62.type;
        startTag62.finaliseTag();
        boolean boolean65 = startTag62.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType66 = startTag62.type;
        doctype56.type = tokenType66;
        character50.type = tokenType66;
        java.lang.String str69 = character50.toString();
        boolean boolean70 = character50.isCharacter();
        xmlTreeBuilder27.insert(character50);
        org.jsoup.parser.Token.Comment comment72 = new org.jsoup.parser.Token.Comment();
        boolean boolean73 = comment72.isStartTag();
        org.jsoup.parser.Token.Comment comment74 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType75 = org.jsoup.parser.Token.TokenType.Doctype;
        comment74.type = tokenType75;
        comment72.type = tokenType75;
        boolean boolean78 = comment72.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType79 = comment72.type;
        java.lang.String str80 = comment72.getData();
        xmlTreeBuilder27.insert(comment72);
        xmlTreeBuilder0.insert(comment72);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "</<!---->>" + "'", str34, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "</<!---->>" + "'", str35, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(stringBuilder57);
        org.junit.Assert.assertEquals(stringBuilder57.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder58);
        org.junit.Assert.assertEquals(stringBuilder58.toString(), "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + tokenType63 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType63.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + tokenType66 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType66.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + tokenType75 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType75.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + tokenType79 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType79.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.forceQuirks = false;
        java.lang.String str5 = doctype0.getName();
        java.lang.String str6 = doctype0.getPublicIdentifier();
        java.lang.String str7 = doctype0.getPublicIdentifier();
        java.lang.String str8 = doctype0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        endTag1.appendTagName("StartTag");
        org.jsoup.nodes.Attributes attributes7 = endTag1.attributes;
        endTag1.appendAttributeName('4');
        java.lang.String str10 = endTag1.toString();
        endTag1.appendAttributeName('4');
        java.lang.String str13 = endTag1.toString();
        java.lang.String str14 = endTag1.toString();
        endTag1.appendAttributeName("<<</<hi!>>>>");
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "</<!---->StartTag>" + "'", str10, "</<!---->StartTag>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "</<!---->StartTag>" + "'", str13, "</<!---->StartTag>");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "</<!---->StartTag>" + "'", str14, "</<!---->StartTag>");
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType5 = org.jsoup.parser.Token.TokenType.Doctype;
        comment4.type = tokenType5;
        startTag2.type = tokenType5;
        java.lang.String str8 = startTag2.tagName;
        org.jsoup.parser.Token.Tag tag10 = startTag2.name("<!----><<!---->>");
        org.jsoup.parser.Token.Tag tag12 = startTag2.name("<!---->StartTag");
        startTag2.appendAttributeName(' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.forceQuirks;
        java.lang.String str5 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.selfClosing = false;
        startTag0.appendTagName("hi!");
        java.lang.String str5 = startTag0.tokenType();
        boolean boolean6 = startTag0.isEndTag();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
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
        org.jsoup.parser.Token.Character character35 = new org.jsoup.parser.Token.Character("<<!----><hi!>>");
        xmlTreeBuilder0.insert(character35);
        org.jsoup.parser.Token.Doctype doctype37 = new org.jsoup.parser.Token.Doctype();
        boolean boolean38 = doctype37.isForceQuirks();
        boolean boolean39 = doctype37.isForceQuirks();
        java.lang.StringBuilder stringBuilder40 = doctype37.systemIdentifier;
        java.lang.StringBuilder stringBuilder41 = doctype37.name;
        doctype37.forceQuirks = true;
        java.lang.String str44 = doctype37.getSystemIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(stringBuilder40);
        org.junit.Assert.assertEquals(stringBuilder40.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder41);
        org.junit.Assert.assertEquals(stringBuilder41.toString(), "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        startTag0.newAttribute();
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        startTag5.appendAttributeValue('4');
        org.jsoup.nodes.Attributes attributes8 = startTag5.attributes;
        startTag0.attributes = attributes8;
        java.lang.String str10 = startTag0.tagName;
        startTag0.appendTagName("hi!<!---->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment13 = startTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("</hi!<!---->>");
        java.lang.String str2 = endTag1.toString();
        java.lang.String str3 = endTag1.tokenType();
        boolean boolean4 = endTag1.isCharacter();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</</hi!<!---->>>" + "'", str2, "</</hi!<!---->>>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EndTag" + "'", str3, "EndTag");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendAttributeName("StartTag");
        startTag2.appendAttributeName("");
        startTag2.appendAttributeName('#');
        org.jsoup.parser.Token.Tag tag11 = startTag2.name("<!---->");
        tag11.appendTagName('4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tag11);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.forceQuirks = false;
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.String str7 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType8 = doctype0.type;
        java.lang.String str9 = doctype0.getPublicIdentifier();
        boolean boolean10 = doctype0.isForceQuirks();
        java.lang.String str11 = doctype0.getSystemIdentifier();
        java.lang.String str12 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.forceQuirks = false;
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        java.lang.String str8 = doctype0.tokenType();
        java.lang.String str9 = doctype0.getPublicIdentifier();
        boolean boolean10 = doctype0.isForceQuirks();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Doctype" + "'", str8, "Doctype");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("</</</<!---->>>>");
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("");
        boolean boolean2 = character1.isEndTag();
        java.lang.String str3 = character1.toString();
        java.lang.String str4 = character1.getData();
        java.lang.String str5 = character1.toString();
        boolean boolean6 = character1.isEndTag();
        java.lang.Class<?> wildcardClass7 = character1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("</<<hi!>>>");
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
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
        org.jsoup.parser.Token.StartTag startTag15 = startTag14.asStartTag();
        org.jsoup.nodes.Attributes attributes16 = startTag14.getAttributes();
        boolean boolean17 = startTag14.isCharacter();
        boolean boolean18 = startTag14.isCharacter();
        org.jsoup.nodes.Attributes attributes19 = startTag14.attributes;
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag("<!----><<!---->>a", attributes19);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertNotNull(startTag15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributes19);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isEOF();
        startTag0.appendAttributeValue("hi!");
        boolean boolean7 = startTag0.selfClosing;
        startTag0.selfClosing = false;
        startTag0.appendAttributeName("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
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
        java.lang.String str18 = comment9.toString();
        java.lang.String str19 = comment9.getData();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!---->" + "'", str18, "<!---->");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("<<!---->>");
        org.jsoup.nodes.Attributes attributes3 = startTag2.attributes;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("<</</<!---->>>>", attributes3);
        org.junit.Assert.assertNotNull(attributes3);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Attributes attributes2 = null;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag("hi!", attributes2);
        org.jsoup.parser.Token.TokenType tokenType4 = startTag3.type;
        startTag3.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag7 = startTag3.asStartTag();
        boolean boolean8 = startTag7.isSelfClosing();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = xmlTreeBuilder0.insert(startTag7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.newAttribute();
        startTag2.tagName = "";
        boolean boolean6 = startTag2.isComment();
        boolean boolean7 = startTag2.isSelfClosing();
        boolean boolean8 = startTag2.isSelfClosing();
        startTag2.appendTagName("hi!4hi!EndTag");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.selfClosing = false;
        startTag0.appendTagName("hi!");
        org.jsoup.nodes.Attributes attributes5 = startTag0.getAttributes();
        startTag0.appendAttributeValue('a');
        org.jsoup.parser.Token.StartTag startTag8 = startTag0.asStartTag();
        startTag8.appendAttributeName('4');
        java.lang.String str11 = startTag8.name();
        org.jsoup.parser.Token.Tag tag13 = startTag8.name("<hi!>");
        org.jsoup.parser.Token.StartTag startTag14 = tag13.asStartTag();
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(startTag14);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str2 = endTag1.toString();
        endTag1.appendAttributeValue('4');
        org.jsoup.nodes.Attributes attributes7 = null;
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag("hi!", attributes7);
        startTag8.newAttribute();
        startTag8.tagName = "";
        org.jsoup.nodes.Attributes attributes12 = startTag8.attributes;
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("</</<!---->>>", attributes12);
        endTag1.attributes = attributes12;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</<!---->>" + "'", str2, "</<!---->>");
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
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
        org.jsoup.parser.Token.Doctype doctype18 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str19 = doctype18.getPublicIdentifier();
        boolean boolean20 = doctype18.forceQuirks;
        boolean boolean21 = doctype18.isForceQuirks();
        java.lang.StringBuilder stringBuilder22 = doctype18.publicIdentifier;
        java.lang.String str23 = doctype18.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder24 = doctype18.publicIdentifier;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(stringBuilder24);
        org.junit.Assert.assertEquals(stringBuilder24.toString(), "");
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
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
        boolean boolean14 = doctype0.isForceQuirks();
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
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
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
        startTag18.appendAttributeValue("hi!4");
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendTagName('4');
        boolean boolean6 = startTag2.isComment();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
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
            org.jsoup.parser.Token.Character character20 = startTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
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
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        org.jsoup.nodes.Attributes attributes3 = null;
        org.jsoup.parser.Token.StartTag startTag4 = new org.jsoup.parser.Token.StartTag("hi!", attributes3);
        startTag4.appendAttributeValue(' ');
        java.lang.String str7 = startTag4.tokenType();
        java.lang.String str8 = startTag4.name();
        startTag4.appendTagName("<!---->");
        startTag4.tagName = "StartTag";
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        startTag13.selfClosing = false;
        startTag13.appendTagName("hi!");
        org.jsoup.nodes.Attributes attributes18 = startTag13.getAttributes();
        startTag4.attributes = attributes18;
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag("<<hi!>>", attributes18);
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag("<<!----><hi!>>", attributes18);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "StartTag" + "'", str7, "StartTag");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        endTag1.appendTagName("StartTag");
        endTag1.newAttribute();
        org.jsoup.parser.Token.TokenType tokenType8 = endTag1.type;
        endTag1.appendAttributeValue("</<hi!>>");
        java.lang.String str11 = endTag1.toString();
        org.jsoup.nodes.Attributes attributes15 = null;
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag("hi!", attributes15);
        startTag16.newAttribute();
        startTag16.tagName = "";
        org.jsoup.nodes.Attributes attributes20 = startTag16.attributes;
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag("", attributes20);
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        startTag22.appendAttributeValue('4');
        boolean boolean25 = startTag22.isDoctype();
        org.jsoup.nodes.Attributes attributes26 = startTag22.attributes;
        startTag21.attributes = attributes26;
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag("<!----><<!---->>", attributes26);
        endTag1.attributes = attributes26;
        java.lang.String str30 = endTag1.tokenType();
        endTag1.newAttribute();
        java.lang.String str32 = endTag1.toString();
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "</<!---->StartTag>" + "'", str11, "</<!---->StartTag>");
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "EndTag" + "'", str30, "EndTag");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "</<!---->StartTag>" + "'", str32, "</<!---->StartTag>");
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType5 = org.jsoup.parser.Token.TokenType.Doctype;
        comment4.type = tokenType5;
        startTag2.type = tokenType5;
        java.lang.String str8 = startTag2.tagName;
        org.jsoup.parser.Token.Tag tag10 = startTag2.name("<!----><<!---->>");
        org.jsoup.nodes.Attributes attributes11 = tag10.attributes;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character12 = tag10.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNull(attributes11);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
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
        java.lang.String str35 = startTag30.toString();
        boolean boolean36 = startTag30.isComment();
        org.jsoup.nodes.Attributes attributes37 = startTag30.attributes;
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "StartTag" + "'", str31, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<<!---->>" + "'", str35, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(attributes37);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType5 = org.jsoup.parser.Token.TokenType.Doctype;
        comment4.type = tokenType5;
        startTag2.type = tokenType5;
        java.lang.String str8 = startTag2.tagName;
        org.jsoup.parser.Token.Tag tag10 = startTag2.name("<!----><<!---->>");
        boolean boolean11 = tag10.isEOF();
        boolean boolean12 = tag10.isStartTag();
        org.jsoup.parser.Token.Tag tag14 = tag10.name("hi!");
        tag10.newAttribute();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tag14);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        org.jsoup.parser.Token.TokenType tokenType3 = startTag2.type;
        startTag2.selfClosing = true;
        startTag2.selfClosing = true;
        java.lang.String str8 = startTag2.toString();
        startTag2.appendAttributeValue("<<!---->>");
        startTag2.selfClosing = false;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag13 = startTag2.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<hi!>" + "'", str8, "<hi!>");
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendAttributeName('4');
        boolean boolean6 = startTag2.isDoctype();
        java.lang.String str7 = startTag2.tagName;
        boolean boolean8 = startTag2.isEndTag();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.Comment;
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
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        boolean boolean2 = startTag1.isSelfClosing();
        boolean boolean3 = startTag1.isDoctype();
        startTag1.newAttribute();
        startTag1.tagName = "</<!---->>";
        org.jsoup.nodes.Attributes attributes7 = startTag1.attributes;
        org.jsoup.parser.Token.Tag tag9 = startTag1.name("<<!---->>4");
        boolean boolean10 = tag9.isStartTag();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("</<!---->StartTag>");
        java.lang.String str2 = character1.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag3 = character1.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</<!---->StartTag>" + "'", str2, "</<!---->StartTag>");
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
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
        tag16.selfClosing = false;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype19 = tag16.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tag16);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->StartTag");
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("<4>");
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.appendAttributeValue(' ');
        boolean boolean5 = startTag2.isSelfClosing();
        boolean boolean6 = startTag2.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType7 = startTag2.type;
        startTag2.finaliseTag();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }
}

