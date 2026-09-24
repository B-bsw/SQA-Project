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
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.String str4 = comment0.toString();
        boolean boolean5 = comment0.bogus;
        java.lang.String str6 = comment0.toString();
        boolean boolean7 = comment0.isEndTag();
        java.lang.String str8 = comment0.getData();
        org.jsoup.parser.Token token9 = comment0.reset();
        java.lang.String str10 = comment0.getData();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        tag4.appendTagName('4');
        java.lang.String str7 = tag4.normalName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4" + "'", str7, "4");
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        int int8 = documentType4.childNodeSize();
        java.lang.String str9 = documentType4.baseUri();
        java.lang.String str10 = documentType4.baseUri();
        org.jsoup.nodes.Attributes attributes11 = documentType4.attributes();
        org.jsoup.nodes.Node node12 = documentType4.clone();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SYSTEM" + "'", str9, "SYSTEM");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SYSTEM" + "'", str10, "SYSTEM");
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        boolean boolean5 = document3.hasAttr("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node7 = document3.removeAttr("EOF");
        node7.setBaseUri("<<!---->  name=\"\" publicId=\"hi!\" systemId=\"hi!\">");
        org.jsoup.nodes.Node node10 = node7.clone();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        boolean boolean2 = comment0.bogus;
        boolean boolean3 = comment0.isDoctype();
        java.lang.String str4 = comment0.getData();
        boolean boolean5 = comment0.isStartTag();
        comment0.bogus = false;
        boolean boolean8 = comment0.isEOF();
        java.lang.StringBuilder stringBuilder9 = comment0.data;
        boolean boolean10 = comment0.bogus;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str4 = startTag3.normalName;
        startTag3.newAttribute();
        java.lang.String str6 = startTag3.normalName();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag9 = startTag8.reset();
        tag9.finaliseTag();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean17 = documentType15.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes18 = documentType15.attributes();
        tag9.attributes = attributes18;
        org.jsoup.parser.Token.StartTag startTag20 = startTag3.nameAttr("<!---->", attributes18);
        tag1.attributes = attributes18;
        tag1.newAttribute();
        boolean boolean23 = tag1.isCharacter();
        tag1.tagName = "StartTag";
        tag1.finaliseTag();
        org.jsoup.parser.Token.Tag tag27 = tag1.reset();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder28 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document31 = xmlTreeBuilder28.parse("SYSTEM", "#doctype");
        boolean boolean33 = document31.hasAttr("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        boolean boolean35 = document31.hasAttr("PUBLIC");
        org.jsoup.nodes.Node node36 = document31.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList37 = document31.childNodesCopy();
        org.jsoup.nodes.Node node38 = document31.parent();
        org.jsoup.nodes.Attributes attributes39 = document31.attributes();
        tag27.attributes = attributes39;
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(startTag20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(attributes39);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("#doctype", "4", "PUBLIC", "SYSTEM");
        java.lang.String str5 = documentType4.outerHtml();
        org.jsoup.nodes.Node node8 = documentType4.attr("#", "<!DOCTYPE PUBLIC>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE #doctype PUBLIC \"4\" \"PUBLIC\">" + "'", str5, "<!DOCTYPE #doctype PUBLIC \"4\" \"PUBLIC\">");
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "SYSTEM", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("<SYSTEM>", "Doctype");
        org.jsoup.nodes.Node node8 = node7.previousSibling();
        org.jsoup.nodes.Node node9 = node7.parentNode();
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("<!---->4", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "<system>", "<!---->");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node9.after((org.jsoup.nodes.Node) documentType14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("<!DOCTYPE PUBLIC>");
        node11.setBaseUri("Comment");
        org.jsoup.nodes.Node node15 = node11.removeAttr("<!DOCTYPE <!DOCTYPE PUBLIC> PUBLIC \"#doctype\" \"4\">");
        boolean boolean17 = node15.hasAttr("<system>");
        boolean boolean19 = node15.hasAttr("4public");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        java.lang.String str4 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        boolean boolean6 = startTag0.isDoctype();
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("Doctype");
        org.jsoup.nodes.Attributes attributes9 = tag8.attributes;
        java.lang.String str10 = tag8.tagName;
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean17 = documentType15.hasAttr("hi!");
        int int18 = documentType15.childNodeSize();
        org.jsoup.nodes.Node node19 = documentType15.nextSibling();
        org.jsoup.nodes.Node node20 = documentType15.clone();
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str22 = startTag21.normalName;
        startTag21.newAttribute();
        java.lang.String str24 = startTag21.normalName();
        org.jsoup.parser.Token.Doctype doctype25 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str26 = doctype25.getName();
        org.jsoup.parser.Token.TokenType tokenType27 = doctype25.type;
        startTag21.type = tokenType27;
        boolean boolean29 = documentType15.equals((java.lang.Object) startTag21);
        org.jsoup.parser.Token.TokenType tokenType30 = org.jsoup.parser.Token.TokenType.EOF;
        startTag21.type = tokenType30;
        tag8.type = tokenType30;
        tag8.selfClosing = false;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype35 = tag8.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Doctype" + "'", str10, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + tokenType27 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType27.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + tokenType30 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType30.equals(org.jsoup.parser.Token.TokenType.EOF));
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodesCopy();
        java.lang.String str9 = documentType4.attr("StartTag");
        org.jsoup.nodes.Node node10 = documentType4.parent();
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("Comment");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = node12.siblingNodes();
        java.lang.String str14 = node12.baseUri();
        int int15 = node12.childNodeSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "SYSTEM" + "'", str14, "SYSTEM");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        java.lang.String str4 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        boolean boolean6 = startTag0.isDoctype();
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("Doctype");
        org.jsoup.nodes.Attributes attributes9 = tag8.attributes;
        java.lang.String str10 = tag8.tagName;
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean17 = documentType15.hasAttr("hi!");
        int int18 = documentType15.childNodeSize();
        org.jsoup.nodes.Node node19 = documentType15.nextSibling();
        org.jsoup.nodes.Node node20 = documentType15.clone();
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str22 = startTag21.normalName;
        startTag21.newAttribute();
        java.lang.String str24 = startTag21.normalName();
        org.jsoup.parser.Token.Doctype doctype25 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str26 = doctype25.getName();
        org.jsoup.parser.Token.TokenType tokenType27 = doctype25.type;
        startTag21.type = tokenType27;
        boolean boolean29 = documentType15.equals((java.lang.Object) startTag21);
        org.jsoup.parser.Token.TokenType tokenType30 = org.jsoup.parser.Token.TokenType.EOF;
        startTag21.type = tokenType30;
        tag8.type = tokenType30;
        tag8.appendTagName("Doctype");
        tag8.appendAttributeValue(' ');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Doctype" + "'", str10, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + tokenType27 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType27.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + tokenType30 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType30.equals(org.jsoup.parser.Token.TokenType.EOF));
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        startTag0.appendTagName("PUBLIC");
        org.jsoup.parser.Token.Tag tag10 = startTag0.reset();
        startTag0.normalName = "<!---->";
        startTag0.normalName = "EOF";
        boolean boolean15 = startTag0.isDoctype();
        org.jsoup.parser.Token.Tag tag16 = startTag0.reset();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tag16);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("SYSTEM", "SYSTEM", "#doctype", "SYSTEM");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("PUBLIC");
        java.lang.String str7 = node6.outerHtml();
        org.jsoup.nodes.Document document8 = node6.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document9 = document8.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">" + "'", str7, "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">");
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        java.lang.String str8 = startTag0.tagName;
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean15 = documentType13.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes16 = documentType13.attributes();
        startTag0.attributes = attributes16;
        boolean boolean18 = startTag0.isDoctype();
        startTag0.tagName = "<SYSTEM>";
        startTag0.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str25 = startTag24.normalName;
        org.jsoup.nodes.Attributes attributes26 = startTag24.attributes;
        org.jsoup.nodes.Attributes attributes27 = startTag24.getAttributes();
        org.jsoup.parser.Token.StartTag startTag28 = startTag0.nameAttr("<<!doctype system public \"system\" \"#doctype\">  name=\"\" publicId=\"hi!\" systemId=\"hi!\">", attributes27);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(startTag28);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.String str4 = comment0.toString();
        boolean boolean5 = comment0.bogus;
        java.lang.String str6 = comment0.toString();
        java.lang.String str7 = comment0.tokenType();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Comment" + "'", str7, "Comment");
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder5 = comment4.data;
        xmlTreeBuilder0.insert(comment4);
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean14 = documentType12.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Node node15 = documentType12.nextSibling();
        org.jsoup.parser.Token.Doctype doctype16 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder17 = doctype16.name;
        java.lang.StringBuilder stringBuilder18 = doctype16.systemIdentifier;
        boolean boolean19 = doctype16.isComment();
        boolean boolean20 = doctype16.isComment();
        boolean boolean21 = documentType12.hasSameValue((java.lang.Object) doctype16);
        xmlTreeBuilder0.insert(doctype16);
        org.jsoup.parser.ParseSettings parseSettings23 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Character character24 = new org.jsoup.parser.Token.Character();
        java.lang.String str25 = character24.toString();
        java.lang.String str26 = character24.toString();
        org.jsoup.parser.Token token27 = character24.reset();
        java.lang.String str28 = character24.getData();
        java.lang.String str29 = character24.getData();
        xmlTreeBuilder0.insert(character24);
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag33 = startTag32.reset();
        tag33.finaliseTag();
        tag33.appendTagName('4');
        java.lang.String str37 = tag33.name();
        org.jsoup.parser.Token.Tag tag38 = tag33.reset();
        tag33.setEmptyAttributeValue();
        tag33.appendAttributeName('#');
        org.jsoup.nodes.Attributes attributes42 = tag33.attributes;
        boolean boolean43 = xmlTreeBuilder0.processStartTag("<<SYSTEM>>", attributes42);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(parseSettings23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(token27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "4" + "'", str37, "4");
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder5 = comment4.data;
        xmlTreeBuilder0.insert(comment4);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.ParseSettings parseSettings11 = null;
        xmlTreeBuilder7.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList10, parseSettings11);
        org.jsoup.parser.Token.Character character13 = new org.jsoup.parser.Token.Character();
        java.lang.String str14 = character13.getData();
        org.jsoup.parser.Token.Character character16 = character13.data("<!---->");
        java.lang.String str17 = character16.getData();
        xmlTreeBuilder7.insert(character16);
        xmlTreeBuilder0.insert(character16);
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document23 = xmlTreeBuilder0.parse("<!---->", "SYSTEM");
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str26 = startTag25.normalName;
        startTag25.newAttribute();
        java.lang.String str28 = startTag25.normalName();
        startTag25.appendAttributeName("");
        startTag25.normalName = "hi!";
        org.jsoup.parser.Token.Tag tag33 = startTag25.reset();
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag36 = startTag35.reset();
        org.jsoup.parser.Token.Tag tag37 = startTag35.reset();
        org.jsoup.nodes.Attributes attributes38 = startTag35.getAttributes();
        org.jsoup.parser.Token.StartTag startTag39 = startTag25.nameAttr("Doctype", attributes38);
        boolean boolean40 = xmlTreeBuilder0.processStartTag("<!---->#doctype", attributes38);
        org.jsoup.parser.Token.Comment comment41 = new org.jsoup.parser.Token.Comment();
        comment41.bogus = false;
        java.lang.StringBuilder stringBuilder44 = comment41.data;
        boolean boolean45 = comment41.isEOF();
        java.lang.String str46 = comment41.tokenType();
        xmlTreeBuilder0.insert(comment41);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(character16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!---->" + "'", str17, "<!---->");
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertNotNull(startTag39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(stringBuilder44);
        org.junit.Assert.assertEquals(stringBuilder44.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Comment" + "'", str46, "Comment");
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        startTag0.appendTagName("PUBLIC");
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag10.reset();
        tag11.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str14 = startTag13.normalName;
        startTag13.newAttribute();
        java.lang.String str16 = startTag13.normalName();
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag19 = startTag18.reset();
        tag19.finaliseTag();
        org.jsoup.nodes.DocumentType documentType25 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean27 = documentType25.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes28 = documentType25.attributes();
        tag19.attributes = attributes28;
        org.jsoup.parser.Token.StartTag startTag30 = startTag13.nameAttr("<!---->", attributes28);
        tag11.attributes = attributes28;
        char[] charArray33 = new char[] { 'a' };
        tag11.appendAttributeValue(charArray33);
        startTag0.appendAttributeValue(charArray33);
        startTag0.appendTagName('a');
        boolean boolean38 = startTag0.selfClosing;
        org.jsoup.parser.Token.Tag tag39 = startTag0.reset();
        boolean boolean40 = tag39.isComment();
        boolean boolean41 = tag39.selfClosing;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(startTag30);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str10 = startTag9.normalName;
        org.jsoup.nodes.Attributes attributes11 = startTag9.attributes;
        org.jsoup.parser.Token.StartTag startTag12 = startTag0.nameAttr("SYSTEM", attributes11);
        startTag0.appendAttributeValue('a');
        startTag0.appendTagName(' ');
        org.jsoup.nodes.Attributes attributes17 = startTag0.attributes;
        boolean boolean18 = startTag0.isStartTag();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag6 = startTag5.reset();
        tag6.finaliseTag();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean14 = documentType12.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes15 = documentType12.attributes();
        tag6.attributes = attributes15;
        org.jsoup.parser.Token.StartTag startTag17 = startTag0.nameAttr("<!---->", attributes15);
        startTag0.appendAttributeName("StartTag");
        startTag0.appendTagName("#doctype");
        java.lang.String str22 = startTag0.toString();
        org.jsoup.parser.Token.Tag tag23 = startTag0.reset();
        boolean boolean24 = tag23.isComment();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<<!---->#doctype  name=\"\" publicId=\"hi!\" systemId=\"hi!\">" + "'", str22, "<<!---->#doctype  name=\"\" publicId=\"hi!\" systemId=\"hi!\">");
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str4 = startTag3.normalName;
        startTag3.newAttribute();
        java.lang.String str6 = startTag3.normalName();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag9 = startTag8.reset();
        tag9.finaliseTag();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean17 = documentType15.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes18 = documentType15.attributes();
        tag9.attributes = attributes18;
        org.jsoup.parser.Token.StartTag startTag20 = startTag3.nameAttr("<!---->", attributes18);
        tag1.attributes = attributes18;
        tag1.newAttribute();
        boolean boolean23 = tag1.isCharacter();
        tag1.tagName = "StartTag";
        tag1.finaliseTag();
        tag1.selfClosing = false;
        java.lang.String str29 = tag1.normalName();
        org.jsoup.parser.Token.TokenType tokenType30 = tag1.type;
        org.jsoup.nodes.DocumentType documentType35 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean37 = documentType35.hasSameValue((java.lang.Object) (short) -1);
        java.util.List<org.jsoup.nodes.Node> nodeList38 = documentType35.siblingNodes();
        boolean boolean40 = documentType35.equals((java.lang.Object) 0L);
        org.jsoup.nodes.Node node41 = documentType35.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList42 = documentType35.siblingNodes();
        documentType35.setBaseUri("4");
        java.lang.String str45 = documentType35.baseUri();
        org.jsoup.nodes.Node node46 = documentType35.nextSibling();
        org.jsoup.nodes.Attributes attributes47 = documentType35.attributes();
        tag1.attributes = attributes47;
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(startTag20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + tokenType30 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType30.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "4" + "'", str45, "4");
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(attributes47);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.String str7 = documentType4.nodeName();
        boolean boolean9 = documentType4.hasAttr("EOF");
        org.jsoup.nodes.Node node11 = documentType4.wrap("<!DOCTYPE PUBLIC>");
        org.jsoup.nodes.Node node14 = documentType4.attr("<SYSTEM></SYSTEM>", "<!DOCTYPE PUBLIC>");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.ParseSettings parseSettings19 = null;
        xmlTreeBuilder15.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList18, parseSettings19);
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.ParseSettings parseSettings24 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlTreeBuilder15.parseFragment("", "#doctype", parseErrorList23, parseSettings24);
        org.jsoup.parser.Token.Comment comment26 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder27 = comment26.data;
        java.lang.String str28 = comment26.toString();
        org.jsoup.parser.Token token29 = comment26.reset();
        boolean boolean30 = xmlTreeBuilder15.process((org.jsoup.parser.Token) comment26);
        org.jsoup.parser.ParseSettings parseSettings31 = xmlTreeBuilder15.defaultSettings();
        org.jsoup.nodes.Document document34 = xmlTreeBuilder15.parse("4", "PUBLIC");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = node14.after((org.jsoup.nodes.Node) document34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!---->" + "'", str28, "<!---->");
        org.junit.Assert.assertNotNull(token29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertNotNull(document34);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("<!DOCTYPE PUBLIC>");
        org.jsoup.nodes.Node node13 = node11.removeAttr("<<!---->  name=\"\" publicId=\"hi!\" systemId=\"hi!\">");
        node11.setBaseUri("");
        org.jsoup.nodes.Node node16 = node11.clone();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        org.jsoup.nodes.Attributes attributes2 = startTag0.attributes;
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        startTag0.tagName = "<!DOCTYPE #doctype PUBLIC \"4\" \"PUBLIC\">";
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("SYSTEM", "SYSTEM", "#doctype", "SYSTEM");
        org.jsoup.nodes.Node node14 = documentType12.removeAttr("PUBLIC");
        org.jsoup.nodes.Node node17 = node14.attr("<SYSTEM>", "StartTag");
        org.jsoup.nodes.Attributes attributes18 = node14.attributes();
        org.jsoup.parser.Token.StartTag startTag19 = startTag0.nameAttr("Character", attributes18);
        startTag19.appendAttributeName("#");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(startTag19);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodesCopy();
        java.lang.String str8 = documentType4.toString();
        documentType4.setBaseUri("<!doctype system public \"system\" \"#doctype\">");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.siblingNodes();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str8, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.Tag tag3 = tag1.reset();
        org.jsoup.nodes.Attributes attributes4 = tag3.attributes;
        org.jsoup.parser.Token.Tag tag5 = tag3.reset();
        tag5.normalName = "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">";
        org.jsoup.parser.Token.TokenType tokenType8 = tag5.type;
        org.jsoup.parser.Token.StartTag startTag9 = tag5.asStartTag();
        org.jsoup.parser.Token.Tag tag10 = startTag9.reset();
        org.jsoup.parser.Token.Tag tag11 = tag10.reset();
        java.lang.String str12 = tag11.normalName();
        tag11.appendAttributeName("<<!---->  name=\"\" publicId=\"hi!\" systemId=\"hi!\">");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(startTag9);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList8, parseSettings9);
        org.jsoup.parser.Token.Character character11 = new org.jsoup.parser.Token.Character();
        java.lang.String str12 = character11.getData();
        xmlTreeBuilder0.insert(character11);
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.ParseSettings parseSettings21 = null;
        xmlTreeBuilder17.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList20, parseSettings21);
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder17.parseFragment("", "#doctype", parseErrorList25, parseSettings26);
        org.jsoup.parser.Token.Character character28 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder17.insert(character28);
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings34 = xmlTreeBuilder33.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = xmlTreeBuilder17.parseFragment("SYSTEM", "PUBLIC", parseErrorList32, parseSettings34);
        java.util.List<org.jsoup.nodes.Node> nodeList36 = xmlTreeBuilder0.parseFragment("#doctype", "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">", parseErrorList16, parseSettings34);
        org.jsoup.parser.ParseSettings parseSettings37 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str39 = startTag38.normalName;
        startTag38.newAttribute();
        java.lang.String str41 = startTag38.normalName();
        java.lang.String str42 = startTag38.normalName();
        org.jsoup.parser.Token.Tag tag43 = startTag38.reset();
        boolean boolean44 = startTag38.isDoctype();
        org.jsoup.parser.Token.Tag tag46 = startTag38.name("Doctype");
        startTag38.appendAttributeName("<<SYSTEM>>");
        org.jsoup.nodes.Element element49 = xmlTreeBuilder0.insert(startTag38);
        org.jsoup.parser.Token.StartTag startTag51 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag52 = startTag51.reset();
        tag52.finaliseTag();
        org.jsoup.nodes.DocumentType documentType58 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean60 = documentType58.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes61 = documentType58.attributes();
        tag52.attributes = attributes61;
        java.lang.String str63 = tag52.tagName;
        boolean boolean64 = tag52.selfClosing;
        boolean boolean65 = tag52.selfClosing;
        org.jsoup.nodes.Attributes attributes66 = tag52.attributes;
        boolean boolean67 = xmlTreeBuilder0.processStartTag("#doctype", attributes66);
        org.jsoup.parser.Token.StartTag startTag68 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str69 = startTag68.normalName;
        startTag68.newAttribute();
        java.lang.String str71 = startTag68.normalName();
        startTag68.appendAttributeName("");
        startTag68.normalName = "hi!";
        org.jsoup.parser.Token.Tag tag76 = startTag68.reset();
        org.jsoup.parser.Token.StartTag startTag78 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag79 = startTag78.reset();
        org.jsoup.parser.Token.Tag tag80 = startTag78.reset();
        org.jsoup.nodes.Attributes attributes81 = startTag78.getAttributes();
        org.jsoup.parser.Token.StartTag startTag82 = startTag68.nameAttr("Doctype", attributes81);
        boolean boolean83 = startTag82.isSelfClosing();
        boolean boolean84 = startTag82.selfClosing;
        org.jsoup.nodes.Element element85 = xmlTreeBuilder0.insert(startTag82);
        java.lang.String str86 = element85.baseUri();
        org.jsoup.nodes.DocumentType documentType91 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int92 = documentType91.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList93 = documentType91.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList94 = documentType91.childNodesCopy();
        java.lang.String str95 = documentType91.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList96 = documentType91.childNodes();
        org.jsoup.nodes.Node node97 = documentType91.clone();
        element85.replaceWith((org.jsoup.nodes.Node) documentType91);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(tag52);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(attributes61);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(attributes66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNotNull(tag76);
        org.junit.Assert.assertNotNull(tag79);
        org.junit.Assert.assertNotNull(tag80);
        org.junit.Assert.assertNotNull(attributes81);
        org.junit.Assert.assertNotNull(startTag82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(element85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">" + "'", str86, "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">");
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertNotNull(nodeList93);
        org.junit.Assert.assertNotNull(nodeList94);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str95, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList96);
        org.junit.Assert.assertNotNull(node97);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        java.lang.String str2 = comment0.toString();
        boolean boolean3 = comment0.isDoctype();
        boolean boolean4 = comment0.isCharacter();
        boolean boolean5 = comment0.isStartTag();
        java.lang.String str6 = comment0.toString();
        org.jsoup.parser.Token token7 = comment0.reset();
        java.lang.String str8 = comment0.toString();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!---->" + "'", str8, "<!---->");
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE 4 PUBLIC \"<SYSTEM>\" \"4\">", "<Doctype>", "<<!---->a>", "<!DOCTYPE Comment PUBLIC \"<!DOCTYPE PUBLIC>\" \"<<!---->#doctype  name=\"\" publicId=\"hi!\" systemId=\"hi!\">\">");
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        int int8 = documentType4.childNodeSize();
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Node node10 = documentType4.clone();
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        boolean boolean14 = documentType4.hasAttr("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        int int15 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node16 = documentType4.clone();
        node16.setBaseUri("Doctype");
        org.jsoup.nodes.Node node19 = node16.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node19.nextSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SYSTEM" + "'", str9, "SYSTEM");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder2 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str4 = startTag3.normalName;
        startTag3.newAttribute();
        java.lang.String str6 = startTag3.normalName();
        org.jsoup.parser.Token.Doctype doctype7 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str8 = doctype7.getName();
        org.jsoup.parser.Token.TokenType tokenType9 = doctype7.type;
        startTag3.type = tokenType9;
        doctype0.type = tokenType9;
        java.lang.String str12 = doctype0.getPublicIdentifier();
        java.lang.String str13 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder14 = doctype0.systemIdentifier;
        boolean boolean15 = doctype0.forceQuirks;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        boolean boolean7 = documentType4.hasAttr("");
        org.jsoup.nodes.Node node8 = documentType4.parentNode();
        int int9 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node10 = documentType4.clone();
        java.lang.String str11 = node10.outerHtml();
        java.lang.String str13 = node10.absUrl("<PUBLICa>");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str11, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str5 = documentType4.nodeName();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str9 = startTag8.normalName;
        startTag8.newAttribute();
        java.lang.String str11 = startTag8.normalName();
        startTag8.appendAttributeName("");
        startTag8.normalName = "hi!";
        java.lang.String str16 = startTag8.tagName;
        startTag8.setEmptyAttributeValue();
        boolean boolean18 = documentType4.equals((java.lang.Object) startTag8);
        int int19 = documentType4.childNodeSize();
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag21 = startTag20.reset();
        tag21.finaliseTag();
        org.jsoup.nodes.DocumentType documentType27 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean29 = documentType27.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes30 = documentType27.attributes();
        tag21.attributes = attributes30;
        java.lang.String str32 = tag21.tagName;
        boolean boolean33 = tag21.selfClosing;
        boolean boolean34 = tag21.selfClosing;
        tag21.appendAttributeName("SYSTEM");
        boolean boolean37 = documentType4.hasSameValue((java.lang.Object) "SYSTEM");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str7, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag2 = startTag0.reset();
        boolean boolean3 = startTag0.isComment();
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag6 = startTag5.reset();
        tag6.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str9 = startTag8.normalName;
        startTag8.newAttribute();
        java.lang.String str11 = startTag8.normalName();
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag14 = startTag13.reset();
        tag14.finaliseTag();
        org.jsoup.nodes.DocumentType documentType20 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean22 = documentType20.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes23 = documentType20.attributes();
        tag14.attributes = attributes23;
        org.jsoup.parser.Token.StartTag startTag25 = startTag8.nameAttr("<!---->", attributes23);
        tag6.attributes = attributes23;
        tag6.newAttribute();
        boolean boolean28 = tag6.isCharacter();
        tag6.tagName = "StartTag";
        tag6.finaliseTag();
        org.jsoup.parser.Token.Tag tag32 = tag6.reset();
        boolean boolean33 = tag32.isSelfClosing();
        org.jsoup.nodes.Attributes attributes34 = tag32.attributes;
        org.jsoup.parser.Token.StartTag startTag35 = startTag0.nameAttr("#doctype", attributes34);
        org.jsoup.parser.Token.Tag tag37 = startTag0.name("<4>");
        boolean boolean38 = startTag0.isDoctype();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character39 = startTag0.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(startTag25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertNotNull(startTag35);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder5 = comment4.data;
        xmlTreeBuilder0.insert(comment4);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder7 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.ParseSettings parseSettings11 = null;
        xmlTreeBuilder7.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList10, parseSettings11);
        org.jsoup.parser.Token.Character character13 = new org.jsoup.parser.Token.Character();
        java.lang.String str14 = character13.getData();
        org.jsoup.parser.Token.Character character16 = character13.data("<!---->");
        java.lang.String str17 = character16.getData();
        xmlTreeBuilder7.insert(character16);
        xmlTreeBuilder0.insert(character16);
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder21 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.ParseSettings parseSettings25 = null;
        xmlTreeBuilder21.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList24, parseSettings25);
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        org.jsoup.parser.ParseSettings parseSettings30 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlTreeBuilder21.parseFragment("", "#doctype", parseErrorList29, parseSettings30);
        org.jsoup.parser.Token.Comment comment32 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder33 = comment32.data;
        java.lang.String str34 = comment32.toString();
        org.jsoup.parser.Token token35 = comment32.reset();
        boolean boolean36 = xmlTreeBuilder21.process((org.jsoup.parser.Token) comment32);
        org.jsoup.nodes.Document document39 = xmlTreeBuilder21.parse("hi!", "SYSTEM");
        org.jsoup.parser.Token.Character character40 = new org.jsoup.parser.Token.Character();
        java.lang.String str41 = character40.toString();
        org.jsoup.parser.Token token42 = character40.reset();
        xmlTreeBuilder21.insert(character40);
        org.jsoup.parser.Token.StartTag startTag45 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str46 = startTag45.normalName;
        startTag45.newAttribute();
        java.lang.String str48 = startTag45.normalName();
        startTag45.appendAttributeName("");
        startTag45.normalName = "hi!";
        org.jsoup.parser.Token.Tag tag53 = startTag45.reset();
        org.jsoup.parser.Token.Tag tag54 = startTag45.reset();
        org.jsoup.nodes.Attributes attributes55 = startTag45.attributes;
        boolean boolean56 = xmlTreeBuilder21.processStartTag("doctype", attributes55);
        org.jsoup.parser.Token.Character character57 = new org.jsoup.parser.Token.Character();
        java.lang.String str58 = character57.getData();
        org.jsoup.parser.Token.Character character60 = character57.data("<!---->");
        org.jsoup.parser.Token.Character character62 = character60.data("4");
        java.lang.String str63 = character60.toString();
        xmlTreeBuilder21.insert(character60);
        java.lang.String str65 = character60.tokenType();
        org.jsoup.parser.Token.Character character67 = character60.data("StartTag");
        org.jsoup.parser.Token token68 = character67.reset();
        java.lang.String str69 = character67.toString();
        xmlTreeBuilder0.insert(character67);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(character16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!---->" + "'", str17, "<!---->");
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(stringBuilder33);
        org.junit.Assert.assertEquals(stringBuilder33.toString(), "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!---->" + "'", str34, "<!---->");
        org.junit.Assert.assertNotNull(token35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(token42);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(tag53);
        org.junit.Assert.assertNotNull(tag54);
        org.junit.Assert.assertNotNull(attributes55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(character60);
        org.junit.Assert.assertNotNull(character62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "4" + "'", str63, "4");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Character" + "'", str65, "Character");
        org.junit.Assert.assertNotNull(character67);
        org.junit.Assert.assertNotNull(token68);
        org.junit.Assert.assertNull(str69);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.Tag tag3 = tag1.reset();
        boolean boolean4 = tag3.selfClosing;
        tag3.appendTagName("4");
        tag3.appendAttributeValue('#');
        java.lang.String str9 = tag3.tagName;
        org.jsoup.parser.Token.Tag tag10 = tag3.reset();
        tag10.appendAttributeValue(' ');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment13 = tag10.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4" + "'", str9, "4");
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "#doctype", parseErrorList8, parseSettings9);
        org.jsoup.parser.Token.Character character11 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder0.insert(character11);
        java.lang.String str13 = character11.getData();
        java.lang.String str14 = character11.getData();
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag6 = startTag5.reset();
        tag6.finaliseTag();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean14 = documentType12.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes15 = documentType12.attributes();
        tag6.attributes = attributes15;
        org.jsoup.parser.Token.StartTag startTag17 = startTag0.nameAttr("<!---->", attributes15);
        java.lang.String str18 = startTag17.name();
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag20 = startTag19.reset();
        tag20.finaliseTag();
        org.jsoup.nodes.DocumentType documentType26 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean28 = documentType26.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes29 = documentType26.attributes();
        tag20.attributes = attributes29;
        startTag17.attributes = attributes29;
        startTag17.finaliseTag();
        startTag17.appendAttributeName('4');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!---->" + "'", str18, "<!---->");
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(attributes29);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        int int8 = documentType4.childNodeSize();
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Node node10 = documentType4.clone();
        org.jsoup.nodes.Node node11 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodes();
        java.lang.String str14 = documentType4.attr("<!---->4");
        org.jsoup.nodes.Node node16 = documentType4.removeAttr("a");
        boolean boolean18 = node16.hasAttr("4a");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SYSTEM" + "'", str9, "SYSTEM");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.nodes.DocumentType documentType7 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean9 = documentType7.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes10 = documentType7.attributes();
        tag1.attributes = attributes10;
        java.lang.String str12 = tag1.tagName;
        tag1.appendAttributeValue('4');
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag16 = startTag15.reset();
        tag16.finaliseTag();
        tag16.appendTagName('4');
        org.jsoup.nodes.Attributes attributes20 = tag16.getAttributes();
        tag1.attributes = attributes20;
        tag1.normalName = "<!---->";
        int[] intArray27 = new int[] { (byte) 1, (byte) 1, (short) 0 };
        tag1.appendAttributeValue(intArray27);
        org.jsoup.parser.Token.StartTag startTag29 = tag1.asStartTag();
        startTag29.finaliseTag();
        java.lang.String str31 = startTag29.normalName();
        boolean boolean32 = startTag29.isDoctype();
        org.jsoup.parser.Token.Tag tag33 = startTag29.reset();
        java.lang.String str34 = tag33.tagName;
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 1, 1, 0 });
        org.junit.Assert.assertNotNull(startTag29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!---->" + "'", str31, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("SYSTEM", "SYSTEM", "#doctype", "SYSTEM");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("PUBLIC");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = org.jsoup.parser.HtmlTreeBuilderState.ForeignContent;
        boolean boolean8 = documentType4.hasSameValue((java.lang.Object) htmlTreeBuilderState7);
        java.lang.String str10 = documentType4.absUrl("SYSTEM");
        org.jsoup.nodes.Node node13 = documentType4.attr("<4>", "<<!---->a>");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("SYSTEM", "SYSTEM", "#doctype", "SYSTEM");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("PUBLIC");
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("StartTag");
        org.jsoup.parser.Token.Doctype doctype9 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder10 = doctype9.name;
        boolean boolean11 = doctype9.forceQuirks;
        java.lang.String str12 = doctype9.getPublicIdentifier();
        boolean boolean13 = doctype9.isForceQuirks();
        java.lang.StringBuilder stringBuilder14 = doctype9.publicIdentifier;
        java.lang.String str15 = doctype9.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder16 = doctype9.publicIdentifier;
        boolean boolean17 = node8.hasSameValue((java.lang.Object) doctype9);
        org.jsoup.nodes.Node node19 = node8.removeAttr("EOF");
        org.jsoup.nodes.DocumentType documentType24 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str25 = documentType24.nodeName();
        org.jsoup.parser.Token.Doctype doctype26 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str27 = doctype26.getName();
        boolean boolean28 = doctype26.forceQuirks;
        org.jsoup.parser.Token token29 = doctype26.reset();
        org.jsoup.parser.Token.TokenType tokenType30 = doctype26.type;
        boolean boolean31 = doctype26.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType32 = doctype26.type;
        boolean boolean33 = documentType24.hasSameValue((java.lang.Object) doctype26);
        java.lang.StringBuilder stringBuilder34 = doctype26.systemIdentifier;
        java.lang.StringBuilder stringBuilder35 = node8.html(stringBuilder34);
        org.jsoup.parser.Token.reset(stringBuilder34);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#doctype" + "'", str25, "#doctype");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(token29);
        org.junit.Assert.assertTrue("'" + tokenType30 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType30.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + tokenType32 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType32.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder35);
        org.junit.Assert.assertEquals(stringBuilder35.toString(), "");
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        java.lang.String str4 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        java.lang.String str6 = startTag0.tagName;
        boolean boolean7 = startTag0.isSelfClosing();
        org.jsoup.nodes.Attributes attributes8 = startTag0.attributes;
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str11 = startTag10.normalName;
        startTag10.appendAttributeName("SYSTEM");
        org.jsoup.nodes.Attributes attributes14 = startTag10.attributes;
        org.jsoup.parser.Token.StartTag startTag15 = startTag0.nameAttr("4", attributes14);
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str17 = startTag16.normalName;
        startTag16.newAttribute();
        java.lang.String str19 = startTag16.normalName();
        java.lang.String str20 = startTag16.normalName();
        org.jsoup.parser.Token.Tag tag21 = startTag16.reset();
        boolean boolean22 = startTag16.isDoctype();
        org.jsoup.parser.Token.Tag tag23 = startTag16.reset();
        tag23.setEmptyAttributeValue();
        org.jsoup.nodes.Attributes attributes25 = tag23.attributes;
        startTag0.attributes = attributes25;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(startTag15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(attributes25);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList8, parseSettings9);
        org.jsoup.parser.Token.Comment comment11 = new org.jsoup.parser.Token.Comment();
        comment11.bogus = false;
        java.lang.StringBuilder stringBuilder14 = comment11.data;
        org.jsoup.parser.Token.Comment comment15 = comment11.asComment();
        xmlTreeBuilder0.insert(comment11);
        org.jsoup.parser.Token.Comment comment17 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder18 = comment17.data;
        java.lang.String str19 = comment17.toString();
        org.jsoup.parser.Token token20 = comment17.reset();
        org.jsoup.parser.Token token21 = comment17.reset();
        xmlTreeBuilder0.insert(comment17);
        org.jsoup.parser.Token.Comment comment23 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder24 = comment23.data;
        java.lang.String str25 = comment23.toString();
        org.jsoup.parser.Token token26 = comment23.reset();
        org.jsoup.parser.Token token27 = comment23.reset();
        java.lang.String str28 = comment23.toString();
        org.jsoup.parser.Token.Comment comment29 = comment23.asComment();
        xmlTreeBuilder0.insert(comment23);
        boolean boolean31 = comment23.bogus;
        java.lang.String str32 = comment23.getData();
        java.lang.String str33 = comment23.getData();
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertNotNull(comment15);
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!---->" + "'", str19, "<!---->");
        org.junit.Assert.assertNotNull(token20);
        org.junit.Assert.assertNotNull(token21);
        org.junit.Assert.assertNotNull(stringBuilder24);
        org.junit.Assert.assertEquals(stringBuilder24.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!---->" + "'", str25, "<!---->");
        org.junit.Assert.assertNotNull(token26);
        org.junit.Assert.assertNotNull(token27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!---->" + "'", str28, "<!---->");
        org.junit.Assert.assertNotNull(comment29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        int int8 = documentType4.childNodeSize();
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Node node10 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            node10.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SYSTEM" + "'", str9, "SYSTEM");
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("#doctype", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.Token.Character character6 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder0.insert(character6);
        org.jsoup.nodes.Document document10 = xmlTreeBuilder0.parse("EOF", "<SYSTEM>");
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str12 = startTag11.normalName;
        startTag11.newAttribute();
        java.lang.String str14 = startTag11.normalName();
        java.lang.String str15 = startTag11.normalName();
        org.jsoup.parser.Token.Tag tag16 = startTag11.reset();
        startTag11.appendTagName("<SYSTEM>");
        startTag11.setEmptyAttributeValue();
        org.jsoup.nodes.Element element20 = xmlTreeBuilder0.insert(startTag11);
        org.jsoup.nodes.Node node23 = element20.attr("<!DOCTYPE PUBLIC \"SYSTEM\" \"<!DOCTYPE PUBLIC \"hi!\" \"hi!\">\">", "<<SYSTEM>></<SYSTEM>>");
        org.jsoup.nodes.Node node24 = node23.parentNode();
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node8 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        java.lang.String str11 = documentType4.attr("Doctype");
        java.lang.String str12 = documentType4.nodeName();
        org.jsoup.parser.Token.Doctype doctype13 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder14 = doctype13.name;
        java.lang.StringBuilder stringBuilder15 = doctype13.systemIdentifier;
        boolean boolean16 = doctype13.isComment();
        java.lang.String str17 = doctype13.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder18 = doctype13.publicIdentifier;
        boolean boolean19 = doctype13.forceQuirks;
        java.lang.StringBuilder stringBuilder20 = doctype13.publicIdentifier;
        java.lang.StringBuilder stringBuilder21 = documentType4.html(stringBuilder20);
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("SYSTEM", "SYSTEM", "#doctype", "SYSTEM");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("PUBLIC");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = org.jsoup.parser.HtmlTreeBuilderState.ForeignContent;
        boolean boolean8 = documentType4.hasSameValue((java.lang.Object) htmlTreeBuilderState7);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str10 = startTag9.normalName;
        startTag9.newAttribute();
        java.lang.String str12 = startTag9.normalName();
        java.lang.String str13 = startTag9.normalName();
        org.jsoup.parser.Token.Tag tag14 = startTag9.reset();
        org.jsoup.parser.Token.Tag tag15 = startTag9.reset();
        startTag9.tagName = "<!---->";
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder18 = null;
        boolean boolean19 = htmlTreeBuilderState7.process((org.jsoup.parser.Token) startTag9, htmlTreeBuilder18);
        java.lang.String str20 = startTag9.name();
        boolean boolean21 = startTag9.isEOF();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!---->" + "'", str20, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodesCopy();
        java.lang.String str9 = documentType4.attr("StartTag");
        org.jsoup.nodes.Node node10 = documentType4.parent();
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("Comment");
        org.jsoup.nodes.Node node14 = node12.removeAttr("<<SYSTEM>>");
        node14.setBaseUri("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.nodes.DocumentType documentType7 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean9 = documentType7.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes10 = documentType7.attributes();
        tag1.attributes = attributes10;
        java.lang.String str12 = tag1.tagName;
        boolean boolean13 = tag1.selfClosing;
        org.jsoup.parser.Token token14 = tag1.reset();
        tag1.appendAttributeName(' ');
        org.jsoup.parser.Token.Tag tag18 = tag1.name("<!DOCTYPE #doctype PUBLIC \"4\" \"PUBLIC\">");
        tag18.appendAttributeName("<!---->");
        tag18.setEmptyAttributeValue();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertNotNull(tag18);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag6 = startTag5.reset();
        tag6.finaliseTag();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean14 = documentType12.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes15 = documentType12.attributes();
        tag6.attributes = attributes15;
        org.jsoup.parser.Token.StartTag startTag17 = startTag0.nameAttr("<!---->", attributes15);
        boolean boolean18 = startTag0.isStartTag();
        startTag0.appendAttributeValue("<!---->4");
        org.jsoup.parser.Token.Tag tag21 = startTag0.reset();
        org.jsoup.nodes.DocumentType documentType27 = new org.jsoup.nodes.DocumentType("SYSTEM", "SYSTEM", "SYSTEM", "SYSTEM");
        java.lang.String str28 = documentType27.nodeName();
        org.jsoup.nodes.Node node29 = documentType27.clone();
        org.jsoup.parser.Token.Doctype doctype30 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str31 = doctype30.getName();
        org.jsoup.parser.Token.TokenType tokenType32 = doctype30.type;
        org.jsoup.parser.Token token33 = doctype30.reset();
        java.lang.StringBuilder stringBuilder34 = doctype30.name;
        java.lang.String str35 = doctype30.getPublicIdentifier();
        boolean boolean36 = documentType27.hasSameValue((java.lang.Object) str35);
        org.jsoup.nodes.Attributes attributes37 = documentType27.attributes();
        org.jsoup.parser.Token.StartTag startTag38 = startTag0.nameAttr("<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">>", attributes37);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#doctype" + "'", str28, "#doctype");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + tokenType32 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType32.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(token33);
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertNotNull(startTag38);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        java.lang.String str2 = comment0.toString();
        org.jsoup.parser.Token token3 = comment0.reset();
        org.jsoup.parser.Token token4 = comment0.reset();
        comment0.bogus = true;
        boolean boolean7 = comment0.isStartTag();
        org.jsoup.parser.Token token8 = comment0.reset();
        java.lang.String str9 = comment0.getData();
        comment0.bogus = false;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(token8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "#doctype", parseErrorList8, parseSettings9);
        org.jsoup.parser.Token.Comment comment11 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder12 = comment11.data;
        java.lang.String str13 = comment11.toString();
        org.jsoup.parser.Token token14 = comment11.reset();
        boolean boolean15 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment11);
        comment11.bogus = true;
        java.lang.String str18 = comment11.getData();
        org.jsoup.parser.Token.TokenType tokenType19 = comment11.type;
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + tokenType19 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType19.equals(org.jsoup.parser.Token.TokenType.Comment));
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder5 = comment4.data;
        xmlTreeBuilder0.insert(comment4);
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str8 = startTag7.normalName;
        startTag7.newAttribute();
        java.lang.String str10 = startTag7.normalName();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag13 = startTag12.reset();
        tag13.finaliseTag();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean21 = documentType19.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes22 = documentType19.attributes();
        tag13.attributes = attributes22;
        org.jsoup.parser.Token.StartTag startTag24 = startTag7.nameAttr("<!---->", attributes22);
        java.lang.String str25 = startTag24.name();
        boolean boolean26 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag24);
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str28 = startTag27.normalName;
        startTag27.newAttribute();
        java.lang.String str30 = startTag27.normalName();
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag33 = startTag32.reset();
        tag33.finaliseTag();
        org.jsoup.nodes.DocumentType documentType39 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean41 = documentType39.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes42 = documentType39.attributes();
        tag33.attributes = attributes42;
        org.jsoup.parser.Token.StartTag startTag44 = startTag27.nameAttr("<!---->", attributes42);
        boolean boolean45 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag44);
        org.jsoup.parser.Token.Character character46 = new org.jsoup.parser.Token.Character();
        java.lang.String str47 = character46.toString();
        org.jsoup.parser.Token.Character character49 = character46.data("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str50 = character49.toString();
        xmlTreeBuilder0.insert(character49);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder52 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList55 = null;
        org.jsoup.parser.ParseSettings parseSettings56 = null;
        xmlTreeBuilder52.initialiseParse("#doctype", "hi!", parseErrorList55, parseSettings56);
        org.jsoup.parser.Token.Character character58 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder52.insert(character58);
        java.lang.String str60 = character58.getData();
        java.lang.String str61 = character58.toString();
        xmlTreeBuilder0.insert(character58);
        org.jsoup.parser.Token.Doctype doctype63 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder64 = doctype63.name;
        java.lang.StringBuilder stringBuilder65 = doctype63.publicIdentifier;
        xmlTreeBuilder0.insert(doctype63);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder68 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document71 = xmlTreeBuilder68.parse("SYSTEM", "#doctype");
        boolean boolean73 = document71.hasAttr("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node75 = document71.removeAttr("EOF");
        org.jsoup.nodes.Attributes attributes76 = node75.attributes();
        boolean boolean77 = xmlTreeBuilder0.processStartTag("#", attributes76);
        org.jsoup.parser.ParseSettings parseSettings78 = xmlTreeBuilder0.defaultSettings();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(startTag24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!---->" + "'", str25, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertNotNull(startTag44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(character49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str50, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(stringBuilder64);
        org.junit.Assert.assertEquals(stringBuilder64.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder65);
        org.junit.Assert.assertEquals(stringBuilder65.toString(), "");
        org.junit.Assert.assertNotNull(document71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertNotNull(attributes76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(parseSettings78);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        boolean boolean6 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str9 = startTag8.normalName;
        startTag8.newAttribute();
        java.lang.String str11 = startTag8.normalName();
        java.lang.String str12 = startTag8.normalName();
        org.jsoup.parser.Token.Tag tag13 = startTag8.reset();
        org.jsoup.parser.Token.Tag tag14 = tag13.reset();
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag16 = startTag15.reset();
        tag16.finaliseTag();
        tag16.appendTagName('4');
        org.jsoup.nodes.Attributes attributes20 = tag16.getAttributes();
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag22 = startTag21.reset();
        tag22.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str25 = startTag24.normalName;
        startTag24.newAttribute();
        java.lang.String str27 = startTag24.normalName();
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag30 = startTag29.reset();
        tag30.finaliseTag();
        org.jsoup.nodes.DocumentType documentType36 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean38 = documentType36.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes39 = documentType36.attributes();
        tag30.attributes = attributes39;
        org.jsoup.parser.Token.StartTag startTag41 = startTag24.nameAttr("<!---->", attributes39);
        tag22.attributes = attributes39;
        char[] charArray44 = new char[] { 'a' };
        tag22.appendAttributeValue(charArray44);
        tag16.appendAttributeValue(charArray44);
        char[] charArray51 = new char[] { 'a', ' ', '4', ' ' };
        tag16.appendAttributeValue(charArray51);
        tag13.appendAttributeValue(charArray51);
        startTag0.appendAttributeValue(charArray51);
        startTag0.normalName = "<!DOCTYPE PUBLIC>";
        startTag0.finaliseTag();
        org.jsoup.parser.Token.TokenType tokenType58 = startTag0.type;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertNotNull(startTag41);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertArrayEquals(charArray44, new char[] { 'a' });
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertArrayEquals(charArray51, new char[] { 'a', ' ', '4', ' ' });
        org.junit.Assert.assertTrue("'" + tokenType58 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType58.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        java.lang.String str7 = documentType4.baseUri();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = node8.clone();
        int int10 = node9.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node9.after("<<!---->a>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SYSTEM" + "'", str7, "SYSTEM");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        boolean boolean2 = doctype0.forceQuirks;
        org.jsoup.parser.Token token3 = doctype0.reset();
        org.jsoup.parser.Token.TokenType tokenType4 = doctype0.type;
        boolean boolean5 = doctype0.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType6 = doctype0.type;
        java.lang.String str7 = doctype0.getSystemIdentifier();
        boolean boolean8 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder9 = doctype0.name;
        org.jsoup.parser.Token token10 = doctype0.reset();
        java.lang.StringBuilder stringBuilder11 = doctype0.name;
        doctype0.forceQuirks = true;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder5 = comment4.data;
        xmlTreeBuilder0.insert(comment4);
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Comment comment8 = new org.jsoup.parser.Token.Comment();
        comment8.bogus = true;
        boolean boolean11 = comment8.bogus;
        xmlTreeBuilder0.insert(comment8);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.ParseSettings parseSettings17 = null;
        xmlTreeBuilder13.initialiseParse("#doctype", "hi!", parseErrorList16, parseSettings17);
        org.jsoup.parser.Token.Character character19 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder13.insert(character19);
        org.jsoup.parser.Token token21 = character19.reset();
        xmlTreeBuilder0.insert(character19);
        org.jsoup.parser.Token.Doctype doctype23 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str24 = doctype23.getName();
        org.jsoup.parser.Token.TokenType tokenType25 = doctype23.type;
        org.jsoup.parser.Token token26 = doctype23.reset();
        xmlTreeBuilder0.insert(doctype23);
        java.lang.StringBuilder stringBuilder28 = doctype23.systemIdentifier;
        doctype23.forceQuirks = false;
        java.lang.String str31 = doctype23.getPublicIdentifier();
        boolean boolean32 = doctype23.isForceQuirks();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(token21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + tokenType25 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType25.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(token26);
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.siblingNodes();
        boolean boolean10 = documentType4.hasAttr("<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">");
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int16 = documentType15.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = documentType15.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = documentType15.childNodesCopy();
        java.lang.String str19 = documentType15.toString();
        org.jsoup.nodes.Node node22 = documentType15.attr("<!DOCTYPE PUBLIC>", "StartTag");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str19, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        java.lang.String str9 = documentType4.nodeName();
        java.lang.String str11 = documentType4.attr("StartTag");
        org.jsoup.nodes.Node node12 = documentType4.parentNode();
        boolean boolean14 = documentType4.hasAttr("<!---->");
        org.jsoup.nodes.Node node16 = documentType4.removeAttr("SYSTEM");
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str18 = startTag17.normalName;
        startTag17.newAttribute();
        java.lang.String str20 = startTag17.normalName();
        java.lang.String str21 = startTag17.normalName();
        org.jsoup.parser.Token.Tag tag22 = startTag17.reset();
        boolean boolean23 = startTag17.isDoctype();
        boolean boolean24 = startTag17.isCharacter();
        org.jsoup.parser.Token.Tag tag25 = startTag17.reset();
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag27 = startTag26.reset();
        org.jsoup.parser.Token.Tag tag28 = startTag26.reset();
        boolean boolean29 = startTag26.isComment();
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag32 = startTag31.reset();
        tag32.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str35 = startTag34.normalName;
        startTag34.newAttribute();
        java.lang.String str37 = startTag34.normalName();
        org.jsoup.parser.Token.StartTag startTag39 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag40 = startTag39.reset();
        tag40.finaliseTag();
        org.jsoup.nodes.DocumentType documentType46 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean48 = documentType46.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes49 = documentType46.attributes();
        tag40.attributes = attributes49;
        org.jsoup.parser.Token.StartTag startTag51 = startTag34.nameAttr("<!---->", attributes49);
        tag32.attributes = attributes49;
        tag32.newAttribute();
        boolean boolean54 = tag32.isCharacter();
        tag32.tagName = "StartTag";
        tag32.finaliseTag();
        org.jsoup.parser.Token.Tag tag58 = tag32.reset();
        boolean boolean59 = tag58.isSelfClosing();
        org.jsoup.nodes.Attributes attributes60 = tag58.attributes;
        org.jsoup.parser.Token.StartTag startTag61 = startTag26.nameAttr("#doctype", attributes60);
        org.jsoup.parser.Token.Tag tag63 = startTag26.name("<4>");
        boolean boolean64 = startTag26.isDoctype();
        org.jsoup.nodes.Attributes attributes65 = startTag26.getAttributes();
        tag25.attributes = attributes65;
        java.lang.String str67 = tag25.tagName;
        boolean boolean68 = node16.equals((java.lang.Object) tag25);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(attributes49);
        org.junit.Assert.assertNotNull(startTag51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(tag58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(attributes60);
        org.junit.Assert.assertNotNull(startTag61);
        org.junit.Assert.assertNotNull(tag63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(attributes65);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodesCopy();
        java.lang.String str8 = documentType4.toString();
        org.jsoup.nodes.Node node9 = documentType4.clone();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str8, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.nodes.DocumentType documentType7 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean9 = documentType7.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes10 = documentType7.attributes();
        tag1.attributes = attributes10;
        java.lang.String str12 = tag1.tagName;
        tag1.appendAttributeValue('4');
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag16 = startTag15.reset();
        tag16.finaliseTag();
        tag16.appendTagName('4');
        org.jsoup.nodes.Attributes attributes20 = tag16.getAttributes();
        tag1.attributes = attributes20;
        tag1.normalName = "<!---->";
        int[] intArray27 = new int[] { (byte) 1, (byte) 1, (short) 0 };
        tag1.appendAttributeValue(intArray27);
        org.jsoup.parser.Token.StartTag startTag29 = tag1.asStartTag();
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag32 = startTag31.reset();
        tag32.finaliseTag();
        org.jsoup.parser.Token.Tag tag34 = tag32.reset();
        org.jsoup.nodes.Attributes attributes35 = tag34.attributes;
        java.lang.String str36 = tag34.normalName;
        org.jsoup.nodes.Attributes attributes37 = tag34.getAttributes();
        org.jsoup.parser.Token.StartTag startTag38 = startTag29.nameAttr("starttag", attributes37);
        startTag38.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag41 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str42 = startTag41.normalName;
        startTag41.newAttribute();
        org.jsoup.parser.Token.Tag tag44 = startTag41.reset();
        java.lang.String str45 = startTag41.normalName();
        org.jsoup.parser.Token.StartTag startTag47 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str48 = startTag47.normalName;
        startTag47.newAttribute();
        java.lang.String str50 = startTag47.normalName();
        java.lang.String str51 = startTag47.normalName();
        org.jsoup.parser.Token.Tag tag52 = startTag47.reset();
        boolean boolean53 = startTag47.isDoctype();
        org.jsoup.parser.Token.Tag tag55 = startTag47.name("Doctype");
        org.jsoup.nodes.Attributes attributes56 = tag55.attributes;
        org.jsoup.parser.Token.StartTag startTag57 = startTag41.nameAttr("<!---->", attributes56);
        startTag41.normalName = "StartTag";
        org.jsoup.nodes.Attributes attributes60 = startTag41.getAttributes();
        startTag38.attributes = attributes60;
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 1, 1, 0 });
        org.junit.Assert.assertNotNull(startTag29);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertNotNull(startTag38);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(tag52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(tag55);
        org.junit.Assert.assertNotNull(attributes56);
        org.junit.Assert.assertNotNull(startTag57);
        org.junit.Assert.assertNotNull(attributes60);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "SYSTEM", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("<SYSTEM>", "Doctype");
        int int8 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node9 = documentType4.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = documentType4.before("<!DOCTYPE Comment PUBLIC \"<!DOCTYPE PUBLIC>\" \"<<!---->#doctype  name=\"\" publicId=\"hi!\" systemId=\"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "SYSTEM", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("<SYSTEM>", "Doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.childNodes();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        xmlTreeBuilder9.initialiseParse("#doctype", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.Token.Character character15 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder9.insert(character15);
        org.jsoup.nodes.Document document19 = xmlTreeBuilder9.parse("EOF", "<SYSTEM>");
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str21 = startTag20.normalName;
        startTag20.newAttribute();
        java.lang.String str23 = startTag20.normalName();
        java.lang.String str24 = startTag20.normalName();
        org.jsoup.parser.Token.Tag tag25 = startTag20.reset();
        startTag20.appendTagName("<SYSTEM>");
        startTag20.setEmptyAttributeValue();
        org.jsoup.nodes.Element element29 = xmlTreeBuilder9.insert(startTag20);
        org.jsoup.nodes.Node node32 = element29.attr("<!DOCTYPE PUBLIC \"SYSTEM\" \"<!DOCTYPE PUBLIC \"hi!\" \"hi!\">\">", "<<SYSTEM>></<SYSTEM>>");
        org.jsoup.nodes.Node node34 = element29.before("doctype");
        org.jsoup.nodes.Node node36 = node34.after("4a");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith(node34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node36);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeValue('#');
        startTag0.appendAttributeValue('a');
        org.jsoup.parser.Token token8 = startTag0.reset();
        startTag0.appendAttributeName("#");
        startTag0.selfClosing = true;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(token8);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag2 = startTag0.reset();
        org.jsoup.nodes.Attributes attributes3 = startTag0.getAttributes();
        startTag0.appendAttributeValue('a');
        startTag0.setEmptyAttributeValue();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(attributes3);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.nodes.Document document8 = xmlTreeBuilder0.parse("", "SYSTEM");
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder10 = comment9.data;
        java.lang.String str11 = comment9.toString();
        org.jsoup.parser.Token token12 = comment9.reset();
        org.jsoup.parser.Token token13 = comment9.reset();
        java.lang.String str14 = comment9.toString();
        org.jsoup.parser.Token token15 = comment9.reset();
        java.lang.String str16 = comment9.getData();
        boolean boolean17 = comment9.bogus;
        xmlTreeBuilder0.insert(comment9);
        org.jsoup.parser.Token.Character character19 = new org.jsoup.parser.Token.Character();
        java.lang.String str20 = character19.toString();
        java.lang.String str21 = character19.getData();
        org.jsoup.parser.Token.Character character23 = character19.data("SYSTEM");
        java.lang.String str24 = character19.tokenType();
        xmlTreeBuilder0.insert(character19);
        org.jsoup.parser.Token token26 = character19.reset();
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!---->" + "'", str11, "<!---->");
        org.junit.Assert.assertNotNull(token12);
        org.junit.Assert.assertNotNull(token13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!---->" + "'", str14, "<!---->");
        org.junit.Assert.assertNotNull(token15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(character23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Character" + "'", str24, "Character");
        org.junit.Assert.assertNotNull(token26);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean9 = documentType4.equals(obj8);
        java.lang.String str10 = documentType4.toString();
        java.lang.String str11 = documentType4.outerHtml();
        java.lang.String str12 = documentType4.baseUri();
        org.jsoup.nodes.Node node13 = documentType4.nextSibling();
        java.lang.String str15 = documentType4.absUrl("<!doctype system public \"system\" \"#doctype\">");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str10, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str11, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "SYSTEM" + "'", str12, "SYSTEM");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.nodes.DocumentType documentType7 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean9 = documentType7.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes10 = documentType7.attributes();
        tag1.attributes = attributes10;
        java.lang.String str12 = tag1.tagName;
        boolean boolean13 = tag1.selfClosing;
        java.lang.String str14 = tag1.normalName;
        org.jsoup.parser.Token.Tag tag16 = tag1.name("Comment");
        tag1.setEmptyAttributeValue();
        tag1.appendAttributeName("4public");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(tag16);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        boolean boolean2 = comment0.bogus;
        boolean boolean3 = comment0.isDoctype();
        java.lang.String str4 = comment0.getData();
        boolean boolean5 = comment0.isStartTag();
        comment0.bogus = false;
        boolean boolean8 = comment0.isEOF();
        comment0.bogus = true;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag11 = comment0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        tag1.appendTagName('4');
        java.lang.String str5 = tag1.name();
        java.lang.String str6 = tag1.normalName;
        tag1.appendAttributeValue("hi!");
        tag1.appendTagName("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        tag1.appendTagName(' ');
        tag1.tagName = " ";
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4" + "'", str6, "4");
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "#doctype", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("SYSTEM", "Doctype");
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.ParseSettings parseSettings21 = null;
        xmlTreeBuilder17.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList20, parseSettings21);
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        xmlTreeBuilder17.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList25, parseSettings26);
        org.jsoup.parser.Token.Character character28 = new org.jsoup.parser.Token.Character();
        java.lang.String str29 = character28.getData();
        xmlTreeBuilder17.insert(character28);
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder34 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        org.jsoup.parser.ParseSettings parseSettings38 = null;
        xmlTreeBuilder34.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList37, parseSettings38);
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        org.jsoup.parser.ParseSettings parseSettings43 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList44 = xmlTreeBuilder34.parseFragment("", "#doctype", parseErrorList42, parseSettings43);
        org.jsoup.parser.Token.Character character45 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder34.insert(character45);
        org.jsoup.parser.ParseErrorList parseErrorList49 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder50 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings51 = xmlTreeBuilder50.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList52 = xmlTreeBuilder34.parseFragment("SYSTEM", "PUBLIC", parseErrorList49, parseSettings51);
        java.util.List<org.jsoup.nodes.Node> nodeList53 = xmlTreeBuilder17.parseFragment("#doctype", "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">", parseErrorList33, parseSettings51);
        org.jsoup.parser.ParseSettings parseSettings54 = xmlTreeBuilder17.defaultSettings();
        xmlTreeBuilder0.initialiseParse("SYSTEM", "EOF", parseErrorList16, parseSettings54);
        org.jsoup.parser.ParseErrorList parseErrorList58 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder59 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document62 = xmlTreeBuilder59.parse("SYSTEM", "#doctype");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder63 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList66 = null;
        org.jsoup.parser.ParseSettings parseSettings67 = null;
        xmlTreeBuilder63.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList66, parseSettings67);
        org.jsoup.parser.ParseErrorList parseErrorList71 = null;
        org.jsoup.parser.ParseSettings parseSettings72 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList73 = xmlTreeBuilder63.parseFragment("", "#doctype", parseErrorList71, parseSettings72);
        org.jsoup.parser.Token.Character character74 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder63.insert(character74);
        xmlTreeBuilder59.insert(character74);
        org.jsoup.parser.ParseSettings parseSettings77 = xmlTreeBuilder59.defaultSettings();
        xmlTreeBuilder0.initialiseParse("EOF", "<<!---->a>", parseErrorList58, parseSettings77);
        org.jsoup.parser.Token.StartTag startTag79 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str80 = startTag79.normalName;
        startTag79.newAttribute();
        java.lang.String str82 = startTag79.normalName();
        startTag79.appendAttributeName("");
        startTag79.normalName = "hi!";
        org.jsoup.parser.Token.Tag tag87 = startTag79.reset();
        startTag79.appendTagName(' ');
        boolean boolean90 = startTag79.isEOF();
        startTag79.setEmptyAttributeValue();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element92 = xmlTreeBuilder0.insert(startTag79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertNotNull(nodeList52);
        org.junit.Assert.assertNotNull(nodeList53);
        org.junit.Assert.assertNotNull(parseSettings54);
        org.junit.Assert.assertNotNull(document62);
        org.junit.Assert.assertNotNull(nodeList73);
        org.junit.Assert.assertNotNull(parseSettings77);
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertNotNull(tag87);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str6, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str4 = startTag3.normalName;
        startTag3.newAttribute();
        java.lang.String str6 = startTag3.normalName();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag9 = startTag8.reset();
        tag9.finaliseTag();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean17 = documentType15.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes18 = documentType15.attributes();
        tag9.attributes = attributes18;
        org.jsoup.parser.Token.StartTag startTag20 = startTag3.nameAttr("<!---->", attributes18);
        tag1.attributes = attributes18;
        char[] charArray23 = new char[] { 'a' };
        tag1.appendAttributeValue(charArray23);
        tag1.appendAttributeValue('a');
        java.lang.String str27 = tag1.normalName();
        org.jsoup.parser.Token.Doctype doctype28 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder29 = doctype28.name;
        boolean boolean30 = doctype28.forceQuirks;
        boolean boolean31 = doctype28.isCharacter();
        boolean boolean32 = doctype28.isForceQuirks();
        org.jsoup.parser.Token token33 = doctype28.reset();
        java.lang.String str34 = doctype28.getName();
        org.jsoup.parser.Token.TokenType tokenType35 = doctype28.type;
        tag1.type = tokenType35;
        java.lang.String str37 = tag1.tokenType();
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str39 = startTag38.normalName;
        startTag38.newAttribute();
        java.lang.String str41 = startTag38.normalName();
        startTag38.appendAttributeName("");
        boolean boolean44 = startTag38.isSelfClosing();
        org.jsoup.parser.Token.Tag tag45 = startTag38.reset();
        org.jsoup.nodes.Attributes attributes46 = tag45.attributes;
        tag1.attributes = attributes46;
        org.jsoup.parser.Token.StartTag startTag48 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str49 = startTag48.normalName;
        startTag48.newAttribute();
        java.lang.String str51 = startTag48.normalName();
        java.lang.String str52 = startTag48.normalName();
        org.jsoup.parser.Token.Tag tag53 = startTag48.reset();
        java.lang.String str54 = startTag48.tagName;
        boolean boolean55 = startTag48.isSelfClosing();
        org.jsoup.parser.Token.TokenType tokenType56 = startTag48.type;
        tag1.type = tokenType56;
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(startTag20);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { 'a' });
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(stringBuilder29);
        org.junit.Assert.assertEquals(stringBuilder29.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(token33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + tokenType35 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType35.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "StartTag" + "'", str37, "StartTag");
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(tag53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + tokenType56 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType56.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        boolean boolean4 = startTag0.isSelfClosing();
        boolean boolean5 = startTag0.isSelfClosing();
        startTag0.appendAttributeValue("#");
        boolean boolean8 = startTag0.selfClosing;
        java.lang.String str9 = startTag0.tokenType();
        startTag0.tagName = "<Doctype>";
        org.jsoup.parser.Token.Tag tag13 = startTag0.name("4");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "StartTag" + "'", str9, "StartTag");
        org.junit.Assert.assertNotNull(tag13);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        tag1.appendTagName('4');
        int[] intArray8 = new int[] { 0, ' ', '#' };
        tag1.appendAttributeValue(intArray8);
        boolean boolean10 = tag1.isDoctype();
        tag1.setEmptyAttributeValue();
        org.jsoup.parser.Token.TokenType tokenType12 = tag1.type;
        java.lang.String str13 = tag1.normalName();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0, 32, 35 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4" + "'", str13, "4");
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodesCopy();
        java.lang.String str9 = documentType4.attr("StartTag");
        java.lang.String str11 = documentType4.attr("<!---->");
        boolean boolean13 = documentType4.hasAttr("<<SYSTEM>>");
        org.jsoup.nodes.Node node14 = documentType4.nextSibling();
        org.jsoup.nodes.Node node15 = documentType4.clone();
        java.lang.String str17 = documentType4.attr("StartTag");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "#doctype", parseErrorList8, parseSettings9);
        org.jsoup.parser.Token.Comment comment11 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder12 = comment11.data;
        java.lang.String str13 = comment11.toString();
        org.jsoup.parser.Token token14 = comment11.reset();
        boolean boolean15 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment11);
        org.jsoup.nodes.Document document18 = xmlTreeBuilder0.parse("hi!", "SYSTEM");
        org.jsoup.parser.Token.Character character19 = new org.jsoup.parser.Token.Character();
        java.lang.String str20 = character19.toString();
        org.jsoup.parser.Token token21 = character19.reset();
        xmlTreeBuilder0.insert(character19);
        org.jsoup.nodes.Document document25 = xmlTreeBuilder0.parse("", "public");
        org.jsoup.parser.ParseSettings parseSettings26 = xmlTreeBuilder0.defaultSettings();
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(token21);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(parseSettings26);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder5 = comment4.data;
        xmlTreeBuilder0.insert(comment4);
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Comment comment8 = new org.jsoup.parser.Token.Comment();
        comment8.bogus = true;
        boolean boolean11 = comment8.bogus;
        xmlTreeBuilder0.insert(comment8);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document16 = xmlTreeBuilder13.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment17 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder18 = comment17.data;
        xmlTreeBuilder13.insert(comment17);
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str21 = startTag20.normalName;
        startTag20.newAttribute();
        java.lang.String str23 = startTag20.normalName();
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag26 = startTag25.reset();
        tag26.finaliseTag();
        org.jsoup.nodes.DocumentType documentType32 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean34 = documentType32.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes35 = documentType32.attributes();
        tag26.attributes = attributes35;
        org.jsoup.parser.Token.StartTag startTag37 = startTag20.nameAttr("<!---->", attributes35);
        java.lang.String str38 = startTag37.name();
        boolean boolean39 = xmlTreeBuilder13.process((org.jsoup.parser.Token) startTag37);
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str41 = startTag40.normalName;
        startTag40.newAttribute();
        java.lang.String str43 = startTag40.normalName();
        org.jsoup.parser.Token.StartTag startTag45 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag46 = startTag45.reset();
        tag46.finaliseTag();
        org.jsoup.nodes.DocumentType documentType52 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean54 = documentType52.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes55 = documentType52.attributes();
        tag46.attributes = attributes55;
        org.jsoup.parser.Token.StartTag startTag57 = startTag40.nameAttr("<!---->", attributes55);
        boolean boolean58 = xmlTreeBuilder13.process((org.jsoup.parser.Token) startTag57);
        org.jsoup.parser.Token.Character character59 = new org.jsoup.parser.Token.Character();
        java.lang.String str60 = character59.toString();
        org.jsoup.parser.Token.Character character62 = character59.data("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str63 = character62.toString();
        xmlTreeBuilder13.insert(character62);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder65 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList68 = null;
        org.jsoup.parser.ParseSettings parseSettings69 = null;
        xmlTreeBuilder65.initialiseParse("#doctype", "hi!", parseErrorList68, parseSettings69);
        org.jsoup.parser.Token.Character character71 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder65.insert(character71);
        java.lang.String str73 = character71.getData();
        java.lang.String str74 = character71.toString();
        xmlTreeBuilder13.insert(character71);
        xmlTreeBuilder0.insert(character71);
        org.jsoup.parser.Token.Character character77 = character71.asCharacter();
        org.jsoup.parser.Token token78 = character77.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag79 = character77.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Character cannot be cast to class org.jsoup.parser.Token$StartTag (org.jsoup.parser.Token$Character and org.jsoup.parser.Token$StartTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertNotNull(startTag37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<!---->" + "'", str38, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(attributes55);
        org.junit.Assert.assertNotNull(startTag57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(character62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str63, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNotNull(character77);
        org.junit.Assert.assertNotNull(token78);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes7 = documentType4.attributes();
        int int8 = documentType4.siblingIndex();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributes7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        java.lang.String str7 = documentType4.baseUri();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        java.lang.String str10 = documentType4.nodeName();
        org.jsoup.nodes.Node node11 = documentType4.parent();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str13 = startTag12.normalName;
        startTag12.newAttribute();
        java.lang.String str15 = startTag12.normalName();
        startTag12.appendAttributeName("");
        startTag12.normalName = "hi!";
        startTag12.appendTagName("PUBLIC");
        org.jsoup.parser.Token.Tag tag22 = startTag12.reset();
        org.jsoup.parser.Token.Tag tag24 = tag22.name("4");
        tag24.selfClosing = false;
        tag24.appendTagName('a');
        tag24.appendAttributeValue("#");
        boolean boolean31 = documentType4.hasSameValue((java.lang.Object) tag24);
        int int32 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node33 = documentType4.clone();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SYSTEM" + "'", str7, "SYSTEM");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(node33);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        boolean boolean5 = document3.hasAttr("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node6 = document3.clone();
        java.lang.String str7 = document3.outerHtml();
        org.jsoup.nodes.Document document8 = document3.ownerDocument();
        org.jsoup.parser.Token.Doctype doctype9 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str10 = doctype9.getName();
        boolean boolean11 = doctype9.forceQuirks;
        java.lang.String str12 = doctype9.getSystemIdentifier();
        java.lang.String str13 = doctype9.getSystemIdentifier();
        doctype9.forceQuirks = false;
        boolean boolean16 = doctype9.forceQuirks;
        java.lang.StringBuilder stringBuilder17 = doctype9.systemIdentifier;
        java.lang.StringBuilder stringBuilder18 = doctype9.name;
        java.lang.String str19 = doctype9.getName();
        java.lang.StringBuilder stringBuilder20 = doctype9.name;
        java.lang.StringBuilder stringBuilder21 = doctype9.systemIdentifier;
        java.lang.StringBuilder stringBuilder22 = document3.html(stringBuilder21);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder23 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.ParseSettings parseSettings27 = null;
        xmlTreeBuilder23.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList26, parseSettings27);
        org.jsoup.parser.ParseErrorList parseErrorList31 = null;
        org.jsoup.parser.ParseSettings parseSettings32 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList33 = xmlTreeBuilder23.parseFragment("", "#doctype", parseErrorList31, parseSettings32);
        org.jsoup.parser.Token.Comment comment34 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder35 = comment34.data;
        java.lang.String str36 = comment34.toString();
        org.jsoup.parser.Token token37 = comment34.reset();
        boolean boolean38 = xmlTreeBuilder23.process((org.jsoup.parser.Token) comment34);
        java.lang.String str39 = comment34.toString();
        org.jsoup.parser.Token.Comment comment40 = comment34.asComment();
        org.jsoup.parser.Token token41 = comment40.reset();
        java.lang.StringBuilder stringBuilder42 = comment40.data;
        org.jsoup.parser.Token.reset(stringBuilder42);
        java.lang.Appendable appendable44 = document3.html((java.lang.Appendable) stringBuilder42);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SYSTEM" + "'", str7, "SYSTEM");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "\nSYSTEM");
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "\nSYSTEM");
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "\nSYSTEM");
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertNotNull(stringBuilder35);
        org.junit.Assert.assertEquals(stringBuilder35.toString(), "\nSYSTEM");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<!---->" + "'", str36, "<!---->");
        org.junit.Assert.assertNotNull(token37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<!---->" + "'", str39, "<!---->");
        org.junit.Assert.assertNotNull(comment40);
        org.junit.Assert.assertNotNull(token41);
        org.junit.Assert.assertNotNull(stringBuilder42);
        org.junit.Assert.assertEquals(stringBuilder42.toString(), "\nSYSTEM");
        org.junit.Assert.assertNotNull(appendable44);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.nodes.DocumentType documentType7 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean9 = documentType7.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes10 = documentType7.attributes();
        tag1.attributes = attributes10;
        java.lang.String str12 = tag1.tagName;
        boolean boolean13 = tag1.selfClosing;
        java.lang.String str14 = tag1.normalName;
        java.lang.String str15 = tag1.tokenType();
        java.lang.String str16 = tag1.normalName();
        org.jsoup.parser.Token.Tag tag17 = tag1.reset();
        tag17.tagName = " ";
        tag17.appendTagName(' ');
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "StartTag" + "'", str15, "StartTag");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(tag17);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("SYSTEM", "SYSTEM", "#doctype", "SYSTEM");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("PUBLIC");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = org.jsoup.parser.HtmlTreeBuilderState.ForeignContent;
        boolean boolean8 = documentType4.hasSameValue((java.lang.Object) htmlTreeBuilderState7);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str10 = startTag9.normalName;
        startTag9.newAttribute();
        java.lang.String str12 = startTag9.normalName();
        java.lang.String str13 = startTag9.normalName();
        org.jsoup.parser.Token.Tag tag14 = startTag9.reset();
        org.jsoup.parser.Token.Tag tag15 = startTag9.reset();
        startTag9.tagName = "<!---->";
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder18 = null;
        boolean boolean19 = htmlTreeBuilderState7.process((org.jsoup.parser.Token) startTag9, htmlTreeBuilder18);
        org.jsoup.parser.Token.Doctype doctype20 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str21 = doctype20.getName();
        boolean boolean22 = doctype20.forceQuirks;
        org.jsoup.parser.Token token23 = doctype20.reset();
        org.jsoup.parser.Token.TokenType tokenType24 = doctype20.type;
        boolean boolean25 = doctype20.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType26 = doctype20.type;
        java.lang.String str27 = doctype20.getPublicIdentifier();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder28 = null;
        boolean boolean29 = htmlTreeBuilderState7.process((org.jsoup.parser.Token) doctype20, htmlTreeBuilder28);
        org.jsoup.parser.Token.Comment comment30 = new org.jsoup.parser.Token.Comment();
        comment30.bogus = false;
        java.lang.StringBuilder stringBuilder33 = comment30.data;
        boolean boolean34 = comment30.isEOF();
        java.lang.String str35 = comment30.toString();
        java.lang.String str36 = comment30.getData();
        java.lang.String str37 = comment30.getData();
        boolean boolean38 = comment30.isCharacter();
        java.lang.String str39 = comment30.toString();
        java.lang.String str40 = comment30.getData();
        boolean boolean41 = comment30.bogus;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder42 = null;
        boolean boolean43 = htmlTreeBuilderState7.process((org.jsoup.parser.Token) comment30, htmlTreeBuilder42);
        org.jsoup.parser.Token.StartTag startTag44 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag45 = startTag44.reset();
        tag45.finaliseTag();
        tag45.appendTagName('4');
        int[] intArray52 = new int[] { 0, ' ', '#' };
        tag45.appendAttributeValue(intArray52);
        boolean boolean54 = tag45.isDoctype();
        tag45.setEmptyAttributeValue();
        org.jsoup.parser.Token.TokenType tokenType56 = tag45.type;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder57 = null;
        boolean boolean58 = htmlTreeBuilderState7.process((org.jsoup.parser.Token) tag45, htmlTreeBuilder57);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(token23);
        org.junit.Assert.assertTrue("'" + tokenType24 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType24.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + tokenType26 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType26.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(stringBuilder33);
        org.junit.Assert.assertEquals(stringBuilder33.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<!---->" + "'", str35, "<!---->");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<!---->" + "'", str39, "<!---->");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { 0, 32, 35 });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + tokenType56 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType56.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        java.lang.String str4 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        java.lang.String str6 = startTag0.tagName;
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean15 = documentType13.hasAttr("hi!");
        int int16 = documentType13.childNodeSize();
        org.jsoup.nodes.Node node17 = documentType13.nextSibling();
        org.jsoup.nodes.Node node18 = documentType13.clone();
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str20 = startTag19.normalName;
        startTag19.newAttribute();
        java.lang.String str22 = startTag19.normalName();
        org.jsoup.parser.Token.Doctype doctype23 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str24 = doctype23.getName();
        org.jsoup.parser.Token.TokenType tokenType25 = doctype23.type;
        startTag19.type = tokenType25;
        boolean boolean27 = documentType13.equals((java.lang.Object) startTag19);
        startTag19.setEmptyAttributeValue();
        org.jsoup.nodes.Attributes attributes29 = startTag19.getAttributes();
        org.jsoup.parser.Token.StartTag startTag30 = startTag0.nameAttr("", attributes29);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character31 = startTag30.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + tokenType25 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType25.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(startTag30);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.String str3 = doctype0.getSystemIdentifier();
        java.lang.String str4 = doctype0.getSystemIdentifier();
        doctype0.forceQuirks = false;
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        boolean boolean9 = doctype0.isDoctype();
        java.lang.String str10 = doctype0.getSystemIdentifier();
        java.lang.String str11 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("#doctype", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.nodes.Document document8 = xmlTreeBuilder0.parse("<<!DOCTYPE #doctype PUBLIC \"4\" \"PUBLIC\">  name=\"\" publicId=\"hi!\" systemId=\"hi!\">", "<a>");
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.ParseSettings parseSettings16 = null;
        xmlTreeBuilder12.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList15, parseSettings16);
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.ParseSettings parseSettings21 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlTreeBuilder12.parseFragment("", "#doctype", parseErrorList20, parseSettings21);
        org.jsoup.nodes.Document document25 = xmlTreeBuilder12.parse("SYSTEM", "Doctype");
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.ParseSettings parseSettings33 = null;
        xmlTreeBuilder29.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList32, parseSettings33);
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        org.jsoup.parser.ParseSettings parseSettings38 = null;
        xmlTreeBuilder29.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList37, parseSettings38);
        org.jsoup.parser.Token.Character character40 = new org.jsoup.parser.Token.Character();
        java.lang.String str41 = character40.getData();
        xmlTreeBuilder29.insert(character40);
        org.jsoup.parser.ParseErrorList parseErrorList45 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder46 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList49 = null;
        org.jsoup.parser.ParseSettings parseSettings50 = null;
        xmlTreeBuilder46.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList49, parseSettings50);
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        org.jsoup.parser.ParseSettings parseSettings55 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList56 = xmlTreeBuilder46.parseFragment("", "#doctype", parseErrorList54, parseSettings55);
        org.jsoup.parser.Token.Character character57 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder46.insert(character57);
        org.jsoup.parser.ParseErrorList parseErrorList61 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder62 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings63 = xmlTreeBuilder62.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList64 = xmlTreeBuilder46.parseFragment("SYSTEM", "PUBLIC", parseErrorList61, parseSettings63);
        java.util.List<org.jsoup.nodes.Node> nodeList65 = xmlTreeBuilder29.parseFragment("#doctype", "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">", parseErrorList45, parseSettings63);
        org.jsoup.parser.ParseSettings parseSettings66 = xmlTreeBuilder29.defaultSettings();
        xmlTreeBuilder12.initialiseParse("SYSTEM", "EOF", parseErrorList28, parseSettings66);
        xmlTreeBuilder0.initialiseParse("#doctype", "<<SYSTEM>>", parseErrorList11, parseSettings66);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(nodeList56);
        org.junit.Assert.assertNotNull(parseSettings63);
        org.junit.Assert.assertNotNull(nodeList64);
        org.junit.Assert.assertNotNull(nodeList65);
        org.junit.Assert.assertNotNull(parseSettings66);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        org.jsoup.nodes.Document document6 = xmlTreeBuilder0.parse(" ", "StartTag");
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str8 = startTag7.normalName;
        startTag7.newAttribute();
        java.lang.String str10 = startTag7.normalName();
        startTag7.appendAttributeName("");
        startTag7.normalName = "hi!";
        org.jsoup.parser.Token.Tag tag15 = startTag7.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = xmlTreeBuilder0.insert(startTag7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(tag15);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        boolean boolean4 = comment0.isEOF();
        boolean boolean5 = comment0.bogus;
        org.jsoup.parser.Token token6 = comment0.reset();
        org.jsoup.parser.Token token7 = comment0.reset();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(token7);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.Tag tag3 = tag1.reset();
        org.jsoup.nodes.Attributes attributes4 = tag3.attributes;
        org.jsoup.parser.Token.Tag tag5 = tag3.reset();
        tag5.normalName = "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">";
        tag5.setEmptyAttributeValue();
        java.lang.String str9 = tag5.normalName;
        tag5.setEmptyAttributeValue();
        tag5.newAttribute();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag12 = tag5.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">" + "'", str9, "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">");
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("#doctype", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.Token.Character character6 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder0.insert(character6);
        org.jsoup.nodes.Document document10 = xmlTreeBuilder0.parse("EOF", "<SYSTEM>");
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("<<!---->  name=\"\" publicId=\"hi!\" systemId=\"hi!\">", "4a", "Doctype", "<!doctype #doctype public \"4\" \"public\">");
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str22 = documentType21.nodeName();
        org.jsoup.parser.Token.Doctype doctype23 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str24 = doctype23.getName();
        boolean boolean25 = doctype23.forceQuirks;
        org.jsoup.parser.Token token26 = doctype23.reset();
        org.jsoup.parser.Token.TokenType tokenType27 = doctype23.type;
        boolean boolean28 = doctype23.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType29 = doctype23.type;
        boolean boolean30 = documentType21.hasSameValue((java.lang.Object) doctype23);
        java.lang.String str31 = doctype23.tokenType();
        boolean boolean32 = doctype23.isForceQuirks();
        java.lang.String str33 = doctype23.getName();
        java.lang.StringBuilder stringBuilder34 = doctype23.name;
        boolean boolean35 = documentType16.equals((java.lang.Object) doctype23);
        xmlTreeBuilder0.insert(doctype23);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#doctype" + "'", str22, "#doctype");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(token26);
        org.junit.Assert.assertTrue("'" + tokenType27 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType27.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + tokenType29 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType29.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Doctype" + "'", str31, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("SYSTEM", "SYSTEM", "#doctype", "SYSTEM");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("PUBLIC");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = org.jsoup.parser.HtmlTreeBuilderState.ForeignContent;
        boolean boolean8 = documentType4.hasSameValue((java.lang.Object) htmlTreeBuilderState7);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str10 = startTag9.normalName;
        startTag9.newAttribute();
        java.lang.String str12 = startTag9.normalName();
        startTag9.appendAttributeName("");
        startTag9.normalName = "hi!";
        org.jsoup.parser.Token.Tag tag17 = startTag9.reset();
        org.jsoup.parser.Token.Tag tag19 = tag17.name("Doctype");
        tag19.appendAttributeName("4");
        boolean boolean22 = tag19.isEndTag();
        org.jsoup.parser.Token.StartTag startTag23 = tag19.asStartTag();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder24 = null;
        boolean boolean25 = htmlTreeBuilderState7.process((org.jsoup.parser.Token) startTag23, htmlTreeBuilder24);
        org.jsoup.parser.Token.Character character26 = new org.jsoup.parser.Token.Character();
        java.lang.String str27 = character26.toString();
        org.jsoup.parser.Token.Character character29 = character26.data("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.parser.Token.Character character31 = character26.data("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.parser.Token.Character character33 = character26.data("<<SYSTEM>></<SYSTEM>>");
        org.jsoup.parser.Token.TokenType tokenType34 = character26.type;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder35 = null;
        boolean boolean36 = htmlTreeBuilderState7.process((org.jsoup.parser.Token) character26, htmlTreeBuilder35);
        org.jsoup.parser.Token.Doctype doctype37 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str38 = doctype37.getName();
        boolean boolean39 = doctype37.forceQuirks;
        org.jsoup.parser.Token token40 = doctype37.reset();
        org.jsoup.parser.Token.TokenType tokenType41 = doctype37.type;
        boolean boolean42 = doctype37.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType43 = doctype37.type;
        java.lang.String str44 = doctype37.getSystemIdentifier();
        boolean boolean45 = doctype37.isStartTag();
        boolean boolean46 = doctype37.isDoctype();
        java.lang.String str47 = doctype37.getPublicIdentifier();
        java.lang.String str48 = doctype37.getPublicIdentifier();
        boolean boolean49 = doctype37.isCharacter();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder50 = null;
        boolean boolean51 = htmlTreeBuilderState7.process((org.jsoup.parser.Token) doctype37, htmlTreeBuilder50);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(startTag23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(character29);
        org.junit.Assert.assertNotNull(character31);
        org.junit.Assert.assertNotNull(character33);
        org.junit.Assert.assertTrue("'" + tokenType34 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType34.equals(org.jsoup.parser.Token.TokenType.Character));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(token40);
        org.junit.Assert.assertTrue("'" + tokenType41 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType41.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + tokenType43 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType43.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.nodes.DocumentType documentType7 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean9 = documentType7.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes10 = documentType7.attributes();
        tag1.attributes = attributes10;
        tag1.appendTagName("#doctype");
        tag1.newAttribute();
        tag1.appendTagName("#doctype");
        tag1.tagName = "<!---->";
        org.jsoup.nodes.Attributes attributes19 = null;
        tag1.attributes = attributes19;
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList8, parseSettings9);
        org.jsoup.parser.Token.Character character11 = new org.jsoup.parser.Token.Character();
        java.lang.String str12 = character11.getData();
        xmlTreeBuilder0.insert(character11);
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.ParseSettings parseSettings21 = null;
        xmlTreeBuilder17.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList20, parseSettings21);
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder17.parseFragment("", "#doctype", parseErrorList25, parseSettings26);
        org.jsoup.parser.Token.Character character28 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder17.insert(character28);
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings34 = xmlTreeBuilder33.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = xmlTreeBuilder17.parseFragment("SYSTEM", "PUBLIC", parseErrorList32, parseSettings34);
        java.util.List<org.jsoup.nodes.Node> nodeList36 = xmlTreeBuilder0.parseFragment("#doctype", "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">", parseErrorList16, parseSettings34);
        org.jsoup.parser.ParseSettings parseSettings37 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str39 = startTag38.normalName;
        startTag38.newAttribute();
        java.lang.String str41 = startTag38.normalName();
        java.lang.String str42 = startTag38.normalName();
        org.jsoup.parser.Token.Tag tag43 = startTag38.reset();
        boolean boolean44 = startTag38.isDoctype();
        org.jsoup.parser.Token.Tag tag46 = startTag38.name("Doctype");
        startTag38.appendAttributeName("<<SYSTEM>>");
        org.jsoup.nodes.Element element49 = xmlTreeBuilder0.insert(startTag38);
        org.jsoup.parser.Token.Doctype doctype50 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder51 = doctype50.name;
        boolean boolean52 = doctype50.forceQuirks;
        boolean boolean53 = doctype50.isCharacter();
        boolean boolean54 = doctype50.isForceQuirks();
        java.lang.StringBuilder stringBuilder55 = doctype50.publicIdentifier;
        java.lang.StringBuilder stringBuilder56 = element49.html(stringBuilder55);
        org.jsoup.nodes.Node node57 = element49.unwrap();
        org.jsoup.nodes.Node node58 = element49.parentNode();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(stringBuilder51);
        org.junit.Assert.assertEquals(stringBuilder51.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(stringBuilder55);
        org.junit.Assert.assertEquals(stringBuilder55.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder56);
        org.junit.Assert.assertEquals(stringBuilder56.toString(), "");
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNull(node58);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        java.lang.String str8 = startTag0.normalName;
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str15 = documentType14.nodeName();
        org.jsoup.nodes.Attributes attributes16 = documentType14.attributes();
        java.lang.String str17 = documentType14.outerHtml();
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str19 = startTag18.normalName;
        startTag18.newAttribute();
        java.lang.String str21 = startTag18.normalName();
        startTag18.appendAttributeName("");
        startTag18.normalName = "hi!";
        java.lang.String str26 = startTag18.tagName;
        startTag18.setEmptyAttributeValue();
        boolean boolean28 = documentType14.equals((java.lang.Object) startTag18);
        startTag18.setEmptyAttributeValue();
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str31 = startTag30.normalName;
        startTag30.newAttribute();
        java.lang.String str33 = startTag30.normalName();
        java.lang.String str34 = startTag30.normalName();
        org.jsoup.parser.Token.Tag tag35 = startTag30.reset();
        boolean boolean36 = startTag30.isDoctype();
        org.jsoup.parser.Token.Tag tag38 = startTag30.name("Doctype");
        org.jsoup.nodes.Attributes attributes39 = tag38.attributes;
        java.lang.String str40 = tag38.tagName;
        boolean boolean41 = tag38.isStartTag();
        org.jsoup.parser.Token.StartTag startTag42 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str43 = startTag42.normalName;
        startTag42.newAttribute();
        org.jsoup.parser.Token.Tag tag45 = startTag42.reset();
        org.jsoup.parser.Token.StartTag startTag46 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag47 = startTag46.reset();
        tag47.finaliseTag();
        tag47.appendTagName('4');
        int[] intArray54 = new int[] { 0, ' ', '#' };
        tag47.appendAttributeValue(intArray54);
        startTag42.appendAttributeValue(intArray54);
        org.jsoup.parser.Token.StartTag startTag58 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag59 = startTag58.reset();
        tag59.finaliseTag();
        org.jsoup.parser.Token.Tag tag61 = tag59.reset();
        org.jsoup.nodes.Attributes attributes62 = tag61.attributes;
        org.jsoup.parser.Token.StartTag startTag63 = startTag42.nameAttr("<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">", attributes62);
        tag38.attributes = attributes62;
        startTag18.attributes = attributes62;
        org.jsoup.parser.Token.StartTag startTag66 = startTag0.nameAttr("< >", attributes62);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Comment comment67 = startTag0.asComment();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Comment (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Comment are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#doctype" + "'", str15, "#doctype");
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str17, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Doctype" + "'", str40, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new int[] { 0, 32, 35 });
        org.junit.Assert.assertNotNull(tag59);
        org.junit.Assert.assertNotNull(tag61);
        org.junit.Assert.assertNotNull(attributes62);
        org.junit.Assert.assertNotNull(startTag63);
        org.junit.Assert.assertNotNull(startTag66);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder5 = comment4.data;
        xmlTreeBuilder0.insert(comment4);
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str8 = startTag7.normalName;
        startTag7.newAttribute();
        java.lang.String str10 = startTag7.normalName();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag13 = startTag12.reset();
        tag13.finaliseTag();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean21 = documentType19.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes22 = documentType19.attributes();
        tag13.attributes = attributes22;
        org.jsoup.parser.Token.StartTag startTag24 = startTag7.nameAttr("<!---->", attributes22);
        java.lang.String str25 = startTag24.name();
        boolean boolean26 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag24);
        java.lang.String str27 = startTag24.toString();
        org.jsoup.nodes.Attributes attributes28 = startTag24.getAttributes();
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str31 = startTag30.normalName;
        startTag30.newAttribute();
        java.lang.String str33 = startTag30.normalName();
        startTag30.appendAttributeName("");
        startTag30.normalName = "hi!";
        java.lang.String str38 = startTag30.tagName;
        org.jsoup.nodes.DocumentType documentType43 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean45 = documentType43.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes46 = documentType43.attributes();
        startTag30.attributes = attributes46;
        org.jsoup.parser.Token.StartTag startTag48 = startTag24.nameAttr("<!doctype system public \"system\" \"#doctype\">", attributes46);
        org.jsoup.parser.Token.StartTag startTag49 = startTag24.asStartTag();
        org.jsoup.parser.Token.StartTag startTag50 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag51 = startTag50.reset();
        tag51.finaliseTag();
        org.jsoup.parser.Token.Tag tag53 = tag51.reset();
        org.jsoup.nodes.Attributes attributes54 = tag53.attributes;
        java.lang.String str55 = tag53.tokenType();
        org.jsoup.parser.Token.StartTag startTag56 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag57 = startTag56.reset();
        tag57.finaliseTag();
        tag57.appendTagName('4');
        int[] intArray64 = new int[] { 0, ' ', '#' };
        tag57.appendAttributeValue(intArray64);
        tag53.appendAttributeValue(intArray64);
        startTag24.appendAttributeValue(intArray64);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(startTag24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!---->" + "'", str25, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<<!---->  name=\"\" publicId=\"hi!\" systemId=\"hi!\">" + "'", str27, "<<!---->  name=\"\" publicId=\"hi!\" systemId=\"hi!\">");
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertNotNull(startTag48);
        org.junit.Assert.assertNotNull(startTag49);
        org.junit.Assert.assertNotNull(tag51);
        org.junit.Assert.assertNotNull(tag53);
        org.junit.Assert.assertNotNull(attributes54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "StartTag" + "'", str55, "StartTag");
        org.junit.Assert.assertNotNull(tag57);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertArrayEquals(intArray64, new int[] { 0, 32, 35 });
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.nodes.DocumentType documentType7 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean9 = documentType7.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes10 = documentType7.attributes();
        tag1.attributes = attributes10;
        java.lang.String str12 = tag1.tagName;
        tag1.appendAttributeValue('4');
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag16 = startTag15.reset();
        tag16.finaliseTag();
        tag16.appendTagName('4');
        org.jsoup.nodes.Attributes attributes20 = tag16.getAttributes();
        tag1.attributes = attributes20;
        tag1.normalName = "<!---->";
        int[] intArray27 = new int[] { (byte) 1, (byte) 1, (short) 0 };
        tag1.appendAttributeValue(intArray27);
        org.jsoup.parser.Token.StartTag startTag29 = tag1.asStartTag();
        startTag29.appendAttributeName("Doctype");
        org.jsoup.parser.Token.Tag tag33 = startTag29.name("#");
        startTag29.selfClosing = false;
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 1, 1, 0 });
        org.junit.Assert.assertNotNull(startTag29);
        org.junit.Assert.assertNotNull(tag33);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.Text;
        org.jsoup.parser.Token.Doctype doctype1 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder2 = doctype1.name;
        java.lang.StringBuilder stringBuilder3 = doctype1.systemIdentifier;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = null;
        boolean boolean5 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) doctype1, htmlTreeBuilder4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag6.reset();
        tag7.finaliseTag();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = null;
        boolean boolean10 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) tag7, htmlTreeBuilder9);
        org.jsoup.parser.Token.Comment comment11 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder12 = comment11.data;
        java.lang.String str13 = comment11.toString();
        boolean boolean14 = comment11.isDoctype();
        boolean boolean15 = comment11.bogus;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder16 = null;
        boolean boolean17 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) comment11, htmlTreeBuilder16);
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag19 = startTag18.reset();
        tag19.finaliseTag();
        org.jsoup.nodes.DocumentType documentType25 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean27 = documentType25.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes28 = documentType25.attributes();
        tag19.attributes = attributes28;
        java.lang.String str30 = tag19.normalName;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder31 = null;
        boolean boolean32 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) tag19, htmlTreeBuilder31);
        java.lang.String str33 = tag19.normalName();
        org.jsoup.parser.Token.StartTag startTag34 = tag19.asStartTag();
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(startTag34);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<<!---->#doctype  name=\"\" publicId=\"hi!\" systemId=\"hi!\">", "Doctype", "a", "Doctype");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = node5.parent();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag6 = startTag5.reset();
        tag6.finaliseTag();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean14 = documentType12.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes15 = documentType12.attributes();
        tag6.attributes = attributes15;
        org.jsoup.parser.Token.StartTag startTag17 = startTag0.nameAttr("<!---->", attributes15);
        java.lang.String str18 = startTag17.name();
        boolean boolean19 = startTag17.isSelfClosing();
        startTag17.appendTagName('a');
        boolean boolean22 = startTag17.isEOF();
        startTag17.newAttribute();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!---->" + "'", str18, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Node node7 = documentType4.nextSibling();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "", "", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.parser.Token.Doctype doctype13 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder14 = doctype13.name;
        java.lang.StringBuilder stringBuilder15 = doctype13.systemIdentifier;
        java.lang.StringBuilder stringBuilder16 = documentType12.html(stringBuilder15);
        java.lang.StringBuilder stringBuilder17 = documentType4.html(stringBuilder15);
        org.jsoup.parser.Token.Comment comment18 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder19 = comment18.data;
        java.lang.String str20 = comment18.toString();
        boolean boolean21 = comment18.isDoctype();
        boolean boolean22 = comment18.isCharacter();
        java.lang.StringBuilder stringBuilder23 = comment18.data;
        java.lang.StringBuilder stringBuilder24 = documentType4.html(stringBuilder23);
        org.jsoup.nodes.Node node25 = documentType4.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = documentType4.siblingNodes();
        org.jsoup.nodes.Node node27 = documentType4.nextSibling();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">><!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">><!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">><!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!---->" + "'", str20, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder24);
        org.junit.Assert.assertEquals(stringBuilder24.toString(), "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        tag1.appendTagName('4');
        org.jsoup.nodes.Attributes attributes5 = tag1.getAttributes();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag6.reset();
        tag7.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str10 = startTag9.normalName;
        startTag9.newAttribute();
        java.lang.String str12 = startTag9.normalName();
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag15 = startTag14.reset();
        tag15.finaliseTag();
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean23 = documentType21.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes24 = documentType21.attributes();
        tag15.attributes = attributes24;
        org.jsoup.parser.Token.StartTag startTag26 = startTag9.nameAttr("<!---->", attributes24);
        tag7.attributes = attributes24;
        char[] charArray29 = new char[] { 'a' };
        tag7.appendAttributeValue(charArray29);
        tag1.appendAttributeValue(charArray29);
        tag1.appendTagName("Doctype");
        org.jsoup.parser.Token.TokenType tokenType34 = org.jsoup.parser.Token.TokenType.EOF;
        tag1.type = tokenType34;
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str37 = startTag36.normalName;
        startTag36.newAttribute();
        java.lang.String str39 = startTag36.normalName();
        startTag36.appendAttributeName("");
        startTag36.normalName = "hi!";
        startTag36.appendTagName("PUBLIC");
        org.jsoup.parser.Token.StartTag startTag46 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag47 = startTag46.reset();
        tag47.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag49 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str50 = startTag49.normalName;
        startTag49.newAttribute();
        java.lang.String str52 = startTag49.normalName();
        org.jsoup.parser.Token.StartTag startTag54 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag55 = startTag54.reset();
        tag55.finaliseTag();
        org.jsoup.nodes.DocumentType documentType61 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean63 = documentType61.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes64 = documentType61.attributes();
        tag55.attributes = attributes64;
        org.jsoup.parser.Token.StartTag startTag66 = startTag49.nameAttr("<!---->", attributes64);
        tag47.attributes = attributes64;
        char[] charArray69 = new char[] { 'a' };
        tag47.appendAttributeValue(charArray69);
        startTag36.appendAttributeValue(charArray69);
        tag1.appendAttributeValue(charArray69);
        tag1.normalName = "<!---->";
        org.jsoup.nodes.Attributes attributes75 = tag1.getAttributes();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(startTag26);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + tokenType34 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType34.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(tag55);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(attributes64);
        org.junit.Assert.assertNotNull(startTag66);
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertArrayEquals(charArray69, new char[] { 'a' });
        org.junit.Assert.assertNotNull(attributes75);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder3 = doctype0.systemIdentifier;
        boolean boolean4 = doctype0.forceQuirks;
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder7 = doctype0.name;
        org.jsoup.parser.Token token8 = doctype0.reset();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(token8);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        doctype0.forceQuirks = false;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.childNodesCopy();
        java.lang.String str10 = documentType4.baseUri();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SYSTEM" + "'", str10, "SYSTEM");
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.String str3 = doctype0.getSystemIdentifier();
        boolean boolean4 = doctype0.isDoctype();
        boolean boolean5 = doctype0.isStartTag();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag2 = startTag0.reset();
        org.jsoup.nodes.DocumentType documentType8 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str9 = documentType8.nodeName();
        org.jsoup.nodes.Attributes attributes10 = documentType8.attributes();
        org.jsoup.parser.Token.StartTag startTag11 = startTag0.nameAttr("", attributes10);
        org.jsoup.parser.Token.Tag tag12 = startTag11.reset();
        org.jsoup.parser.Token.Tag tag13 = startTag11.reset();
        startTag11.finaliseTag();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(tag13);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList8, parseSettings9);
        org.jsoup.parser.Token.Character character11 = new org.jsoup.parser.Token.Character();
        java.lang.String str12 = character11.getData();
        xmlTreeBuilder0.insert(character11);
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.ParseSettings parseSettings21 = null;
        xmlTreeBuilder17.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList20, parseSettings21);
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder17.parseFragment("", "#doctype", parseErrorList25, parseSettings26);
        org.jsoup.parser.Token.Character character28 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder17.insert(character28);
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings34 = xmlTreeBuilder33.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = xmlTreeBuilder17.parseFragment("SYSTEM", "PUBLIC", parseErrorList32, parseSettings34);
        java.util.List<org.jsoup.nodes.Node> nodeList36 = xmlTreeBuilder0.parseFragment("#doctype", "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">", parseErrorList16, parseSettings34);
        org.jsoup.parser.ParseSettings parseSettings37 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList40 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder41 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        org.jsoup.parser.ParseSettings parseSettings45 = null;
        xmlTreeBuilder41.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList44, parseSettings45);
        org.jsoup.parser.ParseErrorList parseErrorList49 = null;
        org.jsoup.parser.ParseSettings parseSettings50 = null;
        xmlTreeBuilder41.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList49, parseSettings50);
        org.jsoup.parser.Token.Character character52 = new org.jsoup.parser.Token.Character();
        java.lang.String str53 = character52.getData();
        xmlTreeBuilder41.insert(character52);
        org.jsoup.parser.ParseErrorList parseErrorList57 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder58 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList61 = null;
        org.jsoup.parser.ParseSettings parseSettings62 = null;
        xmlTreeBuilder58.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList61, parseSettings62);
        org.jsoup.parser.ParseErrorList parseErrorList66 = null;
        org.jsoup.parser.ParseSettings parseSettings67 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList68 = xmlTreeBuilder58.parseFragment("", "#doctype", parseErrorList66, parseSettings67);
        org.jsoup.parser.Token.Character character69 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder58.insert(character69);
        org.jsoup.parser.ParseErrorList parseErrorList73 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder74 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings75 = xmlTreeBuilder74.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList76 = xmlTreeBuilder58.parseFragment("SYSTEM", "PUBLIC", parseErrorList73, parseSettings75);
        java.util.List<org.jsoup.nodes.Node> nodeList77 = xmlTreeBuilder41.parseFragment("#doctype", "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">", parseErrorList57, parseSettings75);
        org.jsoup.parser.ParseSettings parseSettings78 = xmlTreeBuilder41.defaultSettings();
        xmlTreeBuilder0.initialiseParse("4", "4", parseErrorList40, parseSettings78);
        org.jsoup.parser.Token.Comment comment80 = new org.jsoup.parser.Token.Comment();
        comment80.bogus = false;
        java.lang.StringBuilder stringBuilder83 = comment80.data;
        java.lang.String str84 = comment80.getData();
        java.lang.String str85 = comment80.toString();
        java.lang.String str86 = comment80.getData();
        xmlTreeBuilder0.insert(comment80);
        org.jsoup.parser.Token.Doctype doctype88 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder89 = doctype88.name;
        boolean boolean90 = doctype88.forceQuirks;
        boolean boolean91 = doctype88.isCharacter();
        boolean boolean92 = doctype88.isForceQuirks();
        org.jsoup.parser.Token token93 = doctype88.reset();
        java.lang.String str94 = doctype88.getName();
        org.jsoup.parser.Token.TokenType tokenType95 = doctype88.type;
        xmlTreeBuilder0.insert(doctype88);
        org.jsoup.nodes.Document document99 = xmlTreeBuilder0.parse("a", "Comment");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(nodeList68);
        org.junit.Assert.assertNotNull(parseSettings75);
        org.junit.Assert.assertNotNull(nodeList76);
        org.junit.Assert.assertNotNull(nodeList77);
        org.junit.Assert.assertNotNull(parseSettings78);
        org.junit.Assert.assertNotNull(stringBuilder83);
        org.junit.Assert.assertEquals(stringBuilder83.toString(), "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "<!---->" + "'", str85, "<!---->");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertNotNull(stringBuilder89);
        org.junit.Assert.assertEquals(stringBuilder89.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(token93);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
        org.junit.Assert.assertTrue("'" + tokenType95 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType95.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(document99);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str10 = startTag9.normalName;
        org.jsoup.nodes.Attributes attributes11 = startTag9.attributes;
        org.jsoup.parser.Token.StartTag startTag12 = startTag0.nameAttr("SYSTEM", attributes11);
        startTag12.tagName = "PUBLIC";
        org.jsoup.parser.Token.TokenType tokenType15 = startTag12.type;
        java.lang.String str16 = startTag12.tagName;
        startTag12.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str20 = startTag19.normalName;
        startTag19.newAttribute();
        java.lang.String str22 = startTag19.normalName();
        org.jsoup.parser.Token.Tag tag23 = startTag19.reset();
        org.jsoup.nodes.DocumentType documentType28 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str29 = documentType28.nodeName();
        org.jsoup.nodes.Attributes attributes30 = documentType28.attributes();
        java.lang.String str31 = documentType28.outerHtml();
        org.jsoup.nodes.Attributes attributes32 = documentType28.attributes();
        tag23.attributes = attributes32;
        startTag12.attributes = attributes32;
        boolean boolean35 = startTag12.isStartTag();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PUBLIC" + "'", str16, "PUBLIC");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#doctype" + "'", str29, "#doctype");
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str31, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.appendAttributeName("<<!---->#doctype  name=\"\" publicId=\"hi!\" systemId=\"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = endTag0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.forceQuirks;
        java.lang.String str2 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token3 = doctype0.reset();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(token3);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList8, parseSettings9);
        org.jsoup.parser.Token.Comment comment11 = new org.jsoup.parser.Token.Comment();
        comment11.bogus = false;
        java.lang.StringBuilder stringBuilder14 = comment11.data;
        org.jsoup.parser.Token.Comment comment15 = comment11.asComment();
        xmlTreeBuilder0.insert(comment11);
        org.jsoup.nodes.Document document19 = xmlTreeBuilder0.parse("<PUBLICa>", "Character");
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder23 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.ParseSettings parseSettings27 = null;
        xmlTreeBuilder23.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList26, parseSettings27);
        org.jsoup.parser.ParseErrorList parseErrorList31 = null;
        org.jsoup.parser.ParseSettings parseSettings32 = null;
        xmlTreeBuilder23.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList31, parseSettings32);
        org.jsoup.parser.Token.Comment comment34 = new org.jsoup.parser.Token.Comment();
        comment34.bogus = false;
        java.lang.StringBuilder stringBuilder37 = comment34.data;
        org.jsoup.parser.Token.Comment comment38 = comment34.asComment();
        xmlTreeBuilder23.insert(comment34);
        org.jsoup.parser.Token.Comment comment40 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder41 = comment40.data;
        java.lang.String str42 = comment40.toString();
        org.jsoup.parser.Token token43 = comment40.reset();
        org.jsoup.parser.Token token44 = comment40.reset();
        xmlTreeBuilder23.insert(comment40);
        org.jsoup.parser.Token.Comment comment46 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder47 = comment46.data;
        java.lang.String str48 = comment46.toString();
        org.jsoup.parser.Token token49 = comment46.reset();
        org.jsoup.parser.Token token50 = comment46.reset();
        java.lang.String str51 = comment46.toString();
        org.jsoup.parser.Token.Comment comment52 = comment46.asComment();
        xmlTreeBuilder23.insert(comment46);
        org.jsoup.parser.ParseErrorList parseErrorList56 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder57 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList60 = null;
        org.jsoup.parser.ParseSettings parseSettings61 = null;
        xmlTreeBuilder57.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList60, parseSettings61);
        org.jsoup.parser.ParseErrorList parseErrorList65 = null;
        org.jsoup.parser.ParseSettings parseSettings66 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList67 = xmlTreeBuilder57.parseFragment("", "#doctype", parseErrorList65, parseSettings66);
        org.jsoup.parser.ParseSettings parseSettings68 = xmlTreeBuilder57.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList69 = xmlTreeBuilder23.parseFragment("doctype", "4a", parseErrorList56, parseSettings68);
        java.util.List<org.jsoup.nodes.Node> nodeList70 = xmlTreeBuilder0.parseFragment("Comment", "<!DOCTYPE #doctype PUBLIC \"4\" \"PUBLIC\">", parseErrorList22, parseSettings68);
        org.jsoup.parser.Token.StartTag startTag71 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str72 = startTag71.normalName;
        org.jsoup.nodes.Attributes attributes73 = startTag71.attributes;
        org.jsoup.parser.Token.Tag tag74 = startTag71.reset();
        org.jsoup.parser.Token.Tag tag75 = startTag71.reset();
        startTag71.appendAttributeValue("Doctype");
        org.jsoup.nodes.Attributes attributes78 = startTag71.attributes;
        org.jsoup.nodes.DocumentType documentType84 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean86 = documentType84.hasAttr("hi!");
        int int87 = documentType84.childNodeSize();
        int int88 = documentType84.childNodeSize();
        java.lang.String str89 = documentType84.baseUri();
        java.lang.String str90 = documentType84.baseUri();
        org.jsoup.nodes.Attributes attributes91 = documentType84.attributes();
        org.jsoup.parser.Token.StartTag startTag92 = startTag71.nameAttr("#", attributes91);
        startTag71.appendTagName('#');
        boolean boolean95 = startTag71.isStartTag();
        org.jsoup.parser.Token.Tag tag96 = startTag71.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element97 = xmlTreeBuilder0.insert(startTag71);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertNotNull(comment15);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(stringBuilder37);
        org.junit.Assert.assertEquals(stringBuilder37.toString(), "");
        org.junit.Assert.assertNotNull(comment38);
        org.junit.Assert.assertNotNull(stringBuilder41);
        org.junit.Assert.assertEquals(stringBuilder41.toString(), "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<!---->" + "'", str42, "<!---->");
        org.junit.Assert.assertNotNull(token43);
        org.junit.Assert.assertNotNull(token44);
        org.junit.Assert.assertNotNull(stringBuilder47);
        org.junit.Assert.assertEquals(stringBuilder47.toString(), "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "<!---->" + "'", str48, "<!---->");
        org.junit.Assert.assertNotNull(token49);
        org.junit.Assert.assertNotNull(token50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "<!---->" + "'", str51, "<!---->");
        org.junit.Assert.assertNotNull(comment52);
        org.junit.Assert.assertNotNull(nodeList67);
        org.junit.Assert.assertNotNull(parseSettings68);
        org.junit.Assert.assertNotNull(nodeList69);
        org.junit.Assert.assertNotNull(nodeList70);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNotNull(attributes73);
        org.junit.Assert.assertNotNull(tag74);
        org.junit.Assert.assertNotNull(tag75);
        org.junit.Assert.assertNotNull(attributes78);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "SYSTEM" + "'", str89, "SYSTEM");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "SYSTEM" + "'", str90, "SYSTEM");
        org.junit.Assert.assertNotNull(attributes91);
        org.junit.Assert.assertNotNull(startTag92);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNotNull(tag96);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.InTable;
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag2 = startTag1.reset();
        tag2.finaliseTag();
        tag2.appendTagName('4');
        java.lang.String str6 = tag2.name();
        org.jsoup.parser.Token.Tag tag7 = tag2.reset();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag9 = startTag8.reset();
        tag9.finaliseTag();
        tag9.appendTagName('4');
        org.jsoup.nodes.Attributes attributes13 = tag9.getAttributes();
        tag2.attributes = attributes13;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) tag2, htmlTreeBuilder15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4" + "'", str6, "4");
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        tag1.appendTagName('4');
        org.jsoup.nodes.Attributes attributes5 = tag1.getAttributes();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag6.reset();
        tag7.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str10 = startTag9.normalName;
        startTag9.newAttribute();
        java.lang.String str12 = startTag9.normalName();
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag15 = startTag14.reset();
        tag15.finaliseTag();
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean23 = documentType21.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes24 = documentType21.attributes();
        tag15.attributes = attributes24;
        org.jsoup.parser.Token.StartTag startTag26 = startTag9.nameAttr("<!---->", attributes24);
        tag7.attributes = attributes24;
        char[] charArray29 = new char[] { 'a' };
        tag7.appendAttributeValue(charArray29);
        tag1.appendAttributeValue(charArray29);
        java.lang.String str32 = tag1.tagName;
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(startTag26);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { 'a' });
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "4" + "'", str32, "4");
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        java.lang.String str4 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        boolean boolean6 = startTag0.isDoctype();
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("Doctype");
        org.jsoup.nodes.Attributes attributes9 = tag8.attributes;
        boolean boolean10 = tag8.isEndTag();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.String str4 = comment0.getData();
        java.lang.String str5 = comment0.toString();
        java.lang.StringBuilder stringBuilder6 = comment0.data;
        comment0.bogus = true;
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder11 = comment0.data;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        java.lang.String str8 = startTag0.tagName;
        startTag0.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag10 = startTag0.reset();
        startTag0.normalName = "<<!DOCTYPE #doctype PUBLIC \"4\" \"PUBLIC\">  name=\"\" publicId=\"hi!\" systemId=\"hi!\">";
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str15 = startTag14.normalName;
        startTag14.newAttribute();
        java.lang.String str17 = startTag14.normalName();
        startTag14.appendAttributeName("");
        startTag14.normalName = "hi!";
        org.jsoup.parser.Token.Tag tag22 = startTag14.reset();
        startTag14.appendTagName(' ');
        org.jsoup.nodes.Attributes attributes25 = startTag14.getAttributes();
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str27 = startTag26.normalName;
        startTag26.newAttribute();
        java.lang.String str29 = startTag26.normalName();
        startTag26.appendAttributeName("");
        startTag26.normalName = "hi!";
        org.jsoup.parser.Token.Tag tag34 = startTag26.reset();
        org.jsoup.parser.Token.Tag tag36 = tag34.name("Doctype");
        org.jsoup.nodes.Attributes attributes37 = tag36.attributes;
        startTag14.attributes = attributes37;
        org.jsoup.parser.Token.StartTag startTag39 = startTag0.nameAttr("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", attributes37);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertNotNull(startTag39);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        tag1.appendTagName('4');
        java.lang.String str5 = tag1.name();
        org.jsoup.parser.Token.Tag tag6 = tag1.reset();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag8 = startTag7.reset();
        tag8.finaliseTag();
        tag8.appendTagName('4');
        org.jsoup.nodes.Attributes attributes12 = tag8.getAttributes();
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag14 = startTag13.reset();
        tag14.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str17 = startTag16.normalName;
        startTag16.newAttribute();
        java.lang.String str19 = startTag16.normalName();
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag22 = startTag21.reset();
        tag22.finaliseTag();
        org.jsoup.nodes.DocumentType documentType28 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean30 = documentType28.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes31 = documentType28.attributes();
        tag22.attributes = attributes31;
        org.jsoup.parser.Token.StartTag startTag33 = startTag16.nameAttr("<!---->", attributes31);
        tag14.attributes = attributes31;
        char[] charArray36 = new char[] { 'a' };
        tag14.appendAttributeValue(charArray36);
        tag8.appendAttributeValue(charArray36);
        tag6.appendAttributeValue(charArray36);
        java.lang.String str40 = tag6.normalName;
        tag6.appendAttributeName("<SYSTEM></SYSTEM>");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertNotNull(startTag33);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { 'a' });
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "#doctype", parseErrorList8, parseSettings9);
        org.jsoup.parser.Token.Comment comment11 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder12 = comment11.data;
        java.lang.String str13 = comment11.toString();
        org.jsoup.parser.Token token14 = comment11.reset();
        boolean boolean15 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment11);
        java.lang.String str16 = comment11.toString();
        org.jsoup.parser.Token.Comment comment17 = comment11.asComment();
        boolean boolean18 = comment11.isEndTag();
        boolean boolean19 = comment11.bogus;
        org.jsoup.parser.Token token20 = comment11.reset();
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!---->" + "'", str16, "<!---->");
        org.junit.Assert.assertNotNull(comment17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(token20);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList8, parseSettings9);
        org.jsoup.parser.Token.Comment comment11 = new org.jsoup.parser.Token.Comment();
        comment11.bogus = false;
        java.lang.StringBuilder stringBuilder14 = comment11.data;
        org.jsoup.parser.Token.Comment comment15 = comment11.asComment();
        xmlTreeBuilder0.insert(comment11);
        org.jsoup.parser.Token.Comment comment17 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder18 = comment17.data;
        java.lang.String str19 = comment17.toString();
        org.jsoup.parser.Token token20 = comment17.reset();
        org.jsoup.parser.Token token21 = comment17.reset();
        xmlTreeBuilder0.insert(comment17);
        org.jsoup.parser.Token.Comment comment23 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder24 = comment23.data;
        java.lang.String str25 = comment23.toString();
        org.jsoup.parser.Token token26 = comment23.reset();
        org.jsoup.parser.Token token27 = comment23.reset();
        java.lang.String str28 = comment23.toString();
        org.jsoup.parser.Token.Comment comment29 = comment23.asComment();
        xmlTreeBuilder0.insert(comment23);
        boolean boolean31 = comment23.bogus;
        boolean boolean32 = comment23.bogus;
        java.lang.StringBuilder stringBuilder33 = comment23.data;
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertNotNull(comment15);
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!---->" + "'", str19, "<!---->");
        org.junit.Assert.assertNotNull(token20);
        org.junit.Assert.assertNotNull(token21);
        org.junit.Assert.assertNotNull(stringBuilder24);
        org.junit.Assert.assertEquals(stringBuilder24.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!---->" + "'", str25, "<!---->");
        org.junit.Assert.assertNotNull(token26);
        org.junit.Assert.assertNotNull(token27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!---->" + "'", str28, "<!---->");
        org.junit.Assert.assertNotNull(comment29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(stringBuilder33);
        org.junit.Assert.assertEquals(stringBuilder33.toString(), "");
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isComment();
        org.jsoup.parser.Token.Doctype doctype4 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.String str6 = doctype0.getName();
        org.jsoup.parser.Token token7 = doctype0.reset();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(doctype4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(token7);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        java.lang.String str4 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        startTag0.appendTagName("<SYSTEM>");
        startTag0.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag9 = startTag0.reset();
        boolean boolean10 = tag9.isSelfClosing();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("#doctype");
        java.lang.String str10 = documentType4.nodeName();
        org.jsoup.nodes.Node node11 = documentType4.previousSibling();
        java.lang.String str12 = documentType4.nodeName();
        java.lang.String str13 = documentType4.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = documentType4.siblingNodes();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str6, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#doctype" + "'", str13, "#doctype");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        boolean boolean4 = startTag0.selfClosing;
        java.lang.String str5 = startTag0.normalName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList8, parseSettings9);
        org.jsoup.parser.Token.Character character11 = new org.jsoup.parser.Token.Character();
        java.lang.String str12 = character11.getData();
        xmlTreeBuilder0.insert(character11);
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.ParseSettings parseSettings21 = null;
        xmlTreeBuilder17.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList20, parseSettings21);
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder17.parseFragment("", "#doctype", parseErrorList25, parseSettings26);
        org.jsoup.parser.Token.Character character28 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder17.insert(character28);
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings34 = xmlTreeBuilder33.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = xmlTreeBuilder17.parseFragment("SYSTEM", "PUBLIC", parseErrorList32, parseSettings34);
        java.util.List<org.jsoup.nodes.Node> nodeList36 = xmlTreeBuilder0.parseFragment("#doctype", "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">", parseErrorList16, parseSettings34);
        org.jsoup.parser.ParseSettings parseSettings37 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.EOF eOF38 = new org.jsoup.parser.Token.EOF();
        org.jsoup.parser.Token token39 = eOF38.reset();
        org.jsoup.parser.Token token40 = eOF38.reset();
        boolean boolean41 = xmlTreeBuilder0.process((org.jsoup.parser.Token) eOF38);
        boolean boolean42 = eOF38.isEndTag();
        org.jsoup.parser.Token token43 = eOF38.reset();
        org.jsoup.parser.Token token44 = eOF38.reset();
        org.jsoup.parser.Token token45 = eOF38.reset();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertNotNull(token39);
        org.junit.Assert.assertNotNull(token40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(token43);
        org.junit.Assert.assertNotNull(token44);
        org.junit.Assert.assertNotNull(token45);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        java.lang.String str9 = documentType4.nodeName();
        java.lang.String str11 = documentType4.attr("#doctype");
        org.jsoup.nodes.Node node14 = documentType4.attr("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "#doctype", parseErrorList8, parseSettings9);
        org.jsoup.parser.Token.Comment comment11 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder12 = comment11.data;
        java.lang.String str13 = comment11.toString();
        org.jsoup.parser.Token token14 = comment11.reset();
        boolean boolean15 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment11);
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.ParseSettings parseSettings24 = null;
        xmlTreeBuilder20.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList23, parseSettings24);
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.ParseSettings parseSettings29 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder20.parseFragment("", "#doctype", parseErrorList28, parseSettings29);
        org.jsoup.parser.ParseSettings parseSettings31 = xmlTreeBuilder20.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = xmlTreeBuilder0.parseFragment("<SYSTEM >", "Doctype", parseErrorList19, parseSettings31);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertNotNull(nodeList32);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag6 = startTag5.reset();
        tag6.finaliseTag();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean14 = documentType12.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes15 = documentType12.attributes();
        tag6.attributes = attributes15;
        org.jsoup.parser.Token.StartTag startTag17 = startTag0.nameAttr("<!---->", attributes15);
        startTag0.appendTagName('4');
        java.lang.String str20 = startTag0.tagName;
        startTag0.newAttribute();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!---->4" + "'", str20, "<!---->4");
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("#doctype", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.Token.Character character6 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder0.insert(character6);
        org.jsoup.nodes.Document document10 = xmlTreeBuilder0.parse("EOF", "<SYSTEM>");
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str12 = startTag11.normalName;
        startTag11.newAttribute();
        java.lang.String str14 = startTag11.normalName();
        java.lang.String str15 = startTag11.normalName();
        org.jsoup.parser.Token.Tag tag16 = startTag11.reset();
        startTag11.appendTagName("<SYSTEM>");
        startTag11.setEmptyAttributeValue();
        org.jsoup.nodes.Element element20 = xmlTreeBuilder0.insert(startTag11);
        org.jsoup.parser.Token.Doctype doctype21 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str22 = doctype21.getName();
        boolean boolean23 = doctype21.forceQuirks;
        java.lang.String str24 = doctype21.getSystemIdentifier();
        java.lang.String str25 = doctype21.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder26 = doctype21.publicIdentifier;
        boolean boolean27 = doctype21.isForceQuirks();
        xmlTreeBuilder0.insert(doctype21);
        org.jsoup.parser.ParseErrorList parseErrorList31 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder32 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList35 = null;
        org.jsoup.parser.ParseSettings parseSettings36 = null;
        xmlTreeBuilder32.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList35, parseSettings36);
        org.jsoup.parser.Token.Comment comment38 = new org.jsoup.parser.Token.Comment();
        comment38.bogus = false;
        java.lang.StringBuilder stringBuilder41 = comment38.data;
        java.lang.String str42 = comment38.toString();
        xmlTreeBuilder32.insert(comment38);
        org.jsoup.parser.ParseSettings parseSettings44 = xmlTreeBuilder32.defaultSettings();
        xmlTreeBuilder0.initialiseParse("SYSTEM", "4", parseErrorList31, parseSettings44);
        org.jsoup.nodes.Document document48 = xmlTreeBuilder0.parse("<!---->#doctype", "starttag");
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(element20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(stringBuilder41);
        org.junit.Assert.assertEquals(stringBuilder41.toString(), "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<!---->" + "'", str42, "<!---->");
        org.junit.Assert.assertNotNull(parseSettings44);
        org.junit.Assert.assertNotNull(document48);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder5 = comment4.data;
        xmlTreeBuilder0.insert(comment4);
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str8 = startTag7.normalName;
        startTag7.newAttribute();
        java.lang.String str10 = startTag7.normalName();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag13 = startTag12.reset();
        tag13.finaliseTag();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean21 = documentType19.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes22 = documentType19.attributes();
        tag13.attributes = attributes22;
        org.jsoup.parser.Token.StartTag startTag24 = startTag7.nameAttr("<!---->", attributes22);
        java.lang.String str25 = startTag24.name();
        boolean boolean26 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag24);
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder30 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.ParseSettings parseSettings34 = null;
        xmlTreeBuilder30.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList33, parseSettings34);
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        org.jsoup.parser.ParseSettings parseSettings39 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList40 = xmlTreeBuilder30.parseFragment("", "#doctype", parseErrorList38, parseSettings39);
        org.jsoup.parser.Token.Comment comment41 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder42 = comment41.data;
        java.lang.String str43 = comment41.toString();
        org.jsoup.parser.Token token44 = comment41.reset();
        boolean boolean45 = xmlTreeBuilder30.process((org.jsoup.parser.Token) comment41);
        org.jsoup.parser.ParseSettings parseSettings46 = xmlTreeBuilder30.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings47 = xmlTreeBuilder30.defaultSettings();
        xmlTreeBuilder0.initialiseParse("4", "SYSTEM", parseErrorList29, parseSettings47);
        org.jsoup.parser.Token.Character character49 = new org.jsoup.parser.Token.Character();
        java.lang.String str50 = character49.toString();
        java.lang.String str51 = character49.toString();
        java.lang.String str52 = character49.getData();
        org.jsoup.parser.Token token53 = character49.reset();
        xmlTreeBuilder0.insert(character49);
        org.jsoup.parser.Token.Character character55 = character49.asCharacter();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(startTag24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!---->" + "'", str25, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertNotNull(stringBuilder42);
        org.junit.Assert.assertEquals(stringBuilder42.toString(), "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "<!---->" + "'", str43, "<!---->");
        org.junit.Assert.assertNotNull(token44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(parseSettings46);
        org.junit.Assert.assertNotNull(parseSettings47);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(token53);
        org.junit.Assert.assertNotNull(character55);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean9 = documentType4.equals(obj8);
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag10.reset();
        tag11.finaliseTag();
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean19 = documentType17.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes20 = documentType17.attributes();
        tag11.attributes = attributes20;
        java.lang.String str22 = tag11.normalName;
        boolean boolean23 = documentType4.hasSameValue((java.lang.Object) str22);
        int int24 = documentType4.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = documentType4.childNodes();
        java.lang.String str26 = documentType4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = documentType4.childNodes();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str26, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList27);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder5 = comment4.data;
        xmlTreeBuilder0.insert(comment4);
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean14 = documentType12.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Node node15 = documentType12.nextSibling();
        org.jsoup.parser.Token.Doctype doctype16 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder17 = doctype16.name;
        java.lang.StringBuilder stringBuilder18 = doctype16.systemIdentifier;
        boolean boolean19 = doctype16.isComment();
        boolean boolean20 = doctype16.isComment();
        boolean boolean21 = documentType12.hasSameValue((java.lang.Object) doctype16);
        xmlTreeBuilder0.insert(doctype16);
        org.jsoup.nodes.Document document25 = xmlTreeBuilder0.parse("Comment", "Comment");
        org.jsoup.parser.Token.Comment comment26 = new org.jsoup.parser.Token.Comment();
        comment26.bogus = false;
        java.lang.StringBuilder stringBuilder29 = comment26.data;
        org.jsoup.parser.Token.Comment comment30 = comment26.asComment();
        boolean boolean31 = document25.equals((java.lang.Object) comment30);
        java.lang.String str32 = document25.baseUri();
        org.jsoup.nodes.Node node33 = document25.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = node33.absUrl("<<SYSTEM>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(stringBuilder29);
        org.junit.Assert.assertEquals(stringBuilder29.toString(), "");
        org.junit.Assert.assertNotNull(comment30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Comment" + "'", str32, "Comment");
        org.junit.Assert.assertNull(node33);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        java.lang.String str4 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        boolean boolean6 = startTag0.isDoctype();
        boolean boolean7 = startTag0.isCharacter();
        java.lang.String str8 = startTag0.normalName();
        startTag0.normalName = "<PUBLICa>";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        startTag0.appendTagName("PUBLIC");
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag10.reset();
        tag11.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str14 = startTag13.normalName;
        startTag13.newAttribute();
        java.lang.String str16 = startTag13.normalName();
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag19 = startTag18.reset();
        tag19.finaliseTag();
        org.jsoup.nodes.DocumentType documentType25 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean27 = documentType25.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes28 = documentType25.attributes();
        tag19.attributes = attributes28;
        org.jsoup.parser.Token.StartTag startTag30 = startTag13.nameAttr("<!---->", attributes28);
        tag11.attributes = attributes28;
        char[] charArray33 = new char[] { 'a' };
        tag11.appendAttributeValue(charArray33);
        startTag0.appendAttributeValue(charArray33);
        startTag0.appendTagName('a');
        boolean boolean38 = startTag0.selfClosing;
        org.jsoup.parser.Token.Tag tag39 = startTag0.reset();
        startTag0.appendAttributeName(' ');
        startTag0.normalName = "starttag";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(startTag30);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(tag39);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        org.jsoup.parser.Token.Tag tag8 = startTag0.reset();
        startTag0.appendTagName(' ');
        java.lang.String str11 = startTag0.name();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag13 = startTag12.reset();
        tag13.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str16 = startTag15.normalName;
        startTag15.newAttribute();
        java.lang.String str18 = startTag15.normalName();
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag21 = startTag20.reset();
        tag21.finaliseTag();
        org.jsoup.nodes.DocumentType documentType27 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean29 = documentType27.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes30 = documentType27.attributes();
        tag21.attributes = attributes30;
        org.jsoup.parser.Token.StartTag startTag32 = startTag15.nameAttr("<!---->", attributes30);
        tag13.attributes = attributes30;
        tag13.newAttribute();
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str36 = startTag35.normalName;
        startTag35.newAttribute();
        org.jsoup.parser.Token.Tag tag38 = startTag35.reset();
        org.jsoup.parser.Token.StartTag startTag39 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag40 = startTag39.reset();
        tag40.finaliseTag();
        tag40.appendTagName('4');
        int[] intArray47 = new int[] { 0, ' ', '#' };
        tag40.appendAttributeValue(intArray47);
        startTag35.appendAttributeValue(intArray47);
        tag13.appendAttributeValue(intArray47);
        startTag0.appendAttributeValue(intArray47);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " " + "'", str11, " ");
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNotNull(startTag32);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { 0, 32, 35 });
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        org.jsoup.nodes.Attributes attributes2 = startTag0.attributes;
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        java.lang.String str5 = tag4.normalName;
        boolean boolean6 = tag4.isStartTag();
        boolean boolean7 = tag4.isComment();
        boolean boolean8 = tag4.isEOF();
        boolean boolean9 = tag4.isCharacter();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        java.lang.String str2 = comment0.toString();
        org.jsoup.parser.Token token3 = comment0.reset();
        org.jsoup.parser.Token token4 = comment0.reset();
        java.lang.String str5 = comment0.toString();
        org.jsoup.parser.Token token6 = comment0.reset();
        java.lang.StringBuilder stringBuilder7 = comment0.data;
        java.lang.String str8 = comment0.getData();
        boolean boolean9 = comment0.isStartTag();
        org.jsoup.parser.Token token10 = comment0.reset();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(token10);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag6 = startTag5.reset();
        tag6.finaliseTag();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean14 = documentType12.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes15 = documentType12.attributes();
        tag6.attributes = attributes15;
        org.jsoup.parser.Token.StartTag startTag17 = startTag0.nameAttr("<!---->", attributes15);
        java.lang.String str18 = startTag17.name();
        boolean boolean19 = startTag17.isSelfClosing();
        java.lang.String str20 = startTag17.normalName;
        int[] intArray21 = null;
        // The following exception was thrown during execution in test generation
        try {
            startTag17.appendAttributeValue(intArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!---->" + "'", str18, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!---->" + "'", str20, "<!---->");
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        java.lang.String str9 = documentType4.nodeName();
        java.lang.String str10 = documentType4.nodeName();
        java.lang.String str11 = documentType4.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodes();
        org.jsoup.parser.Token.Doctype doctype13 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str14 = doctype13.getName();
        org.jsoup.parser.Token.TokenType tokenType15 = doctype13.type;
        doctype13.forceQuirks = false;
        java.lang.String str18 = doctype13.getName();
        boolean boolean19 = doctype13.isCharacter();
        java.lang.String str20 = doctype13.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder21 = doctype13.systemIdentifier;
        java.lang.StringBuilder stringBuilder22 = documentType4.html(stringBuilder21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        tag1.appendTagName('4');
        java.lang.String str5 = tag1.name();
        org.jsoup.parser.Token.Tag tag6 = tag1.reset();
        tag1.appendAttributeName(' ');
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder5 = comment4.data;
        xmlTreeBuilder0.insert(comment4);
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean14 = documentType12.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Node node15 = documentType12.nextSibling();
        org.jsoup.parser.Token.Doctype doctype16 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder17 = doctype16.name;
        java.lang.StringBuilder stringBuilder18 = doctype16.systemIdentifier;
        boolean boolean19 = doctype16.isComment();
        boolean boolean20 = doctype16.isComment();
        boolean boolean21 = documentType12.hasSameValue((java.lang.Object) doctype16);
        xmlTreeBuilder0.insert(doctype16);
        org.jsoup.nodes.Document document25 = xmlTreeBuilder0.parse("Comment", "Comment");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder26 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document29 = xmlTreeBuilder26.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment30 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder31 = comment30.data;
        xmlTreeBuilder26.insert(comment30);
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str34 = startTag33.normalName;
        startTag33.newAttribute();
        java.lang.String str36 = startTag33.normalName();
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag39 = startTag38.reset();
        tag39.finaliseTag();
        org.jsoup.nodes.DocumentType documentType45 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean47 = documentType45.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes48 = documentType45.attributes();
        tag39.attributes = attributes48;
        org.jsoup.parser.Token.StartTag startTag50 = startTag33.nameAttr("<!---->", attributes48);
        java.lang.String str51 = startTag50.name();
        boolean boolean52 = xmlTreeBuilder26.process((org.jsoup.parser.Token) startTag50);
        java.lang.String str53 = startTag50.toString();
        org.jsoup.nodes.Element element54 = xmlTreeBuilder0.insert(startTag50);
        org.jsoup.nodes.DocumentType documentType60 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean62 = documentType60.hasSameValue((java.lang.Object) (short) -1);
        java.util.List<org.jsoup.nodes.Node> nodeList63 = documentType60.siblingNodes();
        boolean boolean65 = documentType60.equals((java.lang.Object) 0L);
        org.jsoup.nodes.Node node66 = documentType60.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList67 = documentType60.siblingNodes();
        documentType60.setBaseUri("4");
        java.lang.String str70 = documentType60.baseUri();
        org.jsoup.nodes.Node node71 = documentType60.nextSibling();
        org.jsoup.nodes.Attributes attributes72 = documentType60.attributes();
        boolean boolean73 = xmlTreeBuilder0.processStartTag("<!doctype #doctype public \"4\" \"public\">", attributes72);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(stringBuilder31);
        org.junit.Assert.assertEquals(stringBuilder31.toString(), "");
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(attributes48);
        org.junit.Assert.assertNotNull(startTag50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "<!---->" + "'", str51, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "<<!---->  name=\"\" publicId=\"hi!\" systemId=\"hi!\">" + "'", str53, "<<!---->  name=\"\" publicId=\"hi!\" systemId=\"hi!\">");
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(nodeList63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertNotNull(nodeList67);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "4" + "'", str70, "4");
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertNotNull(attributes72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Doctype doctype4 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str5 = doctype4.getName();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str7 = doctype6.getName();
        org.jsoup.parser.Token.TokenType tokenType8 = doctype6.type;
        doctype4.type = tokenType8;
        java.lang.StringBuilder stringBuilder10 = doctype4.publicIdentifier;
        boolean boolean11 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype4);
        boolean boolean12 = doctype4.forceQuirks;
        boolean boolean13 = doctype4.isDoctype();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "#doctype", parseErrorList8, parseSettings9);
        org.jsoup.parser.Token.Comment comment11 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder12 = comment11.data;
        java.lang.String str13 = comment11.toString();
        org.jsoup.parser.Token token14 = comment11.reset();
        boolean boolean15 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment11);
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings17 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Character character18 = new org.jsoup.parser.Token.Character();
        java.lang.String str19 = character18.getData();
        org.jsoup.parser.Token.Character character21 = character18.data("<!---->");
        xmlTreeBuilder0.insert(character21);
        java.lang.String str23 = character21.tokenType();
        org.jsoup.parser.Token.Character character25 = character21.data("<SYSTEM >");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(character21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Character" + "'", str23, "Character");
        org.junit.Assert.assertNotNull(character25);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        org.jsoup.parser.Token.Tag tag8 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag10 = tag8.name("Doctype");
        tag10.finaliseTag();
        tag10.appendTagName("<!---->4");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "", "", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.parser.Token.Doctype doctype5 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder6 = doctype5.name;
        java.lang.StringBuilder stringBuilder7 = doctype5.systemIdentifier;
        java.lang.StringBuilder stringBuilder8 = documentType4.html(stringBuilder7);
        org.jsoup.nodes.Node node9 = documentType4.parent();
        org.jsoup.nodes.Document document10 = documentType4.ownerDocument();
        org.jsoup.nodes.Node node11 = documentType4.parentNode();
        int int12 = documentType4.childNodeSize();
        java.lang.String str13 = documentType4.outerHtml();
        org.jsoup.nodes.DocumentType documentType18 = new org.jsoup.nodes.DocumentType("<!---->", "#", "<<SYSTEM>>", "EOF");
        org.jsoup.parser.Token.Doctype doctype19 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder20 = doctype19.name;
        java.lang.StringBuilder stringBuilder21 = doctype19.systemIdentifier;
        java.lang.StringBuilder stringBuilder22 = doctype19.name;
        java.lang.Appendable appendable23 = documentType18.html((java.lang.Appendable) stringBuilder22);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = documentType4.after((org.jsoup.nodes.Node) documentType18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">>");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">>");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">>" + "'", str13, "<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">>");
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "<!DOCTYPE <!----> PUBLIC \"#\" \"<<SYSTEM>>\">");
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "<!DOCTYPE <!----> PUBLIC \"#\" \"<<SYSTEM>>\">");
        org.junit.Assert.assertNotNull(appendable23);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder5 = comment4.data;
        xmlTreeBuilder0.insert(comment4);
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str8 = startTag7.normalName;
        startTag7.newAttribute();
        java.lang.String str10 = startTag7.normalName();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag13 = startTag12.reset();
        tag13.finaliseTag();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean21 = documentType19.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes22 = documentType19.attributes();
        tag13.attributes = attributes22;
        org.jsoup.parser.Token.StartTag startTag24 = startTag7.nameAttr("<!---->", attributes22);
        java.lang.String str25 = startTag24.name();
        boolean boolean26 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag24);
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str28 = startTag27.normalName;
        startTag27.newAttribute();
        java.lang.String str30 = startTag27.normalName();
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag33 = startTag32.reset();
        tag33.finaliseTag();
        org.jsoup.nodes.DocumentType documentType39 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean41 = documentType39.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes42 = documentType39.attributes();
        tag33.attributes = attributes42;
        org.jsoup.parser.Token.StartTag startTag44 = startTag27.nameAttr("<!---->", attributes42);
        boolean boolean45 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag44);
        java.lang.String str46 = startTag44.name();
        java.lang.String str47 = startTag44.normalName;
        java.lang.String str48 = startTag44.toString();
        org.jsoup.parser.Token.Tag tag50 = startTag44.name("<!DOCTYPE #doctype PUBLIC \"4\" \"PUBLIC\">");
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(startTag24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!---->" + "'", str25, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertNotNull(startTag44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "<!---->" + "'", str46, "<!---->");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "<!---->" + "'", str47, "<!---->");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "<<!---->  name=\"\" publicId=\"hi!\" systemId=\"hi!\">" + "'", str48, "<<!---->  name=\"\" publicId=\"hi!\" systemId=\"hi!\">");
        org.junit.Assert.assertNotNull(tag50);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        org.jsoup.parser.Token.Tag tag8 = startTag0.reset();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag10.reset();
        org.jsoup.parser.Token.Tag tag12 = startTag10.reset();
        org.jsoup.nodes.Attributes attributes13 = startTag10.getAttributes();
        org.jsoup.parser.Token.StartTag startTag14 = startTag0.nameAttr("Doctype", attributes13);
        startTag14.appendAttributeName("SYSTEM");
        startTag14.appendAttributeValue("#");
        startTag14.appendAttributeValue('#');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(startTag14);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("Comment", "<!DOCTYPE PUBLIC>", "<<!---->#doctype  name=\"\" publicId=\"hi!\" systemId=\"hi!\">", "EOF");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node7 = documentType4.nextSibling();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList8, parseSettings9);
        org.jsoup.parser.Token.Character character11 = new org.jsoup.parser.Token.Character();
        java.lang.String str12 = character11.getData();
        xmlTreeBuilder0.insert(character11);
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.ParseSettings parseSettings21 = null;
        xmlTreeBuilder17.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList20, parseSettings21);
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder17.parseFragment("", "#doctype", parseErrorList25, parseSettings26);
        org.jsoup.parser.Token.Character character28 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder17.insert(character28);
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings34 = xmlTreeBuilder33.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = xmlTreeBuilder17.parseFragment("SYSTEM", "PUBLIC", parseErrorList32, parseSettings34);
        java.util.List<org.jsoup.nodes.Node> nodeList36 = xmlTreeBuilder0.parseFragment("#doctype", "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">", parseErrorList16, parseSettings34);
        org.jsoup.parser.ParseSettings parseSettings37 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str39 = startTag38.normalName;
        startTag38.newAttribute();
        java.lang.String str41 = startTag38.normalName();
        java.lang.String str42 = startTag38.normalName();
        org.jsoup.parser.Token.Tag tag43 = startTag38.reset();
        boolean boolean44 = startTag38.isDoctype();
        org.jsoup.parser.Token.Tag tag46 = startTag38.name("Doctype");
        startTag38.appendAttributeName("<<SYSTEM>>");
        org.jsoup.nodes.Element element49 = xmlTreeBuilder0.insert(startTag38);
        org.jsoup.nodes.Document document52 = xmlTreeBuilder0.parse("4a", "");
        org.jsoup.nodes.DocumentType documentType57 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean59 = documentType57.hasAttr("hi!");
        int int60 = documentType57.childNodeSize();
        int int61 = documentType57.childNodeSize();
        java.lang.String str62 = documentType57.baseUri();
        org.jsoup.nodes.Node node63 = documentType57.clone();
        org.jsoup.nodes.Node node64 = documentType57.clone();
        org.jsoup.nodes.Node node65 = node64.clone();
        org.jsoup.nodes.Node node66 = node64.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            document52.replaceWith(node66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(document52);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "SYSTEM" + "'", str62, "SYSTEM");
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNull(node66);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasSameValue((java.lang.Object) (short) -1);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.siblingNodes();
        java.lang.String str8 = documentType4.outerHtml();
        org.jsoup.nodes.Node node10 = documentType4.removeAttr("<SYSTEM></SYSTEM>");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str8, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        boolean boolean5 = startTag0.isSelfClosing();
        org.jsoup.nodes.Attributes attributes6 = startTag0.getAttributes();
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        boolean boolean8 = tag7.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType9 = tag7.type;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + tokenType9 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType9.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder5 = comment4.data;
        xmlTreeBuilder0.insert(comment4);
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean14 = documentType12.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Node node15 = documentType12.nextSibling();
        org.jsoup.parser.Token.Doctype doctype16 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder17 = doctype16.name;
        java.lang.StringBuilder stringBuilder18 = doctype16.systemIdentifier;
        boolean boolean19 = doctype16.isComment();
        boolean boolean20 = doctype16.isComment();
        boolean boolean21 = documentType12.hasSameValue((java.lang.Object) doctype16);
        xmlTreeBuilder0.insert(doctype16);
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str24 = startTag23.normalName;
        startTag23.newAttribute();
        java.lang.String str26 = startTag23.normalName();
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag29 = startTag28.reset();
        tag29.finaliseTag();
        org.jsoup.nodes.DocumentType documentType35 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean37 = documentType35.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes38 = documentType35.attributes();
        tag29.attributes = attributes38;
        org.jsoup.parser.Token.StartTag startTag40 = startTag23.nameAttr("<!---->", attributes38);
        startTag23.appendAttributeName("StartTag");
        startTag23.appendTagName("#doctype");
        org.jsoup.nodes.Attributes attributes45 = startTag23.attributes;
        org.jsoup.nodes.Element element46 = xmlTreeBuilder0.insert(startTag23);
        org.jsoup.select.NodeVisitor nodeVisitor47 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node48 = element46.traverse(nodeVisitor47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertNotNull(startTag40);
        org.junit.Assert.assertNotNull(attributes45);
        org.junit.Assert.assertNotNull(element46);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        boolean boolean7 = documentType4.hasAttr("");
        org.jsoup.nodes.Node node8 = documentType4.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.childNodesCopy();
        org.jsoup.nodes.Document document10 = documentType4.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = document10.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        xmlTreeBuilder9.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlTreeBuilder9.parseFragment("", "#doctype", parseErrorList17, parseSettings18);
        org.jsoup.parser.Token.Character character20 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder9.insert(character20);
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder25 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings26 = xmlTreeBuilder25.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder9.parseFragment("SYSTEM", "PUBLIC", parseErrorList24, parseSettings26);
        xmlTreeBuilder0.initialiseParse("<SYSTEM>", "Doctype", parseErrorList8, parseSettings26);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.ParseSettings parseSettings33 = null;
        xmlTreeBuilder29.initialiseParse("#doctype", "hi!", parseErrorList32, parseSettings33);
        org.jsoup.parser.Token.Character character35 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder29.insert(character35);
        java.lang.String str37 = character35.getData();
        xmlTreeBuilder0.insert(character35);
        org.jsoup.parser.Token.Comment comment39 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder40 = comment39.data;
        java.lang.String str41 = comment39.toString();
        org.jsoup.parser.Token token42 = comment39.reset();
        org.jsoup.parser.Token token43 = comment39.reset();
        java.lang.String str44 = comment39.toString();
        org.jsoup.parser.Token.Comment comment45 = comment39.asComment();
        xmlTreeBuilder0.insert(comment39);
        org.jsoup.parser.ParseErrorList parseErrorList49 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder50 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document53 = xmlTreeBuilder50.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment54 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder55 = comment54.data;
        xmlTreeBuilder50.insert(comment54);
        org.jsoup.parser.ParseSettings parseSettings57 = xmlTreeBuilder50.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList58 = xmlTreeBuilder0.parseFragment("", "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">", parseErrorList49, parseSettings57);
        org.jsoup.parser.ParseSettings parseSettings59 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document62 = xmlTreeBuilder0.parse("StartTag", "Character");
        org.jsoup.parser.Token.Doctype doctype63 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str64 = doctype63.getName();
        org.jsoup.parser.Token.TokenType tokenType65 = doctype63.type;
        org.jsoup.parser.Token token66 = doctype63.reset();
        java.lang.StringBuilder stringBuilder67 = doctype63.name;
        xmlTreeBuilder0.insert(doctype63);
        boolean boolean69 = doctype63.forceQuirks;
        java.lang.StringBuilder stringBuilder70 = doctype63.name;
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(parseSettings26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(stringBuilder40);
        org.junit.Assert.assertEquals(stringBuilder40.toString(), "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "<!---->" + "'", str41, "<!---->");
        org.junit.Assert.assertNotNull(token42);
        org.junit.Assert.assertNotNull(token43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "<!---->" + "'", str44, "<!---->");
        org.junit.Assert.assertNotNull(comment45);
        org.junit.Assert.assertNotNull(document53);
        org.junit.Assert.assertNotNull(stringBuilder55);
        org.junit.Assert.assertEquals(stringBuilder55.toString(), "");
        org.junit.Assert.assertNotNull(parseSettings57);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertNotNull(parseSettings59);
        org.junit.Assert.assertNotNull(document62);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + tokenType65 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType65.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(token66);
        org.junit.Assert.assertNotNull(stringBuilder67);
        org.junit.Assert.assertEquals(stringBuilder67.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(stringBuilder70);
        org.junit.Assert.assertEquals(stringBuilder70.toString(), "");
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        boolean boolean5 = startTag0.isSelfClosing();
        startTag0.appendAttributeName('a');
        startTag0.appendAttributeValue("<Doctype>");
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean17 = documentType15.hasAttr("hi!");
        int int18 = documentType15.childNodeSize();
        int int19 = documentType15.childNodeSize();
        org.jsoup.nodes.Node node21 = documentType15.removeAttr("<!---->4");
        org.jsoup.nodes.Node node23 = documentType15.removeAttr("<!---->4");
        org.jsoup.nodes.Attributes attributes24 = node23.attributes();
        org.jsoup.parser.Token.StartTag startTag25 = startTag0.nameAttr("EOF", attributes24);
        boolean boolean26 = startTag25.selfClosing;
        org.jsoup.parser.Token.Tag tag27 = startTag25.reset();
        tag27.finaliseTag();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(startTag25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(tag27);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList8, parseSettings9);
        org.jsoup.parser.Token.Character character11 = new org.jsoup.parser.Token.Character();
        java.lang.String str12 = character11.getData();
        xmlTreeBuilder0.insert(character11);
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.ParseSettings parseSettings21 = null;
        xmlTreeBuilder17.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList20, parseSettings21);
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder17.parseFragment("", "#doctype", parseErrorList25, parseSettings26);
        org.jsoup.parser.Token.Character character28 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder17.insert(character28);
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings34 = xmlTreeBuilder33.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = xmlTreeBuilder17.parseFragment("SYSTEM", "PUBLIC", parseErrorList32, parseSettings34);
        java.util.List<org.jsoup.nodes.Node> nodeList36 = xmlTreeBuilder0.parseFragment("#doctype", "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">", parseErrorList16, parseSettings34);
        org.jsoup.parser.ParseSettings parseSettings37 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str39 = startTag38.normalName;
        startTag38.newAttribute();
        java.lang.String str41 = startTag38.normalName();
        java.lang.String str42 = startTag38.normalName();
        org.jsoup.parser.Token.Tag tag43 = startTag38.reset();
        boolean boolean44 = startTag38.isDoctype();
        org.jsoup.parser.Token.Tag tag46 = startTag38.name("Doctype");
        startTag38.appendAttributeName("<<SYSTEM>>");
        org.jsoup.nodes.Element element49 = xmlTreeBuilder0.insert(startTag38);
        org.jsoup.parser.Token.StartTag startTag51 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag52 = startTag51.reset();
        org.jsoup.parser.Token.Tag tag53 = startTag51.reset();
        org.jsoup.nodes.DocumentType documentType59 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str60 = documentType59.nodeName();
        org.jsoup.nodes.Attributes attributes61 = documentType59.attributes();
        org.jsoup.parser.Token.StartTag startTag62 = startTag51.nameAttr("", attributes61);
        org.jsoup.parser.Token.StartTag startTag63 = startTag38.nameAttr("<!DOCTYPE #doctype PUBLIC \"4\" \"PUBLIC\">", attributes61);
        org.jsoup.parser.Token.StartTag startTag65 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag66 = startTag65.reset();
        org.jsoup.parser.Token.Tag tag68 = startTag65.name("");
        startTag65.setEmptyAttributeValue();
        org.jsoup.parser.Token.TokenType tokenType70 = startTag65.type;
        org.jsoup.nodes.Attributes attributes71 = startTag65.attributes;
        org.jsoup.parser.Token.StartTag startTag72 = startTag38.nameAttr("4a", attributes71);
        boolean boolean73 = startTag72.isComment();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(tag52);
        org.junit.Assert.assertNotNull(tag53);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "#doctype" + "'", str60, "#doctype");
        org.junit.Assert.assertNotNull(attributes61);
        org.junit.Assert.assertNotNull(startTag62);
        org.junit.Assert.assertNotNull(startTag63);
        org.junit.Assert.assertNotNull(tag66);
        org.junit.Assert.assertNotNull(tag68);
        org.junit.Assert.assertTrue("'" + tokenType70 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType70.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(attributes71);
        org.junit.Assert.assertNotNull(startTag72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str5 = documentType4.nodeName();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str7 = doctype6.getName();
        boolean boolean8 = doctype6.forceQuirks;
        org.jsoup.parser.Token token9 = doctype6.reset();
        org.jsoup.parser.Token.TokenType tokenType10 = doctype6.type;
        boolean boolean11 = doctype6.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType12 = doctype6.type;
        boolean boolean13 = documentType4.hasSameValue((java.lang.Object) doctype6);
        org.jsoup.nodes.Node node14 = documentType4.clone();
        int int15 = node14.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node14.after("<system>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "", "", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str5 = documentType4.baseUri();
        org.jsoup.nodes.Node node6 = documentType4.previousSibling();
        org.jsoup.nodes.Node node9 = documentType4.attr("<PUBLICa>", "<<!---->#doctype  name=\"\" publicId=\"hi!\" systemId=\"hi!\">");
        java.lang.String str11 = documentType4.attr("<<!---->  name=\"\" publicId=\"hi!\" systemId=\"hi!\">");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str5, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        org.jsoup.parser.Token.Tag tag8 = startTag0.reset();
        startTag0.appendTagName(' ');
        org.jsoup.nodes.Attributes attributes11 = startTag0.getAttributes();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str13 = startTag12.normalName;
        startTag12.newAttribute();
        java.lang.String str15 = startTag12.normalName();
        startTag12.appendAttributeName("");
        startTag12.normalName = "hi!";
        org.jsoup.parser.Token.Tag tag20 = startTag12.reset();
        org.jsoup.parser.Token.Tag tag22 = tag20.name("Doctype");
        org.jsoup.nodes.Attributes attributes23 = tag22.attributes;
        startTag0.attributes = attributes23;
        org.jsoup.nodes.Attributes attributes25 = startTag0.getAttributes();
        boolean boolean26 = startTag0.isEndTag();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        boolean boolean5 = document3.hasAttr("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node6 = document3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node6.childNodesCopy();
        java.lang.String str9 = node6.absUrl("<!---->4");
        // The following exception was thrown during execution in test generation
        try {
            node6.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        org.jsoup.nodes.Attributes attributes2 = startTag0.attributes;
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        tag4.finaliseTag();
        org.jsoup.parser.Token.Tag tag7 = tag4.name("<!---->4");
        tag7.normalName = "<PUBLICa>";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(tag7);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("SYSTEM", "SYSTEM", "#doctype", "SYSTEM");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("PUBLIC");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = org.jsoup.parser.HtmlTreeBuilderState.ForeignContent;
        boolean boolean8 = documentType4.hasSameValue((java.lang.Object) htmlTreeBuilderState7);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str10 = startTag9.normalName;
        startTag9.newAttribute();
        java.lang.String str12 = startTag9.normalName();
        java.lang.String str13 = startTag9.normalName();
        org.jsoup.parser.Token.Tag tag14 = startTag9.reset();
        org.jsoup.parser.Token.Tag tag15 = startTag9.reset();
        startTag9.tagName = "<!---->";
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder18 = null;
        boolean boolean19 = htmlTreeBuilderState7.process((org.jsoup.parser.Token) startTag9, htmlTreeBuilder18);
        org.jsoup.parser.Token.Doctype doctype20 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str21 = doctype20.getName();
        boolean boolean22 = doctype20.forceQuirks;
        org.jsoup.parser.Token token23 = doctype20.reset();
        org.jsoup.parser.Token.TokenType tokenType24 = doctype20.type;
        boolean boolean25 = doctype20.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType26 = doctype20.type;
        java.lang.String str27 = doctype20.getPublicIdentifier();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder28 = null;
        boolean boolean29 = htmlTreeBuilderState7.process((org.jsoup.parser.Token) doctype20, htmlTreeBuilder28);
        java.lang.StringBuilder stringBuilder30 = doctype20.publicIdentifier;
        org.jsoup.parser.Token.reset(stringBuilder30);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(token23);
        org.junit.Assert.assertTrue("'" + tokenType24 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType24.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + tokenType26 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType26.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(stringBuilder30);
        org.junit.Assert.assertEquals(stringBuilder30.toString(), "");
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.nodes.DocumentType documentType7 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean9 = documentType7.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes10 = documentType7.attributes();
        tag1.attributes = attributes10;
        java.lang.String str12 = tag1.tagName;
        boolean boolean13 = tag1.selfClosing;
        java.lang.String str14 = tag1.normalName;
        tag1.normalName = "4";
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str18 = startTag17.normalName;
        startTag17.newAttribute();
        java.lang.String str20 = startTag17.normalName();
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag23 = startTag22.reset();
        tag23.finaliseTag();
        org.jsoup.nodes.DocumentType documentType29 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean31 = documentType29.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes32 = documentType29.attributes();
        tag23.attributes = attributes32;
        org.jsoup.parser.Token.StartTag startTag34 = startTag17.nameAttr("<!---->", attributes32);
        tag1.attributes = attributes32;
        tag1.finaliseTag();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertNotNull(startTag34);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList8, parseSettings9);
        org.jsoup.parser.Token.Character character11 = new org.jsoup.parser.Token.Character();
        java.lang.String str12 = character11.getData();
        xmlTreeBuilder0.insert(character11);
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.ParseSettings parseSettings21 = null;
        xmlTreeBuilder17.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList20, parseSettings21);
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder17.parseFragment("", "#doctype", parseErrorList25, parseSettings26);
        org.jsoup.parser.Token.Character character28 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder17.insert(character28);
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings34 = xmlTreeBuilder33.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = xmlTreeBuilder17.parseFragment("SYSTEM", "PUBLIC", parseErrorList32, parseSettings34);
        java.util.List<org.jsoup.nodes.Node> nodeList36 = xmlTreeBuilder0.parseFragment("#doctype", "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">", parseErrorList16, parseSettings34);
        org.jsoup.parser.ParseSettings parseSettings37 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str39 = startTag38.normalName;
        startTag38.newAttribute();
        java.lang.String str41 = startTag38.normalName();
        java.lang.String str42 = startTag38.normalName();
        org.jsoup.parser.Token.Tag tag43 = startTag38.reset();
        boolean boolean44 = startTag38.isDoctype();
        org.jsoup.parser.Token.Tag tag46 = startTag38.name("Doctype");
        startTag38.appendAttributeName("<<SYSTEM>>");
        org.jsoup.nodes.Element element49 = xmlTreeBuilder0.insert(startTag38);
        org.jsoup.parser.Token.Doctype doctype50 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder51 = doctype50.name;
        java.lang.StringBuilder stringBuilder52 = doctype50.systemIdentifier;
        boolean boolean53 = doctype50.isComment();
        java.lang.String str54 = doctype50.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder55 = doctype50.publicIdentifier;
        org.jsoup.parser.Token.reset(stringBuilder55);
        java.lang.StringBuilder stringBuilder57 = element49.html(stringBuilder55);
        int int58 = element49.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node60 = element49.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(stringBuilder51);
        org.junit.Assert.assertEquals(stringBuilder51.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder52);
        org.junit.Assert.assertEquals(stringBuilder52.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(stringBuilder55);
        org.junit.Assert.assertEquals(stringBuilder55.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder57);
        org.junit.Assert.assertEquals(stringBuilder57.toString(), "");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder5 = comment4.data;
        xmlTreeBuilder0.insert(comment4);
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Comment comment8 = new org.jsoup.parser.Token.Comment();
        comment8.bogus = true;
        boolean boolean11 = comment8.bogus;
        xmlTreeBuilder0.insert(comment8);
        org.jsoup.parser.Token.Doctype doctype13 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder14 = doctype13.name;
        boolean boolean15 = doctype13.forceQuirks;
        java.lang.String str16 = doctype13.getSystemIdentifier();
        java.lang.String str17 = doctype13.getName();
        org.jsoup.parser.Token.Doctype doctype18 = doctype13.asDoctype();
        java.lang.String str19 = doctype18.getName();
        boolean boolean20 = xmlTreeBuilder0.process((org.jsoup.parser.Token) doctype18);
        org.jsoup.nodes.Document document23 = xmlTreeBuilder0.parse("starttag", "<!DOCTYPE PUBLIC \"SYSTEM\" \"<!DOCTYPE PUBLIC \"hi!\" \"hi!\">\">");
        org.jsoup.parser.Token.Character character24 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(character24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(doctype18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(document23);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.getData();
        org.jsoup.parser.Token.Character character3 = character0.data("<!---->");
        java.lang.String str4 = character3.toString();
        java.lang.String str5 = character3.getData();
        java.lang.String str6 = character3.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        int int8 = node7.siblingIndex();
        java.lang.String str10 = node7.absUrl("4");
        java.lang.String str11 = node7.toString();
        org.jsoup.parser.Token.Doctype doctype12 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str13 = doctype12.getName();
        java.lang.String str14 = doctype12.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder15 = doctype12.systemIdentifier;
        java.lang.Appendable appendable16 = node7.html((java.lang.Appendable) stringBuilder15);
        java.lang.String str17 = node7.baseUri();
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str19 = startTag18.normalName;
        startTag18.newAttribute();
        java.lang.String str21 = startTag18.normalName();
        startTag18.appendAttributeName("");
        startTag18.normalName = "hi!";
        startTag18.appendTagName("PUBLIC");
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag29 = startTag28.reset();
        tag29.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str32 = startTag31.normalName;
        startTag31.newAttribute();
        java.lang.String str34 = startTag31.normalName();
        org.jsoup.parser.Token.StartTag startTag36 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag37 = startTag36.reset();
        tag37.finaliseTag();
        org.jsoup.nodes.DocumentType documentType43 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean45 = documentType43.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes46 = documentType43.attributes();
        tag37.attributes = attributes46;
        org.jsoup.parser.Token.StartTag startTag48 = startTag31.nameAttr("<!---->", attributes46);
        tag29.attributes = attributes46;
        char[] charArray51 = new char[] { 'a' };
        tag29.appendAttributeValue(charArray51);
        startTag18.appendAttributeValue(charArray51);
        boolean boolean54 = node7.equals((java.lang.Object) startTag18);
        java.lang.String str55 = node7.baseUri();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str6, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str11, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(appendable16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "SYSTEM" + "'", str17, "SYSTEM");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(attributes46);
        org.junit.Assert.assertNotNull(startTag48);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertArrayEquals(charArray51, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "SYSTEM" + "'", str55, "SYSTEM");
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        org.jsoup.parser.Token.Tag tag8 = startTag0.reset();
        org.jsoup.parser.Token token9 = tag8.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag10 = token9.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(token9);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str10 = startTag9.normalName;
        org.jsoup.nodes.Attributes attributes11 = startTag9.attributes;
        org.jsoup.parser.Token.StartTag startTag12 = startTag0.nameAttr("SYSTEM", attributes11);
        java.lang.String str13 = startTag0.toString();
        boolean boolean14 = startTag0.isDoctype();
        java.lang.String str15 = startTag0.toString();
        startTag0.normalName = "<<SYSTEM>>";
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag19 = startTag18.reset();
        boolean boolean20 = tag19.isEndTag();
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag22 = startTag21.reset();
        tag22.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str25 = startTag24.normalName;
        startTag24.newAttribute();
        java.lang.String str27 = startTag24.normalName();
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag30 = startTag29.reset();
        tag30.finaliseTag();
        org.jsoup.nodes.DocumentType documentType36 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean38 = documentType36.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes39 = documentType36.attributes();
        tag30.attributes = attributes39;
        org.jsoup.parser.Token.StartTag startTag41 = startTag24.nameAttr("<!---->", attributes39);
        tag22.attributes = attributes39;
        char[] charArray44 = new char[] { 'a' };
        tag22.appendAttributeValue(charArray44);
        tag19.appendAttributeValue(charArray44);
        org.jsoup.parser.Token.StartTag startTag47 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str48 = startTag47.normalName;
        startTag47.newAttribute();
        java.lang.String str50 = startTag47.normalName();
        startTag47.appendAttributeName("");
        startTag47.normalName = "hi!";
        startTag47.appendTagName("PUBLIC");
        org.jsoup.parser.Token.StartTag startTag57 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag58 = startTag57.reset();
        tag58.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag60 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str61 = startTag60.normalName;
        startTag60.newAttribute();
        java.lang.String str63 = startTag60.normalName();
        org.jsoup.parser.Token.StartTag startTag65 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag66 = startTag65.reset();
        tag66.finaliseTag();
        org.jsoup.nodes.DocumentType documentType72 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean74 = documentType72.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes75 = documentType72.attributes();
        tag66.attributes = attributes75;
        org.jsoup.parser.Token.StartTag startTag77 = startTag60.nameAttr("<!---->", attributes75);
        tag58.attributes = attributes75;
        char[] charArray80 = new char[] { 'a' };
        tag58.appendAttributeValue(charArray80);
        startTag47.appendAttributeValue(charArray80);
        tag19.appendAttributeValue(charArray80);
        startTag0.appendAttributeValue(charArray80);
        org.jsoup.nodes.Attributes attributes85 = startTag0.attributes;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<SYSTEM>" + "'", str13, "<SYSTEM>");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<SYSTEM>" + "'", str15, "<SYSTEM>");
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertNotNull(startTag41);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertArrayEquals(charArray44, new char[] { 'a' });
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(tag58);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(tag66);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(attributes75);
        org.junit.Assert.assertNotNull(startTag77);
        org.junit.Assert.assertNotNull(charArray80);
        org.junit.Assert.assertArrayEquals(charArray80, new char[] { 'a' });
        org.junit.Assert.assertNotNull(attributes85);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.Text;
        org.jsoup.parser.Token.Doctype doctype1 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder2 = doctype1.name;
        java.lang.StringBuilder stringBuilder3 = doctype1.systemIdentifier;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = null;
        boolean boolean5 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) doctype1, htmlTreeBuilder4);
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag6.reset();
        tag7.finaliseTag();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = null;
        boolean boolean10 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) tag7, htmlTreeBuilder9);
        tag7.appendAttributeName("<!doctype #doctype public \"4\" \"public\">");
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag14 = startTag13.reset();
        tag14.finaliseTag();
        org.jsoup.parser.Token.Tag tag16 = tag14.reset();
        tag16.appendTagName('#');
        char[] charArray20 = new char[] { 'a' };
        tag16.appendAttributeValue(charArray20);
        boolean boolean22 = tag16.isCharacter();
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag24 = startTag23.reset();
        tag24.finaliseTag();
        org.jsoup.parser.Token.Tag tag26 = tag24.reset();
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str28 = startTag27.normalName;
        startTag27.newAttribute();
        org.jsoup.parser.Token.Tag tag30 = startTag27.reset();
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag32 = startTag31.reset();
        tag32.finaliseTag();
        tag32.appendTagName('4');
        int[] intArray39 = new int[] { 0, ' ', '#' };
        tag32.appendAttributeValue(intArray39);
        startTag27.appendAttributeValue(intArray39);
        org.jsoup.parser.Token.StartTag startTag43 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag44 = startTag43.reset();
        tag44.finaliseTag();
        org.jsoup.parser.Token.Tag tag46 = tag44.reset();
        org.jsoup.nodes.Attributes attributes47 = tag46.attributes;
        org.jsoup.parser.Token.StartTag startTag48 = startTag27.nameAttr("<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">", attributes47);
        org.jsoup.parser.Token.Tag tag49 = startTag27.reset();
        org.jsoup.parser.Token.StartTag startTag50 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str51 = startTag50.normalName;
        startTag50.newAttribute();
        org.jsoup.parser.Token.Tag tag53 = startTag50.reset();
        org.jsoup.parser.Token.StartTag startTag54 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag55 = startTag54.reset();
        tag55.finaliseTag();
        tag55.appendTagName('4');
        int[] intArray62 = new int[] { 0, ' ', '#' };
        tag55.appendAttributeValue(intArray62);
        startTag50.appendAttributeValue(intArray62);
        startTag27.appendAttributeValue(intArray62);
        tag26.appendAttributeValue(intArray62);
        tag16.appendAttributeValue(intArray62);
        tag7.appendAttributeValue(intArray62);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 0, 32, 35 });
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertNotNull(attributes47);
        org.junit.Assert.assertNotNull(startTag48);
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(tag53);
        org.junit.Assert.assertNotNull(tag55);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertArrayEquals(intArray62, new int[] { 0, 32, 35 });
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder5 = comment4.data;
        xmlTreeBuilder0.insert(comment4);
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Comment comment8 = new org.jsoup.parser.Token.Comment();
        comment8.bogus = true;
        boolean boolean11 = comment8.bogus;
        xmlTreeBuilder0.insert(comment8);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.ParseSettings parseSettings17 = null;
        xmlTreeBuilder13.initialiseParse("#doctype", "hi!", parseErrorList16, parseSettings17);
        org.jsoup.parser.Token.Character character19 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder13.insert(character19);
        org.jsoup.parser.Token token21 = character19.reset();
        xmlTreeBuilder0.insert(character19);
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str24 = startTag23.normalName;
        startTag23.newAttribute();
        java.lang.String str26 = startTag23.normalName();
        startTag23.appendAttributeName("");
        startTag23.normalName = "hi!";
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str33 = startTag32.normalName;
        org.jsoup.nodes.Attributes attributes34 = startTag32.attributes;
        org.jsoup.parser.Token.StartTag startTag35 = startTag23.nameAttr("SYSTEM", attributes34);
        java.lang.String str36 = startTag23.toString();
        boolean boolean37 = startTag23.isDoctype();
        java.lang.String str38 = startTag23.toString();
        org.jsoup.nodes.Element element39 = xmlTreeBuilder0.insert(startTag23);
        java.lang.String str41 = element39.absUrl("<<!---->#doctype  name=\"\" publicId=\"hi!\" systemId=\"hi!\">");
        org.jsoup.nodes.Node node43 = element39.before("");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder44 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList47 = null;
        org.jsoup.parser.ParseSettings parseSettings48 = null;
        xmlTreeBuilder44.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList47, parseSettings48);
        org.jsoup.parser.ParseErrorList parseErrorList52 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder53 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList56 = null;
        org.jsoup.parser.ParseSettings parseSettings57 = null;
        xmlTreeBuilder53.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList56, parseSettings57);
        org.jsoup.parser.ParseErrorList parseErrorList61 = null;
        org.jsoup.parser.ParseSettings parseSettings62 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList63 = xmlTreeBuilder53.parseFragment("", "#doctype", parseErrorList61, parseSettings62);
        org.jsoup.parser.Token.Character character64 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder53.insert(character64);
        org.jsoup.parser.ParseErrorList parseErrorList68 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder69 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings70 = xmlTreeBuilder69.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList71 = xmlTreeBuilder53.parseFragment("SYSTEM", "PUBLIC", parseErrorList68, parseSettings70);
        xmlTreeBuilder44.initialiseParse("<SYSTEM>", "Doctype", parseErrorList52, parseSettings70);
        org.jsoup.nodes.DocumentType documentType77 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str78 = documentType77.nodeName();
        org.jsoup.parser.Token.Doctype doctype79 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str80 = doctype79.getName();
        boolean boolean81 = doctype79.forceQuirks;
        org.jsoup.parser.Token token82 = doctype79.reset();
        org.jsoup.parser.Token.TokenType tokenType83 = doctype79.type;
        boolean boolean84 = doctype79.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType85 = doctype79.type;
        boolean boolean86 = documentType77.hasSameValue((java.lang.Object) doctype79);
        xmlTreeBuilder44.insert(doctype79);
        java.lang.StringBuilder stringBuilder88 = doctype79.name;
        doctype79.forceQuirks = true;
        java.lang.StringBuilder stringBuilder91 = doctype79.name;
        org.jsoup.parser.Token.reset(stringBuilder91);
        org.jsoup.parser.Token.reset(stringBuilder91);
        java.lang.StringBuilder stringBuilder94 = node43.html(stringBuilder91);
        java.util.List<org.jsoup.nodes.Node> nodeList95 = node43.siblingNodes();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(token21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertNotNull(startTag35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<SYSTEM>" + "'", str36, "<SYSTEM>");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<SYSTEM>" + "'", str38, "<SYSTEM>");
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(nodeList63);
        org.junit.Assert.assertNotNull(parseSettings70);
        org.junit.Assert.assertNotNull(nodeList71);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "#doctype" + "'", str78, "#doctype");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(token82);
        org.junit.Assert.assertTrue("'" + tokenType83 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType83.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + tokenType85 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType85.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(stringBuilder88);
        org.junit.Assert.assertEquals(stringBuilder88.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder91);
        org.junit.Assert.assertEquals(stringBuilder91.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder94);
        org.junit.Assert.assertEquals(stringBuilder94.toString(), "");
        org.junit.Assert.assertNotNull(nodeList95);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("#doctype", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.Token.Character character6 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder0.insert(character6);
        org.jsoup.nodes.Document document10 = xmlTreeBuilder0.parse("EOF", "<SYSTEM>");
        org.jsoup.parser.Token.Comment comment11 = new org.jsoup.parser.Token.Comment();
        comment11.bogus = false;
        java.lang.StringBuilder stringBuilder14 = comment11.data;
        boolean boolean15 = comment11.isEOF();
        boolean boolean16 = comment11.bogus;
        java.lang.String str17 = comment11.toString();
        xmlTreeBuilder0.insert(comment11);
        org.jsoup.parser.Token.Comment comment19 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(comment19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!---->" + "'", str17, "<!---->");
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "#doctype", parseErrorList8, parseSettings9);
        org.jsoup.parser.Token.Comment comment11 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder12 = comment11.data;
        java.lang.String str13 = comment11.toString();
        org.jsoup.parser.Token token14 = comment11.reset();
        boolean boolean15 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment11);
        boolean boolean16 = comment11.isEOF();
        java.lang.String str17 = comment11.toString();
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!---->" + "'", str17, "<!---->");
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.nodes.DocumentType documentType7 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean9 = documentType7.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes10 = documentType7.attributes();
        tag1.attributes = attributes10;
        tag1.appendTagName("#doctype");
        tag1.newAttribute();
        tag1.appendTagName("#doctype");
        tag1.tagName = "<!---->";
        tag1.appendAttributeValue(' ');
        org.jsoup.nodes.Attributes attributes21 = tag1.attributes;
        org.jsoup.parser.Token.StartTag startTag22 = tag1.asStartTag();
        org.jsoup.nodes.Attributes attributes23 = tag1.attributes;
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(startTag22);
        org.junit.Assert.assertNotNull(attributes23);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.String str3 = comment0.toString();
        boolean boolean4 = comment0.isCharacter();
        java.lang.String str5 = comment0.getData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<!---->" + "'", str3, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        java.lang.String str8 = startTag0.tagName;
        startTag0.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag10 = startTag0.reset();
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag12 = startTag11.reset();
        tag12.finaliseTag();
        tag12.appendTagName('4');
        java.lang.String str16 = tag12.name();
        java.lang.String str17 = tag12.normalName;
        tag12.appendAttributeValue("hi!");
        org.jsoup.nodes.Attributes attributes20 = tag12.getAttributes();
        tag10.attributes = attributes20;
        org.jsoup.nodes.Attributes attributes22 = tag10.attributes;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "4" + "'", str16, "4");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4" + "'", str17, "4");
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(attributes22);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.Token.Character character6 = new org.jsoup.parser.Token.Character();
        java.lang.String str7 = character6.getData();
        org.jsoup.parser.Token.Character character9 = character6.data("<!---->");
        java.lang.String str10 = character9.getData();
        xmlTreeBuilder0.insert(character9);
        org.jsoup.parser.Token.Character character12 = new org.jsoup.parser.Token.Character();
        java.lang.String str13 = character12.getData();
        org.jsoup.parser.Token.Character character15 = character12.data("<!---->");
        java.lang.String str16 = character15.toString();
        boolean boolean17 = character15.isEndTag();
        boolean boolean18 = character15.isEOF();
        xmlTreeBuilder0.insert(character15);
        org.jsoup.parser.Token.Doctype doctype20 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str21 = doctype20.getName();
        boolean boolean22 = doctype20.forceQuirks;
        java.lang.String str23 = doctype20.getSystemIdentifier();
        boolean boolean24 = doctype20.isStartTag();
        java.lang.StringBuilder stringBuilder25 = doctype20.name;
        org.jsoup.parser.Token token26 = doctype20.reset();
        java.lang.String str27 = doctype20.getPublicIdentifier();
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(character9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!---->" + "'", str10, "<!---->");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(character15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!---->" + "'", str16, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "");
        org.junit.Assert.assertNotNull(token26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        java.lang.String str4 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        boolean boolean6 = startTag0.isDoctype();
        startTag0.appendTagName("Doctype");
        org.jsoup.parser.Token.Tag tag10 = startTag0.name("<!DOCTYPE PUBLIC>");
        org.jsoup.parser.Token.Tag tag11 = startTag0.reset();
        tag11.newAttribute();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tag11);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "#doctype", parseErrorList8, parseSettings9);
        org.jsoup.parser.Token.Comment comment11 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder12 = comment11.data;
        java.lang.String str13 = comment11.toString();
        org.jsoup.parser.Token token14 = comment11.reset();
        boolean boolean15 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment11);
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings17 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Character character18 = new org.jsoup.parser.Token.Character();
        java.lang.String str19 = character18.getData();
        org.jsoup.parser.Token.Character character21 = character18.data("<!---->");
        xmlTreeBuilder0.insert(character21);
        boolean boolean23 = character21.isComment();
        org.jsoup.parser.Token token24 = character21.reset();
        org.jsoup.parser.Token.TokenType tokenType25 = character21.type;
        java.lang.String str26 = character21.toString();
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(character21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(token24);
        org.junit.Assert.assertTrue("'" + tokenType25 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType25.equals(org.jsoup.parser.Token.TokenType.Character));
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        org.jsoup.parser.Token.Comment comment4 = comment0.asComment();
        boolean boolean5 = comment0.isEOF();
        org.jsoup.parser.Token token6 = comment0.reset();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(comment4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(token6);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        boolean boolean7 = documentType4.hasAttr("");
        java.lang.String str8 = documentType4.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.childNodes();
        documentType4.setBaseUri("<system>");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodes();
        java.lang.String str13 = documentType4.outerHtml();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#doctype" + "'", str8, "#doctype");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str13, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        java.lang.String str2 = comment0.toString();
        boolean boolean3 = comment0.isDoctype();
        boolean boolean4 = comment0.isCharacter();
        comment0.bogus = false;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        boolean boolean1 = eOF0.isDoctype();
        org.jsoup.parser.Token token2 = eOF0.reset();
        org.jsoup.parser.Token token3 = eOF0.reset();
        boolean boolean4 = eOF0.isDoctype();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(token2);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        org.jsoup.nodes.Attributes attributes2 = startTag0.attributes;
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        boolean boolean4 = startTag0.isEndTag();
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag6 = startTag5.reset();
        tag6.finaliseTag();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean14 = documentType12.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes15 = documentType12.attributes();
        tag6.attributes = attributes15;
        java.lang.String str17 = tag6.tagName;
        tag6.appendAttributeValue('4');
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag21 = startTag20.reset();
        tag21.finaliseTag();
        tag21.appendTagName('4');
        org.jsoup.nodes.Attributes attributes25 = tag21.getAttributes();
        tag6.attributes = attributes25;
        tag6.normalName = "<!---->";
        int[] intArray32 = new int[] { (byte) 1, (byte) 1, (short) 0 };
        tag6.appendAttributeValue(intArray32);
        org.jsoup.parser.Token.StartTag startTag34 = tag6.asStartTag();
        startTag34.appendAttributeName("Doctype");
        org.jsoup.parser.Token.Tag tag38 = startTag34.name("#");
        org.jsoup.parser.Token.TokenType tokenType39 = tag38.type;
        startTag0.type = tokenType39;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 1, 1, 0 });
        org.junit.Assert.assertNotNull(startTag34);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertTrue("'" + tokenType39 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType39.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean9 = documentType4.equals(obj8);
        java.lang.String str10 = documentType4.toString();
        java.lang.String str11 = documentType4.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodes();
        org.jsoup.nodes.Node node13 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node13.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str10, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str11, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        org.jsoup.parser.Token.EOF eOF0 = new org.jsoup.parser.Token.EOF();
        boolean boolean1 = eOF0.isDoctype();
        boolean boolean2 = eOF0.isEOF();
        org.jsoup.parser.Token token3 = eOF0.reset();
        org.jsoup.parser.Token token4 = eOF0.reset();
        org.jsoup.parser.Token token5 = eOF0.reset();
        org.jsoup.parser.Token token6 = eOF0.reset();
        boolean boolean7 = eOF0.isCharacter();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.toString();
        java.lang.String str2 = character0.getData();
        org.jsoup.parser.Token.Character character4 = character0.data("SYSTEM");
        java.lang.String str5 = character0.toString();
        org.jsoup.parser.Token.Character character7 = character0.data("4");
        java.lang.String str8 = character0.getData();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SYSTEM" + "'", str5, "SYSTEM");
        org.junit.Assert.assertNotNull(character7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4" + "'", str8, "4");
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        org.jsoup.parser.Token.Tag tag8 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag10 = tag8.name("Doctype");
        java.lang.String str11 = tag10.tokenType();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str13 = startTag12.normalName;
        startTag12.newAttribute();
        java.lang.String str15 = startTag12.normalName();
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag18 = startTag17.reset();
        tag18.finaliseTag();
        org.jsoup.nodes.DocumentType documentType24 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean26 = documentType24.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes27 = documentType24.attributes();
        tag18.attributes = attributes27;
        org.jsoup.parser.Token.StartTag startTag29 = startTag12.nameAttr("<!---->", attributes27);
        startTag12.appendAttributeName("SYSTEM");
        boolean boolean32 = startTag12.isDoctype();
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str34 = startTag33.normalName;
        startTag33.newAttribute();
        org.jsoup.parser.Token.Tag tag36 = startTag33.reset();
        org.jsoup.parser.Token.StartTag startTag37 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag38 = startTag37.reset();
        tag38.finaliseTag();
        tag38.appendTagName('4');
        int[] intArray45 = new int[] { 0, ' ', '#' };
        tag38.appendAttributeValue(intArray45);
        startTag33.appendAttributeValue(intArray45);
        startTag12.appendAttributeValue(intArray45);
        tag10.appendAttributeValue(intArray45);
        java.lang.String str50 = tag10.tokenType();
        org.jsoup.nodes.Attributes attributes51 = tag10.getAttributes();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "StartTag" + "'", str11, "StartTag");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(startTag29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] { 0, 32, 35 });
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "StartTag" + "'", str50, "StartTag");
        org.junit.Assert.assertNotNull(attributes51);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str4 = startTag3.normalName;
        startTag3.newAttribute();
        java.lang.String str6 = startTag3.normalName();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag9 = startTag8.reset();
        tag9.finaliseTag();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean17 = documentType15.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes18 = documentType15.attributes();
        tag9.attributes = attributes18;
        org.jsoup.parser.Token.StartTag startTag20 = startTag3.nameAttr("<!---->", attributes18);
        tag1.attributes = attributes18;
        char[] charArray23 = new char[] { 'a' };
        tag1.appendAttributeValue(charArray23);
        tag1.appendAttributeValue('a');
        org.jsoup.parser.Token token27 = tag1.reset();
        tag1.selfClosing = false;
        tag1.appendAttributeValue("<!---->4");
        org.jsoup.nodes.Attributes attributes32 = tag1.attributes;
        org.jsoup.parser.Token.Tag tag33 = tag1.reset();
        tag1.appendTagName("<!---->");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(startTag20);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { 'a' });
        org.junit.Assert.assertNotNull(token27);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertNotNull(tag33);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("#doctype", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.nodes.Document document8 = xmlTreeBuilder0.parse("<<!DOCTYPE #doctype PUBLIC \"4\" \"PUBLIC\">  name=\"\" publicId=\"hi!\" systemId=\"hi!\">", "<a>");
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag10 = startTag9.reset();
        tag10.finaliseTag();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean18 = documentType16.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes19 = documentType16.attributes();
        tag10.attributes = attributes19;
        java.lang.String str21 = tag10.tagName;
        tag10.appendAttributeValue('4');
        org.jsoup.parser.Token.StartTag startTag24 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag25 = startTag24.reset();
        tag25.finaliseTag();
        tag25.appendTagName('4');
        org.jsoup.nodes.Attributes attributes29 = tag25.getAttributes();
        tag10.attributes = attributes29;
        org.jsoup.parser.Token.TokenType tokenType31 = tag10.type;
        org.jsoup.parser.Token token32 = tag10.reset();
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str34 = startTag33.normalName;
        startTag33.newAttribute();
        java.lang.String str36 = startTag33.normalName();
        startTag33.appendAttributeName("");
        startTag33.normalName = "hi!";
        java.lang.String str41 = startTag33.tagName;
        org.jsoup.nodes.Attributes attributes42 = startTag33.attributes;
        tag10.attributes = attributes42;
        tag10.appendAttributeValue("<Doctype>");
        org.jsoup.parser.Token.StartTag startTag46 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag47 = startTag46.reset();
        tag47.finaliseTag();
        org.jsoup.nodes.DocumentType documentType53 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean55 = documentType53.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes56 = documentType53.attributes();
        tag47.attributes = attributes56;
        java.lang.String str58 = tag47.tagName;
        tag47.appendAttributeValue('4');
        org.jsoup.parser.Token.StartTag startTag61 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag62 = startTag61.reset();
        tag62.finaliseTag();
        tag62.appendTagName('4');
        org.jsoup.nodes.Attributes attributes66 = tag62.getAttributes();
        tag47.attributes = attributes66;
        org.jsoup.parser.Token.TokenType tokenType68 = tag47.type;
        org.jsoup.parser.Token.StartTag startTag69 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str70 = startTag69.normalName;
        startTag69.newAttribute();
        java.lang.String str72 = startTag69.normalName();
        java.lang.String str73 = startTag69.normalName();
        org.jsoup.parser.Token.StartTag startTag75 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str76 = startTag75.normalName;
        startTag75.newAttribute();
        java.lang.String str78 = startTag75.normalName();
        startTag75.appendAttributeName("");
        startTag75.normalName = "hi!";
        org.jsoup.parser.Token.StartTag startTag84 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str85 = startTag84.normalName;
        org.jsoup.nodes.Attributes attributes86 = startTag84.attributes;
        org.jsoup.parser.Token.StartTag startTag87 = startTag75.nameAttr("SYSTEM", attributes86);
        org.jsoup.parser.Token.StartTag startTag88 = startTag69.nameAttr("PUBLIC", attributes86);
        tag47.attributes = attributes86;
        tag10.attributes = attributes86;
        boolean boolean91 = document8.equals((java.lang.Object) tag10);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertTrue("'" + tokenType31 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType31.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(token32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(attributes56);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(tag62);
        org.junit.Assert.assertNotNull(attributes66);
        org.junit.Assert.assertTrue("'" + tokenType68 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType68.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertNull(str85);
        org.junit.Assert.assertNotNull(attributes86);
        org.junit.Assert.assertNotNull(startTag87);
        org.junit.Assert.assertNotNull(startTag88);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        java.lang.String str7 = documentType4.baseUri();
        java.lang.String str9 = documentType4.attr("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node10 = documentType4.parent();
        java.lang.String str11 = documentType4.nodeName();
        java.lang.String str13 = documentType4.absUrl("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node14 = documentType4.previousSibling();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SYSTEM" + "'", str7, "SYSTEM");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!doctype #doctype public \"4\" \"public\">", "<4>", "EOF", "4public");
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        java.lang.String str8 = startTag0.tagName;
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean15 = documentType13.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes16 = documentType13.attributes();
        startTag0.attributes = attributes16;
        boolean boolean18 = startTag0.isDoctype();
        startTag0.tagName = "<SYSTEM>";
        startTag0.selfClosing = false;
        boolean boolean23 = startTag0.isComment();
        java.lang.String str24 = startTag0.normalName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.toString();
        boolean boolean2 = character0.isEndTag();
        boolean boolean3 = character0.isStartTag();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "", "", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str5 = documentType4.baseUri();
        org.jsoup.nodes.Node node6 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes7 = node6.attributes();
        // The following exception was thrown during execution in test generation
        try {
            node6.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str5, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        org.jsoup.nodes.Attributes attributes4 = document3.attributes();
        org.jsoup.nodes.Document document5 = document3.ownerDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = org.jsoup.parser.HtmlTreeBuilderState.InSelect;
        boolean boolean7 = document5.hasSameValue((java.lang.Object) htmlTreeBuilderState6);
        boolean boolean9 = document5.hasAttr("StartTag");
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int15 = documentType14.siblingIndex();
        java.lang.String str16 = documentType14.toString();
        org.jsoup.nodes.Node node17 = documentType14.clone();
        int int18 = node17.siblingIndex();
        java.lang.String str20 = node17.absUrl("4");
        java.lang.String str21 = node17.toString();
        org.jsoup.parser.Token.Doctype doctype22 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str23 = doctype22.getName();
        java.lang.String str24 = doctype22.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder25 = doctype22.systemIdentifier;
        java.lang.Appendable appendable26 = node17.html((java.lang.Appendable) stringBuilder25);
        int int27 = node17.childNodeSize();
        java.lang.String str28 = node17.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            document5.replaceWith(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str16, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str21, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(appendable26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str28, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        org.jsoup.parser.Token.Tag tag8 = startTag0.reset();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag10.reset();
        org.jsoup.parser.Token.Tag tag12 = startTag10.reset();
        org.jsoup.nodes.Attributes attributes13 = startTag10.getAttributes();
        org.jsoup.parser.Token.StartTag startTag14 = startTag0.nameAttr("Doctype", attributes13);
        boolean boolean15 = startTag14.isStartTag();
        boolean boolean16 = startTag14.isSelfClosing();
        startTag14.finaliseTag();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("SYSTEM", "SYSTEM", "#doctype", "SYSTEM");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("PUBLIC");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = org.jsoup.parser.HtmlTreeBuilderState.ForeignContent;
        boolean boolean8 = documentType4.hasSameValue((java.lang.Object) htmlTreeBuilderState7);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str10 = startTag9.normalName;
        startTag9.newAttribute();
        java.lang.String str12 = startTag9.normalName();
        java.lang.String str13 = startTag9.normalName();
        org.jsoup.parser.Token.Tag tag14 = startTag9.reset();
        org.jsoup.parser.Token.Tag tag15 = startTag9.reset();
        startTag9.tagName = "<!---->";
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder18 = null;
        boolean boolean19 = htmlTreeBuilderState7.process((org.jsoup.parser.Token) startTag9, htmlTreeBuilder18);
        org.jsoup.parser.Token.Doctype doctype20 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str21 = doctype20.getName();
        boolean boolean22 = doctype20.forceQuirks;
        org.jsoup.parser.Token token23 = doctype20.reset();
        org.jsoup.parser.Token.TokenType tokenType24 = doctype20.type;
        boolean boolean25 = doctype20.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType26 = doctype20.type;
        java.lang.String str27 = doctype20.getPublicIdentifier();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder28 = null;
        boolean boolean29 = htmlTreeBuilderState7.process((org.jsoup.parser.Token) doctype20, htmlTreeBuilder28);
        doctype20.forceQuirks = true;
        boolean boolean32 = doctype20.forceQuirks;
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(token23);
        org.junit.Assert.assertTrue("'" + tokenType24 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType24.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + tokenType26 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType26.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "SYSTEM", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("<SYSTEM>", "Doctype");
        org.jsoup.nodes.Node node8 = node7.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node8.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            node8.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        xmlTreeBuilder9.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlTreeBuilder9.parseFragment("", "#doctype", parseErrorList17, parseSettings18);
        org.jsoup.parser.Token.Character character20 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder9.insert(character20);
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder25 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings26 = xmlTreeBuilder25.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder9.parseFragment("SYSTEM", "PUBLIC", parseErrorList24, parseSettings26);
        xmlTreeBuilder0.initialiseParse("<SYSTEM>", "Doctype", parseErrorList8, parseSettings26);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.ParseSettings parseSettings33 = null;
        xmlTreeBuilder29.initialiseParse("#doctype", "hi!", parseErrorList32, parseSettings33);
        org.jsoup.parser.Token.Character character35 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder29.insert(character35);
        java.lang.String str37 = character35.getData();
        xmlTreeBuilder0.insert(character35);
        org.jsoup.parser.Token.Comment comment39 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder40 = comment39.data;
        java.lang.String str41 = comment39.toString();
        org.jsoup.parser.Token token42 = comment39.reset();
        org.jsoup.parser.Token token43 = comment39.reset();
        java.lang.String str44 = comment39.toString();
        org.jsoup.parser.Token.Comment comment45 = comment39.asComment();
        xmlTreeBuilder0.insert(comment39);
        org.jsoup.parser.ParseErrorList parseErrorList49 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder50 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document53 = xmlTreeBuilder50.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment54 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder55 = comment54.data;
        xmlTreeBuilder50.insert(comment54);
        org.jsoup.parser.ParseSettings parseSettings57 = xmlTreeBuilder50.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList58 = xmlTreeBuilder0.parseFragment("", "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">", parseErrorList49, parseSettings57);
        org.jsoup.parser.ParseSettings parseSettings59 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document62 = xmlTreeBuilder0.parse("StartTag", "Character");
        org.jsoup.parser.Token.Doctype doctype63 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str64 = doctype63.getName();
        org.jsoup.parser.Token.TokenType tokenType65 = doctype63.type;
        org.jsoup.parser.Token token66 = doctype63.reset();
        java.lang.StringBuilder stringBuilder67 = doctype63.name;
        xmlTreeBuilder0.insert(doctype63);
        boolean boolean69 = doctype63.forceQuirks;
        doctype63.forceQuirks = false;
        java.lang.String str72 = doctype63.getPublicIdentifier();
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(parseSettings26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(stringBuilder40);
        org.junit.Assert.assertEquals(stringBuilder40.toString(), "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "<!---->" + "'", str41, "<!---->");
        org.junit.Assert.assertNotNull(token42);
        org.junit.Assert.assertNotNull(token43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "<!---->" + "'", str44, "<!---->");
        org.junit.Assert.assertNotNull(comment45);
        org.junit.Assert.assertNotNull(document53);
        org.junit.Assert.assertNotNull(stringBuilder55);
        org.junit.Assert.assertEquals(stringBuilder55.toString(), "");
        org.junit.Assert.assertNotNull(parseSettings57);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertNotNull(parseSettings59);
        org.junit.Assert.assertNotNull(document62);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + tokenType65 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType65.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(token66);
        org.junit.Assert.assertNotNull(stringBuilder67);
        org.junit.Assert.assertEquals(stringBuilder67.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("PUBLIC", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "StartTag", "#doctype");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node6 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = node6.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        xmlTreeBuilder9.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlTreeBuilder9.parseFragment("", "#doctype", parseErrorList17, parseSettings18);
        org.jsoup.parser.Token.Character character20 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder9.insert(character20);
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder25 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings26 = xmlTreeBuilder25.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder9.parseFragment("SYSTEM", "PUBLIC", parseErrorList24, parseSettings26);
        xmlTreeBuilder0.initialiseParse("<SYSTEM>", "Doctype", parseErrorList8, parseSettings26);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.ParseSettings parseSettings33 = null;
        xmlTreeBuilder29.initialiseParse("#doctype", "hi!", parseErrorList32, parseSettings33);
        org.jsoup.parser.Token.Character character35 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder29.insert(character35);
        java.lang.String str37 = character35.getData();
        xmlTreeBuilder0.insert(character35);
        org.jsoup.nodes.Document document41 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.nodes.Node node42 = document41.clone();
        java.lang.String str43 = document41.outerHtml();
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(parseSettings26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.DoctypeSystemIdentifier_singleQuoted;
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
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        java.lang.String str2 = comment0.toString();
        org.jsoup.parser.Token token3 = comment0.reset();
        org.jsoup.parser.Token token4 = comment0.reset();
        java.lang.String str5 = comment0.toString();
        org.jsoup.parser.Token token6 = comment0.reset();
        java.lang.String str7 = comment0.getData();
        org.jsoup.parser.Token token8 = comment0.reset();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(token8);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag2 = startTag0.reset();
        org.jsoup.nodes.DocumentType documentType8 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str9 = documentType8.nodeName();
        org.jsoup.nodes.Attributes attributes10 = documentType8.attributes();
        org.jsoup.parser.Token.StartTag startTag11 = startTag0.nameAttr("", attributes10);
        startTag0.normalName = "<Doctype>";
        startTag0.appendAttributeName(' ');
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(startTag11);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        java.lang.String str8 = startTag0.tagName;
        startTag0.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag10 = startTag0.reset();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document15 = xmlTreeBuilder12.parse("SYSTEM", "#doctype");
        org.jsoup.nodes.Attributes attributes16 = document15.attributes();
        org.jsoup.nodes.Document document17 = document15.ownerDocument();
        org.jsoup.nodes.Attributes attributes18 = document15.attributes();
        org.jsoup.parser.Token.StartTag startTag19 = startTag0.nameAttr("<4>", attributes18);
        java.lang.String str20 = startTag0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(startTag19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<<4>>" + "'", str20, "<<4>>");
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        org.jsoup.nodes.Attributes attributes2 = startTag0.attributes;
        org.jsoup.parser.Token.Tag tag3 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        startTag0.tagName = "<!DOCTYPE #doctype PUBLIC \"4\" \"PUBLIC\">";
        startTag0.newAttribute();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(tag4);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "#doctype", parseErrorList8, parseSettings9);
        org.jsoup.parser.Token.Comment comment11 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder12 = comment11.data;
        java.lang.String str13 = comment11.toString();
        org.jsoup.parser.Token token14 = comment11.reset();
        boolean boolean15 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment11);
        java.lang.String str16 = comment11.toString();
        java.lang.String str17 = comment11.getData();
        java.lang.String str18 = comment11.tokenType();
        java.lang.StringBuilder stringBuilder19 = comment11.data;
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!---->" + "'", str16, "<!---->");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Comment" + "'", str18, "Comment");
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.String str3 = doctype0.getSystemIdentifier();
        boolean boolean4 = doctype0.isComment();
        java.lang.StringBuilder stringBuilder5 = doctype0.systemIdentifier;
        java.lang.String str6 = doctype0.getName();
        boolean boolean7 = doctype0.forceQuirks;
        boolean boolean8 = doctype0.isStartTag();
        org.jsoup.parser.Token token9 = doctype0.reset();
        java.lang.StringBuilder stringBuilder10 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder11 = doctype0.name;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasSameValue((java.lang.Object) (short) -1);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.siblingNodes();
        boolean boolean9 = documentType4.equals((java.lang.Object) 0L);
        org.jsoup.nodes.Node node10 = documentType4.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.siblingNodes();
        documentType4.setBaseUri("4");
        java.lang.String str14 = documentType4.baseUri();
        boolean boolean16 = documentType4.hasAttr("<!DOCTYPE #doctype PUBLIC \"4\" \"PUBLIC\">");
        org.jsoup.nodes.Node node17 = documentType4.previousSibling();
        java.lang.String str18 = documentType4.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4" + "'", str14, "4");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str18, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("#doctype", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.nodes.Document document8 = xmlTreeBuilder0.parse("<<!DOCTYPE #doctype PUBLIC \"4\" \"PUBLIC\">  name=\"\" publicId=\"hi!\" systemId=\"hi!\">", "<a>");
        org.jsoup.nodes.Document document11 = xmlTreeBuilder0.parse("<!doctype #doctype public \"4\" \"public\">", "<SYSTEM></SYSTEM>");
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(document11);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.String str7 = documentType4.nodeName();
        boolean boolean9 = documentType4.hasAttr("EOF");
        org.jsoup.nodes.Node node11 = documentType4.wrap("<!DOCTYPE PUBLIC>");
        org.jsoup.nodes.Node node14 = documentType4.attr("<SYSTEM></SYSTEM>", "<!DOCTYPE PUBLIC>");
        org.jsoup.nodes.Node node17 = documentType4.attr("<!DOCTYPE Comment PUBLIC \"<!DOCTYPE PUBLIC>\" \"<<!---->#doctype  name=\"\" publicId=\"hi!\" systemId=\"hi!\">\">", "Comment");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">");
        org.jsoup.parser.TokeniserState tokeniserState14 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapedLessthanSign;
        boolean boolean15 = document13.equals((java.lang.Object) tokeniserState14);
        java.util.List<org.jsoup.nodes.Node> nodeList16 = document13.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = document13.siblingNodes();
        java.lang.String str18 = document13.outerHtml();
        java.lang.String str19 = document13.baseUri();
        document13.setBaseUri("<<!DOCTYPE #doctype PUBLIC \"4\" \"PUBLIC\">  name=\"\" publicId=\"hi!\" systemId=\"hi!\">");
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!DOCTYPE PUBLIC>" + "'", str18, "<!DOCTYPE PUBLIC>");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">" + "'", str19, "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">");
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("SYSTEM", "SYSTEM", "#doctype", "SYSTEM");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("PUBLIC");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = org.jsoup.parser.HtmlTreeBuilderState.ForeignContent;
        boolean boolean8 = documentType4.hasSameValue((java.lang.Object) htmlTreeBuilderState7);
        java.lang.String str10 = documentType4.absUrl("SYSTEM");
        org.jsoup.parser.Token.Comment comment11 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder12 = comment11.data;
        java.lang.Appendable appendable13 = documentType4.html((java.lang.Appendable) stringBuilder12);
        java.util.List<org.jsoup.nodes.Node> nodeList14 = documentType4.childNodes();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("", "SYSTEM", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "");
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">");
        org.junit.Assert.assertNotNull(appendable13);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        java.lang.String str9 = documentType4.nodeName();
        java.lang.String str11 = documentType4.attr("#doctype");
        java.lang.String str12 = documentType4.nodeName();
        java.lang.String str14 = documentType4.absUrl("<!doctype #doctype public \"4\" \"public\">");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = documentType4.childNodes();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node8 = documentType4.attr("hi!", "hi!");
        int int9 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node10 = documentType4.parent();
        org.jsoup.parser.Token.Doctype doctype11 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str12 = doctype11.getName();
        boolean boolean13 = doctype11.forceQuirks;
        org.jsoup.parser.Token token14 = doctype11.reset();
        org.jsoup.parser.Token.TokenType tokenType15 = doctype11.type;
        boolean boolean16 = doctype11.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType17 = doctype11.type;
        java.lang.String str18 = doctype11.getSystemIdentifier();
        boolean boolean19 = doctype11.forceQuirks;
        boolean boolean20 = doctype11.isStartTag();
        org.jsoup.parser.Token token21 = doctype11.reset();
        boolean boolean22 = documentType4.hasSameValue((java.lang.Object) token21);
        org.jsoup.nodes.Node node25 = documentType4.attr("<!doctype #doctype public \"4\" \"public\">", "<<!doctype system public \"system\" \"#doctype\">  name=\"\" publicId=\"hi!\" systemId=\"hi!\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + tokenType17 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType17.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(token21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "#doctype", parseErrorList8, parseSettings9);
        org.jsoup.parser.Token.Comment comment11 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder12 = comment11.data;
        java.lang.String str13 = comment11.toString();
        org.jsoup.parser.Token token14 = comment11.reset();
        boolean boolean15 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment11);
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document19 = xmlTreeBuilder0.parse("4", "PUBLIC");
        org.jsoup.nodes.Node node21 = document19.wrap("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList22 = node21.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        boolean boolean7 = documentType4.hasAttr("");
        org.jsoup.nodes.Node node8 = documentType4.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node10 = documentType4.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node10.childNode(2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isComment();
        org.jsoup.parser.Token.Doctype doctype4 = doctype0.asDoctype();
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        boolean boolean6 = doctype0.forceQuirks;
        org.jsoup.parser.Token token7 = doctype0.reset();
        boolean boolean8 = doctype0.isComment();
        java.lang.String str9 = doctype0.getName();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(doctype4);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag2 = startTag0.reset();
        org.jsoup.parser.Token.StartTag startTag3 = tag2.asStartTag();
        java.lang.String str4 = startTag3.tagName;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = startTag3.name();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder5 = comment4.data;
        xmlTreeBuilder0.insert(comment4);
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str8 = startTag7.normalName;
        startTag7.newAttribute();
        java.lang.String str10 = startTag7.normalName();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag13 = startTag12.reset();
        tag13.finaliseTag();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean21 = documentType19.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes22 = documentType19.attributes();
        tag13.attributes = attributes22;
        org.jsoup.parser.Token.StartTag startTag24 = startTag7.nameAttr("<!---->", attributes22);
        java.lang.String str25 = startTag24.name();
        boolean boolean26 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag24);
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str28 = startTag27.normalName;
        startTag27.newAttribute();
        java.lang.String str30 = startTag27.normalName();
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag33 = startTag32.reset();
        tag33.finaliseTag();
        org.jsoup.nodes.DocumentType documentType39 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean41 = documentType39.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes42 = documentType39.attributes();
        tag33.attributes = attributes42;
        org.jsoup.parser.Token.StartTag startTag44 = startTag27.nameAttr("<!---->", attributes42);
        boolean boolean45 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag44);
        org.jsoup.parser.Token.Character character46 = new org.jsoup.parser.Token.Character();
        java.lang.String str47 = character46.toString();
        org.jsoup.parser.Token token48 = character46.reset();
        xmlTreeBuilder0.insert(character46);
        org.jsoup.nodes.Document document52 = xmlTreeBuilder0.parse("4a", "<!---->4");
        org.jsoup.parser.Token.Character character53 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(character53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(startTag24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!---->" + "'", str25, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertNotNull(startTag44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(token48);
        org.junit.Assert.assertNotNull(document52);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.Token.Comment comment6 = new org.jsoup.parser.Token.Comment();
        comment6.bogus = false;
        java.lang.StringBuilder stringBuilder9 = comment6.data;
        java.lang.String str10 = comment6.toString();
        xmlTreeBuilder0.insert(comment6);
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document18 = xmlTreeBuilder15.parse("SYSTEM", "#doctype");
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        xmlTreeBuilder22.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList25, parseSettings26);
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.ParseSettings parseSettings31 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList32 = xmlTreeBuilder22.parseFragment("", "#doctype", parseErrorList30, parseSettings31);
        org.jsoup.parser.Token.Character character33 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder22.insert(character33);
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder38 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings39 = xmlTreeBuilder38.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList40 = xmlTreeBuilder22.parseFragment("SYSTEM", "PUBLIC", parseErrorList37, parseSettings39);
        xmlTreeBuilder15.initialiseParse("#doctype", "PUBLIC", parseErrorList21, parseSettings39);
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", parseErrorList14, parseSettings39);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder43 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        org.jsoup.parser.ParseSettings parseSettings47 = null;
        xmlTreeBuilder43.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList46, parseSettings47);
        org.jsoup.parser.ParseErrorList parseErrorList51 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder52 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList55 = null;
        org.jsoup.parser.ParseSettings parseSettings56 = null;
        xmlTreeBuilder52.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList55, parseSettings56);
        org.jsoup.parser.ParseErrorList parseErrorList60 = null;
        org.jsoup.parser.ParseSettings parseSettings61 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList62 = xmlTreeBuilder52.parseFragment("", "#doctype", parseErrorList60, parseSettings61);
        org.jsoup.parser.Token.Character character63 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder52.insert(character63);
        org.jsoup.parser.ParseErrorList parseErrorList67 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder68 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings69 = xmlTreeBuilder68.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList70 = xmlTreeBuilder52.parseFragment("SYSTEM", "PUBLIC", parseErrorList67, parseSettings69);
        xmlTreeBuilder43.initialiseParse("<SYSTEM>", "Doctype", parseErrorList51, parseSettings69);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder72 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList75 = null;
        org.jsoup.parser.ParseSettings parseSettings76 = null;
        xmlTreeBuilder72.initialiseParse("#doctype", "hi!", parseErrorList75, parseSettings76);
        org.jsoup.parser.Token.Character character78 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder72.insert(character78);
        java.lang.String str80 = character78.getData();
        xmlTreeBuilder43.insert(character78);
        org.jsoup.parser.Token.Comment comment82 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder83 = comment82.data;
        java.lang.String str84 = comment82.toString();
        org.jsoup.parser.Token token85 = comment82.reset();
        org.jsoup.parser.Token token86 = comment82.reset();
        java.lang.String str87 = comment82.toString();
        org.jsoup.parser.Token.Comment comment88 = comment82.asComment();
        xmlTreeBuilder43.insert(comment82);
        org.jsoup.parser.Token token90 = comment82.reset();
        xmlTreeBuilder0.insert(comment82);
        java.lang.String str92 = comment82.getData();
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!---->" + "'", str10, "<!---->");
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(parseSettings39);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertNotNull(nodeList62);
        org.junit.Assert.assertNotNull(parseSettings69);
        org.junit.Assert.assertNotNull(nodeList70);
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertNotNull(stringBuilder83);
        org.junit.Assert.assertEquals(stringBuilder83.toString(), "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "<!---->" + "'", str84, "<!---->");
        org.junit.Assert.assertNotNull(token85);
        org.junit.Assert.assertNotNull(token86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "<!---->" + "'", str87, "<!---->");
        org.junit.Assert.assertNotNull(comment88);
        org.junit.Assert.assertNotNull(token90);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str5 = documentType4.nodeName();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str7 = doctype6.getName();
        boolean boolean8 = doctype6.forceQuirks;
        org.jsoup.parser.Token token9 = doctype6.reset();
        org.jsoup.parser.Token.TokenType tokenType10 = doctype6.type;
        boolean boolean11 = doctype6.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType12 = doctype6.type;
        boolean boolean13 = documentType4.hasSameValue((java.lang.Object) doctype6);
        java.lang.StringBuilder stringBuilder14 = doctype6.publicIdentifier;
        boolean boolean15 = doctype6.forceQuirks;
        doctype6.forceQuirks = false;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.Tag tag3 = tag1.reset();
        org.jsoup.nodes.Attributes attributes4 = tag3.attributes;
        java.lang.String str5 = tag3.tokenType();
        tag3.newAttribute();
        boolean boolean7 = tag3.isComment();
        org.jsoup.parser.Token.Tag tag9 = tag3.name("StartTag");
        tag3.normalName = "<<SYSTEM>>";
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        tag1.appendTagName('4');
        java.lang.String str5 = tag1.normalName();
        tag1.appendAttributeName('4');
        java.lang.String str8 = tag1.name();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4" + "'", str8, "4");
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        java.lang.String str4 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag6 = tag5.reset();
        boolean boolean7 = tag5.selfClosing;
        boolean boolean8 = tag5.isSelfClosing();
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str10 = startTag9.normalName;
        startTag9.newAttribute();
        java.lang.String str12 = startTag9.normalName();
        startTag9.appendAttributeName("");
        startTag9.normalName = "hi!";
        org.jsoup.parser.Token.Tag tag17 = startTag9.reset();
        startTag9.appendTagName(' ');
        boolean boolean20 = startTag9.isEOF();
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag22 = startTag21.reset();
        org.jsoup.parser.Token.Tag tag23 = startTag21.reset();
        org.jsoup.parser.Token.StartTag startTag24 = tag23.asStartTag();
        startTag24.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag27 = startTag26.reset();
        boolean boolean28 = tag27.isEndTag();
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag30 = startTag29.reset();
        tag30.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str33 = startTag32.normalName;
        startTag32.newAttribute();
        java.lang.String str35 = startTag32.normalName();
        org.jsoup.parser.Token.StartTag startTag37 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag38 = startTag37.reset();
        tag38.finaliseTag();
        org.jsoup.nodes.DocumentType documentType44 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean46 = documentType44.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes47 = documentType44.attributes();
        tag38.attributes = attributes47;
        org.jsoup.parser.Token.StartTag startTag49 = startTag32.nameAttr("<!---->", attributes47);
        tag30.attributes = attributes47;
        char[] charArray52 = new char[] { 'a' };
        tag30.appendAttributeValue(charArray52);
        tag27.appendAttributeValue(charArray52);
        startTag24.appendAttributeValue(charArray52);
        startTag9.appendAttributeValue(charArray52);
        tag5.appendAttributeValue(charArray52);
        org.jsoup.parser.Token.Tag tag58 = tag5.reset();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(startTag24);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(attributes47);
        org.junit.Assert.assertNotNull(startTag49);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertArrayEquals(charArray52, new char[] { 'a' });
        org.junit.Assert.assertNotNull(tag58);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder5 = comment4.data;
        xmlTreeBuilder0.insert(comment4);
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean14 = documentType12.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Node node15 = documentType12.nextSibling();
        org.jsoup.parser.Token.Doctype doctype16 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder17 = doctype16.name;
        java.lang.StringBuilder stringBuilder18 = doctype16.systemIdentifier;
        boolean boolean19 = doctype16.isComment();
        boolean boolean20 = doctype16.isComment();
        boolean boolean21 = documentType12.hasSameValue((java.lang.Object) doctype16);
        xmlTreeBuilder0.insert(doctype16);
        org.jsoup.parser.ParseSettings parseSettings23 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document26 = xmlTreeBuilder0.parse("StartTag", "StartTag");
        org.jsoup.nodes.Attributes attributes27 = document26.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = document26.childNodesCopy();
        org.jsoup.nodes.Document document29 = document26.ownerDocument();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(parseSettings23);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNotNull(document29);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        xmlTreeBuilder9.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlTreeBuilder9.parseFragment("", "#doctype", parseErrorList17, parseSettings18);
        org.jsoup.parser.Token.Character character20 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder9.insert(character20);
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder25 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings26 = xmlTreeBuilder25.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder9.parseFragment("SYSTEM", "PUBLIC", parseErrorList24, parseSettings26);
        xmlTreeBuilder0.initialiseParse("<SYSTEM>", "Doctype", parseErrorList8, parseSettings26);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.ParseSettings parseSettings33 = null;
        xmlTreeBuilder29.initialiseParse("#doctype", "hi!", parseErrorList32, parseSettings33);
        org.jsoup.parser.Token.Character character35 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder29.insert(character35);
        java.lang.String str37 = character35.getData();
        xmlTreeBuilder0.insert(character35);
        org.jsoup.nodes.Document document41 = xmlTreeBuilder0.parse("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node43 = document41.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(parseSettings26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(document41);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag6 = startTag5.reset();
        tag6.finaliseTag();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean14 = documentType12.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes15 = documentType12.attributes();
        tag6.attributes = attributes15;
        org.jsoup.parser.Token.StartTag startTag17 = startTag0.nameAttr("<!---->", attributes15);
        startTag0.appendAttributeName("StartTag");
        startTag0.appendTagName("#doctype");
        org.jsoup.nodes.Attributes attributes22 = startTag0.attributes;
        org.jsoup.parser.Token token23 = startTag0.reset();
        boolean boolean24 = startTag0.isDoctype();
        org.jsoup.parser.Token.Tag tag25 = startTag0.reset();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(token23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(tag25);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        org.jsoup.parser.Token.Comment comment4 = comment0.asComment();
        boolean boolean5 = comment0.isEOF();
        boolean boolean6 = comment0.bogus;
        java.lang.String str7 = comment0.getData();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(comment4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder5 = comment4.data;
        xmlTreeBuilder0.insert(comment4);
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Comment comment8 = new org.jsoup.parser.Token.Comment();
        comment8.bogus = true;
        boolean boolean11 = comment8.bogus;
        xmlTreeBuilder0.insert(comment8);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document19 = xmlTreeBuilder16.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment20 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder21 = comment20.data;
        xmlTreeBuilder16.insert(comment20);
        org.jsoup.parser.ParseSettings parseSettings23 = xmlTreeBuilder16.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlTreeBuilder0.parseFragment("hi!", "4", parseErrorList15, parseSettings23);
        org.jsoup.nodes.Document document27 = xmlTreeBuilder0.parse("<!DOCTYPE #doctype PUBLIC \"4\" \"PUBLIC\">", "Comment");
        int int28 = document27.childNodeSize();
        org.jsoup.nodes.DocumentType documentType33 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean35 = documentType33.hasAttr("hi!");
        org.jsoup.nodes.Node node36 = documentType33.previousSibling();
        java.lang.Object obj37 = new java.lang.Object();
        boolean boolean38 = documentType33.equals(obj37);
        java.lang.String str39 = documentType33.toString();
        org.jsoup.nodes.Attributes attributes40 = documentType33.attributes();
        org.jsoup.nodes.Node node43 = documentType33.attr("<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node44 = document27.after((org.jsoup.nodes.Node) documentType33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertNotNull(parseSettings23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str39, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(attributes40);
        org.junit.Assert.assertNotNull(node43);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.toString();
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Attributes attributes8 = documentType4.attributes();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str6, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder5 = comment4.data;
        xmlTreeBuilder0.insert(comment4);
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean14 = documentType12.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Node node15 = documentType12.nextSibling();
        org.jsoup.parser.Token.Doctype doctype16 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder17 = doctype16.name;
        java.lang.StringBuilder stringBuilder18 = doctype16.systemIdentifier;
        boolean boolean19 = doctype16.isComment();
        boolean boolean20 = doctype16.isComment();
        boolean boolean21 = documentType12.hasSameValue((java.lang.Object) doctype16);
        xmlTreeBuilder0.insert(doctype16);
        org.jsoup.parser.Token.Comment comment23 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder24 = comment23.data;
        java.lang.String str25 = comment23.toString();
        org.jsoup.parser.Token token26 = comment23.reset();
        org.jsoup.parser.Token token27 = comment23.reset();
        java.lang.String str28 = comment23.toString();
        org.jsoup.parser.Token token29 = comment23.reset();
        boolean boolean30 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment23);
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str32 = startTag31.normalName;
        startTag31.newAttribute();
        java.lang.String str34 = startTag31.normalName();
        startTag31.appendAttributeName("");
        boolean boolean37 = startTag31.isSelfClosing();
        org.jsoup.parser.Token.Tag tag38 = startTag31.reset();
        org.jsoup.parser.Token.StartTag startTag39 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str40 = startTag39.normalName;
        startTag39.newAttribute();
        java.lang.String str42 = startTag39.normalName();
        java.lang.String str43 = startTag39.normalName();
        org.jsoup.parser.Token.Tag tag44 = startTag39.reset();
        org.jsoup.parser.Token.Tag tag45 = tag44.reset();
        org.jsoup.parser.Token.StartTag startTag46 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag47 = startTag46.reset();
        tag47.finaliseTag();
        tag47.appendTagName('4');
        org.jsoup.nodes.Attributes attributes51 = tag47.getAttributes();
        org.jsoup.parser.Token.StartTag startTag52 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag53 = startTag52.reset();
        tag53.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag55 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str56 = startTag55.normalName;
        startTag55.newAttribute();
        java.lang.String str58 = startTag55.normalName();
        org.jsoup.parser.Token.StartTag startTag60 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag61 = startTag60.reset();
        tag61.finaliseTag();
        org.jsoup.nodes.DocumentType documentType67 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean69 = documentType67.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes70 = documentType67.attributes();
        tag61.attributes = attributes70;
        org.jsoup.parser.Token.StartTag startTag72 = startTag55.nameAttr("<!---->", attributes70);
        tag53.attributes = attributes70;
        char[] charArray75 = new char[] { 'a' };
        tag53.appendAttributeValue(charArray75);
        tag47.appendAttributeValue(charArray75);
        char[] charArray82 = new char[] { 'a', ' ', '4', ' ' };
        tag47.appendAttributeValue(charArray82);
        tag44.appendAttributeValue(charArray82);
        startTag31.appendAttributeValue(charArray82);
        startTag31.tagName = "doctype";
        startTag31.setEmptyAttributeValue();
        org.jsoup.nodes.Element element89 = xmlTreeBuilder0.insert(startTag31);
        org.jsoup.nodes.Document document92 = xmlTreeBuilder0.parse("hi!", "4");
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(stringBuilder24);
        org.junit.Assert.assertEquals(stringBuilder24.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!---->" + "'", str25, "<!---->");
        org.junit.Assert.assertNotNull(token26);
        org.junit.Assert.assertNotNull(token27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!---->" + "'", str28, "<!---->");
        org.junit.Assert.assertNotNull(token29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertNotNull(attributes51);
        org.junit.Assert.assertNotNull(tag53);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(tag61);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(attributes70);
        org.junit.Assert.assertNotNull(startTag72);
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertArrayEquals(charArray75, new char[] { 'a' });
        org.junit.Assert.assertNotNull(charArray82);
        org.junit.Assert.assertArrayEquals(charArray82, new char[] { 'a', ' ', '4', ' ' });
        org.junit.Assert.assertNotNull(element89);
        org.junit.Assert.assertNotNull(document92);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        java.lang.String str4 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        boolean boolean6 = startTag0.isDoctype();
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("Doctype");
        startTag0.appendAttributeName("<<SYSTEM>>");
        java.lang.String str11 = startTag0.name();
        boolean boolean12 = startTag0.isStartTag();
        org.jsoup.parser.Token.Tag tag13 = startTag0.reset();
        boolean boolean14 = tag13.isSelfClosing();
        tag13.normalName = "<<!---->a>";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Doctype" + "'", str11, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isComment();
        org.jsoup.parser.Token.Doctype doctype4 = doctype0.asDoctype();
        doctype4.forceQuirks = true;
        org.jsoup.parser.Token token7 = doctype4.reset();
        java.lang.StringBuilder stringBuilder8 = doctype4.name;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(doctype4);
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str5 = documentType4.nodeName();
        org.jsoup.nodes.Attributes attributes6 = documentType4.attributes();
        java.lang.String str7 = documentType4.outerHtml();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str9 = startTag8.normalName;
        startTag8.newAttribute();
        java.lang.String str11 = startTag8.normalName();
        startTag8.appendAttributeName("");
        startTag8.normalName = "hi!";
        java.lang.String str16 = startTag8.tagName;
        startTag8.setEmptyAttributeValue();
        boolean boolean18 = documentType4.equals((java.lang.Object) startTag8);
        startTag8.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag20 = startTag8.reset();
        org.jsoup.parser.Token.Tag tag21 = startTag8.reset();
        org.jsoup.nodes.Attributes attributes22 = tag21.attributes;
        tag21.normalName = "<SYSTEM>";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character25 = tag21.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str7, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(attributes22);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.childNodesCopy();
        java.lang.String str9 = documentType4.attr("StartTag");
        java.lang.String str11 = documentType4.attr("<!---->");
        boolean boolean13 = documentType4.hasAttr("<<SYSTEM>>");
        org.jsoup.nodes.Node node14 = documentType4.nextSibling();
        org.jsoup.nodes.Node node15 = documentType4.clone();
        java.lang.String str17 = node15.absUrl("<!DOCTYPE #doctype PUBLIC \"4\" \"PUBLIC\">");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.siblingNodes();
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean15 = documentType13.hasAttr("hi!");
        java.lang.String str16 = documentType13.baseUri();
        org.jsoup.nodes.Node node17 = documentType13.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node7.before(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str6, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "SYSTEM" + "'", str16, "SYSTEM");
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag4 = startTag0.reset();
        boolean boolean5 = startTag0.isSelfClosing();
        startTag0.appendAttributeName('a');
        startTag0.appendAttributeValue("<Doctype>");
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean17 = documentType15.hasAttr("hi!");
        int int18 = documentType15.childNodeSize();
        int int19 = documentType15.childNodeSize();
        org.jsoup.nodes.Node node21 = documentType15.removeAttr("<!---->4");
        org.jsoup.nodes.Node node23 = documentType15.removeAttr("<!---->4");
        org.jsoup.nodes.Attributes attributes24 = node23.attributes();
        org.jsoup.parser.Token.StartTag startTag25 = startTag0.nameAttr("EOF", attributes24);
        boolean boolean26 = startTag25.selfClosing;
        org.jsoup.parser.Token.Tag tag27 = startTag25.reset();
        org.jsoup.parser.Token.Tag tag29 = startTag25.name("Comment");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(startTag25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(tag29);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "#doctype", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("SYSTEM", "Doctype");
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.ParseSettings parseSettings21 = null;
        xmlTreeBuilder17.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList20, parseSettings21);
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        xmlTreeBuilder17.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList25, parseSettings26);
        org.jsoup.parser.Token.Character character28 = new org.jsoup.parser.Token.Character();
        java.lang.String str29 = character28.getData();
        xmlTreeBuilder17.insert(character28);
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder34 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        org.jsoup.parser.ParseSettings parseSettings38 = null;
        xmlTreeBuilder34.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList37, parseSettings38);
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        org.jsoup.parser.ParseSettings parseSettings43 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList44 = xmlTreeBuilder34.parseFragment("", "#doctype", parseErrorList42, parseSettings43);
        org.jsoup.parser.Token.Character character45 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder34.insert(character45);
        org.jsoup.parser.ParseErrorList parseErrorList49 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder50 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings51 = xmlTreeBuilder50.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList52 = xmlTreeBuilder34.parseFragment("SYSTEM", "PUBLIC", parseErrorList49, parseSettings51);
        java.util.List<org.jsoup.nodes.Node> nodeList53 = xmlTreeBuilder17.parseFragment("#doctype", "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">", parseErrorList33, parseSettings51);
        org.jsoup.parser.ParseSettings parseSettings54 = xmlTreeBuilder17.defaultSettings();
        xmlTreeBuilder0.initialiseParse("SYSTEM", "EOF", parseErrorList16, parseSettings54);
        org.jsoup.parser.Token.StartTag startTag57 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag58 = startTag57.reset();
        tag58.finaliseTag();
        org.jsoup.nodes.DocumentType documentType64 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean66 = documentType64.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes67 = documentType64.attributes();
        tag58.attributes = attributes67;
        java.lang.String str69 = tag58.tagName;
        tag58.appendAttributeValue('4');
        org.jsoup.parser.Token.StartTag startTag72 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag73 = startTag72.reset();
        tag73.finaliseTag();
        tag73.appendTagName('4');
        org.jsoup.nodes.Attributes attributes77 = tag73.getAttributes();
        tag58.attributes = attributes77;
        boolean boolean79 = xmlTreeBuilder0.processStartTag("EOF", attributes77);
        org.jsoup.nodes.DocumentType documentType85 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean87 = documentType85.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes88 = documentType85.attributes();
        boolean boolean89 = xmlTreeBuilder0.processStartTag("StartTag", attributes88);
        org.jsoup.nodes.Document document92 = xmlTreeBuilder0.parse("4", "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">");
        int int93 = document92.childNodeSize();
        org.jsoup.nodes.Attributes attributes94 = document92.attributes();
        boolean boolean96 = document92.hasAttr("doctype");
        org.jsoup.nodes.Attributes attributes97 = document92.attributes();
        org.jsoup.nodes.Document document98 = document92.ownerDocument();
        int int99 = document92.childNodeSize();
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertNotNull(nodeList52);
        org.junit.Assert.assertNotNull(nodeList53);
        org.junit.Assert.assertNotNull(parseSettings54);
        org.junit.Assert.assertNotNull(tag58);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(attributes67);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNotNull(tag73);
        org.junit.Assert.assertNotNull(attributes77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(attributes88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(document92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 1 + "'", int93 == 1);
        org.junit.Assert.assertNotNull(attributes94);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNotNull(attributes97);
        org.junit.Assert.assertNotNull(document98);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 1 + "'", int99 == 1);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        java.lang.String str4 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag6 = tag5.reset();
        boolean boolean7 = tag5.selfClosing;
        boolean boolean8 = tag5.isSelfClosing();
        tag5.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag11 = tag5.asStartTag();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag13 = startTag12.reset();
        tag13.finaliseTag();
        boolean boolean15 = tag13.isEndTag();
        java.lang.String str16 = tag13.normalName();
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str18 = startTag17.normalName;
        startTag17.newAttribute();
        java.lang.String str20 = startTag17.normalName();
        startTag17.appendAttributeValue('#');
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag24 = startTag23.reset();
        tag24.finaliseTag();
        tag24.appendTagName('4');
        org.jsoup.nodes.Attributes attributes28 = tag24.getAttributes();
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag30 = startTag29.reset();
        tag30.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str33 = startTag32.normalName;
        startTag32.newAttribute();
        java.lang.String str35 = startTag32.normalName();
        org.jsoup.parser.Token.StartTag startTag37 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag38 = startTag37.reset();
        tag38.finaliseTag();
        org.jsoup.nodes.DocumentType documentType44 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean46 = documentType44.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes47 = documentType44.attributes();
        tag38.attributes = attributes47;
        org.jsoup.parser.Token.StartTag startTag49 = startTag32.nameAttr("<!---->", attributes47);
        tag30.attributes = attributes47;
        char[] charArray52 = new char[] { 'a' };
        tag30.appendAttributeValue(charArray52);
        tag24.appendAttributeValue(charArray52);
        tag24.appendTagName("Doctype");
        org.jsoup.parser.Token.TokenType tokenType57 = org.jsoup.parser.Token.TokenType.EOF;
        tag24.type = tokenType57;
        org.jsoup.parser.Token.StartTag startTag59 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str60 = startTag59.normalName;
        startTag59.newAttribute();
        java.lang.String str62 = startTag59.normalName();
        startTag59.appendAttributeName("");
        startTag59.normalName = "hi!";
        startTag59.appendTagName("PUBLIC");
        org.jsoup.parser.Token.StartTag startTag69 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag70 = startTag69.reset();
        tag70.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag72 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str73 = startTag72.normalName;
        startTag72.newAttribute();
        java.lang.String str75 = startTag72.normalName();
        org.jsoup.parser.Token.StartTag startTag77 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag78 = startTag77.reset();
        tag78.finaliseTag();
        org.jsoup.nodes.DocumentType documentType84 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean86 = documentType84.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes87 = documentType84.attributes();
        tag78.attributes = attributes87;
        org.jsoup.parser.Token.StartTag startTag89 = startTag72.nameAttr("<!---->", attributes87);
        tag70.attributes = attributes87;
        char[] charArray92 = new char[] { 'a' };
        tag70.appendAttributeValue(charArray92);
        startTag59.appendAttributeValue(charArray92);
        tag24.appendAttributeValue(charArray92);
        startTag17.appendAttributeValue(charArray92);
        tag13.appendAttributeValue(charArray92);
        tag5.appendAttributeValue(charArray92);
        boolean boolean99 = tag5.isEOF();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(startTag11);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(attributes47);
        org.junit.Assert.assertNotNull(startTag49);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertArrayEquals(charArray52, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + tokenType57 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType57.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(tag70);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertNotNull(tag78);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(attributes87);
        org.junit.Assert.assertNotNull(startTag89);
        org.junit.Assert.assertNotNull(charArray92);
        org.junit.Assert.assertArrayEquals(charArray92, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        boolean boolean2 = comment0.bogus;
        boolean boolean3 = comment0.isDoctype();
        java.lang.String str4 = comment0.getData();
        boolean boolean5 = comment0.isStartTag();
        comment0.bogus = false;
        boolean boolean8 = comment0.isEOF();
        boolean boolean9 = comment0.bogus;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        boolean boolean6 = startTag0.isSelfClosing();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean14 = documentType12.hasAttr("hi!");
        org.jsoup.nodes.Node node15 = documentType12.clone();
        org.jsoup.nodes.Attributes attributes16 = node15.attributes();
        org.jsoup.parser.Token.StartTag startTag17 = startTag0.nameAttr("EOF", attributes16);
        startTag17.appendAttributeName("<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">");
        java.lang.String str20 = startTag17.tagName;
        org.jsoup.parser.Token.Tag tag21 = startTag17.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = startTag17.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "EOF" + "'", str20, "EOF");
        org.junit.Assert.assertNotNull(tag21);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        java.lang.String str9 = documentType4.nodeName();
        java.lang.String str10 = documentType4.nodeName();
        boolean boolean12 = documentType4.hasAttr("Character");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.Tag tag3 = tag1.reset();
        tag3.appendTagName('#');
        org.jsoup.parser.Token.StartTag startTag6 = tag3.asStartTag();
        startTag6.tagName = "<SYSTEM>";
        java.lang.String str9 = startTag6.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag10 = startTag6.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<<SYSTEM>>" + "'", str9, "<<SYSTEM>>");
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.nodes.DocumentType documentType7 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean9 = documentType7.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes10 = documentType7.attributes();
        tag1.attributes = attributes10;
        java.lang.String str12 = tag1.tagName;
        org.jsoup.parser.Token.StartTag startTag13 = tag1.asStartTag();
        startTag13.selfClosing = true;
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(startTag13);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasSameValue((java.lang.Object) (short) -1);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.siblingNodes();
        boolean boolean9 = documentType4.equals((java.lang.Object) 0L);
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        java.lang.String str11 = documentType4.toString();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str17 = documentType16.nodeName();
        org.jsoup.nodes.Attributes attributes18 = documentType16.attributes();
        java.lang.String str19 = documentType16.outerHtml();
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str21 = startTag20.normalName;
        startTag20.newAttribute();
        java.lang.String str23 = startTag20.normalName();
        startTag20.appendAttributeName("");
        startTag20.normalName = "hi!";
        java.lang.String str28 = startTag20.tagName;
        startTag20.setEmptyAttributeValue();
        boolean boolean30 = documentType16.equals((java.lang.Object) startTag20);
        startTag20.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag32 = startTag20.reset();
        boolean boolean33 = documentType4.hasSameValue((java.lang.Object) startTag20);
        org.jsoup.parser.Token.TokenType tokenType34 = startTag20.type;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str11, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#doctype" + "'", str17, "#doctype");
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str19, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + tokenType34 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType34.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.Tag tag3 = tag1.reset();
        org.jsoup.nodes.Attributes attributes4 = tag3.getAttributes();
        tag3.tagName = "4";
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(attributes4);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<<SYSTEM>>", "<SYSTEM>", "4", "StartTag");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        java.lang.String str6 = node5.toString();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE <<SYSTEM>> PUBLIC \"<SYSTEM>\" \"4\">" + "'", str6, "<!DOCTYPE <<SYSTEM>> PUBLIC \"<SYSTEM>\" \"4\">");
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.appendAttributeName("SYSTEM");
        org.jsoup.nodes.Attributes attributes4 = startTag0.attributes;
        startTag0.normalName = "";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(attributes4);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        org.jsoup.parser.Token.Tag tag8 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag10 = tag8.name("Doctype");
        java.lang.String str11 = tag10.tokenType();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str13 = startTag12.normalName;
        startTag12.newAttribute();
        java.lang.String str15 = startTag12.normalName();
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag18 = startTag17.reset();
        tag18.finaliseTag();
        org.jsoup.nodes.DocumentType documentType24 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean26 = documentType24.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes27 = documentType24.attributes();
        tag18.attributes = attributes27;
        org.jsoup.parser.Token.StartTag startTag29 = startTag12.nameAttr("<!---->", attributes27);
        startTag12.appendAttributeName("SYSTEM");
        boolean boolean32 = startTag12.isDoctype();
        org.jsoup.parser.Token.StartTag startTag33 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str34 = startTag33.normalName;
        startTag33.newAttribute();
        org.jsoup.parser.Token.Tag tag36 = startTag33.reset();
        org.jsoup.parser.Token.StartTag startTag37 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag38 = startTag37.reset();
        tag38.finaliseTag();
        tag38.appendTagName('4');
        int[] intArray45 = new int[] { 0, ' ', '#' };
        tag38.appendAttributeValue(intArray45);
        startTag33.appendAttributeValue(intArray45);
        startTag12.appendAttributeValue(intArray45);
        tag10.appendAttributeValue(intArray45);
        tag10.appendAttributeValue("<SYSTEM></SYSTEM>");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "StartTag" + "'", str11, "StartTag");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(startTag29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] { 0, 32, 35 });
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("SYSTEM", "SYSTEM", "#doctype", "SYSTEM");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("PUBLIC");
        org.jsoup.nodes.Node node9 = node6.attr("<SYSTEM>", "StartTag");
        org.jsoup.nodes.Attributes attributes10 = node6.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node6.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node6.before("<!DOCTYPE PUBLIC \"SYSTEM\" \"<!DOCTYPE PUBLIC \"hi!\" \"hi!\">\">");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        org.jsoup.parser.Token.TokenType tokenType1 = endTag0.type;
        org.jsoup.parser.Token.EndTag endTag2 = endTag0.asEndTag();
        endTag0.setEmptyAttributeValue();
        endTag0.appendTagName('#');
        java.lang.String str6 = endTag0.toString();
        org.junit.Assert.assertTrue("'" + tokenType1 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType1.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertNotNull(endTag2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "</#>" + "'", str6, "</#>");
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder5 = comment4.data;
        xmlTreeBuilder0.insert(comment4);
        org.jsoup.parser.Token.Character character7 = new org.jsoup.parser.Token.Character();
        java.lang.String str8 = character7.getData();
        org.jsoup.parser.Token.Character character10 = character7.data("<!---->");
        xmlTreeBuilder0.insert(character7);
        org.jsoup.nodes.Document document14 = xmlTreeBuilder0.parse("", "<!---->4");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.ParseSettings parseSettings19 = null;
        xmlTreeBuilder15.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList18, parseSettings19);
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.ParseSettings parseSettings24 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlTreeBuilder15.parseFragment("", "#doctype", parseErrorList23, parseSettings24);
        org.jsoup.parser.Token.Comment comment26 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder27 = comment26.data;
        java.lang.String str28 = comment26.toString();
        org.jsoup.parser.Token token29 = comment26.reset();
        boolean boolean30 = xmlTreeBuilder15.process((org.jsoup.parser.Token) comment26);
        comment26.bogus = true;
        boolean boolean33 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment26);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(character10);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!---->" + "'", str28, "<!---->");
        org.junit.Assert.assertNotNull(token29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        boolean boolean5 = document3.hasAttr("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node7 = document3.removeAttr("EOF");
        org.jsoup.nodes.Document document8 = node7.ownerDocument();
        org.jsoup.nodes.Node node9 = node7.previousSibling();
        int int10 = node7.siblingIndex();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node8 = documentType4.attr("hi!", "hi!");
        java.lang.String str10 = node8.absUrl("Doctype");
        node8.setBaseUri("");
        int int13 = node8.childNodeSize();
        java.lang.String str14 = node8.baseUri();
        org.jsoup.nodes.Node node17 = node8.attr("<!DOCTYPE PUBLIC>", "PUBLIC");
        org.jsoup.nodes.Document document18 = node8.ownerDocument();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(document18);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag6 = startTag5.reset();
        tag6.finaliseTag();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean14 = documentType12.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes15 = documentType12.attributes();
        tag6.attributes = attributes15;
        org.jsoup.parser.Token.StartTag startTag17 = startTag0.nameAttr("<!---->", attributes15);
        boolean boolean18 = startTag0.isSelfClosing();
        startTag0.appendTagName("<!DOCTYPE 4 PUBLIC \"<SYSTEM>\" \"4\">");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.String str3 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token4 = doctype0.reset();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.String str6 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.nodes.DocumentType documentType7 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean9 = documentType7.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes10 = documentType7.attributes();
        tag1.attributes = attributes10;
        tag1.appendTagName("#doctype");
        boolean boolean14 = tag1.selfClosing;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character15 = tag1.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        startTag0.appendTagName("PUBLIC");
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag10.reset();
        tag11.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str14 = startTag13.normalName;
        startTag13.newAttribute();
        java.lang.String str16 = startTag13.normalName();
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag19 = startTag18.reset();
        tag19.finaliseTag();
        org.jsoup.nodes.DocumentType documentType25 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean27 = documentType25.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes28 = documentType25.attributes();
        tag19.attributes = attributes28;
        org.jsoup.parser.Token.StartTag startTag30 = startTag13.nameAttr("<!---->", attributes28);
        tag11.attributes = attributes28;
        char[] charArray33 = new char[] { 'a' };
        tag11.appendAttributeValue(charArray33);
        startTag0.appendAttributeValue(charArray33);
        startTag0.appendTagName('a');
        org.jsoup.nodes.Attributes attributes38 = null;
        startTag0.attributes = attributes38;
        org.jsoup.nodes.Attributes attributes40 = startTag0.getAttributes();
        org.jsoup.nodes.DocumentType documentType45 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean47 = documentType45.hasAttr("hi!");
        org.jsoup.nodes.Node node48 = documentType45.previousSibling();
        java.lang.Object obj49 = new java.lang.Object();
        boolean boolean50 = documentType45.equals(obj49);
        java.lang.String str51 = documentType45.toString();
        org.jsoup.nodes.Attributes attributes52 = documentType45.attributes();
        startTag0.attributes = attributes52;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertNotNull(startTag30);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertArrayEquals(charArray33, new char[] { 'a' });
        org.junit.Assert.assertNull(attributes40);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str51, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(attributes52);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("SYSTEM", "SYSTEM", "#doctype", "SYSTEM");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("PUBLIC");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = org.jsoup.parser.HtmlTreeBuilderState.ForeignContent;
        boolean boolean8 = documentType4.hasSameValue((java.lang.Object) htmlTreeBuilderState7);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str10 = startTag9.normalName;
        startTag9.newAttribute();
        java.lang.String str12 = startTag9.normalName();
        java.lang.String str13 = startTag9.normalName();
        org.jsoup.parser.Token.Tag tag14 = startTag9.reset();
        org.jsoup.parser.Token.Tag tag15 = startTag9.reset();
        startTag9.tagName = "<!---->";
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder18 = null;
        boolean boolean19 = htmlTreeBuilderState7.process((org.jsoup.parser.Token) startTag9, htmlTreeBuilder18);
        org.jsoup.parser.Token.Doctype doctype20 = new org.jsoup.parser.Token.Doctype();
        boolean boolean21 = doctype20.forceQuirks;
        java.lang.StringBuilder stringBuilder22 = doctype20.publicIdentifier;
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str24 = startTag23.normalName;
        startTag23.newAttribute();
        java.lang.String str26 = startTag23.normalName();
        org.jsoup.parser.Token.Doctype doctype27 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str28 = doctype27.getName();
        org.jsoup.parser.Token.TokenType tokenType29 = doctype27.type;
        startTag23.type = tokenType29;
        doctype20.type = tokenType29;
        java.lang.StringBuilder stringBuilder32 = doctype20.systemIdentifier;
        java.lang.String str33 = doctype20.getName();
        java.lang.String str34 = doctype20.getSystemIdentifier();
        org.jsoup.parser.Token token35 = doctype20.reset();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder36 = null;
        boolean boolean37 = htmlTreeBuilderState7.process(token35, htmlTreeBuilder36);
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str39 = startTag38.normalName;
        startTag38.newAttribute();
        java.lang.String str41 = startTag38.normalName();
        java.lang.String str42 = startTag38.normalName();
        org.jsoup.parser.Token.Tag tag43 = startTag38.reset();
        org.jsoup.parser.Token.Tag tag44 = tag43.reset();
        java.lang.String str45 = tag43.normalName;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder46 = null;
        boolean boolean47 = htmlTreeBuilderState7.process((org.jsoup.parser.Token) tag43, htmlTreeBuilder46);
        org.jsoup.parser.Token.StartTag startTag48 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag49 = startTag48.reset();
        tag49.finaliseTag();
        org.jsoup.parser.Token.Tag tag51 = tag49.reset();
        org.jsoup.nodes.Attributes attributes52 = tag51.attributes;
        org.jsoup.parser.Token.Tag tag53 = tag51.reset();
        org.jsoup.parser.Token.StartTag startTag54 = tag51.asStartTag();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder55 = null;
        boolean boolean56 = htmlTreeBuilderState7.process((org.jsoup.parser.Token) startTag54, htmlTreeBuilder55);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + tokenType29 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType29.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(stringBuilder32);
        org.junit.Assert.assertEquals(stringBuilder32.toString(), "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(token35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertNotNull(tag51);
        org.junit.Assert.assertNotNull(attributes52);
        org.junit.Assert.assertNotNull(tag53);
        org.junit.Assert.assertNotNull(startTag54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!DOCTYPE PUBLIC>", "#doctype", "4", "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = node5.previousSibling();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node8 = documentType4.attr("hi!", "hi!");
        java.lang.String str10 = node8.absUrl("Doctype");
        node8.setBaseUri("");
        int int13 = node8.childNodeSize();
        java.lang.String str14 = node8.baseUri();
        java.lang.String str15 = node8.toString();
        java.lang.String str16 = node8.toString();
        node8.setBaseUri("Character");
        org.jsoup.nodes.Attributes attributes19 = node8.attributes();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str15, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str16, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(attributes19);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.String str4 = comment0.toString();
        boolean boolean5 = comment0.bogus;
        java.lang.String str6 = comment0.toString();
        boolean boolean7 = comment0.isComment();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!---->" + "'", str4, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        java.lang.String str4 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        startTag0.appendTagName("<SYSTEM>");
        boolean boolean8 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Comment comment9 = new org.jsoup.parser.Token.Comment();
        comment9.bogus = false;
        java.lang.StringBuilder stringBuilder12 = comment9.data;
        org.jsoup.parser.Token.Comment comment13 = comment9.asComment();
        boolean boolean14 = comment9.bogus;
        org.jsoup.parser.Token.Comment comment15 = comment9.asComment();
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag17 = startTag16.reset();
        tag17.finaliseTag();
        org.jsoup.nodes.DocumentType documentType23 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean25 = documentType23.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes26 = documentType23.attributes();
        tag17.attributes = attributes26;
        tag17.appendTagName("#doctype");
        java.lang.String str30 = tag17.tagName;
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag32 = startTag31.reset();
        tag32.finaliseTag();
        org.jsoup.nodes.DocumentType documentType38 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean40 = documentType38.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes41 = documentType38.attributes();
        tag32.attributes = attributes41;
        java.lang.String str43 = tag32.tagName;
        boolean boolean44 = tag32.selfClosing;
        org.jsoup.parser.Token.Doctype doctype45 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str46 = doctype45.getName();
        java.lang.String str47 = doctype45.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder48 = doctype45.systemIdentifier;
        boolean boolean49 = doctype45.forceQuirks;
        java.lang.StringBuilder stringBuilder50 = doctype45.name;
        org.jsoup.parser.Token.Comment comment51 = new org.jsoup.parser.Token.Comment();
        comment51.bogus = false;
        java.lang.StringBuilder stringBuilder54 = comment51.data;
        boolean boolean55 = comment51.isEOF();
        java.lang.String str56 = comment51.toString();
        java.lang.String str57 = comment51.getData();
        java.lang.String str58 = comment51.getData();
        org.jsoup.parser.Token.TokenType tokenType59 = comment51.type;
        doctype45.type = tokenType59;
        tag32.type = tokenType59;
        tag17.type = tokenType59;
        comment9.type = tokenType59;
        startTag0.type = tokenType59;
        org.jsoup.parser.Token.Tag tag65 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag66 = startTag0.reset();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertNotNull(comment13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(comment15);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#doctype" + "'", str30, "#doctype");
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(stringBuilder48);
        org.junit.Assert.assertEquals(stringBuilder48.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(stringBuilder50);
        org.junit.Assert.assertEquals(stringBuilder50.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder54);
        org.junit.Assert.assertEquals(stringBuilder54.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "<!---->" + "'", str56, "<!---->");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + tokenType59 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType59.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertNotNull(tag65);
        org.junit.Assert.assertNotNull(tag66);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">");
        org.jsoup.parser.TokeniserState tokeniserState14 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapedLessthanSign;
        boolean boolean15 = document13.equals((java.lang.Object) tokeniserState14);
        java.util.List<org.jsoup.nodes.Node> nodeList16 = document13.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = document13.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = document13.childNodesCopy();
        org.jsoup.nodes.Node node21 = document13.attr("doctype", "SYSTEM");
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.Tag tag3 = tag1.reset();
        tag3.appendTagName('#');
        org.jsoup.parser.Token.StartTag startTag6 = tag3.asStartTag();
        startTag6.tagName = "<SYSTEM>";
        java.lang.String str9 = startTag6.toString();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder11 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document14 = xmlTreeBuilder11.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment15 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder16 = comment15.data;
        xmlTreeBuilder11.insert(comment15);
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str19 = startTag18.normalName;
        startTag18.newAttribute();
        java.lang.String str21 = startTag18.normalName();
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag24 = startTag23.reset();
        tag24.finaliseTag();
        org.jsoup.nodes.DocumentType documentType30 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean32 = documentType30.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes33 = documentType30.attributes();
        tag24.attributes = attributes33;
        org.jsoup.parser.Token.StartTag startTag35 = startTag18.nameAttr("<!---->", attributes33);
        java.lang.String str36 = startTag35.name();
        boolean boolean37 = xmlTreeBuilder11.process((org.jsoup.parser.Token) startTag35);
        java.lang.String str38 = startTag35.toString();
        org.jsoup.nodes.Attributes attributes39 = startTag35.getAttributes();
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag41 = startTag40.reset();
        tag41.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag43 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str44 = startTag43.normalName;
        startTag43.newAttribute();
        java.lang.String str46 = startTag43.normalName();
        org.jsoup.parser.Token.StartTag startTag48 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag49 = startTag48.reset();
        tag49.finaliseTag();
        org.jsoup.nodes.DocumentType documentType55 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean57 = documentType55.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes58 = documentType55.attributes();
        tag49.attributes = attributes58;
        org.jsoup.parser.Token.StartTag startTag60 = startTag43.nameAttr("<!---->", attributes58);
        tag41.attributes = attributes58;
        tag41.newAttribute();
        boolean boolean63 = tag41.isCharacter();
        tag41.tagName = "StartTag";
        tag41.finaliseTag();
        org.jsoup.parser.Token.Tag tag67 = tag41.reset();
        boolean boolean68 = tag67.isSelfClosing();
        org.jsoup.nodes.Attributes attributes69 = tag67.attributes;
        startTag35.attributes = attributes69;
        org.jsoup.parser.Token.StartTag startTag71 = startTag6.nameAttr("<!DOCTYPE PUBLIC \"<!DOCTYPE PUBLIC \"hi!\" \"hi!\">\" \"EOF\">", attributes69);
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<<SYSTEM>>" + "'", str9, "<<SYSTEM>>");
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(attributes33);
        org.junit.Assert.assertNotNull(startTag35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<!---->" + "'", str36, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<<!---->  name=\"\" publicId=\"hi!\" systemId=\"hi!\">" + "'", str38, "<<!---->  name=\"\" publicId=\"hi!\" systemId=\"hi!\">");
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(attributes58);
        org.junit.Assert.assertNotNull(startTag60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(tag67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(attributes69);
        org.junit.Assert.assertNotNull(startTag71);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        boolean boolean2 = doctype0.forceQuirks;
        org.jsoup.parser.Token token3 = doctype0.reset();
        org.jsoup.parser.Token.TokenType tokenType4 = doctype0.type;
        boolean boolean5 = doctype0.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType6 = doctype0.type;
        java.lang.String str7 = doctype0.getSystemIdentifier();
        boolean boolean8 = doctype0.forceQuirks;
        boolean boolean9 = doctype0.isStartTag();
        boolean boolean10 = doctype0.isComment();
        boolean boolean11 = doctype0.isStartTag();
        boolean boolean12 = doctype0.isForceQuirks();
        org.jsoup.parser.Token.Doctype doctype13 = doctype0.asDoctype();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doctype13);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "#doctype", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("SYSTEM", "Doctype");
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.ParseSettings parseSettings21 = null;
        xmlTreeBuilder17.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList20, parseSettings21);
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        xmlTreeBuilder17.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList25, parseSettings26);
        org.jsoup.parser.Token.Character character28 = new org.jsoup.parser.Token.Character();
        java.lang.String str29 = character28.getData();
        xmlTreeBuilder17.insert(character28);
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder34 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        org.jsoup.parser.ParseSettings parseSettings38 = null;
        xmlTreeBuilder34.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList37, parseSettings38);
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        org.jsoup.parser.ParseSettings parseSettings43 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList44 = xmlTreeBuilder34.parseFragment("", "#doctype", parseErrorList42, parseSettings43);
        org.jsoup.parser.Token.Character character45 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder34.insert(character45);
        org.jsoup.parser.ParseErrorList parseErrorList49 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder50 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings51 = xmlTreeBuilder50.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList52 = xmlTreeBuilder34.parseFragment("SYSTEM", "PUBLIC", parseErrorList49, parseSettings51);
        java.util.List<org.jsoup.nodes.Node> nodeList53 = xmlTreeBuilder17.parseFragment("#doctype", "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">", parseErrorList33, parseSettings51);
        org.jsoup.parser.ParseSettings parseSettings54 = xmlTreeBuilder17.defaultSettings();
        xmlTreeBuilder0.initialiseParse("SYSTEM", "EOF", parseErrorList16, parseSettings54);
        org.jsoup.parser.Token.StartTag startTag57 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag58 = startTag57.reset();
        tag58.finaliseTag();
        org.jsoup.nodes.DocumentType documentType64 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean66 = documentType64.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes67 = documentType64.attributes();
        tag58.attributes = attributes67;
        java.lang.String str69 = tag58.tagName;
        tag58.appendAttributeValue('4');
        org.jsoup.parser.Token.StartTag startTag72 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag73 = startTag72.reset();
        tag73.finaliseTag();
        tag73.appendTagName('4');
        org.jsoup.nodes.Attributes attributes77 = tag73.getAttributes();
        tag58.attributes = attributes77;
        boolean boolean79 = xmlTreeBuilder0.processStartTag("EOF", attributes77);
        org.jsoup.nodes.DocumentType documentType85 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean87 = documentType85.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes88 = documentType85.attributes();
        boolean boolean89 = xmlTreeBuilder0.processStartTag("StartTag", attributes88);
        org.jsoup.nodes.Document document92 = xmlTreeBuilder0.parse("4", "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">");
        org.jsoup.nodes.Node node94 = document92.removeAttr("hi!");
        org.jsoup.nodes.Node node95 = document92.nextSibling();
        java.lang.String str97 = document92.absUrl("<<!doctype system public \"system\" \"#doctype\">  name=\"\" publicId=\"hi!\" systemId=\"hi!\">");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertNotNull(nodeList52);
        org.junit.Assert.assertNotNull(nodeList53);
        org.junit.Assert.assertNotNull(parseSettings54);
        org.junit.Assert.assertNotNull(tag58);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(attributes67);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNotNull(tag73);
        org.junit.Assert.assertNotNull(attributes77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(attributes88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(document92);
        org.junit.Assert.assertNotNull(node94);
        org.junit.Assert.assertNull(node95);
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "" + "'", str97, "");
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasSameValue((java.lang.Object) (short) -1);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.siblingNodes();
        boolean boolean9 = documentType4.equals((java.lang.Object) 0L);
        org.jsoup.nodes.Attributes attributes10 = documentType4.attributes();
        java.lang.String str11 = documentType4.toString();
        org.jsoup.nodes.DocumentType documentType16 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str17 = documentType16.nodeName();
        org.jsoup.nodes.Attributes attributes18 = documentType16.attributes();
        java.lang.String str19 = documentType16.outerHtml();
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str21 = startTag20.normalName;
        startTag20.newAttribute();
        java.lang.String str23 = startTag20.normalName();
        startTag20.appendAttributeName("");
        startTag20.normalName = "hi!";
        java.lang.String str28 = startTag20.tagName;
        startTag20.setEmptyAttributeValue();
        boolean boolean30 = documentType16.equals((java.lang.Object) startTag20);
        startTag20.setEmptyAttributeValue();
        org.jsoup.parser.Token.Tag tag32 = startTag20.reset();
        boolean boolean33 = documentType4.hasSameValue((java.lang.Object) startTag20);
        java.util.List<org.jsoup.nodes.Node> nodeList34 = documentType4.childNodesCopy();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str11, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#doctype" + "'", str17, "#doctype");
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str19, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(nodeList34);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.toString();
        org.jsoup.parser.Token.Character character3 = character0.data("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        java.lang.String str4 = character3.getData();
        org.jsoup.parser.Token.Character character5 = character3.asCharacter();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str4, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(character5);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.DocumentType documentType10 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean12 = documentType10.hasAttr("hi!");
        org.jsoup.nodes.Node node13 = documentType10.previousSibling();
        org.jsoup.nodes.Node node14 = documentType10.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = documentType10.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("<!DOCTYPE PUBLIC>");
        java.lang.String str12 = documentType4.baseUri();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.ParseSettings parseSettings17 = null;
        xmlTreeBuilder13.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList16, parseSettings17);
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.ParseSettings parseSettings22 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlTreeBuilder13.parseFragment("", "#doctype", parseErrorList21, parseSettings22);
        org.jsoup.parser.Token.Character character24 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder13.insert(character24);
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document32 = xmlTreeBuilder29.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment33 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder34 = comment33.data;
        xmlTreeBuilder29.insert(comment33);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder36 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        org.jsoup.parser.ParseSettings parseSettings40 = null;
        xmlTreeBuilder36.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList39, parseSettings40);
        org.jsoup.parser.Token.Character character42 = new org.jsoup.parser.Token.Character();
        java.lang.String str43 = character42.getData();
        org.jsoup.parser.Token.Character character45 = character42.data("<!---->");
        java.lang.String str46 = character45.getData();
        xmlTreeBuilder36.insert(character45);
        xmlTreeBuilder29.insert(character45);
        org.jsoup.parser.Token.Comment comment49 = new org.jsoup.parser.Token.Comment();
        comment49.bogus = false;
        java.lang.StringBuilder stringBuilder52 = comment49.data;
        java.lang.String str53 = comment49.getData();
        boolean boolean54 = xmlTreeBuilder29.process((org.jsoup.parser.Token) comment49);
        org.jsoup.parser.ParseErrorList parseErrorList57 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder58 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList61 = null;
        org.jsoup.parser.ParseSettings parseSettings62 = null;
        xmlTreeBuilder58.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList61, parseSettings62);
        org.jsoup.parser.ParseErrorList parseErrorList66 = null;
        org.jsoup.parser.ParseSettings parseSettings67 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList68 = xmlTreeBuilder58.parseFragment("", "#doctype", parseErrorList66, parseSettings67);
        org.jsoup.parser.Token.Comment comment69 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder70 = comment69.data;
        java.lang.String str71 = comment69.toString();
        org.jsoup.parser.Token token72 = comment69.reset();
        boolean boolean73 = xmlTreeBuilder58.process((org.jsoup.parser.Token) comment69);
        org.jsoup.parser.ParseSettings parseSettings74 = xmlTreeBuilder58.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings75 = xmlTreeBuilder58.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList76 = xmlTreeBuilder29.parseFragment("<!DOCTYPE PUBLIC>", "<!---->4", parseErrorList57, parseSettings75);
        xmlTreeBuilder13.initialiseParse("<<!---->#doctype  name=\"\" publicId=\"hi!\" systemId=\"hi!\">", "4", parseErrorList28, parseSettings75);
        org.jsoup.parser.Token.Doctype doctype78 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str79 = doctype78.getName();
        java.lang.String str80 = doctype78.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder81 = doctype78.systemIdentifier;
        boolean boolean82 = doctype78.forceQuirks;
        boolean boolean83 = doctype78.forceQuirks;
        boolean boolean84 = doctype78.isForceQuirks();
        doctype78.forceQuirks = true;
        xmlTreeBuilder13.insert(doctype78);
        boolean boolean88 = doctype78.isForceQuirks();
        boolean boolean89 = documentType4.hasSameValue((java.lang.Object) boolean88);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "SYSTEM" + "'", str12, "SYSTEM");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "");
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(character45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "<!---->" + "'", str46, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder52);
        org.junit.Assert.assertEquals(stringBuilder52.toString(), "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(nodeList68);
        org.junit.Assert.assertNotNull(stringBuilder70);
        org.junit.Assert.assertEquals(stringBuilder70.toString(), "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "<!---->" + "'", str71, "<!---->");
        org.junit.Assert.assertNotNull(token72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(parseSettings74);
        org.junit.Assert.assertNotNull(parseSettings75);
        org.junit.Assert.assertNotNull(nodeList76);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(stringBuilder81);
        org.junit.Assert.assertEquals(stringBuilder81.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean9 = documentType4.equals(obj8);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = documentType4.after("<<!---->  name=\"\" publicid=\"hi!\" systemid=\"hi!\"><!---->4");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        org.jsoup.parser.Token.TokenType tokenType2 = doctype0.type;
        org.jsoup.parser.Token token3 = doctype0.reset();
        java.lang.StringBuilder stringBuilder4 = doctype0.name;
        java.lang.String str5 = doctype0.getPublicIdentifier();
        boolean boolean6 = doctype0.isForceQuirks();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        java.lang.String str4 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        startTag0.appendTagName("<SYSTEM>");
        startTag0.setEmptyAttributeValue();
        org.jsoup.parser.Token.TokenType tokenType9 = null;
        startTag0.type = tokenType9;
        startTag0.setEmptyAttributeValue();
        boolean boolean12 = startTag0.selfClosing;
        startTag0.appendTagName('4');
        java.lang.String str15 = startTag0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<<SYSTEM>4>" + "'", str15, "<<SYSTEM>4>");
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.siblingNodes();
        org.jsoup.nodes.Node node11 = documentType4.removeAttr("<!DOCTYPE PUBLIC>");
        node11.setBaseUri("Comment");
        org.jsoup.nodes.Node node15 = node11.removeAttr("<!DOCTYPE <!DOCTYPE PUBLIC> PUBLIC \"#doctype\" \"4\">");
        java.lang.String str17 = node11.absUrl("<!---->4");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = node11.siblingNodes();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str4 = startTag3.normalName;
        startTag3.newAttribute();
        java.lang.String str6 = startTag3.normalName();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag9 = startTag8.reset();
        tag9.finaliseTag();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean17 = documentType15.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes18 = documentType15.attributes();
        tag9.attributes = attributes18;
        org.jsoup.parser.Token.StartTag startTag20 = startTag3.nameAttr("<!---->", attributes18);
        tag1.attributes = attributes18;
        char[] charArray23 = new char[] { 'a' };
        tag1.appendAttributeValue(charArray23);
        tag1.appendAttributeValue('a');
        org.jsoup.parser.Token token27 = tag1.reset();
        tag1.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str31 = startTag30.normalName;
        startTag30.newAttribute();
        startTag30.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str35 = startTag34.normalName;
        startTag34.newAttribute();
        java.lang.String str37 = startTag34.normalName();
        startTag34.appendAttributeName("");
        startTag34.normalName = "hi!";
        startTag34.appendTagName("PUBLIC");
        org.jsoup.parser.Token.Tag tag44 = startTag34.reset();
        tag44.tagName = "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">";
        boolean boolean47 = tag44.isCharacter();
        java.lang.String str48 = tag44.normalName();
        boolean boolean49 = tag44.isComment();
        org.jsoup.parser.Token.StartTag startTag50 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str51 = startTag50.normalName;
        startTag50.newAttribute();
        java.lang.String str53 = startTag50.normalName();
        org.jsoup.parser.Token.Tag tag54 = startTag50.reset();
        org.jsoup.parser.Token.StartTag startTag55 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag56 = startTag55.reset();
        tag56.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag58 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str59 = startTag58.normalName;
        startTag58.newAttribute();
        java.lang.String str61 = startTag58.normalName();
        org.jsoup.parser.Token.StartTag startTag63 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag64 = startTag63.reset();
        tag64.finaliseTag();
        org.jsoup.nodes.DocumentType documentType70 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean72 = documentType70.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes73 = documentType70.attributes();
        tag64.attributes = attributes73;
        org.jsoup.parser.Token.StartTag startTag75 = startTag58.nameAttr("<!---->", attributes73);
        tag56.attributes = attributes73;
        tag56.newAttribute();
        org.jsoup.parser.Token.StartTag startTag78 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str79 = startTag78.normalName;
        startTag78.newAttribute();
        org.jsoup.parser.Token.Tag tag81 = startTag78.reset();
        org.jsoup.parser.Token.StartTag startTag82 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag83 = startTag82.reset();
        tag83.finaliseTag();
        tag83.appendTagName('4');
        int[] intArray90 = new int[] { 0, ' ', '#' };
        tag83.appendAttributeValue(intArray90);
        startTag78.appendAttributeValue(intArray90);
        tag56.appendAttributeValue(intArray90);
        tag54.appendAttributeValue(intArray90);
        tag44.appendAttributeValue(intArray90);
        startTag30.appendAttributeValue(intArray90);
        tag1.appendAttributeValue(intArray90);
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(startTag20);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { 'a' });
        org.junit.Assert.assertNotNull(token27);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(tag54);
        org.junit.Assert.assertNotNull(tag56);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(tag64);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(attributes73);
        org.junit.Assert.assertNotNull(startTag75);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertNotNull(tag81);
        org.junit.Assert.assertNotNull(tag83);
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertArrayEquals(intArray90, new int[] { 0, 32, 35 });
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.nodes.DocumentType documentType7 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean9 = documentType7.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes10 = documentType7.attributes();
        tag1.attributes = attributes10;
        java.lang.String str12 = tag1.tagName;
        boolean boolean13 = tag1.selfClosing;
        java.lang.String str14 = tag1.normalName;
        tag1.tagName = "4";
        boolean boolean17 = tag1.selfClosing;
        org.jsoup.parser.Token.Doctype doctype18 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder19 = doctype18.name;
        java.lang.StringBuilder stringBuilder20 = doctype18.systemIdentifier;
        boolean boolean21 = doctype18.isComment();
        boolean boolean22 = doctype18.isComment();
        org.jsoup.parser.Token.TokenType tokenType23 = doctype18.type;
        tag1.type = tokenType23;
        java.lang.String str25 = tag1.normalName();
        org.jsoup.parser.Token.Tag tag26 = tag1.reset();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + tokenType23 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType23.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(tag26);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.String str3 = doctype0.getSystemIdentifier();
        java.lang.String str4 = doctype0.getSystemIdentifier();
        doctype0.forceQuirks = false;
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder8 = doctype0.systemIdentifier;
        boolean boolean9 = doctype0.isDoctype();
        org.jsoup.parser.Token token10 = doctype0.reset();
        boolean boolean11 = doctype0.isForceQuirks();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        boolean boolean4 = startTag0.isSelfClosing();
        boolean boolean5 = startTag0.isSelfClosing();
        boolean boolean6 = startTag0.isStartTag();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str9 = startTag8.normalName;
        startTag8.newAttribute();
        java.lang.String str11 = startTag8.normalName();
        java.lang.String str12 = startTag8.normalName();
        org.jsoup.parser.Token.Tag tag13 = startTag8.reset();
        boolean boolean14 = startTag8.isDoctype();
        org.jsoup.parser.Token.Tag tag16 = startTag8.name("Doctype");
        org.jsoup.nodes.Attributes attributes17 = tag16.attributes;
        org.jsoup.parser.Token.StartTag startTag18 = startTag0.nameAttr("hi!", attributes17);
        startTag0.appendTagName('4');
        startTag0.appendAttributeValue("<<!---->  name=\"\" publicId=\"hi!\" systemId=\"hi!\">");
        startTag0.selfClosing = true;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(startTag18);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str10 = startTag9.normalName;
        org.jsoup.nodes.Attributes attributes11 = startTag9.attributes;
        org.jsoup.parser.Token.StartTag startTag12 = startTag0.nameAttr("SYSTEM", attributes11);
        startTag12.tagName = "PUBLIC";
        startTag12.appendAttributeName("<!DOCTYPE PUBLIC>");
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag18 = startTag17.reset();
        tag18.appendAttributeValue("");
        org.jsoup.parser.Token.Tag tag22 = tag18.name("<!DOCTYPE PUBLIC>");
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str24 = startTag23.normalName;
        startTag23.newAttribute();
        org.jsoup.parser.Token.Tag tag26 = startTag23.reset();
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag28 = startTag27.reset();
        tag28.finaliseTag();
        tag28.appendTagName('4');
        int[] intArray35 = new int[] { 0, ' ', '#' };
        tag28.appendAttributeValue(intArray35);
        startTag23.appendAttributeValue(intArray35);
        org.jsoup.parser.Token.StartTag startTag39 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag40 = startTag39.reset();
        tag40.finaliseTag();
        org.jsoup.parser.Token.Tag tag42 = tag40.reset();
        org.jsoup.nodes.Attributes attributes43 = tag42.attributes;
        org.jsoup.parser.Token.StartTag startTag44 = startTag23.nameAttr("<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">", attributes43);
        org.jsoup.parser.Token.Tag tag45 = startTag23.reset();
        org.jsoup.parser.Token.StartTag startTag46 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str47 = startTag46.normalName;
        startTag46.newAttribute();
        org.jsoup.parser.Token.Tag tag49 = startTag46.reset();
        org.jsoup.parser.Token.StartTag startTag50 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag51 = startTag50.reset();
        tag51.finaliseTag();
        tag51.appendTagName('4');
        int[] intArray58 = new int[] { 0, ' ', '#' };
        tag51.appendAttributeValue(intArray58);
        startTag46.appendAttributeValue(intArray58);
        startTag23.appendAttributeValue(intArray58);
        tag22.appendAttributeValue(intArray58);
        startTag12.appendAttributeValue(intArray58);
        boolean boolean64 = startTag12.isCharacter();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 0, 32, 35 });
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertNotNull(attributes43);
        org.junit.Assert.assertNotNull(startTag44);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertNotNull(tag51);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertArrayEquals(intArray58, new int[] { 0, 32, 35 });
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = documentType4.clone();
        org.jsoup.nodes.Node node8 = node7.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = node7.childNodesCopy();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">>", "<!---->4", "<<!---->>", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str5 = documentType4.nodeName();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str7 = doctype6.getName();
        boolean boolean8 = doctype6.forceQuirks;
        org.jsoup.parser.Token token9 = doctype6.reset();
        org.jsoup.parser.Token.TokenType tokenType10 = doctype6.type;
        boolean boolean11 = doctype6.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType12 = doctype6.type;
        boolean boolean13 = documentType4.hasSameValue((java.lang.Object) doctype6);
        java.lang.StringBuilder stringBuilder14 = doctype6.publicIdentifier;
        java.lang.String str15 = doctype6.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("SYSTEM", "SYSTEM", "#doctype", "SYSTEM");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("PUBLIC");
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("StartTag");
        org.jsoup.parser.Token.Doctype doctype9 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder10 = doctype9.name;
        boolean boolean11 = doctype9.forceQuirks;
        java.lang.String str12 = doctype9.getPublicIdentifier();
        boolean boolean13 = doctype9.isForceQuirks();
        java.lang.StringBuilder stringBuilder14 = doctype9.publicIdentifier;
        java.lang.String str15 = doctype9.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder16 = doctype9.publicIdentifier;
        boolean boolean17 = node8.hasSameValue((java.lang.Object) doctype9);
        boolean boolean18 = doctype9.forceQuirks;
        java.lang.String str19 = doctype9.getPublicIdentifier();
        org.jsoup.parser.Token token20 = doctype9.reset();
        boolean boolean21 = doctype9.isStartTag();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(token20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        boolean boolean2 = doctype0.forceQuirks;
        org.jsoup.parser.Token token3 = doctype0.reset();
        org.jsoup.parser.Token.TokenType tokenType4 = doctype0.type;
        boolean boolean5 = doctype0.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType6 = doctype0.type;
        java.lang.String str7 = doctype0.getSystemIdentifier();
        boolean boolean8 = doctype0.forceQuirks;
        boolean boolean9 = doctype0.isStartTag();
        boolean boolean10 = doctype0.isComment();
        boolean boolean11 = doctype0.forceQuirks;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(token3);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = documentType4.clone();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean14 = documentType12.hasAttr("hi!");
        int int15 = documentType12.childNodeSize();
        int int16 = documentType12.childNodeSize();
        org.jsoup.nodes.Node node18 = documentType12.removeAttr("<!---->4");
        org.jsoup.nodes.Node node20 = documentType12.removeAttr("<!---->4");
        org.jsoup.nodes.Attributes attributes21 = node20.attributes();
        org.jsoup.nodes.Node node22 = node20.clone();
        boolean boolean23 = documentType4.hasSameValue((java.lang.Object) node20);
        java.lang.String str25 = node20.attr(" ");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        boolean boolean6 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag9 = startTag0.name("StartTag");
        java.lang.String str10 = startTag0.name();
        java.lang.String str11 = startTag0.normalName;
        org.jsoup.parser.Token.StartTag startTag12 = startTag0.asStartTag();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "StartTag" + "'", str10, "StartTag");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "starttag" + "'", str11, "starttag");
        org.junit.Assert.assertNotNull(startTag12);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str4 = startTag3.normalName;
        startTag3.newAttribute();
        java.lang.String str6 = startTag3.normalName();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag9 = startTag8.reset();
        tag9.finaliseTag();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean17 = documentType15.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes18 = documentType15.attributes();
        tag9.attributes = attributes18;
        org.jsoup.parser.Token.StartTag startTag20 = startTag3.nameAttr("<!---->", attributes18);
        tag1.attributes = attributes18;
        tag1.newAttribute();
        boolean boolean23 = tag1.isCharacter();
        tag1.tagName = "StartTag";
        tag1.finaliseTag();
        org.jsoup.parser.Token.Tag tag27 = tag1.reset();
        boolean boolean28 = tag27.isSelfClosing();
        org.jsoup.nodes.Attributes attributes29 = tag27.attributes;
        tag27.appendAttributeValue('#');
        boolean boolean32 = tag27.selfClosing;
        java.lang.String str33 = tag27.normalName;
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag35 = startTag34.reset();
        tag35.finaliseTag();
        org.jsoup.parser.Token.Tag tag37 = tag35.reset();
        org.jsoup.nodes.Attributes attributes38 = tag37.attributes;
        java.lang.String str39 = tag37.normalName;
        org.jsoup.nodes.Attributes attributes40 = tag37.getAttributes();
        org.jsoup.parser.Token.StartTag startTag41 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag42 = startTag41.reset();
        boolean boolean43 = tag42.isEndTag();
        org.jsoup.parser.Token.StartTag startTag44 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag45 = startTag44.reset();
        tag45.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag47 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str48 = startTag47.normalName;
        startTag47.newAttribute();
        java.lang.String str50 = startTag47.normalName();
        org.jsoup.parser.Token.StartTag startTag52 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag53 = startTag52.reset();
        tag53.finaliseTag();
        org.jsoup.nodes.DocumentType documentType59 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean61 = documentType59.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes62 = documentType59.attributes();
        tag53.attributes = attributes62;
        org.jsoup.parser.Token.StartTag startTag64 = startTag47.nameAttr("<!---->", attributes62);
        tag45.attributes = attributes62;
        char[] charArray67 = new char[] { 'a' };
        tag45.appendAttributeValue(charArray67);
        tag42.appendAttributeValue(charArray67);
        tag37.appendAttributeValue(charArray67);
        tag27.appendAttributeValue(charArray67);
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(startTag20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(attributes40);
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(tag53);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(attributes62);
        org.junit.Assert.assertNotNull(startTag64);
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertArrayEquals(charArray67, new char[] { 'a' });
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        org.jsoup.nodes.Attributes attributes2 = startTag0.attributes;
        boolean boolean3 = startTag0.isStartTag();
        startTag0.appendAttributeName("<<!---->#doctype  name=\"\" publicId=\"hi!\" systemId=\"hi!\">");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.Tag tag3 = tag1.reset();
        tag3.appendTagName('#');
        org.jsoup.parser.Token.StartTag startTag6 = tag3.asStartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag6.reset();
        tag7.appendTagName("<a>");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(startTag6);
        org.junit.Assert.assertNotNull(tag7);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        java.lang.String str4 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        startTag0.appendTagName("<SYSTEM>");
        java.lang.String str8 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag9 = startTag0.reset();
        boolean boolean10 = startTag0.isDoctype();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<system>" + "'", str8, "<system>");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        boolean boolean2 = doctype0.forceQuirks;
        boolean boolean3 = doctype0.isCharacter();
        org.jsoup.parser.Token.Doctype doctype4 = doctype0.asDoctype();
        org.jsoup.parser.Token token5 = doctype4.reset();
        doctype4.forceQuirks = false;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(doctype4);
        org.junit.Assert.assertNotNull(token5);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.nodes.DocumentType documentType7 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean9 = documentType7.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes10 = documentType7.attributes();
        tag1.attributes = attributes10;
        java.lang.String str12 = tag1.tagName;
        tag1.appendAttributeValue('4');
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag16 = startTag15.reset();
        tag16.finaliseTag();
        tag16.appendTagName('4');
        org.jsoup.nodes.Attributes attributes20 = tag16.getAttributes();
        tag1.attributes = attributes20;
        tag1.normalName = "<!---->";
        int[] intArray27 = new int[] { (byte) 1, (byte) 1, (short) 0 };
        tag1.appendAttributeValue(intArray27);
        org.jsoup.parser.Token.StartTag startTag29 = tag1.asStartTag();
        startTag29.appendAttributeName("Doctype");
        org.jsoup.parser.Token.Tag tag33 = startTag29.name("#");
        org.jsoup.parser.Token.Tag tag34 = startTag29.reset();
        org.jsoup.nodes.Attributes attributes35 = startTag29.attributes;
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 1, 1, 0 });
        org.junit.Assert.assertNotNull(startTag29);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNotNull(attributes35);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasSameValue((java.lang.Object) (short) -1);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = documentType4.siblingNodes();
        boolean boolean9 = documentType4.equals((java.lang.Object) 0L);
        org.jsoup.nodes.Node node10 = documentType4.nextSibling();
        org.jsoup.nodes.Node node13 = documentType4.attr("EOF", "4");
        int int14 = documentType4.siblingIndex();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "SYSTEM", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "");
        org.jsoup.nodes.Document document5 = documentType4.ownerDocument();
        org.jsoup.nodes.Document document6 = documentType4.ownerDocument();
        java.lang.String str7 = documentType4.nodeName();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.String str3 = doctype0.getSystemIdentifier();
        boolean boolean4 = doctype0.isComment();
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.String str7 = doctype0.getSystemIdentifier();
        org.jsoup.parser.Token token8 = doctype0.reset();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(token8);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        int int8 = documentType4.childNodeSize();
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Node node10 = documentType4.clone();
        org.jsoup.nodes.Node node11 = documentType4.clone();
        org.jsoup.nodes.Node node12 = node11.clone();
        org.jsoup.nodes.Node node13 = node11.nextSibling();
        org.jsoup.nodes.Node node16 = node11.attr("<!---->", "4doctype");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SYSTEM" + "'", str9, "SYSTEM");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        org.jsoup.nodes.Attributes attributes2 = startTag0.attributes;
        java.lang.String str3 = startTag0.tagName;
        startTag0.appendAttributeValue("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(attributes2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.String str3 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token4 = doctype0.reset();
        boolean boolean5 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder6 = doctype0.name;
        org.jsoup.parser.Token token7 = doctype0.reset();
        java.lang.StringBuilder stringBuilder8 = doctype0.publicIdentifier;
        boolean boolean9 = doctype0.isForceQuirks();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
        org.junit.Assert.assertNotNull(token7);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        xmlTreeBuilder9.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlTreeBuilder9.parseFragment("", "#doctype", parseErrorList17, parseSettings18);
        org.jsoup.parser.Token.Character character20 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder9.insert(character20);
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder25 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings26 = xmlTreeBuilder25.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder9.parseFragment("SYSTEM", "PUBLIC", parseErrorList24, parseSettings26);
        xmlTreeBuilder0.initialiseParse("<SYSTEM>", "Doctype", parseErrorList8, parseSettings26);
        org.jsoup.nodes.DocumentType documentType33 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str34 = documentType33.nodeName();
        org.jsoup.parser.Token.Doctype doctype35 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str36 = doctype35.getName();
        boolean boolean37 = doctype35.forceQuirks;
        org.jsoup.parser.Token token38 = doctype35.reset();
        org.jsoup.parser.Token.TokenType tokenType39 = doctype35.type;
        boolean boolean40 = doctype35.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType41 = doctype35.type;
        boolean boolean42 = documentType33.hasSameValue((java.lang.Object) doctype35);
        xmlTreeBuilder0.insert(doctype35);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder44 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document47 = xmlTreeBuilder44.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment48 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder49 = comment48.data;
        xmlTreeBuilder44.insert(comment48);
        org.jsoup.parser.Token.StartTag startTag51 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str52 = startTag51.normalName;
        startTag51.newAttribute();
        java.lang.String str54 = startTag51.normalName();
        org.jsoup.parser.Token.StartTag startTag56 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag57 = startTag56.reset();
        tag57.finaliseTag();
        org.jsoup.nodes.DocumentType documentType63 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean65 = documentType63.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes66 = documentType63.attributes();
        tag57.attributes = attributes66;
        org.jsoup.parser.Token.StartTag startTag68 = startTag51.nameAttr("<!---->", attributes66);
        java.lang.String str69 = startTag68.name();
        boolean boolean70 = xmlTreeBuilder44.process((org.jsoup.parser.Token) startTag68);
        org.jsoup.parser.Token.Character character71 = new org.jsoup.parser.Token.Character();
        java.lang.String str72 = character71.getData();
        xmlTreeBuilder44.insert(character71);
        org.jsoup.parser.Token.Character character75 = character71.data("");
        xmlTreeBuilder0.insert(character71);
        org.jsoup.parser.Token.Character character78 = character71.data("<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">");
        org.jsoup.parser.Token.Character character80 = character78.data("<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">>");
        java.lang.String str81 = character80.getData();
        boolean boolean82 = character80.isDoctype();
        java.lang.String str83 = character80.getData();
        org.jsoup.parser.Token token84 = character80.reset();
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(parseSettings26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#doctype" + "'", str34, "#doctype");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(token38);
        org.junit.Assert.assertTrue("'" + tokenType39 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType39.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + tokenType41 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType41.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(document47);
        org.junit.Assert.assertNotNull(stringBuilder49);
        org.junit.Assert.assertEquals(stringBuilder49.toString(), "");
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(tag57);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(attributes66);
        org.junit.Assert.assertNotNull(startTag68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "<!---->" + "'", str69, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNotNull(character75);
        org.junit.Assert.assertNotNull(character78);
        org.junit.Assert.assertNotNull(character80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">>" + "'", str81, "<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">>");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">>" + "'", str83, "<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">>");
        org.junit.Assert.assertNotNull(token84);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        xmlTreeBuilder9.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlTreeBuilder9.parseFragment("", "#doctype", parseErrorList17, parseSettings18);
        org.jsoup.parser.Token.Character character20 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder9.insert(character20);
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder25 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings26 = xmlTreeBuilder25.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder9.parseFragment("SYSTEM", "PUBLIC", parseErrorList24, parseSettings26);
        xmlTreeBuilder0.initialiseParse("<SYSTEM>", "Doctype", parseErrorList8, parseSettings26);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.ParseSettings parseSettings33 = null;
        xmlTreeBuilder29.initialiseParse("#doctype", "hi!", parseErrorList32, parseSettings33);
        org.jsoup.parser.Token.Character character35 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder29.insert(character35);
        java.lang.String str37 = character35.getData();
        xmlTreeBuilder0.insert(character35);
        org.jsoup.parser.Token.Comment comment39 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder40 = comment39.data;
        java.lang.String str41 = comment39.toString();
        org.jsoup.parser.Token token42 = comment39.reset();
        org.jsoup.parser.Token token43 = comment39.reset();
        java.lang.String str44 = comment39.toString();
        org.jsoup.parser.Token.Comment comment45 = comment39.asComment();
        xmlTreeBuilder0.insert(comment39);
        org.jsoup.parser.ParseErrorList parseErrorList49 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder50 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document53 = xmlTreeBuilder50.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment54 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder55 = comment54.data;
        xmlTreeBuilder50.insert(comment54);
        org.jsoup.parser.ParseSettings parseSettings57 = xmlTreeBuilder50.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList58 = xmlTreeBuilder0.parseFragment("", "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">", parseErrorList49, parseSettings57);
        org.jsoup.parser.ParseSettings parseSettings59 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document62 = xmlTreeBuilder0.parse("StartTag", "Character");
        org.jsoup.parser.Token.Doctype doctype63 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str64 = doctype63.getName();
        org.jsoup.parser.Token.TokenType tokenType65 = doctype63.type;
        org.jsoup.parser.Token token66 = doctype63.reset();
        java.lang.StringBuilder stringBuilder67 = doctype63.name;
        xmlTreeBuilder0.insert(doctype63);
        boolean boolean69 = doctype63.forceQuirks;
        java.lang.StringBuilder stringBuilder70 = doctype63.systemIdentifier;
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(parseSettings26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(stringBuilder40);
        org.junit.Assert.assertEquals(stringBuilder40.toString(), "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "<!---->" + "'", str41, "<!---->");
        org.junit.Assert.assertNotNull(token42);
        org.junit.Assert.assertNotNull(token43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "<!---->" + "'", str44, "<!---->");
        org.junit.Assert.assertNotNull(comment45);
        org.junit.Assert.assertNotNull(document53);
        org.junit.Assert.assertNotNull(stringBuilder55);
        org.junit.Assert.assertEquals(stringBuilder55.toString(), "");
        org.junit.Assert.assertNotNull(parseSettings57);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertNotNull(parseSettings59);
        org.junit.Assert.assertNotNull(document62);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + tokenType65 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType65.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertNotNull(token66);
        org.junit.Assert.assertNotNull(stringBuilder67);
        org.junit.Assert.assertEquals(stringBuilder67.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(stringBuilder70);
        org.junit.Assert.assertEquals(stringBuilder70.toString(), "");
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        tag1.appendTagName('4');
        java.lang.String str5 = tag1.name();
        java.lang.String str6 = tag1.normalName;
        tag1.appendAttributeValue("hi!");
        org.jsoup.nodes.Attributes attributes9 = tag1.getAttributes();
        java.lang.String str10 = tag1.tagName;
        tag1.tagName = "<<!---->  name=\"\" publicId=\"hi!\" systemId=\"hi!\">";
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4" + "'", str6, "4");
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4" + "'", str10, "4");
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        tag1.appendTagName('4');
        org.jsoup.nodes.Attributes attributes5 = tag1.getAttributes();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag6.reset();
        tag7.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str10 = startTag9.normalName;
        startTag9.newAttribute();
        java.lang.String str12 = startTag9.normalName();
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag15 = startTag14.reset();
        tag15.finaliseTag();
        org.jsoup.nodes.DocumentType documentType21 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean23 = documentType21.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes24 = documentType21.attributes();
        tag15.attributes = attributes24;
        org.jsoup.parser.Token.StartTag startTag26 = startTag9.nameAttr("<!---->", attributes24);
        tag7.attributes = attributes24;
        char[] charArray29 = new char[] { 'a' };
        tag7.appendAttributeValue(charArray29);
        tag1.appendAttributeValue(charArray29);
        tag1.appendTagName("Doctype");
        org.jsoup.parser.Token.TokenType tokenType34 = org.jsoup.parser.Token.TokenType.EOF;
        tag1.type = tokenType34;
        tag1.appendAttributeValue(' ');
        org.jsoup.parser.Token.StartTag startTag38 = tag1.asStartTag();
        startTag38.finaliseTag();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNotNull(startTag26);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + tokenType34 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType34.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertNotNull(startTag38);
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        java.lang.String str4 = comment0.getData();
        java.lang.String str5 = comment0.toString();
        java.lang.String str6 = comment0.getData();
        boolean boolean7 = comment0.bogus;
        java.lang.String str8 = comment0.toString();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!---->" + "'", str8, "<!---->");
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        int int8 = documentType4.childNodeSize();
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Node node10 = documentType4.clone();
        org.jsoup.nodes.Node node12 = documentType4.removeAttr("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node13 = node12.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node13.parentNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SYSTEM" + "'", str9, "SYSTEM");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder5 = comment4.data;
        xmlTreeBuilder0.insert(comment4);
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str8 = startTag7.normalName;
        startTag7.newAttribute();
        java.lang.String str10 = startTag7.normalName();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag13 = startTag12.reset();
        tag13.finaliseTag();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean21 = documentType19.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes22 = documentType19.attributes();
        tag13.attributes = attributes22;
        org.jsoup.parser.Token.StartTag startTag24 = startTag7.nameAttr("<!---->", attributes22);
        java.lang.String str25 = startTag24.name();
        boolean boolean26 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag24);
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder30 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.ParseSettings parseSettings34 = null;
        xmlTreeBuilder30.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList33, parseSettings34);
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        org.jsoup.parser.ParseSettings parseSettings39 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList40 = xmlTreeBuilder30.parseFragment("", "#doctype", parseErrorList38, parseSettings39);
        org.jsoup.parser.Token.Comment comment41 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder42 = comment41.data;
        java.lang.String str43 = comment41.toString();
        org.jsoup.parser.Token token44 = comment41.reset();
        boolean boolean45 = xmlTreeBuilder30.process((org.jsoup.parser.Token) comment41);
        org.jsoup.parser.ParseSettings parseSettings46 = xmlTreeBuilder30.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings47 = xmlTreeBuilder30.defaultSettings();
        xmlTreeBuilder0.initialiseParse("4", "SYSTEM", parseErrorList29, parseSettings47);
        org.jsoup.parser.Token.Comment comment49 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder50 = comment49.data;
        boolean boolean51 = comment49.bogus;
        boolean boolean52 = comment49.isDoctype();
        java.lang.String str53 = comment49.getData();
        xmlTreeBuilder0.insert(comment49);
        java.lang.String str55 = comment49.getData();
        org.jsoup.parser.Token token56 = comment49.reset();
        org.jsoup.parser.Token token57 = comment49.reset();
        org.jsoup.parser.Token token58 = comment49.reset();
        boolean boolean59 = comment49.bogus;
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(startTag24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!---->" + "'", str25, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertNotNull(stringBuilder42);
        org.junit.Assert.assertEquals(stringBuilder42.toString(), "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "<!---->" + "'", str43, "<!---->");
        org.junit.Assert.assertNotNull(token44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(parseSettings46);
        org.junit.Assert.assertNotNull(parseSettings47);
        org.junit.Assert.assertNotNull(stringBuilder50);
        org.junit.Assert.assertEquals(stringBuilder50.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(token56);
        org.junit.Assert.assertNotNull(token57);
        org.junit.Assert.assertNotNull(token58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.nodes.DocumentType documentType7 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean9 = documentType7.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes10 = documentType7.attributes();
        tag1.attributes = attributes10;
        tag1.appendTagName("#doctype");
        tag1.newAttribute();
        tag1.appendTagName("#doctype");
        tag1.tagName = "<!---->";
        tag1.appendAttributeValue(' ');
        java.lang.String str21 = tag1.tagName;
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!---->" + "'", str21, "<!---->");
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        java.lang.String str8 = startTag0.tagName;
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean15 = documentType13.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes16 = documentType13.attributes();
        startTag0.attributes = attributes16;
        boolean boolean18 = startTag0.isDoctype();
        startTag0.tagName = "<SYSTEM>";
        startTag0.selfClosing = false;
        boolean boolean23 = startTag0.isComment();
        startTag0.appendTagName('#');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str5 = documentType4.nodeName();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str7 = doctype6.getName();
        boolean boolean8 = doctype6.forceQuirks;
        org.jsoup.parser.Token token9 = doctype6.reset();
        org.jsoup.parser.Token.TokenType tokenType10 = doctype6.type;
        boolean boolean11 = doctype6.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType12 = doctype6.type;
        boolean boolean13 = documentType4.hasSameValue((java.lang.Object) doctype6);
        org.jsoup.parser.Token token14 = doctype6.reset();
        boolean boolean15 = doctype6.forceQuirks;
        boolean boolean16 = doctype6.isEndTag();
        boolean boolean17 = doctype6.isForceQuirks();
        java.lang.String str18 = doctype6.getSystemIdentifier();
        java.lang.String str19 = doctype6.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node8 = documentType4.nextSibling();
        java.lang.String str9 = documentType4.nodeName();
        java.lang.String str11 = documentType4.attr("StartTag");
        org.jsoup.nodes.Node node12 = documentType4.parentNode();
        java.lang.String str13 = documentType4.toString();
        java.lang.String str14 = documentType4.outerHtml();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str13, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str14, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        boolean boolean3 = tag1.isEndTag();
        boolean boolean4 = tag1.isCharacter();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        org.jsoup.nodes.Node node9 = documentType4.removeAttr("#doctype");
        java.lang.String str10 = documentType4.nodeName();
        org.jsoup.nodes.Node node11 = documentType4.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = documentType4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str6, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str5 = documentType4.nodeName();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str7 = doctype6.getName();
        boolean boolean8 = doctype6.forceQuirks;
        org.jsoup.parser.Token token9 = doctype6.reset();
        org.jsoup.parser.Token.TokenType tokenType10 = doctype6.type;
        boolean boolean11 = doctype6.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType12 = doctype6.type;
        boolean boolean13 = documentType4.hasSameValue((java.lang.Object) doctype6);
        boolean boolean14 = doctype6.isStartTag();
        org.jsoup.parser.Token.TokenType tokenType15 = doctype6.type;
        java.lang.String str16 = doctype6.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.Token.Comment comment6 = new org.jsoup.parser.Token.Comment();
        comment6.bogus = false;
        java.lang.StringBuilder stringBuilder9 = comment6.data;
        java.lang.String str10 = comment6.toString();
        xmlTreeBuilder0.insert(comment6);
        org.jsoup.parser.Token token12 = comment6.reset();
        boolean boolean13 = comment6.bogus;
        org.jsoup.parser.Token token14 = comment6.reset();
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!---->" + "'", str10, "<!---->");
        org.junit.Assert.assertNotNull(token12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(token14);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        org.jsoup.parser.Token.Tag tag8 = startTag0.reset();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag10.reset();
        org.jsoup.parser.Token.Tag tag12 = startTag10.reset();
        org.jsoup.nodes.Attributes attributes13 = startTag10.getAttributes();
        org.jsoup.parser.Token.StartTag startTag14 = startTag0.nameAttr("Doctype", attributes13);
        java.lang.Class<?> wildcardClass15 = startTag0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("SYSTEM", "SYSTEM", "#doctype", "SYSTEM");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("PUBLIC");
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("StartTag");
        org.jsoup.parser.Token.Doctype doctype9 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder10 = doctype9.name;
        boolean boolean11 = doctype9.forceQuirks;
        java.lang.String str12 = doctype9.getPublicIdentifier();
        boolean boolean13 = doctype9.isForceQuirks();
        java.lang.StringBuilder stringBuilder14 = doctype9.publicIdentifier;
        java.lang.String str15 = doctype9.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder16 = doctype9.publicIdentifier;
        boolean boolean17 = node8.hasSameValue((java.lang.Object) doctype9);
        org.jsoup.nodes.Node node18 = node8.clone();
        org.jsoup.nodes.Node node19 = node18.clone();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        xmlTreeBuilder4.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList7, parseSettings8);
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlTreeBuilder4.parseFragment("", "#doctype", parseErrorList12, parseSettings13);
        org.jsoup.parser.Token.Character character15 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder4.insert(character15);
        xmlTreeBuilder0.insert(character15);
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Doctype doctype19 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder20 = doctype19.name;
        java.lang.StringBuilder stringBuilder21 = doctype19.systemIdentifier;
        boolean boolean22 = doctype19.isComment();
        org.jsoup.parser.Token.Doctype doctype23 = doctype19.asDoctype();
        boolean boolean24 = doctype23.forceQuirks;
        boolean boolean25 = doctype23.isEOF();
        xmlTreeBuilder0.insert(doctype23);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(doctype23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node8 = documentType4.attr("hi!", "hi!");
        int int9 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node10 = documentType4.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList11 = node10.childNodesCopy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">");
        org.jsoup.parser.TokeniserState tokeniserState14 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapedLessthanSign;
        boolean boolean15 = document13.equals((java.lang.Object) tokeniserState14);
        java.util.List<org.jsoup.nodes.Node> nodeList16 = document13.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = document13.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = document13.childNodesCopy();
        java.lang.String str20 = document13.attr("starttag");
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder5 = comment4.data;
        xmlTreeBuilder0.insert(comment4);
        org.jsoup.parser.Token.Character character7 = new org.jsoup.parser.Token.Character();
        java.lang.String str8 = character7.getData();
        org.jsoup.parser.Token.Character character10 = character7.data("<!---->");
        xmlTreeBuilder0.insert(character7);
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag14 = startTag13.reset();
        tag14.finaliseTag();
        tag14.appendTagName('4');
        org.jsoup.nodes.Attributes attributes18 = tag14.getAttributes();
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag20 = startTag19.reset();
        tag20.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str23 = startTag22.normalName;
        startTag22.newAttribute();
        java.lang.String str25 = startTag22.normalName();
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag28 = startTag27.reset();
        tag28.finaliseTag();
        org.jsoup.nodes.DocumentType documentType34 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean36 = documentType34.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes37 = documentType34.attributes();
        tag28.attributes = attributes37;
        org.jsoup.parser.Token.StartTag startTag39 = startTag22.nameAttr("<!---->", attributes37);
        tag20.attributes = attributes37;
        char[] charArray42 = new char[] { 'a' };
        tag20.appendAttributeValue(charArray42);
        tag14.appendAttributeValue(charArray42);
        char[] charArray49 = new char[] { 'a', ' ', '4', ' ' };
        tag14.appendAttributeValue(charArray49);
        org.jsoup.parser.Token.StartTag startTag51 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag52 = startTag51.reset();
        org.jsoup.parser.Token.Tag tag53 = startTag51.reset();
        org.jsoup.parser.Token.StartTag startTag54 = tag53.asStartTag();
        org.jsoup.parser.Token.StartTag startTag55 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str56 = startTag55.normalName;
        org.jsoup.nodes.Attributes attributes57 = startTag55.attributes;
        startTag54.attributes = attributes57;
        tag14.attributes = attributes57;
        boolean boolean60 = xmlTreeBuilder0.processStartTag("<<SYSTEM>>", attributes57);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder61 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList64 = null;
        org.jsoup.parser.ParseSettings parseSettings65 = null;
        xmlTreeBuilder61.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList64, parseSettings65);
        org.jsoup.parser.ParseErrorList parseErrorList69 = null;
        org.jsoup.parser.ParseSettings parseSettings70 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList71 = xmlTreeBuilder61.parseFragment("", "#doctype", parseErrorList69, parseSettings70);
        org.jsoup.parser.Token.Character character72 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder61.insert(character72);
        org.jsoup.parser.Token.Character character75 = character72.data("<!---->");
        java.lang.String str76 = character72.toString();
        xmlTreeBuilder0.insert(character72);
        boolean boolean78 = character72.isEndTag();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(character10);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertNotNull(startTag39);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] { 'a' });
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertArrayEquals(charArray49, new char[] { 'a', ' ', '4', ' ' });
        org.junit.Assert.assertNotNull(tag52);
        org.junit.Assert.assertNotNull(tag53);
        org.junit.Assert.assertNotNull(startTag54);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(attributes57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(nodeList71);
        org.junit.Assert.assertNotNull(character75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "<!---->" + "'", str76, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">");
        org.jsoup.parser.ParseSettings parseSettings14 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder18 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document21 = xmlTreeBuilder18.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment22 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder23 = comment22.data;
        xmlTreeBuilder18.insert(comment22);
        org.jsoup.parser.Token.StartTag startTag25 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str26 = startTag25.normalName;
        startTag25.newAttribute();
        java.lang.String str28 = startTag25.normalName();
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag31 = startTag30.reset();
        tag31.finaliseTag();
        org.jsoup.nodes.DocumentType documentType37 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean39 = documentType37.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes40 = documentType37.attributes();
        tag31.attributes = attributes40;
        org.jsoup.parser.Token.StartTag startTag42 = startTag25.nameAttr("<!---->", attributes40);
        java.lang.String str43 = startTag42.name();
        boolean boolean44 = xmlTreeBuilder18.process((org.jsoup.parser.Token) startTag42);
        org.jsoup.parser.ParseErrorList parseErrorList47 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder48 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList51 = null;
        org.jsoup.parser.ParseSettings parseSettings52 = null;
        xmlTreeBuilder48.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList51, parseSettings52);
        org.jsoup.parser.ParseErrorList parseErrorList56 = null;
        org.jsoup.parser.ParseSettings parseSettings57 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList58 = xmlTreeBuilder48.parseFragment("", "#doctype", parseErrorList56, parseSettings57);
        org.jsoup.parser.Token.Comment comment59 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder60 = comment59.data;
        java.lang.String str61 = comment59.toString();
        org.jsoup.parser.Token token62 = comment59.reset();
        boolean boolean63 = xmlTreeBuilder48.process((org.jsoup.parser.Token) comment59);
        org.jsoup.parser.ParseSettings parseSettings64 = xmlTreeBuilder48.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings65 = xmlTreeBuilder48.defaultSettings();
        xmlTreeBuilder18.initialiseParse("4", "SYSTEM", parseErrorList47, parseSettings65);
        xmlTreeBuilder0.initialiseParse("#doctype", "< >", parseErrorList17, parseSettings65);
        org.jsoup.parser.Token.StartTag startTag68 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str69 = startTag68.normalName;
        startTag68.newAttribute();
        java.lang.String str71 = startTag68.normalName();
        startTag68.appendAttributeName("");
        startTag68.normalName = "hi!";
        startTag68.appendTagName("PUBLIC");
        org.jsoup.parser.Token.Tag tag78 = startTag68.reset();
        startTag68.normalName = "<!---->";
        startTag68.normalName = "EOF";
        java.lang.String str83 = startTag68.normalName;
        startTag68.appendTagName('4');
        boolean boolean86 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag68);
        org.jsoup.nodes.Document document89 = xmlTreeBuilder0.parse(" ", "<<SYSTEM>></<SYSTEM>>");
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(tag31);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(attributes40);
        org.junit.Assert.assertNotNull(startTag42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "<!---->" + "'", str43, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertNotNull(stringBuilder60);
        org.junit.Assert.assertEquals(stringBuilder60.toString(), "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "<!---->" + "'", str61, "<!---->");
        org.junit.Assert.assertNotNull(token62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(parseSettings64);
        org.junit.Assert.assertNotNull(parseSettings65);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNotNull(tag78);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "EOF" + "'", str83, "EOF");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(document89);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        org.jsoup.nodes.Document document8 = documentType4.ownerDocument();
        java.lang.String str9 = documentType4.nodeName();
        java.lang.String str10 = documentType4.nodeName();
        java.lang.String str12 = documentType4.attr("<!---->");
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str18 = documentType17.nodeName();
        boolean boolean19 = documentType4.hasSameValue((java.lang.Object) documentType17);
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str21 = startTag20.normalName;
        startTag20.newAttribute();
        java.lang.String str23 = startTag20.normalName();
        startTag20.appendAttributeName("");
        startTag20.normalName = "hi!";
        org.jsoup.parser.Token.StartTag startTag29 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str30 = startTag29.normalName;
        org.jsoup.nodes.Attributes attributes31 = startTag29.attributes;
        org.jsoup.parser.Token.StartTag startTag32 = startTag20.nameAttr("SYSTEM", attributes31);
        startTag32.tagName = "PUBLIC";
        org.jsoup.parser.Token.TokenType tokenType35 = startTag32.type;
        org.jsoup.parser.Token.Tag tag36 = startTag32.reset();
        boolean boolean37 = documentType17.hasSameValue((java.lang.Object) tag36);
        java.lang.String str38 = tag36.normalName();
        org.jsoup.nodes.Attributes attributes39 = tag36.attributes;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#doctype" + "'", str9, "#doctype");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#doctype" + "'", str10, "#doctype");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#doctype" + "'", str18, "#doctype");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertNotNull(startTag32);
        org.junit.Assert.assertTrue("'" + tokenType35 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType35.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(attributes39);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        boolean boolean6 = startTag0.isSelfClosing();
        startTag0.appendAttributeName("<4>");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        java.lang.String str2 = comment0.toString();
        java.lang.String str3 = comment0.getData();
        java.lang.StringBuilder stringBuilder4 = comment0.data;
        org.jsoup.parser.Token token5 = comment0.reset();
        java.lang.String str6 = comment0.toString();
        java.lang.String str7 = comment0.toString();
        org.jsoup.parser.Token.Comment comment8 = comment0.asComment();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(token5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!---->" + "'", str6, "<!---->");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!---->" + "'", str7, "<!---->");
        org.junit.Assert.assertNotNull(comment8);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.String str3 = doctype0.getSystemIdentifier();
        doctype0.forceQuirks = true;
        java.lang.StringBuilder stringBuilder6 = doctype0.systemIdentifier;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(stringBuilder6);
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "");
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        int int8 = documentType4.childNodeSize();
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Node node10 = documentType4.clone();
        org.jsoup.nodes.Node node11 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodes();
        java.lang.String str14 = documentType4.attr("<!---->4");
        org.jsoup.nodes.Node node16 = documentType4.removeAttr("a");
        org.jsoup.nodes.Attributes attributes17 = documentType4.attributes();
        org.jsoup.nodes.Attributes attributes18 = documentType4.attributes();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SYSTEM" + "'", str9, "SYSTEM");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("SYSTEM", "SYSTEM", "#doctype", "SYSTEM");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("PUBLIC");
        org.jsoup.nodes.Node node8 = documentType4.removeAttr("StartTag");
        org.jsoup.parser.Token.Doctype doctype9 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder10 = doctype9.name;
        boolean boolean11 = doctype9.forceQuirks;
        java.lang.String str12 = doctype9.getPublicIdentifier();
        boolean boolean13 = doctype9.isForceQuirks();
        java.lang.StringBuilder stringBuilder14 = doctype9.publicIdentifier;
        java.lang.String str15 = doctype9.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder16 = doctype9.publicIdentifier;
        boolean boolean17 = node8.hasSameValue((java.lang.Object) doctype9);
        org.jsoup.nodes.Node node19 = node8.removeAttr("EOF");
        java.lang.String str20 = node8.toString();
        int int21 = node8.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = node8.before("<<!---->a>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">" + "'", str20, "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str5 = documentType4.nodeName();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str7 = doctype6.getName();
        boolean boolean8 = doctype6.forceQuirks;
        org.jsoup.parser.Token token9 = doctype6.reset();
        org.jsoup.parser.Token.TokenType tokenType10 = doctype6.type;
        boolean boolean11 = doctype6.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType12 = doctype6.type;
        boolean boolean13 = documentType4.hasSameValue((java.lang.Object) doctype6);
        org.jsoup.parser.Token token14 = doctype6.reset();
        boolean boolean15 = doctype6.forceQuirks;
        java.lang.StringBuilder stringBuilder16 = doctype6.publicIdentifier;
        java.lang.String str17 = doctype6.getSystemIdentifier();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">");
        int int14 = document13.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = document13.childNodes();
        document13.setBaseUri("Comment");
        int int18 = document13.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            document13.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList8, parseSettings9);
        org.jsoup.parser.Token.Character character11 = new org.jsoup.parser.Token.Character();
        java.lang.String str12 = character11.getData();
        xmlTreeBuilder0.insert(character11);
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.ParseSettings parseSettings21 = null;
        xmlTreeBuilder17.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList20, parseSettings21);
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder17.parseFragment("", "#doctype", parseErrorList25, parseSettings26);
        org.jsoup.parser.Token.Character character28 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder17.insert(character28);
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings34 = xmlTreeBuilder33.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = xmlTreeBuilder17.parseFragment("SYSTEM", "PUBLIC", parseErrorList32, parseSettings34);
        java.util.List<org.jsoup.nodes.Node> nodeList36 = xmlTreeBuilder0.parseFragment("#doctype", "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">", parseErrorList16, parseSettings34);
        org.jsoup.parser.ParseSettings parseSettings37 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str39 = startTag38.normalName;
        startTag38.newAttribute();
        java.lang.String str41 = startTag38.normalName();
        java.lang.String str42 = startTag38.normalName();
        org.jsoup.parser.Token.Tag tag43 = startTag38.reset();
        boolean boolean44 = startTag38.isDoctype();
        org.jsoup.parser.Token.Tag tag46 = startTag38.name("Doctype");
        startTag38.appendAttributeName("<<SYSTEM>>");
        org.jsoup.nodes.Element element49 = xmlTreeBuilder0.insert(startTag38);
        org.jsoup.parser.Token.StartTag startTag51 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag52 = startTag51.reset();
        org.jsoup.parser.Token.Tag tag53 = startTag51.reset();
        org.jsoup.nodes.DocumentType documentType59 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str60 = documentType59.nodeName();
        org.jsoup.nodes.Attributes attributes61 = documentType59.attributes();
        org.jsoup.parser.Token.StartTag startTag62 = startTag51.nameAttr("", attributes61);
        org.jsoup.parser.Token.StartTag startTag63 = startTag38.nameAttr("<!DOCTYPE #doctype PUBLIC \"4\" \"PUBLIC\">", attributes61);
        boolean boolean64 = startTag63.isSelfClosing();
        org.jsoup.parser.Token.Tag tag66 = startTag63.name("StartTag");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertNotNull(element49);
        org.junit.Assert.assertNotNull(tag52);
        org.junit.Assert.assertNotNull(tag53);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "#doctype" + "'", str60, "#doctype");
        org.junit.Assert.assertNotNull(attributes61);
        org.junit.Assert.assertNotNull(startTag62);
        org.junit.Assert.assertNotNull(startTag63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(tag66);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        java.lang.String str4 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        startTag0.appendTagName("<SYSTEM>");
        java.lang.String str8 = startTag0.toString();
        java.lang.String str9 = startTag0.tokenType();
        org.jsoup.parser.Token.Tag tag10 = startTag0.reset();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<<SYSTEM>>" + "'", str8, "<<SYSTEM>>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "StartTag" + "'", str9, "StartTag");
        org.junit.Assert.assertNotNull(tag10);
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.Tag tag3 = tag1.reset();
        org.jsoup.nodes.Attributes attributes4 = tag3.attributes;
        org.jsoup.parser.Token.Tag tag5 = tag3.reset();
        tag5.normalName = "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">";
        tag5.setEmptyAttributeValue();
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int14 = documentType13.siblingIndex();
        java.lang.String str15 = documentType13.toString();
        org.jsoup.nodes.Node node16 = documentType13.clone();
        int int17 = node16.siblingIndex();
        java.lang.String str19 = node16.absUrl("4");
        java.lang.String str20 = node16.toString();
        org.jsoup.nodes.Attributes attributes21 = node16.attributes();
        tag5.attributes = attributes21;
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str24 = startTag23.normalName;
        startTag23.newAttribute();
        org.jsoup.parser.Token.Tag tag26 = startTag23.reset();
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag28 = startTag27.reset();
        tag28.finaliseTag();
        tag28.appendTagName('4');
        int[] intArray35 = new int[] { 0, ' ', '#' };
        tag28.appendAttributeValue(intArray35);
        startTag23.appendAttributeValue(intArray35);
        org.jsoup.parser.Token.StartTag startTag39 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag40 = startTag39.reset();
        tag40.finaliseTag();
        org.jsoup.parser.Token.Tag tag42 = tag40.reset();
        org.jsoup.nodes.Attributes attributes43 = tag42.attributes;
        org.jsoup.parser.Token.StartTag startTag44 = startTag23.nameAttr("<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">", attributes43);
        tag5.attributes = attributes43;
        tag5.appendTagName('4');
        org.jsoup.nodes.Attributes attributes48 = tag5.getAttributes();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str15, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str20, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 0, 32, 35 });
        org.junit.Assert.assertNotNull(tag40);
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertNotNull(attributes43);
        org.junit.Assert.assertNotNull(startTag44);
        org.junit.Assert.assertNotNull(attributes48);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        startTag0.finaliseTag();
        startTag0.appendTagName('#');
        startTag0.finaliseTag();
        boolean boolean7 = startTag0.isEOF();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag9 = startTag8.reset();
        tag9.finaliseTag();
        org.jsoup.parser.Token.Tag tag11 = tag9.reset();
        tag11.appendTagName('#');
        char[] charArray15 = new char[] { 'a' };
        tag11.appendAttributeValue(charArray15);
        boolean boolean17 = tag11.isCharacter();
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag19 = startTag18.reset();
        tag19.finaliseTag();
        org.jsoup.parser.Token.Tag tag21 = tag19.reset();
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str23 = startTag22.normalName;
        startTag22.newAttribute();
        org.jsoup.parser.Token.Tag tag25 = startTag22.reset();
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag27 = startTag26.reset();
        tag27.finaliseTag();
        tag27.appendTagName('4');
        int[] intArray34 = new int[] { 0, ' ', '#' };
        tag27.appendAttributeValue(intArray34);
        startTag22.appendAttributeValue(intArray34);
        org.jsoup.parser.Token.StartTag startTag38 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag39 = startTag38.reset();
        tag39.finaliseTag();
        org.jsoup.parser.Token.Tag tag41 = tag39.reset();
        org.jsoup.nodes.Attributes attributes42 = tag41.attributes;
        org.jsoup.parser.Token.StartTag startTag43 = startTag22.nameAttr("<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">", attributes42);
        org.jsoup.parser.Token.Tag tag44 = startTag22.reset();
        org.jsoup.parser.Token.StartTag startTag45 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str46 = startTag45.normalName;
        startTag45.newAttribute();
        org.jsoup.parser.Token.Tag tag48 = startTag45.reset();
        org.jsoup.parser.Token.StartTag startTag49 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag50 = startTag49.reset();
        tag50.finaliseTag();
        tag50.appendTagName('4');
        int[] intArray57 = new int[] { 0, ' ', '#' };
        tag50.appendAttributeValue(intArray57);
        startTag45.appendAttributeValue(intArray57);
        startTag22.appendAttributeValue(intArray57);
        tag21.appendAttributeValue(intArray57);
        tag11.appendAttributeValue(intArray57);
        startTag0.appendAttributeValue(intArray57);
        org.jsoup.parser.Token.Tag tag64 = startTag0.reset();
        org.jsoup.parser.Token.StartTag startTag65 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str66 = startTag65.normalName;
        startTag65.newAttribute();
        java.lang.String str68 = startTag65.normalName();
        java.lang.String str69 = startTag65.normalName();
        org.jsoup.parser.Token.Tag tag70 = startTag65.reset();
        java.lang.String str71 = startTag65.tagName;
        org.jsoup.parser.Token.Tag tag72 = startTag65.reset();
        org.jsoup.nodes.DocumentType documentType78 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean80 = documentType78.hasAttr("hi!");
        int int81 = documentType78.childNodeSize();
        org.jsoup.nodes.Node node82 = documentType78.nextSibling();
        org.jsoup.nodes.Node node83 = documentType78.clone();
        org.jsoup.parser.Token.StartTag startTag84 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str85 = startTag84.normalName;
        startTag84.newAttribute();
        java.lang.String str87 = startTag84.normalName();
        org.jsoup.parser.Token.Doctype doctype88 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str89 = doctype88.getName();
        org.jsoup.parser.Token.TokenType tokenType90 = doctype88.type;
        startTag84.type = tokenType90;
        boolean boolean92 = documentType78.equals((java.lang.Object) startTag84);
        startTag84.setEmptyAttributeValue();
        org.jsoup.nodes.Attributes attributes94 = startTag84.getAttributes();
        org.jsoup.parser.Token.StartTag startTag95 = startTag65.nameAttr("", attributes94);
        startTag0.attributes = attributes94;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(tag25);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { 0, 32, 35 });
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertNotNull(startTag43);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(tag48);
        org.junit.Assert.assertNotNull(tag50);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { 0, 32, 35 });
        org.junit.Assert.assertNotNull(tag64);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNotNull(tag70);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNotNull(tag72);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNull(node82);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertNull(str85);
        org.junit.Assert.assertNull(str87);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertTrue("'" + tokenType90 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType90.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(attributes94);
        org.junit.Assert.assertNotNull(startTag95);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = documentType4.clone();
        org.jsoup.nodes.Attributes attributes8 = node7.attributes();
        org.jsoup.nodes.Node node9 = node7.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes10 = node9.attributes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        boolean boolean6 = startTag0.isSelfClosing();
        org.jsoup.parser.Token.Tag tag7 = startTag0.reset();
        tag7.finaliseTag();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag7);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        org.jsoup.parser.Token.Tag tag8 = startTag0.reset();
        startTag0.appendTagName(' ');
        java.lang.String str11 = startTag0.name();
        java.lang.String str12 = startTag0.normalName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " " + "'", str11, " ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " " + "'", str12, " ");
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        org.jsoup.parser.Token.Tag tag8 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag10 = tag8.name("Doctype");
        tag10.appendAttributeName("4");
        boolean boolean13 = tag10.isEndTag();
        tag10.appendAttributeValue(' ');
        tag10.appendAttributeName("PUBLIC");
        org.jsoup.parser.Token.TokenType tokenType18 = org.jsoup.parser.Token.TokenType.Comment;
        tag10.type = tokenType18;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + tokenType18 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType18.equals(org.jsoup.parser.Token.TokenType.Comment));
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str4 = startTag3.normalName;
        startTag3.newAttribute();
        java.lang.String str6 = startTag3.normalName();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag9 = startTag8.reset();
        tag9.finaliseTag();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean17 = documentType15.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes18 = documentType15.attributes();
        tag9.attributes = attributes18;
        org.jsoup.parser.Token.StartTag startTag20 = startTag3.nameAttr("<!---->", attributes18);
        tag1.attributes = attributes18;
        char[] charArray23 = new char[] { 'a' };
        tag1.appendAttributeValue(charArray23);
        tag1.appendAttributeValue('a');
        org.jsoup.parser.Token token27 = tag1.reset();
        org.jsoup.parser.Token.Tag tag28 = tag1.reset();
        tag1.appendAttributeValue("<PUBLICa>");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(startTag20);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] { 'a' });
        org.junit.Assert.assertNotNull(token27);
        org.junit.Assert.assertNotNull(tag28);
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "SYSTEM", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "");
        org.jsoup.nodes.Node node5 = documentType4.clone();
        org.jsoup.nodes.Node node6 = documentType4.previousSibling();
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder5 = comment4.data;
        xmlTreeBuilder0.insert(comment4);
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean14 = documentType12.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Node node15 = documentType12.nextSibling();
        org.jsoup.parser.Token.Doctype doctype16 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder17 = doctype16.name;
        java.lang.StringBuilder stringBuilder18 = doctype16.systemIdentifier;
        boolean boolean19 = doctype16.isComment();
        boolean boolean20 = doctype16.isComment();
        boolean boolean21 = documentType12.hasSameValue((java.lang.Object) doctype16);
        xmlTreeBuilder0.insert(doctype16);
        org.jsoup.parser.ParseSettings parseSettings23 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document26 = xmlTreeBuilder0.parse("StartTag", "StartTag");
        org.jsoup.nodes.Attributes attributes27 = document26.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = document26.childNodesCopy();
        document26.setBaseUri("Comment");
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(parseSettings23);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertNotNull(nodeList28);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.toString();
        org.jsoup.parser.Token.Character character3 = character0.data("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.parser.Token.Character character5 = character3.data("<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">>");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(character3);
        org.junit.Assert.assertNotNull(character5);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.nodes.DocumentType documentType7 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean9 = documentType7.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes10 = documentType7.attributes();
        tag1.attributes = attributes10;
        java.lang.String str12 = tag1.tagName;
        boolean boolean13 = tag1.selfClosing;
        java.lang.String str14 = tag1.normalName;
        java.lang.String str15 = tag1.tokenType();
        java.lang.String str16 = tag1.normalName();
        org.jsoup.parser.Token.Tag tag17 = tag1.reset();
        tag17.appendTagName("<!doctype <!DOCTYPE PUBLIC \"hi!\" \"hi!\">>");
        tag17.appendAttributeName('4');
        tag17.appendAttributeValue('a');
        boolean boolean24 = tag17.isDoctype();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "StartTag" + "'", str15, "StartTag");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        int int8 = node7.siblingIndex();
        java.lang.String str10 = node7.absUrl("4");
        java.lang.String str11 = node7.baseUri();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str6, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "SYSTEM" + "'", str11, "SYSTEM");
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str4 = startTag3.normalName;
        startTag3.newAttribute();
        java.lang.String str6 = startTag3.normalName();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag9 = startTag8.reset();
        tag9.finaliseTag();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean17 = documentType15.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes18 = documentType15.attributes();
        tag9.attributes = attributes18;
        org.jsoup.parser.Token.StartTag startTag20 = startTag3.nameAttr("<!---->", attributes18);
        tag1.attributes = attributes18;
        tag1.appendAttributeValue(' ');
        tag1.appendAttributeName(' ');
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(startTag20);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        org.jsoup.nodes.Attributes attributes4 = document3.attributes();
        org.jsoup.nodes.Document document5 = document3.ownerDocument();
        org.jsoup.nodes.Node node6 = document3.clone();
        int int7 = document3.siblingIndex();
        int int8 = document3.childNodeSize();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        java.lang.String str2 = comment0.toString();
        boolean boolean3 = comment0.isDoctype();
        boolean boolean4 = comment0.isCharacter();
        boolean boolean5 = comment0.isStartTag();
        comment0.bogus = false;
        boolean boolean8 = comment0.bogus;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder5 = comment4.data;
        xmlTreeBuilder0.insert(comment4);
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean14 = documentType12.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Node node15 = documentType12.nextSibling();
        org.jsoup.parser.Token.Doctype doctype16 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder17 = doctype16.name;
        java.lang.StringBuilder stringBuilder18 = doctype16.systemIdentifier;
        boolean boolean19 = doctype16.isComment();
        boolean boolean20 = doctype16.isComment();
        boolean boolean21 = documentType12.hasSameValue((java.lang.Object) doctype16);
        xmlTreeBuilder0.insert(doctype16);
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str24 = startTag23.normalName;
        startTag23.newAttribute();
        java.lang.String str26 = startTag23.normalName();
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag29 = startTag28.reset();
        tag29.finaliseTag();
        org.jsoup.nodes.DocumentType documentType35 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean37 = documentType35.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes38 = documentType35.attributes();
        tag29.attributes = attributes38;
        org.jsoup.parser.Token.StartTag startTag40 = startTag23.nameAttr("<!---->", attributes38);
        startTag23.appendAttributeName("StartTag");
        startTag23.appendTagName("#doctype");
        org.jsoup.nodes.Attributes attributes45 = startTag23.attributes;
        org.jsoup.nodes.Element element46 = xmlTreeBuilder0.insert(startTag23);
        org.jsoup.parser.ParseSettings parseSettings47 = xmlTreeBuilder0.defaultSettings();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertNotNull(startTag40);
        org.junit.Assert.assertNotNull(attributes45);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(parseSettings47);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder5 = comment4.data;
        xmlTreeBuilder0.insert(comment4);
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean14 = documentType12.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Node node15 = documentType12.nextSibling();
        org.jsoup.parser.Token.Doctype doctype16 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder17 = doctype16.name;
        java.lang.StringBuilder stringBuilder18 = doctype16.systemIdentifier;
        boolean boolean19 = doctype16.isComment();
        boolean boolean20 = doctype16.isComment();
        boolean boolean21 = documentType12.hasSameValue((java.lang.Object) doctype16);
        xmlTreeBuilder0.insert(doctype16);
        org.jsoup.nodes.Document document25 = xmlTreeBuilder0.parse("Comment", "Comment");
        org.jsoup.parser.Token.Comment comment26 = new org.jsoup.parser.Token.Comment();
        comment26.bogus = false;
        java.lang.StringBuilder stringBuilder29 = comment26.data;
        org.jsoup.parser.Token.Comment comment30 = comment26.asComment();
        boolean boolean31 = document25.equals((java.lang.Object) comment30);
        comment30.bogus = true;
        java.lang.StringBuilder stringBuilder34 = comment30.data;
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(stringBuilder29);
        org.junit.Assert.assertEquals(stringBuilder29.toString(), "");
        org.junit.Assert.assertNotNull(comment30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "");
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.String str3 = doctype0.getSystemIdentifier();
        doctype0.forceQuirks = true;
        boolean boolean6 = doctype0.isForceQuirks();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.EndTag endTag7 = doctype0.asEndTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Doctype cannot be cast to class org.jsoup.parser.Token$EndTag (org.jsoup.parser.Token$Doctype and org.jsoup.parser.Token$EndTag are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        boolean boolean7 = documentType4.hasAttr("");
        org.jsoup.nodes.Node node8 = documentType4.parentNode();
        int int9 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node10 = documentType4.clone();
        java.lang.String str11 = documentType4.toString();
        org.jsoup.nodes.Node node13 = documentType4.removeAttr("<SYSTEM >");
        int int14 = node13.childNodeSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str11, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">");
        org.jsoup.parser.TokeniserState tokeniserState14 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapedLessthanSign;
        boolean boolean15 = document13.equals((java.lang.Object) tokeniserState14);
        java.util.List<org.jsoup.nodes.Node> nodeList16 = document13.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = document13.siblingNodes();
        org.jsoup.parser.Token.Comment comment18 = new org.jsoup.parser.Token.Comment();
        comment18.bogus = false;
        java.lang.StringBuilder stringBuilder21 = comment18.data;
        boolean boolean22 = comment18.isEOF();
        java.lang.String str23 = comment18.toString();
        java.lang.String str24 = comment18.getData();
        comment18.bogus = false;
        boolean boolean27 = comment18.bogus;
        org.jsoup.parser.Token.TokenType tokenType28 = comment18.type;
        boolean boolean29 = document13.hasSameValue((java.lang.Object) tokenType28);
        java.util.List<org.jsoup.nodes.Node> nodeList30 = document13.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = document13.before("Character");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<!---->" + "'", str23, "<!---->");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + tokenType28 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType28.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(nodeList30);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean9 = documentType4.equals(obj8);
        java.lang.String str10 = documentType4.toString();
        org.jsoup.nodes.Attributes attributes11 = documentType4.attributes();
        org.jsoup.nodes.Node node14 = documentType4.attr("<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">", "hi!");
        org.jsoup.nodes.Node node15 = documentType4.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node15.parentNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str10, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        java.lang.StringBuilder stringBuilder2 = doctype0.systemIdentifier;
        boolean boolean3 = doctype0.isComment();
        java.lang.String str4 = doctype0.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        boolean boolean6 = doctype0.forceQuirks;
        boolean boolean7 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder8 = doctype0.name;
        java.lang.String str9 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder2);
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        tag1.appendTagName('4');
        java.lang.String str5 = tag1.name();
        org.jsoup.parser.Token.Tag tag6 = tag1.reset();
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag8 = startTag7.reset();
        tag8.finaliseTag();
        tag8.appendTagName('4');
        org.jsoup.nodes.Attributes attributes12 = tag8.getAttributes();
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag14 = startTag13.reset();
        tag14.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str17 = startTag16.normalName;
        startTag16.newAttribute();
        java.lang.String str19 = startTag16.normalName();
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag22 = startTag21.reset();
        tag22.finaliseTag();
        org.jsoup.nodes.DocumentType documentType28 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean30 = documentType28.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes31 = documentType28.attributes();
        tag22.attributes = attributes31;
        org.jsoup.parser.Token.StartTag startTag33 = startTag16.nameAttr("<!---->", attributes31);
        tag14.attributes = attributes31;
        char[] charArray36 = new char[] { 'a' };
        tag14.appendAttributeValue(charArray36);
        tag8.appendAttributeValue(charArray36);
        tag6.appendAttributeValue(charArray36);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype40 = tag6.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$StartTag cannot be cast to class org.jsoup.parser.Token$Doctype (org.jsoup.parser.Token$StartTag and org.jsoup.parser.Token$Doctype are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertNotNull(startTag33);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { 'a' });
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("PUBLIC", "<<SYSTEM>4>", "<<!---->4  name=\"\" publicId=\"hi!\" systemId=\"hi!\">", "<PUBLICa>");
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str5 = documentType4.nodeName();
        org.jsoup.parser.Token.Doctype doctype6 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str7 = doctype6.getName();
        boolean boolean8 = doctype6.forceQuirks;
        org.jsoup.parser.Token token9 = doctype6.reset();
        org.jsoup.parser.Token.TokenType tokenType10 = doctype6.type;
        boolean boolean11 = doctype6.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType12 = doctype6.type;
        boolean boolean13 = documentType4.hasSameValue((java.lang.Object) doctype6);
        org.jsoup.parser.Token token14 = doctype6.reset();
        boolean boolean15 = doctype6.forceQuirks;
        boolean boolean16 = doctype6.isEndTag();
        boolean boolean17 = doctype6.forceQuirks;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#doctype" + "'", str5, "#doctype");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + tokenType10 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType10.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        startTag0.appendTagName("PUBLIC");
        startTag0.appendTagName('a');
        org.jsoup.parser.Token.StartTag startTag12 = startTag0.asStartTag();
        boolean boolean13 = startTag0.isStartTag();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(startTag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        org.jsoup.parser.Token.Tag tag8 = startTag0.reset();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag11 = startTag10.reset();
        org.jsoup.parser.Token.Tag tag12 = startTag10.reset();
        org.jsoup.nodes.Attributes attributes13 = startTag10.getAttributes();
        org.jsoup.parser.Token.StartTag startTag14 = startTag0.nameAttr("Doctype", attributes13);
        boolean boolean15 = startTag14.isSelfClosing();
        boolean boolean16 = startTag14.isEndTag();
        org.jsoup.nodes.Attributes attributes17 = startTag14.getAttributes();
        java.lang.String str18 = startTag14.tagName;
        org.jsoup.parser.Token token19 = startTag14.reset();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Doctype" + "'", str18, "Doctype");
        org.junit.Assert.assertNotNull(token19);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        org.jsoup.nodes.Node node8 = documentType4.attr("hi!", "hi!");
        org.jsoup.nodes.Node node9 = documentType4.parentNode();
        java.lang.String str11 = documentType4.attr("Doctype");
        java.lang.String str12 = documentType4.nodeName();
        org.jsoup.nodes.DocumentType documentType17 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean19 = documentType17.hasAttr("hi!");
        int int20 = documentType17.childNodeSize();
        org.jsoup.nodes.Node node21 = documentType17.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = documentType17.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = documentType17.siblingNodes();
        documentType17.setBaseUri(" ");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = documentType17.childNodesCopy();
        org.jsoup.nodes.Document document27 = documentType17.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.replaceWith((org.jsoup.nodes.Node) documentType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#doctype" + "'", str12, "#doctype");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNull(document27);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        org.jsoup.parser.Token.Comment comment4 = comment0.asComment();
        java.lang.String str5 = comment4.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character6 = comment4.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.jsoup.parser.Token$Comment cannot be cast to class org.jsoup.parser.Token$Character (org.jsoup.parser.Token$Comment and org.jsoup.parser.Token$Character are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(comment4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!---->" + "'", str5, "<!---->");
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag2 = startTag0.reset();
        org.jsoup.parser.Token.StartTag startTag3 = tag2.asStartTag();
        boolean boolean4 = startTag3.isStartTag();
        startTag3.tagName = "<!DOCTYPE <!DOCTYPE PUBLIC> PUBLIC \"#doctype\" \"4\">";
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        java.lang.String str2 = comment0.toString();
        boolean boolean3 = comment0.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType4 = comment0.type;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + tokenType4 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType4.equals(org.jsoup.parser.Token.TokenType.Comment));
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        boolean boolean5 = document3.hasAttr("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.jsoup.nodes.Node node6 = document3.clone();
        java.lang.String str7 = document3.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = document3.siblingNodes();
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SYSTEM" + "'", str7, "SYSTEM");
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList8, parseSettings9);
        org.jsoup.parser.Token.Character character11 = new org.jsoup.parser.Token.Character();
        java.lang.String str12 = character11.getData();
        xmlTreeBuilder0.insert(character11);
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.ParseSettings parseSettings21 = null;
        xmlTreeBuilder17.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList20, parseSettings21);
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder17.parseFragment("", "#doctype", parseErrorList25, parseSettings26);
        org.jsoup.parser.Token.Character character28 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder17.insert(character28);
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings34 = xmlTreeBuilder33.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = xmlTreeBuilder17.parseFragment("SYSTEM", "PUBLIC", parseErrorList32, parseSettings34);
        java.util.List<org.jsoup.nodes.Node> nodeList36 = xmlTreeBuilder0.parseFragment("#doctype", "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">", parseErrorList16, parseSettings34);
        org.jsoup.parser.ParseSettings parseSettings37 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.EOF eOF38 = new org.jsoup.parser.Token.EOF();
        org.jsoup.parser.Token token39 = eOF38.reset();
        org.jsoup.parser.Token token40 = eOF38.reset();
        boolean boolean41 = xmlTreeBuilder0.process((org.jsoup.parser.Token) eOF38);
        org.jsoup.parser.Token token42 = eOF38.reset();
        org.jsoup.parser.Token token43 = eOF38.reset();
        org.jsoup.parser.Token token44 = eOF38.reset();
        org.jsoup.parser.Token token45 = eOF38.reset();
        org.jsoup.parser.Token token46 = eOF38.reset();
        org.jsoup.parser.Token token47 = eOF38.reset();
        boolean boolean48 = token47.isStartTag();
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(parseSettings34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertNotNull(token39);
        org.junit.Assert.assertNotNull(token40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(token42);
        org.junit.Assert.assertNotNull(token43);
        org.junit.Assert.assertNotNull(token44);
        org.junit.Assert.assertNotNull(token45);
        org.junit.Assert.assertNotNull(token46);
        org.junit.Assert.assertNotNull(token47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.nodes.DocumentType documentType7 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean9 = documentType7.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes10 = documentType7.attributes();
        tag1.attributes = attributes10;
        java.lang.String str12 = tag1.tagName;
        tag1.appendAttributeValue('4');
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag16 = startTag15.reset();
        tag16.finaliseTag();
        tag16.appendTagName('4');
        org.jsoup.nodes.Attributes attributes20 = tag16.getAttributes();
        tag1.attributes = attributes20;
        tag1.normalName = "<!---->";
        int[] intArray27 = new int[] { (byte) 1, (byte) 1, (short) 0 };
        tag1.appendAttributeValue(intArray27);
        org.jsoup.parser.Token.StartTag startTag29 = tag1.asStartTag();
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag32 = startTag31.reset();
        tag32.finaliseTag();
        org.jsoup.parser.Token.Tag tag34 = tag32.reset();
        org.jsoup.nodes.Attributes attributes35 = tag34.attributes;
        java.lang.String str36 = tag34.normalName;
        org.jsoup.nodes.Attributes attributes37 = tag34.getAttributes();
        org.jsoup.parser.Token.StartTag startTag38 = startTag29.nameAttr("starttag", attributes37);
        java.lang.String str39 = startTag38.tagName;
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 1, 1, 0 });
        org.junit.Assert.assertNotNull(startTag29);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(attributes37);
        org.junit.Assert.assertNotNull(startTag38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "starttag" + "'", str39, "starttag");
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "#doctype", parseErrorList8, parseSettings9);
        org.jsoup.parser.Token.Comment comment11 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder12 = comment11.data;
        java.lang.String str13 = comment11.toString();
        org.jsoup.parser.Token token14 = comment11.reset();
        boolean boolean15 = xmlTreeBuilder0.process((org.jsoup.parser.Token) comment11);
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings17 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Character character18 = new org.jsoup.parser.Token.Character();
        java.lang.String str19 = character18.getData();
        org.jsoup.parser.Token.Character character21 = character18.data("<!---->");
        xmlTreeBuilder0.insert(character21);
        org.jsoup.parser.Token.Comment comment23 = new org.jsoup.parser.Token.Comment();
        comment23.bogus = false;
        java.lang.StringBuilder stringBuilder26 = comment23.data;
        java.lang.String str27 = comment23.getData();
        java.lang.String str28 = comment23.toString();
        java.lang.String str29 = comment23.getData();
        org.jsoup.parser.Token token30 = comment23.reset();
        comment23.bogus = true;
        xmlTreeBuilder0.insert(comment23);
        java.lang.StringBuilder stringBuilder34 = comment23.data;
        org.jsoup.parser.Token.reset(stringBuilder34);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertNotNull(token14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(character21);
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!---->" + "'", str28, "<!---->");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(token30);
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "");
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "SYSTEM", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "");
        org.jsoup.nodes.Node node7 = documentType4.attr("<SYSTEM>", "Doctype");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = documentType4.childNodes();
        int int9 = documentType4.childNodeSize();
        java.lang.String str10 = documentType4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodesCopy();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str1 = doctype0.getName();
        java.lang.String str2 = doctype0.getPublicIdentifier();
        java.lang.String str3 = doctype0.getSystemIdentifier();
        java.lang.String str4 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        int int7 = documentType4.childNodeSize();
        int int8 = documentType4.childNodeSize();
        java.lang.String str9 = documentType4.baseUri();
        org.jsoup.nodes.Node node10 = documentType4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodesCopy();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.ParseSettings parseSettings16 = null;
        xmlTreeBuilder12.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList15, parseSettings16);
        org.jsoup.parser.Token.Character character18 = new org.jsoup.parser.Token.Character();
        java.lang.String str19 = character18.getData();
        org.jsoup.parser.Token.Character character21 = character18.data("<!---->");
        java.lang.String str22 = character21.getData();
        xmlTreeBuilder12.insert(character21);
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder27 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.ParseSettings parseSettings31 = null;
        xmlTreeBuilder27.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList30, parseSettings31);
        org.jsoup.parser.ParseErrorList parseErrorList35 = null;
        org.jsoup.parser.ParseSettings parseSettings36 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList37 = xmlTreeBuilder27.parseFragment("", "#doctype", parseErrorList35, parseSettings36);
        org.jsoup.parser.Token.Comment comment38 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder39 = comment38.data;
        java.lang.String str40 = comment38.toString();
        org.jsoup.parser.Token token41 = comment38.reset();
        boolean boolean42 = xmlTreeBuilder27.process((org.jsoup.parser.Token) comment38);
        org.jsoup.parser.ParseSettings parseSettings43 = xmlTreeBuilder27.defaultSettings();
        xmlTreeBuilder12.initialiseParse("4doctype", "#doctype", parseErrorList26, parseSettings43);
        boolean boolean45 = documentType4.hasSameValue((java.lang.Object) parseErrorList26);
        int int46 = documentType4.childNodeSize();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SYSTEM" + "'", str9, "SYSTEM");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(character21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!---->" + "'", str22, "<!---->");
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNotNull(stringBuilder39);
        org.junit.Assert.assertEquals(stringBuilder39.toString(), "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "<!---->" + "'", str40, "<!---->");
        org.junit.Assert.assertNotNull(token41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(parseSettings43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        java.lang.String str4 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        boolean boolean6 = startTag0.isDoctype();
        org.jsoup.parser.Token.Tag tag8 = startTag0.name("Doctype");
        startTag0.appendAttributeName("<<SYSTEM>>");
        java.lang.String str11 = startTag0.name();
        boolean boolean12 = startTag0.isStartTag();
        org.jsoup.parser.Token.Tag tag13 = startTag0.reset();
        boolean boolean14 = tag13.isSelfClosing();
        tag13.finaliseTag();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Doctype" + "'", str11, "Doctype");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        java.lang.String str4 = startTag0.normalName();
        org.jsoup.parser.Token.Tag tag5 = startTag0.reset();
        boolean boolean6 = startTag0.isDoctype();
        startTag0.appendTagName("Doctype");
        org.jsoup.parser.Token.Tag tag10 = startTag0.name("<!DOCTYPE PUBLIC>");
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str13 = startTag12.normalName;
        startTag12.newAttribute();
        java.lang.String str15 = startTag12.normalName();
        java.lang.String str16 = startTag12.normalName();
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str19 = startTag18.normalName;
        startTag18.newAttribute();
        java.lang.String str21 = startTag18.normalName();
        startTag18.appendAttributeName("");
        startTag18.normalName = "hi!";
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str28 = startTag27.normalName;
        org.jsoup.nodes.Attributes attributes29 = startTag27.attributes;
        org.jsoup.parser.Token.StartTag startTag30 = startTag18.nameAttr("SYSTEM", attributes29);
        org.jsoup.parser.Token.StartTag startTag31 = startTag12.nameAttr("PUBLIC", attributes29);
        org.jsoup.parser.Token.StartTag startTag32 = startTag0.nameAttr("<!---->", attributes29);
        org.jsoup.parser.Token.Tag tag33 = startTag32.reset();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(startTag30);
        org.junit.Assert.assertNotNull(startTag31);
        org.junit.Assert.assertNotNull(startTag32);
        org.junit.Assert.assertNotNull(tag33);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        startTag0.setEmptyAttributeValue();
        org.junit.Assert.assertNotNull(tag1);
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        boolean boolean2 = comment0.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType3 = comment0.type;
        java.lang.String str4 = comment0.getData();
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        org.jsoup.parser.Token token6 = comment0.reset();
        java.lang.StringBuilder stringBuilder7 = comment0.data;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(token6);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "#doctype", parseErrorList8, parseSettings9);
        org.jsoup.parser.Token.Character character11 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder0.insert(character11);
        org.jsoup.parser.Token.Character character14 = character11.data("<!---->");
        org.jsoup.parser.Token.Character character16 = character14.data("StartTag");
        boolean boolean17 = character14.isEndTag();
        boolean boolean18 = character14.isStartTag();
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(character14);
        org.junit.Assert.assertNotNull(character16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        tag1.appendTagName('4');
        int[] intArray8 = new int[] { 0, ' ', '#' };
        tag1.appendAttributeValue(intArray8);
        tag1.finaliseTag();
        tag1.setEmptyAttributeValue();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0, 32, 35 });
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("SYSTEM", "SYSTEM", "#doctype", "SYSTEM");
        org.jsoup.nodes.Node node6 = documentType4.removeAttr("PUBLIC");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = org.jsoup.parser.HtmlTreeBuilderState.ForeignContent;
        boolean boolean8 = documentType4.hasSameValue((java.lang.Object) htmlTreeBuilderState7);
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str10 = startTag9.normalName;
        startTag9.newAttribute();
        java.lang.String str12 = startTag9.normalName();
        java.lang.String str13 = startTag9.normalName();
        org.jsoup.parser.Token.Tag tag14 = startTag9.reset();
        org.jsoup.parser.Token.Tag tag15 = startTag9.reset();
        startTag9.tagName = "<!---->";
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder18 = null;
        boolean boolean19 = htmlTreeBuilderState7.process((org.jsoup.parser.Token) startTag9, htmlTreeBuilder18);
        java.lang.String str20 = startTag9.name();
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag22 = startTag21.reset();
        tag22.finaliseTag();
        tag22.appendTagName('4');
        org.jsoup.nodes.Attributes attributes26 = tag22.getAttributes();
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag28 = startTag27.reset();
        tag28.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str31 = startTag30.normalName;
        startTag30.newAttribute();
        java.lang.String str33 = startTag30.normalName();
        org.jsoup.parser.Token.StartTag startTag35 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag36 = startTag35.reset();
        tag36.finaliseTag();
        org.jsoup.nodes.DocumentType documentType42 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean44 = documentType42.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes45 = documentType42.attributes();
        tag36.attributes = attributes45;
        org.jsoup.parser.Token.StartTag startTag47 = startTag30.nameAttr("<!---->", attributes45);
        tag28.attributes = attributes45;
        char[] charArray50 = new char[] { 'a' };
        tag28.appendAttributeValue(charArray50);
        tag22.appendAttributeValue(charArray50);
        tag22.appendTagName("Doctype");
        org.jsoup.parser.Token.TokenType tokenType55 = org.jsoup.parser.Token.TokenType.EOF;
        tag22.type = tokenType55;
        org.jsoup.parser.Token.StartTag startTag57 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str58 = startTag57.normalName;
        startTag57.newAttribute();
        java.lang.String str60 = startTag57.normalName();
        startTag57.appendAttributeName("");
        startTag57.normalName = "hi!";
        startTag57.appendTagName("PUBLIC");
        org.jsoup.parser.Token.StartTag startTag67 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag68 = startTag67.reset();
        tag68.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag70 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str71 = startTag70.normalName;
        startTag70.newAttribute();
        java.lang.String str73 = startTag70.normalName();
        org.jsoup.parser.Token.StartTag startTag75 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag76 = startTag75.reset();
        tag76.finaliseTag();
        org.jsoup.nodes.DocumentType documentType82 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean84 = documentType82.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes85 = documentType82.attributes();
        tag76.attributes = attributes85;
        org.jsoup.parser.Token.StartTag startTag87 = startTag70.nameAttr("<!---->", attributes85);
        tag68.attributes = attributes85;
        char[] charArray90 = new char[] { 'a' };
        tag68.appendAttributeValue(charArray90);
        startTag57.appendAttributeValue(charArray90);
        tag22.appendAttributeValue(charArray90);
        startTag9.appendAttributeValue(charArray90);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!---->" + "'", str20, "<!---->");
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(attributes45);
        org.junit.Assert.assertNotNull(startTag47);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertArrayEquals(charArray50, new char[] { 'a' });
        org.junit.Assert.assertTrue("'" + tokenType55 + "' != '" + org.jsoup.parser.Token.TokenType.EOF + "'", tokenType55.equals(org.jsoup.parser.Token.TokenType.EOF));
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(tag68);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNotNull(tag76);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(attributes85);
        org.junit.Assert.assertNotNull(startTag87);
        org.junit.Assert.assertNotNull(charArray90);
        org.junit.Assert.assertArrayEquals(charArray90, new char[] { 'a' });
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.String str3 = doctype0.getPublicIdentifier();
        boolean boolean4 = doctype0.isForceQuirks();
        java.lang.StringBuilder stringBuilder5 = doctype0.publicIdentifier;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.StringBuilder stringBuilder7 = doctype0.publicIdentifier;
        java.lang.String str8 = doctype0.getName();
        java.lang.String str9 = doctype0.tokenType();
        org.jsoup.parser.Token token10 = doctype0.reset();
        java.lang.StringBuilder stringBuilder11 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder12 = doctype0.publicIdentifier;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Doctype" + "'", str9, "Doctype");
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        tag1.finaliseTag();
        org.jsoup.parser.Token.StartTag startTag3 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str4 = startTag3.normalName;
        startTag3.newAttribute();
        java.lang.String str6 = startTag3.normalName();
        org.jsoup.parser.Token.StartTag startTag8 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag9 = startTag8.reset();
        tag9.finaliseTag();
        org.jsoup.nodes.DocumentType documentType15 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean17 = documentType15.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes18 = documentType15.attributes();
        tag9.attributes = attributes18;
        org.jsoup.parser.Token.StartTag startTag20 = startTag3.nameAttr("<!---->", attributes18);
        tag1.attributes = attributes18;
        tag1.newAttribute();
        org.jsoup.parser.Token.Tag tag24 = tag1.name("<!---->4");
        tag24.finaliseTag();
        boolean boolean26 = tag24.isStartTag();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNotNull(startTag20);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = documentType4.previousSibling();
        java.lang.Object obj8 = new java.lang.Object();
        boolean boolean9 = documentType4.equals(obj8);
        java.lang.String str10 = documentType4.toString();
        org.jsoup.nodes.Attributes attributes11 = documentType4.attributes();
        int int12 = documentType4.childNodeSize();
        org.jsoup.nodes.Node node13 = documentType4.parent();
        java.lang.String str14 = documentType4.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            documentType4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str10, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "SYSTEM" + "'", str14, "SYSTEM");
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("4", "<!DOCTYPE <!DOCTYPE PUBLIC> PUBLIC \"#doctype\" \"4\">", "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "<!doctype #doctype public \"4\" \"public\">");
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag6 = startTag5.reset();
        tag6.finaliseTag();
        org.jsoup.nodes.DocumentType documentType12 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean14 = documentType12.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes15 = documentType12.attributes();
        tag6.attributes = attributes15;
        org.jsoup.parser.Token.StartTag startTag17 = startTag0.nameAttr("<!---->", attributes15);
        startTag0.appendTagName('4');
        java.lang.String str20 = startTag0.tagName;
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag22 = startTag21.reset();
        tag22.finaliseTag();
        org.jsoup.nodes.DocumentType documentType28 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean30 = documentType28.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes31 = documentType28.attributes();
        tag22.attributes = attributes31;
        tag22.appendTagName("#doctype");
        tag22.newAttribute();
        tag22.appendTagName("#doctype");
        tag22.tagName = "<!---->";
        tag22.appendAttributeValue(' ');
        org.jsoup.nodes.Attributes attributes42 = tag22.attributes;
        startTag0.attributes = attributes42;
        java.lang.String str44 = startTag0.normalName;
        startTag0.appendTagName("<<!---->  name=\"\" publicId=\"hi!\" systemId=\"hi!\">");
        startTag0.selfClosing = false;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!---->4" + "'", str20, "<!---->4");
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "<!---->4" + "'", str44, "<!---->4");
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.String str3 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token token4 = doctype0.reset();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        org.jsoup.parser.Token.TokenType tokenType6 = org.jsoup.parser.Token.TokenType.Character;
        doctype0.type = tokenType6;
        org.jsoup.parser.Token.TokenType tokenType8 = doctype0.type;
        org.jsoup.parser.Token token9 = doctype0.reset();
        boolean boolean10 = doctype0.isForceQuirks();
        boolean boolean11 = doctype0.forceQuirks;
        java.lang.StringBuilder stringBuilder12 = doctype0.systemIdentifier;
        java.lang.StringBuilder stringBuilder13 = doctype0.systemIdentifier;
        boolean boolean14 = doctype0.forceQuirks;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(token4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + tokenType6 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType6.equals(org.jsoup.parser.Token.TokenType.Character));
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.Character + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.Character));
        org.junit.Assert.assertNotNull(token9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = documentType4.clone();
        boolean boolean9 = documentType4.hasAttr("<!DOCTYPE PUBLIC>");
        documentType4.setBaseUri("a");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        xmlTreeBuilder9.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList12, parseSettings13);
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlTreeBuilder9.parseFragment("", "#doctype", parseErrorList17, parseSettings18);
        org.jsoup.parser.Token.Character character20 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder9.insert(character20);
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder25 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings26 = xmlTreeBuilder25.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlTreeBuilder9.parseFragment("SYSTEM", "PUBLIC", parseErrorList24, parseSettings26);
        xmlTreeBuilder0.initialiseParse("<SYSTEM>", "Doctype", parseErrorList8, parseSettings26);
        org.jsoup.nodes.DocumentType documentType33 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str34 = documentType33.nodeName();
        org.jsoup.parser.Token.Doctype doctype35 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str36 = doctype35.getName();
        boolean boolean37 = doctype35.forceQuirks;
        org.jsoup.parser.Token token38 = doctype35.reset();
        org.jsoup.parser.Token.TokenType tokenType39 = doctype35.type;
        boolean boolean40 = doctype35.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType41 = doctype35.type;
        boolean boolean42 = documentType33.hasSameValue((java.lang.Object) doctype35);
        xmlTreeBuilder0.insert(doctype35);
        java.lang.String str44 = doctype35.getSystemIdentifier();
        org.jsoup.parser.Token.TokenType tokenType45 = doctype35.type;
        boolean boolean46 = doctype35.isCharacter();
        java.lang.String str47 = doctype35.getName();
        java.lang.StringBuilder stringBuilder48 = doctype35.publicIdentifier;
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(parseSettings26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#doctype" + "'", str34, "#doctype");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(token38);
        org.junit.Assert.assertTrue("'" + tokenType39 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType39.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + tokenType41 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType41.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + tokenType45 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType45.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(stringBuilder48);
        org.junit.Assert.assertEquals(stringBuilder48.toString(), "");
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.InFrameset;
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str2 = startTag1.normalName;
        startTag1.newAttribute();
        java.lang.String str4 = startTag1.normalName();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag6.reset();
        tag7.finaliseTag();
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean15 = documentType13.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes16 = documentType13.attributes();
        tag7.attributes = attributes16;
        org.jsoup.parser.Token.StartTag startTag18 = startTag1.nameAttr("<!---->", attributes16);
        startTag1.appendTagName('4');
        java.lang.String str21 = startTag1.tagName;
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag23 = startTag22.reset();
        tag23.finaliseTag();
        org.jsoup.nodes.DocumentType documentType29 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean31 = documentType29.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes32 = documentType29.attributes();
        tag23.attributes = attributes32;
        tag23.appendTagName("#doctype");
        tag23.newAttribute();
        tag23.appendTagName("#doctype");
        tag23.tagName = "<!---->";
        tag23.appendAttributeValue(' ');
        org.jsoup.nodes.Attributes attributes43 = tag23.attributes;
        startTag1.attributes = attributes43;
        java.lang.String str45 = startTag1.normalName;
        startTag1.appendTagName("<<!---->  name=\"\" publicId=\"hi!\" systemId=\"hi!\">");
        startTag1.setEmptyAttributeValue();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder49 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean50 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) startTag1, htmlTreeBuilder49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(startTag18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!---->4" + "'", str21, "<!---->4");
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertNotNull(attributes43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "<!---->4" + "'", str45, "<!---->4");
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        startTag0.appendTagName("PUBLIC");
        org.jsoup.parser.Token.Tag tag10 = startTag0.reset();
        startTag0.normalName = "<!---->";
        startTag0.normalName = "EOF";
        startTag0.selfClosing = true;
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str18 = startTag17.normalName;
        startTag17.newAttribute();
        java.lang.String str20 = startTag17.normalName();
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag23 = startTag22.reset();
        tag23.finaliseTag();
        org.jsoup.nodes.DocumentType documentType29 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean31 = documentType29.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes32 = documentType29.attributes();
        tag23.attributes = attributes32;
        org.jsoup.parser.Token.StartTag startTag34 = startTag17.nameAttr("<!---->", attributes32);
        java.lang.String str35 = startTag34.name();
        org.jsoup.parser.Token.Tag tag37 = startTag34.name("#doctype");
        tag37.appendAttributeName('#');
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag41 = startTag40.reset();
        tag41.finaliseTag();
        org.jsoup.nodes.DocumentType documentType47 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean49 = documentType47.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes50 = documentType47.attributes();
        tag41.attributes = attributes50;
        java.lang.String str52 = tag41.tagName;
        boolean boolean53 = tag41.selfClosing;
        java.lang.String str54 = tag41.normalName;
        tag41.tagName = "4";
        boolean boolean57 = tag41.selfClosing;
        org.jsoup.parser.Token.StartTag startTag58 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str59 = startTag58.normalName;
        startTag58.newAttribute();
        java.lang.String str61 = startTag58.normalName();
        org.jsoup.parser.Token.Tag tag62 = startTag58.reset();
        tag62.appendTagName('4');
        tag62.appendAttributeName("StartTag");
        org.jsoup.parser.Token.StartTag startTag67 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag68 = startTag67.reset();
        tag68.finaliseTag();
        tag68.appendTagName('4');
        int[] intArray75 = new int[] { 0, ' ', '#' };
        tag68.appendAttributeValue(intArray75);
        tag62.appendAttributeValue(intArray75);
        tag41.appendAttributeValue(intArray75);
        tag37.appendAttributeValue(intArray75);
        startTag0.appendAttributeValue(intArray75);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertNotNull(startTag34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<!---->" + "'", str35, "<!---->");
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(attributes50);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(tag62);
        org.junit.Assert.assertNotNull(tag68);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertArrayEquals(intArray75, new int[] { 0, 32, 35 });
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.String str3 = doctype0.getSystemIdentifier();
        boolean boolean4 = doctype0.isComment();
        boolean boolean5 = doctype0.forceQuirks;
        java.lang.String str6 = doctype0.getSystemIdentifier();
        java.lang.String str7 = doctype0.getSystemIdentifier();
        boolean boolean8 = doctype0.isEOF();
        java.lang.String str9 = doctype0.getSystemIdentifier();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder1 = comment0.data;
        java.lang.String str2 = comment0.toString();
        java.lang.String str3 = comment0.getData();
        java.lang.String str4 = comment0.getData();
        java.lang.StringBuilder stringBuilder5 = comment0.data;
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<!---->" + "'", str2, "<!---->");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean6 = documentType4.hasAttr("hi!");
        java.lang.String str7 = documentType4.baseUri();
        org.jsoup.nodes.Node node8 = documentType4.clone();
        int int9 = node8.siblingIndex();
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        java.lang.String str15 = documentType14.nodeName();
        org.jsoup.parser.Token.Doctype doctype16 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str17 = doctype16.getName();
        boolean boolean18 = doctype16.forceQuirks;
        org.jsoup.parser.Token token19 = doctype16.reset();
        org.jsoup.parser.Token.TokenType tokenType20 = doctype16.type;
        boolean boolean21 = doctype16.isDoctype();
        org.jsoup.parser.Token.TokenType tokenType22 = doctype16.type;
        boolean boolean23 = documentType14.hasSameValue((java.lang.Object) doctype16);
        java.util.List<org.jsoup.nodes.Node> nodeList24 = documentType14.childNodesCopy();
        boolean boolean25 = node8.equals((java.lang.Object) documentType14);
        int int26 = node8.childNodeSize();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SYSTEM" + "'", str7, "SYSTEM");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#doctype" + "'", str15, "#doctype");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(token19);
        org.junit.Assert.assertTrue("'" + tokenType20 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType20.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + tokenType22 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType22.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        boolean boolean7 = documentType4.hasAttr("");
        org.jsoup.nodes.Node node8 = documentType4.parentNode();
        int int9 = documentType4.siblingIndex();
        org.jsoup.nodes.Document document10 = documentType4.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = documentType4.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = documentType4.childNodes();
        int int13 = documentType4.childNodeSize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        startTag0.appendTagName("PUBLIC");
        org.jsoup.parser.Token.Tag tag10 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag12 = tag10.name("4");
        java.lang.String str13 = tag10.normalName;
        tag10.finaliseTag();
        org.jsoup.parser.Token.TokenType tokenType15 = tag10.type;
        org.jsoup.parser.Token.Tag tag16 = tag10.reset();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4" + "'", str13, "4");
        org.junit.Assert.assertTrue("'" + tokenType15 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType15.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tag16);
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = documentType4.childNodes();
        java.lang.String str7 = documentType4.nodeName();
        boolean boolean9 = documentType4.hasAttr("EOF");
        org.jsoup.nodes.Node node11 = documentType4.wrap("<!DOCTYPE PUBLIC>");
        org.jsoup.nodes.Node node14 = documentType4.attr("<SYSTEM></SYSTEM>", "<!DOCTYPE PUBLIC>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node14.after("<<SYSTEM>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#doctype" + "'", str7, "#doctype");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.String str3 = doctype0.getSystemIdentifier();
        doctype0.forceQuirks = true;
        java.lang.String str6 = doctype0.getPublicIdentifier();
        boolean boolean7 = doctype0.isForceQuirks();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        startTag0.appendAttributeName("");
        startTag0.normalName = "hi!";
        startTag0.appendTagName("PUBLIC");
        org.jsoup.parser.Token.Tag tag10 = startTag0.reset();
        tag10.tagName = "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">";
        boolean boolean13 = tag10.isCharacter();
        java.lang.String str14 = tag10.normalName();
        boolean boolean15 = tag10.isComment();
        org.jsoup.parser.Token.Tag tag16 = tag10.reset();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tag16);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder1 = doctype0.name;
        boolean boolean2 = doctype0.forceQuirks;
        java.lang.String str3 = doctype0.getSystemIdentifier();
        boolean boolean4 = doctype0.isDoctype();
        java.lang.String str5 = doctype0.getPublicIdentifier();
        java.lang.String str6 = doctype0.getPublicIdentifier();
        org.junit.Assert.assertNotNull(stringBuilder1);
        org.junit.Assert.assertEquals(stringBuilder1.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag1 = startTag0.reset();
        org.jsoup.parser.Token.Tag tag2 = startTag0.reset();
        org.jsoup.parser.Token.StartTag startTag3 = tag2.asStartTag();
        java.lang.String str4 = startTag3.tagName;
        org.jsoup.parser.Token.Tag tag5 = startTag3.reset();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag7 = startTag6.reset();
        tag7.finaliseTag();
        org.jsoup.nodes.DocumentType documentType13 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean15 = documentType13.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes16 = documentType13.attributes();
        tag7.attributes = attributes16;
        org.jsoup.parser.Token.StartTag startTag18 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag19 = startTag18.reset();
        org.jsoup.parser.Token.Tag tag20 = startTag18.reset();
        org.jsoup.parser.Token.StartTag startTag21 = tag20.asStartTag();
        tag20.appendTagName("PUBLIC");
        int[] intArray27 = new int[] { 1, 1, ' ' };
        tag20.appendAttributeValue(intArray27);
        tag7.appendAttributeValue(intArray27);
        tag5.appendAttributeValue(intArray27);
        tag5.appendAttributeName("<<!doctype system public \"system\" \"#doctype\">  name=\"\" publicId=\"hi!\" systemId=\"hi!\">");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertNotNull(tag2);
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(startTag21);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 1, 1, 32 });
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str1 = startTag0.normalName;
        startTag0.newAttribute();
        java.lang.String str3 = startTag0.normalName();
        java.lang.String str4 = startTag0.normalName();
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str7 = startTag6.normalName;
        startTag6.newAttribute();
        java.lang.String str9 = startTag6.normalName();
        startTag6.appendAttributeName("");
        startTag6.normalName = "hi!";
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str16 = startTag15.normalName;
        org.jsoup.nodes.Attributes attributes17 = startTag15.attributes;
        org.jsoup.parser.Token.StartTag startTag18 = startTag6.nameAttr("SYSTEM", attributes17);
        org.jsoup.parser.Token.StartTag startTag19 = startTag0.nameAttr("PUBLIC", attributes17);
        startTag0.newAttribute();
        boolean boolean21 = startTag0.isStartTag();
        startTag0.newAttribute();
        startTag0.finaliseTag();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(startTag18);
        org.junit.Assert.assertNotNull(startTag19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder5 = comment4.data;
        xmlTreeBuilder0.insert(comment4);
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str8 = startTag7.normalName;
        startTag7.newAttribute();
        java.lang.String str10 = startTag7.normalName();
        org.jsoup.parser.Token.StartTag startTag12 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag13 = startTag12.reset();
        tag13.finaliseTag();
        org.jsoup.nodes.DocumentType documentType19 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean21 = documentType19.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes22 = documentType19.attributes();
        tag13.attributes = attributes22;
        org.jsoup.parser.Token.StartTag startTag24 = startTag7.nameAttr("<!---->", attributes22);
        java.lang.String str25 = startTag24.name();
        boolean boolean26 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag24);
        org.jsoup.parser.Token.StartTag startTag27 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str28 = startTag27.normalName;
        startTag27.newAttribute();
        java.lang.String str30 = startTag27.normalName();
        org.jsoup.parser.Token.StartTag startTag32 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag33 = startTag32.reset();
        tag33.finaliseTag();
        org.jsoup.nodes.DocumentType documentType39 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean41 = documentType39.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes42 = documentType39.attributes();
        tag33.attributes = attributes42;
        org.jsoup.parser.Token.StartTag startTag44 = startTag27.nameAttr("<!---->", attributes42);
        boolean boolean45 = xmlTreeBuilder0.process((org.jsoup.parser.Token) startTag44);
        org.jsoup.parser.Token.StartTag startTag46 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str47 = startTag46.normalName;
        startTag46.newAttribute();
        java.lang.String str49 = startTag46.normalName();
        startTag46.appendAttributeName("");
        startTag46.normalName = "hi!";
        java.lang.String str54 = startTag46.tagName;
        org.jsoup.nodes.DocumentType documentType59 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean61 = documentType59.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes62 = documentType59.attributes();
        startTag46.attributes = attributes62;
        boolean boolean64 = startTag46.isDoctype();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element65 = xmlTreeBuilder0.insert(startTag46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(startTag24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!---->" + "'", str25, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertNotNull(startTag44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(attributes62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        java.lang.String str6 = documentType4.toString();
        org.jsoup.nodes.Node node7 = documentType4.clone();
        int int8 = node7.siblingIndex();
        java.lang.String str10 = node7.absUrl("4");
        java.lang.String str11 = node7.toString();
        org.jsoup.parser.Token.Doctype doctype12 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str13 = doctype12.getName();
        java.lang.String str14 = doctype12.getPublicIdentifier();
        java.lang.StringBuilder stringBuilder15 = doctype12.systemIdentifier;
        java.lang.Appendable appendable16 = node7.html((java.lang.Appendable) stringBuilder15);
        org.jsoup.nodes.Document document17 = node7.ownerDocument();
        org.jsoup.nodes.Document document18 = node7.ownerDocument();
        org.jsoup.nodes.Node node21 = node7.attr("PUBLIC", "#");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = node7.childNodesCopy();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str6, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">" + "'", str11, "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "<!DOCTYPE PUBLIC \"hi!\" \"hi!\">");
        org.junit.Assert.assertNotNull(appendable16);
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertNull(document18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeList22);
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        xmlTreeBuilder0.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList3, parseSettings4);
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlTreeBuilder0.parseFragment("", "#doctype", parseErrorList8, parseSettings9);
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("SYSTEM", "Doctype");
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.ParseSettings parseSettings21 = null;
        xmlTreeBuilder17.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList20, parseSettings21);
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        xmlTreeBuilder17.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList25, parseSettings26);
        org.jsoup.parser.Token.Character character28 = new org.jsoup.parser.Token.Character();
        java.lang.String str29 = character28.getData();
        xmlTreeBuilder17.insert(character28);
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder34 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        org.jsoup.parser.ParseSettings parseSettings38 = null;
        xmlTreeBuilder34.initialiseParse("<!DOCTYPE PUBLIC \"hi!\" \"hi!\">", "hi!", parseErrorList37, parseSettings38);
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        org.jsoup.parser.ParseSettings parseSettings43 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList44 = xmlTreeBuilder34.parseFragment("", "#doctype", parseErrorList42, parseSettings43);
        org.jsoup.parser.Token.Character character45 = new org.jsoup.parser.Token.Character();
        xmlTreeBuilder34.insert(character45);
        org.jsoup.parser.ParseErrorList parseErrorList49 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder50 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings51 = xmlTreeBuilder50.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList52 = xmlTreeBuilder34.parseFragment("SYSTEM", "PUBLIC", parseErrorList49, parseSettings51);
        java.util.List<org.jsoup.nodes.Node> nodeList53 = xmlTreeBuilder17.parseFragment("#doctype", "<!DOCTYPE SYSTEM PUBLIC \"SYSTEM\" \"#doctype\">", parseErrorList33, parseSettings51);
        org.jsoup.parser.ParseSettings parseSettings54 = xmlTreeBuilder17.defaultSettings();
        xmlTreeBuilder0.initialiseParse("SYSTEM", "EOF", parseErrorList16, parseSettings54);
        org.jsoup.parser.Token.StartTag startTag57 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag58 = startTag57.reset();
        tag58.finaliseTag();
        org.jsoup.nodes.DocumentType documentType64 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean66 = documentType64.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.nodes.Attributes attributes67 = documentType64.attributes();
        tag58.attributes = attributes67;
        java.lang.String str69 = tag58.tagName;
        tag58.appendAttributeValue('4');
        org.jsoup.parser.Token.StartTag startTag72 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.parser.Token.Tag tag73 = startTag72.reset();
        tag73.finaliseTag();
        tag73.appendTagName('4');
        org.jsoup.nodes.Attributes attributes77 = tag73.getAttributes();
        tag58.attributes = attributes77;
        boolean boolean79 = xmlTreeBuilder0.processStartTag("EOF", attributes77);
        org.jsoup.nodes.DocumentType documentType85 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        boolean boolean87 = documentType85.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes88 = documentType85.attributes();
        boolean boolean89 = xmlTreeBuilder0.processStartTag("StartTag", attributes88);
        org.jsoup.nodes.Document document92 = xmlTreeBuilder0.parse("4", "Comment");
        org.jsoup.nodes.Document document95 = xmlTreeBuilder0.parse("4", "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertNotNull(nodeList52);
        org.junit.Assert.assertNotNull(nodeList53);
        org.junit.Assert.assertNotNull(parseSettings54);
        org.junit.Assert.assertNotNull(tag58);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(attributes67);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNotNull(tag73);
        org.junit.Assert.assertNotNull(attributes77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(attributes88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(document92);
        org.junit.Assert.assertNotNull(document95);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        comment0.bogus = false;
        java.lang.StringBuilder stringBuilder3 = comment0.data;
        boolean boolean4 = comment0.isEOF();
        boolean boolean5 = comment0.bogus;
        boolean boolean6 = comment0.isStartTag();
        comment0.bogus = false;
        boolean boolean9 = comment0.bogus;
        org.jsoup.nodes.DocumentType documentType14 = new org.jsoup.nodes.DocumentType("SYSTEM", "SYSTEM", "#doctype", "SYSTEM");
        org.jsoup.nodes.Node node16 = documentType14.removeAttr("PUBLIC");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState17 = org.jsoup.parser.HtmlTreeBuilderState.ForeignContent;
        boolean boolean18 = documentType14.hasSameValue((java.lang.Object) htmlTreeBuilderState17);
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        java.lang.String str20 = startTag19.normalName;
        startTag19.newAttribute();
        java.lang.String str22 = startTag19.normalName();
        startTag19.appendAttributeName("");
        startTag19.normalName = "hi!";
        org.jsoup.parser.Token.Tag tag27 = startTag19.reset();
        org.jsoup.parser.Token.Tag tag29 = tag27.name("Doctype");
        tag29.appendAttributeName("4");
        boolean boolean32 = tag29.isEndTag();
        org.jsoup.parser.Token.StartTag startTag33 = tag29.asStartTag();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder34 = null;
        boolean boolean35 = htmlTreeBuilderState17.process((org.jsoup.parser.Token) startTag33, htmlTreeBuilder34);
        org.jsoup.parser.Token.TokenType tokenType36 = startTag33.type;
        comment0.type = tokenType36;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(startTag33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + tokenType36 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType36.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        org.jsoup.parser.Token.Character character0 = new org.jsoup.parser.Token.Character();
        java.lang.String str1 = character0.toString();
        java.lang.String str2 = character0.getData();
        org.jsoup.parser.Token.Character character4 = character0.data("SYSTEM");
        java.lang.String str5 = character0.toString();
        org.jsoup.parser.Token.Character character7 = character0.data("4");
        java.lang.String str8 = character7.getData();
        java.lang.String str9 = character7.toString();
        boolean boolean10 = character7.isCharacter();
        boolean boolean11 = character7.isStartTag();
        java.lang.String str12 = character7.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(character4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SYSTEM" + "'", str5, "SYSTEM");
        org.junit.Assert.assertNotNull(character7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4" + "'", str8, "4");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4" + "'", str9, "4");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4" + "'", str12, "4");
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document3 = xmlTreeBuilder0.parse("SYSTEM", "#doctype");
        org.jsoup.parser.Token.Comment comment4 = new org.jsoup.parser.Token.Comment();
        java.lang.StringBuilder stringBuilder5 = comment4.data;
        xmlTreeBuilder0.insert(comment4);
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Comment comment8 = new org.jsoup.parser.Token.Comment();
        comment8.bogus = true;
        boolean boolean11 = comment8.bogus;
        xmlTreeBuilder0.insert(comment8);
        comment8.bogus = false;
        comment8.bogus = true;
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        org.jsoup.nodes.DocumentType documentType4 = new org.jsoup.nodes.DocumentType("", "hi!", "hi!", "SYSTEM");
        int int5 = documentType4.siblingIndex();
        boolean boolean7 = documentType4.hasAttr("");
        org.jsoup.nodes.Node node8 = documentType4.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = documentType4.childNodesCopy();
        org.jsoup.nodes.Node node10 = documentType4.parentNode();
        java.lang.String str11 = documentType4.nodeName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#doctype" + "'", str11, "#doctype");
    }
}

