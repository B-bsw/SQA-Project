package org.jsoup.parser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

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
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.Doctype doctype4 = doctype0.asDoctype();
        java.lang.String str5 = doctype4.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder6 = doctype4.publicIdentifier;
        java.lang.String str7 = doctype4.getPublicIdentifier();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(doctype4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
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
        startTag15.appendTagName(' ');
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
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        boolean boolean4 = startTag0.isEOF();
        startTag0.newAttribute();
        boolean boolean6 = startTag0.isSelfClosing();
        startTag0.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes9 = startTag0.attributes;
        boolean boolean10 = startTag0.isEndTag();
        startTag0.appendAttributeName(' ');
        startTag0.appendAttributeName('#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.appendAttributeValue(' ');
        startTag2.newAttribute();
        startTag2.appendAttributeName('a');
        startTag2.appendAttributeName("");
        java.lang.String str10 = startTag2.tagName;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str2 = endTag1.toString();
        endTag1.appendAttributeValue('4');
        boolean boolean5 = endTag1.isEOF();
        java.lang.String str6 = endTag1.toString();
        org.jsoup.parser.Token.EndTag endTag8 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str9 = endTag8.toString();
        endTag8.appendAttributeValue('4');
        boolean boolean12 = endTag8.isSelfClosing();
        endTag8.finaliseTag();
        org.jsoup.parser.Token.TokenType tokenType14 = endTag8.type;
        endTag1.type = tokenType14;
        org.jsoup.parser.Token.TokenType tokenType16 = endTag1.type;
        org.jsoup.parser.Token.Tag tag18 = endTag1.name("<hi!4hi!EndTag>");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</<!---->>" + "'", str2, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "</<!---->>" + "'", str6, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "</<!---->>" + "'", str9, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(tag18);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType4 = startTag0.type;
        startTag0.tagName = "<!---->";
        org.jsoup.nodes.Attributes attributes7 = null;
        startTag0.attributes = attributes7;
        startTag0.appendTagName('a');
        startTag0.tagName = "hi!4<</hi!<!---->>>";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
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
        endTag64.finaliseTag();
        boolean boolean68 = endTag64.isEndTag();
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
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
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
        org.jsoup.nodes.Attributes attributes29 = startTag2.attributes;
        boolean boolean30 = startTag2.isStartTag();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + tokenType23 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType23.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(attributes29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("StartTag");
        startTag1.finaliseTag();
        org.jsoup.parser.Token.Tag tag4 = startTag1.name("<<!---->>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character5 = startTag1.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        java.lang.StringBuilder stringBuilder2 = comment0.data;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        boolean boolean4 = comment0.isEndTag();
        java.lang.String str5 = comment0.getData();
        java.lang.String str6 = comment0.toString();
        java.lang.String str7 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!---->" + "'", str7, "<!---->");
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
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
        org.jsoup.parser.Token.StartTag startTag41 = new org.jsoup.parser.Token.StartTag();
        startTag41.appendAttributeValue('4');
        boolean boolean44 = startTag41.isEndTag();
        boolean boolean45 = startTag41.isEOF();
        startTag41.appendAttributeValue("hi!");
        startTag41.newAttribute();
        startTag41.appendAttributeName("</</<!---->>>");
        org.jsoup.nodes.Attributes attributes51 = startTag41.getAttributes();
        startTag39.attributes = attributes51;
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + tokenType23 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType23.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(attributes51);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isEOF();
        startTag0.appendAttributeValue("hi!");
        startTag0.appendTagName('4');
        boolean boolean9 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag11 = startTag0.name("hi!");
        org.jsoup.parser.Token.Tag tag13 = tag11.name("</<hi!>>");
        boolean boolean14 = tag13.selfClosing;
        java.lang.String str15 = tag13.name();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "</<hi!>>" + "'", str15, "</<hi!>>");
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.String str3 = doctype0.tokenType();
        org.jsoup.parser.Token.TokenType tokenType4 = doctype0.type;
        boolean boolean5 = doctype0.isEOF();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Doctype" + "'", str3, "Doctype");
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
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
        org.jsoup.parser.Token.Comment comment18 = new org.jsoup.parser.Token.Comment();
        java.lang.String str19 = comment18.toString();
        boolean boolean20 = comment18.isEOF();
        java.lang.StringBuilder stringBuilder21 = comment18.data;
        xmlTreeBuilder0.insert(comment18);
        org.jsoup.parser.Token.Character character24 = new org.jsoup.parser.Token.Character("");
        boolean boolean25 = character24.isComment();
        boolean boolean26 = character24.isComment();
        org.jsoup.nodes.Attributes attributes28 = null;
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag("hi!", attributes28);
        boolean boolean30 = startTag29.isComment();
        org.jsoup.parser.Token.Comment comment31 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType32 = org.jsoup.parser.Token.TokenType.Doctype;
        comment31.type = tokenType32;
        startTag29.type = tokenType32;
        startTag29.appendAttributeName("hi!");
        org.jsoup.parser.Token.EndTag endTag37 = new org.jsoup.parser.Token.EndTag();
        boolean boolean38 = endTag37.selfClosing;
        org.jsoup.parser.Token.Tag tag40 = endTag37.name("<!---->");
        org.jsoup.parser.Token.TokenType tokenType41 = org.jsoup.parser.Token.TokenType.StartTag;
        tag40.type = tokenType41;
        startTag29.type = tokenType41;
        character24.type = tokenType41;
        xmlTreeBuilder0.insert(character24);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder46 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList49 = null;
        xmlTreeBuilder46.initialiseParse("", "<<!---->>", parseErrorList49);
        org.jsoup.parser.Token.EndTag endTag52 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str53 = endTag52.toString();
        java.lang.String str54 = endTag52.toString();
        boolean boolean55 = xmlTreeBuilder46.process((org.jsoup.parser.Token) endTag52);
        org.jsoup.parser.ParseErrorList parseErrorList58 = null;
        xmlTreeBuilder46.initialiseParse("hi!<!---->", "", parseErrorList58);
        org.jsoup.parser.Token.Character character61 = new org.jsoup.parser.Token.Character("");
        java.lang.String str62 = character61.toString();
        java.lang.String str63 = character61.toString();
        java.lang.String str64 = character61.getData();
        boolean boolean65 = character61.isComment();
        java.lang.String str66 = character61.toString();
        xmlTreeBuilder46.insert(character61);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder68 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList71 = null;
        xmlTreeBuilder68.initialiseParse("</<!---->>", "</<!---->>", parseErrorList71);
        org.jsoup.parser.ParseErrorList parseErrorList75 = null;
        xmlTreeBuilder68.initialiseParse("StartTag", "<!---->", parseErrorList75);
        org.jsoup.parser.Token.Comment comment77 = new org.jsoup.parser.Token.Comment();
        java.lang.String str78 = comment77.getData();
        xmlTreeBuilder68.insert(comment77);
        java.lang.String str80 = comment77.toString();
        xmlTreeBuilder46.insert(comment77);
        org.jsoup.parser.Token.Comment comment82 = new org.jsoup.parser.Token.Comment();
        java.lang.String str83 = comment82.toString();
        org.jsoup.parser.Token.TokenType tokenType84 = comment82.type;
        boolean boolean85 = comment82.isComment();
        java.lang.String str86 = comment82.getData();
        java.lang.String str87 = comment82.toString();
        java.lang.String str88 = comment82.toString();
        xmlTreeBuilder46.insert(comment82);
        java.lang.StringBuilder stringBuilder90 = comment82.data;
        xmlTreeBuilder0.insert(comment82);
        java.lang.StringBuilder stringBuilder92 = comment82.data;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!---->" + "'", str19, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + tokenType32 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType32.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertTrue("'" + tokenType41 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType41.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "</<!---->>" + "'", str53, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "</<!---->>" + "'", str54, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "<!---->" + "'", str80, "<!---->");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "<!---->" + "'", str83, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType84 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType84.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "<!---->" + "'", str87, "<!---->");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "<!---->" + "'", str88, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder90);
        org.junit.Assert.assertEquals(stringBuilder90.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder92);
        org.junit.Assert.assertEquals(stringBuilder92.toString(), "");
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        boolean boolean2 = doctype0.forceQuirks;
        boolean boolean3 = doctype0.isForceQuirks();
        java.lang.String str4 = doctype0.getPublicIdentifier();
        boolean boolean5 = doctype0.isForceQuirks();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character6 = doctype0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendAttributeName("StartTag");
        startTag2.appendAttributeName("");
        java.lang.String str8 = startTag2.tagName;
        java.lang.String str9 = startTag2.tagName;
        java.lang.Class<?> wildcardClass10 = startTag2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        doctype0.forceQuirks = true;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        boolean boolean7 = doctype0.isForceQuirks();
        doctype0.forceQuirks = false;
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder12 = doctype0.name;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<<<!---->>>");
        org.jsoup.nodes.Attributes attributes2 = null;
        startTag1.attributes = attributes2;
        startTag1.finaliseTag();
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
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
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder23 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        xmlTreeBuilder23.initialiseParse("</<!---->>", "</<!---->>", parseErrorList26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        xmlTreeBuilder23.initialiseParse("", "<<!---->>", parseErrorList30);
        org.jsoup.parser.Token.Character character33 = new org.jsoup.parser.Token.Character("");
        boolean boolean34 = character33.isComment();
        boolean boolean35 = character33.isComment();
        org.jsoup.nodes.Attributes attributes37 = null;
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag("hi!", attributes37);
        boolean boolean39 = startTag38.isComment();
        org.jsoup.parser.Token.Comment comment40 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType41 = org.jsoup.parser.Token.TokenType.Doctype;
        comment40.type = tokenType41;
        startTag38.type = tokenType41;
        startTag38.appendAttributeName("hi!");
        org.jsoup.parser.Token.EndTag endTag46 = new org.jsoup.parser.Token.EndTag();
        boolean boolean47 = endTag46.selfClosing;
        org.jsoup.parser.Token.Tag tag49 = endTag46.name("<!---->");
        org.jsoup.parser.Token.TokenType tokenType50 = org.jsoup.parser.Token.TokenType.StartTag;
        tag49.type = tokenType50;
        startTag38.type = tokenType50;
        character33.type = tokenType50;
        java.lang.String str54 = character33.toString();
        xmlTreeBuilder23.insert(character33);
        org.jsoup.nodes.Attributes attributes57 = null;
        org.jsoup.parser.Token.StartTag startTag58 = new org.jsoup.parser.Token.StartTag("hi!", attributes57);
        startTag58.newAttribute();
        startTag58.tagName = "";
        boolean boolean62 = startTag58.isComment();
        startTag58.appendTagName('a');
        org.jsoup.nodes.Attributes attributes65 = startTag58.attributes;
        org.jsoup.nodes.Attributes attributes66 = startTag58.attributes;
        org.jsoup.parser.Token.StartTag startTag67 = startTag58.asStartTag();
        org.jsoup.nodes.Element element68 = xmlTreeBuilder23.insert(startTag58);
        org.jsoup.parser.Token.Character character70 = new org.jsoup.parser.Token.Character("<<!---->>");
        java.lang.String str71 = character70.getData();
        java.lang.String str72 = character70.getData();
        xmlTreeBuilder23.insert(character70);
        xmlTreeBuilder0.insert(character70);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder75 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList78 = null;
        xmlTreeBuilder75.initialiseParse("</<!---->>", "StartTag", parseErrorList78);
        org.jsoup.parser.Token.Character character81 = new org.jsoup.parser.Token.Character("");
        java.lang.String str82 = character81.toString();
        java.lang.String str83 = character81.getData();
        java.lang.String str84 = character81.toString();
        boolean boolean85 = character81.isCharacter();
        xmlTreeBuilder75.insert(character81);
        xmlTreeBuilder0.insert(character81);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "StartTag" + "'", str18, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + tokenType41 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType41.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertTrue("'" + tokenType50 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType50.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(attributes65);
        org.junit.Assert.assertNotNull(attributes66);
        org.junit.Assert.assertNotNull(startTag67);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "<<!---->>" + "'", str71, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "<<!---->>" + "'", str72, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.selfClosing;
        endTag0.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes4 = endTag0.getAttributes();
        boolean boolean5 = endTag0.isSelfClosing();
        org.jsoup.parser.Token.EndTag endTag6 = endTag0.asEndTag();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment7 = endTag6.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(endTag6);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
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
        java.lang.String str24 = comment23.getData();
        java.lang.StringBuilder stringBuilder25 = comment23.data;
        org.jsoup.parser.Token.Comment comment26 = comment23.asComment();
        java.lang.String str27 = comment26.toString();
        xmlTreeBuilder0.insert(comment26);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType7 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType7.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!---->" + "'", str15, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "");
        org.junit.Assert.assertNotNull(comment26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<!---->" + "'", str27, "<!---->");
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
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
        org.jsoup.parser.Token.EndTag endTag13 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str14 = endTag13.toString();
        endTag13.appendAttributeValue('4');
        boolean boolean17 = endTag13.isEOF();
        java.lang.String str18 = endTag13.toString();
        org.jsoup.parser.Token.EndTag endTag20 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str21 = endTag20.toString();
        endTag20.appendAttributeValue('4');
        boolean boolean24 = endTag20.isSelfClosing();
        endTag20.finaliseTag();
        org.jsoup.parser.Token.TokenType tokenType26 = endTag20.type;
        endTag13.type = tokenType26;
        doctype0.type = tokenType26;
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "</<!---->>" + "'", str14, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "</<!---->>" + "'", str18, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "</<!---->>" + "'", str21, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + tokenType26 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType26.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        boolean boolean2 = doctype0.isDoctype();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder7 = doctype0.name;
        boolean boolean8 = doctype0.isForceQuirks();
        doctype0.forceQuirks = false;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder3 = doctype0.publicIdentifier;
        boolean boolean4 = doctype0.forceQuirks;
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        boolean boolean7 = doctype0.forceQuirks;
        org.jsoup.parser.Token.Doctype doctype8 = doctype0.asDoctype();
        doctype0.forceQuirks = true;
        java.lang.String str11 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doctype8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        org.jsoup.nodes.Attributes attributes4 = startTag2.attributes;
        boolean boolean5 = startTag2.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        startTag6.appendAttributeValue('4');
        boolean boolean9 = startTag6.isEndTag();
        startTag6.newAttribute();
        boolean boolean11 = startTag6.isComment();
        boolean boolean12 = startTag6.selfClosing;
        org.jsoup.nodes.Attributes attributes13 = null;
        startTag6.attributes = attributes13;
        org.jsoup.parser.Token.EndTag endTag15 = new org.jsoup.parser.Token.EndTag();
        boolean boolean16 = endTag15.selfClosing;
        org.jsoup.parser.Token.Tag tag18 = endTag15.name("<!---->");
        org.jsoup.parser.Token.TokenType tokenType19 = org.jsoup.parser.Token.TokenType.StartTag;
        tag18.type = tokenType19;
        startTag6.type = tokenType19;
        org.jsoup.nodes.Attributes attributes22 = startTag6.getAttributes();
        boolean boolean23 = startTag6.isSelfClosing();
        org.jsoup.nodes.Attributes attributes26 = null;
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag("hi!", attributes26);
        startTag27.newAttribute();
        startTag27.tagName = "";
        org.jsoup.nodes.Attributes attributes31 = startTag27.attributes;
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag("", attributes31);
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag();
        startTag33.appendAttributeValue('4');
        boolean boolean36 = startTag33.isDoctype();
        org.jsoup.nodes.Attributes attributes37 = startTag33.attributes;
        startTag32.attributes = attributes37;
        startTag6.attributes = attributes37;
        startTag2.attributes = attributes37;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + tokenType19 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType19.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(attributes22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(attributes37);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
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
        startTag2.appendTagName("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(attributes11);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(tag15);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
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
        boolean boolean25 = endTag1.isCharacter();
        endTag1.appendAttributeName("");
        endTag1.newAttribute();
        java.lang.String str29 = endTag1.name();
        org.jsoup.nodes.Attributes attributes30 = endTag1.getAttributes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</</<!---->>>" + "'", str2, "</</<!---->>>");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "</<!---->>" + "'", str29, "</<!---->>");
        org.junit.Assert.assertNotNull(attributes30);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
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
        org.jsoup.parser.Token.EndTag endTag37 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str38 = endTag37.toString();
        endTag37.appendAttributeValue('4');
        boolean boolean41 = endTag37.isSelfClosing();
        java.lang.String str42 = endTag37.tagName;
        boolean boolean43 = endTag37.isCharacter();
        endTag37.finaliseTag();
        java.lang.String str45 = endTag37.tagName;
        org.jsoup.nodes.Attributes attributes46 = endTag37.attributes;
        boolean boolean47 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag37);
        org.jsoup.parser.Token.StartTag startTag49 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str50 = startTag49.tokenType();
        boolean boolean51 = startTag49.isComment();
        java.lang.String str52 = startTag49.toString();
        boolean boolean53 = startTag49.isComment();
        java.lang.String str54 = startTag49.toString();
        boolean boolean55 = startTag49.isEndTag();
        startTag49.finaliseTag();
        boolean boolean57 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag49);
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "</<!---->>" + "'", str38, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<!---->" + "'", str42, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "<!---->" + "'", str45, "<!---->");
        org.junit.Assert.assertNull(attributes46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "StartTag" + "'", str50, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "<<!---->>" + "'", str52, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "<<!---->>" + "'", str54, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
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
        startTag1.newAttribute();
        startTag1.appendTagName("</Comment>");
        java.lang.String str17 = startTag1.tagName;
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!----></Comment>" + "'", str17, "<!----></Comment>");
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
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
        java.lang.String str21 = comment14.toString();
        org.jsoup.parser.Token.TokenType tokenType22 = comment14.type;
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!---->" + "'", str15, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!---->" + "'", str19, "<!---->");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!---->" + "'", str21, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType22 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType22.equals(org.jsoup.parser.Token.TokenType.Comment));
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
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
        boolean boolean14 = startTag2.isSelfClosing();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "StartTag" + "'", str12, "StartTag");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<StartTag>" + "'", str13, "<StartTag>");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
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
        endTag1.selfClosing = false;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</<!---->>" + "'", str2, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!---->" + "'", str9, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "</<!---->>" + "'", str13, "</<!---->>");
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("4hi!");
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        org.jsoup.parser.Token.TokenType tokenType4 = doctype0.type;
        java.lang.String str5 = doctype0.getSystemIdentifier();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        boolean boolean7 = doctype0.isDoctype();
        java.lang.String str8 = doctype0.getSystemIdentifier();
        boolean boolean9 = doctype0.isEndTag();
        boolean boolean10 = doctype0.isForceQuirks();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag11 = doctype0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("hi!");
        org.jsoup.nodes.Attributes attributes2 = endTag1.attributes;
        boolean boolean3 = endTag1.isSelfClosing();
        org.junit.Assert.assertNull(attributes2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("StartTag<hi!<!---->> ");
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendTagName('4');
        startTag2.appendAttributeValue("<!---->");
        startTag2.appendAttributeName(' ');
        startTag2.appendTagName("</<!---->>");
        boolean boolean12 = startTag2.isEndTag();
        boolean boolean13 = startTag2.isComment();
        boolean boolean14 = startTag2.isSelfClosing();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isEOF();
        startTag0.appendAttributeValue("hi!");
        startTag0.appendTagName('4');
        boolean boolean9 = startTag0.isSelfClosing();
        boolean boolean10 = startTag0.isStartTag();
        java.lang.String str11 = startTag0.name();
        org.jsoup.nodes.Attributes attributes12 = startTag0.getAttributes();
        startTag0.newAttribute();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4" + "'", str11, "4");
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
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
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        xmlTreeBuilder0.initialiseParse("<!---->4", "<</EndTag>>", parseErrorList37);
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        xmlTreeBuilder0.initialiseParse("<hi!  4=\"\">", "<EndTag>", parseErrorList41);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "StartTag" + "'", str31, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList3);
        org.jsoup.parser.Token.EndTag endTag6 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str7 = endTag6.toString();
        java.lang.String str8 = endTag6.toString();
        boolean boolean9 = xmlTreeBuilder0.process((org.jsoup.parser.Token) endTag6);
        endTag6.newAttribute();
        boolean boolean11 = endTag6.selfClosing;
        java.lang.String str12 = endTag6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</<!---->>" + "'", str7, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</<!---->>" + "'", str8, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "</<!---->>" + "'", str12, "</<!---->>");
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes4 = null;
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag("hi!", attributes4);
        startTag5.newAttribute();
        startTag5.tagName = "";
        org.jsoup.nodes.Attributes attributes9 = startTag5.attributes;
        startTag2.attributes = attributes9;
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("StartTag", attributes9);
        startTag11.appendTagName(' ');
        startTag11.appendAttributeValue('#');
        org.jsoup.nodes.Attributes attributes16 = startTag11.attributes;
        boolean boolean17 = startTag11.isStartTag();
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.appendAttributeValue(' ');
        startTag2.newAttribute();
        boolean boolean6 = startTag2.selfClosing;
        org.jsoup.parser.Token.Tag tag8 = startTag2.name("4hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag8);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
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
        org.jsoup.parser.Token.Comment comment45 = new org.jsoup.parser.Token.Comment();
        boolean boolean46 = comment45.isStartTag();
        org.jsoup.parser.Token.Comment comment47 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType48 = org.jsoup.parser.Token.TokenType.Doctype;
        comment47.type = tokenType48;
        comment45.type = tokenType48;
        boolean boolean51 = comment45.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType52 = comment45.type;
        java.lang.String str53 = comment45.getData();
        xmlTreeBuilder0.insert(comment45);
        org.jsoup.parser.Token.Doctype doctype55 = new org.jsoup.parser.Token.Doctype();
        boolean boolean56 = doctype55.isForceQuirks();
        java.lang.String str57 = doctype55.getName();
        boolean boolean58 = doctype55.isCharacter();
        java.lang.StringBuilder stringBuilder59 = doctype55.publicIdentifier;
        org.jsoup.parser.Token.EndTag endTag60 = new org.jsoup.parser.Token.EndTag();
        boolean boolean61 = endTag60.selfClosing;
        org.jsoup.parser.Token.Tag tag63 = endTag60.name("<!---->");
        boolean boolean64 = tag63.isCharacter();
        tag63.appendTagName("Comment");
        org.jsoup.nodes.Attributes attributes67 = tag63.attributes;
        org.jsoup.parser.Token.TokenType tokenType68 = tag63.type;
        doctype55.type = tokenType68;
        doctype55.forceQuirks = false;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype55);
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
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + tokenType48 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType48.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + tokenType52 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType52.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(stringBuilder59);
        org.junit.Assert.assertEquals(stringBuilder59.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(tag63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(attributes67);
        org.junit.Assert.assertTrue("'" + tokenType68 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType68.equals(org.jsoup.parser.Token.TokenType.EndTag));
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.Token.Character character6 = new org.jsoup.parser.Token.Character("StartTag");
        xmlTreeBuilder0.insert(character6);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("<!---->");
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag("hi!", attributes11);
        startTag12.newAttribute();
        startTag12.tagName = "";
        org.jsoup.nodes.Attributes attributes16 = startTag12.attributes;
        startTag9.attributes = attributes16;
        boolean boolean18 = startTag9.isDoctype();
        java.lang.String str19 = startTag9.tagName;
        startTag9.finaliseTag();
        java.lang.String str21 = startTag9.name();
        org.jsoup.parser.Token.Tag tag23 = startTag9.name("4#");
        org.jsoup.nodes.Element element24 = xmlTreeBuilder0.insert(startTag9);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!---->" + "'", str19, "<!---->");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!---->" + "'", str21, "<!---->");
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(element24);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        endTag1.appendTagName("StartTag");
        endTag1.newAttribute();
        org.jsoup.parser.Token.TokenType tokenType8 = endTag1.type;
        org.jsoup.nodes.Attributes attributes10 = null;
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("hi!", attributes10);
        boolean boolean12 = startTag11.isComment();
        startTag11.appendTagName('4');
        startTag11.appendAttributeValue("<!---->");
        java.lang.String str17 = startTag11.tokenType();
        startTag11.newAttribute();
        org.jsoup.nodes.Attributes attributes19 = startTag11.attributes;
        endTag1.attributes = attributes19;
        endTag1.appendTagName('#');
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "StartTag" + "'", str17, "StartTag");
        org.junit.Assert.assertNotNull(attributes19);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        java.lang.String str3 = doctype0.getSystemIdentifier();
        java.lang.String str4 = doctype0.getPublicIdentifier();
        java.lang.String str5 = doctype0.getSystemIdentifier();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.TokenType tokenType9 = doctype0.type;
        java.lang.StringBuilder stringBuilder10 = doctype0.name;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        org.jsoup.parser.Token.TokenType tokenType4 = doctype0.type;
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        boolean boolean8 = doctype0.isForceQuirks();
        boolean boolean9 = doctype0.forceQuirks;
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isEOF();
        startTag0.appendAttributeValue("hi!");
        boolean boolean7 = startTag0.selfClosing;
        startTag0.selfClosing = false;
        org.jsoup.parser.Token.Tag tag11 = startTag0.name("<<!---->>4");
        java.lang.String str12 = startTag0.name();
        boolean boolean13 = startTag0.isStartTag();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<<!---->>4" + "'", str12, "<<!---->>4");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendTagName('4');
        startTag2.appendAttributeValue("<!---->");
        startTag2.appendAttributeValue("");
        startTag2.tagName = "</<!---->>";
        startTag2.newAttribute();
        startTag2.newAttribute();
        boolean boolean14 = startTag2.isComment();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isDoctype();
        boolean boolean5 = startTag0.isEOF();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.newAttribute();
        boolean boolean4 = startTag2.isSelfClosing();
        java.lang.String str5 = startTag2.name();
        boolean boolean6 = startTag2.isSelfClosing();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("</</<!---->StartTag<!----><<!---->>>>");
        java.lang.String str2 = endTag1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</</</<!---->StartTag<!----><<!---->>>>>" + "'", str2, "</</</<!---->StartTag<!----><<!---->>>>>");
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.appendAttributeValue(' ');
        startTag2.appendTagName("</<!---->StartTag>");
        org.jsoup.nodes.Attributes attributes7 = startTag2.attributes;
        boolean boolean8 = startTag2.isComment();
        boolean boolean9 = startTag2.isComment();
        org.junit.Assert.assertNull(attributes7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isEOF();
        startTag0.appendAttributeValue("hi!");
        startTag0.appendTagName('4');
        boolean boolean9 = startTag0.isSelfClosing();
        startTag0.appendAttributeName(' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        org.jsoup.parser.Token.TokenType tokenType2 = comment0.type;
        boolean boolean3 = comment0.isComment();
        java.lang.String str4 = comment0.getData();
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        java.lang.String str6 = comment0.toString();
        java.lang.StringBuilder stringBuilder7 = comment0.data;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
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
        org.jsoup.parser.Token.Tag tag16 = startTag11.name("StartTag");
        java.lang.String str17 = startTag11.toString();
        startTag11.newAttribute();
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<StartTag>" + "'", str17, "<StartTag>");
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
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
        startTag2.appendAttributeValue('#');
        java.lang.String str15 = startTag2.tagName;
        boolean boolean16 = startTag2.isStartTag();
        boolean boolean17 = startTag2.selfClosing;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isForceQuirks();
        boolean boolean4 = doctype0.forceQuirks;
        java.lang.String str5 = doctype0.getPublicIdentifier();
        boolean boolean6 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        startTag0.newAttribute();
        boolean boolean5 = startTag0.isComment();
        org.jsoup.parser.Token.TokenType tokenType6 = startTag0.type;
        startTag0.selfClosing = true;
        boolean boolean9 = startTag0.isSelfClosing();
        startTag0.appendTagName("< >");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
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
        xmlTreeBuilder18.initialiseParse("", "<<!---->>", parseErrorList21);
        org.jsoup.parser.Token.EndTag endTag24 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str25 = endTag24.toString();
        java.lang.String str26 = endTag24.toString();
        boolean boolean27 = xmlTreeBuilder18.process((org.jsoup.parser.Token) endTag24);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        xmlTreeBuilder18.initialiseParse("hi!<!---->", "", parseErrorList30);
        org.jsoup.parser.Token.Character character33 = new org.jsoup.parser.Token.Character("");
        java.lang.String str34 = character33.toString();
        java.lang.String str35 = character33.toString();
        java.lang.String str36 = character33.getData();
        boolean boolean37 = character33.isComment();
        java.lang.String str38 = character33.toString();
        xmlTreeBuilder18.insert(character33);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder40 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList43 = null;
        xmlTreeBuilder40.initialiseParse("</<!---->>", "</<!---->>", parseErrorList43);
        org.jsoup.parser.ParseErrorList parseErrorList47 = null;
        xmlTreeBuilder40.initialiseParse("StartTag", "<!---->", parseErrorList47);
        org.jsoup.parser.Token.Comment comment49 = new org.jsoup.parser.Token.Comment();
        java.lang.String str50 = comment49.getData();
        xmlTreeBuilder40.insert(comment49);
        java.lang.String str52 = comment49.toString();
        xmlTreeBuilder18.insert(comment49);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder54 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList57 = null;
        xmlTreeBuilder54.initialiseParse("</<!---->>", "StartTag", parseErrorList57);
        org.jsoup.parser.Token.Comment comment59 = new org.jsoup.parser.Token.Comment();
        java.lang.String str60 = comment59.toString();
        xmlTreeBuilder54.insert(comment59);
        org.jsoup.parser.Token.Character character63 = new org.jsoup.parser.Token.Character("");
        java.lang.String str64 = character63.toString();
        xmlTreeBuilder54.insert(character63);
        org.jsoup.parser.Token.Character character67 = new org.jsoup.parser.Token.Character("<<!---->>");
        java.lang.String str68 = character67.toString();
        xmlTreeBuilder54.insert(character67);
        java.lang.String str70 = character67.getData();
        xmlTreeBuilder18.insert(character67);
        xmlTreeBuilder0.insert(character67);
        org.jsoup.parser.ParseErrorList parseErrorList75 = null;
        xmlTreeBuilder0.initialiseParse("<hi!<!----><<!---->>>", "</<hi!>a>", parseErrorList75);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "</<!---->>" + "'", str25, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "</<!---->>" + "'", str26, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "<!---->" + "'", str52, "<!---->");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "<!---->" + "'", str60, "<!---->");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "<<!---->>" + "'", str68, "<<!---->>");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "<<!---->>" + "'", str70, "<<!---->>");
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str3 = startTag2.toString();
        boolean boolean4 = startTag2.isComment();
        java.lang.String str5 = startTag2.tokenType();
        org.jsoup.nodes.Attributes attributes6 = startTag2.getAttributes();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("<</hi!<!---->>>", attributes6);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<<!---->>" + "'", str3, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
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
        startTag0.appendTagName('a');
        org.jsoup.parser.Token.Tag tag19 = startTag0.name("4");
        org.jsoup.parser.Token.Tag tag21 = tag19.name("<!---->");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "StartTag" + "'", str14, "StartTag");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(tag21);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        endTag1.tagName = "</</<!---->>>";
        boolean boolean7 = endTag1.selfClosing;
        java.lang.String str8 = endTag1.name();
        endTag1.appendAttributeName("hi!Comment");
        java.lang.String str11 = endTag1.name();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</</<!---->>>" + "'", str8, "</</<!---->>>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "</</<!---->>>" + "'", str11, "</</<!---->>>");
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "StartTag", parseErrorList3);
        org.jsoup.parser.Token.Comment comment5 = new org.jsoup.parser.Token.Comment();
        java.lang.String str6 = comment5.toString();
        xmlTreeBuilder0.insert(comment5);
        java.lang.String str8 = comment5.tokenType();
        java.lang.String str9 = comment5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Comment" + "'", str8, "Comment");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!---->" + "'", str9, "<!---->");
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendTagName("EndTag");
        java.lang.String str6 = startTag2.name();
        java.lang.String str7 = startTag2.name();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!EndTag" + "'", str6, "hi!EndTag");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!EndTag" + "'", str7, "hi!EndTag");
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendAttributeName("StartTag");
        boolean boolean6 = startTag2.isComment();
        startTag2.appendTagName("<!----><<!---->>");
        org.jsoup.nodes.Attributes attributes9 = startTag2.attributes;
        boolean boolean10 = startTag2.selfClosing;
        boolean boolean11 = startTag2.selfClosing;
        boolean boolean12 = startTag2.isDoctype();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
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
        startTag2.appendAttributeName("StartTag");
        org.jsoup.nodes.Attributes attributes24 = startTag2.attributes;
        startTag2.appendTagName('a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(attributes24);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.String str2 = doctype0.tokenType();
        java.lang.String str3 = doctype0.tokenType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Doctype" + "'", str2, "Doctype");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Doctype" + "'", str3, "Doctype");
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
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
        org.jsoup.nodes.Attributes attributes68 = endTag64.getAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment69 = endTag64.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$EndTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$EndTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
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
        org.junit.Assert.assertNull(attributes68);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        boolean boolean4 = startTag0.isDoctype();
        java.lang.String str5 = startTag0.tokenType();
        startTag0.appendTagName('a');
        boolean boolean8 = startTag0.isSelfClosing();
        startTag0.appendAttributeName('4');
        boolean boolean11 = startTag0.isDoctype();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        java.lang.String str4 = endTag1.toString();
        endTag1.appendTagName('#');
        endTag1.appendAttributeName("<hi!</</<!---->>>>");
        org.jsoup.parser.Token.Tag tag10 = endTag1.name("</</<!---->>>");
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        startTag11.appendAttributeValue('4');
        boolean boolean14 = startTag11.isDoctype();
        boolean boolean15 = startTag11.isEOF();
        startTag11.newAttribute();
        boolean boolean17 = startTag11.isSelfClosing();
        startTag11.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes20 = startTag11.attributes;
        endTag1.attributes = attributes20;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "</<!---->>" + "'", str4, "</<!---->>");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributes20);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isDoctype();
        boolean boolean4 = startTag0.isCharacter();
        startTag0.appendAttributeValue("<!----> ");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendTagName('4');
        startTag2.appendAttributeValue("<!---->");
        startTag2.appendAttributeValue("");
        boolean boolean10 = startTag2.isEndTag();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.forceQuirks = false;
        org.jsoup.parser.Token.TokenType tokenType5 = doctype0.type;
        java.lang.StringBuilder stringBuilder6 = doctype0.publicIdentifier;
        boolean boolean7 = doctype0.forceQuirks;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        startTag1.appendAttributeValue('4');
        boolean boolean4 = startTag1.isEndTag();
        boolean boolean5 = startTag1.isEOF();
        startTag1.appendAttributeValue("hi!");
        startTag1.appendAttributeName('#');
        boolean boolean10 = startTag1.isSelfClosing();
        org.jsoup.nodes.Attributes attributes12 = null;
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("hi!", attributes12);
        startTag13.newAttribute();
        startTag13.tagName = "";
        org.jsoup.nodes.Attributes attributes17 = startTag13.attributes;
        startTag1.attributes = attributes17;
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag("</<!---->StartTag>", attributes17);
        startTag19.appendTagName('#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        doctype0.forceQuirks = true;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        java.lang.String str7 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        java.lang.String str9 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder10 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.Doctype doctype11 = doctype0.asDoctype();
        java.lang.String str12 = doctype0.getSystemIdentifier();
        boolean boolean13 = doctype0.isDoctype();
        java.lang.StringBuilder stringBuilder14 = doctype0.publicIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertNotNull(doctype11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.toString();
        boolean boolean3 = startTag1.isComment();
        java.lang.String str4 = startTag1.tokenType();
        org.jsoup.parser.Token.Tag tag6 = startTag1.name("hi!<<!----><hi!>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment7 = startTag1.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<<!---->>" + "'", str2, "<<!---->>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "StartTag" + "'", str4, "StartTag");
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        org.jsoup.parser.Token.TokenType tokenType2 = comment0.type;
        boolean boolean3 = comment0.isComment();
        java.lang.String str4 = comment0.getData();
        java.lang.String str5 = comment0.toString();
        java.lang.String str6 = comment0.toString();
        boolean boolean7 = comment0.isDoctype();
        java.lang.String str8 = comment0.getData();
        java.lang.String str9 = comment0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!---->" + "'", str9, "<!---->");
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.selfClosing = false;
        startTag0.appendTagName("hi!");
        org.jsoup.nodes.Attributes attributes5 = startTag0.getAttributes();
        startTag0.appendAttributeValue('a');
        org.jsoup.parser.Token.StartTag startTag8 = startTag0.asStartTag();
        java.lang.Class<?> wildcardClass9 = startTag0.getClass();
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        xmlTreeBuilder0.initialiseParse("</<!---->>", "</<!---->>", parseErrorList3);
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        xmlTreeBuilder0.initialiseParse("", "<<!---->>", parseErrorList7);
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        xmlTreeBuilder0.initialiseParse("<!---->", "hi!", parseErrorList11);
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str15 = startTag14.tokenType();
        boolean boolean16 = startTag14.selfClosing;
        org.jsoup.nodes.Element element17 = xmlTreeBuilder0.insert(startTag14);
        java.lang.String str18 = startTag14.name();
        java.lang.Class<?> wildcardClass19 = startTag14.getClass();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "StartTag" + "'", str15, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!---->" + "'", str18, "<!---->");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        endTag1.appendTagName("StartTag");
        endTag1.newAttribute();
        org.jsoup.parser.Token.TokenType tokenType8 = endTag1.type;
        org.jsoup.nodes.Attributes attributes10 = null;
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("hi!", attributes10);
        boolean boolean12 = startTag11.isComment();
        startTag11.appendTagName('4');
        startTag11.appendAttributeValue("<!---->");
        java.lang.String str17 = startTag11.tokenType();
        startTag11.newAttribute();
        org.jsoup.nodes.Attributes attributes19 = startTag11.attributes;
        endTag1.attributes = attributes19;
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        startTag21.appendAttributeValue('4');
        boolean boolean24 = startTag21.isDoctype();
        boolean boolean25 = startTag21.isDoctype();
        java.lang.String str26 = startTag21.tokenType();
        boolean boolean27 = startTag21.isEOF();
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag();
        startTag28.appendAttributeValue('4');
        boolean boolean31 = startTag28.isDoctype();
        org.jsoup.nodes.Attributes attributes32 = startTag28.attributes;
        startTag21.attributes = attributes32;
        endTag1.attributes = attributes32;
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "StartTag" + "'", str17, "StartTag");
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "StartTag" + "'", str26, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(attributes32);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendTagName("EndTag");
        org.jsoup.parser.Token.StartTag startTag6 = startTag2.asStartTag();
        boolean boolean7 = startTag6.isEOF();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        org.jsoup.parser.Token.TokenType tokenType3 = startTag2.type;
        startTag2.finaliseTag();
        startTag2.appendAttributeValue('a');
        java.lang.String str7 = startTag2.tokenType();
        java.lang.String str8 = startTag2.tagName;
        startTag2.tagName = "hi!<<!----><hi!>>";
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "StartTag" + "'", str7, "StartTag");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        java.lang.String str3 = doctype0.getSystemIdentifier();
        java.lang.String str4 = doctype0.getPublicIdentifier();
        java.lang.String str5 = doctype0.getSystemIdentifier();
        doctype0.forceQuirks = false;
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        boolean boolean9 = doctype0.isCharacter();
        boolean boolean10 = doctype0.forceQuirks;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
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
        java.lang.String str40 = startTag37.toString();
        startTag37.selfClosing = true;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + tokenType19 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType19.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(attributes36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "<<!---->StartTag>" + "'", str40, "<<!---->StartTag>");
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
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
        boolean boolean17 = startTag16.isSelfClosing();
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
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
        org.jsoup.parser.Token.Character character35 = new org.jsoup.parser.Token.Character("hi!");
        java.lang.String str36 = character35.getData();
        java.lang.String str37 = character35.toString();
        xmlTreeBuilder18.insert(character35);
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
        org.jsoup.parser.Token.Character character56 = new org.jsoup.parser.Token.Character("<<!---->>");
        java.lang.String str57 = character56.getData();
        xmlTreeBuilder39.insert(character56);
        xmlTreeBuilder18.insert(character56);
        xmlTreeBuilder0.insert(character56);
        org.jsoup.parser.ParseErrorList parseErrorList63 = null;
        xmlTreeBuilder0.initialiseParse("<</</<!---->>>>", "<EndTag>", parseErrorList63);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!----><<!---->>" + "'", str12, "<!----><<!---->>");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(element17);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!---->" + "'", str31, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "<!---->" + "'", str52, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "<<!---->>" + "'", str57, "<<!---->>");
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
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
        org.jsoup.parser.Token.Comment comment17 = new org.jsoup.parser.Token.Comment();
        org.jsoup.parser.Token.TokenType tokenType18 = org.jsoup.parser.Token.TokenType.Doctype;
        comment17.type = tokenType18;
        java.lang.StringBuilder stringBuilder20 = comment17.data;
        boolean boolean21 = comment17.isEOF();
        xmlTreeBuilder0.insert(comment17);
        java.lang.String str23 = comment17.getData();
        boolean boolean24 = comment17.isCharacter();
        java.lang.StringBuilder stringBuilder25 = comment17.data;
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType18 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType18.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "");
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        java.lang.String str5 = doctype0.getSystemIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag6 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
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
        java.lang.Class<?> wildcardClass34 = endTag24.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + tokenType19 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType19.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + tokenType31 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType31.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "</<!---->StartTag>" + "'", str32, "</<!---->StartTag>");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        boolean boolean2 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder3 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder4 = doctype0.name;
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        boolean boolean7 = doctype0.isDoctype();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        org.jsoup.parser.Token.TokenType tokenType3 = startTag2.type;
        startTag2.selfClosing = true;
        startTag2.selfClosing = true;
        java.lang.String str8 = startTag2.toString();
        java.lang.String str9 = startTag2.toString();
        startTag2.newAttribute();
        org.jsoup.parser.Token.Tag tag12 = startTag2.name("</Character>");
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<hi!>" + "'", str8, "<hi!>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<hi!>" + "'", str9, "<hi!>");
        org.junit.Assert.assertNotNull(tag12);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
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
        org.jsoup.parser.Token.Tag tag15 = tag13.name("<<!----><hi!>>");
        org.jsoup.parser.Token.Tag tag17 = tag15.name(" ");
        tag17.newAttribute();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(tag17);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        boolean boolean4 = startTag0.isEOF();
        startTag0.appendAttributeValue("hi!");
        startTag0.appendTagName('4');
        startTag0.finaliseTag();
        startTag0.appendTagName("<!---->");
        java.lang.Class<?> wildcardClass12 = startTag0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.selfClosing;
        endTag0.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes4 = endTag0.getAttributes();
        boolean boolean5 = endTag0.isSelfClosing();
        boolean boolean6 = endTag0.isCharacter();
        java.lang.Class<?> wildcardClass7 = endTag0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getName();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.StringBuilder stringBuilder4 = doctype0.name;
        doctype0.forceQuirks = false;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.StringBuilder stringBuilder2 = doctype0.name;
        doctype0.forceQuirks = false;
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        org.jsoup.parser.Token.Doctype doctype7 = doctype0.asDoctype();
        boolean boolean8 = doctype7.forceQuirks;
        doctype7.forceQuirks = false;
        boolean boolean11 = doctype7.forceQuirks;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(doctype7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("StartTag");
        org.jsoup.nodes.Attributes attributes2 = endTag1.getAttributes();
        boolean boolean3 = endTag1.isSelfClosing();
        endTag1.appendAttributeValue('a');
        endTag1.appendAttributeValue("</EndTag>");
        boolean boolean8 = endTag1.isStartTag();
        org.junit.Assert.assertNull(attributes2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
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
        java.lang.String str22 = character15.getData();
        java.lang.String str23 = character15.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</<!---->>" + "'", str7, "</<!---->>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "</<!---->>" + "'", str8, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        endTag1.finaliseTag();
        org.jsoup.parser.Token.EndTag endTag5 = new org.jsoup.parser.Token.EndTag();
        boolean boolean6 = endTag5.selfClosing;
        org.jsoup.parser.Token.Tag tag8 = endTag5.name("<!---->");
        org.jsoup.parser.Token.TokenType tokenType9 = org.jsoup.parser.Token.TokenType.StartTag;
        tag8.type = tokenType9;
        endTag1.type = tokenType9;
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
        endTag1.attributes = attributes28;
        java.lang.String str31 = endTag1.tagName;
        java.lang.Class<?> wildcardClass32 = endTag1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!---->" + "'", str31, "<!---->");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.isComment();
        startTag2.appendAttributeName("StartTag");
        boolean boolean6 = startTag2.isComment();
        startTag2.appendTagName("<!----><<!---->>");
        org.jsoup.nodes.Attributes attributes9 = startTag2.attributes;
        boolean boolean10 = startTag2.selfClosing;
        org.jsoup.nodes.Attributes attributes11 = startTag2.getAttributes();
        boolean boolean12 = startTag2.isCharacter();
        startTag2.appendTagName('4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
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
        java.lang.String str25 = startTag11.tagName;
        boolean boolean26 = startTag11.isComment();
        boolean boolean27 = startTag11.isDoctype();
        startTag11.appendTagName('#');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag30 = startTag11.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "StartTag" + "'", str25, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getPublicIdentifier();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.String str3 = doctype0.tokenType();
        java.lang.String str4 = doctype0.getName();
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Doctype" + "'", str3, "Doctype");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        endTag1.appendAttributeValue('#');
        boolean boolean4 = endTag1.isEndTag();
        java.lang.String str5 = endTag1.toString();
        org.jsoup.parser.Token.TokenType tokenType6 = endTag1.type;
        java.lang.String str7 = endTag1.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "</<!---->>" + "'", str5, "</<!---->>");
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "</<!---->>" + "'", str7, "</<!---->>");
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
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
        org.jsoup.parser.Token.Doctype doctype27 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str28 = doctype27.getName();
        java.lang.StringBuilder stringBuilder29 = doctype27.name;
        java.lang.StringBuilder stringBuilder30 = doctype27.name;
        doctype27.forceQuirks = true;
        java.lang.String str33 = doctype27.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder34 = doctype27.systemIdentifier;
        java.lang.StringBuilder stringBuilder35 = doctype27.name;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(stringBuilder29);
        org.junit.Assert.assertEquals(stringBuilder29.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder30);
        org.junit.Assert.assertEquals(stringBuilder30.toString(), "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder35);
        org.junit.Assert.assertEquals(stringBuilder35.toString(), "");
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
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
        startTag19.newAttribute();
        boolean boolean25 = startTag19.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType26 = startTag19.type;
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + tokenType26 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType26.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
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
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        xmlTreeBuilder0.initialiseParse("", "<a>", parseErrorList29);
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        org.jsoup.parser.Token.TokenType tokenType3 = startTag2.type;
        startTag2.selfClosing = true;
        startTag2.selfClosing = true;
        java.lang.String str8 = startTag2.toString();
        startTag2.appendAttributeValue("<<!---->>");
        startTag2.appendAttributeValue("<!---->4");
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<hi!>" + "'", str8, "<hi!>");
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.selfClosing = false;
        startTag0.appendTagName("hi!");
        org.jsoup.nodes.Attributes attributes5 = startTag0.getAttributes();
        startTag0.appendAttributeValue('a');
        org.jsoup.parser.Token.StartTag startTag8 = startTag0.asStartTag();
        startTag8.appendAttributeName('4');
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        startTag12.appendAttributeValue('4');
        boolean boolean15 = startTag12.isEndTag();
        startTag12.newAttribute();
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        startTag17.appendAttributeValue('4');
        org.jsoup.nodes.Attributes attributes20 = startTag17.attributes;
        startTag12.attributes = attributes20;
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag("<<hi!>StartTag>", attributes20);
        org.jsoup.parser.Token.TokenType tokenType23 = startTag22.type;
        startTag8.type = tokenType23;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character25 = startTag8.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(startTag8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertTrue("'" + tokenType23 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType23.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        boolean boolean3 = startTag2.selfClosing;
        startTag2.tagName = "</hi!<!---->>";
        boolean boolean6 = startTag2.isSelfClosing();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue('4');
        boolean boolean3 = startTag0.isEndTag();
        startTag0.newAttribute();
        boolean boolean5 = startTag0.isComment();
        boolean boolean6 = startTag0.selfClosing;
        java.lang.String str7 = startTag0.tagName;
        startTag0.appendAttributeValue("<hi!>");
        startTag0.appendTagName('a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("StartTag");
        org.jsoup.parser.Token.Tag tag3 = startTag1.name("<hi!</</<!---->>>>");
        java.lang.String str4 = startTag1.tokenType();
        startTag1.appendTagName("");
        startTag1.tagName = "<<!---->StartTag>";
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "StartTag" + "'", str4, "StartTag");
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        java.lang.String str2 = endTag1.toString();
        endTag1.appendAttributeValue('4');
        boolean boolean5 = endTag1.isEOF();
        java.lang.String str6 = endTag1.toString();
        boolean boolean7 = endTag1.isComment();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</<!---->>" + "'", str2, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "</<!---->>" + "'", str6, "</<!---->>");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getName();
        java.lang.String str3 = doctype0.getName();
        boolean boolean4 = doctype0.isComment();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.newAttribute();
        boolean boolean4 = startTag2.isSelfClosing();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("hi!", attributes6);
        startTag7.newAttribute();
        startTag7.tagName = "";
        boolean boolean11 = startTag7.isComment();
        startTag7.appendTagName('a');
        org.jsoup.nodes.Attributes attributes14 = startTag7.attributes;
        startTag2.attributes = attributes14;
        org.jsoup.nodes.Attributes attributes16 = startTag2.attributes;
        startTag2.appendTagName('#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<!---->");
        org.jsoup.parser.Token.Tag tag3 = endTag1.name("<<!---->>");
        endTag1.appendTagName('#');
        org.junit.Assert.assertNotNull(tag3);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
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
        boolean boolean11 = doctype10.forceQuirks;
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<!---->");
        java.lang.String str2 = startTag1.tokenType();
        boolean boolean3 = startTag1.isSelfClosing();
        startTag1.finaliseTag();
        org.jsoup.nodes.Attributes attributes5 = startTag1.getAttributes();
        org.jsoup.nodes.Attributes attributes6 = startTag1.attributes;
        java.lang.String str7 = startTag1.name();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "StartTag" + "'", str2, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!---->" + "'", str7, "<!---->");
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
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
        startTag0.appendAttributeName("</hi!EndTag>");
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
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        org.jsoup.parser.Token.TokenType tokenType3 = startTag2.type;
        startTag2.selfClosing = true;
        startTag2.selfClosing = true;
        java.lang.String str8 = startTag2.toString();
        java.lang.String str9 = startTag2.toString();
        org.jsoup.parser.Token.Doctype doctype10 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str11 = doctype10.getName();
        boolean boolean12 = doctype10.isDoctype();
        boolean boolean13 = doctype10.isForceQuirks();
        java.lang.StringBuilder stringBuilder14 = doctype10.systemIdentifier;
        boolean boolean15 = doctype10.isForceQuirks();
        java.lang.String str16 = doctype10.getSystemIdentifier();
        boolean boolean17 = doctype10.isForceQuirks();
        java.lang.String str18 = doctype10.getSystemIdentifier();
        java.lang.String str19 = doctype10.getSystemIdentifier();
        org.jsoup.parser.Token.TokenType tokenType20 = doctype10.type;
        startTag2.type = tokenType20;
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<hi!>" + "'", str8, "<hi!>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<hi!>" + "'", str9, "<hi!>");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.Doctype));
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isForceQuirks();
        java.lang.String str2 = doctype0.getName();
        boolean boolean3 = doctype0.isForceQuirks();
        java.lang.String str4 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
        java.lang.String str7 = doctype0.getPublicIdentifier();
        doctype0.forceQuirks = false;
        java.lang.String str10 = doctype0.getName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        boolean boolean3 = doctype0.forceQuirks;
        boolean boolean4 = doctype0.forceQuirks;
        java.lang.String str5 = doctype0.getName();
        boolean boolean6 = doctype0.isForceQuirks();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        org.jsoup.nodes.Attributes attributes1 = null;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!", attributes1);
        startTag2.newAttribute();
        startTag2.tagName = "";
        boolean boolean6 = startTag2.isComment();
        startTag2.appendAttributeName("</</hi!<!---->>>");
        startTag2.appendAttributeName('4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = startTag2.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
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
        java.lang.StringBuilder stringBuilder21 = comment14.data;
        java.lang.StringBuilder stringBuilder22 = comment14.data;
        java.lang.String str23 = comment14.toString();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!---->" + "'", str15, "<!---->");
        org.junit.Assert.assertTrue("'" + tokenType16 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType16.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!---->" + "'", str19, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<!---->" + "'", str23, "<!---->");
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        startTag1.selfClosing = false;
        startTag1.appendTagName("hi!");
        org.jsoup.nodes.Attributes attributes6 = startTag1.getAttributes();
        startTag1.appendAttributeValue('a');
        org.jsoup.parser.Token.StartTag startTag9 = startTag1.asStartTag();
        startTag9.appendAttributeName('4');
        org.jsoup.nodes.Attributes attributes12 = startTag9.attributes;
        org.jsoup.nodes.Attributes attributes13 = startTag9.getAttributes();
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag("</<!---->StartTag>", attributes13);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(startTag9);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("</hi!<!---->>");
        java.lang.String str2 = endTag1.toString();
        boolean boolean3 = endTag1.isSelfClosing();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "</</hi!<!---->>>" + "'", str2, "</</hi!<!---->>>");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("</EndTag>");
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("<</</<!---->>>>");
    }
}

